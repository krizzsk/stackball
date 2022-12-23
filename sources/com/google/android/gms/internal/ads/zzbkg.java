package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzbkg {
    /* access modifiers changed from: private */
    public final Executor executor;
    private final String zzbnc;
    private final zzaku zzfgq;
    /* access modifiers changed from: private */
    public zzbkp zzfgr;
    private final zzaga<Object> zzfgs = new zzbkj(this);
    private final zzaga<Object> zzfgt = new zzbkl(this);

    public zzbkg(String str, zzaku zzaku, Executor executor2) {
        this.zzbnc = str;
        this.zzfgq = zzaku;
        this.executor = executor2;
    }

    public final void zza(zzbkp zzbkp) {
        this.zzfgq.zzc("/updateActiveView", this.zzfgs);
        this.zzfgq.zzc("/untrackActiveViewUnit", this.zzfgt);
        this.zzfgr = zzbkp;
    }

    public final void zzd(zzbek zzbek) {
        zzbek.zza("/updateActiveView", (zzaga<? super zzbek>) this.zzfgs);
        zzbek.zza("/untrackActiveViewUnit", (zzaga<? super zzbek>) this.zzfgt);
    }

    public final void zze(zzbek zzbek) {
        zzbek.zzb("/updateActiveView", this.zzfgs);
        zzbek.zzb("/untrackActiveViewUnit", this.zzfgt);
    }

    public final void zzagl() {
        this.zzfgq.zzd("/updateActiveView", this.zzfgs);
        this.zzfgq.zzd("/untrackActiveViewUnit", this.zzfgt);
    }

    /* access modifiers changed from: private */
    public final boolean zzm(Map<String, String> map) {
        if (map == null) {
            return false;
        }
        String str = map.get("hashCode");
        if (TextUtils.isEmpty(str) || !str.equals(this.zzbnc)) {
            return false;
        }
        return true;
    }
}
