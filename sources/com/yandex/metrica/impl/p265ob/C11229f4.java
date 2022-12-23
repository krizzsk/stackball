package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.impl.p265ob.C10089A;
import com.yandex.metrica.impl.p265ob.C10910X3;
import com.yandex.metrica.impl.p265ob.C11174e4;
import com.yandex.metrica.impl.p265ob.C11384jh;
import com.yandex.metrica.impl.p265ob.C11839v6;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.f4 */
public class C11229f4 implements C11517m4, C11369j4, C10882Wb, C11384jh.C11388d {

    /* renamed from: a */
    private final Context f26868a;

    /* renamed from: b */
    private final C11101c4 f26869b;

    /* renamed from: c */
    private final C10306G9 f26870c;

    /* renamed from: d */
    private final C10364I9 f26871d;

    /* renamed from: e */
    private final C10217E9 f26872e;

    /* renamed from: f */
    private final C11513m2 f26873f;

    /* renamed from: g */
    private final C11782t8 f26874g;

    /* renamed from: h */
    private final C11266g5 f26875h;

    /* renamed from: i */
    private final C11133d5 f26876i;

    /* renamed from: j */
    private final C10089A f26877j;

    /* renamed from: k */
    private final C10826V3 f26878k;

    /* renamed from: l */
    private final C11839v6 f26879l;

    /* renamed from: m */
    private final C11776t4 f26880m;

    /* renamed from: n */
    private final C11268g6 f26881n;

    /* renamed from: o */
    private final C10380Im f26882o;

    /* renamed from: p */
    private final C11959xm f26883p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final C11805u4 f26884q;

    /* renamed from: r */
    private final C11174e4.C11176b f26885r;

    /* renamed from: s */
    private final C10837Vb f26886s;

    /* renamed from: t */
    private final C10747Sb f26887t;

    /* renamed from: u */
    private final C10923Xb f26888u;

    /* renamed from: v */
    private final C10618P f26889v;

    /* renamed from: w */
    private final C10691R2 f26890w;

    /* renamed from: x */
    private final C11099c2 f26891x = C10619P0.m27164i().mo61885m();

    /* renamed from: y */
    private final C10363I8 f26892y;

    /* renamed from: com.yandex.metrica.impl.ob.f4$a */
    class C11230a implements C11839v6.C11840a {
        C11230a() {
        }

        /* renamed from: a */
        public void mo62892a(C11411k0 k0Var, C11904w6 w6Var) {
            C11229f4.this.f26884q.mo63760a(k0Var, w6Var);
        }
    }

    C11229f4(Context context, C11101c4 c4Var, C10826V3 v3, C10691R2 r2, C11262g4 g4Var) {
        this.f26868a = context.getApplicationContext();
        this.f26869b = c4Var;
        this.f26878k = v3;
        this.f26890w = r2;
        C10363I8 d = g4Var.mo62941d();
        this.f26892y = d;
        C11776t4 a = g4Var.mo62934a(this);
        this.f26880m = a;
        C10380Im b = g4Var.mo62937b().mo62945b();
        this.f26882o = b;
        C11959xm a2 = g4Var.mo62937b().mo62944a();
        this.f26883p = a2;
        C10306G9 a3 = g4Var.mo62940c().mo62946a();
        this.f26870c = a3;
        this.f26872e = g4Var.mo62940c().mo62947b();
        this.f26871d = C10619P0.m27164i().mo61893u();
        C10089A a4 = v3.mo62373a(c4Var, b, a3);
        this.f26877j = a4;
        this.f26881n = g4Var.mo62933a();
        C11782t8 b2 = g4Var.mo62938b(this);
        this.f26874g = b2;
        C11513m2<C11229f4> e = g4Var.mo62943e(this);
        this.f26873f = e;
        this.f26885r = g4Var.mo62942d(this);
        C10923Xb a5 = g4Var.mo62931a(b2, a);
        this.f26888u = a5;
        C10747Sb a6 = g4Var.mo62929a(b2);
        this.f26887t = a6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(a5);
        arrayList.add(a6);
        this.f26886s = g4Var.mo62930a((List<C10780Tb>) arrayList, (C10882Wb) this);
        m28928y();
        C11839v6 a7 = g4Var.mo62936a(this, d, new C11230a());
        this.f26879l = a7;
        if (a2.mo64227c()) {
            a2.mo64220a("Read app environment for component %s. Value: %s", c4Var.toString(), a4.mo61034a().f24296a);
        }
        this.f26884q = g4Var.mo62935a(a3, d, a7, b2, a4, e);
        C11133d5 c = g4Var.mo62939c(this);
        this.f26876i = c;
        this.f26875h = g4Var.mo62932a(this, c);
        this.f26889v = g4Var.mo62928a(a3);
        b2.mo63717e();
    }

    /* renamed from: y */
    private void m28928y() {
        int libraryApiLevel = YandexMetrica.getLibraryApiLevel();
        Integer i = this.f26870c.mo61372i();
        if (i == null) {
            i = Integer.valueOf(this.f26892y.mo61490e());
        }
        if (i.intValue() < libraryApiLevel) {
            this.f26885r.mo62807a(new C11631pe(new C11682qe(this.f26868a, this.f26869b.mo62715a()))).mo62806a();
            this.f26892y.mo61483b(libraryApiLevel);
        }
    }

    /* renamed from: A */
    public boolean mo62860A() {
        return this.f26884q.mo63766d() && mo62880m().mo62796y();
    }

    /* renamed from: B */
    public boolean mo62861B() {
        return this.f26884q.mo63764c() && mo62880m().mo63085P() && mo62880m().mo62796y();
    }

    /* renamed from: C */
    public void mo62862C() {
        this.f26880m.mo62910e();
    }

    /* renamed from: D */
    public boolean mo62863D() {
        C11384jh m = mo62880m();
        return m.mo63088S() && this.f26890w.mo62107b(this.f26884q.mo63758a(), m.mo63082M(), "should force send permissions");
    }

    /* renamed from: E */
    public boolean mo62864E() {
        return !(((C10459Le) this.f26891x.mo61074a()).f25112d && this.f26880m.mo62909d().mo61999N());
    }

    /* renamed from: F */
    public void mo62865F() {
    }

    /* renamed from: a */
    public synchronized void mo61737a(C10342Hi hi, C10675Qi qi) {
    }

    /* renamed from: b */
    public void mo62868b(C11411k0 k0Var) {
        boolean z;
        this.f26877j.mo61035a(k0Var.mo63145b());
        C10089A.C10090a a = this.f26877j.mo61034a();
        C10826V3 v3 = this.f26878k;
        C10306G9 g9 = this.f26870c;
        synchronized (v3) {
            if (a.f24297b > g9.mo61363e().f24297b) {
                g9.mo61357a(a).mo61454c();
                z = true;
            } else {
                z = false;
            }
        }
        if (z && this.f26882o.mo64227c()) {
            this.f26882o.mo64220a("Save new app environment for %s. Value: %s", this.f26869b, a.f24296a);
        }
    }

    /* renamed from: c */
    public synchronized void mo62870c() {
        this.f26873f.mo61947d();
    }

    /* renamed from: d */
    public C10618P mo62871d() {
        return this.f26889v;
    }

    /* renamed from: e */
    public C11101c4 mo62872e() {
        return this.f26869b;
    }

    /* renamed from: f */
    public C10306G9 mo62873f() {
        return this.f26870c;
    }

    /* renamed from: g */
    public Context mo62874g() {
        return this.f26868a;
    }

    /* renamed from: h */
    public String mo62875h() {
        return this.f26870c.mo61376m();
    }

    /* renamed from: i */
    public C11782t8 mo62876i() {
        return this.f26874g;
    }

    /* renamed from: j */
    public C11268g6 mo62877j() {
        return this.f26881n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C11133d5 mo62878k() {
        return this.f26876i;
    }

    /* renamed from: l */
    public C10837Vb mo62879l() {
        return this.f26886s;
    }

    /* renamed from: m */
    public C11384jh mo62880m() {
        return (C11384jh) this.f26880m.mo62907b();
    }

    @Deprecated
    /* renamed from: n */
    public final C11682qe mo62881n() {
        return new C11682qe(this.f26868a, this.f26869b.mo62715a());
    }

    /* renamed from: o */
    public C10217E9 mo62882o() {
        return this.f26872e;
    }

    /* renamed from: p */
    public String mo62883p() {
        return this.f26870c.mo61375l();
    }

    /* renamed from: q */
    public C10380Im mo62884q() {
        return this.f26882o;
    }

    /* renamed from: r */
    public C11805u4 mo62885r() {
        return this.f26884q;
    }

    /* renamed from: s */
    public CounterConfiguration.C10019b mo62439s() {
        return CounterConfiguration.C10019b.MANUAL;
    }

    /* renamed from: t */
    public C10364I9 mo62886t() {
        return this.f26871d;
    }

    /* renamed from: u */
    public C11839v6 mo62887u() {
        return this.f26879l;
    }

    /* renamed from: v */
    public C10675Qi mo62888v() {
        return this.f26880m.mo62909d();
    }

    /* renamed from: w */
    public C10363I8 mo62889w() {
        return this.f26892y;
    }

    /* renamed from: x */
    public void mo62890x() {
        this.f26884q.mo63761b();
    }

    /* renamed from: z */
    public boolean mo62891z() {
        C11384jh m = mo62880m();
        return m.mo63088S() && m.mo62796y() && this.f26890w.mo62107b(this.f26884q.mo63758a(), m.mo63081L(), "need to check permissions");
    }

    /* renamed from: a */
    public void mo62276a(C11411k0 k0Var) {
        if (this.f26882o.mo64227c()) {
            C10380Im im = this.f26882o;
            im.getClass();
            if (C10385J0.m26645c(k0Var.mo63161n())) {
                StringBuilder sb = new StringBuilder("Event received on service");
                sb.append(": ");
                sb.append(k0Var.mo63154g());
                if (C10385J0.m26647e(k0Var.mo63161n()) && !TextUtils.isEmpty(k0Var.mo63163p())) {
                    sb.append(" with value ");
                    sb.append(k0Var.mo63163p());
                }
                im.mo64223b(sb.toString());
            }
        }
        String a = this.f26869b.mo62715a();
        if (!TextUtils.isEmpty(a) && !"-1".equals(a)) {
            this.f26875h.mo62948a(k0Var);
        }
    }

    /* renamed from: b */
    public void mo62867b() {
        this.f26877j.mo61036b();
        C10826V3 v3 = this.f26878k;
        C10089A.C10090a a = this.f26877j.mo61034a();
        C10306G9 g9 = this.f26870c;
        synchronized (v3) {
            g9.mo61357a(a).mo61454c();
        }
    }

    /* renamed from: b */
    public void mo62869b(String str) {
        this.f26870c.mo61370h(str).mo61454c();
    }

    /* renamed from: a */
    public synchronized void mo62275a(C10910X3.C10911a aVar) {
        C11776t4 t4Var = this.f26880m;
        synchronized (t4Var) {
            t4Var.mo62906a(aVar);
        }
        if (Boolean.TRUE.equals(aVar.f26232k)) {
            this.f26882o.mo64229e();
        } else {
            if (Boolean.FALSE.equals(aVar.f26232k)) {
                this.f26882o.mo64228d();
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo61738a(C10675Qi qi) {
        this.f26880m.mo62904a(qi);
        this.f26874g.mo63715b(qi);
        this.f26886s.mo62377c();
    }

    /* renamed from: a */
    public void mo62866a(String str) {
        this.f26870c.mo61371i(str).mo61454c();
    }
}
