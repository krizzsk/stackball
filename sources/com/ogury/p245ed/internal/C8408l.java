package com.ogury.p245ed.internal;

import android.content.Context;
import com.ogury.core.internal.OguryEventCallback;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p245ed.internal.C8122cw;
import java.util.ArrayList;
import java.util.List;
import p269io.presage.common.AdConfig;
import p269io.presage.common.PresageSdk;
import p269io.presage.common.PresageSdkInitCallback;
import p269io.presage.common.network.models.RewardItem;

/* renamed from: com.ogury.ed.internal.l */
public final class C8408l implements C8324ig {

    /* renamed from: a */
    public static final C8409a f21639a = new C8409a((byte) 0);

    /* renamed from: b */
    private final Context f21640b;

    /* renamed from: c */
    private final AdConfig f21641c;

    /* renamed from: d */
    private final C8320id f21642d;

    /* renamed from: e */
    private final C8233fn f21643e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C8147di f21644f;

    /* renamed from: g */
    private final C8288hg f21645g;

    /* renamed from: h */
    private final C8321ie f21646h;

    /* renamed from: i */
    private final C8158dm f21647i;

    /* renamed from: j */
    private final C8352j f21648j;

    /* renamed from: k */
    private final C8229fk f21649k;

    /* renamed from: l */
    private final C8193ej f21650l;

    /* renamed from: m */
    private final C8126cz f21651m;

    /* renamed from: n */
    private final C8316i f21652n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f21653o;

    /* renamed from: p */
    private String f21654p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public List<C8185eb> f21655q;

    /* renamed from: r */
    private C8280h f21656r;

    /* renamed from: s */
    private C8381k f21657s;

    /* renamed from: t */
    private PresageSdk f21658t;

    /* renamed from: u */
    private C8432lk<? super RewardItem, C8386ke> f21659u;

    /* renamed from: v */
    private C8203es f21660v;

    /* renamed from: w */
    private boolean f21661w;

    /* renamed from: x */
    private boolean f21662x;

    /* renamed from: y */
    private OguryEventCallback f21663y;

    private C8408l(Context context, AdConfig adConfig, C8320id idVar, C8233fn fnVar, C8147di diVar, C8288hg hgVar, C8321ie ieVar, C8158dm dmVar, C8352j jVar, C8229fk fkVar, C8193ej ejVar, C8126cz czVar, C8316i iVar) {
        this.f21640b = context;
        this.f21641c = adConfig;
        this.f21642d = idVar;
        this.f21643e = fnVar;
        this.f21644f = diVar;
        this.f21645g = hgVar;
        this.f21646h = ieVar;
        this.f21647i = dmVar;
        this.f21648j = jVar;
        this.f21649k = fkVar;
        this.f21650l = ejVar;
        this.f21651m = czVar;
        this.f21652n = iVar;
        this.f21654p = "";
        this.f21655q = new ArrayList();
        this.f21658t = PresageSdk.f44180a;
        this.f21662x = true;
    }

    /* renamed from: a */
    public final boolean mo53931a() {
        return this.f21653o;
    }

    /* renamed from: a */
    public final void mo53930a(String str) {
        C8467mq.m23881b(str, "<set-?>");
        this.f21654p = str;
    }

    /* renamed from: a */
    public final void mo53926a(C8280h hVar) {
        this.f21656r = hVar;
    }

    /* renamed from: b */
    public final C8280h mo53932b() {
        return this.f21656r;
    }

    /* renamed from: a */
    public final void mo53927a(C8381k kVar) {
        this.f21657s = kVar;
    }

    /* renamed from: a */
    public final void mo53928a(C8432lk<? super RewardItem, C8386ke> lkVar) {
        this.f21659u = lkVar;
    }

    /* renamed from: a */
    public final void mo53925a(C8203es esVar) {
        this.f21660v = esVar;
    }

    /* renamed from: c */
    public final boolean mo53934c() {
        return this.f21662x;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C8408l(android.content.Context r5, p269io.presage.common.AdConfig r6, com.ogury.p245ed.internal.C8193ej r7) {
        /*
            r4 = this;
            com.ogury.ed.internal.j r0 = new com.ogury.ed.internal.j
            android.content.Context r1 = r5.getApplicationContext()
            java.lang.String r2 = "constructor(\n        con…AdsCallbackFilter()\n    )"
            com.ogury.p245ed.internal.C8467mq.m23878a((java.lang.Object) r1, (java.lang.String) r2)
            com.ogury.ed.internal.fu r2 = new com.ogury.ed.internal.fu
            r2.<init>()
            com.ogury.ed.internal.gc r3 = new com.ogury.ed.internal.gc
            r3.<init>()
            com.ogury.ed.internal.gb r3 = (com.ogury.p245ed.internal.C8251gb) r3
            r0.<init>(r1, r2, r3, r7)
            r4.<init>(r5, r6, r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p245ed.internal.C8408l.<init>(android.content.Context, io.presage.common.AdConfig, com.ogury.ed.internal.ej):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C8408l(android.content.Context r17, p269io.presage.common.AdConfig r18, com.ogury.p245ed.internal.C8193ej r19, com.ogury.p245ed.internal.C8352j r20) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "context"
            com.ogury.p245ed.internal.C8467mq.m23881b(r0, r1)
            java.lang.String r1 = "adType"
            r13 = r19
            com.ogury.p245ed.internal.C8467mq.m23881b(r13, r1)
            java.lang.String r1 = "adsConditionsChecker"
            r11 = r20
            com.ogury.p245ed.internal.C8467mq.m23881b(r11, r1)
            android.content.Context r3 = r17.getApplicationContext()
            java.lang.String r1 = "context.applicationContext"
            com.ogury.p245ed.internal.C8467mq.m23878a((java.lang.Object) r3, (java.lang.String) r1)
            com.ogury.ed.internal.id r5 = com.ogury.p245ed.internal.C8320id.f21501a
            com.ogury.ed.internal.fn r6 = com.ogury.p245ed.internal.C8233fn.f21330a
            com.ogury.ed.internal.di r7 = com.ogury.p245ed.internal.C8147di.f21106a
            com.ogury.ed.internal.hg r8 = com.ogury.p245ed.internal.C8288hg.f21407a
            com.ogury.ed.internal.ie$a r1 = com.ogury.p245ed.internal.C8321ie.f21507a
            com.ogury.ed.internal.ie r9 = com.ogury.p245ed.internal.C8321ie.C8322a.m23488a(r17)
            com.ogury.ed.internal.dm r10 = new com.ogury.ed.internal.dm
            r10.<init>(r0)
            com.ogury.ed.internal.fk$a r1 = com.ogury.p245ed.internal.C8229fk.f21305a
            com.ogury.ed.internal.fk r12 = com.ogury.p245ed.internal.C8229fk.C8230a.m23074a(r17)
            com.ogury.ed.internal.cz r14 = com.ogury.p245ed.internal.C8126cz.f21060a
            com.ogury.ed.internal.i r15 = new com.ogury.ed.internal.i
            r15.<init>()
            r2 = r16
            r4 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p245ed.internal.C8408l.<init>(android.content.Context, io.presage.common.AdConfig, com.ogury.ed.internal.ej, com.ogury.ed.internal.j):void");
    }

    /* renamed from: com.ogury.ed.internal.l$a */
    public static final class C8409a {
        public /* synthetic */ C8409a(byte b) {
            this();
        }

        private C8409a() {
        }
    }

    /* renamed from: a */
    public final void mo53737a(C8185eb ebVar) {
        C8467mq.m23881b(ebVar, "ad");
        m23790c("Ad " + ebVar.mo53350f() + " expired");
        m23778a(4);
        this.f21655q.remove(ebVar);
    }

    /* renamed from: d */
    public final void mo53935d() {
        StringBuilder sb = new StringBuilder("Loading ad unit [");
        AdConfig adConfig = this.f21641c;
        sb.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb.append("]...");
        m23790c(sb.toString());
        if (this.f21648j.mo53796b()) {
            m23790c("Impossible to join Ogury servers. No Internet connection");
            m23778a(1);
        } else if (PresageSdk.m45484c()) {
            m23790c("Module setup issue");
            m23778a(6);
        } else if (PresageSdk.m45482a()) {
            m23790c("Module setup is still in progress");
            m23796g();
        } else if (C8352j.m23658a()) {
            m23790c("Module not set up");
            m23793f();
        } else {
            m23797h();
        }
    }

    /* renamed from: b */
    public final void mo53933b(String str) {
        C8467mq.m23881b(str, "adMarkup");
        StringBuilder sb = new StringBuilder("Loading ad unit [");
        AdConfig adConfig = this.f21641c;
        sb.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb.append("]...");
        m23790c(sb.toString());
        this.f21647i.mo53309a(str, this.f21650l).mo53285a(new C8416h(this)).mo53286b(new C8417i(this));
    }

    /* renamed from: com.ogury.ed.internal.l$h */
    static final class C8416h extends C8468mr implements C8432lk<Throwable, C8386ke> {

        /* renamed from: a */
        final /* synthetic */ C8408l f21669a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8416h(C8408l lVar) {
            super(1);
            this.f21669a = lVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53077a(Object obj) {
            m23828a((Throwable) obj);
            return C8386ke.f21633a;
        }

        /* renamed from: a */
        private void m23828a(Throwable th) {
            C8467mq.m23881b(th, "errorThrowable");
            this.f21669a.m23790c(C8467mq.m23873a("Failed to load (", (Object) th.getMessage()));
            this.f21669a.m23778a(0);
        }
    }

    /* renamed from: com.ogury.ed.internal.l$i */
    static final class C8417i extends C8468mr implements C8432lk<C8192ei, C8386ke> {

        /* renamed from: a */
        final /* synthetic */ C8408l f21670a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8417i(C8408l lVar) {
            super(1);
            this.f21670a = lVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53077a(Object obj) {
            m23830a((C8192ei) obj);
            return C8386ke.f21633a;
        }

        /* renamed from: a */
        private void m23830a(C8192ei eiVar) {
            C8467mq.m23881b(eiVar, "adResponse");
            C8147di unused = this.f21670a.f21644f;
            C8185eb ebVar = (C8185eb) C8394km.m23764b(eiVar.mo53402a());
            C8147di.m22716a((C8146dh) new C8156dk("LOAD", ebVar == null ? null : ebVar.mo53328A()));
            this.f21670a.m23790c("LOAD event");
            this.f21670a.m23779a(eiVar);
        }
    }

    /* renamed from: f */
    private final void m23793f() {
        m23790c("Trying to set up module...");
        String i = this.f21649k.mo53521i();
        if (i.length() == 0) {
            m23790c("Impossible to set up module (no asset key found)");
            m23778a(5);
            return;
        }
        PresageSdk.init(this.f21640b, i);
        m23796g();
    }

    /* renamed from: com.ogury.ed.internal.l$b */
    public static final class C8410b implements PresageSdkInitCallback {

        /* renamed from: a */
        final /* synthetic */ C8408l f21664a;

        C8410b(C8408l lVar) {
            this.f21664a = lVar;
        }

        public final void onSdkNotInitialized() {
            this.f21664a.m23790c("Failed to set up module");
            this.f21664a.m23778a(5);
        }

        public final void onSdkInitialized() {
            this.f21664a.m23797h();
        }

        public final void onSdkInitFailed() {
            this.f21664a.m23778a(6);
        }
    }

    /* renamed from: g */
    private final void m23796g() {
        m23790c("Waiting for module setup...");
        this.f21658t.addSdkInitCallback(new C8410b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m23797h() {
        m23790c("Syncing with consent...");
        C8126cz.m22645a(this.f21663y);
        this.f21663y = C8126cz.m22642a((C8431lj<C8386ke>) new C8421m(this));
    }

    /* renamed from: com.ogury.ed.internal.l$m */
    /* synthetic */ class C8421m extends C8466mp implements C8431lj<C8386ke> {
        C8421m(Object obj) {
            super(0, obj, C8408l.class, "checkProfig", "checkProfig()V");
        }

        /* renamed from: h */
        private void m23839h() {
            ((C8408l) this.f21679a).m23799i();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo53190a() {
            m23839h();
            return C8386ke.f21633a;
        }
    }

    /* renamed from: com.ogury.ed.internal.l$c */
    /* synthetic */ class C8411c extends C8466mp implements C8431lj<C8232fm> {
        C8411c(Object obj) {
            super(0, obj, C8408l.class, "getProfigAndSyncIfNeeded", "getProfigAndSyncIfNeeded()Lio/presage/common/profig/data/ProfigFullResponse;");
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public C8232fm mo53190a() {
            return ((C8408l) this.f21679a).m23800j();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m23799i() {
        m23790c("Retrieving configuration...");
        C8122cw.C8123a aVar = C8122cw.f21054a;
        C8122cw.C8123a.m22639a(new C8411c(this)).mo53285a(new C8412d(this)).mo53286b(new C8413e(this));
    }

    /* renamed from: com.ogury.ed.internal.l$d */
    static final class C8412d extends C8468mr implements C8432lk<Throwable, C8386ke> {

        /* renamed from: a */
        final /* synthetic */ C8408l f21665a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8412d(C8408l lVar) {
            super(1);
            this.f21665a = lVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53077a(Object obj) {
            m23820a((Throwable) obj);
            return C8386ke.f21633a;
        }

        /* renamed from: a */
        private void m23820a(Throwable th) {
            C8467mq.m23881b(th, "it");
            this.f21665a.m23790c("Failed. Configuration not synced");
            this.f21665a.m23778a(3);
        }
    }

    /* renamed from: com.ogury.ed.internal.l$e */
    static final class C8413e extends C8468mr implements C8432lk<C8232fm, C8386ke> {

        /* renamed from: a */
        final /* synthetic */ C8408l f21666a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8413e(C8408l lVar) {
            super(1);
            this.f21666a = lVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53077a(Object obj) {
            m23822a((C8232fm) obj);
            return C8386ke.f21633a;
        }

        /* renamed from: a */
        private void m23822a(C8232fm fmVar) {
            this.f21666a.m23780a(fmVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final C8232fm m23800j() {
        C8232fm a = C8233fn.m23113a(this.f21640b);
        if (!this.f21649k.mo53523k() && a != null) {
            return a;
        }
        m23790c("Configuration need to be synced");
        C8233fn.m23115b(this.f21640b);
        return C8233fn.m23113a(this.f21640b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23780a(C8232fm fmVar) {
        if (fmVar == null) {
            m23790c("Failed. Configuration not synced");
            m23778a(3);
        } else if (!fmVar.mo53532b()) {
            m23790c("Failed. Ad serving has been disabled");
            m23778a(2);
        } else {
            m23790c("Configuration successfully retrieved");
            C8147di.m22716a((C8146dh) new C8156dk("LOAD"));
            m23790c("LOAD event");
            m23790c("Loading ads from servers...");
            this.f21647i.mo53308a(this.f21650l, this.f21641c, this.f21654p, this.f21660v).mo53285a(new C8414f(this)).mo53286b(new C8415g(this));
        }
    }

    /* renamed from: com.ogury.ed.internal.l$f */
    static final class C8414f extends C8468mr implements C8432lk<Throwable, C8386ke> {

        /* renamed from: a */
        final /* synthetic */ C8408l f21667a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8414f(C8408l lVar) {
            super(1);
            this.f21667a = lVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53077a(Object obj) {
            m23824a((Throwable) obj);
            return C8386ke.f21633a;
        }

        /* renamed from: a */
        private void m23824a(Throwable th) {
            C8467mq.m23881b(th, "errorThrowable");
            C8408l lVar = this.f21667a;
            lVar.m23790c("Failed to load (" + th.getMessage() + ')');
            this.f21667a.m23778a(0);
        }
    }

    /* renamed from: com.ogury.ed.internal.l$g */
    static final class C8415g extends C8468mr implements C8432lk<C8192ei, C8386ke> {

        /* renamed from: a */
        final /* synthetic */ C8408l f21668a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8415g(C8408l lVar) {
            super(1);
            this.f21668a = lVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53077a(Object obj) {
            m23826a((C8192ei) obj);
            return C8386ke.f21633a;
        }

        /* renamed from: a */
        private void m23826a(C8192ei eiVar) {
            C8467mq.m23881b(eiVar, "adResponse");
            this.f21668a.m23779a(eiVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23779a(C8192ei eiVar) {
        if (!this.f21661w) {
            if (!eiVar.mo53402a().isEmpty()) {
                m23790c("Ads available");
                C8280h hVar = this.f21656r;
                if (hVar != null) {
                    hVar.mo53465b();
                }
                m23787a((List<C8185eb>) C8394km.m23763a(eiVar.mo53402a()));
                return;
            }
            m23790c("Failed to load (no ad available)");
            m23790c("Triggering onAdError() callback");
            m23803m();
            C8280h hVar2 = this.f21656r;
            if (hVar2 != null) {
                hVar2.mo53466c();
            }
        }
    }

    /* renamed from: a */
    private final void m23787a(List<C8185eb> list) {
        boolean z;
        m23790c("Precaching available ads...");
        for (C8185eb c : list) {
            if (c.mo53341c().length() == 0) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                m23790c("Failed to load (invalid ad)");
                m23790c("Triggering onAdError() callback");
                m23803m();
                C8280h b = mo53932b();
                if (b != null) {
                    b.mo53468e();
                    return;
                }
                return;
            }
        }
        this.f21655q = C8394km.m23763a(list);
        this.f21646h.mo53733a(this, list, new C8418j(this));
    }

    /* renamed from: com.ogury.ed.internal.l$j */
    public static final class C8418j implements C8323if {

        /* renamed from: a */
        final /* synthetic */ C8408l f21671a;

        C8418j(C8408l lVar) {
            this.f21671a = lVar;
        }

        /* renamed from: a */
        public final void mo53734a() {
            this.f21671a.f21653o = true;
            this.f21671a.m23790c("Ads successfully loaded!");
            this.f21671a.m23790c("Triggering onAdLoaded() callback");
            this.f21671a.m23803m();
            C8280h b = this.f21671a.mo53932b();
            if (b != null) {
                b.mo53467d();
            }
        }

        /* renamed from: b */
        public final void mo53736b() {
            this.f21671a.m23790c("Failed to load (precaching failed)");
            this.f21671a.m23778a(0);
        }

        /* renamed from: a */
        public final void mo53735a(C8185eb ebVar) {
            C8467mq.m23881b(ebVar, "ad");
            this.f21671a.m23790c(C8467mq.m23873a("Do not precache ad ", (Object) ebVar.mo53350f()));
            this.f21671a.f21655q.remove(ebVar);
        }
    }

    /* renamed from: b */
    public final void mo53738b(C8185eb ebVar) {
        C8467mq.m23881b(ebVar, "ad");
        m23790c(C8467mq.m23873a("Unload ad ", (Object) ebVar.mo53350f()));
        this.f21653o = false;
        this.f21655q.remove(ebVar);
    }

    /* renamed from: a */
    public final void mo53929a(C8534t tVar) {
        C8467mq.m23881b(tVar, "showAction");
        StringBuilder sb = new StringBuilder("[Ads][");
        sb.append(this.f21650l.mo53404b());
        sb.append("][show] Showing ad unit [");
        AdConfig adConfig = this.f21641c;
        String str = null;
        sb.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb.append("]...");
        OguryIntegrationLogger.m22104d(sb.toString());
        C8320id.m23472a();
        if (this.f21648j.mo53795a(this.f21656r, this.f21653o, this.f21655q)) {
            this.f21662x = false;
            StringBuilder sb2 = new StringBuilder("[Ads][");
            sb2.append(this.f21650l.mo53404b());
            sb2.append("][show][");
            AdConfig adConfig2 = this.f21641c;
            sb2.append(adConfig2 == null ? null : adConfig2.getAdUnitId());
            sb2.append("] SHOW event");
            OguryIntegrationLogger.m22104d(sb2.toString());
            C8185eb ebVar = (C8185eb) C8394km.m23764b(this.f21655q);
            if (ebVar != null) {
                str = ebVar.mo53328A();
            }
            C8147di.m22716a((C8146dh) new C8156dk("SHOW", str));
            this.f21653o = false;
            List<C8185eb> list = this.f21655q;
            this.f21652n.mo53724a(list.size());
            this.f21652n.mo53726a((C8431lj<C8386ke>) new C8419k(this));
            for (C8185eb b : list) {
                C8288hg.m23313a(b.mo53338b(), new C8420l(this));
            }
            tVar.mo53251a(this.f21640b, C8394km.m23763a(list));
        }
    }

    /* renamed from: com.ogury.ed.internal.l$k */
    /* synthetic */ class C8419k extends C8466mp implements C8431lj<C8386ke> {
        C8419k(Object obj) {
            super(0, obj, C8408l.class, "onAdClosed", "onAdClosed()V");
        }

        /* renamed from: h */
        private void m23835h() {
            ((C8408l) this.f21679a).m23801k();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo53190a() {
            m23835h();
            return C8386ke.f21633a;
        }
    }

    /* renamed from: com.ogury.ed.internal.l$l */
    /* synthetic */ class C8420l extends C8466mp implements C8432lk<C8287hf, C8386ke> {
        C8420l(Object obj) {
            super(1, obj, C8408l.class, "sendShowEvent", "sendShowEvent(Lio/presage/mraid/MraidEvent;)V");
        }

        /* renamed from: a */
        private void m23837a(C8287hf hfVar) {
            C8467mq.m23881b(hfVar, "p0");
            ((C8408l) this.f21679a).m23781a(hfVar);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53077a(Object obj) {
            m23837a((C8287hf) obj);
            return C8386ke.f21633a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23781a(C8287hf hfVar) {
        this.f21652n.mo53725a(hfVar, this.f21650l, this.f21641c, this.f21656r, this.f21659u, this.f21657s);
    }

    /* renamed from: e */
    public final void mo53936e() {
        m23790c("Reset existing cache");
        this.f21661w = true;
        m23802l();
        this.f21646h.mo53732a((C8324ig) this);
        C8126cz.m22645a(this.f21663y);
        this.f21656r = null;
        this.f21659u = null;
        this.f21663y = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m23801k() {
        m23802l();
        this.f21656r = null;
        this.f21659u = null;
    }

    /* renamed from: l */
    private final void m23802l() {
        for (C8185eb b : this.f21655q) {
            C8288hg.m23312a(b.mo53338b());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m23778a(int i) {
        m23790c("Triggering onAdError() callback");
        m23803m();
        C8280h hVar = this.f21656r;
        if (hVar != null) {
            hVar.mo53464a(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final void m23803m() {
        if (this.f21656r == null) {
            m23790c("No ad listener registered");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m23790c(String str) {
        StringBuilder sb = new StringBuilder("[Ads][");
        sb.append(this.f21650l.mo53404b());
        sb.append("][load][");
        AdConfig adConfig = this.f21641c;
        sb.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb.append("] ");
        sb.append(str);
        OguryIntegrationLogger.m22104d(sb.toString());
    }
}
