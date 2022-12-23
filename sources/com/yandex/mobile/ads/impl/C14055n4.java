package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.n4 */
public class C14055n4 {

    /* renamed from: a */
    private final Object f37637a = new Object();

    /* renamed from: b */
    private C13953m4 f37638b = C13953m4.INITIAL;

    /* renamed from: a */
    public C13953m4 mo68886a() {
        C13953m4 m4Var;
        synchronized (this.f37637a) {
            m4Var = this.f37638b;
        }
        return m4Var;
    }

    /* renamed from: a */
    public void mo68887a(C13953m4 m4Var) {
        synchronized (this.f37637a) {
            this.f37638b = m4Var;
        }
    }
}
