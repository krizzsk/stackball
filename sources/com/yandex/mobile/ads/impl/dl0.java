package com.yandex.mobile.ads.impl;

public class dl0 implements Comparable<dl0> {

    /* renamed from: b */
    public final int f32703b;

    /* renamed from: c */
    public int f32704c;

    public dl0(int i) {
        this.f32703b = i;
    }

    public int compareTo(Object obj) {
        dl0 dl0 = (dl0) obj;
        int i = this.f32703b;
        int i2 = dl0.f32703b;
        return i == i2 ? this.f32704c - dl0.f32704c : i2 - i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dl0.class != obj.getClass()) {
            return false;
        }
        dl0 dl0 = (dl0) obj;
        if (this.f32703b == dl0.f32703b && this.f32704c == dl0.f32704c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f32703b * 31) + this.f32704c;
    }
}
