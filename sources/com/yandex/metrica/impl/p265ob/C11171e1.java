package com.yandex.metrica.impl.p265ob;

import com.appsflyer.internal.referrer.Payload;

/* renamed from: com.yandex.metrica.impl.ob.e1 */
public enum C11171e1 {
    f26755b(Payload.RESPONSE_OK),
    IDENTIFIER_PROVIDER_UNAVAILABLE("IDENTIFIER_PROVIDER_UNAVAILABLE"),
    INVALID_ADV_ID("INVALID_ADV_ID"),
    NO_STARTUP("NO_STARTUP"),
    FEATURE_DISABLED("FEATURE_DISABLED"),
    UNKNOWN("UNKNOWN");
    

    /* renamed from: a */
    private final String f26762a;

    private C11171e1(String str) {
        this.f26762a = str;
    }

    /* renamed from: a */
    public String mo62803a() {
        return this.f26762a;
    }

    /* renamed from: a */
    public static C11171e1 m28808a(String str) {
        C11171e1[] values = values();
        for (int i = 0; i < 6; i++) {
            C11171e1 e1Var = values[i];
            if (e1Var.f26762a.equals(str)) {
                return e1Var;
            }
        }
        return UNKNOWN;
    }
}
