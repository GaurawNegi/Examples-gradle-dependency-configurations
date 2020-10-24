package com.gauraw.logger

import android.content.Context
import com.gauraw.logger.crashlytics.Crashlytics

class Logger(private val context: Context) {

    private val crashlytics = Crashlytics(context)

    fun getModuleName(): String {
        return "logger-crashlytics"
    }

    fun log(text: String) {
        crashlytics.log(text)
    }
}