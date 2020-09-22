package com.inquallity.daggersandbox.scanner

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ScannerModule::class
    ]
)
internal abstract class ScannerComponent : ScannerAware {
}