package com.p243my.tracker.obfuscated;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.tapjoy.TapjoyConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.tracker.obfuscated.z */
public final class C7885z {

    /* renamed from: a */
    private static final Integer f20207a = 1;

    /* renamed from: b */
    private static final AtomicBoolean f20208b = new AtomicBoolean();

    /* renamed from: a */
    static boolean m21610a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if ("debug_phone".equals(Settings.Secure.getString(contentResolver, "bluetooth_name")) || "debug_phone".equals(Settings.System.getString(contentResolver, "bluetooth_name"))) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        return "debug_phone".equals(Settings.Global.getString(contentResolver, TapjoyConstants.TJC_DEVICE_NAME));
    }

    /* renamed from: b */
    static boolean m21611b(Context context) {
        if (String.valueOf(f20207a).equals(C7871s0.m21530a(String.format("%s_mytracker_debug", new Object[]{context.getPackageName()})))) {
            C7877u0.m21547a("LoggingHandler: debug data in SystemProperties has been found");
            return true;
        }
        C7877u0.m21547a("LoggingHandler: no debug data in SystemProperties");
        return false;
    }

    /* renamed from: c */
    public static void m21612c(Context context) {
        if (!f20208b.compareAndSet(false, true)) {
            C7877u0.m21547a("LoggingHandler: instance has already been initialized");
        } else if (C7877u0.m21550a()) {
            C7877u0.m21547a("LoggingHandler: tracing has already been enabled");
        } else {
            C7806d.m21130a(new Runnable(context) {
                public final /* synthetic */ Context f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    C7885z.m21613d(this.f$0);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m21613d(Context context) {
        String str;
        if (m21610a(context)) {
            C7877u0.m21549a(true);
            str = "LoggingHandler: debug mode is enabled by device name";
        } else {
            if (f20207a.equals((Integer) C7871s0.m21529a(context, "com.my.tracker.debugMode", Integer.class))) {
                C7877u0.m21549a(true);
                str = "LoggingHandler: debug mode is enabled by manifest metadata";
            } else if (m21611b(context)) {
                C7877u0.m21549a(true);
                C7877u0.m21547a("LoggingHandler: debug mode is enabled by system properties");
                return;
            } else {
                return;
            }
        }
        C7877u0.m21547a(str);
    }
}
