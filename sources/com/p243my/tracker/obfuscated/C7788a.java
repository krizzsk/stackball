package com.p243my.tracker.obfuscated;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.tracker.obfuscated.a */
public final class C7788a {

    /* renamed from: a */
    final Map<Activity, Boolean> f19792a = new WeakHashMap();

    /* renamed from: b */
    final Handler f19793b = C7806d.f19851a;

    /* renamed from: c */
    final AtomicBoolean f19794c = new AtomicBoolean();

    /* renamed from: d */
    final C7828m f19795d;

    /* renamed from: e */
    final C7880v0 f19796e;

    /* renamed from: f */
    final C7868r0 f19797f;

    /* renamed from: g */
    final Application f19798g;

    /* renamed from: h */
    final Runnable f19799h;

    /* renamed from: i */
    final Runnable f19800i;

    /* renamed from: j */
    final Runnable f19801j;

    /* renamed from: k */
    long f19802k = 0;

    /* renamed from: l */
    long f19803l = 0;

    /* renamed from: com.my.tracker.obfuscated.a$b */
    private final class C7790b implements Application.ActivityLifecycleCallbacks {
        private C7790b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            C7788a.this.m21041a(activity);
        }

        public void onActivityStopped(Activity activity) {
            C7788a.this.mo52161c(activity);
        }
    }

    private C7788a(C7828m mVar, C7880v0 v0Var, C7868r0 r0Var, Application application) {
        this.f19795d = mVar;
        this.f19796e = v0Var;
        this.f19797f = r0Var;
        this.f19798g = application;
        this.f19799h = new Runnable() {
            public final void run() {
                C7788a.this.m21042b();
            }
        };
        this.f19800i = new Runnable() {
            public final void run() {
                C7788a.this.m21043c();
            }
        };
        this.f19801j = new Runnable() {
            public final void run() {
                C7788a.this.m21044d();
            }
        };
    }

    /* renamed from: a */
    public static C7788a m21040a(C7828m mVar, C7880v0 v0Var, C7868r0 r0Var, Application application) {
        return new C7788a(mVar, v0Var, r0Var, application);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m21042b() {
        if (this.f19794c.get()) {
            mo52164f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m21043c() {
        mo52159a(C7875t0.m21541a((long) this.f19796e.mo52533d()));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m21044d() {
        C7823k0.m21211a((Context) this.f19798g).mo52312c(C7875t0.m21542b(this.f19802k));
    }

    /* renamed from: a */
    public void mo52158a() {
        this.f19798g.registerActivityLifecycleCallbacks(new C7790b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52159a(long j) {
        this.f19793b.removeCallbacks(this.f19799h);
        this.f19794c.set(true);
        this.f19793b.postDelayed(this.f19799h, j);
        this.f19803l = System.currentTimeMillis() + j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void m21041a(Activity activity) {
        if (this.f19792a.put(activity, Boolean.TRUE) == null && this.f19792a.size() <= 1) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f19802k >= C7875t0.m21541a((long) this.f19796e.mo52541h())) {
                this.f19797f.mo52499c();
                if (this.f19796e.mo52548o()) {
                    this.f19795d.mo52376g();
                    mo52159a(C7875t0.m21541a((long) this.f19796e.mo52533d()));
                    return;
                }
            }
            long j = this.f19803l - currentTimeMillis;
            if (j > 0) {
                mo52159a(j);
            } else {
                mo52164f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo52161c(Activity activity) {
        if (this.f19792a.remove(activity) != null && this.f19792a.isEmpty()) {
            this.f19794c.set(false);
            this.f19793b.removeCallbacks(this.f19799h);
            this.f19802k = System.currentTimeMillis();
            C7806d.m21130a(this.f19801j);
        }
    }

    /* renamed from: d */
    public void mo52162d(Activity activity) {
        C7806d.m21132c(new Runnable(activity) {
            public final /* synthetic */ Activity f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C7788a.this.m21041a(this.f$1);
            }
        });
    }

    /* renamed from: e */
    public void mo52163e() {
        if (this.f19794c.get()) {
            C7806d.m21132c(this.f19800i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo52164f() {
        C7877u0.m21547a("ActivityHandler: timer tick for buffering period");
        this.f19795d.mo52348a();
        mo52163e();
    }
}
