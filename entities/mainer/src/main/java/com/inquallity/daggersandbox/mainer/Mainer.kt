package com.inquallity.daggersandbox.mainer

import android.util.Log
import javax.inject.Inject

class Mainer @Inject constructor() : IMainer {

    override fun doMain() {
        Log.d("OYAEBU", "Mainer doing main")
    }
}

interface IMainer {
    fun doMain()
}