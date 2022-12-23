package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.impl.p265ob.C11892w;

/* renamed from: com.yandex.metrica.impl.ob.Ad */
class C10106Ad implements C11561nd {

    /* renamed from: a */
    private final Context f24316a;

    /* renamed from: b */
    private C10675Qi f24317b;

    /* renamed from: c */
    private volatile C10807Uc f24318c;

    /* renamed from: d */
    private final C10129B8 f24319d;

    /* renamed from: e */
    private final C10101A8 f24320e;

    /* renamed from: f */
    private final C10616Om f24321f;

    /* renamed from: g */
    private final C10603Od f24322g;

    /* renamed from: h */
    private final C11892w f24323h;

    /* renamed from: i */
    private final C11892w.C11897c f24324i;

    /* renamed from: j */
    private final C11769sn f24325j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f24326k;

    /* renamed from: com.yandex.metrica.impl.ob.Ad$a */
    class C10107a implements C11892w.C11897c {
        C10107a() {
        }

        /* renamed from: a */
        public void mo61059a() {
            boolean unused = C10106Ad.this.f24326k = true;
            C10106Ad.this.m25983b();
        }
    }

    public C10106Ad(Context context, C10675Qi qi, C10807Uc uc, C10129B8 b8, C10101A8 a8, C11769sn snVar) {
        this(context, qi, uc, b8, a8, snVar, new C10580Nm(), new C10603Od(), C10619P0.m27164i().mo61872a());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25983b() {
        C10688R1 l = C10619P0.m27164i().mo61884l();
        C10807Uc uc = this.f24318c;
        if (uc != null && l != null) {
            l.mo62102b(this.f24322g.mo61859a(this.f24316a, this.f24317b, uc, this));
        }
    }

    /* renamed from: a */
    public void mo61056a() {
        if (!(m25982a((C11709r8) this.f24319d) || m25982a((C11709r8) this.f24320e))) {
            return;
        }
        if (!this.f24326k) {
            this.f24323h.mo63995a(C11892w.f28609c, this.f24325j, this.f24324i);
        } else {
            m25983b();
        }
    }

    C10106Ad(Context context, C10675Qi qi, C10807Uc uc, C10129B8 b8, C10101A8 a8, C11769sn snVar, C10616Om om, C10603Od od, C11892w wVar) {
        this.f24326k = false;
        this.f24316a = context;
        this.f24318c = uc;
        this.f24317b = qi;
        this.f24319d = b8;
        this.f24320e = a8;
        this.f24325j = snVar;
        this.f24321f = om;
        this.f24322g = od;
        this.f24323h = wVar;
        this.f24324i = new C10107a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m25982a(com.yandex.metrica.impl.p265ob.C11709r8 r10) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.Uc r0 = r9.f24318c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x003f
            com.yandex.metrica.impl.ob.Uc r0 = r9.f24318c
            if (r0 == 0) goto L_0x001c
            int r0 = r0.f25912c
            long r3 = (long) r0
            long r5 = r10.mo63591c()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 != 0) goto L_0x0040
            com.yandex.metrica.impl.ob.Uc r0 = r9.f24318c
            if (r0 == 0) goto L_0x003b
            long r3 = r0.f25914e
            com.yandex.metrica.impl.ob.Om r0 = r9.f24321f
            long r5 = r0.mo61840a()
            long r7 = r10.mo63589b()
            long r5 = r5 - r7
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 <= 0) goto L_0x0036
            r10 = 1
            goto L_0x0037
        L_0x0036:
            r10 = 0
        L_0x0037:
            if (r10 == 0) goto L_0x003b
            r10 = 1
            goto L_0x003c
        L_0x003b:
            r10 = 0
        L_0x003c:
            if (r10 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10106Ad.m25982a(com.yandex.metrica.impl.ob.r8):boolean");
    }

    /* renamed from: a */
    public void mo61057a(C10675Qi qi) {
        this.f24317b = qi;
    }

    /* renamed from: a */
    public void mo61058a(C10807Uc uc) {
        this.f24318c = uc;
    }
}
