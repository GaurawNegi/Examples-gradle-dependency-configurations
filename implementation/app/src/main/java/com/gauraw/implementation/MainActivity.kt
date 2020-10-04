package com.gauraw.implementation

import android.app.Activity
import android.os.Bundle
import com.gauraw.image_loader.ImageLoader

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ImageLoader().load("dummy url")
        //NetworkManager
        // we are not able to use Network Mannger because image-loader use implementation for network-manger
    }
}