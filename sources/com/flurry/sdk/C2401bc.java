package com.flurry.sdk;

/* renamed from: com.flurry.sdk.bc */
public enum C2401bc {
    GET("GET", 0),
    PUT("PUT", 1),
    POST("POST", 2);
    

    /* renamed from: d */
    String f5543d;

    /* renamed from: e */
    int f5544e;

    private C2401bc(String str, int i) {
        this.f5543d = str;
        this.f5544e = i;
    }

    /* renamed from: a */
    public static C2401bc m5168a(int i) {
        if (i == 0) {
            return GET;
        }
        if (i == 1) {
            return PUT;
        }
        if (i != 2) {
            return null;
        }
        return POST;
    }
}
