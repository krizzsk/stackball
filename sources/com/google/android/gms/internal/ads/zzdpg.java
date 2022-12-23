package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
final class zzdpg<K, V> extends zzdpb<Map.Entry<K, V>> {
    /* access modifiers changed from: private */
    public final transient int size;
    private final transient zzdoy<K, V> zzhfs;
    /* access modifiers changed from: private */
    public final transient Object[] zzhft;
    private final transient int zzhfu = 0;

    zzdpg(zzdoy<K, V> zzdoy, Object[] objArr, int i, int i2) {
        this.zzhfs = zzdoy;
        this.zzhft = objArr;
        this.size = i2;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzavx() {
        return true;
    }

    public final zzdpp<Map.Entry<K, V>> zzavs() {
        return (zzdpp) zzavw().iterator();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        return zzavw().zza(objArr, i);
    }

    /* access modifiers changed from: package-private */
    public final zzdou<Map.Entry<K, V>> zzawe() {
        return new zzdpj(this);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.zzhfs.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int size() {
        return this.size;
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
