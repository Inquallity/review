package com.inquallity.daggersandbox.main

import com.inquallity.daggersandbox.proxy.MainProxy
import javax.inject.Inject

class MainFeature
@Inject constructor(
    private val proxy: MainProxy
) {

    fun doSomething() {
        proxy.start()
    }
}