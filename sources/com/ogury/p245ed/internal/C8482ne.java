package com.ogury.p245ed.internal;

/* renamed from: com.ogury.ed.internal.ne */
class C8482ne extends C8481nd {
    /* renamed from: a */
    public static final int m23906a(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
}
