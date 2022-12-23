package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public interface zzacs extends IInterface {
    int getHeight() throws RemoteException;

    double getScale() throws RemoteException;

    Uri getUri() throws RemoteException;

    int getWidth() throws RemoteException;

    IObjectWrapper zzrv() throws RemoteException;
}
