package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzcjg implements zzdqx<String> {
    final /* synthetic */ zzciz zzgal;

    zzcjg(zzciz zzciz) {
        this.zzgal = zzciz;
    }

    public final void zzb(Throwable th) {
        synchronized (this) {
            boolean unused = this.zzgal.zzfzy = true;
            this.zzgal.zza("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (zzq.zzld().elapsedRealtime() - this.zzgal.zzfzz));
            this.zzgal.zzgaa.setException(new Exception());
        }
    }

    public final /* synthetic */ void onSuccess(@Nullable Object obj) {
        String str = (String) obj;
        synchronized (this) {
            boolean unused = this.zzgal.zzfzy = true;
            this.zzgal.zza("com.google.android.gms.ads.MobileAds", true, "", (int) (zzq.zzld().elapsedRealtime() - this.zzgal.zzfzz));
            this.zzgal.executor.execute(new zzcjj(this, str));
        }
    }
}
