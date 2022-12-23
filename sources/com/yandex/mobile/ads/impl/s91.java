package com.yandex.mobile.ads.impl;

public final class s91 {

    /* renamed from: a */
    private final int f39879a;

    /* renamed from: b */
    private final int f39880b;

    /* renamed from: c */
    private final int f39881c;

    /* renamed from: d */
    private final int f39882d;

    /* renamed from: e */
    private final int f39883e;

    public s91(int i, int i2, int i3, int i4) {
        this.f39879a = i;
        this.f39880b = i2;
        this.f39881c = i3;
        this.f39882d = i4;
        this.f39883e = i3 * i4;
    }

    /* renamed from: a */
    public final int mo69905a() {
        return this.f39883e;
    }

    /* renamed from: b */
    public final int mo69906b() {
        return this.f39882d;
    }

    /* renamed from: c */
    public final int mo69907c() {
        return this.f39881c;
    }

    /* renamed from: d */
    public final int mo69908d() {
        return this.f39879a;
    }

    /* renamed from: e */
    public final int mo69909e() {
        return this.f39880b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s91)) {
            return false;
        }
        s91 s91 = (s91) obj;
        return this.f39879a == s91.f39879a && this.f39880b == s91.f39880b && this.f39881c == s91.f39881c && this.f39882d == s91.f39882d;
    }

    public int hashCode() {
        return (((((this.f39879a * 31) + this.f39880b) * 31) + this.f39881c) * 31) + this.f39882d;
    }

    public String toString() {
        return "SmartCenter(x=" + this.f39879a + ", y=" + this.f39880b + ", width=" + this.f39881c + ", height=" + this.f39882d + ')';
    }
}
