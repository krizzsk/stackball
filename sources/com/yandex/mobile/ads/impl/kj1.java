package com.yandex.mobile.ads.impl;

import java.util.List;

public class kj1 {

    /* renamed from: a */
    private final List<ck1<fu0>> f36148a;

    public kj1(List<ck1<fu0>> list) {
        this.f36148a = list;
    }

    /* renamed from: a */
    public ck1<fu0> mo68242a() {
        return this.f36148a.get(0);
    }

    /* renamed from: b */
    public List<ck1<fu0>> mo68243b() {
        return this.f36148a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kj1.class != obj.getClass()) {
            return false;
        }
        return this.f36148a.equals(((kj1) obj).f36148a);
    }

    public int hashCode() {
        return this.f36148a.hashCode();
    }
}
