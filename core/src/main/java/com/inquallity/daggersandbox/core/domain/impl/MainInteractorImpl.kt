package com.inquallity.daggersandbox.core.domain.impl

import com.inquallity.daggersandbox.core.domain.MainInteractor
import com.inquallity.daggersandbox.mainer.Mainer
import com.inquallity.daggersandbox.scanner.Scanner
import javax.inject.Inject

class MainInteractorImpl @Inject constructor(
    private val mainer: Mainer,
    private val scanner: Scanner
) : MainInteractor {

    override fun init() {
        mainer.initialize()
        scanner.initialize()
    }

    override fun doSomething() {
        mainer.doMain()
        scanner.doScan()
    }
}