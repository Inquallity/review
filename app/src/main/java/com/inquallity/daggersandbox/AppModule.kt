package com.inquallity.daggersandbox

import android.util.Log
import com.inquallity.daggersandbox.mainer.IMainer
import com.inquallity.daggersandbox.proxy.MainProxy
import com.inquallity.daggersandbox.scanner.IScanner
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideMainProxy(m: IMainer, s: IScanner): MainProxy = object : MainProxy {
        override fun start() {
            m.doMain()
            s.doScan()
        }

        override fun end() {
            Log.d("OYAEBU", "end")
        }
    }
}