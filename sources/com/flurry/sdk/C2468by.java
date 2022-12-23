package com.flurry.sdk;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.flurry.sdk.C2497cn;

/* renamed from: com.flurry.sdk.by */
public class C2468by extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f5760a = C2468by.class.getSimpleName();

    /* renamed from: d */
    private static C2468by f5761d;

    /* renamed from: b */
    boolean f5762b;

    /* renamed from: c */
    public boolean f5763c;

    /* renamed from: e */
    private boolean f5764e = false;

    /* renamed from: f */
    private final C2510cv<C2497cn> f5765f = new C2510cv<C2497cn>() {
        /* renamed from: a */
        public final /* synthetic */ void mo17521a(C2509cu cuVar) {
            C2497cn cnVar = (C2497cn) cuVar;
            Activity activity = (Activity) cnVar.f5842a.get();
            if (activity == null) {
                C2530db.m5474a(3, C2468by.f5760a, "Activity has been destroyed, don't update network state.");
            } else if (C24702.f5767a[cnVar.f5843b - 1] == 1) {
                C2468by byVar = C2468by.this;
                byVar.f5763c = byVar.m5320a(activity);
            }
        }
    };

    /* renamed from: com.flurry.sdk.by$2 */
    static /* synthetic */ class C24702 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5767a;

        static {
            int[] iArr = new int[C2497cn.C2498a.m5388a().length];
            f5767a = iArr;
            try {
                iArr[C2497cn.C2498a.f5847d - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private C2468by() {
        boolean z = false;
        Context context = C2494ck.m5371a().f5832a;
        this.f5764e = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 ? true : z;
        this.f5763c = m5320a(context);
        if (this.f5764e) {
            m5323d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m5320a(Context context) {
        if (!this.f5764e || context == null) {
            return true;
        }
        NetworkInfo activeNetworkInfo = m5324e().getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private synchronized void m5323d() {
        if (!this.f5762b) {
            Context context = C2494ck.m5371a().f5832a;
            this.f5763c = m5320a(context);
            context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            C2511cw.m5419a().mo17723a("com.flurry.android.sdk.ActivityLifecycleEvent", this.f5765f);
            this.f5762b = true;
        }
    }

    /* renamed from: e */
    private static ConnectivityManager m5324e() {
        return (ConnectivityManager) C2494ck.m5371a().f5832a.getSystemService("connectivity");
    }

    /* renamed from: a */
    public static synchronized C2468by m5319a() {
        C2468by byVar;
        synchronized (C2468by.class) {
            if (f5761d == null) {
                f5761d = new C2468by();
            }
            byVar = f5761d;
        }
        return byVar;
    }

    /* renamed from: b */
    public static synchronized void m5322b() {
        synchronized (C2468by.class) {
            if (f5761d != null) {
                f5761d.m5325f();
            }
            f5761d = null;
        }
    }

    /* renamed from: f */
    private synchronized void m5325f() {
        if (this.f5762b) {
            C2494ck.m5371a().f5832a.unregisterReceiver(this);
            C2511cw.m5419a().mo17722a((C2510cv<?>) this.f5765f);
            this.f5762b = false;
        }
    }

    public void onReceive(Context context, Intent intent) {
        boolean a = m5320a(context);
        if (this.f5763c != a) {
            this.f5763c = a;
            C2467bx bxVar = new C2467bx();
            bxVar.f5758a = a;
            bxVar.f5759b = mo17662c();
            C2511cw.m5419a().mo17721a((C2509cu) bxVar);
        }
    }

    /* renamed from: c */
    public final int mo17662c() {
        if (!this.f5764e) {
            return C2471a.f5768a;
        }
        NetworkInfo activeNetworkInfo = m5324e().getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return C2471a.f5768a;
        }
        int type = activeNetworkInfo.getType();
        if (type != 0) {
            if (type == 1) {
                return C2471a.f5770c;
            }
            if (!(type == 2 || type == 3 || type == 4 || type == 5)) {
                if (type == 8) {
                    return C2471a.f5768a;
                }
                if (activeNetworkInfo.isConnected()) {
                    return C2471a.f5769b;
                }
                return C2471a.f5768a;
            }
        }
        return C2471a.f5771d;
    }

    /* renamed from: com.flurry.sdk.by$a */
    public enum C2471a {
        ;
        

        /* renamed from: a */
        public static final int f5768a = 1;

        /* renamed from: b */
        public static final int f5769b = 2;

        /* renamed from: c */
        public static final int f5770c = 3;

        /* renamed from: d */
        public static final int f5771d = 4;

        static {
            f5772e = new int[]{1, 2, 3, 4};
        }
    }
}
