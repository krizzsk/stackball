package com.ogury.p245ed.internal;

/* renamed from: com.ogury.ed.internal.lh */
public final class C8429lh {
    /* renamed from: b */
    private static final int m23852b(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    /* renamed from: a */
    private static final int m23851a(int i, int i2, int i3) {
        return m23852b(m23852b(i, 1) - m23852b(i2, 1), 1);
    }

    /* renamed from: a */
    public static final int m23850a(int i, int i2) {
        return i >= i2 ? i2 : i2 - m23851a(i2, i, 1);
    }
}
