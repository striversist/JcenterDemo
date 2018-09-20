package com.fs.mylibrary;

import android.util.Log;

public class DefenseLib {

    public static final String TAG = DefenseLib.class.getSimpleName();
    private static DefenseLib sInstance;

    public static DefenseLib getInstance() {
        if (sInstance == null) {
            synchronized (DefenseLib.class) {
                if (sInstance == null) {
                    sInstance = new DefenseLib();
                }
            }
        }
        return sInstance;
    }

    public void echoMsg(String msg) {
        Log.d(TAG, "" + msg);
    }
}
