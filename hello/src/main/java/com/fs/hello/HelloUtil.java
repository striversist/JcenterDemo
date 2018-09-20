package com.fs.hello;

import android.util.Log;

public class HelloUtil {

    public static final String TAG = HelloUtil.class.getSimpleName();

    public static void sayHello() {
        Log.d(TAG, "Hello from HelloUtil");
    }
}
