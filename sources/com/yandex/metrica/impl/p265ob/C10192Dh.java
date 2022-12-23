package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.impl.p265ob.C10501Ma;
import com.yandex.metrica.impl.p265ob.C11892w;

/* renamed from: com.yandex.metrica.impl.ob.Dh */
public class C10192Dh {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12030zh f24503a;

    /* renamed from: b */
    private final C10662Q9<C10225Eh> f24504b;

    /* renamed from: c */
    private final C10691R2 f24505c;

    /* renamed from: d */
    private final C11769sn f24506d;

    /* renamed from: e */
    private final C11892w.C11897c f24507e;

    /* renamed from: f */
    private final C11892w f24508f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C11987yh f24509g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f24510h;

    /* renamed from: i */
    private C10193Di f24511i;

    /* renamed from: j */
    private boolean f24512j;

    /* renamed from: k */
    private long f24513k;

    /* renamed from: l */
    private long f24514l;

    /* renamed from: m */
    private long f24515m;

    /* renamed from: n */
    private boolean f24516n;

    /* renamed from: o */
    private boolean f24517o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f24518p;

    /* renamed from: q */
    private final Object f24519q;

    public C10192Dh(Context context, C11769sn snVar) {
        this(new C12030zh(context, (String) null, snVar), C10501Ma.C10503b.m26925a(C10225Eh.class).mo61785a(context), new C10691R2(), snVar, C10619P0.m27164i().mo61872a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo61195a() {
        if (!this.f24510h) {
            this.f24510h = true;
            if (!this.f24518p) {
                this.f24508f.mo63995a(this.f24511i.f24522c, this.f24506d, this.f24507e);
            } else {
                this.f24503a.mo64196a(this.f24509g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo61197b() {
        C10225Eh eh = (C10225Eh) this.f24504b.mo61953b();
        this.f24515m = eh.f24590c;
        this.f24516n = eh.f24591d;
        this.f24517o = eh.f24592e;
    }

    /* renamed from: b */
    public void mo61198b(C10675Qi qi) {
        C10193Di di;
        C10193Di di2;
        boolean z = true;
        if (qi == null || ((this.f24512j || !qi.mo62014f().f28183e) && (di2 = this.f24511i) != null && di2.equals(qi.mo61996K()) && this.f24513k == qi.mo61987B() && this.f24514l == qi.mo62024p() && !this.f24503a.mo64197b(qi))) {
            z = false;
        }
        synchronized (this.f24519q) {
            if (qi != null) {
                this.f24512j = qi.mo62014f().f28183e;
                this.f24511i = qi.mo61996K();
                this.f24513k = qi.mo61987B();
                this.f24514l = qi.mo62024p();
            }
            this.f24503a.mo64195a(qi);
        }
        if (z) {
            synchronized (this.f24519q) {
                if (this.f24512j && (di = this.f24511i) != null) {
                    if (this.f24516n) {
                        if (this.f24517o) {
                            if (this.f24505c.mo62106a(this.f24515m, di.f24523d, "should retry sdk collecting")) {
                                mo61195a();
                            }
                        } else if (this.f24505c.mo62106a(this.f24515m, di.f24520a, "should collect sdk as usual")) {
                            mo61195a();
                        }
                    } else if (this.f24513k - this.f24514l >= di.f24521b) {
                        mo61195a();
                    }
                }
            }
        }
    }

    C10192Dh(C12030zh zhVar, C10662Q9<C10225Eh> q9, C10691R2 r2, C11769sn snVar, C11892w wVar) {
        this.f24518p = false;
        this.f24519q = new Object();
        this.f24503a = zhVar;
        this.f24504b = q9;
        this.f24509g = new C11987yh(q9, new C10139Bh(this));
        this.f24505c = r2;
        this.f24506d = snVar;
        this.f24507e = new C10166Ch(this);
        this.f24508f = wVar;
    }

    /* renamed from: a */
    public void mo61196a(C10675Qi qi) {
        C10225Eh eh = (C10225Eh) this.f24504b.mo61953b();
        this.f24515m = eh.f24590c;
        this.f24516n = eh.f24591d;
        this.f24517o = eh.f24592e;
        mo61198b(qi);
    }
}
