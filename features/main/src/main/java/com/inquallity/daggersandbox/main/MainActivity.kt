package com.inquallity.daggersandbox.main

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.inquallity.daggersandbox.AppComponent
import com.inquallity.daggersandbox.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: MainComponent? =
        DaggerMainComponent.builder()
            .mainSub(AppComponent.instance.getMainSub().build())
            .build()

        val btn = findViewById<View>(R.id.test_btn)
        btn.setOnClickListener {
            component?.getMainFeature()?.doSomething()
        }
    }
}