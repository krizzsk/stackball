package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads-base@@19.1.0 */
final class zzeab {
    private final ConcurrentHashMap<zzeae, List<Throwable>> zzhsl = new ConcurrentHashMap<>(16, 0.75f, 10);
    private final ReferenceQueue<Throwable> zzhsm = new ReferenceQueue<>();

    zzeab() {
    }

    public final List<Throwable> zza(Throwable th, boolean z) {
        Reference<? extends Throwable> poll = this.zzhsm.poll();
        while (poll != null) {
            this.zzhsl.remove(poll);
            poll = this.zzhsm.poll();
        }
        List<Throwable> list = this.zzhsl.get(new zzeae(th, (ReferenceQueue<Throwable>) null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.zzhsl.putIfAbsent(new zzeae(th, this.zzhsm), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
