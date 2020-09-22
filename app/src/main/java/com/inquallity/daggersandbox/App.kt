package com.inquallity.daggersandbox

import android.app.Application
import android.util.Log
import com.inquallity.daggersandbox.base.Plugin
import java.util.*

operator fun String.unaryPlus() = Log.d("OYAEBU", this)

class App : Application(), Plugin.Lookup {

    private lateinit var plugins: Iterable<Plugin>

    override fun onCreate() {
        super.onCreate()
        plugins = ServiceLoader.load(Plugin::class.java)
        plugins.forEach { plugin ->
            plugin.init(this)
        }
    }

    override fun <T> lookup(clazz: Class<T>): T? {
        return plugins.map { it.lookup(clazz) }.firstOrNull { it != null }
    }

}