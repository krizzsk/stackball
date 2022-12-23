package com.tapjoy.internal;

import com.tapjoy.internal.C9314gf;

/* renamed from: com.tapjoy.internal.fw */
public final class C9293fw {

    /* renamed from: a */
    public C9285fq f22972a;

    /* renamed from: b */
    public volatile C9314gf.C9316a f22973b;

    /* renamed from: c */
    public int f22974c;

    /* renamed from: d */
    public volatile C9314gf.C9316a f22975d;

    /* renamed from: e */
    public volatile C9314gf.C9316a f22976e;

    /* renamed from: a */
    public final void mo58153a() {
        mo58154a(16);
        C9314gf.C9316a aVar = this.f22975d;
        if (aVar != null) {
            this.f22975d = null;
            aVar.mo58201b().mo58204c();
        }
    }

    /* renamed from: a */
    public final synchronized void mo58154a(int i) {
        C9314gf.C9316a aVar = this.f22973b;
        if (aVar != null && this.f22974c < i) {
            int i2 = i | this.f22974c;
            this.f22974c = i2;
            aVar.mo58199a("state", (Object) Integer.valueOf(i2)).mo58201b().mo58204c();
        }
    }
}
