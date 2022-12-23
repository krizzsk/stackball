package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzakg {
    private final Object zzddq = new Object();
    private final Object zzddr = new Object();
    private zzakp zzdds;
    private zzakp zzddt;

    public final zzakp zza(Context context, zzazz zzazz) {
        zzakp zzakp;
        synchronized (this.zzddr) {
            if (this.zzddt == null) {
                this.zzddt = new zzakp(zzk(context), zzazz, zzabs.zzcxl.get());
            }
            zzakp = this.zzddt;
        }
        return zzakp;
    }

    public final zzakp zzb(Context context, zzazz zzazz) {
        zzakp zzakp;
        synchronized (this.zzddq) {
            if (this.zzdds == null) {
                this.zzdds = new zzakp(zzk(context), zzazz, (String) zzvj.zzpv().zzd(zzzz.zzciu));
            }
            zzakp = this.zzdds;
        }
        return zzakp;
    }

    private static Context zzk(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
