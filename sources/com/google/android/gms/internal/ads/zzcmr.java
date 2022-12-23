package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
final class zzcmr implements zzdqx<SQLiteDatabase> {
    private final /* synthetic */ zzdkb zzgdf;

    zzcmr(zzcmp zzcmp, zzdkb zzdkb) {
        this.zzgdf = zzdkb;
    }

    public final void zzb(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        zzawr.zzfa(valueOf.length() != 0 ? "Failed to get offline signal database: ".concat(valueOf) : new String("Failed to get offline signal database: "));
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        try {
            this.zzgdf.apply((SQLiteDatabase) obj);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            zzawr.zzfa(valueOf.length() != 0 ? "Error executing function on offline signal database: ".concat(valueOf) : new String("Error executing function on offline signal database: "));
        }
    }
}
