package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p025b.C1368b;
import com.applovin.impl.sdk.utils.C1554p;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.d */
public class C1389d implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private C1554p f3272a;

    /* renamed from: b */
    private final Object f3273b = new Object();

    /* renamed from: c */
    private final C1469j f3274c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final WeakReference<C1391a> f3275d;

    /* renamed from: e */
    private long f3276e;

    /* renamed from: com.applovin.impl.sdk.d$a */
    public interface C1391a {
        void onAdRefresh();
    }

    public C1389d(C1469j jVar, C1391a aVar) {
        this.f3275d = new WeakReference<>(aVar);
        this.f3274c = jVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m2768h() {
        synchronized (this.f3273b) {
            this.f3272a = null;
            if (!((Boolean) this.f3274c.mo13088a(C1368b.f2843v)).booleanValue()) {
                this.f3274c.mo13108ae().unregisterReceiver(this);
            }
        }
    }

    /* renamed from: i */
    private void m2769i() {
        if (((Boolean) this.f3274c.mo13088a(C1368b.f2842u)).booleanValue()) {
            mo12939d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2770j() {
        /*
            r4 = this;
            com.applovin.impl.sdk.j r0 = r4.f3274c
            com.applovin.impl.sdk.b.c<java.lang.Boolean> r1 = com.applovin.impl.sdk.p025b.C1368b.f2842u
            java.lang.Object r0 = r0.mo13088a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r4.f3273b
            monitor-enter(r0)
            com.applovin.impl.sdk.j r1 = r4.f3274c     // Catch:{ all -> 0x0039 }
            com.applovin.impl.sdk.v r1 = r1.mo13084X()     // Catch:{ all -> 0x0039 }
            boolean r1 = r1.mo13378a()     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x002e
            com.applovin.impl.sdk.j r1 = r4.f3274c     // Catch:{ all -> 0x0039 }
            com.applovin.impl.sdk.q r1 = r1.mo13139v()     // Catch:{ all -> 0x0039 }
            java.lang.String r2 = "AdRefreshManager"
            java.lang.String r3 = "Waiting for the application to enter foreground to resume the timer."
            r1.mo13277b(r2, r3)     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return
        L_0x002e:
            com.applovin.impl.sdk.utils.p r1 = r4.f3272a     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0037
            com.applovin.impl.sdk.utils.p r1 = r4.f3272a     // Catch:{ all -> 0x0039 }
            r1.mo13346c()     // Catch:{ all -> 0x0039 }
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            goto L_0x003c
        L_0x0039:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r1
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1389d.m2770j():void");
    }

    /* renamed from: a */
    public void mo12935a(long j) {
        synchronized (this.f3273b) {
            mo12938c();
            this.f3276e = j;
            this.f3272a = C1554p.m3559a(j, this.f3274c, new Runnable() {
                public void run() {
                    C1389d.this.m2768h();
                    C1391a aVar = (C1391a) C1389d.this.f3275d.get();
                    if (aVar != null) {
                        aVar.onAdRefresh();
                    }
                }
            });
            if (!((Boolean) this.f3274c.mo13088a(C1368b.f2843v)).booleanValue()) {
                this.f3274c.mo13108ae().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
                this.f3274c.mo13108ae().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
                this.f3274c.mo13108ae().registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                this.f3274c.mo13108ae().registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
            }
            if (((Boolean) this.f3274c.mo13088a(C1368b.f2842u)).booleanValue() && (this.f3274c.mo13085Y().mo13270b() || this.f3274c.mo13084X().mo13378a())) {
                this.f3272a.mo13345b();
            }
        }
    }

    /* renamed from: a */
    public boolean mo12936a() {
        boolean z;
        synchronized (this.f3273b) {
            z = this.f3272a != null;
        }
        return z;
    }

    /* renamed from: b */
    public long mo12937b() {
        long a;
        synchronized (this.f3273b) {
            a = this.f3272a != null ? this.f3272a.mo13344a() : -1;
        }
        return a;
    }

    /* renamed from: c */
    public void mo12938c() {
        synchronized (this.f3273b) {
            if (this.f3272a != null) {
                this.f3272a.mo13347d();
                m2768h();
            }
        }
    }

    /* renamed from: d */
    public void mo12939d() {
        synchronized (this.f3273b) {
            if (this.f3272a != null) {
                this.f3272a.mo13345b();
            }
        }
    }

    /* renamed from: e */
    public void mo12940e() {
        synchronized (this.f3273b) {
            if (this.f3272a != null) {
                this.f3272a.mo13346c();
            }
        }
    }

    /* renamed from: f */
    public void mo12941f() {
        if (((Boolean) this.f3274c.mo13088a(C1368b.f2841t)).booleanValue()) {
            mo12939d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        r0 = (com.applovin.impl.sdk.C1389d.C1391a) r9.f3275d.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        r0.onAdRefresh();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12942g() {
        /*
            r9 = this;
            com.applovin.impl.sdk.j r0 = r9.f3274c
            com.applovin.impl.sdk.b.c<java.lang.Boolean> r1 = com.applovin.impl.sdk.p025b.C1368b.f2841t
            java.lang.Object r0 = r0.mo13088a(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r9.f3273b
            monitor-enter(r0)
            com.applovin.impl.sdk.j r1 = r9.f3274c     // Catch:{ all -> 0x006e }
            com.applovin.impl.sdk.p r1 = r1.mo13085Y()     // Catch:{ all -> 0x006e }
            boolean r1 = r1.mo13270b()     // Catch:{ all -> 0x006e }
            if (r1 == 0) goto L_0x002e
            com.applovin.impl.sdk.j r1 = r9.f3274c     // Catch:{ all -> 0x006e }
            com.applovin.impl.sdk.q r1 = r1.mo13139v()     // Catch:{ all -> 0x006e }
            java.lang.String r2 = "AdRefreshManager"
            java.lang.String r3 = "Waiting for the full screen ad to be dismissed to resume the timer."
            r1.mo13277b(r2, r3)     // Catch:{ all -> 0x006e }
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            return
        L_0x002e:
            com.applovin.impl.sdk.utils.p r1 = r9.f3272a     // Catch:{ all -> 0x006e }
            r2 = 0
            if (r1 == 0) goto L_0x005d
            long r3 = r9.f3276e     // Catch:{ all -> 0x006e }
            long r5 = r9.mo12937b()     // Catch:{ all -> 0x006e }
            long r3 = r3 - r5
            com.applovin.impl.sdk.j r1 = r9.f3274c     // Catch:{ all -> 0x006e }
            com.applovin.impl.sdk.b.c<java.lang.Long> r5 = com.applovin.impl.sdk.p025b.C1368b.f2840s     // Catch:{ all -> 0x006e }
            java.lang.Object r1 = r1.mo13088a(r5)     // Catch:{ all -> 0x006e }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x006e }
            long r5 = r1.longValue()     // Catch:{ all -> 0x006e }
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x0058
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0058
            r9.mo12938c()     // Catch:{ all -> 0x006e }
            r1 = 1
            r2 = 1
            goto L_0x005d
        L_0x0058:
            com.applovin.impl.sdk.utils.p r1 = r9.f3272a     // Catch:{ all -> 0x006e }
            r1.mo13346c()     // Catch:{ all -> 0x006e }
        L_0x005d:
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            if (r2 == 0) goto L_0x0071
            java.lang.ref.WeakReference<com.applovin.impl.sdk.d$a> r0 = r9.f3275d
            java.lang.Object r0 = r0.get()
            com.applovin.impl.sdk.d$a r0 = (com.applovin.impl.sdk.C1389d.C1391a) r0
            if (r0 == 0) goto L_0x0071
            r0.onAdRefresh()
            goto L_0x0071
        L_0x006e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            throw r1
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1389d.mo12942g():void");
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            mo12941f();
        } else if ("com.applovin.application_resumed".equals(action)) {
            mo12942g();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            m2769i();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            m2770j();
        }
    }
}
