package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.share.Constants;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.impl.p265ob.C10484M1;
import com.yandex.metrica.impl.p265ob.C10675Qi;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.B1 */
public class C10120B1 implements C11968y1 {

    /* renamed from: A */
    private final C11969y2 f24358A;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C10675Qi f24359a;

    /* renamed from: b */
    private boolean f24360b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f24361c;

    /* renamed from: d */
    private volatile MetricaService.C10026e f24362d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C11211ei f24363e;

    /* renamed from: f */
    private C11301h1 f24364f;

    /* renamed from: g */
    private final C10442L0 f24365g;

    /* renamed from: h */
    private C10178D4 f24366h;

    /* renamed from: i */
    private final C10484M1 f24367i;

    /* renamed from: j */
    private C10188Dd f24368j;

    /* renamed from: k */
    private C10364I9 f24369k;

    /* renamed from: l */
    private C11225f2 f24370l;

    /* renamed from: m */
    private final C10583O0 f24371m;

    /* renamed from: n */
    private final C11237fb f24372n;

    /* renamed from: o */
    private final C10238F3 f24373o;

    /* renamed from: p */
    private C10304G7 f24374p;

    /* renamed from: q */
    private final C10876W6 f24375q;

    /* renamed from: r */
    private final C11373j8 f24376r;

    /* renamed from: s */
    private final C10199E f24377s;

    /* renamed from: t */
    private final C11769sn f24378t;

    /* renamed from: u */
    private final C10416K1 f24379u;

    /* renamed from: v */
    private C10820Um<String> f24380v;

    /* renamed from: w */
    private C10820Um<File> f24381w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C10498M7<String> f24382x;

    /* renamed from: y */
    private C11769sn f24383y;

    /* renamed from: z */
    private C11260g2 f24384z;

    /* renamed from: com.yandex.metrica.impl.ob.B1$a */
    class C10121a implements C10820Um<File> {
        C10121a() {
        }

        /* renamed from: b */
        public void mo61092b(Object obj) {
            C10120B1.this.mo61084a((File) obj);
        }
    }

    public C10120B1(Context context, MetricaService.C10026e eVar) {
        this(context, eVar, new C10391J4(context));
    }

    /* renamed from: d */
    static void m26014d(C10120B1 b1) {
        C10188Dd dd = b1.f24368j;
        if (dd != null) {
            dd.mo61187a((Object) b1);
        }
    }

    /* renamed from: e */
    static void m26015e(C10120B1 b1) {
        C10188Dd dd = b1.f24368j;
        if (dd != null) {
            dd.mo61189b(b1);
        }
    }

    /* renamed from: g */
    static void m26017g(C10120B1 b1) {
        if (b1.f24359a != null) {
            C10619P0.m27164i().mo61889q().mo61196a(b1.f24359a);
        }
    }

    /* renamed from: b */
    public void mo61087b(Intent intent) {
        String str;
        this.f24367i.mo61087b(intent);
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            if (data == null) {
                str = null;
            } else {
                str = data.getEncodedAuthority();
            }
            if ("com.yandex.metrica.IMetricaService".equals(action) && data != null && data.getPath().equals("/client")) {
                int parseInt = Integer.parseInt(data.getQueryParameter(Constants.URL_MEDIA_SOURCE));
                this.f24366h.mo61167a(str, parseInt, data.getQueryParameter("psid"));
                this.f24377s.mo61208a(parseInt);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        C11616p1.m29998a(this.f24361c).mo63449b(configuration);
    }

    public void reportData(Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        this.f24364f.mo62985a();
        this.f24370l.mo62858a(C11411k0.m29405a(bundle), bundle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C10120B1(android.content.Context r18, com.yandex.metrica.MetricaService.C10026e r19, com.yandex.metrica.impl.p265ob.C10391J4 r20) {
        /*
            r17 = this;
            r10 = r18
            r0 = r17
            r1 = r18
            r2 = r19
            com.yandex.metrica.impl.ob.D4 r4 = new com.yandex.metrica.impl.ob.D4
            r3 = r4
            r5 = r20
            r4.<init>(r10, r5)
            com.yandex.metrica.impl.ob.M1 r5 = new com.yandex.metrica.impl.ob.M1
            r4 = r5
            r5.<init>()
            com.yandex.metrica.impl.ob.L0 r6 = new com.yandex.metrica.impl.ob.L0
            r5 = r6
            r6.<init>()
            com.yandex.metrica.impl.ob.O0 r7 = new com.yandex.metrica.impl.ob.O0
            r6 = r7
            r7.<init>()
            com.yandex.metrica.impl.ob.fb r8 = new com.yandex.metrica.impl.ob.fb
            r7 = r8
            r8.<init>(r10)
            com.yandex.metrica.impl.ob.F3 r8 = com.yandex.metrica.impl.p265ob.C10238F3.m26224a()
            com.yandex.metrica.impl.ob.ei r11 = new com.yandex.metrica.impl.ob.ei
            r9 = r11
            r11.<init>(r10)
            com.yandex.metrica.impl.ob.P0 r10 = com.yandex.metrica.impl.p265ob.C10619P0.m27164i()
            com.yandex.metrica.impl.ob.E r10 = r10.mo61876c()
            com.yandex.metrica.impl.ob.P0 r11 = com.yandex.metrica.impl.p265ob.C10619P0.m27164i()
            com.yandex.metrica.impl.ob.o1 r11 = r11.mo61882j()
            com.yandex.metrica.impl.ob.W6 r11 = r11.mo63393c()
            com.yandex.metrica.impl.ob.j8 r12 = com.yandex.metrica.impl.p265ob.C11373j8.m29280a()
            com.yandex.metrica.impl.ob.P0 r13 = com.yandex.metrica.impl.p265ob.C10619P0.m27164i()
            com.yandex.metrica.impl.ob.zn r13 = r13.mo61891s()
            com.yandex.metrica.impl.ob.sn r13 = r13.mo64212f()
            com.yandex.metrica.impl.ob.P0 r14 = com.yandex.metrica.impl.p265ob.C10619P0.m27164i()
            com.yandex.metrica.impl.ob.zn r14 = r14.mo61891s()
            com.yandex.metrica.impl.ob.sn r14 = r14.mo64207b()
            com.yandex.metrica.impl.ob.K1 r16 = new com.yandex.metrica.impl.ob.K1
            r15 = r16
            r16.<init>()
            com.yandex.metrica.impl.ob.P0 r16 = com.yandex.metrica.impl.p265ob.C10619P0.m27164i()
            com.yandex.metrica.impl.ob.y2 r16 = r16.mo61888p()
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10120B1.<init>(android.content.Context, com.yandex.metrica.MetricaService$e, com.yandex.metrica.impl.ob.J4):void");
    }

    /* renamed from: a */
    public void mo61077a() {
        C10619P0.m27164i().mo61872a().mo63994a();
        if (!this.f24360b) {
            this.f24369k = C10619P0.m27164i().mo61893u();
            this.f24371m.mo61851a(this.f24361c);
            C10619P0.m27164i().mo61898z();
            C10470Lm.m26853c().mo61746d();
            this.f24368j = new C10188Dd(C11146dd.m28727a(this.f24361c), C11065b3.m28563a(this.f24361c), this.f24369k);
            this.f24359a = new C10675Qi.C10677b(this.f24361c).mo62085a();
            C10619P0.m27164i().mo61896x().mo62578a(this.f24359a);
            this.f24367i.mo61765b((C10484M1.C10489e) new C10236F1(this));
            this.f24367i.mo61766c((C10484M1.C10489e) new C10270G1(this));
            this.f24367i.mo61767d((C10484M1.C10489e) new C10325H1(this));
            this.f24367i.mo61768e((C10484M1.C10489e) new C10352I1(this));
            this.f24367i.mo61764a((C10484M1.C10489e) new C10386J1(this));
            this.f24373o.mo61257a(this, C10418K3.class, C10388J3.m26651a(new C10175D1(this)).mo61594a(new C10150C1(this)).mo61595a());
            C10619P0.m27164i().mo61892t().mo62818a(this.f24361c, this.f24359a);
            this.f24364f = new C11301h1(this.f24369k, this.f24359a.mo62030u(), new C10580Nm(), new C10691R2(), C10611Oh.m27142a());
            C10675Qi qi = this.f24359a;
            if (qi != null) {
                this.f24363e.mo62837b(qi);
            }
            m26008a(this.f24359a);
            C10416K1 k1 = this.f24379u;
            Context context = this.f24361c;
            C10178D4 d4 = this.f24366h;
            k1.getClass();
            this.f24370l = new C11225f2(context, d4, C10619P0.m27164i().mo61891s().mo64212f(), new C10442L0());
            YandexMetrica.getReporter(this.f24361c, "20799a27-fa80-4b36-b2db-0f8141f24180");
            File a = this.f24365g.mo61697a(this.f24361c, "appmetrica_crashes");
            if (a != null) {
                C10416K1 k12 = this.f24379u;
                C10820Um<File> um = this.f24381w;
                k12.getClass();
                this.f24374p = new C10304G7(a, um);
                ((C11725rn) this.f24378t).execute(new C11104c7(this.f24361c, a, this.f24381w));
                this.f24374p.mo61354a();
            }
            if (C10796U2.m27890a(21)) {
                C10416K1 k13 = this.f24379u;
                C11225f2 f2Var = this.f24370l;
                k13.getClass();
                this.f24382x = new C11070b8(new C11136d8(f2Var));
                this.f24380v = new C10204E1(this);
                if (this.f24376r.mo63060b()) {
                    this.f24382x.mo61783a();
                    ((C11725rn) this.f24383y).mo63614a(new C11556n8(), 1, TimeUnit.MINUTES);
                }
            }
            C10619P0.m27164i().mo61880g().mo61913a(this.f24359a);
            this.f24360b = true;
        } else {
            C11616p1.m29998a(this.f24361c).mo63449b(this.f24361c.getResources().getConfiguration());
        }
        if (C10796U2.m27890a(21)) {
            this.f24375q.mo62441a(this.f24380v);
        }
    }

    /* renamed from: c */
    public void mo61089c(Intent intent) {
        this.f24367i.mo61089c(intent);
    }

    /* renamed from: c */
    private Integer m26013c(Bundle bundle) {
        C10797U3 u3;
        bundle.setClassLoader(C10797U3.class.getClassLoader());
        String str = C10797U3.f25906c;
        try {
            u3 = (C10797U3) bundle.getParcelable("PROCESS_CFG_OBJ");
        } catch (Throwable unused) {
            u3 = null;
        }
        if (u3 == null) {
            return null;
        }
        return u3.mo62341g();
    }

    /* renamed from: b */
    static void m26010b(C10120B1 b1) {
        b1.f24363e.mo62836b();
    }

    /* renamed from: b */
    public void mo61086b() {
        if (C10796U2.m27890a(21)) {
            this.f24375q.mo62442b(this.f24380v);
        }
    }

    /* renamed from: b */
    public void mo61088b(Bundle bundle) {
        Integer c = m26013c(bundle);
        if (c != null) {
            this.f24377s.mo61212c(c.intValue());
        }
    }

    C10120B1(Context context, MetricaService.C10026e eVar, C10178D4 d4, C10484M1 m1, C10442L0 l0, C10583O0 o0, C11237fb fbVar, C10238F3 f3, C11211ei eiVar, C10199E e, C10876W6 w6, C11373j8 j8Var, C11769sn snVar, C11769sn snVar2, C10416K1 k1, C11969y2 y2Var) {
        this.f24360b = false;
        this.f24381w = new C10121a();
        this.f24361c = context;
        this.f24362d = eVar;
        this.f24366h = d4;
        this.f24367i = m1;
        this.f24365g = l0;
        this.f24371m = o0;
        this.f24372n = fbVar;
        this.f24373o = f3;
        this.f24363e = eiVar;
        this.f24377s = e;
        this.f24378t = snVar;
        this.f24383y = snVar2;
        this.f24379u = k1;
        this.f24375q = w6;
        this.f24376r = j8Var;
        this.f24384z = new C11260g2((C11968y1) this, context);
        this.f24358A = y2Var;
    }

    /* renamed from: b */
    private void m26009b(Intent intent, int i) {
        if (intent != null) {
            intent.getExtras().setClassLoader(CounterConfiguration.class.getClassLoader());
            boolean z = true;
            if (!(intent.getData() == null)) {
                Bundle extras = intent.getExtras();
                C10770T3 t3 = new C10770T3(extras);
                if (!C10770T3.m27780a(t3, this.f24361c)) {
                    C11411k0 a = C11411k0.m29405a(extras);
                    boolean z2 = a.f27298a == null;
                    if (C11413k1.EVENT_TYPE_UNDEFINED.mo63170b() != a.f27302e) {
                        z = false;
                    }
                    if (!z && !z2) {
                        try {
                            this.f24370l.mo62856a(C10153C4.m26091a(t3), a, new C10910X3(t3));
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
        this.f24362d.mo60881a(i);
    }

    /* renamed from: b */
    static void m26011b(C10120B1 b1, C10675Qi qi) {
        C10188Dd dd = b1.f24368j;
        if (dd != null) {
            dd.mo61186a(qi);
        }
    }

    /* renamed from: a */
    public void mo61080a(Intent intent, int i) {
        m26009b(intent, i);
    }

    /* renamed from: a */
    public void mo61081a(Intent intent, int i, int i2) {
        m26009b(intent, i2);
    }

    /* renamed from: a */
    public void mo61079a(Intent intent) {
        this.f24367i.mo61079a(intent);
    }

    /* renamed from: a */
    static void m26007a(C10120B1 b1, C10675Qi qi) {
        b1.f24359a = qi;
        C10155C6 c6 = new C10155C6(b1.f24361c);
        ((C11725rn) b1.f24383y).execute(new C10094A1(b1, c6));
        C10188Dd dd = b1.f24368j;
        if (dd != null) {
            dd.mo61186a(qi);
        }
        b1.f24364f.mo62986a(b1.f24359a.mo62030u());
        b1.f24372n.mo62896a(qi);
        b1.f24363e.mo62837b(qi);
    }

    /* renamed from: a */
    static void m26006a(C10120B1 b1, Intent intent) {
        b1.f24363e.mo62833a();
        b1.f24358A.mo64118a(C11993ym.m30995f(intent.getStringExtra("screen_size")));
    }

    @Deprecated
    /* renamed from: a */
    public void mo61085a(String str, int i, String str2, Bundle bundle) {
        bundle.setClassLoader(CounterConfiguration.class.getClassLoader());
        this.f24370l.mo62858a(new C11411k0(str2, str, i, new C10580Nm()), bundle);
    }

    /* renamed from: a */
    public void mo61078a(int i, Bundle bundle) {
        this.f24384z.mo62926a(i, bundle);
    }

    /* renamed from: a */
    public void mo61082a(Bundle bundle) {
        Integer c = m26013c(bundle);
        if (c != null) {
            this.f24377s.mo61210b(c.intValue());
        }
    }

    /* renamed from: a */
    public void mo61083a(MetricaService.C10026e eVar) {
        this.f24362d = eVar;
    }

    /* renamed from: a */
    public void mo61084a(File file) {
        this.f24370l.mo62859a(file);
    }

    /* renamed from: a */
    private void m26008a(C10675Qi qi) {
        C10188Dd dd = this.f24368j;
        if (dd != null) {
            dd.mo61186a(qi);
        }
    }
}
