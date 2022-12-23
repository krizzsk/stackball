package com.yandex.metrica.impl.p265ob;

import java.util.Collection;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.I6 */
public class C10361I6 {

    /* renamed from: a */
    private final C10145Bm f24873a;

    /* renamed from: b */
    private final C10421K6 f24874b;

    public C10361I6() {
        this(new C10145Bm(), new C10421K6());
    }

    /* renamed from: a */
    public Long mo61478a(List<C10547Nc> list) {
        if (C10796U2.m27896b((Collection) list)) {
            return null;
        }
        this.f24874b.getClass();
        C10547Nc nc = list.get(Math.min(1, list.size()) - 1);
        long j = nc.f25243a;
        long j2 = nc.f25244b;
        if (j != j2) {
            j = this.f24873a.mo61118a(j, j2);
        }
        return Long.valueOf(j);
    }

    C10361I6(C10145Bm bm, C10421K6 k6) {
        this.f24873a = bm;
        this.f24874b = k6;
    }
}
