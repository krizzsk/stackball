package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C11369j4;

/* renamed from: com.yandex.metrica.impl.ob.Q2 */
public class C10655Q2<C extends C11369j4> implements C10237F2 {

    /* renamed from: a */
    private C f25437a;

    /* renamed from: b */
    final Object f25438b = new Object();

    /* renamed from: c */
    boolean f25439c = false;

    /* renamed from: d */
    private final C11002Zi f25440d;

    public C10655Q2(C c, C11002Zi zi) {
        this.f25437a = c;
        this.f25440d = zi;
    }

    /* renamed from: a */
    public void mo61207a() {
        synchronized (this.f25438b) {
            if (this.f25439c) {
                this.f25439c = false;
            }
        }
    }

    /* renamed from: b */
    public void mo61209b() {
        synchronized (this.f25438b) {
            if (!this.f25439c) {
                mo61946c();
                this.f25439c = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo61946c() {
    }

    /* renamed from: d */
    public void mo61947d() {
        synchronized (this.f25438b) {
            if (!this.f25439c) {
                synchronized (this.f25438b) {
                    if (!this.f25439c) {
                        mo61949f();
                    }
                }
                mo61946c();
            }
        }
    }

    /* renamed from: e */
    public C mo61948e() {
        return this.f25437a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo61949f() {
        this.f25440d.mo62551a();
    }
}
