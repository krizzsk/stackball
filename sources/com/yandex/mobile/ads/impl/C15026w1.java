package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.w1 */
public class C15026w1 extends op1 {
    private static final long serialVersionUID = 9076708591501334094L;

    /* renamed from: c */
    private final int f41839c;

    public C15026w1(fv0 fv0, int i) {
        super(fv0);
        this.f41839c = i;
    }

    /* renamed from: a */
    public int mo70619a() {
        return this.f41839c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15026w1.class == obj.getClass() && this.f41839c == ((C15026w1) obj).f41839c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f41839c;
    }

    /* renamed from: a */
    public static C15026w1 m43467a(fv0 fv0) {
        int i = fv0 != null ? fv0.f33755a : -1;
        if (204 == i) {
            return new C15026w1(fv0, 6);
        }
        if (403 == i) {
            return new C15026w1(fv0, 10);
        }
        if (404 == i) {
            return new C15026w1(fv0, 4);
        }
        if (i >= 500 && i <= 599) {
            return new C15026w1(fv0, 9);
        }
        if (-1 == i) {
            return new C15026w1(fv0, 7);
        }
        return new C15026w1(fv0, 8);
    }

    C15026w1(int i) {
        this.f41839c = i;
    }
}
