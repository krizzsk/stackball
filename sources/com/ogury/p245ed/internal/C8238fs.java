package com.ogury.p245ed.internal;

import com.tapjoy.TapjoyConstants;

/* renamed from: com.ogury.ed.internal.fs */
public final class C8238fs {

    /* renamed from: a */
    private final C8216fa f21345a;

    /* renamed from: b */
    private final C8212ez f21346b;

    /* renamed from: c */
    private final C8244fx f21347c;

    /* renamed from: d */
    private final C8132dc f21348d;

    /* renamed from: e */
    private final boolean f21349e;

    public C8238fs(C8216fa faVar, C8212ez ezVar, C8244fx fxVar, C8132dc dcVar, boolean z) {
        C8467mq.m23881b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C8467mq.m23881b(ezVar, "androidDevice");
        C8467mq.m23881b(fxVar, "coreWrapper");
        C8467mq.m23881b(dcVar, "extraAdConfiguration");
        this.f21345a = faVar;
        this.f21346b = ezVar;
        this.f21347c = fxVar;
        this.f21348d = dcVar;
        this.f21349e = z;
    }

    /* renamed from: a */
    public final C8237fr mo53565a() {
        return new C8237fr(this.f21345a.mo53473b(), "4.2.0", this.f21346b.mo53461n(), C8212ez.m22973f(), this.f21349e ? this.f21347c.mo53566a().getId() : null, this.f21347c.mo53568c(), C8132dc.m22654a("IS_CHILD_UNDER_COPPA"), C8132dc.m22654a("IS_UNDER_AGE_OF_GDPR_CONSENT"), C8132dc.m22658b("AD_CONTENT_THRESHOLD"), this.f21347c.mo53569d(), (byte) 0);
    }
}
