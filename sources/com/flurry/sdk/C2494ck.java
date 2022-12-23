package com.flurry.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;

/* renamed from: com.flurry.sdk.ck */
public class C2494ck {

    /* renamed from: c */
    private static final String f5829c = C2494ck.class.getSimpleName();

    /* renamed from: d */
    private static C2494ck f5830d;

    /* renamed from: i */
    private static boolean f5831i = false;

    /* renamed from: a */
    public final Context f5832a;

    /* renamed from: b */
    public final String f5833b;

    /* renamed from: e */
    private final Handler f5834e = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    private final Handler f5835f;

    /* renamed from: g */
    private final HandlerThread f5836g;

    /* renamed from: h */
    private final C2533de f5837h;

    private C2494ck(Context context, String str) {
        this.f5832a = context.getApplicationContext();
        HandlerThread handlerThread = new HandlerThread("FlurryAgent");
        this.f5836g = handlerThread;
        handlerThread.start();
        this.f5835f = new Handler(this.f5836g.getLooper());
        this.f5833b = str;
        this.f5837h = new C2533de();
    }

    /* renamed from: a */
    public static C2494ck m5371a() {
        return f5830d;
    }

    /* renamed from: a */
    public static synchronized void m5372a(Context context, String str) {
        synchronized (C2494ck.class) {
            if (f5830d != null) {
                if (f5830d.f5833b.equals(str)) {
                    C2530db.m5490e(f5829c, "Flurry is already initialized");
                    return;
                }
                throw new IllegalStateException("Only one API key per application is supported!");
            } else if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            } else if (!TextUtils.isEmpty(str)) {
                C2494ck ckVar = new C2494ck(context, str);
                f5830d = ckVar;
                ckVar.f5837h.mo17747a(context);
            } else {
                throw new IllegalArgumentException("API key must be specified");
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m5374b() {
        synchronized (C2494ck.class) {
            if (f5830d != null) {
                C2494ck ckVar = f5830d;
                C2648fd.m5753b();
                ckVar.f5837h.mo17749b();
                ckVar.f5836g.quit();
                f5830d = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo17683a(Runnable runnable) {
        this.f5834e.post(runnable);
    }

    /* renamed from: b */
    public final void mo17685b(Runnable runnable) {
        this.f5835f.post(runnable);
    }

    /* renamed from: a */
    public final void mo17684a(Runnable runnable, long j) {
        if (runnable != null) {
            this.f5835f.postDelayed(runnable, j);
        }
    }

    /* renamed from: c */
    public final void mo17686c(Runnable runnable) {
        if (runnable != null) {
            this.f5835f.removeCallbacks(runnable);
        }
    }

    /* renamed from: a */
    public final C2534df mo17682a(Class<? extends C2534df> cls) {
        return this.f5837h.mo17748b(cls);
    }

    /* renamed from: a */
    public static synchronized void m5373a(boolean z) {
        synchronized (C2494ck.class) {
            f5831i = z;
        }
    }

    /* renamed from: c */
    public static synchronized boolean m5375c() {
        boolean z;
        synchronized (C2494ck.class) {
            z = f5831i;
        }
        return z;
    }
}
