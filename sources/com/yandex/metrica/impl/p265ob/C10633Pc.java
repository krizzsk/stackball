package com.yandex.metrica.impl.p265ob;

import android.os.SystemClock;
import com.yandex.metrica.impl.p265ob.C10683R0;
import com.yandex.metrica.impl.p265ob.C10883Wc;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.Pc */
public class C10633Pc {

    /* renamed from: a */
    private final C10666Qc f25407a;

    /* renamed from: b */
    private final C10702Rc f25408b;

    /* renamed from: c */
    private final C10580Nm f25409c;

    /* renamed from: d */
    private C10807Uc f25410d;

    /* renamed from: e */
    private final C10474M f25411e;

    /* renamed from: f */
    private final C11065b3 f25412f;

    /* renamed from: g */
    private final C10310Gd f25413g;

    /* renamed from: h */
    private final C10199E f25414h;

    /* renamed from: i */
    private boolean f25415i;

    /* renamed from: j */
    private final Runnable f25416j;

    /* renamed from: com.yandex.metrica.impl.ob.Pc$a */
    class C10634a implements Runnable {
        C10634a() {
        }

        public void run() {
            C10633Pc.this.mo61916b();
            C10633Pc.this.m27219c();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Pc$b */
    class C10635b implements C10891Wj {

        /* renamed from: a */
        final /* synthetic */ C10781Tc f25418a;

        C10635b(C10633Pc pc, C10781Tc tc) {
            this.f25418a = tc;
        }

        /* renamed from: a */
        public void mo61920a(Collection<C10859Vj> collection) {
            this.f25418a.mo62287a(C11993ym.m30967a(collection));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10633Pc(com.yandex.metrica.impl.p265ob.C10666Qc r4) {
        /*
            r3 = this;
            com.yandex.metrica.impl.ob.Gd r0 = new com.yandex.metrica.impl.ob.Gd
            com.yandex.metrica.impl.ob.zc r1 = r4.f25477a
            android.content.Context r1 = r1.f28886a
            com.yandex.metrica.impl.ob.Uc r2 = r4.f25481e
            if (r2 != 0) goto L_0x000c
            r2 = 0
            goto L_0x000e
        L_0x000c:
            com.yandex.metrica.impl.ob.Ec r2 = r2.f25922m
        L_0x000e:
            r0.<init>((android.content.Context) r1, (com.yandex.metrica.impl.p265ob.C10220Ec) r2)
            r3.<init>(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10633Pc.<init>(com.yandex.metrica.impl.ob.Qc):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m27219c() {
        C10807Uc uc = this.f25410d;
        if (uc != null) {
            long j = uc.f25917h;
            if (j > 0) {
                this.f25407a.f25477a.f28887b.mo63613a(this.f25416j, j);
            }
        }
    }

    /* renamed from: b */
    public void mo61916b() {
        C10781Tc tc = new C10781Tc();
        this.f25409c.getClass();
        tc.mo62289b(System.currentTimeMillis());
        this.f25409c.getClass();
        tc.mo62283a(SystemClock.elapsedRealtime());
        this.f25413g.mo61389b();
        tc.mo62290b(C10977Z2.m28338a((Collection) this.f25412f.mo62679a().mo61900a()));
        this.f25407a.f25478b.mo62204a((C10891Wj) new C10635b(this, tc));
        tc.mo62284a(this.f25411e.mo61752b());
        tc.mo62285a(C10883Wc.C10884a.m28132a(this.f25414h.mo61211c()));
        this.f25408b.mo62127a(tc);
        this.f25407a.f25479c.mo61056a();
        this.f25407a.f25480d.mo64140a();
    }

    /* renamed from: d */
    public void mo61917d() {
        m27217a();
    }

    /* renamed from: e */
    public void mo61918e() {
        this.f25407a.f25477a.f28887b.mo63612a(this.f25416j);
    }

    /* renamed from: a */
    private void m27217a() {
        C10807Uc uc = this.f25410d;
        boolean z = uc != null && uc.f25918i;
        if (this.f25415i != z) {
            this.f25415i = z;
            if (z) {
                m27219c();
            } else {
                this.f25407a.f25477a.f28887b.mo63612a(this.f25416j);
            }
        }
    }

    private C10633Pc(C10666Qc qc, C10310Gd gd) {
        this(qc, new C10702Rc(qc.f25477a.f28886a), new C10580Nm(), C10619P0.m27164i().mo61877d(), C10619P0.m27164i().mo61876c(), C11065b3.m28563a(qc.f25477a.f28886a), gd, new C10683R0.C10686c());
    }

    C10633Pc(C10666Qc qc, C10702Rc rc, C10580Nm nm, C10474M m, C10199E e, C11065b3 b3Var, C10310Gd gd, C10683R0.C10686c cVar) {
        this.f25416j = new C10634a();
        this.f25407a = qc;
        this.f25408b = rc;
        this.f25409c = nm;
        this.f25410d = qc.f25481e;
        this.f25411e = m;
        this.f25414h = e;
        this.f25412f = b3Var;
        this.f25413g = gd;
        b3Var.mo62679a().mo61941a(cVar.mo62100a(qc.f25477a.f28887b, gd, b3Var.mo62679a()));
    }

    /* renamed from: a */
    public void mo61915a(C10807Uc uc) {
        C10220Ec ec;
        this.f25410d = uc;
        C10310Gd gd = this.f25413g;
        if (uc == null) {
            ec = null;
        } else {
            ec = uc.f25922m;
        }
        gd.mo61388a(ec);
        m27217a();
    }
}
