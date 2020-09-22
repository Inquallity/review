package com.inquallity.daggersandbox.mainer

import android.util.Log
import javax.inject.Inject

interface IMainer {
    fun doMain()
}

internal class Mainer @Inject constructor() : IMainer {
    override fun doMain() {
        Log.d("OYAEBU", "Mainer doing main")
    }
}
