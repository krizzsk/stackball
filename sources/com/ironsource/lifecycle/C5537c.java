package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import com.ironsource.lifecycle.C5534a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ironsource.lifecycle.c */
public final class C5537c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    static AtomicBoolean f12751a = new AtomicBoolean(false);

    /* renamed from: k */
    private static C5537c f12752k = new C5537c();

    /* renamed from: b */
    Handler f12753b;

    /* renamed from: c */
    int f12754c = 0;

    /* renamed from: d */
    int f12755d = 0;

    /* renamed from: e */
    boolean f12756e = true;

    /* renamed from: f */
    boolean f12757f = true;

    /* renamed from: g */
    int f12758g = C5540d.f12765a;

    /* renamed from: h */
    List<C5536b> f12759h = new CopyOnWriteArrayList();

    /* renamed from: i */
    Runnable f12760i = new Runnable() {
        public final void run() {
            C5537c.m13195a(C5537c.this);
            C5537c.this.m13197c();
        }
    };

    /* renamed from: j */
    private String f12761j = "IronsourceLifecycleManager";

    /* renamed from: l */
    private C5534a.C5535a f12762l = new C5534a.C5535a() {
        /* renamed from: a */
        public final void mo41265a(Activity activity) {
            C5537c cVar = C5537c.this;
            cVar.f12754c++;
            if (cVar.f12754c == 1 && cVar.f12757f) {
                for (C5536b a : cVar.f12759h) {
                    a.mo41267a();
                }
                cVar.f12757f = false;
                cVar.f12758g = C5540d.f12766b;
            }
        }

        /* renamed from: b */
        public final void mo41266b(Activity activity) {
            C5537c cVar = C5537c.this;
            cVar.f12755d++;
            if (cVar.f12755d != 1) {
                return;
            }
            if (cVar.f12756e) {
                Iterator<C5536b> it = cVar.f12759h.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                cVar.f12756e = false;
                cVar.f12758g = C5540d.f12767c;
                return;
            }
            cVar.f12753b.removeCallbacks(cVar.f12760i);
        }
    };

    /* renamed from: a */
    public static C5537c m13194a() {
        return f12752k;
    }

    /* renamed from: a */
    static /* synthetic */ void m13195a(C5537c cVar) {
        if (cVar.f12755d == 0) {
            cVar.f12756e = true;
            Iterator<C5536b> it = cVar.f12759h.iterator();
            while (it.hasNext()) {
                it.next();
            }
            cVar.f12758g = C5540d.f12768d;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m13197c() {
        if (this.f12754c == 0 && this.f12756e) {
            for (C5536b b : this.f12759h) {
                b.mo41268b();
            }
            this.f12757f = true;
            this.f12758g = C5540d.f12769e;
        }
    }

    /* renamed from: b */
    public final boolean mo41269b() {
        return this.f12758g == C5540d.f12769e;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C5534a.m13189b(activity);
        C5534a a = C5534a.m13188a(activity);
        if (a != null) {
            a.f12750a = this.f12762l;
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        int i = this.f12755d - 1;
        this.f12755d = i;
        if (i == 0) {
            this.f12753b.postDelayed(this.f12760i, 700);
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
        this.f12754c--;
        m13197c();
    }
}
