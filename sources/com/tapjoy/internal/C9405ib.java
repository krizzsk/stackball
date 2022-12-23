package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.ib */
public final class C9405ib {

    /* renamed from: a */
    public float f23324a;

    /* renamed from: b */
    public int f23325b;

    /* renamed from: a */
    public static C9405ib m25243a(String str) {
        if (C9465jq.m25449c(str)) {
            return null;
        }
        try {
            C9405ib ibVar = new C9405ib();
            int length = str.length() - 1;
            char charAt = str.charAt(length);
            if (charAt == 'w') {
                ibVar.f23324a = Float.valueOf(str.substring(0, length)).floatValue();
                ibVar.f23325b = 1;
            } else if (charAt == 'h') {
                ibVar.f23324a = Float.valueOf(str.substring(0, length)).floatValue();
                ibVar.f23325b = 2;
            } else {
                ibVar.f23324a = Float.valueOf(str).floatValue();
                ibVar.f23325b = 0;
            }
            return ibVar;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final float mo58334a(float f, float f2) {
        int i = this.f23325b;
        if (i == 1) {
            return (this.f23324a * f) / 100.0f;
        }
        if (i == 2) {
            return (this.f23324a * f2) / 100.0f;
        }
        return this.f23324a;
    }
}
