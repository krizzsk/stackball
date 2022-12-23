package com.flurry.sdk;

import java.util.Locale;

/* renamed from: com.flurry.sdk.bv */
public final class C2463bv {

    /* renamed from: a */
    public static C2463bv f5741a;

    private C2463bv() {
    }

    /* renamed from: a */
    public static synchronized C2463bv m5299a() {
        C2463bv bvVar;
        synchronized (C2463bv.class) {
            if (f5741a == null) {
                f5741a = new C2463bv();
            }
            bvVar = f5741a;
        }
        return bvVar;
    }

    /* renamed from: b */
    public static String m5300b() {
        return Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
    }
}
