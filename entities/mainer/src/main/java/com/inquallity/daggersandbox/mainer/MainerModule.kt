package com.inquallity.daggersandbox.mainer

import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class MainerModule {

    @Binds
    @Singleton
    abstract fun pMainer(mainer: Mainer): IMainer
}