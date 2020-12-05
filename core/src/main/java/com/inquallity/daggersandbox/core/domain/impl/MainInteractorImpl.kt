package com.inquallity.daggersandbox.core.domain.impl

import com.inquallity.daggersandbox.core.domain.MainInteractor
import com.inquallity.daggersandbox.mainer.IMainer
import com.inquallity.daggersandbox.scanner.IScanner
import javax.inject.Inject
// КЭШ БЛЯТЬ
class MainInteractorImpl @Inject constructor(
    private val mainer: IMainer,
    private val scanner: IScanner
) : MainInteractor {

    override fun init() {
        mainer.initialize()
        scanner.initialize()
    }

    override fun doSomething() {
        mainer.doMain()
        scanner.doScan()
        mainer.doMain2()
    }
}