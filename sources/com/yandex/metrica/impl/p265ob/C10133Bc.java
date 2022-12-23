package com.yandex.metrica.impl.p265ob;

import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Bc */
public abstract class C10133Bc<T> implements C11942xc<T> {

    /* renamed from: a */
    private C11769sn f24397a;

    /* renamed from: b */
    private volatile Runnable f24398b;

    public C10133Bc(C11769sn snVar) {
        this.f24397a = snVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo61106a(Runnable runnable, long j) {
        ((C11725rn) this.f24397a).mo63614a(runnable, j, TimeUnit.SECONDS);
        this.f24398b = runnable;
    }

    /* renamed from: a */
    public void mo61105a() {
        Runnable runnable = this.f24398b;
        if (runnable != null) {
            ((C11725rn) this.f24397a).mo63612a(runnable);
            this.f24398b = null;
        }
    }
}
