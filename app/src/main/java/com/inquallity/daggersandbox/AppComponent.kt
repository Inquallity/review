package com.inquallity.daggersandbox

import com.inquallity.daggersandbox.mainer.MainerModule
import com.inquallity.daggersandbox.providers.MainSubcomponent
import com.inquallity.daggersandbox.scanner.ScannerModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    MainerModule::class,
    ScannerModule::class
])
abstract class AppComponent {

    companion object Initializer {
        lateinit var instance: AppComponent
        fun initialize(appComponent: AppComponent) {
            instance = appComponent
        }
    }

    abstract fun getMainSub(): MainSubcomponent.Builder
}