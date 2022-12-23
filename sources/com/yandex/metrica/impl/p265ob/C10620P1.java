package com.yandex.metrica.impl.p265ob;

import java.lang.Thread;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.yandex.metrica.impl.ob.P1 */
class C10620P1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: f */
    private static final AtomicBoolean f25389f = new AtomicBoolean();

    /* renamed from: a */
    private final List<C11337i7> f25390a;

    /* renamed from: b */
    private final Thread.UncaughtExceptionHandler f25391b;

    /* renamed from: c */
    private final C10206E3 f25392c;

    /* renamed from: d */
    private final C10348Hm f25393d;

    /* renamed from: e */
    private final C10152C3 f25394e;

    C10620P1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, List<C11337i7> list, C10348Hm hm, C10152C3 c3, C10206E3 e3) {
        this.f25390a = list;
        this.f25391b = uncaughtExceptionHandler;
        this.f25393d = hm;
        this.f25394e = c3;
        this.f25392c = e3;
    }

    /* renamed from: a */
    public static boolean m27192a() {
        return f25389f.get();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        try {
            f25389f.set(true);
            C11189e7 e7Var = new C11189e7(this.f25394e.mo61128a(thread), this.f25392c.mo61217a(thread), ((C10197Dm) this.f25393d).mo61204b());
            for (C11337i7 a : this.f25390a) {
                a.mo62952a(th, e7Var);
            }
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f25391b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
