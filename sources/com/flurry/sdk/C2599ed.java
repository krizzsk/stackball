package com.flurry.sdk;

import android.app.Activity;
import android.content.Context;
import com.flurry.sdk.C2595eb;
import com.flurry.sdk.C2597ec;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.flurry.sdk.ed */
public class C2599ed {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f6093b = C2599ed.class.getSimpleName();

    /* renamed from: c */
    private static C2599ed f6094c;

    /* renamed from: a */
    public long f6095a = 0;

    /* renamed from: d */
    private final Map<Context, C2595eb> f6096d = new WeakHashMap();

    /* renamed from: e */
    private final C2608ee f6097e = new C2608ee();

    /* renamed from: f */
    private final Object f6098f = new Object();

    /* renamed from: g */
    private C2595eb f6099g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f6100h;

    /* renamed from: i */
    private AtomicBoolean f6101i = new AtomicBoolean(false);

    /* renamed from: j */
    private C2510cv<C2610ef> f6102j = new C2510cv<C2610ef>() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo17521a(C2509cu cuVar) {
            C2599ed.this.m5652h();
        }
    };

    /* renamed from: k */
    private C2510cv<C2497cn> f6103k = new C2510cv<C2497cn>() {
        /* renamed from: a */
        public final /* synthetic */ void mo17521a(C2509cu cuVar) {
            C2497cn cnVar = (C2497cn) cuVar;
            Activity activity = (Activity) cnVar.f5842a.get();
            if (activity == null) {
                C2530db.m5476a(C2599ed.f6093b, "Activity has been destroyed, can't pass ActivityLifecycleEvent to adobject.");
                return;
            }
            int i = C26078.f6117a[cnVar.f5843b - 1];
            if (i == 1) {
                String g = C2599ed.f6093b;
                C2530db.m5474a(3, g, "Automatic onStartSession for context:" + cnVar.f5842a);
                C2599ed.this.m5650e(activity);
            } else if (i == 2) {
                String g2 = C2599ed.f6093b;
                C2530db.m5474a(3, g2, "Automatic onEndSession for context:" + cnVar.f5842a);
                C2599ed.this.mo17810d(activity);
            } else if (i == 3) {
                String g3 = C2599ed.f6093b;
                C2530db.m5474a(3, g3, "Automatic onEndSession (destroyed) for context:" + cnVar.f5842a);
                C2599ed.this.mo17810d(activity);
            }
        }
    };

    /* renamed from: com.flurry.sdk.ed$8 */
    static /* synthetic */ class C26078 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6117a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
        static {
            /*
                int[] r0 = com.flurry.sdk.C2497cn.C2498a.m5388a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6117a = r0
                r1 = 1
                int r2 = com.flurry.sdk.C2497cn.C2498a.f5848e     // Catch:{ NoSuchFieldError -> 0x000f }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                int[] r0 = f6117a     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = com.flurry.sdk.C2497cn.C2498a.f5849f     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = r2 - r1
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r0 = f6117a     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = com.flurry.sdk.C2497cn.C2498a.f5845b     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = r2 - r1
                r1 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C2599ed.C26078.<clinit>():void");
        }
    }

    private C2599ed() {
        C2511cw.m5419a().mo17723a("com.flurry.android.sdk.ActivityLifecycleEvent", this.f6103k);
        C2511cw.m5419a().mo17723a("com.flurry.android.sdk.FlurrySessionTimerEvent", this.f6102j);
    }

    /* renamed from: a */
    public static synchronized C2599ed m5642a() {
        C2599ed edVar;
        synchronized (C2599ed.class) {
            if (f6094c == null) {
                f6094c = new C2599ed();
            }
            edVar = f6094c;
        }
        return edVar;
    }

    /* renamed from: b */
    public static synchronized void m5647b() {
        synchronized (C2599ed.class) {
            if (f6094c != null) {
                C2511cw.m5419a().mo17722a((C2510cv<?>) f6094c.f6102j);
                C2511cw.m5419a().mo17722a((C2510cv<?>) f6094c.f6103k);
            }
            f6094c = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo17803a(Context context) {
        if (context instanceof Activity) {
            if (C2499co.m5389a().mo17689c()) {
                C2530db.m5474a(3, f6093b, "bootstrap for context:".concat(String.valueOf(context)));
                m5650e(context);
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo17806b(Context context) {
        mo17805a(context, false, false);
    }

    /* renamed from: a */
    public final synchronized void mo17805a(Context context, boolean z, boolean z2) {
        if (!C2499co.m5389a().mo17689c() || !(context instanceof Activity)) {
            if (z && z2) {
                this.f6100h = z2;
            }
            C2530db.m5474a(3, f6093b, "Manual onStartSession for context:".concat(String.valueOf(context)));
            m5643a(context, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public synchronized void m5650e(Context context) {
        m5643a(context, false);
    }

    /* renamed from: a */
    private synchronized void m5643a(final Context context, boolean z) {
        C2595eb ebVar;
        if (mo17813f() != null && mo17813f().mo17798a() && z) {
            if (!this.f6097e.mo17816a()) {
                C2530db.m5474a(3, f6093b, "A background session has already started. Not storing in context map because we use application context only.");
                return;
            }
            C2530db.m5474a(3, f6093b, "Returning from a paused background session.");
        }
        if (mo17813f() == null || mo17813f().mo17798a() || !z) {
            boolean z2 = true;
            if (mo17813f() != null && mo17813f().mo17798a() && !z) {
                C2530db.m5476a(f6093b, "New session started while background session is running.  Ending background session, then will create foreground session.");
                this.f6101i.set(true);
                m5648b(C2494ck.m5371a().f5832a, true);
                C2494ck.m5371a().mo17685b(new Runnable() {
                    public final void run() {
                        C2599ed.this.m5650e(context);
                    }
                });
            } else if (this.f6096d.get(context) == null) {
                this.f6097e.mo17817b();
                final C2595eb f = mo17813f();
                if (f == null) {
                    if (z) {
                        ebVar = new C2594ea();
                    } else {
                        ebVar = new C2595eb();
                    }
                    f = ebVar;
                    f.mo17800a(C2595eb.C2596a.f6080b);
                    C2530db.m5490e(f6093b, "Flurry session started for context:".concat(String.valueOf(context)));
                    C2597ec ecVar = new C2597ec();
                    ecVar.f6083a = new WeakReference<>(context);
                    ecVar.f6084b = f;
                    ecVar.f6085d = C2597ec.C2598a.f6087a;
                    ecVar.mo17720b();
                } else {
                    z2 = false;
                }
                this.f6096d.put(context, f);
                synchronized (this.f6098f) {
                    this.f6099g = f;
                }
                this.f6101i.set(false);
                C2530db.m5490e(f6093b, "Flurry session resumed for context:".concat(String.valueOf(context)));
                C2597ec ecVar2 = new C2597ec();
                ecVar2.f6083a = new WeakReference<>(context);
                ecVar2.f6084b = f;
                ecVar2.f6085d = C2597ec.C2598a.f6088b;
                ecVar2.mo17720b();
                if (z2) {
                    C2494ck.m5371a().mo17685b(new C2621eo() {
                        /* renamed from: a */
                        public final void mo17573a() {
                            f.mo17800a(C2595eb.C2596a.f6081c);
                            C2597ec ecVar = new C2597ec();
                            ecVar.f6083a = new WeakReference<>(context);
                            ecVar.f6084b = f;
                            ecVar.f6085d = C2597ec.C2598a.f6091e;
                            ecVar.mo17720b();
                        }
                    });
                }
                this.f6095a = 0;
            } else if (C2499co.m5389a().mo17689c()) {
                C2530db.m5474a(3, f6093b, "Session already started with context:".concat(String.valueOf(context)));
            } else {
                C2530db.m5490e(f6093b, "Session already started with context:".concat(String.valueOf(context)));
            }
        } else {
            C2530db.m5476a(f6093b, "A Flurry background session can't be started while a foreground session is running.");
        }
    }

    /* renamed from: a */
    public final synchronized void mo17804a(final Context context, final String str) {
        for (Context b : new ArrayList(this.f6096d.keySet())) {
            m5648b(b, true);
        }
        C2494ck.m5371a().mo17685b(new C2621eo() {
            /* renamed from: a */
            public final void mo17573a() {
                C2599ed.this.m5650e(context);
                C2449bq.m5261a();
                C2449bq.m5263a(str);
            }
        });
    }

    /* renamed from: c */
    public final synchronized void mo17809c(Context context) {
        mo17807b(context, false, false);
    }

    /* renamed from: b */
    public final synchronized void mo17807b(Context context, boolean z, boolean z2) {
        if (C2499co.m5389a().mo17689c() && (context instanceof Activity)) {
            return;
        }
        if (mo17813f() == null || mo17813f().mo17798a() || !z) {
            if (z) {
                if (this.f6100h && !z2) {
                    return;
                }
            }
            C2530db.m5474a(3, f6093b, "Manual onEndSession for context:".concat(String.valueOf(context)));
            mo17810d(context);
            return;
        }
        C2530db.m5476a(f6093b, "No background session running, can't end session.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo17810d(Context context) {
        m5648b(context, false);
    }

    /* renamed from: b */
    private synchronized void m5648b(Context context, boolean z) {
        C2595eb remove = this.f6096d.remove(context);
        if (z && mo17813f() != null && mo17813f().mo17798a() && this.f6097e.mo17816a()) {
            m5652h();
        } else if (remove != null) {
            C2530db.m5490e(f6093b, "Flurry session paused for context:".concat(String.valueOf(context)));
            C2597ec ecVar = new C2597ec();
            ecVar.f6083a = new WeakReference<>(context);
            ecVar.f6084b = remove;
            C2449bq.m5261a();
            ecVar.f6086e = C2449bq.m5266d();
            ecVar.f6085d = C2597ec.C2598a.f6089c;
            ecVar.mo17720b();
            if (m5653i() == 0) {
                if (z) {
                    m5652h();
                } else {
                    this.f6097e.mo17815a(remove.mo17799b());
                }
                this.f6095a = System.currentTimeMillis();
                return;
            }
            this.f6095a = 0;
        } else if (C2499co.m5389a().mo17689c()) {
            C2530db.m5474a(3, f6093b, "Session cannot be ended, session not found for context:".concat(String.valueOf(context)));
        } else {
            C2530db.m5490e(f6093b, "Session cannot be ended, session not found for context:".concat(String.valueOf(context)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public synchronized void m5652h() {
        int i = m5653i();
        if (i > 0) {
            C2530db.m5474a(5, f6093b, "Session cannot be finalized, sessionContextCount:".concat(String.valueOf(i)));
            return;
        }
        final C2595eb f = mo17813f();
        if (f == null) {
            C2530db.m5474a(5, f6093b, "Session cannot be finalized, current session not found");
            return;
        }
        String str = f6093b;
        StringBuilder sb = new StringBuilder("Flurry ");
        sb.append(f.mo17798a() ? "background" : "");
        sb.append(" session ended");
        C2530db.m5490e(str, sb.toString());
        C2597ec ecVar = new C2597ec();
        ecVar.f6084b = f;
        ecVar.f6085d = C2597ec.C2598a.f6090d;
        C2449bq.m5261a();
        ecVar.f6086e = C2449bq.m5266d();
        ecVar.mo17720b();
        C2494ck.m5371a().mo17685b(new C2621eo() {
            /* renamed from: a */
            public final void mo17573a() {
                C2599ed.m5646a(C2599ed.this, f);
                boolean unused = C2599ed.this.f6100h = false;
            }
        });
    }

    /* renamed from: c */
    public final synchronized void mo17808c() {
        for (Map.Entry next : this.f6096d.entrySet()) {
            C2597ec ecVar = new C2597ec();
            ecVar.f6083a = new WeakReference<>(next.getKey());
            ecVar.f6084b = (C2595eb) next.getValue();
            ecVar.f6085d = C2597ec.C2598a.f6089c;
            C2449bq.m5261a();
            ecVar.f6086e = C2449bq.m5266d();
            ecVar.mo17720b();
        }
        this.f6096d.clear();
        C2494ck.m5371a().mo17685b(new C2621eo() {
            /* renamed from: a */
            public final void mo17573a() {
                C2599ed.this.m5652h();
            }
        });
    }

    /* renamed from: i */
    private synchronized int m5653i() {
        return this.f6096d.size();
    }

    /* renamed from: d */
    public final synchronized boolean mo17811d() {
        if (mo17813f() != null) {
            return true;
        }
        C2530db.m5474a(2, f6093b, "Session not found. No active session");
        return false;
    }

    /* renamed from: e */
    public final synchronized int mo17812e() {
        if (this.f6101i.get()) {
            return C2595eb.C2596a.f6080b;
        }
        C2595eb f = mo17813f();
        if (f == null) {
            C2530db.m5474a(2, f6093b, "Session not found. No active session");
            return C2595eb.C2596a.f6079a;
        }
        return f.mo17801c();
    }

    /* renamed from: f */
    public final C2595eb mo17813f() {
        C2595eb ebVar;
        synchronized (this.f6098f) {
            ebVar = this.f6099g;
        }
        return ebVar;
    }

    /* renamed from: a */
    static /* synthetic */ void m5646a(C2599ed edVar, C2595eb ebVar) {
        synchronized (edVar.f6098f) {
            if (edVar.f6099g == ebVar) {
                C2595eb ebVar2 = edVar.f6099g;
                C2611eg.m5674a().mo17822b("ContinueSessionMillis", ebVar2);
                ebVar2.mo17800a(C2595eb.C2596a.f6079a);
                edVar.f6099g = null;
            }
        }
    }
}
