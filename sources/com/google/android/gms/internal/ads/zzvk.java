package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public abstract class zzvk extends zzgk implements zzvl {
    public zzvk() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        onAdClicked();
        parcel2.writeNoException();
        return true;
    }
}
