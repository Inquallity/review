package com.inquallity.daggersandbox.main

import com.inquallity.daggersandbox.core.domain.MainInteractor
import javax.inject.Inject

class MainPresenter @Inject constructor(
    private val interactor: MainInteractor
) {

    fun initialize() {
        interactor.init()
    }

    fun doSmth() {
        interactor.doSomething()
    }
}