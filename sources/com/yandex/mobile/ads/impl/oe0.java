package com.yandex.mobile.ads.impl;

public class oe0 {

    /* renamed from: a */
    private final String f38213a;

    /* renamed from: b */
    private final int f38214b;

    /* renamed from: c */
    private final int f38215c;

    public oe0(String str, int i, int i2) {
        this.f38213a = str;
        this.f38214b = i;
        this.f38215c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oe0.class != obj.getClass()) {
            return false;
        }
        oe0 oe0 = (oe0) obj;
        if (this.f38214b == oe0.f38214b && this.f38215c == oe0.f38215c) {
            return this.f38213a.equals(oe0.f38213a);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f38213a.hashCode() * 31) + this.f38214b) * 31) + this.f38215c;
    }
}
