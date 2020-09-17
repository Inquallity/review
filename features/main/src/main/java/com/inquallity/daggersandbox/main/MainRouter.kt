package com.inquallity.daggersandbox.main

import android.content.Context
import android.content.Intent
import com.inquallity.daggersandbox.Router

class MainRouter : Router {

    override fun open(context: Context) {
        context.startActivity(Intent(context, MainActivity::class.java))
    }
}