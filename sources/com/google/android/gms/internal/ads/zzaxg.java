package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzaxg extends BroadcastReceiver {
    private final /* synthetic */ zzaxa zzdwj;

    private zzaxg(zzaxa zzaxa) {
        this.zzdwj = zzaxa;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            boolean unused = this.zzdwj.zzyg = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            boolean unused2 = this.zzdwj.zzyg = false;
        }
    }

    /* synthetic */ zzaxg(zzaxa zzaxa, zzaxc zzaxc) {
        this(zzaxa);
    }
}
