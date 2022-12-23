package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
final class zzecz extends zzecy {
    private zzecz() {
        super();
    }

    /* access modifiers changed from: package-private */
    public final <L> List<L> zza(Object obj, long j) {
        zzecl zzc = zzc(obj, j);
        if (zzc.zzbci()) {
            return zzc;
        }
        int size = zzc.size();
        zzecl zzfn = zzc.zzfn(size == 0 ? 10 : size << 1);
        zzefi.zza(obj, j, (Object) zzfn);
        return zzfn;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j) {
        zzc(obj, j).zzbcj();
    }

    /* access modifiers changed from: package-private */
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzecl zzc = zzc(obj, j);
        zzecl zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzc.zzbci()) {
                zzc = zzc.zzfn(size2 + size);
            }
            zzc.addAll(zzc2);
        }
        if (size > 0) {
            zzc2 = zzc;
        }
        zzefi.zza(obj, j, (Object) zzc2);
    }

    private static <E> zzecl<E> zzc(Object obj, long j) {
        return (zzecl) zzefi.zzp(obj, j);
    }
}
