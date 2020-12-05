package com.inquallity.daggersandbox.core.di

import com.inquallity.daggersandbox.core.crossmodule.CrossModule
import com.inquallity.daggersandbox.core.crossmodule.CrossModuleImpl
import com.inquallity.daggersandbox.core.domain.MainInteractor
import com.inquallity.daggersandbox.core.domain.impl.MainInteractorImpl
import com.inquallity.daggersandbox.mainer.IMainer
import com.inquallity.daggersandbox.mainer.Mainer
import com.inquallity.daggersandbox.scanner.IScanner
import com.inquallity.daggersandbox.scanner.Scanner
import dagger.Binds
import dagger.Module

@Module
interface CoreModule {

    @Binds
    fun mainInteractor(i: MainInteractorImpl): MainInteractor

    @Binds
    fun crossModule(c: CrossModuleImpl): CrossModule

    @Binds
    fun mainer(m: Mainer): IMainer

    @Binds
    fun scanner(s: Scanner): IScanner
}
