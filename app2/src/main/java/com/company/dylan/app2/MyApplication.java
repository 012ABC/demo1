package com.company.dylan.app2;

import android.app.Application;

import com.mikepenz.iconics.Iconics;

/**
 * Created by dylan on 2017/11/27.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Iconics.init(getApplicationContext());
        Iconics.registerFont(new CustomFont());
    }
}
