package com.inquallity.daggersandbox;

import android.app.Application;

import com.inquallity.daggersandbox.core.di.CoreComponent;
import com.inquallity.daggersandbox.core.di.DaggerCoreComponent;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CoreComponent.init(DaggerCoreComponent.create());
    }
}