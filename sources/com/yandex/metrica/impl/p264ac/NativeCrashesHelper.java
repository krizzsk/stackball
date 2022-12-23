package com.yandex.metrica.impl.p264ac;

/* renamed from: com.yandex.metrica.impl.ac.NativeCrashesHelper */
public class NativeCrashesHelper {
    public static native void cancelSetUpNativeUncaughtExceptionHandler();

    public static native void logsEnabled(boolean z);

    public static native void setUpNativeUncaughtExceptionHandler(String str);
}
