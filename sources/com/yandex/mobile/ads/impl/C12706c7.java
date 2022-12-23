package com.yandex.mobile.ads.impl;

import java.util.WeakHashMap;

/* renamed from: com.yandex.mobile.ads.impl.c7 */
public class C12706c7 {

    /* renamed from: a */
    private final Object f31829a = new Object();

    /* renamed from: b */
    private final WeakHashMap<C12958e7, Object> f31830b = new WeakHashMap<>();

    C12706c7() {
    }

    /* renamed from: a */
    public void mo66211a(C12958e7 e7Var) {
        synchronized (this.f31829a) {
            this.f31830b.put(e7Var, (Object) null);
        }
    }

    /* renamed from: b */
    public void mo66212b(C12958e7 e7Var) {
        synchronized (this.f31829a) {
            this.f31830b.remove(e7Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66210a() {
        synchronized (this.f31829a) {
            m34601a((C15033w6) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo66213b(C15033w6 w6Var) {
        synchronized (this.f31829a) {
            m34601a(w6Var);
        }
    }

    /* renamed from: a */
    private void m34601a(C15033w6 w6Var) {
        for (C12958e7 a : this.f31830b.keySet()) {
            a.mo64756a(w6Var);
        }
        this.f31830b.clear();
    }
}
