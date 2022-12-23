package com.google.android.p085a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.a.a */
/* compiled from: BaseProxy */
public class C3711a implements IInterface {

    /* renamed from: a */
    private final IBinder f10036a;

    /* renamed from: b */
    private final String f10037b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    protected C3711a(IBinder iBinder) {
        this.f10036a = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo19693a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f10037b);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f10036a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Parcel mo19695b(Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f10036a.transact(1, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
