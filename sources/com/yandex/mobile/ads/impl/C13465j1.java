package com.yandex.mobile.ads.impl;

import java.util.ArrayList;

/* renamed from: com.yandex.mobile.ads.impl.j1 */
public class C13465j1 {

    /* renamed from: a */
    private final lf0 f35097a;

    /* renamed from: b */
    private final f01 f35098b = new f01();

    /* renamed from: c */
    private C13372i1 f35099c;

    public C13465j1(lf0 lf0) {
        this.f35097a = lf0;
    }

    /* renamed from: a */
    public C13372i1 mo67912a() {
        if (this.f35099c == null) {
            jf0 a = this.f35097a.mo68417a();
            this.f35098b.getClass();
            ArrayList arrayList = new ArrayList();
            og0 c = a.mo67986c();
            if (c != null) {
                arrayList.add(c);
            }
            for (g01 a2 : a.mo67984a()) {
                arrayList.add(a2.mo67142a());
            }
            og0 b = a.mo67985b();
            if (b != null) {
                arrayList.add(b);
            }
            this.f35099c = new C13372i1(arrayList);
        }
        return this.f35099c;
    }
}
