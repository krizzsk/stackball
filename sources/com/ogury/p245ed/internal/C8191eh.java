package com.ogury.p245ed.internal;

import com.tapjoy.TapjoyConstants;

/* renamed from: com.ogury.ed.internal.eh */
public final class C8191eh implements C8190eg {

    /* renamed from: a */
    private final C8216fa f21210a;

    /* renamed from: b */
    private final C8212ez f21211b;

    /* renamed from: c */
    private final C8202er f21212c;

    /* renamed from: d */
    private final C8132dc f21213d;

    /* renamed from: e */
    private final C8244fx f21214e;

    /* renamed from: f */
    private final C8232fm f21215f;

    /* renamed from: h */
    public final String mo53395h() {
        return "4.2.0";
    }

    public C8191eh(C8216fa faVar, C8212ez ezVar, C8233fn fnVar, C8202er erVar, C8132dc dcVar, C8244fx fxVar) {
        C8467mq.m23881b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C8467mq.m23881b(ezVar, "androidDevice");
        C8467mq.m23881b(fnVar, "profigGateway");
        C8467mq.m23881b(erVar, "omidSdkChecker");
        C8467mq.m23881b(dcVar, "extraAdConfiguration");
        C8467mq.m23881b(fxVar, "coreWrapper");
        this.f21210a = faVar;
        this.f21211b = ezVar;
        this.f21212c = erVar;
        this.f21213d = dcVar;
        this.f21214e = fxVar;
        C8232fm a = C8233fn.m23113a(faVar.mo53471a());
        if (a != null) {
            this.f21215f = a;
            return;
        }
        throw new IllegalStateException("Profig must not be null");
    }

    /* renamed from: f */
    public final int mo53393f() {
        return this.f21211b.mo53458k();
    }

    /* renamed from: g */
    public final int mo53394g() {
        return this.f21211b.mo53459l();
    }

    /* renamed from: a */
    public final String mo53388a() {
        return this.f21211b.mo53457j();
    }

    /* renamed from: b */
    public final String mo53389b() {
        return this.f21211b.mo53454g();
    }

    /* renamed from: c */
    public final String mo53390c() {
        return this.f21210a.mo53475d();
    }

    /* renamed from: d */
    public final String mo53391d() {
        return this.f21210a.mo53473b();
    }

    /* renamed from: e */
    public final boolean mo53392e() {
        return this.f21215f.mo53536c() && C8202er.m22935a();
    }

    /* renamed from: i */
    public final float mo53396i() {
        return this.f21211b.mo53462o();
    }

    /* renamed from: j */
    public final Boolean mo53397j() {
        return C8132dc.m22654a("IS_CHILD_UNDER_COPPA");
    }

    /* renamed from: k */
    public final Boolean mo53398k() {
        return C8132dc.m22654a("IS_UNDER_AGE_OF_GDPR_CONSENT");
    }

    /* renamed from: l */
    public final String mo53399l() {
        return C8132dc.m22658b("AD_CONTENT_THRESHOLD");
    }

    /* renamed from: m */
    public final String mo53400m() {
        return this.f21214e.mo53568c();
    }

    /* renamed from: n */
    public final String mo53401n() {
        return this.f21210a.mo53480i();
    }
}
