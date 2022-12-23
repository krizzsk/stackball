package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.yandex.metrica.impl.p265ob.C10766T1;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.Ld */
public class C10458Ld extends C10795U1<C11605oh> {

    /* renamed from: r */
    private C10636Pd f25101r;

    /* renamed from: s */
    private final C10490M2 f25102s;

    /* renamed from: t */
    private final C10807Uc f25103t;

    /* renamed from: u */
    private final C10332H8 f25104u;

    /* renamed from: v */
    private final C10548Nd f25105v;

    /* renamed from: w */
    private final C11561nd f25106w;

    /* renamed from: x */
    private long f25107x;

    /* renamed from: y */
    private C10520Md f25108y;

    C10458Ld(Context context, C10636Pd pd, C10490M2 m2, C11561nd ndVar, C10332H8 h8, C11605oh ohVar, C10548Nd nd) {
        super(ohVar);
        this.f25101r = pd;
        this.f25102s = m2;
        this.f25106w = ndVar;
        this.f25103t = pd.mo61921A();
        this.f25104u = h8;
        this.f25105v = nd;
        m26822F();
        mo62251a(this.f25101r.mo61922B());
    }

    /* renamed from: E */
    private boolean m26821E() {
        C10520Md a = this.f25105v.mo61816a(this.f25103t.f25913d);
        this.f25108y = a;
        C10810Uf uf = a.f25206c;
        if (!(uf.f25928c.length == 0 && uf.f25927b.length == 0)) {
            return mo62328c(C11169e.m28804a((C11169e) uf));
        }
        return false;
    }

    /* renamed from: F */
    private void m26822F() {
        long f = this.f25104u.mo61439f() + 1;
        this.f25107x = f;
        ((C11605oh) this.f25817j).mo63437a(f);
    }

    /* renamed from: A */
    public boolean mo61729A() {
        return super.mo61729A() & (!mo62263m());
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo61730C() {
        this.f25105v.mo61817a(this.f25108y);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo61731D() {
        this.f25105v.mo61817a(this.f25108y);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo61643a(Uri.Builder builder) {
        ((C11605oh) this.f25817j).mo63438a(builder, this.f25101r);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo61645b(Throwable th) {
        this.f25104u.mo61430a(this.f25107x);
    }

    /* renamed from: j */
    public C10167Ci mo61646j() {
        return this.f25101r.mo62789r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo61647o() {
        if (!this.f25102s.mo61774d() && !TextUtils.isEmpty(this.f25101r.mo62778g()) && !TextUtils.isEmpty(this.f25101r.mo62795x()) && !C10796U2.m27896b((Collection) mo62254c())) {
            return m26821E();
        }
        return false;
    }

    /* renamed from: r */
    public boolean mo61648r() {
        boolean r = super.mo61648r();
        this.f25104u.mo61430a(this.f25107x);
        return r;
    }

    /* renamed from: t */
    public void mo61650t() {
        this.f25106w.mo61056a();
    }

    /* renamed from: b */
    public C10766T1.C10767a mo61644b() {
        return C10766T1.C10767a.f25822b;
    }
}
