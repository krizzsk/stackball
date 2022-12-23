package com.fyber.inneractive.sdk.p037d;

import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.p051j.C3019f;
import com.fyber.inneractive.sdk.p084ui.IAmraidWebViewController;

/* renamed from: com.fyber.inneractive.sdk.d.m */
public final class C2853m extends C2836g<C3019f> {

    /* renamed from: a */
    public IAmraidWebViewController f6798a;

    public final boolean isVideoAd() {
        return false;
    }

    public C2853m(C2809u uVar, C2767s sVar) {
        super(uVar, sVar);
    }

    /* renamed from: b */
    public final void mo18127b() {
        IAmraidWebViewController iAmraidWebViewController = this.f6798a;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.mo18553c();
            this.f6798a = null;
        }
    }

    /* renamed from: d */
    public final boolean mo18128d() {
        IAmraidWebViewController iAmraidWebViewController = this.f6798a;
        return iAmraidWebViewController != null && iAmraidWebViewController.mo18555d();
    }

    /* renamed from: a_ */
    public final boolean mo18126a_() {
        if (this.f6745i == null || this.f6745i.mo18071h() == null || this.f6745i.mo18071h().mo18057a() == null) {
            return false;
        }
        return this.f6745i.mo18071h().mo18057a().isFullscreenUnit();
    }
}
