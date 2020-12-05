package com.inquallity.daggersandbox

import android.app.Application
import android.util.Log
import com.inquallity.daggersandbox.core.di.CoreComponent
import com.inquallity.daggersandbox.core.di.DaggerCoreComponent

operator fun String.unaryPlus() = Log.d("OYAEBU", this)

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        CoreComponent.initialize(
            DaggerCoreComponent.create()
        )
    }
}