package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzys extends zzati {
    public final String getMediationAdapterClassName() throws RemoteException {
        return "";
    }

    public final boolean isLoaded() throws RemoteException {
        return false;
    }

    public final void zza(IObjectWrapper iObjectWrapper, boolean z) {
    }

    public final void zza(zzatk zzatk) throws RemoteException {
    }

    public final void zza(zzats zzats) throws RemoteException {
    }

    public final void zza(zzaua zzaua) {
    }

    public final void zza(zzxa zzxa) throws RemoteException {
    }

    public final void zza(zzxf zzxf) {
    }

    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    public final zzxg zzki() {
        return null;
    }

    public final zzate zzqt() {
        return null;
    }

    public final void zza(zzuj zzuj, zzatn zzatn) throws RemoteException {
        zza(zzatn);
    }

    public final void zzb(zzuj zzuj, zzatn zzatn) throws RemoteException {
        zza(zzatn);
    }

    public final Bundle getAdMetadata() throws RemoteException {
        return new Bundle();
    }

    private static void zza(zzatn zzatn) {
        zzazw.zzfa("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzazm.zzzn.post(new zzyv(zzatn));
    }
}
