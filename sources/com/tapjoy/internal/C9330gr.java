package com.tapjoy.internal;

import android.app.Activity;
import android.opengl.GLSurfaceView;

/* renamed from: com.tapjoy.internal.gr */
public final class C9330gr {

    /* renamed from: a */
    public static final C9085ba f23071a = new C9085ba() {
        /* renamed from: a */
        public final boolean mo57827a(Runnable runnable) {
            GLSurfaceView gLSurfaceView = (GLSurfaceView) C9330gr.f23073c.mo57896a();
            if (gLSurfaceView == null) {
                return false;
            }
            gLSurfaceView.queueEvent(runnable);
            return true;
        }
    };

    /* renamed from: b */
    private static Activity f23072b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C9117by f23073c = new C9117by();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C9117by f23074d = new C9117by();

    /* renamed from: a */
    static void m25023a(GLSurfaceView gLSurfaceView) {
        f23073c.mo57897a(gLSurfaceView);
        gLSurfaceView.queueEvent(new Runnable() {
            public final void run() {
                C9330gr.f23074d.mo57897a(Thread.currentThread());
            }
        });
    }

    /* renamed from: a */
    public static Activity m25022a() {
        Activity activity = f23072b;
        return activity == null ? C9084b.m24323a() : activity;
    }

    /* renamed from: b */
    public static Thread m25024b() {
        return (Thread) f23074d.mo57896a();
    }
}
