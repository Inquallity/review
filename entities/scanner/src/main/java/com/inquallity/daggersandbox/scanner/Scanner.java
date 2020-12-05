package com.inquallity.daggersandbox.scanner;

import android.util.Log;

import javax.inject.Inject;

public class Scanner implements IScanner {

    @Inject
    public Scanner() {
    }

    @Override
    public void doScan() {
        Log.d("OYAEBU", "scanner doing scan $this");

    }

    @Override
    public void initialize() {
        Log.d("OYAEBU", "Do initialization of $this");
    }
}

