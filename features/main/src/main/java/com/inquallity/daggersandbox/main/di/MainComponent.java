package com.inquallity.daggersandbox.main.di;

import com.inquallity.daggersandbox.core.crossmodule.CrossModule;
import com.inquallity.daggersandbox.core.domain.MainInteractor;
import com.inquallity.daggersandbox.main.MainActivity;

import dagger.BindsInstance;
import dagger.Component;

@Component
public interface MainComponent {

    void inject(MainActivity target);

    @Component.Builder
    public interface Builder {

        @BindsInstance
        Builder interactor(MainInteractor i);

        @BindsInstance
        Builder crossmodule(CrossModule c);

        MainComponent build();
    }
}