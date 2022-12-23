package com.fyber.inneractive.sdk.p037d;

import com.fyber.inneractive.sdk.config.C2739a;
import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.p037d.C2836g;
import com.fyber.inneractive.sdk.p045e.C2897a;
import com.fyber.inneractive.sdk.p046f.C2912c;
import com.fyber.inneractive.sdk.p049h.C2966l;
import com.fyber.inneractive.sdk.p049h.C2968n;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.fyber.inneractive.sdk.util.C3670q;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.d.b */
public abstract class C2825b<Response extends C3018e, Content extends C2836g> implements C2897a {

    /* renamed from: a */
    protected InneractiveAdRequest f6700a;

    /* renamed from: b */
    protected Response f6701b;

    /* renamed from: c */
    protected Content f6702c;

    /* renamed from: d */
    protected C2809u f6703d;

    /* renamed from: e */
    protected C2767s f6704e;

    /* renamed from: f */
    protected boolean f6705f = false;

    /* renamed from: g */
    private C2897a.C2898a f6706g;

    /* renamed from: a */
    public abstract void mo18098a();

    /* renamed from: b */
    public abstract String mo18103b();

    /* renamed from: e */
    public void mo18104e() {
        this.f6700a = null;
        this.f6701b = null;
        this.f6702c = null;
        this.f6706g = null;
        this.f6703d = null;
    }

    /* renamed from: a */
    public final void mo18099a(InneractiveAdRequest inneractiveAdRequest, C3018e eVar, C2767s sVar, C2897a.C2898a aVar) {
        this.f6700a = inneractiveAdRequest;
        this.f6701b = eVar;
        this.f6706g = aVar;
        this.f6704e = sVar;
        if (inneractiveAdRequest == null) {
            this.f6703d = C2739a.m5956a(eVar.f7413p);
        }
        mo18098a();
    }

    /* renamed from: a */
    public final void mo18102a(C3018e eVar, C2767s sVar, boolean z, C2897a.C2898a aVar) {
        this.f6705f = z;
        mo18099a((InneractiveAdRequest) null, eVar, sVar, aVar);
    }

    /* renamed from: f */
    public final Content mo18105f() {
        return this.f6702c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C2809u mo18106g() {
        InneractiveAdRequest inneractiveAdRequest = this.f6700a;
        return inneractiveAdRequest == null ? this.f6703d : inneractiveAdRequest.getSelectedUnitConfig();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18100a(InneractiveError inneractiveError) {
        new C2815a(this.f6701b, this.f6700a, mo18103b(), this.f6704e.mo18013b()).mo18091a(inneractiveError);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo18107h() {
        if (this.f6700a != null) {
            C2912c.m6513a().mo18364a(this.f6700a.f6804d).mo18369e();
        }
        C2897a.C2898a aVar = this.f6706g;
        if (aVar != null) {
            aVar.mo18108a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18101a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        Content content;
        String str;
        if (this.f6706g != null) {
            InneractiveAdRequest inneractiveAdRequest = this.f6700a;
            Response response = this.f6701b;
            if (inneractiveInfrastructureError.getErrorCode().getMetricable() == InneractiveErrorCode.Metricable.INCLUDED_IN_FAILED_METRICS && ((content = this.f6702c) == null || content.mo18126a_() || this.f6702c.isVideoAd())) {
                IAlog.m9034b("Firing Event 801 - AdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
                if (inneractiveInfrastructureError.getCause() != null) {
                    str = Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace());
                } else {
                    str = C3670q.m9153a();
                }
                C2767s sVar = this.f6704e;
                C2968n.C2969a aVar = new C2968n.C2969a(C2966l.IA_AD_LOAD_FAILED, inneractiveAdRequest, (C3018e) response, sVar == null ? null : sVar.mo18013b());
                aVar.mo18433a(new C2968n.C2971b().mo18438a("message", inneractiveInfrastructureError.getErrorCode().toString()).mo18438a("description", str).mo18438a("extra_description", inneractiveInfrastructureError.description()));
                aVar.mo18436b((String) null);
            }
            this.f6706g.mo18112a(inneractiveInfrastructureError);
        }
    }
}
