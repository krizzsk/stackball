package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final /* synthetic */ class zzauv implements zzavk {
    private final String zzdcd;
    private final Bundle zzdtb;

    zzauv(String str, Bundle bundle) {
        this.zzdcd = str;
        this.zzdtb = bundle;
    }

    public final void zza(zzbgr zzbgr) {
        zzbgr.logEvent("am", this.zzdcd, this.zzdtb);
    }
}
