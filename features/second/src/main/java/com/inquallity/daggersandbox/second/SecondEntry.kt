package com.inquallity.daggersandbox.second

import android.content.Context
import android.content.Intent
import com.inquallity.daggersandbox.core.Entry
import com.inquallity.daggersandbox.core.crossmodule.SECOND_ENTRY

class SecondEntry : Entry {

    override val id: String
        get() = SECOND_ENTRY

    override fun open(ctx: Context) {
        ctx.startActivity(Intent(ctx, SecondActivity::class.java))
    }
}