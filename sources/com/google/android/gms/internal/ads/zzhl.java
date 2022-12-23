package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzhl {
    public static final zzhl zzahe = new zzhl(1.0f, 1.0f);
    public final float zzahf;
    public final float zzahg;
    private final int zzahh;

    public zzhl(float f, float f2) {
        this.zzahf = f;
        this.zzahg = f2;
        this.zzahh = Math.round(f * 1000.0f);
    }

    public final long zzdu(long j) {
        return j * ((long) this.zzahh);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzhl zzhl = (zzhl) obj;
            return this.zzahf == zzhl.zzahf && this.zzahg == zzhl.zzahg;
        }
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzahf) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToRawIntBits(this.zzahg);
    }
}
