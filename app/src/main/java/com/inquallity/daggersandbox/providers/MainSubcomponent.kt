package com.inquallity.daggersandbox.providers

import com.inquallity.daggersandbox.mainer.IMainer
import com.inquallity.daggersandbox.scanner.IScanner
import dagger.Subcomponent

@Subcomponent
interface MainSubcomponent {

    fun mainer(): IMainer
    fun scanner(): IScanner

    @Subcomponent.Builder
    interface Builder {

        fun build(): MainSubcomponent
    }
}