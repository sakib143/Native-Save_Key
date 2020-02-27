#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_example_nativelevel_MainActivity_getNativeKey1(JNIEnv *env, jobject instance) {
    return (*env)->  NewStringUTF(env, "TXkgU2VjcmV0IEtleSBPbmU=");  //Here we can encode string
}

JNIEXPORT jstring JNICALL
Java_com_example_nativelevel_MainActivity_getNativeKey2(JNIEnv *env, jobject instance) {
    return (*env)->NewStringUTF(env, "TXkgU2VjcmV0IEtleSBUd28=");
}