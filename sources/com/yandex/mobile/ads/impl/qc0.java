package com.yandex.mobile.ads.impl;

public class qc0 {

    /* renamed from: a */
    private final C15035w8 f39084a;

    /* renamed from: b */
    private final String f39085b;

    public qc0(C15035w8 w8Var, String str) {
        this.f39084a = w8Var;
        this.f39085b = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C15035w8 mo69577a() {
        return this.f39084a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo69578b() {
        return this.f39085b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qc0.class != obj.getClass()) {
            return false;
        }
        qc0 qc0 = (qc0) obj;
        if (!this.f39084a.equals(qc0.f39084a)) {
            return false;
        }
        return this.f39085b.equals(qc0.f39085b);
    }

    public int hashCode() {
        return (this.f39084a.hashCode() * 31) + this.f39085b.hashCode();
    }
}
