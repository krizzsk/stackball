package com.fyber.inneractive.sdk.player.p059c;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.fyber.inneractive.sdk.player.c.m */
public final class C3296m {

    /* renamed from: a */
    public static final C3296m f8518a = new C3296m(1.0f, 1.0f);

    /* renamed from: b */
    public final float f8519b;

    /* renamed from: c */
    public final float f8520c;

    /* renamed from: d */
    public final int f8521d;

    public C3296m(float f, float f2) {
        this.f8519b = f;
        this.f8520c = f2;
        this.f8521d = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3296m mVar = (C3296m) obj;
            return this.f8519b == mVar.f8519b && this.f8520c == mVar.f8520c;
        }
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f8519b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToRawIntBits(this.f8520c);
    }
}
