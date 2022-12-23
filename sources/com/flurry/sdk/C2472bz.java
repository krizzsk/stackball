package com.flurry.sdk;

import android.telephony.TelephonyManager;

/* renamed from: com.flurry.sdk.bz */
public class C2472bz {

    /* renamed from: a */
    private static final String f5773a = C2472bz.class.getSimpleName();

    /* renamed from: b */
    private static C2472bz f5774b;

    private C2472bz() {
    }

    /* renamed from: a */
    public static synchronized C2472bz m5328a() {
        C2472bz bzVar;
        synchronized (C2472bz.class) {
            if (f5774b == null) {
                f5774b = new C2472bz();
            }
            bzVar = f5774b;
        }
        return bzVar;
    }

    /* renamed from: b */
    public static void m5329b() {
        f5774b = null;
    }

    /* renamed from: c */
    public static String m5330c() {
        TelephonyManager telephonyManager = (TelephonyManager) C2494ck.m5371a().f5832a.getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        return telephonyManager.getNetworkOperatorName();
    }

    /* renamed from: d */
    public static String m5331d() {
        TelephonyManager telephonyManager = (TelephonyManager) C2494ck.m5371a().f5832a.getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        return telephonyManager.getNetworkOperator();
    }
}
