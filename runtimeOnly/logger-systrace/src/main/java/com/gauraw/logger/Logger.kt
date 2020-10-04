package com.gauraw.logger

import android.content.Context

class Logger(private val context: Context) {

    fun getModuleName(): String {
        return "logger-systrace"
    }

    fun log(text: String) {
        println(text)
    }
}