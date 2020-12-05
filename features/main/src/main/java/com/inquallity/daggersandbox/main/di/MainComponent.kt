package com.inquallity.daggersandbox.main.di

import com.inquallity.daggersandbox.core.crossmodule.CrossModule
import com.inquallity.daggersandbox.core.domain.MainInteractor
import com.inquallity.daggersandbox.main.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component
interface MainComponent {

    fun inject(m: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun interactor(i: MainInteractor): Builder

        @BindsInstance
        fun crossmodule(c: CrossModule): Builder
        fun build(): MainComponent
    }
}