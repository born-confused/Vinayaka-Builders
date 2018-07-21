/*package com.ample.vinayakabuilders;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by WELCOME on 5/4/2017.


public class SplashActivty extends AppCompatActivity {
    private static final int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company


            @Override
            public void run() {
                This method will be executed once the timer is over
                Start your app main activity
                Check under utils file about Preferences..!!
                    Intent intent = new Intent(SplashActivty.this, MainActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.move_right_in_activity, R.anim.move_left_out_activity);
                close this activity
                finish();

            }
        }, SPLASH_TIME_OUT);
    }

    public static String getStringFromPreference(Context context, String keyName) {
        String keyValue = "";
        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        keyValue = preferences.getString(keyName, keyValue);
        return keyValue;
    }
}
*/