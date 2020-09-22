package com.inquallity.daggersandbox.main

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.inquallity.daggersandbox.base.lookup
import com.inquallity.daggersandbox.feature.main.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: MainComponent =
            DaggerMainComponent.builder()
                .mainerAware(lookup())
                .scannerAware(lookup())
                .build()

        val btn = findViewById<View>(R.id.test_btn)
        btn.setOnClickListener {
            component.feature().doSomething()
        }
    }
}