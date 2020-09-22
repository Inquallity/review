package com.inquallity.daggersandbox.base

import android.content.Context

interface Plugin {
    fun init(context: Context)
    fun <T> lookup(clazz: Class<T>): T?

    interface Lookup {
        fun <T> lookup(clazz: Class<T>): T?
    }
}

inline fun <reified T> Context.lookup(): T? {
    return sequenceOf(this, applicationContext)
        .filter { it is Plugin.Lookup }
        .map { it as Plugin.Lookup }
        .map { it.lookup(T::class.java) }
        .firstOrNull { it != null }
}

