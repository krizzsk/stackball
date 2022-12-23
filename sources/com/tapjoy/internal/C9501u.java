package com.tapjoy.internal;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.tapjoy.internal.u */
public final class C9501u {

    /* renamed from: a */
    private static Handler f23606a;

    /* renamed from: a */
    public static synchronized Handler m25539a() {
        Handler handler;
        synchronized (C9501u.class) {
            if (f23606a == null) {
                f23606a = new Handler(Looper.getMainLooper());
            }
            handler = f23606a;
        }
        return handler;
    }

    /* renamed from: a */
    public static C9085ba m25540a(final Handler handler) {
        return new C9085ba() {
            /* renamed from: a */
            public final boolean mo57827a(Runnable runnable) {
                return handler.post(runnable);
            }
        };
    }
}
