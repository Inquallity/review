package com.inquallity.daggersandbox.second;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.inquallity.daggersandbox.feature.second.R;

public class SecondActivity extends AppCompatActivity {

    public SecondActivity() {
        super(R.layout.ac_second);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.d("OYAEBU", "Second activity started...");
    }
}