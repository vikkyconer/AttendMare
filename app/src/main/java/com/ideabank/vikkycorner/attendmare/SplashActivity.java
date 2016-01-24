package com.ideabank.vikkycorner.attendmare;

import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SplashActivity extends ActionBarActivity {

    private final int SPLASH_DISPLAY_LENGTH = 4500;
    private int userLoginCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
//                userLoginCount = Integer.parseInt(AppSettings.getValue(SplashActivity.this, AppSettings.PREF_IS_USER_LOGIN_COUNT, "0"));
//                Log.i("NotesSplash", String.valueOf(userLoginCount));
//
//                if (userLoginCount == 0) {
//                AppSettings.setValue(SplashActivity.this, AppSettings.PREF_IS_USER_LOGIN_COUNT, String.valueOf(userLoginCount + 1));
//                    Navigator.toGuideScreens(SplashActivity.this);
//                } else
//                Navigator.toMainScreen(SplashActivity.this);
                Navigator.toLoginScreen(SplashActivity.this);
                SplashActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);

    }
}