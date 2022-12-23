package com.ogury.p245ed.internal;

import android.content.Context;

/* renamed from: com.ogury.ed.internal.af */
public final class C8014af implements C8532r {

    /* renamed from: a */
    public static final C8015a f20818a = new C8015a((byte) 0);

    /* renamed from: b */
    private final C8171dv f20819b;

    /* renamed from: c */
    private final C8288hg f20820c;

    /* renamed from: d */
    private final C8147di f20821d;

    /* renamed from: e */
    private boolean f20822e;

    /* renamed from: f */
    private C8185eb f20823f;

    /* renamed from: g */
    private C8531q f20824g;

    private C8014af(C8171dv dvVar, C8288hg hgVar, C8147di diVar) {
        C8467mq.m23881b(dvVar, "presageApi");
        C8467mq.m23881b(hgVar, "mraidEventBus");
        C8467mq.m23881b(diVar, "measurementsEventLogger");
        this.f20819b = dvVar;
        this.f20820c = hgVar;
        this.f20821d = diVar;
    }

    /* renamed from: a */
    public final void mo53127a(C8185eb ebVar) {
        this.f20823f = ebVar;
    }

    /* renamed from: a */
    public final void mo53128a(C8531q qVar) {
        if (qVar != null) {
            qVar.mo53122a(this);
        }
        this.f20824g = qVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C8014af(Context context) {
        this(C8172dw.m22770a(context), C8288hg.f21407a, C8147di.f21106a);
        C8467mq.m23881b(context, "context");
        C8172dw dwVar = C8172dw.f21148a;
    }

    /* renamed from: com.ogury.ed.internal.af$a */
    public static final class C8015a {
        public /* synthetic */ C8015a(byte b) {
            this();
        }

        private C8015a() {
        }
    }

    /* renamed from: b */
    private final void m22272b(C8185eb ebVar) {
        if (ebVar.mo53347e().length() > 0) {
            this.f20819b.mo53323a(ebVar.mo53347e());
        } else {
            C8147di.m22716a((C8146dh) new C8157dl("shown", ebVar));
        }
        C8288hg.m23311a(new C8287hf(ebVar.mo53338b(), "adDisplayed"));
        if (ebVar.mo53382y().mo53422a() && ebVar.mo53382y().mo53423b() == C8199eo.IMPRESSION_SOURCE_SDK) {
            C8288hg.m23311a(new C8287hf(ebVar.mo53338b(), "adImpression"));
        }
    }

    /* renamed from: a */
    public final void mo53126a(float f) {
        C8185eb ebVar = this.f20823f;
        if (ebVar != null && !this.f20822e && f >= 50.0f) {
            this.f20822e = true;
            C8467mq.m23873a("new impression: ", (Object) ebVar.mo53353g());
            C8531q qVar = this.f20824g;
            if (qVar != null) {
                qVar.mo53122a((C8532r) null);
            }
            m22272b(ebVar);
        }
    }
}
