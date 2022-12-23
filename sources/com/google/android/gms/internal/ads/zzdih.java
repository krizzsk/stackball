package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzdih {
    private zzdik zzgvu = null;
    private zzdik zzgvv = null;
    private zzdik zzgvw = null;
    private zzdik zzgvx = null;
    private zzdik zzgvy = null;
    private zzdik zzgvz = null;
    private zzdik zzgwa = null;
    private zzdik zzgwb = null;

    public final void zza(zzdik zzdik) {
        this.zzgvx = zzdik;
    }

    public final void onAdClosed() {
        zzdik zzdik = this.zzgvx;
        if (zzdik != null) {
            zzdik.execute();
        }
    }
}
