package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Lc */
public class C10456Lc {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10364I9 f25094a;

    /* renamed from: b */
    private final C11425kd f25095b;

    /* renamed from: c */
    private final C10602Oc f25096c;

    /* renamed from: d */
    private final C10367Ic f25097d = m26815a();

    /* renamed from: e */
    private final C10309Gc f25098e;

    /* renamed from: f */
    private final C10428Kc f25099f;

    /* renamed from: com.yandex.metrica.impl.ob.Lc$a */
    class C10457a implements C10602Oc {
        C10457a() {
        }

        /* renamed from: a */
        public long mo61727a() {
            return C10456Lc.this.f25094a.mo61509b(0);
        }

        /* renamed from: a */
        public void mo61728a(long j) {
            C10456Lc.this.f25094a.mo61523g(j);
        }
    }

    public C10456Lc(C11425kd kdVar, C10364I9 i9, C11943xd xdVar) {
        this.f25095b = kdVar;
        this.f25094a = i9;
        C10602Oc b = m26817b();
        this.f25096c = b;
        this.f25098e = m26813a(b);
        this.f25099f = m26816a(xdVar);
    }

    /* renamed from: b */
    private C10602Oc m26817b() {
        return new C10457a();
    }

    /* renamed from: a */
    private C10367Ic m26815a() {
        return new C10367Ic(this.f25095b.f27389a.f28887b);
    }

    /* renamed from: a */
    private C10309Gc m26813a(C10602Oc oc) {
        return new C10309Gc(oc, new C10691R2());
    }

    /* renamed from: a */
    private C10428Kc m26816a(C11943xd xdVar) {
        C12025zc zcVar = this.f25095b.f27389a;
        return new C10428Kc(zcVar.f28886a, xdVar, zcVar.f28887b, zcVar.f28888c);
    }

    /* renamed from: a */
    public C11526md<C10401Jc> mo61726a(C10401Jc jc) {
        return new C11526md(this.f25099f, this.f25098e, new C11847vc(this.f25096c, new C10580Nm()), this.f25097d, jc);
    }
}
