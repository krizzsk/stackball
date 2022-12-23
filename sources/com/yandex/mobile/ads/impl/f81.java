package com.yandex.mobile.ads.impl;

public class f81 extends C13370i {

    /* renamed from: b */
    private final String f33279b;

    /* renamed from: c */
    private final String f33280c;

    /* renamed from: d */
    private final String f33281d;

    public f81(String str, String str2, String str3, String str4) {
        super(str);
        this.f33279b = str2;
        this.f33280c = str3;
        this.f33281d = str4;
    }

    /* renamed from: b */
    public String mo66938b() {
        return this.f33279b;
    }

    /* renamed from: c */
    public String mo66939c() {
        return this.f33280c;
    }

    /* renamed from: d */
    public String mo66940d() {
        return this.f33281d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f81.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        f81 f81 = (f81) obj;
        if (this.f33279b.equals(f81.f33279b) && this.f33280c.equals(f81.f33280c)) {
            return this.f33281d.equals(f81.f33281d);
        }
        return false;
    }

    public int hashCode() {
        return (((((super.hashCode() * 31) + this.f33279b.hashCode()) * 31) + this.f33280c.hashCode()) * 31) + this.f33281d.hashCode();
    }
}
