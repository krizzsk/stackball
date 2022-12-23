package com.yandex.mobile.ads.impl;

import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.rj */
public class C14466rj extends C13370i {

    /* renamed from: b */
    private final String f39478b;

    /* renamed from: c */
    private final List<z01> f39479c;

    public C14466rj(String str, String str2, List<z01> list) {
        super(str);
        this.f39478b = str2;
        this.f39479c = list;
    }

    /* renamed from: b */
    public String mo69773b() {
        return this.f39478b;
    }

    /* renamed from: c */
    public List<z01> mo69774c() {
        return this.f39479c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14466rj.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C14466rj rjVar = (C14466rj) obj;
        if (!this.f39478b.equals(rjVar.f39478b)) {
            return false;
        }
        return this.f39479c.equals(rjVar.f39479c);
    }

    public int hashCode() {
        return (((super.hashCode() * 31) + this.f39478b.hashCode()) * 31) + this.f39479c.hashCode();
    }
}
