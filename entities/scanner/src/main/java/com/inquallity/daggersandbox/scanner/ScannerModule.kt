package com.inquallity.daggersandbox.scanner

import dagger.Binds
import dagger.Module

@Module
internal abstract class ScannerModule {
    @Binds
    abstract fun scanner(impl: Scanner): IScanner
}