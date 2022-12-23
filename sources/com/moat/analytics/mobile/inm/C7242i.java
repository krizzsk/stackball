package com.moat.analytics.mobile.inm;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.moat.analytics.mobile.inm.i */
class C7242i {

    /* renamed from: a */
    private static final C7242i f18154a = new C7242i();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<C7245j, String> f18155b = new WeakHashMap();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map<C7227b, String> f18156c = new WeakHashMap();

    /* renamed from: d */
    private final ScheduledExecutorService f18157d = Executors.newScheduledThreadPool(1);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ScheduledFuture<?> f18158e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ScheduledFuture<?> f18159f;

    private C7242i() {
    }

    /* renamed from: a */
    static C7242i m18446a() {
        return f18154a;
    }

    /* renamed from: a */
    private void m18448a(final Context context) {
        ScheduledFuture<?> scheduledFuture = this.f18159f;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            C7261p.m18544a(3, "JSUpdateLooper", (Object) this, "Starting metadata reporting loop");
            this.f18159f = this.f18157d.scheduleWithFixedDelay(new Runnable() {
                public void run() {
                    try {
                        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(new Intent("UPDATE_METADATA"));
                        if (C7242i.this.f18155b.isEmpty()) {
                            C7242i.this.f18159f.cancel(true);
                        }
                    } catch (Exception e) {
                        C7252m.m18508a(e);
                    }
                }
            }, 0, 50, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: b */
    private void m18450b(final Context context) {
        ScheduledFuture<?> scheduledFuture = this.f18158e;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            C7261p.m18544a(3, "JSUpdateLooper", (Object) this, "Starting view update loop");
            this.f18158e = this.f18157d.scheduleWithFixedDelay(new Runnable() {
                public void run() {
                    try {
                        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(new Intent("UPDATE_VIEW_INFO"));
                        if (C7242i.this.f18156c.isEmpty()) {
                            C7261p.m18544a(3, "JSUpdateLooper", (Object) C7242i.this, "No more active trackers");
                            C7242i.this.f18158e.cancel(true);
                        }
                    } catch (Exception e) {
                        C7252m.m18508a(e);
                    }
                }
            }, 0, (long) C7276w.m18582a().f18245d, TimeUnit.MILLISECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49383a(Context context, C7227b bVar) {
        if (bVar != null) {
            C7261p.m18544a(3, "JSUpdateLooper", (Object) this, "addActiveTracker" + bVar.hashCode());
            Map<C7227b, String> map = this.f18156c;
            if (map != null && !map.containsKey(bVar)) {
                this.f18156c.put(bVar, "");
                m18450b(context);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49384a(Context context, C7245j jVar) {
        Map<C7245j, String> map = this.f18155b;
        if (map != null && jVar != null) {
            map.put(jVar, "");
            m18448a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49385a(C7227b bVar) {
        if (bVar != null) {
            C7261p.m18544a(3, "JSUpdateLooper", (Object) this, "removeActiveTracker" + bVar.hashCode());
            Map<C7227b, String> map = this.f18156c;
            if (map != null) {
                map.remove(bVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49386a(C7245j jVar) {
        if (jVar != null) {
            C7261p.m18544a(3, "JSUpdateLooper", (Object) this, "removeSetupNeededBridge" + jVar.hashCode());
            Map<C7245j, String> map = this.f18155b;
            if (map != null) {
                map.remove(jVar);
            }
        }
    }
}
