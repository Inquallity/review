package com.inquallity.daggersandbox.core.di;

import com.inquallity.daggersandbox.core.crossmodule.CrossModule;
import com.inquallity.daggersandbox.core.crossmodule.CrossModuleImpl;
import com.inquallity.daggersandbox.core.domain.MainInteractor;
import com.inquallity.daggersandbox.core.domain.impl.MainInteractorImpl;
import com.inquallity.daggersandbox.mainer.IMainer;
import com.inquallity.daggersandbox.mainer.Mainer;
import com.inquallity.daggersandbox.scanner.IScanner;
import com.inquallity.daggersandbox.scanner.Scanner;

import dagger.Binds;
import dagger.Module;

@Module
interface CoreModule {

    @Binds
    MainInteractor mainInteractor(MainInteractorImpl interactor);

    @Binds
    CrossModule crossModule(CrossModuleImpl c);

    @Binds
    IMainer mainer(Mainer m);

    @Binds
    IScanner scanner(Scanner s);
}
