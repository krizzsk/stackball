package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.impl.p265ob.C10667Qd;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Ah */
class C10111Ah implements C10667Qd.C10668a {

    /* renamed from: a */
    final /* synthetic */ C10225Eh f24337a;

    /* renamed from: b */
    final /* synthetic */ C11987yh f24338b;

    /* renamed from: c */
    final /* synthetic */ C12030zh f24339c;

    C10111Ah(C12030zh zhVar, C10225Eh eh, C11987yh yhVar) {
        this.f24339c = zhVar;
        this.f24337a = eh;
        this.f24338b = yhVar;
    }

    /* renamed from: a */
    public void mo61064a(String str, byte[] bArr) {
        List<C10341Hh> a = this.f24339c.f28900c.mo64199a(this.f24339c.f28901d.mo62689a(bArr, "af9202nao18gswqp"));
        C11987yh yhVar = this.f24338b;
        this.f24339c.f28903f.getClass();
        yhVar.mo64173a(new C10225Eh(a, str, System.currentTimeMillis(), true, false));
    }

    /* renamed from: b */
    public String mo61065b() {
        return this.f24337a.f24589b;
    }

    /* renamed from: c */
    public void mo61066c() {
        this.f24338b.mo64172a();
    }

    /* renamed from: a */
    public void mo61063a() {
        C11987yh yhVar = this.f24338b;
        C10225Eh eh = this.f24337a;
        List<C10341Hh> list = eh.f24588a;
        String str = eh.f24589b;
        this.f24339c.f28903f.getClass();
        yhVar.mo64173a(new C10225Eh(list, str, System.currentTimeMillis(), true, false));
    }
}
