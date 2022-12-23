package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Hk */
class C10344Hk implements C11053am {

    /* renamed from: a */
    private final C10468Lk f24844a;

    /* renamed from: b */
    private final C10248F9 f24845b;

    /* renamed from: c */
    private final C11536ml f24846c;

    /* renamed from: d */
    private final C10345a f24847d;

    /* renamed from: e */
    private final boolean f24848e;

    /* renamed from: com.yandex.metrica.impl.ob.Hk$a */
    static class C10345a {
        C10345a() {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Hk$b */
    static class C10346b {
        C10346b() {
        }
    }

    C10344Hk(C10468Lk lk, C10248F9 f9, boolean z, C11536ml mlVar, C10345a aVar) {
        this.f24844a = lk;
        this.f24845b = f9;
        this.f24848e = z;
        this.f24846c = mlVar;
        this.f24847d = aVar;
    }

    /* renamed from: b */
    private boolean m26488b(C10378Il il) {
        if (!il.f24921c || il.f24925g == null) {
            return false;
        }
        if (this.f24848e || this.f24845b.mo61269a(false)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo61469a(long j, Activity activity, C10319Gl gl, List<C10893Wl> list, C10378Il il, C11119cl clVar) {
        C11291gl glVar;
        if (m26488b(il)) {
            C10345a aVar = this.f24847d;
            C10437Kl kl = il.f24925g;
            aVar.getClass();
            if (kl.f25070h) {
                glVar = new C11291gl();
            } else {
                glVar = new C11164dl(list);
            }
            this.f24844a.mo61740a(glVar.mo62245a(activity, gl, il.f24925g, clVar.mo62733a(), j));
            this.f24846c.onResult(this.f24844a.mo61739a());
        }
    }

    /* renamed from: a */
    public void mo61470a(Throwable th, C11091bm bmVar) {
        C11536ml mlVar = this.f24846c;
        mlVar.onError("exception: " + th.getMessage());
    }

    /* renamed from: a */
    public boolean mo61471a(C10378Il il) {
        return m26488b(il) && !il.f24925g.f25070h;
    }
}
