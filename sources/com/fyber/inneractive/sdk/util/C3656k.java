package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;

/* renamed from: com.fyber.inneractive.sdk.util.k */
public final class C3656k extends C3657l {
    /* renamed from: a */
    public static String m9084a() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) m9125p().getSystemService("phone");
            String networkOperator = telephonyManager.getNetworkOperator();
            if (telephonyManager.getPhoneType() != 2) {
                return networkOperator;
            }
            TelephonyManager telephonyManager2 = (TelephonyManager) m9125p().getSystemService("phone");
            return telephonyManager2 != null && telephonyManager2.getSimState() == 5 ? telephonyManager.getSimOperator() : networkOperator;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m9089b() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) m9125p().getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            return C3657l.m9123d("android.permission.ACCESS_NETWORK_STATE") && activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        } catch (Throwable unused) {
            IAlog.m9037e("Error retrieved when trying to get the network state - Perhaps you forgot to declare android.permission.ACCESS_NETWORK_STATE in your Android manifest file.", new Object[0]);
            return true;
        }
    }

    /* renamed from: c */
    public static int m9090c() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) m9125p().getSystemService("connectivity");
            if (!C3657l.m9123d("android.permission.ACCESS_NETWORK_STATE") || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return 8;
            }
            return activeNetworkInfo.getType();
        } catch (Exception unused) {
            return 8;
        }
    }

    /* renamed from: d */
    public static int m9091d() {
        try {
            if (!C3657l.m9123d("android.permission.READ_PHONE_STATE")) {
                return 0;
            }
            TelephonyManager telephonyManager = (TelephonyManager) m9125p().getSystemService("phone");
            return Build.VERSION.SDK_INT >= 24 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: e */
    public static String m9092e() {
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    /* renamed from: f */
    public static String m9094f() {
        return f9937a.getPackageName();
    }

    /* renamed from: a */
    public static String m9085a(Context context) {
        return context.getPackageName();
    }

    /* renamed from: g */
    public static String m9095g() {
        try {
            return m9125p().getPackageManager().getPackageInfo(m9125p().getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static String m9096h() {
        try {
            return ((TelephonyManager) m9125p().getSystemService("phone")).getNetworkCountryIso();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static String m9097i() {
        try {
            return ((TelephonyManager) m9125p().getSystemService("phone")).getNetworkOperatorName();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m9087a(Intent intent) {
        int i;
        try {
            i = m9125p().getPackageManager().queryIntentActivities(intent, 0).size();
        } catch (Throwable unused) {
            i = 0;
        }
        if (i > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m9098j() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return m9087a(intent);
    }

    /* renamed from: k */
    public static boolean m9099k() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return m9087a(intent);
    }

    /* renamed from: l */
    public static boolean m9100l() {
        return "mounted".equals(C3657l.m9134y()) && m9125p().checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    /* renamed from: m */
    public static boolean m9101m() {
        return m9087a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event"));
    }

    /* renamed from: n */
    public static boolean m9102n() {
        boolean z = (m9125p().getResources().getConfiguration().screenLayout & 15) == 4;
        IAlog.m9033a("This device has a tablet resolution? %s", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: a */
    public static String m9086a(String str) {
        return str == null ? "" : str.substring(0, m9093f(str));
    }

    /* renamed from: b */
    public static String m9088b(String str) {
        return str == null ? "" : str.substring(m9093f(str));
    }

    /* renamed from: f */
    private static int m9093f(String str) {
        return Math.min(3, str.length());
    }

    /* renamed from: o */
    public static boolean m9103o() {
        if (m9125p().getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", m9125p().getPackageName()) != 0) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) m9125p().getSystemService("connectivity");
        try {
            if (connectivityManager.getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTED || connectivityManager.getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTING) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
