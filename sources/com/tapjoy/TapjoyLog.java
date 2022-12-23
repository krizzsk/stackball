package com.tapjoy;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.WebView;
import com.facebook.internal.security.CertificateUtil;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.C9340gw;
import com.tapjoy.internal.C9344gz;

public class TapjoyLog {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f22279a = TapjoyLog.class.getSimpleName();

    /* renamed from: b */
    private static int f22280b = 6;

    /* renamed from: c */
    private static int f22281c = 4;

    /* renamed from: d */
    private static int f22282d = 2;

    /* renamed from: e */
    private static boolean f22283e = false;

    /* renamed from: f */
    private static int f22284f = 6;

    public static void setDebugEnabled(boolean z) {
        boolean z2;
        f22283e = z;
        C9344gz a = C9344gz.m25060a();
        if (C9340gw.f23095a != z) {
            C9340gw.f23095a = z;
            if (z) {
                C9340gw.m25043a("The debug mode has been enabled");
            } else {
                C9340gw.m25043a("The debug mode has been disabled");
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && z && a.f23121k) {
            a.f23119i.mo58230a();
        }
        if (f22283e) {
            m24272a(TapjoyConstants.LOG_LEVEL_DEBUG_ON, false);
        } else {
            m24272a(TapjoyConstants.LOG_LEVEL_DEBUG_OFF, false);
        }
    }

    public static void setInternalLogging(boolean z) {
        if (z) {
            m24272a(TapjoyConstants.LOG_LEVEL_INTERNAL, true);
        }
    }

    /* renamed from: a */
    static void m24272a(String str, boolean z) {
        if (z || TapjoyAppSettings.getInstance() == null || TapjoyAppSettings.getInstance().f22136a == null) {
            if (str.equals(TapjoyConstants.LOG_LEVEL_INTERNAL)) {
                f22284f = f22282d;
                if (Build.VERSION.SDK_INT >= 19) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            TapjoyLog.m24273d(TapjoyLog.f22279a, "Enabling WebView debugging");
                            WebView.setWebContentsDebuggingEnabled(true);
                        }
                    });
                }
            } else if (str.equals(TapjoyConstants.LOG_LEVEL_DEBUG_ON)) {
                f22284f = f22281c;
            } else if (str.equals(TapjoyConstants.LOG_LEVEL_DEBUG_OFF)) {
                f22284f = f22280b;
            } else {
                String str2 = f22279a;
                m24273d(str2, "unrecognized loggingLevel: " + str);
                f22284f = f22280b;
            }
            String str3 = f22279a;
            m24273d(str3, "logThreshold=" + f22284f);
            return;
        }
        m24273d(f22279a, "setLoggingLevel -- log setting already persisted");
    }

    public static boolean isLoggingEnabled() {
        return f22283e;
    }

    /* renamed from: i */
    public static void m24276i(String str, String str2) {
        m24271a(4, str, str2);
    }

    /* renamed from: e */
    public static void m24275e(String str, String str2) {
        m24274e(str, new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTERNAL_ERROR, str2));
    }

    /* renamed from: e */
    public static void m24274e(String str, TapjoyErrorMessage tapjoyErrorMessage) {
        if (tapjoyErrorMessage == null) {
            return;
        }
        if (f22284f == f22282d || tapjoyErrorMessage.getType() != TapjoyErrorMessage.ErrorType.INTERNAL_ERROR) {
            m24271a(6, str, tapjoyErrorMessage.toString());
        }
    }

    /* renamed from: w */
    public static void m24278w(String str, String str2) {
        m24271a(5, str, str2);
    }

    /* renamed from: d */
    public static void m24273d(String str, String str2) {
        m24271a(3, str, str2);
    }

    /* renamed from: v */
    public static void m24277v(String str, String str2) {
        m24271a(2, str, str2);
    }

    /* renamed from: a */
    private static void m24271a(int i, String str, String str2) {
        String str3 = f22279a + CertificateUtil.DELIMITER + str;
        if (f22284f > i) {
            return;
        }
        if (str2.length() > 4096) {
            int i2 = 0;
            while (i2 <= str2.length() / 4096) {
                int i3 = i2 * 4096;
                i2++;
                int i4 = i2 * 4096;
                if (i4 > str2.length()) {
                    i4 = str2.length();
                }
                Log.println(i, str3, str2.substring(i3, i4));
            }
            return;
        }
        Log.println(i, str3, str2);
    }
}
