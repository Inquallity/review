package com.inquallity.daggersandbox.main

import com.inquallity.daggersandbox.mainer.IMainer
import com.inquallity.daggersandbox.scanner.IScanner
import com.inquallity.daggersandbox.unaryPlus
import javax.inject.Inject

class MainFeature
@Inject constructor(
    private val mainer: IMainer,
    private val scanner: IScanner
) {

    fun doSomething() {
        +"call mainer ${mainer}"
        mainer.doMain()
        +"call scanner ${scanner}"
        scanner.doScan()
    }
}