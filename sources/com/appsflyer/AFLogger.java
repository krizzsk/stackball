package com.appsflyer;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.appsflyer.internal.C1740aa;
import com.appsflyer.internal.Exlytics;

public class AFLogger {

    /* renamed from: ɩ */
    private static final long f3969 = System.currentTimeMillis();

    public static void afInfoLog(String str, boolean z) {
        if (m3714(LogLevel.INFO)) {
            Log.i(AppsFlyerLibCore.LOG_TAG, m3709(str, false));
        }
        if (z) {
            C1740aa.m3833().mo14060((String) null, "I", m3709(str, true));
        }
    }

    /* renamed from: ǃ */
    private static String m3709(String str, boolean z) {
        if (str == null) {
            str = "null";
        }
        if (!z && LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return str;
        }
        StringBuilder sb = new StringBuilder("(");
        sb.append(System.currentTimeMillis() - f3969);
        sb.append(") [");
        sb.append(Thread.currentThread().getName());
        sb.append("] ");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: ɩ */
    private static void m3711(String str, Throwable th, boolean z, boolean z2) {
        if (m3714(LogLevel.ERROR)) {
            if (str == null) {
                str = th.getClass().getSimpleName();
            }
            String r1 = m3709(str, false);
            if (z2) {
                Log.e(AppsFlyerLibCore.LOG_TAG, r1, th);
            } else if (z) {
                Log.d(AppsFlyerLibCore.LOG_TAG, r1);
            }
        }
        C1740aa r12 = C1740aa.m3833();
        Throwable cause = th.getCause();
        r12.mo14060("exception", th.getClass().getSimpleName(), C1740aa.m3839(cause == null ? th.getMessage() : cause.getMessage(), cause == null ? th.getStackTrace() : cause.getStackTrace()));
        Exlytics.increment();
    }

    /* renamed from: ι */
    static void m3713(String str) {
        if (m3714(LogLevel.WARNING)) {
            Log.w(AppsFlyerLibCore.LOG_TAG, m3709(str, false));
        }
        C1740aa.m3833().mo14060((String) null, ExifInterface.LONGITUDE_WEST, m3709(str, true));
    }

    public static void afRDLog(String str) {
        if (m3714(LogLevel.VERBOSE)) {
            Log.v(AppsFlyerLibCore.LOG_TAG, m3709(str, false));
        }
        C1740aa.m3833().mo14060((String) null, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, m3709(str, true));
    }

    /* renamed from: ι */
    private static boolean m3714(LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
    }

    /* renamed from: ǃ */
    static void m3710(String str) {
        if (!m3712()) {
            Log.d(AppsFlyerLibCore.LOG_TAG, m3709(str, false));
        }
        C1740aa.m3833().mo14060((String) null, "F", str);
    }

    /* renamed from: Ι */
    private static boolean m3712() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    public static void afInfoLog(String str) {
        afInfoLog(str, true);
    }

    public static void afErrorLog(String str, Throwable th) {
        m3711(str, th, true, false);
    }

    public static void afErrorLog(String str, Throwable th, boolean z) {
        m3711(str, th, true, z);
    }

    public static void afErrorLog(Throwable th) {
        m3711((String) null, th, false, false);
    }

    public static void afWarnLog(String str) {
        m3713(str);
    }

    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);
        

        /* renamed from: ı */
        private int f3971;

        private LogLevel(int i) {
            this.f3971 = i;
        }

        public final int getLevel() {
            return this.f3971;
        }
    }

    public static void afDebugLog(String str) {
        if (m3714(LogLevel.DEBUG)) {
            Log.d(AppsFlyerLibCore.LOG_TAG, m3709(str, false));
        }
        C1740aa.m3833().mo14060((String) null, "D", m3709(str, true));
    }
}
