package com.inquallity.daggersandbox.core.crossmodule

import android.content.Context
import android.util.Log
import com.inquallity.daggersandbox.core.Entry
import java.util.*
import javax.inject.Inject

const val MAIN_ENTRY = "main"
const val SECOND_ENTRY = "second"

class CrossModuleImpl @Inject constructor() : CrossModule {

    private val entries = ServiceLoader.load(Entry::class.java)

    init {
        entries.forEach { Log.d("OYAEBU", "id = ${it.id}") }
    }

    override fun toSecond(ctx: Context) {
        entries.firstOrNull { it.id == SECOND_ENTRY }
            ?.open(ctx) ?: Log.d("OYAEBU", "NOT FOUND ENTRY $MAIN_ENTRY")
    }

}