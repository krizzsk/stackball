package com.yandex.mobile.ads.impl;

public class y81 {

    /* renamed from: a */
    private final int f42791a;

    /* renamed from: b */
    private final int f42792b;

    public y81(int i, int i2) {
        this.f42791a = i;
        this.f42792b = i2;
    }

    /* renamed from: a */
    public int mo71007a() {
        return this.f42792b;
    }

    /* renamed from: b */
    public int mo71008b() {
        return this.f42791a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y81.class != obj.getClass()) {
            return false;
        }
        y81 y81 = (y81) obj;
        if (this.f42791a == y81.f42791a && this.f42792b == y81.f42792b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f42791a * 31) + this.f42792b;
    }
}
