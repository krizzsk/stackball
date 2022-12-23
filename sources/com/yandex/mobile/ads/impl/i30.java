package com.yandex.mobile.ads.impl;

public final class i30 {

    /* renamed from: a */
    private final String f34736a;

    /* renamed from: b */
    private final int f34737b;

    public i30(String str, int i) {
        this.f34736a = str;
        this.f34737b = i;
    }

    /* renamed from: a */
    public String mo67712a() {
        return this.f34736a;
    }

    /* renamed from: b */
    public int mo67713b() {
        return this.f34737b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i30.class != obj.getClass()) {
            return false;
        }
        i30 i30 = (i30) obj;
        if (this.f34737b != i30.f34737b) {
            return false;
        }
        return this.f34736a.equals(i30.f34736a);
    }

    public int hashCode() {
        return (this.f34736a.hashCode() * 31) + this.f34737b;
    }
}
