package com.inquallity.daggersandbox

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class
    ]
)
internal abstract class AppComponent {

}
