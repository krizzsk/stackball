package com.yandex.metrica.impl.p264ac;

import android.os.Bundle;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ac.CrashpadServiceHelper */
public class CrashpadServiceHelper {
    /* renamed from: a */
    public static boolean m25955a(String str) {
        return markCrashCompleted(str) && deleteCompletedReports();
    }

    public static native void cancelSetUpServiceHelper();

    public static native boolean deleteCompletedReports();

    private static native boolean markCrashCompleted(String str);

    public static native Bundle readCrash(String str);

    public static native List<Bundle> readOldCrashes();

    public static native void setUpServiceHelper(String str);
}
