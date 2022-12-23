package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public class zzebq {
    private static volatile boolean zzhun = false;
    private static boolean zzhuo = true;
    private static volatile zzebq zzhup;
    private static volatile zzebq zzhuq;
    private static final zzebq zzhur = new zzebq(true);
    private final Map<zza, zzecd.zzd<?, ?>> zzhus;

    public static zzebq zzbec() {
        zzebq zzebq = zzhup;
        if (zzebq == null) {
            synchronized (zzebq.class) {
                zzebq = zzhup;
                if (zzebq == null) {
                    zzebq = zzhur;
                    zzhup = zzebq;
                }
            }
        }
        return zzebq;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    static final class zza {
        private final int number;
        private final Object object;

        zza(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.object) * 65535) + this.number;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            if (this.object == zza.object && this.number == zza.number) {
                return true;
            }
            return false;
        }
    }

    public static zzebq zzbed() {
        Class<zzebq> cls = zzebq.class;
        zzebq zzebq = zzhuq;
        if (zzebq != null) {
            return zzebq;
        }
        synchronized (cls) {
            zzebq zzebq2 = zzhuq;
            if (zzebq2 != null) {
                return zzebq2;
            }
            zzebq zze = zzecc.zze(cls);
            zzhuq = zze;
            return zze;
        }
    }

    public final <ContainingType extends zzedo> zzecd.zzd<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return this.zzhus.get(new zza(containingtype, i));
    }

    zzebq() {
        this.zzhus = new HashMap();
    }

    private zzebq(boolean z) {
        this.zzhus = Collections.emptyMap();
    }
}
