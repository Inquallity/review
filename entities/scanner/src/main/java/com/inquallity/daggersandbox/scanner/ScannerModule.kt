package com.inquallity.daggersandbox.scanner

import dagger.Binds
import dagger.Module

@Module
abstract class ScannerModule {

    @Binds
    abstract fun pScanner(scanner: Scanner): IScanner
}