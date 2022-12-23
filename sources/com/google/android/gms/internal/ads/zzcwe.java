package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzcwe implements zzdah<Bundle> {
    private final zzut zzgmd;

    public zzcwe(zzut zzut) {
        this.zzgmd = zzut;
    }

    public final /* synthetic */ void zzs(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzut zzut = this.zzgmd;
        if (zzut == null) {
            return;
        }
        if (zzut.orientation == 1) {
            bundle.putString("avo", "p");
        } else if (this.zzgmd.orientation == 2) {
            bundle.putString("avo", "l");
        }
    }
}
