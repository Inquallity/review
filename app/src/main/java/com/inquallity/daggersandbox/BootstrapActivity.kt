package com.inquallity.daggersandbox

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class BootstrapActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val services = ServiceLoader.load(Router::class.java)
        val main = services.first()
        main.open(this)
    }

}