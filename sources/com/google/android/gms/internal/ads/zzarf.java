package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
public final class zzarf extends zzgi implements zzard {
    zzarf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    public final void zzb(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, (Parcelable) parcelFileDescriptor);
        zza(1, obtainAndWriteInterfaceToken);
    }

    public final void zza(zzaye zzaye) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzgj.zza(obtainAndWriteInterfaceToken, (Parcelable) zzaye);
        zza(2, obtainAndWriteInterfaceToken);
    }
}
