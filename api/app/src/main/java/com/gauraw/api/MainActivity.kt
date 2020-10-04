package com.gauraw.api

import android.app.Activity
import android.os.Bundle
import com.gauraw.image_loader.ImageLoader
import com.gauraw.image_transformer.TriangleTransformer

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ImageLoader().load("dummy url", TriangleTransformer())
        //here we are able to use TriangleTransformer because of transitive dependency via image-loader
    }
}