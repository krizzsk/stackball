package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.r2 */
public final class C14436r2 {

    /* renamed from: a */
    private final int f39345a;

    /* renamed from: b */
    private final int f39346b;

    public C14436r2(int i, int i2) {
        this.f39345a = i;
        this.f39346b = i2;
    }

    /* renamed from: a */
    public int mo69678a() {
        return this.f39345a;
    }

    /* renamed from: b */
    public int mo69679b() {
        return this.f39346b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14436r2.class != obj.getClass()) {
            return false;
        }
        C14436r2 r2Var = (C14436r2) obj;
        if (this.f39345a == r2Var.f39345a && this.f39346b == r2Var.f39346b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f39345a * 31) + this.f39346b;
    }
}
