package com.inquallity.daggersandbox

import android.app.Application
import android.util.Log

operator fun String.unaryPlus() = Log.d("OYAEBU", this)

class App : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}