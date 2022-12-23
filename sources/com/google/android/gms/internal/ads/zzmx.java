package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzmx {
    public final int length;
    private int zzahb;
    private final zzhf[] zzbda;

    public zzmx(zzhf... zzhfArr) {
        zzoh.checkState(zzhfArr.length > 0);
        this.zzbda = zzhfArr;
        this.length = zzhfArr.length;
    }

    public final zzhf zzax(int i) {
        return this.zzbda[i];
    }

    public final int zzh(zzhf zzhf) {
        int i = 0;
        while (true) {
            zzhf[] zzhfArr = this.zzbda;
            if (i >= zzhfArr.length) {
                return -1;
            }
            if (zzhf == zzhfArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final int hashCode() {
        if (this.zzahb == 0) {
            this.zzahb = Arrays.hashCode(this.zzbda) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.zzahb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzmx zzmx = (zzmx) obj;
            return this.length == zzmx.length && Arrays.equals(this.zzbda, zzmx.zzbda);
        }
    }
}
