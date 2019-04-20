package com.xiaoyuan.jnitestsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main_t);
        JNIUtil jniUtil = new JNIUtil();
        TextView test = (TextView) findViewById(R.id.test);
        test.setText(jniUtil.getWorld());
    }
}
