package com.inquallity.daggersandbox.main

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.inquallity.daggersandbox.core.di.DaggerCoreComponent
import com.inquallity.daggersandbox.feature.main.R
import com.inquallity.daggersandbox.main.di.DaggerMainComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerMainComponent.builder()
            .interactor(DaggerCoreComponent.create().mainInteractor())
            .build().inject(this)
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        Log.d("OYAEBU", "MainActivity started....")

        val btn = findViewById<View>(R.id.test_btn)
        btn.setOnClickListener {
            presenter.initialize()
            presenter.doSmth()
        }
        btn as TextView
        btn.text = "Text on button"
    }
}