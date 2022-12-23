package com.yandex.mobile.ads.impl;

import java.util.WeakHashMap;

/* renamed from: com.yandex.mobile.ads.impl.s0 */
public class C14550s0 {

    /* renamed from: a */
    private final Object f39773a = new Object();

    /* renamed from: b */
    private final WeakHashMap<C14434r0, Object> f39774b = new WeakHashMap<>();

    C14550s0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo69847a(C14434r0 r0Var) {
        synchronized (this.f39773a) {
            this.f39774b.put(r0Var, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo69848b(C14434r0 r0Var) {
        synchronized (this.f39773a) {
            this.f39774b.remove(r0Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo69846a() {
        synchronized (this.f39773a) {
            for (C14434r0 a : this.f39774b.keySet()) {
                a.mo64754a();
            }
            this.f39774b.clear();
        }
    }
}
