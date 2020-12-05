package com.inquallity.daggersandbox.main;

import android.content.Context;

import androidx.annotation.NonNull;

import com.inquallity.daggersandbox.core.crossmodule.CrossModule;
import com.inquallity.daggersandbox.core.domain.MainInteractor;

import javax.inject.Inject;

public class MainPresenter {

    @NonNull
    private final MainInteractor interactor;
    @NonNull
    private final CrossModule crossModule;

    @Inject
    public MainPresenter(@NonNull final MainInteractor interactor, @NonNull final CrossModule crossModule) {
        this.interactor = interactor;
        this.crossModule = crossModule;
    }

    public void initialize() {
        interactor.init();
    }

    public void doSmth() {
        interactor.doSomething();
    }

    public void moveToSecondary(Context ctx) {
        crossModule.toSecond(ctx);
    }

}