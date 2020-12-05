package com.inquallity.daggersandbox.main

import android.content.Context
import android.content.Intent
import com.inquallity.daggersandbox.core.Entry
import com.inquallity.daggersandbox.core.crossmodule.MAIN_ENTRY

class MainEntry : Entry {

    override val id: String
        get() = MAIN_ENTRY

    override fun open(ctx: Context) {
        ctx.startActivity(Intent(ctx, MainActivity::class.java))
    }
}