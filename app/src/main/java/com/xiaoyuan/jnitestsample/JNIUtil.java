package com.xiaoyuan.jnitestsample;

/**
 * Created by  on 17/5/15.
 */

public class JNIUtil {

    static
    {
        System.loadLibrary("JNITestSample");//名字注意，需要跟你的build.gradle ndk节点下面的名字一样
    }
    //jni接口需要用"native关键字来修饰"
    public native String getWorld();
}
