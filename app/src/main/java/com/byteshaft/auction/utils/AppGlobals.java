package com.byteshaft.auction.utils;

import android.app.Application;
import android.content.Context;

public class AppGlobals extends Application{

    private static Context sContext;
    public static final String USER_ROLE_KEY = "user_role";
    public static final String user_register_key = "user_register";
    public static final String user_login_key = "user_login";
    public static final String lastFragment = "last_fragment";

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = getApplicationContext();
    }

    public static Context getContext() {
        return sContext;
    }
}
