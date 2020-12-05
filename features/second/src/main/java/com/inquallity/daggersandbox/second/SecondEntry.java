package com.inquallity.daggersandbox.second;

import android.content.Context;
import android.content.Intent;

import com.inquallity.daggersandbox.core.Entry;

public class SecondEntry implements Entry {

    @Override
    public String getId() {
        return "second";
    }

    @Override
    public void open(Context context) {
        context.startActivity(new Intent(context, SecondActivity.class));
    }
}