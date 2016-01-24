package com.ideabank.vikkycorner.attendmare;

import android.content.Context;
import android.content.Intent;

import com.ideabank.vikkycorner.attendmare.LoginScreen.LoginScreenActivity;
import com.ideabank.vikkycorner.attendmare.MainScreen.MainScreenActivity;

/**
 * Created by vikkycorner on 24/01/16.
 */
public class Navigator {

    public static void toMainScreen(Context context) {
        Intent i = new Intent(context, MainScreenActivity.class);
        context.startActivity(i);
    }

    public static void toLoginScreen(Context context) {
        Intent i = new Intent(context, LoginScreenActivity.class);
        context.startActivity(i);
    }
}
