package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzbov implements zzdqx<Void> {
    private final /* synthetic */ zzboq zzflt;

    zzbov(zzboq zzboq) {
        this.zzflt = zzboq;
    }

    public final void zzb(Throwable th) {
        this.zzflt.zzflp.zzbh(false);
    }

    public final /* synthetic */ void onSuccess(@NullableDecl Object obj) {
        Void voidR = (Void) obj;
        this.zzflt.zzflp.zzbh(true);
    }
}
