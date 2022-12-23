package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
final class zzdpi<K> extends zzdpb<K> {
    private final transient zzdou<K> zzhfg;
    private final transient zzdoy<K, ?> zzhfs;

    zzdpi(zzdoy<K, ?> zzdoy, zzdou<K> zzdou) {
        this.zzhfs = zzdoy;
        this.zzhfg = zzdou;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzavx() {
        return true;
    }

    public final zzdpp<K> zzavs() {
        return (zzdpp) zzavw().iterator();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        return zzavw().zza(objArr, i);
    }

    public final zzdou<K> zzavw() {
        return this.zzhfg;
    }

    public final boolean contains(@NullableDecl Object obj) {
        return this.zzhfs.get(obj) != null;
    }

    public final int size() {
        return this.zzhfs.size();
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
