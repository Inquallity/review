package com.inquallity.daggersandbox.core.di

import com.inquallity.daggersandbox.core.domain.MainInteractor
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [CoreModule::class]
)
interface CoreComponent {

    fun mainInteractor(): MainInteractor

    @Component.Builder
    interface Builder {

        fun build(): CoreComponent
    }
}