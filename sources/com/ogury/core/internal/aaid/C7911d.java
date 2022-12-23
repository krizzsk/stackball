package com.ogury.core.internal.aaid;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.ogury.core.internal.C7921ai;

/* renamed from: com.ogury.core.internal.aaid.d */
/* compiled from: AdvertisingInterface.kt */
public final class C7911d implements IInterface {

    /* renamed from: a */
    private final IBinder f20684a;

    /* renamed from: b */
    private final String f20685b;

    public C7911d(IBinder iBinder, String str) {
        C7921ai.m22144b(iBinder, "binder");
        C7921ai.m22144b(str, "descriptor");
        this.f20684a = iBinder;
        this.f20685b = str;
    }

    /* renamed from: a */
    public final String mo52889a() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        C7921ai.m22142a((Object) obtain, "Parcel.obtain()");
        Parcel obtain2 = Parcel.obtain();
        C7921ai.m22142a((Object) obtain2, "Parcel.obtain()");
        try {
            obtain.writeInterfaceToken(this.f20685b);
            this.f20684a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            if (readString == null) {
                readString = "";
            }
            return readString;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f20684a;
    }

    /* renamed from: a */
    public final boolean mo52890a(boolean z) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        C7921ai.m22142a((Object) obtain, "Parcel.obtain()");
        Parcel obtain2 = Parcel.obtain();
        C7921ai.m22142a((Object) obtain2, "Parcel.obtain()");
        try {
            obtain.writeInterfaceToken(this.f20685b);
            boolean z2 = true;
            obtain.writeInt(1);
            this.f20684a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z2 = false;
            }
            return z2;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
