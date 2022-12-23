package com.flurry.sdk;

import java.lang.Thread;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.flurry.sdk.ew */
public final class C2632ew {

    /* renamed from: c */
    private static C2632ew f6188c;

    /* renamed from: a */
    final Thread.UncaughtExceptionHandler f6189a = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: b */
    final Map<Thread.UncaughtExceptionHandler, Void> f6190b = new WeakHashMap();

    private C2632ew() {
        Thread.setDefaultUncaughtExceptionHandler(new C2633a(this, (byte) 0));
    }

    /* renamed from: a */
    public static synchronized C2632ew m5731a() {
        C2632ew ewVar;
        synchronized (C2632ew.class) {
            if (f6188c == null) {
                f6188c = new C2632ew();
            }
            ewVar = f6188c;
        }
        return ewVar;
    }

    /* renamed from: b */
    public static synchronized void m5732b() {
        synchronized (C2632ew.class) {
            if (f6188c != null) {
                Thread.setDefaultUncaughtExceptionHandler(f6188c.f6189a);
            }
            f6188c = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Set<Thread.UncaughtExceptionHandler> mo17834c() {
        Set<Thread.UncaughtExceptionHandler> keySet;
        synchronized (this.f6190b) {
            keySet = this.f6190b.keySet();
        }
        return keySet;
    }

    /* renamed from: com.flurry.sdk.ew$a */
    final class C2633a implements Thread.UncaughtExceptionHandler {
        private C2633a() {
        }

        /* synthetic */ C2633a(C2632ew ewVar, byte b) {
            this();
        }

        public final void uncaughtException(Thread thread, Throwable th) {
            for (Thread.UncaughtExceptionHandler uncaughtException : C2632ew.this.mo17834c()) {
                try {
                    uncaughtException.uncaughtException(thread, th);
                } catch (Throwable unused) {
                }
            }
            C2632ew ewVar = C2632ew.this;
            if (ewVar.f6189a != null) {
                try {
                    ewVar.f6189a.uncaughtException(thread, th);
                } catch (Throwable unused2) {
                }
            }
        }
    }
}
