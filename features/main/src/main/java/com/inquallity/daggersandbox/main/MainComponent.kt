package com.inquallity.daggersandbox.main

import com.inquallity.daggersandbox.mainer.MainerAware
import com.inquallity.daggersandbox.scanner.ScannerAware
import dagger.Component

@Component(
    dependencies = [
        MainerAware::class,
        ScannerAware::class
    ]
)
internal interface MainComponent {
    fun feature(): MainFeature
}