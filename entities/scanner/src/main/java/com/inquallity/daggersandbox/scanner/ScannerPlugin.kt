package com.inquallity.daggersandbox.scanner

import android.content.Context
import com.google.auto.service.AutoService
import com.inquallity.daggersandbox.base.Plugin

@AutoService(Plugin::class)
class ScannerPlugin : Plugin {

    private lateinit var component: ScannerComponent

    override fun init(context: Context) {
        component = DaggerScannerComponent.create()
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T> lookup(clazz: Class<T>): T? {
        return when (clazz) {
            ScannerAware::class.java -> component as T
            else -> null
        }
    }

}