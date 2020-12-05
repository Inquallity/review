package com.inquallity.daggersandbox.main;

import android.content.Context;
import android.content.Intent;

import com.inquallity.daggersandbox.core.Entry;

public class MainEntry implements Entry {


    @Override
    public String getId() {
        return "main";
    }

    @Override
    public void open(Context ctx) {
        ctx.startActivity(new Intent(ctx, MainActivity.class));
    }
}