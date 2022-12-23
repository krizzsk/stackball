package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zznl {
    public final int length;
    private int zzahb;
    private final zznj[] zzbfe;

    public zznl(zznj... zznjArr) {
        this.zzbfe = zznjArr;
        this.length = zznjArr.length;
    }

    public final zznj zzba(int i) {
        return this.zzbfe[i];
    }

    public final zznj[] zzil() {
        return (zznj[]) this.zzbfe.clone();
    }

    public final int hashCode() {
        if (this.zzahb == 0) {
            this.zzahb = Arrays.hashCode(this.zzbfe) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.zzahb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzbfe, ((zznl) obj).zzbfe);
    }
}
