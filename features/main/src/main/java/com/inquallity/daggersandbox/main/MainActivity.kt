package com.inquallity.daggersandbox.main

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.inquallity.daggersandbox.core.di.CoreComponent
import com.inquallity.daggersandbox.feature.main.R
import com.inquallity.daggersandbox.main.di.DaggerMainComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

//    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
//        CoreComponent.instance?.apply {
//            DaggerMainComponent.builder()
//                .crossmodule(crossModule())
//                .interactor(mainInteractor())
//                .build()
//                .inject(this@MainActivity)
//        }
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        Log.d("OYAEBU", "MainActivity started....")

        val btn = findViewById<View>(R.id.test_btn)
        btn.setOnClickListener {
            presenter.initialize()
            presenter.doSmth()
            presenter.moveToSecondary(this)
        }
        btn as TextView
        btn.text = "Text on button 58"

    }
}