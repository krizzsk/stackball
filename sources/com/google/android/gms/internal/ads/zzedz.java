package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
final class zzedz {
    private static final zzedz zziaw = new zzedz();
    private final zzeej zziax = new zzedb();
    private final ConcurrentMap<Class<?>, zzeek<?>> zziay = new ConcurrentHashMap();

    public static zzedz zzbgk() {
        return zziaw;
    }

    public final <T> zzeek<T> zzh(Class<T> cls) {
        zzecg.zza(cls, "messageType");
        zzeek<T> zzeek = (zzeek) this.zziay.get(cls);
        if (zzeek != null) {
            return zzeek;
        }
        zzeek<T> zzg = this.zziax.zzg(cls);
        zzecg.zza(cls, "messageType");
        zzecg.zza(zzg, "schema");
        zzeek<T> putIfAbsent = this.zziay.putIfAbsent(cls, zzg);
        return putIfAbsent != null ? putIfAbsent : zzg;
    }

    public final <T> zzeek<T> zzax(T t) {
        return zzh(t.getClass());
    }

    private zzedz() {
    }
}
