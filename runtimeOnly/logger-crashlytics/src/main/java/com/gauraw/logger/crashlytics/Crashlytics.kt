package com.gauraw.logger.crashlytics

import android.content.Context
import android.widget.Toast

class Crashlytics(private val context: Context) {

    fun log(text: String) {
        /**
         * On Ideal case we probably using some lib, we will send data to server.
         * for testing purpose I am showing Toast in case of Crashlytics
         */
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}