package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.i */
public abstract class C13370i {

    /* renamed from: a */
    private final String f34718a;

    protected C13370i(String str) {
        this.f34718a = str;
    }

    /* renamed from: a */
    public String mo67705a() {
        return this.f34718a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f34718a.equals(((C13370i) obj).f34718a);
    }

    public int hashCode() {
        return this.f34718a.hashCode();
    }
}
