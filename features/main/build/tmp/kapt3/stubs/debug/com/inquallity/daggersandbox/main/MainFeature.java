package com.inquallity.daggersandbox.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/inquallity/daggersandbox/main/MainFeature;", "", "mainer", "Lcom/inquallity/daggersandbox/mainer/IMainer;", "scanner", "Lcom/inquallity/daggersandbox/scanner/IScanner;", "(Lcom/inquallity/daggersandbox/mainer/IMainer;Lcom/inquallity/daggersandbox/scanner/IScanner;)V", "doSomething", "", "main_debug"})
public final class MainFeature {
    private final com.inquallity.daggersandbox.mainer.IMainer mainer = null;
    private final com.inquallity.daggersandbox.scanner.IScanner scanner = null;
    
    public final void doSomething() {
    }
    
    @javax.inject.Inject()
    public MainFeature(@org.jetbrains.annotations.NotNull()
    com.inquallity.daggersandbox.mainer.IMainer mainer, @org.jetbrains.annotations.NotNull()
    com.inquallity.daggersandbox.scanner.IScanner scanner) {
        super();
    }
}