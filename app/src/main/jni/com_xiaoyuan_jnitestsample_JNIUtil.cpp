/**
 * Created by xiaoyuan on 17/5/15.
 */

#include <com_xiaoyuan_jnitestsample_JNIUtil.h>

JNIEXPORT jstring JNICALL Java_com_xiaoyuan_jnitestsample_JNIUtil_getWorld(JNIEnv *env, jobject obj)
{
    return env -> NewStringUTF("JNI 过程成功 ");
}
