package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
final class zzdpj extends zzdou<Map.Entry<K, V>> {
    private final /* synthetic */ zzdpg zzhfx;

    zzdpj(zzdpg zzdpg) {
        this.zzhfx = zzdpg;
    }

    public final boolean zzavx() {
        return true;
    }

    public final int size() {
        return this.zzhfx.size;
    }

    public final /* synthetic */ Object get(int i) {
        zzdoj.zzs(i, this.zzhfx.size);
        int i2 = i * 2;
        return new AbstractMap.SimpleImmutableEntry(this.zzhfx.zzhft[i2], this.zzhfx.zzhft[i2 + 1]);
    }
}
