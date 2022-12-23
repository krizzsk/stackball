package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzaop implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzaom zzdii;

    zzaop(zzaom zzaom) {
        this.zzdii = zzaom;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent createIntent = this.zzdii.createIntent();
        zzq.zzkw();
        zzaxa.zza(this.zzdii.zzvf, createIntent);
    }
}
