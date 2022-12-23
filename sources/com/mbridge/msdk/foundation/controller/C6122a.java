package com.mbridge.msdk.foundation.controller;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C6129a;
import com.mbridge.msdk.foundation.tools.C6349m;
import com.mbridge.msdk.foundation.tools.C6368w;
import com.mbridge.msdk.foundation.tools.C6369x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.controller.a */
/* compiled from: MBSDKContext */
public class C6122a {

    /* renamed from: a */
    public static final String f15130a = C6122a.class.getSimpleName();

    /* renamed from: b */
    public static List<String> f15131b = new ArrayList();

    /* renamed from: c */
    private static C6122a f15132c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Context f15133d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f15134e;

    /* renamed from: f */
    private String f15135f;

    /* renamed from: g */
    private int f15136g = 0;

    /* renamed from: h */
    private JSONObject f15137h;

    /* renamed from: i */
    private int f15138i;

    /* renamed from: j */
    private boolean f15139j = false;

    /* renamed from: k */
    private int f15140k;

    /* renamed from: l */
    private String f15141l;

    /* renamed from: com.mbridge.msdk.foundation.controller.a$b */
    /* compiled from: MBSDKContext */
    public interface C6128b {
    }

    /* renamed from: a */
    public final void mo42885a(int i) {
        this.f15138i = i;
    }

    /* renamed from: a */
    public final String mo42884a() {
        try {
            if (this.f15133d != null) {
                return this.f15133d.getPackageName();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo42888a(String str) {
        try {
            this.f15141l = str;
            if (!TextUtils.isEmpty(str) && this.f15133d != null) {
                C6368w.m16233a(this.f15133d, "applicationIds", str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private C6122a() {
    }

    /* renamed from: b */
    public static synchronized C6122a m15302b() {
        C6122a aVar;
        synchronized (C6122a.class) {
            if (f15132c == null) {
                f15132c = new C6122a();
            }
            aVar = f15132c;
        }
        return aVar;
    }

    /* renamed from: c */
    public final int mo42892c() {
        return this.f15140k;
    }

    /* renamed from: b */
    public final void mo42890b(int i) {
        this.f15140k = i;
    }

    /* renamed from: a */
    public final void mo42887a(C6128b bVar, final Handler handler) {
        if (!this.f15139j) {
            try {
                JSONObject jSONObject = new JSONObject();
                this.f15137h = jSONObject;
                jSONObject.put("webgl", 0);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            try {
                Object b = C6368w.m16234b(this.f15133d, "ga_id", "-1");
                if (b != null && (b instanceof String)) {
                    String str = (String) b;
                    if (C6369x.m16236b(str) && !"-1".equals(str) && C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                        C6349m.m16094a(str);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            new Thread(new Runnable() {
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0031 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0052 */
                /* JADX WARNING: Removed duplicated region for block: B:12:0x0064 A[Catch:{ Exception -> 0x007c }] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r2 = this;
                        com.mbridge.msdk.foundation.controller.authoritycontroller.a r0 = com.mbridge.msdk.foundation.controller.authoritycontroller.C6129a.m15330a()
                        java.lang.String r1 = "authority_device_id"
                        boolean r0 = r0.mo42922a((java.lang.String) r1)
                        if (r0 == 0) goto L_0x0052
                        java.lang.String r0 = "com.google.android.gms.ads.identifier.AdvertisingIdClient"
                        java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C6122a.this     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        android.content.Context r0 = r0.f15133d     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r0)     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        java.lang.String r1 = r0.getId()     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        com.mbridge.msdk.foundation.tools.C6349m.m16094a((java.lang.String) r1)     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C6122a.this     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        java.lang.String r0 = r0.getId()     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        com.mbridge.msdk.foundation.controller.C6122a.m15301a((com.mbridge.msdk.foundation.controller.C6122a) r1, (java.lang.String) r0)     // Catch:{ Exception -> 0x0031, all -> 0x002c }
                        goto L_0x0052
                    L_0x002c:
                        r0 = move-exception
                        r0.printStackTrace()
                        goto L_0x0052
                    L_0x0031:
                        com.mbridge.msdk.foundation.controller.a$a r0 = new com.mbridge.msdk.foundation.controller.a$a     // Catch:{ Exception -> 0x0052 }
                        com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C6122a.this     // Catch:{ Exception -> 0x0052 }
                        r0.<init>()     // Catch:{ Exception -> 0x0052 }
                        com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C6122a.this     // Catch:{ Exception -> 0x0052 }
                        android.content.Context r1 = r1.f15133d     // Catch:{ Exception -> 0x0052 }
                        com.mbridge.msdk.foundation.controller.a$a$a r0 = r0.mo42901a(r1)     // Catch:{ Exception -> 0x0052 }
                        java.lang.String r1 = r0.mo42902a()     // Catch:{ Exception -> 0x0052 }
                        com.mbridge.msdk.foundation.tools.C6349m.m16094a((java.lang.String) r1)     // Catch:{ Exception -> 0x0052 }
                        com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C6122a.this     // Catch:{ Exception -> 0x0052 }
                        java.lang.String r0 = r0.mo42902a()     // Catch:{ Exception -> 0x0052 }
                        com.mbridge.msdk.foundation.controller.C6122a.m15301a((com.mbridge.msdk.foundation.controller.C6122a) r1, (java.lang.String) r0)     // Catch:{ Exception -> 0x0052 }
                    L_0x0052:
                        com.mbridge.msdk.b.b r0 = com.mbridge.msdk.p158b.C6076b.m15089a()     // Catch:{ Exception -> 0x007c }
                        com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()     // Catch:{ Exception -> 0x007c }
                        java.lang.String r1 = r1.mo42896e()     // Catch:{ Exception -> 0x007c }
                        com.mbridge.msdk.b.a r0 = r0.mo42749b(r1)     // Catch:{ Exception -> 0x007c }
                        if (r0 != 0) goto L_0x006c
                        com.mbridge.msdk.b.b r0 = com.mbridge.msdk.p158b.C6076b.m15089a()     // Catch:{ Exception -> 0x007c }
                        com.mbridge.msdk.b.a r0 = r0.mo42748b()     // Catch:{ Exception -> 0x007c }
                    L_0x006c:
                        android.os.Message r1 = android.os.Message.obtain()     // Catch:{ Exception -> 0x007c }
                        r1.obj = r0     // Catch:{ Exception -> 0x007c }
                        r0 = 9
                        r1.what = r0     // Catch:{ Exception -> 0x007c }
                        android.os.Handler r0 = r4     // Catch:{ Exception -> 0x007c }
                        r0.sendMessage(r1)     // Catch:{ Exception -> 0x007c }
                        goto L_0x0080
                    L_0x007c:
                        r0 = move-exception
                        r0.printStackTrace()
                    L_0x0080:
                        com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C6122a.this     // Catch:{ Exception -> 0x0099 }
                        android.content.Context r0 = r0.f15133d     // Catch:{ Exception -> 0x0099 }
                        com.mbridge.msdk.foundation.tools.C6349m.m16098b((android.content.Context) r0)     // Catch:{ Exception -> 0x0099 }
                        com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C6122a.this     // Catch:{ Exception -> 0x0099 }
                        android.content.Context r0 = r0.f15133d     // Catch:{ Exception -> 0x0099 }
                        com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C6122a.this     // Catch:{ Exception -> 0x0099 }
                        java.lang.String r1 = r1.f15134e     // Catch:{ Exception -> 0x0099 }
                        com.mbridge.msdk.p158b.C6076b.m15090a((android.content.Context) r0, (java.lang.String) r1)     // Catch:{ Exception -> 0x0099 }
                        goto L_0x009d
                    L_0x0099:
                        r0 = move-exception
                        r0.printStackTrace()
                    L_0x009d:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.controller.C6122a.C61231.run():void");
                }
            }).start();
        }
    }

    /* renamed from: d */
    public final Context mo42895d() {
        return this.f15133d;
    }

    /* renamed from: a */
    public final void mo42886a(Context context) {
        this.f15133d = context;
    }

    /* renamed from: e */
    public final String mo42896e() {
        try {
            if (!TextUtils.isEmpty(this.f15134e)) {
                return this.f15134e;
            }
            if (this.f15133d != null) {
                return (String) C6368w.m16234b(this.f15133d, "sp_appId", "");
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo42891b(String str) {
        try {
            this.f15134e = str;
            if (!TextUtils.isEmpty(str) && this.f15133d != null) {
                C6368w.m16233a(this.f15133d, "sp_appId", str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    public final String mo42897f() {
        if (!TextUtils.isEmpty(this.f15135f)) {
            return this.f15135f;
        }
        Context context = this.f15133d;
        if (context != null) {
            return (String) C6368w.m16234b(context, "sp_appKey", "");
        }
        return null;
    }

    /* renamed from: c */
    public final void mo42894c(String str) {
        try {
            this.f15135f = str;
            if (!TextUtils.isEmpty(str) && this.f15133d != null) {
                C6368w.m16233a(this.f15133d, "sp_appKey", str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.controller.a$a */
    /* compiled from: MBSDKContext */
    public class C6124a {
        public C6124a() {
        }

        /* renamed from: com.mbridge.msdk.foundation.controller.a$a$a */
        /* compiled from: MBSDKContext */
        public final class C6125a {

            /* renamed from: b */
            private final String f15146b;

            /* renamed from: c */
            private final boolean f15147c;

            C6125a(String str, boolean z) {
                this.f15146b = str;
                this.f15147c = z;
            }

            /* renamed from: a */
            public final String mo42902a() {
                return this.f15146b;
            }
        }

        /* renamed from: a */
        public final C6125a mo42901a(Context context) throws Exception {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    C6126b bVar = new C6126b();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    if (context.bindService(intent, bVar, 1)) {
                        try {
                            C6127c cVar = new C6127c(bVar.mo42903a());
                            C6125a aVar = new C6125a(cVar.mo42906a(), cVar.mo42907a(true));
                            context.unbindService(bVar);
                            return aVar;
                        } catch (Exception e) {
                            throw e;
                        } catch (Throwable th) {
                            context.unbindService(bVar);
                            throw th;
                        }
                    } else {
                        throw new IOException("Google Play connection failed");
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                throw new IllegalStateException("Cannot be called from the main thread");
            }
        }

        /* renamed from: com.mbridge.msdk.foundation.controller.a$a$b */
        /* compiled from: MBSDKContext */
        private final class C6126b implements ServiceConnection {

            /* renamed from: a */
            boolean f15148a;

            /* renamed from: c */
            private final LinkedBlockingQueue<IBinder> f15150c;

            public final void onServiceDisconnected(ComponentName componentName) {
            }

            private C6126b() {
                this.f15148a = false;
                this.f15150c = new LinkedBlockingQueue<>(1);
            }

            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                try {
                    this.f15150c.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }

            /* renamed from: a */
            public final IBinder mo42903a() throws InterruptedException {
                if (!this.f15148a) {
                    this.f15148a = true;
                    return this.f15150c.take();
                }
                throw new IllegalStateException();
            }
        }

        /* renamed from: com.mbridge.msdk.foundation.controller.a$a$c */
        /* compiled from: MBSDKContext */
        private final class C6127c implements IInterface {

            /* renamed from: b */
            private IBinder f15152b;

            public C6127c(IBinder iBinder) {
                this.f15152b = iBinder;
            }

            public final IBinder asBinder() {
                return this.f15152b;
            }

            /* JADX INFO: finally extract failed */
            /* renamed from: a */
            public final String mo42906a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.f15152b.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            /* renamed from: a */
            public final boolean mo42907a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                boolean z2 = false;
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    obtain.writeInt(z ? 1 : 0);
                    this.f15152b.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z2 = true;
                    }
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
                obtain2.recycle();
                obtain.recycle();
                return z2;
            }
        }
    }

    /* renamed from: g */
    public final int mo42898g() {
        return this.f15136g;
    }

    /* renamed from: c */
    public final void mo42893c(int i) {
        this.f15136g = i;
    }

    /* renamed from: h */
    public final JSONObject mo42899h() {
        return this.f15137h;
    }

    /* renamed from: a */
    public final void mo42889a(JSONObject jSONObject) {
        this.f15137h = jSONObject;
    }

    /* renamed from: a */
    static /* synthetic */ void m15301a(C6122a aVar, String str) {
        try {
            if (C6369x.m16236b(str)) {
                C6368w.m16233a(aVar.f15133d, "ga_id", str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
