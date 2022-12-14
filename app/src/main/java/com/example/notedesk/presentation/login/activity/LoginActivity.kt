package com.example.notedesk.presentation.login.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notedesk.presentation.login.LoginFragment
import com.example.notedesk.presentation.login.listener.Navigation
import com.example.notedesk.R
import com.example.notedesk.presentation.util.BackStack
import com.example.notedesk.presentation.util.inTransaction
import com.example.notedesk.presentation.util.openActivity


class LoginActivity : AppCompatActivity(), Navigation {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        if (savedInstanceState == null) {
            supportFragmentManager.inTransaction(BackStack.LOGIN)
            {
                replace(R.id.fragmentContainerView, LoginFragment())
            }

        }
    }


    override fun navigate(intent: Intent) {
        openActivity(intent)
        finish()
    }




}




