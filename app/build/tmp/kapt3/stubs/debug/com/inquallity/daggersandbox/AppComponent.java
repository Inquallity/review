package com.inquallity.daggersandbox;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/inquallity/daggersandbox/AppComponent;", "", "()V", "getMainSub", "Lcom/inquallity/daggersandbox/providers/MainSubcomponent$Builder;", "Initializer", "app_debug"})
@dagger.Component(modules = {com.inquallity.daggersandbox.AppModule.class, com.inquallity.daggersandbox.mainer.MainerModule.class, com.inquallity.daggersandbox.scanner.ScannerModule.class})
@javax.inject.Singleton()
public abstract class AppComponent {
    @org.jetbrains.annotations.NotNull()
    public static com.inquallity.daggersandbox.AppComponent instance;
    public static final com.inquallity.daggersandbox.AppComponent.Initializer Initializer = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.inquallity.daggersandbox.providers.MainSubcomponent.Builder getMainSub();
    
    public AppComponent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/inquallity/daggersandbox/AppComponent$Initializer;", "", "()V", "instance", "Lcom/inquallity/daggersandbox/AppComponent;", "getInstance", "()Lcom/inquallity/daggersandbox/AppComponent;", "setInstance", "(Lcom/inquallity/daggersandbox/AppComponent;)V", "initialize", "", "appComponent", "app_debug"})
    public static final class Initializer {
        
        @org.jetbrains.annotations.NotNull()
        public final com.inquallity.daggersandbox.AppComponent getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull()
        com.inquallity.daggersandbox.AppComponent p0) {
        }
        
        public final void initialize(@org.jetbrains.annotations.NotNull()
        com.inquallity.daggersandbox.AppComponent appComponent) {
        }
        
        private Initializer() {
            super();
        }
    }
}