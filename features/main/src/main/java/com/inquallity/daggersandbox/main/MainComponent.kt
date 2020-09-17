package com.inquallity.daggersandbox.main

import com.inquallity.daggersandbox.providers.MainSubcomponent
import dagger.Component

@Component(dependencies = [MainSubcomponent::class])
interface MainComponent {

    fun getMainFeature(): MainFeature

    @Component.Builder
    interface Builder {
        fun mainSub(sub: MainSubcomponent): Builder
        fun build(): MainComponent
    }
}