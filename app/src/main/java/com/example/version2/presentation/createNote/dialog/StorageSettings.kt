package com.example.version2.presentation.createNote.dialog

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.version2.databinding.SettingStorageDialogBinding
import com.example.version2.presentation.createNote.CreateNoteFragment
import com.example.version2.presentation.createNote.enums.ExitSettingsAction
import com.example.version2.presentation.createNote.listener.ExitDailogLisenter

class StorageSettings : DialogFragment() {


    private lateinit var binding: SettingStorageDialogBinding
    private var lisenter: ExitDailogLisenter? = null


    override fun onAttach(context: Context) {
        super.onAttach(context)
        val parent = parentFragment ?: context
        if (parent is CreateNoteFragment)
            lisenter = (parentFragment as CreateNoteFragment)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = SettingStorageDialogBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        eventHandler()
    }

    private fun eventHandler() {
        positiveActionListener()
        negativeActionListener()
    }

    private fun negativeActionListener() {
        binding.no.setOnClickListener {
            dismiss()
        }
    }

    private fun positiveActionListener() {
        binding.yes.setOnClickListener {
            lisenter?.onClickYes(ExitSettingsAction.STORAGE)
            dismiss()
        }
    }

    override fun onDetach() {
        super.onDetach()
        lisenter = null
    }

}