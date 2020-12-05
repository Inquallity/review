package com.inquallity.daggersandbox.core.domain.impl;

import androidx.annotation.NonNull;

import com.inquallity.daggersandbox.core.domain.MainInteractor;
import com.inquallity.daggersandbox.mainer.IMainer;
import com.inquallity.daggersandbox.scanner.IScanner;

import javax.inject.Inject;

public class MainInteractorImpl implements MainInteractor {

    @NonNull
    private final IMainer mainer;
    @NonNull
    private final IScanner scanner;

    @Inject
    public MainInteractorImpl(@NonNull final IMainer mainer, @NonNull final IScanner scanner) {
        this.mainer = mainer;
        this.scanner = scanner;
    }

    @Override
    public void init() {
        mainer.initialize();
        scanner.initialize();
    }

    @Override
    public void doSomething() {
        mainer.doMain();
        scanner.doScan();
        mainer.doMain2();
    }
}