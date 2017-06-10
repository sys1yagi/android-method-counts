package com.sys1yagi.java8.jack;


import com.jakewharton.threetenabp.AndroidThreeTen;

public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AndroidThreeTen.init(this);
    }
}
