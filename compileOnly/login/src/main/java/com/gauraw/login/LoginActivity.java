package com.gauraw.login;

import android.app.Activity;
import android.os.Bundle;

import com.gauraw.activitylauncher.Launcher;

@Launcher
public class LoginActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
