package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.yandex.mobile.ads.impl.va */
public final class C14877va {

    /* renamed from: a */
    public final int f41220a;

    /* renamed from: b */
    public final float f41221b;

    public C14877va(int i, float f) {
        this.f41220a = i;
        this.f41221b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14877va.class != obj.getClass()) {
            return false;
        }
        C14877va vaVar = (C14877va) obj;
        if (this.f41220a == vaVar.f41220a && Float.compare(vaVar.f41221b, this.f41221b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f41220a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToIntBits(this.f41221b);
    }
}
