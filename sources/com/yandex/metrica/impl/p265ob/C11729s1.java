package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import com.yandex.metrica.C10031a;
import com.yandex.metrica.C12043l;
import com.yandex.metrica.PreloadInfo;
import com.yandex.metrica.impl.p265ob.C11296h;
import com.yandex.metrica.impl.p265ob.C11962y;
import com.yandex.metrica.impl.p265ob.C11997z;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.s1 */
public class C11729s1 extends C10382J implements C10794U0 {

    /* renamed from: A */
    private static final Long f28099A = Long.valueOf(TimeUnit.SECONDS.toMillis(5));

    /* renamed from: z */
    private static final C11829uo<String> f28100z = new C11726ro(new C11666po("Referral url"));

    /* renamed from: p */
    private final C10031a f28101p;

    /* renamed from: q */
    private final C10165Cg f28102q;

    /* renamed from: r */
    private final C12043l f28103r;

    /* renamed from: s */
    private final C10373Ii f28104s;

    /* renamed from: t */
    private C11296h f28105t;

    /* renamed from: u */
    private final C11005Zl f28106u;

    /* renamed from: v */
    private final C11997z f28107v;

    /* renamed from: w */
    private final AtomicBoolean f28108w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final C10206E3 f28109x;

    /* renamed from: y */
    private final C10696R7 f28110y;

    /* renamed from: com.yandex.metrica.impl.ob.s1$a */
    class C11730a implements C11296h.C11298b {

        /* renamed from: a */
        final /* synthetic */ C11769sn f28111a;

        /* renamed from: b */
        final /* synthetic */ C11543n1 f28112b;

        /* renamed from: c */
        final /* synthetic */ C10738S2 f28113c;

        /* renamed from: d */
        final /* synthetic */ C10738S2 f28114d;

        /* renamed from: com.yandex.metrica.impl.ob.s1$a$a */
        class C11731a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C11189e7 f28116a;

            C11731a(C11189e7 e7Var) {
                this.f28116a = e7Var;
            }

            public void run() {
                C11729s1.this.mo61571a(this.f28116a);
                if (C11730a.this.f28112b.mo63331a(this.f28116a.f26798a.f27721f)) {
                    C11730a.this.f28113c.mo62219a().mo61571a(this.f28116a);
                }
                if (C11730a.this.f28112b.mo63332b(this.f28116a.f26798a.f27721f)) {
                    C11730a.this.f28114d.mo62219a().mo61571a(this.f28116a);
                }
            }
        }

        C11730a(C11769sn snVar, C11543n1 n1Var, C10738S2 s2, C10738S2 s22) {
            this.f28111a = snVar;
            this.f28112b = n1Var;
            this.f28113c = s2;
            this.f28114d = s22;
        }

        /* renamed from: a */
        public void mo62982a() {
            C11189e7 a = C11729s1.this.f28109x.mo61216a();
            ((C11725rn) this.f28111a).execute(new C11731a(a));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.s1$b */
    class C11732b implements C10031a.C10032a {
        C11732b() {
        }

        /* renamed from: a */
        public void mo60928a() {
            C11729s1 s1Var = C11729s1.this;
            s1Var.f24939i.mo63334a(s1Var.f24932b.mo62271a());
        }

        /* renamed from: b */
        public void mo60929b() {
            C11729s1 s1Var = C11729s1.this;
            s1Var.f24939i.mo63353b(s1Var.f24932b.mo62271a());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.s1$c */
    static class C11733c {
        C11733c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C11005Zl mo63622a(Context context, C11769sn snVar, C10248F9 f9, C11729s1 s1Var, C10373Ii ii) {
            return new C11005Zl(context, f9, s1Var, snVar, ii.mo61555d());
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C11729s1(android.content.Context r26, com.yandex.metrica.impl.p265ob.C10797U3 r27, com.yandex.metrica.C12043l r28, com.yandex.metrica.impl.p265ob.C11544n2 r29, com.yandex.metrica.impl.p265ob.C10696R7 r30, com.yandex.metrica.impl.p265ob.C10373Ii r31, com.yandex.metrica.impl.p265ob.C10738S2 r32, com.yandex.metrica.impl.p265ob.C10738S2 r33, com.yandex.metrica.impl.p265ob.C10248F9 r34, com.yandex.metrica.impl.p265ob.C10165Cg r35, com.yandex.metrica.impl.p265ob.C10941Y r36, com.yandex.metrica.impl.p265ob.C10415K0 r37) {
        /*
            r25 = this;
            r2 = r28
            com.yandex.metrica.impl.ob.k2 r5 = new com.yandex.metrica.impl.ob.k2
            com.yandex.metrica.CounterConfiguration r0 = new com.yandex.metrica.CounterConfiguration
            com.yandex.metrica.CounterConfiguration$b r1 = com.yandex.metrica.CounterConfiguration.C10019b.MAIN
            r0.<init>(r2, r1)
            java.lang.String r1 = r2.userProfileID
            r3 = r27
            r5.<init>(r3, r0, r1)
            com.yandex.metrica.a r6 = new com.yandex.metrica.a
            java.lang.Integer r0 = r2.sessionTimeout
            if (r0 != 0) goto L_0x0021
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r3 = 10
            long r0 = r0.toMillis(r3)
            goto L_0x0026
        L_0x0021:
            int r0 = r0.intValue()
            long r0 = (long) r0
        L_0x0026:
            r6.<init>(r0)
            com.yandex.metrica.impl.ob.n1 r0 = new com.yandex.metrica.impl.ob.n1
            r9 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.Hm r10 = r36.mo62505j()
            com.yandex.metrica.impl.ob.sn r14 = r36.mo62499c()
            com.yandex.metrica.impl.ob.s1$c r0 = new com.yandex.metrica.impl.ob.s1$c
            r16 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.z r0 = new com.yandex.metrica.impl.ob.z
            r17 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.xh r0 = new com.yandex.metrica.impl.ob.xh
            r18 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.wh r0 = new com.yandex.metrica.impl.ob.wh
            r19 = r0
            java.lang.String r1 = r2.appVersion
            java.lang.String r3 = r2.f28945a
            r0.<init>(r1, r3)
            com.yandex.metrica.impl.ob.a7 r0 = new com.yandex.metrica.impl.ob.a7
            r20 = r0
            r15 = r37
            r0.<init>(r15)
            com.yandex.metrica.impl.ob.F7 r0 = new com.yandex.metrica.impl.ob.F7
            r21 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.A7 r0 = new com.yandex.metrica.impl.ob.A7
            r22 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.u7 r0 = new com.yandex.metrica.impl.ob.u7
            r23 = r0
            r0.<init>()
            com.yandex.metrica.impl.ob.s7 r0 = new com.yandex.metrica.impl.ob.s7
            r24 = r0
            r0.<init>()
            r0 = r25
            r1 = r26
            r2 = r28
            r3 = r29
            r4 = r30
            r7 = r35
            r8 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11729s1.<init>(android.content.Context, com.yandex.metrica.impl.ob.U3, com.yandex.metrica.l, com.yandex.metrica.impl.ob.n2, com.yandex.metrica.impl.ob.R7, com.yandex.metrica.impl.ob.Ii, com.yandex.metrica.impl.ob.S2, com.yandex.metrica.impl.ob.S2, com.yandex.metrica.impl.ob.F9, com.yandex.metrica.impl.ob.Cg, com.yandex.metrica.impl.ob.Y, com.yandex.metrica.impl.ob.K0):void");
    }

    /* renamed from: h */
    private void m30238h() {
        this.f24939i.mo63334a(this.f24932b.mo62271a());
        this.f28101p.mo60926a(new C11732b(), f28099A.longValue());
    }

    /* renamed from: a */
    public void mo61678a(boolean z) {
    }

    /* renamed from: b */
    public void mo61679b(Activity activity) {
        if (this.f28107v.mo64179a(activity, C11997z.C11998a.PAUSED)) {
            String str = null;
            if (activity != null) {
                str = activity.getClass().getSimpleName();
            }
            mo61582d(str);
            this.f28101p.mo60925a();
            if (activity != null) {
                this.f28106u.mo62597a(activity);
            }
        }
    }

    /* renamed from: c */
    public void mo61581c(String str, String str2) {
        super.mo61581c(str, str2);
        this.f28110y.mo62109a(this.f24932b.f27371c.mo61413a());
    }

    /* renamed from: g */
    public final void mo63620g() {
        if (this.f28108w.compareAndSet(false, true)) {
            this.f28105t.mo62980c();
        }
    }

    /* renamed from: a */
    public void mo61676a(String str, boolean z) {
        if (this.f24933c.mo64227c()) {
            this.f24933c.mo64223b("App opened via deeplink: " + mo61585f(str));
        }
        this.f24939i.mo63341a(C10385J0.m26637a("open", str, z, this.f24933c), this.f24932b);
    }

    /* renamed from: b */
    public void mo61681b(boolean z) {
        this.f24932b.mo62272b().mo60800b(z);
    }

    /* renamed from: b */
    public void mo61680b(JSONObject jSONObject) {
        C11544n2 n2Var = this.f24939i;
        C10380Im im = this.f24933c;
        List<Integer> list = C10385J0.f24953i;
        n2Var.mo63341a((C11411k0) new C10734S(jSONObject.toString(), "view_tree", C11413k1.EVENT_TYPE_VIEW_TREE.mo63170b(), 0, im), this.f24932b);
    }

    /* renamed from: a */
    public void mo61675a(String str) {
        ((C11726ro) f28100z).mo61590a(str);
        this.f24939i.mo63341a(C10385J0.m26637a("referral", str, false, this.f24933c), this.f24932b);
        if (this.f24933c.mo64227c()) {
            this.f24933c.mo64223b("Referral URL received: " + mo61585f(str));
        }
    }

    /* renamed from: a */
    public void mo61674a(C11962y.C11965c cVar) {
        if (cVar == C11962y.C11965c.WATCHING) {
            if (this.f24933c.mo64227c()) {
                this.f24933c.mo64223b("Enable activity auto tracking");
            }
        } else if (this.f24933c.mo64227c()) {
            C10380Im im = this.f24933c;
            im.mo64225c("Could not enable activity auto tracking. " + cVar.f28747a);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C11729s1(android.content.Context r17, com.yandex.metrica.C12043l r18, com.yandex.metrica.impl.p265ob.C11544n2 r19, com.yandex.metrica.impl.p265ob.C10696R7 r20, com.yandex.metrica.impl.p265ob.C11414k2 r21, com.yandex.metrica.C10031a r22, com.yandex.metrica.impl.p265ob.C10165Cg r23, com.yandex.metrica.impl.p265ob.C10373Ii r24, com.yandex.metrica.impl.p265ob.C11543n1 r25, com.yandex.metrica.impl.p265ob.C10348Hm r26, com.yandex.metrica.impl.p265ob.C10738S2 r27, com.yandex.metrica.impl.p265ob.C10738S2 r28, com.yandex.metrica.impl.p265ob.C10248F9 r29, com.yandex.metrica.impl.p265ob.C11769sn r30, com.yandex.metrica.impl.p265ob.C10415K0 r31, com.yandex.metrica.impl.p265ob.C11729s1.C11733c r32, com.yandex.metrica.impl.p265ob.C11997z r33, com.yandex.metrica.impl.p265ob.C11950xh r34, com.yandex.metrica.impl.p265ob.C11915wh r35, com.yandex.metrica.impl.p265ob.C11027a7 r36, com.yandex.metrica.impl.p265ob.C10246F7 r37, com.yandex.metrica.impl.p265ob.C10100A7 r38, com.yandex.metrica.impl.p265ob.C11809u7 r39, com.yandex.metrica.impl.p265ob.C11739s7 r40) {
        /*
            r16 = this;
            r13 = r16
            r14 = r18
            r15 = r24
            com.yandex.metrica.rtm.wrapper.k r0 = r19.mo63352b()
            java.lang.String r1 = r14.apiKey
            r2 = 1
            r3 = r34
            com.yandex.metrica.rtm.wrapper.d r6 = r3.mo64080a(r0, r1, r2)
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r21
            r4 = r31
            r5 = r26
            r7 = r35
            r8 = r37
            r9 = r38
            r10 = r39
            r11 = r40
            r12 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r13.f28108w = r0
            com.yandex.metrica.impl.ob.E3 r0 = new com.yandex.metrica.impl.ob.E3
            r0.<init>()
            r13.f28109x = r0
            com.yandex.metrica.impl.ob.k2 r0 = r13.f24932b
            com.yandex.metrica.impl.ob.Pe r1 = r13.m30235a((com.yandex.metrica.C12043l) r14)
            r0.mo63173a((com.yandex.metrica.impl.p265ob.C10640Pe) r1)
            r0 = r22
            r13.f28101p = r0
            r0 = r23
            r13.f28102q = r0
            r1 = r20
            r13.f28110y = r1
            r13.f28103r = r14
            r1 = r33
            r13.f28107v = r1
            r31 = r32
            r32 = r17
            r33 = r30
            r34 = r29
            r35 = r16
            r36 = r24
            com.yandex.metrica.impl.ob.Zl r1 = r31.mo63622a(r32, r33, r34, r35, r36)
            r13.f28106u = r1
            r13.f28104s = r15
            r15.mo61548a((com.yandex.metrica.impl.p265ob.C10410Jl) r1)
            java.lang.Boolean r1 = r14.nativeCrashReporting
            com.yandex.metrica.impl.ob.k2 r2 = r13.f24932b
            r13.m30237a((java.lang.Boolean) r1, (com.yandex.metrica.impl.p265ob.C11414k2) r2)
            r24.mo61552b()
            r23.mo61151a()
            r0 = r25
            r1 = r27
            r2 = r28
            r3 = r30
            com.yandex.metrica.impl.ob.h r0 = r13.m30236a(r3, r0, r1, r2)
            r13.f28105t = r0
            java.lang.Boolean r0 = r14.f28955k
            boolean r0 = com.yandex.metrica.impl.p265ob.C11327i.m29171a((java.lang.Boolean) r0)
            if (r0 == 0) goto L_0x0095
            r16.mo63620g()
        L_0x0095:
            r16.m30238h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11729s1.<init>(android.content.Context, com.yandex.metrica.l, com.yandex.metrica.impl.ob.n2, com.yandex.metrica.impl.ob.R7, com.yandex.metrica.impl.ob.k2, com.yandex.metrica.a, com.yandex.metrica.impl.ob.Cg, com.yandex.metrica.impl.ob.Ii, com.yandex.metrica.impl.ob.n1, com.yandex.metrica.impl.ob.Hm, com.yandex.metrica.impl.ob.S2, com.yandex.metrica.impl.ob.S2, com.yandex.metrica.impl.ob.F9, com.yandex.metrica.impl.ob.sn, com.yandex.metrica.impl.ob.K0, com.yandex.metrica.impl.ob.s1$c, com.yandex.metrica.impl.ob.z, com.yandex.metrica.impl.ob.xh, com.yandex.metrica.impl.ob.wh, com.yandex.metrica.impl.ob.a7, com.yandex.metrica.impl.ob.F7, com.yandex.metrica.impl.ob.A7, com.yandex.metrica.impl.ob.u7, com.yandex.metrica.impl.ob.s7):void");
    }

    /* renamed from: a */
    public void mo61670a(Activity activity) {
        if (this.f28107v.mo64179a(activity, C11997z.C11998a.RESUMED)) {
            String str = null;
            if (activity != null) {
                str = activity.getClass().getSimpleName();
            }
            mo61583e(str);
            this.f28101p.mo60927b();
            if (activity != null) {
                this.f28106u.mo62599b(activity);
            }
        }
    }

    /* renamed from: a */
    public void mo61671a(Location location) {
        this.f24932b.mo62272b().mo60795a(location);
        if (this.f24933c.mo64227c()) {
            this.f24933c.mo64220a("Set location: %s", location);
        }
    }

    /* renamed from: a */
    private C11296h m30236a(C11769sn snVar, C11543n1 n1Var, C10738S2 s2, C10738S2 s22) {
        return new C11296h(new C11730a(snVar, n1Var, s2, s22));
    }

    /* renamed from: a */
    public void mo61677a(JSONObject jSONObject) {
        C11544n2 n2Var = this.f24939i;
        C10380Im im = this.f24933c;
        List<Integer> list = C10385J0.f24953i;
        n2Var.mo63341a((C11411k0) new C10734S(jSONObject.toString(), "view_tree", C11413k1.EVENT_TYPE_RAW_VIEW_TREE.mo63170b(), 0, im), this.f24932b);
    }

    /* renamed from: a */
    public void mo61672a(C10615Ol ol, boolean z) {
        this.f28106u.mo62598a(ol, z);
    }

    /* renamed from: a */
    public void mo61673a(C10908X2 x2) {
        x2.mo62465a(this.f24933c);
    }

    /* renamed from: a */
    private void m30237a(Boolean bool, C11414k2 k2Var) {
        Boolean bool2 = Boolean.TRUE;
        if (bool == null) {
            bool = bool2;
        }
        boolean booleanValue = bool.booleanValue();
        this.f28110y.mo62110a(booleanValue, k2Var.mo62272b().mo60794a(), k2Var.f27371c.mo61413a());
        if (this.f24933c.mo64227c()) {
            this.f24933c.mo64220a("Set report native crashes enabled: %b", Boolean.valueOf(booleanValue));
        }
    }

    /* renamed from: a */
    private C10640Pe m30235a(C12043l lVar) {
        PreloadInfo preloadInfo = lVar.preloadInfo;
        C10380Im im = this.f24933c;
        Boolean bool = lVar.f28953i;
        Boolean bool2 = Boolean.FALSE;
        if (bool == null) {
            bool = bool2;
        }
        return new C10640Pe(preloadInfo, im, bool.booleanValue());
    }
}
