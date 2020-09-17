package com.inquallity.daggersandbox.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/inquallity/daggersandbox/providers/MainSubcomponent;", "", "mainer", "Lcom/inquallity/daggersandbox/mainer/IMainer;", "scanner", "Lcom/inquallity/daggersandbox/scanner/IScanner;", "Builder", "app_debug"})
@dagger.Subcomponent()
public abstract interface MainSubcomponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.inquallity.daggersandbox.mainer.IMainer mainer();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.inquallity.daggersandbox.scanner.IScanner scanner();
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/inquallity/daggersandbox/providers/MainSubcomponent$Builder;", "", "build", "Lcom/inquallity/daggersandbox/providers/MainSubcomponent;", "app_debug"})
    @dagger.Subcomponent.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.inquallity.daggersandbox.providers.MainSubcomponent build();
    }
}