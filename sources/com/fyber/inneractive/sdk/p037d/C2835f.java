package com.fyber.inneractive.sdk.p037d;

import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.p051j.C3020g;
import com.fyber.inneractive.sdk.player.C3312g;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.d.f */
public final class C2835f extends C2825b<C3020g, C2857q> implements C3312g.C3314a {

    /* renamed from: g */
    private C3312g f6740g;

    /* renamed from: h */
    private String f6741h;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo18103b() {
        return "send_failed_vast_creatives";
    }

    public C2835f(String str) {
        this.f6741h = str;
    }

    /* renamed from: a */
    public final void mo18098a() {
        IAlog.m9034b(IAlog.m9029a((Object) this) + "start called", new Object[0]);
        this.f6702c = new C2857q(mo18106g(), this.f6704e, (C3020g) this.f6701b, this.f6700a);
        this.f6740g = new C3312g((C3020g) this.f6701b, this.f6700a, (C2857q) this.f6702c, this);
        ((C2857q) this.f6702c).f6799a = this.f6740g;
        ((C2857q) this.f6702c).f6747k = this.f6705f;
        C3312g gVar = this.f6740g;
        gVar.f8553c = null;
        if (!(gVar.f8551a == null || gVar.f8551a.f7426E == null)) {
            gVar.f8553c = gVar.f8551a.f7426E.mo18375a();
        }
        if (gVar.f8553c == null) {
            gVar.mo19117e();
            gVar.f8552b.mo18123b(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR));
            return;
        }
        gVar.mo19115c();
        gVar.mo19114b();
    }

    /* renamed from: e */
    public final void mo18104e() {
        this.f6740g.mo19116d();
    }

    /* renamed from: h */
    public final void mo18107h() {
        super.mo18107h();
    }

    /* renamed from: b */
    public final void mo18123b(InneractiveInfrastructureError inneractiveInfrastructureError) {
        mo18100a((InneractiveError) inneractiveInfrastructureError);
        mo18101a(inneractiveInfrastructureError);
    }
}
