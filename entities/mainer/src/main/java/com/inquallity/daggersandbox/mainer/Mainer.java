package com.inquallity.daggersandbox.mainer;

import android.util.Log;

import javax.inject.Inject;

public class Mainer implements IMainer {

    @Inject
    public Mainer() {
    }

    private void privateMain() {
        Log.d("OYAEBU", "Do private work; $this");
    }

    @Override
    public void doMain() {
        Log.d("OYAEBU", "Mainer doing main in $this");
    }

    @Override
    public void initialize() {
        Log.d("OYAEBU", "Do initialization of $this");
    }

    @Override
    public void doMain2() {
        privateMain();
    }
}

