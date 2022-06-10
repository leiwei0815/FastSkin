package com.enjoy.skin;

import android.app.Application;

import com.enjoy.skin.lib.SkinManager;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SkinManager.init(this);
    }
}
