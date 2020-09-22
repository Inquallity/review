package com.inquallity.daggersandbox.scanner

import android.util.Log
import javax.inject.Inject

class Scanner @Inject constructor() : IScanner {
    override fun doScan() {
        Log.d("OYAEBU", "scanner doing scan")
    }
}

interface IScanner {
    fun doScan()
}
