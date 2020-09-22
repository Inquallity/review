package com.inquallity.daggersandbox.main

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.inquallity.daggersandbox.AppComponent
import com.inquallity.daggersandbox.feature.main.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var feature: MainFeature

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerMainComponent.builder()
            .proxy(AppComponent.instance.mainProxy())
            .build()
            .inject(this)

        val btn = findViewById<View>(R.id.test_btn)
        btn.setOnClickListener {
            feature.doSomething()
        }
    }
}