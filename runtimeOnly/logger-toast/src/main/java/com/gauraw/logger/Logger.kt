package com.gauraw.logger

import android.content.Context
import android.widget.Toast

class Logger(private val context: Context) {
    fun getModuleName(): String {
        return "logger-toast"
    }

    fun log(text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}