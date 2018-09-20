package com.fs.jcenterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fs.hello.HelloUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HelloUtil.sayHello();
    }
}
