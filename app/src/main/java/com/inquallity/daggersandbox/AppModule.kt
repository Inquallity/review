package com.inquallity.daggersandbox

import com.inquallity.daggersandbox.providers.MainSubcomponent
import dagger.Module

@Module(subcomponents = [MainSubcomponent::class])
class AppModule {}