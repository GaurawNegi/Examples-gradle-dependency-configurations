package com.gauraw.logger

import android.content.Context
import java.lang.RuntimeException

class Logger(private val context: Context) {

    fun getModuleName(): String {
        throw RuntimeException("Implementation is missing please provide one")
    }

    fun log(text: String) {
        throw RuntimeException("Implementation is missing please provide one")
    }
}