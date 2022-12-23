package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzcxa implements zzdak<zzcwx> {
    private final zzdrh zzfur;
    private final Context zzvf;

    public zzcxa(zzdrh zzdrh, Context context) {
        this.zzfur = zzdrh;
        this.zzvf = context;
    }

    public final zzdri<zzcwx> zzaqa() {
        return this.zzfur.zzd(new zzcwz(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcwx zzaqf() throws Exception {
        double d;
        Intent registerReceiver = this.zzvf.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            d = ((double) registerReceiver.getIntExtra("level", -1)) / ((double) registerReceiver.getIntExtra("scale", -1));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
        } else {
            d = -1.0d;
        }
        return new zzcwx(d, z);
    }
}
