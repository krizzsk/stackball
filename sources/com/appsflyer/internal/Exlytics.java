package com.appsflyer.internal;

import android.app.Application;
import com.appsflyer.AppsFlyerLibCore;

public class Exlytics {
    public static final String EXCEPTION_COUNT_KEY = "exception_number";

    /* renamed from: ı */
    private static Application f4115;

    public static void setContext(Application application) {
        f4115 = application;
    }

    public static void increment() {
        Application application = f4115;
        if (application != null) {
            AppsFlyerLibCore.getSharedPreferences(application).edit().putLong(EXCEPTION_COUNT_KEY, get() + 1).apply();
        }
    }

    public static long get() {
        Application application = f4115;
        if (application == null) {
            return -1;
        }
        return AppsFlyerLibCore.getSharedPreferences(application).getLong(EXCEPTION_COUNT_KEY, 0);
    }
}
