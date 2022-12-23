package com.yandex.mobile.ads.impl;

public class hd0 {

    /* renamed from: a */
    private int f34376a;

    /* renamed from: b */
    private int f34377b;

    /* renamed from: c */
    private String f34378c;

    /* renamed from: d */
    private String f34379d;

    /* renamed from: e */
    private aa1 f34380e;

    /* renamed from: a */
    public int mo67516a() {
        return this.f34377b;
    }

    /* renamed from: b */
    public String mo67520b() {
        return this.f34379d;
    }

    /* renamed from: c */
    public aa1 mo67523c() {
        return this.f34380e;
    }

    /* renamed from: d */
    public String mo67524d() {
        return this.f34378c;
    }

    /* renamed from: e */
    public int mo67525e() {
        return this.f34376a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hd0.class != obj.getClass()) {
            return false;
        }
        hd0 hd0 = (hd0) obj;
        if (this.f34376a != hd0.f34376a || this.f34377b != hd0.f34377b) {
            return false;
        }
        String str = this.f34378c;
        if (str == null ? hd0.f34378c != null : !str.equals(hd0.f34378c)) {
            return false;
        }
        String str2 = this.f34379d;
        if (str2 == null ? hd0.f34379d != null : !str2.equals(hd0.f34379d)) {
            return false;
        }
        aa1 aa1 = this.f34380e;
        if (aa1 != null) {
            return aa1.equals(hd0.f34380e);
        }
        if (hd0.f34380e == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = ((this.f34376a * 31) + this.f34377b) * 31;
        String str = this.f34378c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f34379d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        aa1 aa1 = this.f34380e;
        if (aa1 != null) {
            i2 = aa1.hashCode();
        }
        return hashCode2 + i2;
    }

    /* renamed from: a */
    public void mo67517a(int i) {
        this.f34377b = i;
    }

    /* renamed from: b */
    public void mo67521b(int i) {
        this.f34376a = i;
    }

    /* renamed from: a */
    public void mo67519a(String str) {
        this.f34379d = str;
    }

    /* renamed from: b */
    public void mo67522b(String str) {
        this.f34378c = str;
    }

    /* renamed from: a */
    public void mo67518a(aa1 aa1) {
        this.f34380e = aa1;
    }
}
