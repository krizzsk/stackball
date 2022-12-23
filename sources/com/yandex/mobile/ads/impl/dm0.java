package com.yandex.mobile.ads.impl;

import java.util.List;

public class dm0 {

    /* renamed from: a */
    private final fl0 f32706a;

    /* renamed from: b */
    private final kj1 f32707b;

    /* renamed from: c */
    private final List<hd0> f32708c;

    public dm0(fl0 fl0, kj1 kj1, List<hd0> list) {
        this.f32706a = fl0;
        this.f32707b = kj1;
        this.f32708c = list;
    }

    /* renamed from: a */
    public List<hd0> mo66637a() {
        return this.f32708c;
    }

    /* renamed from: b */
    public fl0 mo66638b() {
        return this.f32706a;
    }

    /* renamed from: c */
    public kj1 mo66639c() {
        return this.f32707b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm0)) {
            return false;
        }
        dm0 dm0 = (dm0) obj;
        fl0 fl0 = this.f32706a;
        if (fl0 == null ? dm0.f32706a != null : !fl0.equals(dm0.f32706a)) {
            return false;
        }
        kj1 kj1 = this.f32707b;
        if (kj1 == null ? dm0.f32707b != null : !kj1.equals(dm0.f32707b)) {
            return false;
        }
        List<hd0> list = this.f32708c;
        List<hd0> list2 = dm0.f32708c;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        fl0 fl0 = this.f32706a;
        int i = 0;
        int hashCode = (fl0 != null ? fl0.hashCode() : 0) * 31;
        kj1 kj1 = this.f32707b;
        int hashCode2 = (hashCode + (kj1 != null ? kj1.hashCode() : 0)) * 31;
        List<hd0> list = this.f32708c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }
}
