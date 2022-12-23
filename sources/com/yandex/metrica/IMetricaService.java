package com.yandex.metrica;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IMetricaService extends IInterface {
    /* renamed from: a */
    void mo60833a(int i, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo60834a(Bundle bundle) throws RemoteException;

    /* renamed from: b */
    void mo60835b(Bundle bundle) throws RemoteException;

    void reportData(Bundle bundle) throws RemoteException;

    /* renamed from: com.yandex.metrica.IMetricaService$a */
    public static abstract class C10020a extends Binder implements IMetricaService {

        /* renamed from: a */
        public static final /* synthetic */ int f24022a = 0;

        public C10020a() {
            attachInterface(this, "com.yandex.metrica.IMetricaService");
        }

        /* renamed from: a */
        public static IMetricaService m25815a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.yandex.metrica.IMetricaService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IMetricaService)) {
                return new C10021a(iBinder);
            }
            return (IMetricaService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: android.os.Bundle} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 1
                java.lang.String r1 = "com.yandex.metrica.IMetricaService"
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r2) goto L_0x00ae
                r2 = 0
                if (r5 == r0) goto L_0x0088
                r3 = 2
                if (r5 == r3) goto L_0x006e
                r3 = 3
                if (r5 == r3) goto L_0x0054
                r3 = 4
                if (r5 == r3) goto L_0x003a
                r3 = 5
                if (r5 == r3) goto L_0x001c
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x001c:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                int r7 = r6.readInt()
                if (r7 == 0) goto L_0x0032
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r7.createFromParcel(r6)
                r2 = r6
                android.os.Bundle r2 = (android.os.Bundle) r2
            L_0x0032:
                com.yandex.metrica.impl.ob.y1 r6 = com.yandex.metrica.MetricaService.f24024c
                r6.mo61078a(r5, r2)
                return r0
            L_0x003a:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x004c
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r2 = r5
                android.os.Bundle r2 = (android.os.Bundle) r2
            L_0x004c:
                com.yandex.metrica.impl.ob.y1 r5 = com.yandex.metrica.MetricaService.f24024c
                r5.mo61082a((android.os.Bundle) r2)
                return r0
            L_0x0054:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0066
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r2 = r5
                android.os.Bundle r2 = (android.os.Bundle) r2
            L_0x0066:
                com.yandex.metrica.impl.ob.y1 r5 = com.yandex.metrica.MetricaService.f24024c
                r5.mo61088b(r2)
                return r0
            L_0x006e:
                r6.enforceInterface(r1)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0080
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r2 = r5
                android.os.Bundle r2 = (android.os.Bundle) r2
            L_0x0080:
                com.yandex.metrica.impl.ob.y1 r5 = com.yandex.metrica.MetricaService.f24024c
                r5.reportData(r2)
                return r0
            L_0x0088:
                r6.enforceInterface(r1)
                java.lang.String r5 = r6.readString()
                int r7 = r6.readInt()
                java.lang.String r8 = r6.readString()
                int r1 = r6.readInt()
                if (r1 == 0) goto L_0x00a6
                android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r1.createFromParcel(r6)
                r2 = r6
                android.os.Bundle r2 = (android.os.Bundle) r2
            L_0x00a6:
                com.yandex.metrica.impl.ob.y1 r6 = com.yandex.metrica.MetricaService.f24024c
                r6.mo61085a(r5, r7, r8, r2)
                return r0
            L_0x00ae:
                r7.writeString(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.IMetricaService.C10020a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        /* renamed from: com.yandex.metrica.IMetricaService$a$a */
        private static class C10021a implements IMetricaService {

            /* renamed from: a */
            private IBinder f24023a;

            C10021a(IBinder iBinder) {
                this.f24023a = iBinder;
            }

            /* renamed from: a */
            public void mo60834a(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (!this.f24023a.transact(4, obtain, (Parcel) null, 1)) {
                        int i = C10020a.f24022a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f24023a;
            }

            /* renamed from: b */
            public void mo60835b(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (!this.f24023a.transact(3, obtain, (Parcel) null, 1)) {
                        int i = C10020a.f24022a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void reportData(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    if (!this.f24023a.transact(2, obtain, (Parcel) null, 1)) {
                        int i = C10020a.f24022a;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public void mo60833a(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.yandex.metrica.IMetricaService");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f24023a.transact(5, obtain, (Parcel) null, 1)) {
                        int i2 = C10020a.f24022a;
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
