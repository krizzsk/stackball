package com.applovin.impl.sdk.utils;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p025b.C1371e;
import com.applovin.impl.sdk.p025b.C1372f;

/* renamed from: com.applovin.impl.sdk.utils.q */
public final class C1556q {

    /* renamed from: a */
    private final C1469j f3793a;

    /* renamed from: b */
    private String f3794b = m3570d();

    /* renamed from: c */
    private final String f3795c;

    /* renamed from: d */
    private final String f3796d;

    public C1556q(C1469j jVar) {
        this.f3793a = jVar;
        this.f3795c = m3569a(C1371e.f3153e, (String) C1372f.m2658b(C1371e.f3152d, null, jVar.mo13065D()));
        this.f3796d = m3569a(C1371e.f3154f, (String) jVar.mo13088a(C1369c.f2851U));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.applovin.impl.sdk.b.e, com.applovin.impl.sdk.b.e<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m3569a(com.applovin.impl.sdk.p025b.C1371e<java.lang.String> r3, java.lang.String r4) {
        /*
            r2 = this;
            com.applovin.impl.sdk.j r0 = r2.f3793a
            android.content.Context r0 = r0.mo13065D()
            r1 = 0
            java.lang.Object r0 = com.applovin.impl.sdk.p025b.C1372f.m2658b(r3, r1, (android.content.Context) r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.applovin.impl.sdk.utils.C1553o.m3554b(r0)
            if (r1 == 0) goto L_0x0014
            return r0
        L_0x0014:
            boolean r0 = com.applovin.impl.sdk.utils.C1553o.m3554b(r4)
            if (r0 == 0) goto L_0x001b
            goto L_0x0029
        L_0x001b:
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
        L_0x0029:
            com.applovin.impl.sdk.j r0 = r2.f3793a
            android.content.Context r0 = r0.mo13065D()
            com.applovin.impl.sdk.p025b.C1372f.m2656a(r3, r4, (android.content.Context) r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.utils.C1556q.m3569a(com.applovin.impl.sdk.b.e, java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    private String m3570d() {
        if (!((Boolean) this.f3793a.mo13088a(C1369c.f3035dU)).booleanValue()) {
            this.f3793a.mo13116b(C1371e.f3151c);
        }
        String str = (String) this.f3793a.mo13089a(C1371e.f3151c);
        if (!C1553o.m3554b(str)) {
            return null;
        }
        C1505q v = this.f3793a.mo13139v();
        v.mo13277b("AppLovinSdk", "Using identifier (" + str + ") from previous session");
        this.f3794b = str;
        return null;
    }

    /* renamed from: a */
    public String mo13349a() {
        return this.f3794b;
    }

    /* renamed from: a */
    public void mo13350a(String str) {
        if (((Boolean) this.f3793a.mo13088a(C1369c.f3035dU)).booleanValue()) {
            this.f3793a.mo13095a(C1371e.f3151c, str);
        }
        this.f3794b = str;
    }

    /* renamed from: b */
    public String mo13351b() {
        return this.f3795c;
    }

    /* renamed from: c */
    public String mo13352c() {
        return this.f3796d;
    }
}
