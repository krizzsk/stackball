package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.appsflyer.internal.q */
public final class C1762q {
    C1762q() {
    }

    /* renamed from: Ι */
    public static C1764d m3886(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                C1763c cVar = new C1763c((byte) 0);
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!context.bindService(intent, cVar, 1)) {
                        if (context != null) {
                            context.unbindService(cVar);
                        }
                        throw new IOException("Google Play connection failed");
                    } else if (!cVar.f4220) {
                        cVar.f4220 = true;
                        C1765e eVar = new C1765e(cVar.f4219.take());
                        C1764d dVar = new C1764d(eVar.mo14093(), eVar.mo14092());
                        if (context != null) {
                            context.unbindService(cVar);
                        }
                        return dVar;
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Exception e) {
                    throw e;
                } catch (Throwable th) {
                    if (context != null) {
                        context.unbindService(cVar);
                    }
                    throw th;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }

    /* renamed from: com.appsflyer.internal.q$d */
    public static final class C1764d {

        /* renamed from: ı */
        private final boolean f4221;

        /* renamed from: ǃ */
        public final String f4222;

        C1764d(String str, boolean z) {
            this.f4222 = str;
            this.f4221 = z;
        }

        /* renamed from: Ι */
        public final boolean mo14090() {
            return this.f4221;
        }
    }

    /* renamed from: com.appsflyer.internal.q$c */
    static final class C1763c implements ServiceConnection {

        /* renamed from: ǃ */
        final LinkedBlockingQueue<IBinder> f4219;

        /* renamed from: ɩ */
        boolean f4220;

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        private C1763c() {
            this.f4219 = new LinkedBlockingQueue<>(1);
            this.f4220 = false;
        }

        /* synthetic */ C1763c(byte b) {
            this();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f4219.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* renamed from: com.appsflyer.internal.q$e */
    static final class C1765e implements IInterface {

        /* renamed from: ι */
        private IBinder f4223;

        C1765e(IBinder iBinder) {
            this.f4223 = iBinder;
        }

        public final IBinder asBinder() {
            return this.f4223;
        }

        /* renamed from: Ι */
        public final String mo14093() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f4223.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: ǃ */
        public final boolean mo14092() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f4223.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}
