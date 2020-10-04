package com.gauraw.runtimeonly

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.gauraw.logger.Logger

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logger = Logger(applicationContext)

        findViewById<TextView>(R.id.library_pick_at_runtime).text = "runtimeOnly : pick module -> " + logger.getModuleName()
        findViewById<Button>(R.id.log).setOnClickListener {
            logger.log("Calling from MainActivity")
        }

    }
}