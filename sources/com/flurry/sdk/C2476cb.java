package com.flurry.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.flurry.sdk.C2612eh;

/* renamed from: com.flurry.sdk.cb */
public class C2476cb implements C2612eh.C2613a {

    /* renamed from: a */
    private static final String f5791a = C2476cb.class.getSimpleName();

    /* renamed from: b */
    private static C2476cb f5792b;

    /* renamed from: c */
    private String f5793c;

    /* renamed from: d */
    private String f5794d;

    private C2476cb() {
        C2611eg a = C2611eg.m5674a();
        this.f5793c = (String) a.mo17819a("VersionName");
        a.mo17820a("VersionName", (C2612eh.C2613a) this);
        String str = f5791a;
        C2530db.m5474a(4, str, "initSettings, VersionName = " + this.f5793c);
    }

    /* renamed from: a */
    public static synchronized C2476cb m5335a() {
        C2476cb cbVar;
        synchronized (C2476cb.class) {
            if (f5792b == null) {
                f5792b = new C2476cb();
            }
            cbVar = f5792b;
        }
        return cbVar;
    }

    /* renamed from: b */
    public static void m5338b() {
        if (f5792b != null) {
            C2611eg.m5674a().mo17822b("VersionName", f5792b);
        }
        f5792b = null;
    }

    /* renamed from: c */
    public static String m5339c() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: d */
    public static String m5340d() {
        return Build.DEVICE;
    }

    /* renamed from: a */
    public static String m5336a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        try {
            return packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "unknown";
        }
    }

    /* renamed from: b */
    public static int m5337b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return 0;
        }
        try {
            return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    /* renamed from: e */
    public final synchronized String mo17667e() {
        if (!TextUtils.isEmpty(this.f5793c)) {
            return this.f5793c;
        } else if (!TextUtils.isEmpty(this.f5794d)) {
            return this.f5794d;
        } else {
            String f = m5341f();
            this.f5794d = f;
            return f;
        }
    }

    /* renamed from: f */
    private static String m5341f() {
        try {
            Context context = C2494ck.m5371a().f5832a;
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo.versionName != null) {
                return packageInfo.versionName;
            }
            if (packageInfo.versionCode != 0) {
                return Integer.toString(packageInfo.versionCode);
            }
            return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        } catch (Throwable th) {
            C2530db.m5475a(6, f5791a, "", th);
            return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        }
    }

    /* renamed from: a */
    public final void mo17569a(String str, Object obj) {
        if (str.equals("VersionName")) {
            this.f5793c = (String) obj;
            String str2 = f5791a;
            C2530db.m5474a(4, str2, "onSettingUpdate, VersionName = " + this.f5793c);
            return;
        }
        C2530db.m5474a(6, f5791a, "onSettingUpdate internal error!");
    }
}
