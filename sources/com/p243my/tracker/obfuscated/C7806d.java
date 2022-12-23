package com.p243my.tracker.obfuscated;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.my.tracker.obfuscated.d */
public class C7806d {

    /* renamed from: a */
    public static final Handler f19851a;

    /* renamed from: b */
    public static final Executor f19852b = Executors.newSingleThreadExecutor();

    /* renamed from: c */
    public static final Executor f19853c = Executors.newSingleThreadExecutor();

    /* renamed from: d */
    private static final Executor f19854d;

    static {
        Handler handler = new Handler(Looper.getMainLooper());
        f19851a = handler;
        f19854d = new Executor(handler) {
            public final /* synthetic */ Handler f$0;

            {
                this.f$0 = r1;
            }

            public final void execute(Runnable runnable) {
                this.f$0.post(runnable);
            }
        };
    }

    /* renamed from: a */
    public static void m21130a(Runnable runnable) {
        f19852b.execute(runnable);
    }

    /* renamed from: b */
    public static void m21131b(Runnable runnable) {
        f19853c.execute(runnable);
    }

    /* renamed from: c */
    public static void m21132c(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            f19854d.execute(runnable);
        }
    }
}
