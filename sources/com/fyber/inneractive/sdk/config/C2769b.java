package com.fyber.inneractive.sdk.config;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.config.C2792j;
import com.fyber.inneractive.sdk.util.C3640ao;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.fyber.inneractive.sdk.config.b */
public final class C2769b implements C2792j.C2794a {

    /* renamed from: a */
    final AtomicBoolean f6514a = new AtomicBoolean(false);

    /* renamed from: b */
    boolean f6515b = false;

    /* renamed from: c */
    C3640ao f6516c;

    /* renamed from: d */
    final C2814z f6517d;

    /* renamed from: e */
    Handler f6518e;

    /* renamed from: f */
    final C3640ao.C3642b f6519f = new C3640ao.C3642b() {
        /* renamed from: a */
        public final void mo18022a() {
            IAlog.m9034b("onVisibleTimeReached: %s", Long.valueOf(System.currentTimeMillis()));
            C2769b.this.f6515b = true;
        }
    };

    /* renamed from: g */
    private final String f6520g = "session_duration";

    /* renamed from: h */
    private final int f6521h = 30;

    /* renamed from: i */
    private final Application.ActivityLifecycleCallbacks f6522i = new Application.ActivityLifecycleCallbacks() {
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
        }

        public final void onActivityStopped(Activity activity) {
        }

        public final void onActivityResumed(Activity activity) {
            C2769b.this.f6518e.removeMessages(123);
            C2769b bVar = C2769b.this;
            if (bVar.f6514a.compareAndSet(true, false)) {
                if (bVar.f6515b) {
                    IAlog.m9034b("onActivityResumed: restartSession", new Object[0]);
                    bVar.f6515b = false;
                    if (bVar.f6517d != null) {
                        bVar.f6517d.mo18089b();
                        bVar.f6517d.mo18090b("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                        bVar.f6517d.mo18085a();
                    }
                }
                if (bVar.f6516c != null) {
                    bVar.f6516c.mo19566d();
                }
            }
        }

        public final void onActivityPaused(Activity activity) {
            if (!C2769b.this.f6518e.hasMessages(123) && !C2769b.this.f6514a.get()) {
                C2769b.this.f6518e.sendEmptyMessageDelayed(123, 3000);
            }
        }
    };

    C2769b(C2814z zVar) {
        this.f6517d = zVar;
        Application p = C3657l.m9125p();
        if (p != null) {
            p.registerActivityLifecycleCallbacks(this.f6522i);
        }
        this.f6518e = new Handler(Looper.getMainLooper(), new Handler.Callback() {
            public final boolean handleMessage(Message message) {
                if (message.what != 123) {
                    return false;
                }
                C2769b bVar = C2769b.this;
                if (bVar.f6514a.compareAndSet(false, true)) {
                    if (bVar.f6514a.get() && bVar.f6516c != null) {
                        IAlog.m9034b("startCounting", new Object[0]);
                        bVar.f6516c.mo19562a();
                    }
                    IAlog.m9034b("Pause signal", new Object[0]);
                }
                return true;
            }
        });
    }

    public final void onGlobalConfigChanged(C2792j jVar, C2791i iVar) {
        C3640ao aoVar = this.f6516c;
        if (aoVar != null) {
            aoVar.mo19566d();
            C3640ao aoVar2 = new C3640ao(TimeUnit.MINUTES, (long) iVar.mo18046a("session_duration", 30, 1), this.f6516c.f9917c);
            this.f6516c = aoVar2;
            aoVar2.f9916b = this.f6519f;
        }
        jVar.mo18055b(this);
    }
}
