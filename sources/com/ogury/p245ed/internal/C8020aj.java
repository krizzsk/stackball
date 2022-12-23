package com.ogury.p245ed.internal;

import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ogury.p245ed.internal.C8031ak;
import com.ogury.p245ed.internal.C8033al;
import com.ogury.p245ed.internal.C8297ho;
import com.p243my.target.ads.Reward;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.aj */
public final class C8020aj implements C8349iy {

    /* renamed from: a */
    public static final C8022b f20836a = new C8022b((byte) 0);

    /* renamed from: A */
    private View.OnLayoutChangeListener f20837A;

    /* renamed from: B */
    private int f20838B;

    /* renamed from: C */
    private C8036am f20839C;

    /* renamed from: D */
    private C8044au f20840D;

    /* renamed from: E */
    private C8036am f20841E;

    /* renamed from: F */
    private C8036am f20842F;

    /* renamed from: G */
    private boolean f20843G;

    /* renamed from: b */
    private final Application f20844b;

    /* renamed from: c */
    private final C8297ho.C8298a f20845c;

    /* renamed from: d */
    private final C8033al.C8034a f20846d;

    /* renamed from: e */
    private final C8233fn f20847e;

    /* renamed from: f */
    private final C8031ak f20848f;

    /* renamed from: g */
    private final C8172dw f20849g;

    /* renamed from: h */
    private final C8017ah f20850h;

    /* renamed from: i */
    private final C8288hg f20851i;

    /* renamed from: j */
    private final C8248g f20852j;

    /* renamed from: k */
    private final C8036am f20853k;

    /* renamed from: l */
    private final C8060bf f20854l;

    /* renamed from: m */
    private boolean f20855m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C8531q f20856n;

    /* renamed from: o */
    private final C8212ez f20857o;

    /* renamed from: p */
    private final C8014af f20858p;

    /* renamed from: q */
    private C8362jh f20859q;

    /* renamed from: r */
    private C8033al f20860r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C8282hb f20861s;

    /* renamed from: t */
    private boolean f20862t;

    /* renamed from: u */
    private boolean f20863u;

    /* renamed from: v */
    private C8297ho f20864v;

    /* renamed from: w */
    private C8185eb f20865w;

    /* renamed from: x */
    private List<C8185eb> f20866x;

    /* renamed from: y */
    private C8016ag f20867y;

    /* renamed from: z */
    private C8350iz f20868z;

    public /* synthetic */ C8020aj(C8021a aVar, byte b) {
        this(aVar);
    }

    private C8020aj(C8021a aVar) {
        this.f20844b = aVar.mo53173a();
        this.f20845c = aVar.mo53178e();
        this.f20846d = aVar.mo53179f();
        this.f20847e = aVar.mo53180g();
        this.f20848f = aVar.mo53181h();
        this.f20849g = aVar.mo53182i();
        this.f20850h = aVar.mo53183j();
        this.f20851i = aVar.mo53184k();
        this.f20852j = aVar.mo53175b();
        this.f20853k = aVar.mo53176c();
        this.f20854l = aVar.mo53185l();
        this.f20855m = aVar.mo53177d();
        this.f20856n = aVar.mo53186m();
        this.f20857o = aVar.mo53187n();
        this.f20858p = aVar.mo53188o();
        this.f20863u = true;
        this.f20866x = new ArrayList();
        this.f20868z = new C8350iz();
        this.f20837A = m22292E();
        this.f20838B = 1;
        this.f20839C = C8042as.f20907a;
        this.f20841E = C8042as.f20907a;
        this.f20842F = C8042as.f20907a;
    }

    /* renamed from: a */
    public final Application mo53137a() {
        return this.f20844b;
    }

    /* renamed from: a */
    private final void m22301a(int i) {
        if (this.f20838B != 4) {
            this.f20838B = i;
        }
    }

    /* renamed from: a */
    public final void mo53139a(C8036am amVar) {
        C8467mq.m23881b(amVar, "<set-?>");
        this.f20839C = amVar;
    }

    /* renamed from: a */
    public final void mo53140a(C8044au auVar) {
        this.f20840D = auVar;
    }

    /* renamed from: b */
    public final C8036am mo53145b() {
        return this.f20841E;
    }

    /* renamed from: b */
    public final void mo53146b(C8036am amVar) {
        C8467mq.m23881b(amVar, "<set-?>");
        this.f20841E = amVar;
    }

    /* renamed from: c */
    public final void mo53148c(C8036am amVar) {
        C8467mq.m23881b(amVar, "<set-?>");
        this.f20842F = amVar;
    }

    /* renamed from: c */
    public final boolean mo53150c() {
        return this.f20843G;
    }

    /* renamed from: d */
    public final void mo53151d() {
        this.f20843G = true;
    }

    /* renamed from: com.ogury.ed.internal.aj$b */
    public static final class C8022b {
        public /* synthetic */ C8022b(byte b) {
            this();
        }

        private C8022b() {
        }
    }

    /* renamed from: com.ogury.ed.internal.aj$a */
    public static final class C8021a {

        /* renamed from: a */
        private final Application f20869a;

        /* renamed from: b */
        private final C8248g f20870b;

        /* renamed from: c */
        private final C8036am f20871c;

        /* renamed from: d */
        private final boolean f20872d;

        /* renamed from: e */
        private C8297ho.C8298a f20873e = C8297ho.f21420a;

        /* renamed from: f */
        private C8033al.C8034a f20874f = C8033al.f20889a;

        /* renamed from: g */
        private C8233fn f20875g = C8233fn.f21330a;

        /* renamed from: h */
        private C8031ak f20876h;

        /* renamed from: i */
        private C8172dw f20877i;

        /* renamed from: j */
        private C8017ah f20878j;

        /* renamed from: k */
        private C8288hg f20879k;

        /* renamed from: l */
        private C8018ai f20880l;

        /* renamed from: m */
        private C8060bf f20881m;

        /* renamed from: n */
        private C8531q f20882n;

        /* renamed from: o */
        private C8212ez f20883o;

        /* renamed from: p */
        private C8014af f20884p;

        public C8021a(Application application, C8248g gVar, C8036am amVar, boolean z) {
            C8467mq.m23881b(application, "application");
            C8467mq.m23881b(gVar, "adLayout");
            C8467mq.m23881b(amVar, "expandCommand");
            this.f20869a = application;
            this.f20870b = gVar;
            this.f20871c = amVar;
            this.f20872d = z;
            C8031ak.C8032a aVar = C8031ak.f20887a;
            this.f20876h = C8031ak.C8032a.m22385a();
            this.f20877i = C8172dw.f21148a;
            this.f20878j = C8017ah.f20831a;
            this.f20879k = C8288hg.f21407a;
            this.f20880l = new C8018ai(this.f20869a);
            this.f20881m = new C8060bf();
            this.f20882n = new C8047ax(this.f20870b);
            this.f20883o = new C8212ez(this.f20869a);
            this.f20884p = new C8014af(this.f20869a);
        }

        /* renamed from: a */
        public final Application mo53173a() {
            return this.f20869a;
        }

        /* renamed from: b */
        public final C8248g mo53175b() {
            return this.f20870b;
        }

        /* renamed from: c */
        public final C8036am mo53176c() {
            return this.f20871c;
        }

        /* renamed from: d */
        public final boolean mo53177d() {
            return this.f20872d;
        }

        /* renamed from: e */
        public final C8297ho.C8298a mo53178e() {
            return this.f20873e;
        }

        /* renamed from: f */
        public final C8033al.C8034a mo53179f() {
            return this.f20874f;
        }

        /* renamed from: g */
        public final C8233fn mo53180g() {
            return this.f20875g;
        }

        /* renamed from: h */
        public final C8031ak mo53181h() {
            return this.f20876h;
        }

        /* renamed from: i */
        public final C8172dw mo53182i() {
            return this.f20877i;
        }

        /* renamed from: j */
        public final C8017ah mo53183j() {
            return this.f20878j;
        }

        /* renamed from: k */
        public final C8288hg mo53184k() {
            return this.f20879k;
        }

        /* renamed from: l */
        public final C8060bf mo53185l() {
            return this.f20881m;
        }

        /* renamed from: a */
        public final void mo53174a(C8531q qVar) {
            C8467mq.m23881b(qVar, "<set-?>");
            this.f20882n = qVar;
        }

        /* renamed from: m */
        public final C8531q mo53186m() {
            return this.f20882n;
        }

        /* renamed from: n */
        public final C8212ez mo53187n() {
            return this.f20883o;
        }

        /* renamed from: o */
        public final C8014af mo53188o() {
            return this.f20884p;
        }

        /* renamed from: p */
        public final C8020aj mo53189p() {
            return new C8020aj(this, (byte) 0);
        }
    }

    /* renamed from: e */
    public final List<C8185eb> mo53152e() {
        return this.f20866x;
    }

    /* renamed from: f */
    public final C8185eb mo53153f() {
        return this.f20865w;
    }

    /* renamed from: g */
    public final void mo53154g() {
        m22301a(2);
    }

    /* renamed from: h */
    public final void mo53155h() {
        m22301a(3);
    }

    /* renamed from: i */
    public final boolean mo53156i() {
        if (this.f20838B == 3) {
            return false;
        }
        C8362jh jhVar = this.f20859q;
        if (jhVar == null) {
            C8467mq.m23879a("webView");
            jhVar = null;
        }
        return !C8467mq.m23880a((Object) jhVar.getAdState(), (Object) "expanded");
    }

    /* renamed from: z */
    private final boolean m22314z() {
        C8362jh jhVar = this.f20859q;
        if (jhVar == null) {
            C8467mq.m23879a("webView");
            jhVar = null;
        }
        return !C8467mq.m23880a((Object) jhVar.getAdState(), (Object) "resized");
    }

    /* renamed from: j */
    public final boolean mo53157j() {
        if (this.f20859q != null) {
            return m22314z() && (this.f20852j.getParent() instanceof C8009ac);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo53141a(C8185eb ebVar, List<C8185eb> list) {
        C8467mq.m23881b(ebVar, "ad");
        C8467mq.m23881b(list, "notDisplayedAds");
        this.f20866x = list;
        this.f20865w = ebVar;
        m22304a(ebVar);
        m22299L();
        m22305a(ebVar, this.f20852j);
        C8033al alVar = null;
        C8345iv ivVar = new C8345iv(this.f20844b, this, (C8431lj<C8386ke>) null);
        C8297ho a = C8297ho.C8298a.m23362a(this.f20844b, ebVar, this.f20852j, ivVar);
        this.f20864v = a;
        a.mo53665a((C8431lj<C8386ke>) new C8023c(this));
        a.mo53669b((C8431lj<C8386ke>) new C8024d(this));
        C8033al a2 = C8033al.C8034a.m22392a(a, ivVar);
        this.f20860r = a2;
        if (a2 == null) {
            C8467mq.m23879a("webViewGateway");
        } else {
            alVar = a2;
        }
        C8362jh a3 = alVar.mo53194a(ebVar);
        if (a3 != null) {
            this.f20859q = a3;
            this.f20861s = a3.getMraidCommandExecutor();
            a.mo53667a(ebVar.mo53359j().length() > 0 ? ebVar.mo53359j() : "controller", a3, ebVar.mo53379v());
            C8232fm a4 = C8233fn.m23113a((Context) this.f20844b);
            if (a4 != null) {
                m22306a(a4);
                m22307a(a3);
                this.f20852j.addView(a3, new FrameLayout.LayoutParams(-1, -1));
                if (ebVar.mo53380w().mo53406d() && !this.f20855m) {
                    m22309b(ebVar);
                }
                this.f20848f.mo53193a(a4, ebVar, a3);
                m22289B();
                m22290C();
                this.f20852j.setOnWindowGainFocusListener(new C8025e(this));
                this.f20852j.setOnWindowLoseFocusListener(new C8026f(this));
                this.f20852j.setOnAttachToWindowListener(new C8027g(this));
                this.f20852j.setOnDetachFromWindowListener(new C8028h(this));
                return;
            }
            throw new IllegalStateException("Profig must not be null");
        }
        throw new IllegalStateException("WebView must not be null");
    }

    /* renamed from: com.ogury.ed.internal.aj$c */
    /* synthetic */ class C8023c extends C8466mp implements C8431lj<C8386ke> {
        C8023c(Object obj) {
            super(0, obj, C8020aj.class, "handleNewOguryBrowserWebViewCreated", "handleNewOguryBrowserWebViewCreated()V");
        }

        /* renamed from: h */
        private void m22368h() {
            ((C8020aj) this.f21679a).m22295H();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo53190a() {
            m22368h();
            return C8386ke.f21633a;
        }
    }

    /* renamed from: com.ogury.ed.internal.aj$d */
    /* synthetic */ class C8024d extends C8466mp implements C8431lj<C8386ke> {
        C8024d(Object obj) {
            super(0, obj, C8020aj.class, "closeAd", "closeAd()V");
        }

        /* renamed from: h */
        private void m22370h() {
            ((C8020aj) this.f21679a).mo53170w();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo53190a() {
            m22370h();
            return C8386ke.f21633a;
        }
    }

    /* renamed from: com.ogury.ed.internal.aj$e */
    /* synthetic */ class C8025e extends C8466mp implements C8431lj<C8386ke> {
        C8025e(Object obj) {
            super(0, obj, C8020aj.class, "resumeAd", "resumeAd()V");
        }

        /* renamed from: h */
        private void m22372h() {
            ((C8020aj) this.f21679a).mo53163p();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo53190a() {
            m22372h();
            return C8386ke.f21633a;
        }
    }

    /* renamed from: com.ogury.ed.internal.aj$f */
    /* synthetic */ class C8026f extends C8466mp implements C8431lj<C8386ke> {
        C8026f(Object obj) {
            super(0, obj, C8020aj.class, "pauseAd", "pauseAd()V");
        }

        /* renamed from: h */
        private void m22374h() {
            ((C8020aj) this.f21679a).mo53162o();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo53190a() {
            m22374h();
            return C8386ke.f21633a;
        }
    }

    /* renamed from: com.ogury.ed.internal.aj$g */
    /* synthetic */ class C8027g extends C8466mp implements C8431lj<C8386ke> {
        C8027g(Object obj) {
            super(0, obj, C8020aj.class, "onAttachToWindow", "onAttachToWindow()V");
        }

        /* renamed from: h */
        private void m22376h() {
            ((C8020aj) this.f21679a).m22288A();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo53190a() {
            m22376h();
            return C8386ke.f21633a;
        }
    }

    /* renamed from: com.ogury.ed.internal.aj$h */
    /* synthetic */ class C8028h extends C8466mp implements C8431lj<C8386ke> {
        C8028h(Object obj) {
            super(0, obj, C8020aj.class, "pauseAd", "pauseAd()V");
        }

        /* renamed from: h */
        private void m22378h() {
            ((C8020aj) this.f21679a).mo53162o();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo53190a() {
            m22378h();
            return C8386ke.f21633a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final void m22288A() {
        if (this.f20852j.mo53579g()) {
            mo53163p();
        }
    }

    /* renamed from: a */
    private final void m22304a(C8185eb ebVar) {
        this.f20858p.mo53127a(ebVar);
        this.f20858p.mo53128a(this.f20856n);
    }

    /* renamed from: com.ogury.ed.internal.aj$i */
    static final class C8029i extends C8468mr implements C8432lk<C8248g, C8386ke> {

        /* renamed from: a */
        final /* synthetic */ C8020aj f20885a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8029i(C8020aj ajVar) {
            super(1);
            this.f20885a = ajVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo53077a(Object obj) {
            m22380a((C8248g) obj);
            return C8386ke.f21633a;
        }

        /* renamed from: a */
        private void m22380a(C8248g gVar) {
            C8467mq.m23881b(gVar, "adLayout");
            C8282hb c = this.f20885a.f20861s;
            if (c == null) {
                C8467mq.m23879a("mraidCommandExecutor");
                c = null;
            }
            c.mo53646b(C8258gi.m23194a(gVar.getWidth()), C8258gi.m23194a(gVar.getHeight()), C8258gi.m23193a(gVar.getX()), C8258gi.m23193a(gVar.getY()));
            this.f20885a.f20856n.mo53121a();
            this.f20885a.m22291D();
        }
    }

    /* renamed from: B */
    private final void m22289B() {
        this.f20852j.setAdLayoutChangeListener(new C8029i(this));
    }

    /* renamed from: com.ogury.ed.internal.aj$j */
    public static final class C8030j implements C8366jl {

        /* renamed from: a */
        final /* synthetic */ C8020aj f20886a;

        C8030j(C8020aj ajVar) {
            this.f20886a = ajVar;
        }

        /* renamed from: a */
        public final void mo53191a() {
            this.f20886a.f20856n.mo53121a();
        }
    }

    /* renamed from: C */
    private final void m22290C() {
        C8362jh jhVar = this.f20859q;
        if (jhVar == null) {
            C8467mq.m23879a("webView");
            jhVar = null;
        }
        jhVar.setVisibilityChangedListener(new C8030j(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m22291D() {
        C8212ez ezVar = this.f20857o;
        C8362jh jhVar = this.f20859q;
        C8282hb hbVar = null;
        if (jhVar == null) {
            C8467mq.m23879a("webView");
            jhVar = null;
        }
        Rect a = ezVar.mo53453a((View) jhVar);
        C8282hb hbVar2 = this.f20861s;
        if (hbVar2 == null) {
            C8467mq.m23879a("mraidCommandExecutor");
        } else {
            hbVar = hbVar2;
        }
        hbVar.mo53645b(C8258gi.m23194a(a.width()), C8258gi.m23194a(a.height()));
    }

    /* renamed from: E */
    private final View.OnLayoutChangeListener m22292E() {
        return new View.OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C8020aj.m22303a(C8020aj.this, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m22303a(C8020aj ajVar, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C8467mq.m23881b(ajVar, "this$0");
        C8362jh jhVar = ajVar.f20859q;
        if (jhVar != null) {
            C8362jh jhVar2 = null;
            if (jhVar == null) {
                C8467mq.m23879a("webView");
                jhVar = null;
            }
            if (!C8467mq.m23880a((Object) jhVar.getAdState(), (Object) "hidden")) {
                C8362jh jhVar3 = ajVar.f20859q;
                if (jhVar3 == null) {
                    C8467mq.m23879a("webView");
                } else {
                    jhVar2 = jhVar3;
                }
                if (C8268gr.m23219e(jhVar2)) {
                    ajVar.f20856n.mo53121a();
                }
            }
        }
    }

    /* renamed from: F */
    private final void m22293F() {
        ViewGroup parentAsViewGroup = this.f20852j.getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            parentAsViewGroup.addOnLayoutChangeListener(this.f20837A);
        }
    }

    /* renamed from: G */
    private final void m22294G() {
        ViewGroup parentAsViewGroup = this.f20852j.getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            parentAsViewGroup.removeOnLayoutChangeListener(this.f20837A);
        }
    }

    /* renamed from: b */
    private final void m22309b(C8185eb ebVar) {
        this.f20868z.mo53779a(ebVar.mo53363l().mo53435b());
        this.f20868z.mo53783b(ebVar.mo53363l().mo53437c());
        this.f20852j.setInitialSize(this.f20868z);
        this.f20852j.setupDrag(ebVar.mo53363l().mo53434a());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m22295H() {
        /*
            r6 = this;
            boolean r0 = r6.f20855m
            r1 = 0
            r2 = 0
            java.lang.String r3 = "webView"
            r4 = 1
            if (r0 == 0) goto L_0x001f
            com.ogury.ed.internal.jh r0 = r6.f20859q
            if (r0 != 0) goto L_0x0011
            com.ogury.p245ed.internal.C8467mq.m23879a((java.lang.String) r3)
            r0 = r2
        L_0x0011:
            java.lang.String r0 = r0.getAdState()
            java.lang.String r5 = "default"
            boolean r0 = com.ogury.p245ed.internal.C8467mq.m23880a((java.lang.Object) r0, (java.lang.Object) r5)
            if (r0 != 0) goto L_0x001f
            r0 = 1
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            if (r0 != 0) goto L_0x0026
            boolean r0 = r6.f20855m
            if (r0 != 0) goto L_0x0044
        L_0x0026:
            com.ogury.ed.internal.jh r0 = r6.f20859q
            if (r0 != 0) goto L_0x002e
            com.ogury.p245ed.internal.C8467mq.m23879a((java.lang.String) r3)
            r0 = r2
        L_0x002e:
            r0.setMultiBrowserOpened(r4)
            com.ogury.ed.internal.jh r0 = r6.f20859q
            if (r0 != 0) goto L_0x0039
            com.ogury.p245ed.internal.C8467mq.m23879a((java.lang.String) r3)
            goto L_0x003a
        L_0x0039:
            r2 = r0
        L_0x003a:
            r0 = 4
            r2.setVisibility(r0)
            r6.mo53162o()
            r6.m22296I()
        L_0x0044:
            com.ogury.ed.internal.eb r0 = r6.f20865w
            if (r0 == 0) goto L_0x004f
            boolean r0 = com.ogury.p245ed.internal.C8196el.m22924b(r0)
            if (r0 != r4) goto L_0x004f
            r1 = 1
        L_0x004f:
            if (r1 == 0) goto L_0x0053
            r6.f20855m = r4
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p245ed.internal.C8020aj.m22295H():void");
    }

    /* renamed from: I */
    private final void m22296I() {
        mo53167t();
    }

    /* renamed from: a */
    private final void m22306a(C8232fm fmVar) {
        this.f20862t = fmVar.mo53548g();
        this.f20863u = fmVar.mo53549h();
        C8016ag agVar = this.f20867y;
        if (agVar != null) {
            agVar.mo53130a(fmVar.mo53552k());
        }
    }

    /* renamed from: a */
    private final void m22307a(C8362jh jhVar) {
        C8016ag agVar;
        if (!jhVar.getShowSdkCloseButton() && (agVar = this.f20867y) != null) {
            agVar.mo53131b();
        }
    }

    /* renamed from: a */
    private final void m22305a(C8185eb ebVar, C8248g gVar) {
        if (C8196el.m22924b(ebVar)) {
            this.f20867y = C8017ah.m22285a(this, gVar, C8172dw.m22770a(this.f20844b), ebVar.mo53373q());
        }
    }

    /* renamed from: J */
    private final boolean m22297J() {
        C8297ho hoVar = this.f20864v;
        if (hoVar == null) {
            return true;
        }
        return hoVar.mo53671b();
    }

    /* renamed from: k */
    public final void mo53158k() {
        String b;
        if (this.f20838B != 4) {
            C8255gf.m23190a("destroying ad");
            m22301a(4);
            this.f20856n.mo53123b();
            C8297ho hoVar = this.f20864v;
            if (hoVar != null) {
                hoVar.mo53674d();
            }
            C8016ag agVar = this.f20867y;
            if (agVar != null) {
                agVar.mo53132c();
            }
            C8185eb ebVar = this.f20865w;
            String str = "";
            if (!(ebVar == null || (b = ebVar.mo53338b()) == null)) {
                str = b;
            }
            C8288hg.m23311a(new C8287hf(str, "adClosed"));
            this.f20848f.mo53192a();
            this.f20852j.mo53578f();
            this.f20839C = C8042as.f20907a;
            C8362jh jhVar = this.f20859q;
            if (jhVar != null) {
                if (jhVar == null) {
                    C8467mq.m23879a("webView");
                    jhVar = null;
                }
                jhVar.mo53820i();
            }
        }
    }

    /* renamed from: a */
    public final void mo53144a(boolean z) {
        if (m22298K() && m22297J() && this.f20863u) {
            mo53158k();
            this.f20841E.mo53117a(this.f20852j, this);
            if (!z) {
                mo53159l();
            }
        }
    }

    /* renamed from: l */
    public final void mo53159l() {
        String b;
        C8185eb ebVar = this.f20865w;
        String str = "";
        if (!(ebVar == null || (b = ebVar.mo53338b()) == null)) {
            str = b;
        }
        C8288hg.m23311a(new C8287hf(str, "closeWhithoutShowNextAd"));
    }

    /* renamed from: m */
    public final void mo53160m() {
        if (this.f20843G || m22298K()) {
            mo53158k();
        }
    }

    /* renamed from: K */
    private final boolean m22298K() {
        return this.f20855m && this.f20838B != 2;
    }

    /* renamed from: n */
    public final boolean mo53161n() {
        C8297ho hoVar = this.f20864v;
        if (hoVar != null) {
            hoVar.mo53672c();
        }
        return this.f20862t;
    }

    /* renamed from: o */
    public final void mo53162o() {
        C8362jh jhVar = this.f20859q;
        C8282hb hbVar = null;
        if (jhVar == null) {
            C8467mq.m23879a("webView");
            jhVar = null;
        }
        if (!jhVar.mo53803a()) {
            C8255gf.m23190a("ad already paused");
            return;
        }
        C8255gf.m23190a("pauseAd");
        C8362jh jhVar2 = this.f20859q;
        if (jhVar2 == null) {
            C8467mq.m23879a("webView");
            jhVar2 = null;
        }
        jhVar2.setResumed(false);
        m22294G();
        C8278gy gyVar = new C8278gy();
        gyVar.mo53629a(0.0f);
        C8282hb hbVar2 = this.f20861s;
        if (hbVar2 == null) {
            C8467mq.m23879a("mraidCommandExecutor");
        } else {
            hbVar = hbVar2;
        }
        hbVar.mo53638a(gyVar);
    }

    /* renamed from: p */
    public final void mo53163p() {
        C8362jh jhVar = this.f20859q;
        C8362jh jhVar2 = null;
        if (jhVar == null) {
            C8467mq.m23879a("webView");
            jhVar = null;
        }
        if (jhVar.mo53803a()) {
            C8255gf.m23190a("ad already resumed");
            return;
        }
        C8255gf.m23190a("resumeAd");
        C8362jh jhVar3 = this.f20859q;
        if (jhVar3 == null) {
            C8467mq.m23879a("webView");
        } else {
            jhVar2 = jhVar3;
        }
        jhVar2.setResumed(true);
        if (this.f20855m) {
            m22293F();
        }
        if (this.f20838B != 2) {
            m22301a(1);
        }
        this.f20856n.mo53121a();
    }

    /* renamed from: a */
    public final void mo53138a(int i, int i2) {
        this.f20868z.mo53785c(i);
        this.f20868z.mo53787d(i2);
    }

    /* renamed from: L */
    private final void m22299L() {
        this.f20842F.mo53117a(this.f20852j, this);
    }

    /* renamed from: q */
    public final void mo53164q() {
        C8016ag agVar = this.f20867y;
        if (agVar != null) {
            agVar.mo53129a();
        }
    }

    /* renamed from: r */
    public final void mo53165r() {
        C8016ag agVar = this.f20867y;
        if (agVar != null) {
            agVar.mo53131b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53143a(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "adId"
            com.ogury.p245ed.internal.C8467mq.m23881b(r4, r0)
            boolean r0 = r3.f20855m
            r1 = 0
            if (r0 != 0) goto L_0x0023
            com.ogury.ed.internal.jh r0 = r3.f20859q
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "webView"
            com.ogury.p245ed.internal.C8467mq.m23879a((java.lang.String) r0)
            r0 = 0
        L_0x0014:
            java.lang.String r0 = r0.getAdState()
            java.lang.String r2 = "hidden"
            boolean r0 = com.ogury.p245ed.internal.C8467mq.m23880a((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r0 = 0
            goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            if (r0 == 0) goto L_0x0038
            com.ogury.ed.internal.au r0 = r3.f20840D
            if (r0 != 0) goto L_0x002b
            goto L_0x0033
        L_0x002b:
            android.app.Application r1 = r3.f20844b
            java.util.List<com.ogury.ed.internal.eb> r2 = r3.f20866x
            boolean r1 = r0.mo53120a(r1, r2, r4)
        L_0x0033:
            if (r1 != 0) goto L_0x0038
            r3.mo53159l()
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p245ed.internal.C8020aj.mo53143a(java.lang.String):void");
    }

    /* renamed from: s */
    public final void mo53166s() {
        mo53147b(false);
    }

    /* renamed from: a */
    public final void mo53142a(C8350iz izVar) {
        this.f20852j.setResizeProps(izVar);
    }

    /* renamed from: t */
    public final void mo53167t() {
        if (!mo53168u()) {
            this.f20853k.mo53117a(this.f20852j, this);
            m22310b(this.f20855m ? Reward.DEFAULT : "expanded");
        }
    }

    /* renamed from: u */
    public final boolean mo53168u() {
        C8362jh jhVar = this.f20859q;
        C8362jh jhVar2 = null;
        if (jhVar == null) {
            C8467mq.m23879a("webView");
            jhVar = null;
        }
        if (C8467mq.m23880a((Object) jhVar.getAdState(), (Object) "expanded")) {
            return true;
        }
        if (!this.f20855m) {
            return false;
        }
        C8362jh jhVar3 = this.f20859q;
        if (jhVar3 == null) {
            C8467mq.m23879a("webView");
        } else {
            jhVar2 = jhVar3;
        }
        return C8467mq.m23880a((Object) jhVar2.getAdState(), (Object) Reward.DEFAULT);
    }

    /* renamed from: v */
    public final void mo53169v() {
        C8350iz resizeProps = this.f20852j.getResizeProps();
        if (resizeProps == null) {
            throw new IllegalStateException("setResizeProperties must be called first");
        } else if (this.f20854l.mo53207a((ViewGroup) this.f20852j, resizeProps)) {
            m22310b("resized");
            this.f20839C.mo53117a(this.f20852j, this);
        } else {
            throw new IllegalArgumentException("Invalid resize command".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if ((r0 == null ? true : com.ogury.p245ed.internal.C8196el.m22924b(r0)) != false) goto L_0x0021;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53147b(boolean r6) {
        /*
            r5 = this;
            com.ogury.ed.internal.jh r0 = r5.f20859q
            r1 = 0
            java.lang.String r2 = "webView"
            if (r0 != 0) goto L_0x000b
            com.ogury.p245ed.internal.C8467mq.m23879a((java.lang.String) r2)
            r0 = r1
        L_0x000b:
            boolean r0 = r0.mo53805b()
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0020
            com.ogury.ed.internal.eb r0 = r5.f20865w
            if (r0 != 0) goto L_0x0019
            r0 = 1
            goto L_0x001d
        L_0x0019:
            boolean r0 = com.ogury.p245ed.internal.C8196el.m22924b(r0)
        L_0x001d:
            if (r0 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r3 != 0) goto L_0x005a
            com.ogury.ed.internal.jh r0 = r5.f20859q
            if (r0 != 0) goto L_0x002b
            com.ogury.p245ed.internal.C8467mq.m23879a((java.lang.String) r2)
            r0 = r1
        L_0x002b:
            java.lang.String r0 = r0.getAdState()
            java.lang.String r3 = "default"
            boolean r0 = com.ogury.p245ed.internal.C8467mq.m23880a((java.lang.Object) r0, (java.lang.Object) r3)
            if (r0 != 0) goto L_0x005a
            boolean r0 = r5.f20855m
            if (r0 == 0) goto L_0x003c
            goto L_0x005a
        L_0x003c:
            com.ogury.ed.internal.jh r6 = r5.f20859q
            if (r6 != 0) goto L_0x0044
            com.ogury.p245ed.internal.C8467mq.m23879a((java.lang.String) r2)
            r6 = r1
        L_0x0044:
            r6.setMultiBrowserOpened(r4)
            com.ogury.ed.internal.jh r6 = r5.f20859q
            if (r6 != 0) goto L_0x004f
            com.ogury.p245ed.internal.C8467mq.m23879a((java.lang.String) r2)
            goto L_0x0050
        L_0x004f:
            r1 = r6
        L_0x0050:
            r1.setVisibility(r4)
            r5.m22300M()
            r5.m22310b((java.lang.String) r3)
            return
        L_0x005a:
            r5.mo53149c((boolean) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p245ed.internal.C8020aj.mo53147b(boolean):void");
    }

    /* renamed from: c */
    public final void mo53149c(boolean z) {
        mo53170w();
        if (!z) {
            mo53159l();
        }
    }

    /* renamed from: w */
    public final void mo53170w() {
        this.f20841E.mo53117a(this.f20852j, this);
    }

    /* renamed from: b */
    private final void m22310b(String str) {
        C8282hb hbVar = this.f20861s;
        if (hbVar == null) {
            C8467mq.m23879a("mraidCommandExecutor");
            hbVar = null;
        }
        hbVar.mo53647b(str);
    }

    /* renamed from: M */
    private final void m22300M() {
        this.f20852j.mo53577e();
        this.f20839C.mo53117a(this.f20852j, this);
    }

    /* renamed from: x */
    public final boolean mo53171x() {
        C8362jh jhVar = this.f20859q;
        if (jhVar == null) {
            return false;
        }
        if (jhVar == null) {
            C8467mq.m23879a("webView");
            jhVar = null;
        }
        return jhVar.mo53805b();
    }

    /* renamed from: y */
    public final void mo53172y() {
        C8185eb ebVar = this.f20865w;
        String b = ebVar == null ? null : ebVar.mo53338b();
        if (b != null) {
            C8288hg.m23311a(new C8287hf(b, "adClosed"));
        }
    }
}
