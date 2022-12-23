package com.ogury.p245ed.internal;

import com.ogury.p245ed.internal.C8486nh;

/* renamed from: com.ogury.ed.internal.nk */
class C8490nk extends C8489nj {
    /* renamed from: a */
    public static final int m23918a(int i) {
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* renamed from: b */
    public static final int m23920b(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: a */
    public static final C8486nh m23919a(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new C8486nh(i, i2 - 1);
        }
        C8486nh.C8487a aVar = C8486nh.f21710b;
        return C8486nh.C8487a.m23917a();
    }

    /* renamed from: c */
    public static final int m23921c(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i2 + " is less than minimum 0.");
        } else if (i < 0) {
            return 0;
        } else {
            return i > i2 ? i2 : i;
        }
    }
}
