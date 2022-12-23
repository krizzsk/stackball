package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqd;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
abstract class zzdqi<V, C> extends zzdqd<V, C> {
    private List<zzdod<V>> zzhho;

    zzdqi(zzdot<? extends zzdri<? extends V>> zzdot, boolean z) {
        super(zzdot, true, true);
        List<zzdod<V>> list;
        if (zzdot.isEmpty()) {
            list = zzdou.zzavy();
        } else {
            list = zzdpc.zzej(zzdot.size());
        }
        this.zzhho = list;
        for (int i = 0; i < zzdot.size(); i++) {
            this.zzhho.add((Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract C zzi(List<zzdod<V>> list);

    /* access modifiers changed from: package-private */
    public final void zzb(int i, @NullableDecl V v) {
        List<zzdod<V>> list = this.zzhho;
        if (list != null) {
            list.set(i, zzdod.zzz(v));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzawj() {
        List<zzdod<V>> list = this.zzhho;
        if (list != null) {
            set(zzi(list));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzdqd.zza zza) {
        super.zza(zza);
        this.zzhho = null;
    }
}
