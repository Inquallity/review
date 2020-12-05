package com.inquallity.daggersandbox.core.di

import com.inquallity.daggersandbox.core.crossmodule.CrossModule
import com.inquallity.daggersandbox.core.domain.MainInteractor
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [CoreModule::class])
abstract class CoreComponent {

    companion object {
        var instance: CoreComponent? = null
        fun initialize(c: CoreComponent) {
            instance = c
        }
    }

    abstract fun mainInteractor(): MainInteractor
    abstract fun crossModule(): CrossModule
}