package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzchy {
    private final Map<String, String> zzcux = new ConcurrentHashMap();
    private final /* synthetic */ zzchz zzfza;

    zzchy(zzchz zzchz) {
        this.zzfza = zzchz;
    }

    /* access modifiers changed from: private */
    public final zzchy zzanx() {
        this.zzcux.putAll(this.zzfza.zzfzb);
        return this;
    }

    public final zzchy zza(zzdgq zzdgq) {
        this.zzcux.put("gqi", zzdgq.zzdoh);
        return this;
    }

    public final zzchy zzc(zzdgo zzdgo) {
        this.zzcux.put("aai", zzdgo.zzdfq);
        return this;
    }

    public final zzchy zzq(String str, String str2) {
        this.zzcux.put(str, str2);
        return this;
    }

    public final void zzany() {
        this.zzfza.executor.execute(new zzcib(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzanz() {
        this.zzfza.zzfyx.zzn(this.zzcux);
    }
}
