package com.inquallity.daggersandbox.mainer

import android.util.Log
import javax.inject.Inject

class Mainer @Inject constructor() : IMainer {

    override fun doMain() {
        Log.d("OYAEBU", "Mainer doing main in $this")
    }

    override fun initialize() {
        Log.d("OYAEBU", "Do initialization of $this")
    }

    // override fun doMain2() {
    //     privateMain()
    // }

    private fun privateMain() {
        Log.d("OYAEBU", "Do private work; $this")
    }
}

interface IMainer {
    fun doMain()
    fun initialize()
    // fun doMain2()
}