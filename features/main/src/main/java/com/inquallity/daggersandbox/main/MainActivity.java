package com.inquallity.daggersandbox.main;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.inquallity.daggersandbox.core.di.CoreComponent;
import com.inquallity.daggersandbox.feature.main.R;
import com.inquallity.daggersandbox.main.di.DaggerMainComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    protected MainPresenter mainPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        DaggerMainComponent.builder()
                .crossmodule(CoreComponent.getInstance().crossModule())
                .interactor(CoreComponent.getInstance().mainInteractor())
                .build()
                .inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("OYAEBU", "MainActivity started....");

        final TextView btn = findViewById(R.id.test_btn);
        btn.setText("Text on button 58");
        btn.setOnClickListener(v -> {
            mainPresenter.initialize();
            mainPresenter.doSmth();
            mainPresenter.moveToSecondary(this);
        });
    }
}