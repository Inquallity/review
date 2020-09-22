package com.inquallity.daggersandbox.mainer

import dagger.Binds
import dagger.Module

@Module
internal abstract class MainerModule {

    @Binds
    abstract fun mainer(impl: Mainer): IMainer

}