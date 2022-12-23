package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.p085a.C3711a;
import com.google.android.p085a.C3712b;
import com.google.android.p085a.C3713c;

public interface IGetInstallReferrerService extends IInterface {

    public static abstract class Stub extends C3712b implements IGetInstallReferrerService {

        public static class Proxy extends C3711a implements IGetInstallReferrerService {
            Proxy(IBinder iBinder) {
                super(iBinder);
            }

            /* renamed from: c */
            public final Bundle mo23163c(Bundle bundle) throws RemoteException {
                Parcel a = mo19693a();
                C3713c.m9222b(a, bundle);
                Parcel b = mo19695b(a);
                Bundle bundle2 = (Bundle) C3713c.m9221a(b, Bundle.CREATOR);
                b.recycle();
                return bundle2;
            }
        }

        /* renamed from: b */
        public static IGetInstallReferrerService m9257b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof IGetInstallReferrerService) {
                return (IGetInstallReferrerService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo19696a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            Bundle c = mo23163c((Bundle) C3713c.m9221a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            C3713c.m9223c(parcel2, c);
            return true;
        }
    }

    /* renamed from: c */
    Bundle mo23163c(Bundle bundle) throws RemoteException;
}
