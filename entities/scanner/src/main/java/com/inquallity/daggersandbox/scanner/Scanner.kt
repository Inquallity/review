package com.inquallity.daggersandbox.scanner

import android.util.Log
import javax.inject.Inject

class Scanner @Inject constructor() : IScanner {

    override fun doScan() {
        Log.d("OYAEBU", "scanner doing scan $this")
    }

    override fun initialize() {
        Log.d("OYAEBU", "Do initialization of $this")
    }
}

interface IScanner {
    fun doScan()
    fun initialize()
}
