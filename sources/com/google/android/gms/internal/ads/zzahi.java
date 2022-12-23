package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzahi implements AdapterStatus {
    private final String description;
    private final int zzdbi;
    private final AdapterStatus.State zzdbj;

    public zzahi(AdapterStatus.State state, String str, int i) {
        this.zzdbj = state;
        this.description = str;
        this.zzdbi = i;
    }

    public final AdapterStatus.State getInitializationState() {
        return this.zzdbj;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getLatency() {
        return this.zzdbi;
    }
}
