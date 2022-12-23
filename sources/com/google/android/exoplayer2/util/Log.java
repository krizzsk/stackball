package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

public final class Log {
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
    public static final int LOG_LEVEL_WARNING = 2;
    private static int logLevel = 0;
    private static boolean logStackTraces = true;

    private Log() {
    }

    @Pure
    public static int getLogLevel() {
        return logLevel;
    }

    @Pure
    public boolean getLogStackTraces() {
        return logStackTraces;
    }

    public static void setLogLevel(int i) {
        logLevel = i;
    }

    public static void setLogStackTraces(boolean z) {
        logStackTraces = z;
    }

    @Pure
    /* renamed from: d */
    public static void m9241d(String str, String str2) {
        if (logLevel == 0) {
            android.util.Log.d(str, str2);
        }
    }

    @Pure
    /* renamed from: d */
    public static void m9242d(String str, String str2, Throwable th) {
        m9241d(str, appendThrowableString(str2, th));
    }

    @Pure
    /* renamed from: i */
    public static void m9245i(String str, String str2) {
        if (logLevel <= 1) {
            android.util.Log.i(str, str2);
        }
    }

    @Pure
    /* renamed from: i */
    public static void m9246i(String str, String str2, Throwable th) {
        m9245i(str, appendThrowableString(str2, th));
    }

    @Pure
    /* renamed from: w */
    public static void m9247w(String str, String str2) {
        if (logLevel <= 2) {
            android.util.Log.w(str, str2);
        }
    }

    @Pure
    /* renamed from: w */
    public static void m9248w(String str, String str2, Throwable th) {
        m9247w(str, appendThrowableString(str2, th));
    }

    @Pure
    /* renamed from: e */
    public static void m9243e(String str, String str2) {
        if (logLevel <= 3) {
            android.util.Log.e(str, str2);
        }
    }

    @Pure
    /* renamed from: e */
    public static void m9244e(String str, String str2, Throwable th) {
        m9243e(str, appendThrowableString(str2, th));
    }

    @Pure
    public static String getThrowableString(Throwable th) {
        if (th == null) {
            return null;
        }
        if (isCausedByUnknownHostException(th)) {
            return "UnknownHostException (no network)";
        }
        if (!logStackTraces) {
            return th.getMessage();
        }
        return android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    @Pure
    private static String appendThrowableString(String str, Throwable th) {
        String throwableString = getThrowableString(th);
        if (TextUtils.isEmpty(throwableString)) {
            return str;
        }
        return str + "\n  " + throwableString.replace("\n", "\n  ") + 10;
    }

    @Pure
    private static boolean isCausedByUnknownHostException(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }
}
