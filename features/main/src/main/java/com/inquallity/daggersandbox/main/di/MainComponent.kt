package com.inquallity.daggersandbox.main.di

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
        fun build(): MainComponent
    }
}