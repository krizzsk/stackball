package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final /* synthetic */ class zzbko implements Runnable {
    private final zzbek zzelg;
    private final JSONObject zzfhd;

    zzbko(zzbek zzbek, JSONObject jSONObject) {
        this.zzelg = zzbek;
        this.zzfhd = jSONObject;
    }

    public final void run() {
        this.zzelg.zza("AFMA_updateActiveView", this.zzfhd);
    }
}
