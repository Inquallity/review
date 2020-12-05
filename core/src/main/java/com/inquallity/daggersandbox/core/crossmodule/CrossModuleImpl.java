package com.inquallity.daggersandbox.core.crossmodule;

import android.content.Context;

import com.inquallity.daggersandbox.core.Entry;

import java.util.ServiceLoader;

import javax.inject.Inject;

public class CrossModuleImpl implements CrossModule {

    private final ServiceLoader<Entry> mEntries;

    @Inject
    public CrossModuleImpl() {
        mEntries = ServiceLoader.load(Entry.class);
    }

    @Override
    public void toSecond(Context ctx) {
        for (Entry e : mEntries) {
            if (e.getId().equals("second")) {
                e.open(ctx);
                break;
            }
        }
    }
}
