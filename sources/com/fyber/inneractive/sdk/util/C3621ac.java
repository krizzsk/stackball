package com.fyber.inneractive.sdk.util;

import com.tapjoy.TapjoyConstants;

/* renamed from: com.fyber.inneractive.sdk.util.ac */
public enum C3621ac {
    UNKNOWN(""),
    ETHERNET("3g"),
    WIFI(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI),
    MOBILE_3G("3g"),
    MOBILE_4G("4g");
    

    /* renamed from: f */
    public final String f9885f;

    private C3621ac(String str) {
        this.f9885f = str;
    }

    /* renamed from: a */
    public static C3621ac m9043a() {
        int c = C3656k.m9090c();
        if (c != 0) {
            if (c == 1) {
                return WIFI;
            }
            if (!(c == 2 || c == 3 || c == 4 || c == 5)) {
                if (c != 9) {
                    return UNKNOWN;
                }
                return ETHERNET;
            }
        }
        return C3656k.m9091d() == 13 ? MOBILE_4G : MOBILE_3G;
    }
}
