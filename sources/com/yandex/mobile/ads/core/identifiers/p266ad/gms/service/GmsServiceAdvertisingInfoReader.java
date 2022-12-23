package com.yandex.mobile.ads.core.identifiers.p266ad.gms.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.yandex.mobile.ads.core.identifiers.ad.gms.service.GmsServiceAdvertisingInfoReader */
class GmsServiceAdvertisingInfoReader implements C12139a, IInterface {

    /* renamed from: a */
    private final IBinder f29440a;

    GmsServiceAdvertisingInfoReader(IBinder iBinder) {
        this.f29440a = iBinder;
    }

    public IBinder asBinder() {
        return this.f29440a;
    }

    public Boolean readAdTrackingLimited() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            boolean z = true;
            obtain.writeInt(1);
            this.f29440a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            obtain2.recycle();
            obtain.recycle();
            return valueOf;
        } catch (Throwable unused) {
            obtain2.recycle();
            obtain.recycle();
            return null;
        }
    }

    public String readAdvertisingId() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            this.f29440a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (Throwable unused) {
            obtain2.recycle();
            obtain.recycle();
            return null;
        }
    }
}
