package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C14662tb;
import java.util.HashMap;
import java.util.Map;

public class h71 extends C14662tb<d71> {

    /* renamed from: s */
    private final t41<d71> f34283s;

    /* renamed from: t */
    private final Context f34284t;

    /* renamed from: u */
    private final l30 f34285u;

    public h71(Context context, String str, t41<d71> t41, l30 l30, C14662tb.C14663a<d71> aVar) {
        super(0, str, aVar);
        this.f34284t = context;
        this.f34283s = t41;
        this.f34285u = l30;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public c51<d71> mo66994a(fv0 fv0) {
        int i;
        if (200 == fv0.f33755a) {
            d71 a = this.f34283s.mo67748a(fv0);
            if (a != null) {
                return c51.m34589a(a, xb0.m43996a(fv0));
            }
            i = 5;
        } else {
            i = 8;
        }
        return c51.m34588a(new C15026w1(fv0, i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public op1 mo67425b(op1 op1) {
        int i;
        op1.getClass();
        fv0 fv0 = op1.f38296b;
        if (fv0 != null) {
            i = fv0.f33755a;
        } else {
            i = -1;
        }
        return new C15026w1(fv0, i >= 500 && i <= 599 ? 9 : -1 == i ? 7 : 8);
    }

    /* renamed from: e */
    public Map<String, String> mo67426e() throws C13965ma {
        HashMap hashMap = new HashMap();
        d71 a = l71.m38631c().mo68362a(this.f34284t);
        if (a != null && a.mo66470r()) {
            hashMap.put("encrypted-request", "1");
        }
        hashMap.putAll(this.f34285u.mo68320d());
        return hashMap;
    }
}
