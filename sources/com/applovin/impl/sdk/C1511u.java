package com.applovin.impl.sdk;

import com.applovin.impl.sdk.p025b.C1371e;
import com.applovin.impl.sdk.utils.C1521i;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.u */
public class C1511u {

    /* renamed from: a */
    private final C1469j f3695a;

    /* renamed from: b */
    private final JSONObject f3696b;

    /* renamed from: c */
    private final Object f3697c = new Object();

    public C1511u(C1469j jVar) {
        this.f3695a = jVar;
        this.f3696b = C1521i.m3472a((String) jVar.mo13112b(C1371e.f3167s, "{}"), new JSONObject(), jVar);
    }

    /* renamed from: a */
    public Integer mo13294a(String str) {
        Integer valueOf;
        synchronized (this.f3697c) {
            if (this.f3696b.has(str)) {
                C1521i.m3475a(this.f3696b, str, C1521i.m3485b(this.f3696b, str, 0, this.f3695a) + 1, this.f3695a);
            } else {
                C1521i.m3475a(this.f3696b, str, 1, this.f3695a);
            }
            this.f3695a.mo13095a(C1371e.f3167s, this.f3696b.toString());
            valueOf = Integer.valueOf(C1521i.m3485b(this.f3696b, str, 0, this.f3695a));
        }
        return valueOf;
    }
}
