package com.yandex.mobile.ads.impl;

public class fl0 {

    /* renamed from: a */
    private final String f33385a;

    /* renamed from: b */
    private final float f33386b;

    public fl0(String str, float f) {
        this.f33385a = str;
        this.f33386b = f;
    }

    /* renamed from: a */
    public float mo67027a() {
        return this.f33386b;
    }

    /* renamed from: b */
    public String mo67028b() {
        return this.f33385a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fl0.class != obj.getClass()) {
            return false;
        }
        fl0 fl0 = (fl0) obj;
        if (Float.compare(fl0.f33386b, this.f33386b) != 0) {
            return false;
        }
        String str = this.f33385a;
        if (str != null) {
            return str.equals(fl0.f33385a);
        }
        if (fl0.f33385a == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f33385a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        float f = this.f33386b;
        if (f != 0.0f) {
            i = Float.floatToIntBits(f);
        }
        return hashCode + i;
    }
}
