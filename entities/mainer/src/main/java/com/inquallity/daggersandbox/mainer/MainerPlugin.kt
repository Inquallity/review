package com.inquallity.daggersandbox.mainer

import android.content.Context
import com.google.auto.service.AutoService
import com.inquallity.daggersandbox.base.Plugin

@AutoService(Plugin::class)
class MainerPlugin : Plugin {

    private lateinit var component: MainerComponent

    override fun init(context: Context) {
        component = DaggerMainerComponent.create()
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T> lookup(clazz: Class<T>): T? {
        return when (clazz) {
            MainerAware::class.java -> component as T
            else -> null
        }
    }

}