package com.gauraw.image_loader

import com.gauraw.image_transformer.ImageTransformer

class ImageLoader {
    fun load(url: String) {
        println(url)

    }

    fun load(url: String, transformer: ImageTransformer) {
        load(url)
        transformer.transform()

    }
}