package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzctt {
    /* access modifiers changed from: private */
    public zzxg zzacv;
    /* access modifiers changed from: private */
    public boolean zzaef = false;
    private final String zzbsc;
    private final zzctx<zzbns> zzgka;

    public zzctt(zzctx<zzbns> zzctx, String str) {
        this.zzgka = zzctx;
        this.zzbsc = str;
    }

    public final synchronized boolean isLoading() throws RemoteException {
        return this.zzgka.isLoading();
    }

    public final synchronized void zza(zzuj zzuj, int i) throws RemoteException {
        this.zzacv = null;
        this.zzaef = this.zzgka.zza(zzuj, this.zzbsc, new zzcty(i), new zzcts(this));
    }

    public final synchronized String getMediationAdapterClassName() {
        try {
            if (this.zzacv == null) {
                return null;
            }
            return this.zzacv.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzawr.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final synchronized String zzkh() {
        try {
            if (this.zzacv == null) {
                return null;
            }
            return this.zzacv.getMediationAdapterClassName();
        } catch (RemoteException e) {
            zzawr.zze("#007 Could not call remote method.", e);
            return null;
        }
    }
}
