package com.yandex.metrica.impl.p264ac;

import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ac.CrashpadHelper */
public class CrashpadHelper {
    public static native void cancelSetUpNativeUncaughtExceptionHandler();

    public static native String getLibDirInsideApk();

    public static native String getLibraryVersion();

    public static native void logsEnabled(boolean z);

    public static native void setUpNativeUncaughtExceptionHandler(Bundle bundle);

    public static native void updateRuntimeConfig(String str);
}
