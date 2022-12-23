package com.p243my.target;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.my.target.f0 */
public abstract class C7395f0 {

    /* renamed from: a */
    public static final Executor f18555a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    public static final Executor f18556b = Executors.newSingleThreadExecutor();

    /* renamed from: c */
    public static final Executor f18557c = new C7396a();

    /* renamed from: d */
    public static final Handler f18558d = new Handler(Looper.getMainLooper());

    /* renamed from: com.my.target.f0$a */
    public static class C7396a implements Executor {
        public void execute(Runnable runnable) {
            C7395f0.f18558d.post(runnable);
        }
    }

    /* renamed from: a */
    public static void m19086a(Runnable runnable) {
        f18555a.execute(runnable);
    }

    /* renamed from: a */
    public static void m19087a(Runnable runnable, int i) {
        f18558d.postDelayed(runnable, (long) i);
    }

    /* renamed from: b */
    public static void m19088b(Runnable runnable) {
        f18556b.execute(runnable);
    }

    /* renamed from: b */
    public static boolean m19089b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: c */
    public static void m19090c(Runnable runnable) {
        f18557c.execute(runnable);
    }
}
