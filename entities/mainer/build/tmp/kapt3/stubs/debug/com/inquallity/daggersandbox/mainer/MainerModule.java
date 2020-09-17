package com.inquallity.daggersandbox.mainer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/inquallity/daggersandbox/mainer/MainerModule;", "", "()V", "pMainer", "Lcom/inquallity/daggersandbox/mainer/IMainer;", "mainer", "Lcom/inquallity/daggersandbox/mainer/Mainer;", "mainer_debug"})
@dagger.Module()
public abstract class MainerModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.inquallity.daggersandbox.mainer.IMainer pMainer(@org.jetbrains.annotations.NotNull()
    com.inquallity.daggersandbox.mainer.Mainer mainer);
    
    public MainerModule() {
        super();
    }
}