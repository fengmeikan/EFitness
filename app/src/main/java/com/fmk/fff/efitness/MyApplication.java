package com.fmk.fff.efitness;

import android.app.Application;

import org.xutils.x;


/**
 * Created by fff on 2016/11/2.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        x.Ext.init(this);//xutils 初始化
        x.Ext.setDebug(true);//设置为debug

    }

}
