package com.inquallity.daggersandbox.second

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.inquallity.daggersandbox.feature.second.R

class SecondActivity : AppCompatActivity(R.layout.ac_second) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("OYAEBU", "Second activity started...")
    }
}