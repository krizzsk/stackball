package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final /* synthetic */ class zzblb implements Runnable {
    private final JSONObject zzfhd;
    private final zzbky zzfie;

    zzblb(zzbky zzbky, JSONObject jSONObject) {
        this.zzfie = zzbky;
        this.zzfhd = jSONObject;
    }

    public final void run() {
        this.zzfie.zzi(this.zzfhd);
    }
}
