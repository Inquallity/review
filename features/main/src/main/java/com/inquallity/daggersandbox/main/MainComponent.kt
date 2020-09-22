package com.inquallity.daggersandbox.main

import com.inquallity.daggersandbox.proxy.MainProxy
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [MainModule::class])
interface MainComponent {

    fun inject(t: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun proxy(p: MainProxy): Builder
        fun build(): MainComponent
    }
}