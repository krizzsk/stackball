package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10771T4;

/* renamed from: com.yandex.metrica.impl.ob.z0 */
public class C11999z0<C extends C10771T4> extends C10655Q2<C> {

    /* renamed from: e */
    private final C10980Z4 f28824e;

    /* renamed from: f */
    private final C10363I8 f28825f;

    public C11999z0(C c, C11002Zi zi, C10980Z4 z4, C10363I8 i8) {
        super(c, zi);
        this.f28824e = z4;
        this.f28825f = i8;
    }

    /* renamed from: a */
    public void mo64180a(C11411k0 k0Var) {
        if (!this.f25439c) {
            synchronized (this.f25438b) {
                if (!this.f25439c) {
                    mo61949f();
                }
            }
            C10827V4 v4 = new C10827V4((C10946Y4) mo61948e(), k0Var, this.f28824e, this.f28825f);
            C10688R1 l = C10619P0.m27164i().mo61884l();
            if (l != null) {
                l.mo62102b(v4);
            }
        }
    }
}
