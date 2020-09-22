package com.inquallity.daggersandbox.mainer

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        MainerModule::class
    ]
)
internal abstract class MainerComponent : MainerAware