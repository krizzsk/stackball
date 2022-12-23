package com.yandex.mobile.ads.impl;

public class k81 {

    /* renamed from: a */
    private long f36021a;

    /* renamed from: b */
    private String f36022b;

    /* renamed from: c */
    private int f36023c;

    /* renamed from: a */
    public void mo68160a(long j) {
        this.f36021a = j;
    }

    /* renamed from: b */
    public String mo68162b() {
        return this.f36022b;
    }

    /* renamed from: c */
    public int mo68163c() {
        return this.f36023c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k81.class != obj.getClass()) {
            return false;
        }
        k81 k81 = (k81) obj;
        if (this.f36021a != k81.f36021a || this.f36023c != k81.f36023c) {
            return false;
        }
        String str = this.f36022b;
        String str2 = k81.f36022b;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f36021a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f36022b;
        return ((i + (str != null ? str.hashCode() : 0)) * 31) + this.f36023c;
    }

    /* renamed from: a */
    public void mo68161a(String str) {
        this.f36022b = str;
    }

    /* renamed from: a */
    public void mo68159a(int i) {
        this.f36023c = i;
    }

    /* renamed from: a */
    public long mo68158a() {
        return this.f36021a;
    }
}
