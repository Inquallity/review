package com.inquallity.daggersandbox.core.di;

import com.inquallity.daggersandbox.core.crossmodule.CrossModule;
import com.inquallity.daggersandbox.core.domain.MainInteractor;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {CoreModule.class})
public abstract class CoreComponent {

    private static CoreComponent instance = null;

    public static void init(CoreComponent component) {
        instance = component;
    }

    public static CoreComponent getInstance() {
        return instance;
    }

    public abstract MainInteractor mainInteractor();

    public abstract CrossModule crossModule();
}