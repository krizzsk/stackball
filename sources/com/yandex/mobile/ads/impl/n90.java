package com.yandex.mobile.ads.impl;

import android.text.TextUtils;

public final class n90 {

    /* renamed from: a */
    private final String f37679a;

    /* renamed from: b */
    private final String f37680b;

    public n90(String str, String str2) {
        this.f37679a = str;
        this.f37680b = str2;
    }

    /* renamed from: a */
    public final String mo68936a() {
        return this.f37679a;
    }

    /* renamed from: b */
    public final String mo68937b() {
        return this.f37680b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n90.class != obj.getClass()) {
            return false;
        }
        n90 n90 = (n90) obj;
        if (!TextUtils.equals(this.f37679a, n90.f37679a) || !TextUtils.equals(this.f37680b, n90.f37680b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f37679a.hashCode() * 31) + this.f37680b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f37679a + ",value=" + this.f37680b + "]";
    }
}
