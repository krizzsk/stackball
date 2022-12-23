package com.yandex.mobile.ads.impl;

import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.dl */
public class C12902dl {

    /* renamed from: a */
    private final String f32699a;

    /* renamed from: b */
    private final String f32700b;

    /* renamed from: c */
    private final String f32701c;

    /* renamed from: d */
    private final List<hd0> f32702d;

    public C12902dl(String str, String str2, String str3, List<hd0> list) {
        this.f32699a = str;
        this.f32700b = str2;
        this.f32701c = str3;
        this.f32702d = list;
    }

    /* renamed from: a */
    public List<hd0> mo66614a() {
        return this.f32702d;
    }

    /* renamed from: b */
    public String mo66615b() {
        return this.f32701c;
    }

    /* renamed from: c */
    public String mo66616c() {
        return this.f32700b;
    }

    /* renamed from: d */
    public String mo66617d() {
        return this.f32699a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12902dl.class != obj.getClass()) {
            return false;
        }
        C12902dl dlVar = (C12902dl) obj;
        if (!this.f32699a.equals(dlVar.f32699a) || !this.f32700b.equals(dlVar.f32700b) || !this.f32701c.equals(dlVar.f32701c)) {
            return false;
        }
        List<hd0> list = this.f32702d;
        List<hd0> list2 = dlVar.f32702d;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f32699a.hashCode() * 31) + this.f32700b.hashCode()) * 31) + this.f32701c.hashCode()) * 31;
        List<hd0> list = this.f32702d;
        return hashCode + (list != null ? list.hashCode() : 0);
    }
}
