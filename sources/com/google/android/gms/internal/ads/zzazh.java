package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzazh extends BroadcastReceiver {
    private final /* synthetic */ zzazi zzdyo;

    zzazh(zzazi zzazi) {
        this.zzdyo = zzazi;
    }

    public final void onReceive(Context context, Intent intent) {
        this.zzdyo.zzc(context, intent);
    }
}
