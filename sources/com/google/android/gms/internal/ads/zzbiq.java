package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzbiq implements zzdgf {
    private final /* synthetic */ zzbhw zzewb;
    private Context zzfbl;
    private String zzfbm;

    private zzbiq(zzbhw zzbhw) {
        this.zzewb = zzbhw;
    }

    public final zzdgg zzaft() {
        zzehf.zza(this.zzfbl, Context.class);
        return new zzbip(this.zzewb, this.zzfbl, this.zzfbm);
    }

    public final /* synthetic */ zzdgf zzfu(String str) {
        this.zzfbm = str;
        return this;
    }

    public final /* synthetic */ zzdgf zzbw(Context context) {
        this.zzfbl = (Context) zzehf.checkNotNull(context);
        return this;
    }
}
