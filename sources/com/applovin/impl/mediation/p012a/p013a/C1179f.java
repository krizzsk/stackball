package com.applovin.impl.mediation.p012a.p013a;

import android.content.Context;
import com.applovin.impl.sdk.utils.C1519g;

/* renamed from: com.applovin.impl.mediation.a.a.f */
public class C1179f {

    /* renamed from: a */
    private final String f2241a;

    /* renamed from: b */
    private final String f2242b;

    /* renamed from: c */
    private final boolean f2243c;

    C1179f(String str, String str2, Context context) {
        this.f2241a = str.replace("android.permission.", "");
        this.f2242b = str2;
        this.f2243c = C1519g.m3430a(str, context);
    }

    /* renamed from: a */
    public String mo12188a() {
        return this.f2241a;
    }

    /* renamed from: b */
    public String mo12189b() {
        return this.f2242b;
    }

    /* renamed from: c */
    public boolean mo12190c() {
        return this.f2243c;
    }
}
