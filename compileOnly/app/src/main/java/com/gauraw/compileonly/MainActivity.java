package com.gauraw.compileonly;

import android.app.Activity;
import android.os.Bundle;

import com.gauraw.login.ActivityLauncher;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.startNextActivity).setOnClickListener(v -> {
//            ActivityLauncher.startSecondActivity(this);
            ActivityLauncher.startLoginActivity(this);
        });
    }
}
