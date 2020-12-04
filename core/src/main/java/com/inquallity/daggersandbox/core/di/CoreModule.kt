package com.inquallity.daggersandbox.core.di

import com.inquallity.daggersandbox.core.domain.MainInteractor
import com.inquallity.daggersandbox.core.domain.impl.MainInteractorImpl
import dagger.Binds
import dagger.Module

@Module
interface CoreModule {

    @Binds
    fun mainInteractor(i: MainInteractorImpl): MainInteractor
}
