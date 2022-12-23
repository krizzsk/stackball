package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
final class zzeen implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private Iterator<Map.Entry<K, V>> zzicb;
    private final /* synthetic */ zzeel zzicc;

    private zzeen(zzeel zzeel) {
        this.zzicc = zzeel;
        this.pos = this.zzicc.zzibs.size();
    }

    public final boolean hasNext() {
        int i = this.pos;
        return (i > 0 && i <= this.zzicc.zzibs.size()) || zzbha().hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator<Map.Entry<K, V>> zzbha() {
        if (this.zzicb == null) {
            this.zzicb = this.zzicc.zzibv.entrySet().iterator();
        }
        return this.zzicb;
    }

    public final /* synthetic */ Object next() {
        if (zzbha().hasNext()) {
            return (Map.Entry) zzbha().next();
        }
        List zzb = this.zzicc.zzibs;
        int i = this.pos - 1;
        this.pos = i;
        return (Map.Entry) zzb.get(i);
    }

    /* synthetic */ zzeen(zzeel zzeel, zzeeo zzeeo) {
        this(zzeel);
    }
}
