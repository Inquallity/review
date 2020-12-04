package com.inquallity.daggersandbox.main

import android.content.Context
import android.content.Intent
import com.inquallity.daggersandbox.core.Entry

class MainEntry : Entry {
    override fun open(ctx: Context) {
        ctx.startActivity(Intent(ctx, MainActivity::class.java))
    }
}