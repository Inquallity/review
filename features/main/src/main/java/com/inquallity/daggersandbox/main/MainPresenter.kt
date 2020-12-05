package com.inquallity.daggersandbox.main

import android.content.Context
import com.inquallity.daggersandbox.core.crossmodule.CrossModule
import com.inquallity.daggersandbox.core.domain.MainInteractor
import javax.inject.Inject

class MainPresenter @Inject constructor(
    private val interactor: MainInteractor,
    private val crossModule: CrossModule
) {

    fun initialize() {
        interactor.init()
    }

    fun doSmth() {
        interactor.doSomething()
    }

    fun moveToSecondary(ctx: Context) {
        crossModule.toSecond(ctx)
    }
}