package com.yandex.mobile.ads.impl;

import java.util.Locale;

/* renamed from: com.yandex.mobile.ads.impl.a2 */
public final class C12350a2 {

    /* renamed from: a */
    private final String f30410a;

    /* renamed from: b */
    private final int f30411b;

    public C12350a2(int i, String str) {
        this.f30411b = i;
        this.f30410a = str;
    }

    /* renamed from: a */
    public int mo65651a() {
        return this.f30411b;
    }

    /* renamed from: b */
    public String mo65652b() {
        return this.f30410a;
    }

    public String toString() {
        return String.format(Locale.US, "AdFetchRequestError (code: %d, description: %s)", new Object[]{Integer.valueOf(this.f30411b), this.f30410a});
    }
}
