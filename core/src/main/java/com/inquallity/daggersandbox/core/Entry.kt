package com.inquallity.daggersandbox.core

import android.content.Context

interface Entry {

    val id: String
    fun open(ctx: Context)

}