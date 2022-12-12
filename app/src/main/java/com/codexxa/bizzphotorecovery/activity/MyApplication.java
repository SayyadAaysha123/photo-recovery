package com.codexxa.bizzphotorecovery.activity;

import android.app.Application;

import com.codexxa.bizzphotorecovery.R;
import com.codexxa.bizzphotorecovery.ads.AppOpenManager;

public class MyApplication extends Application {

    private static MyApplication mInstance;
    AppOpenManager appOpenManager;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

        appOpenManager = new AppOpenManager(MyApplication.this, getString(R.string.admob_open_ads));

    }

    public static MyApplication getInstance() {
        return mInstance;
    }


}