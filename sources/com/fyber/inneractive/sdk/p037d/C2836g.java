package com.fyber.inneractive.sdk.p037d;

import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p051j.C3018e;

/* renamed from: com.fyber.inneractive.sdk.d.g */
public abstract class C2836g<T extends C3018e> {

    /* renamed from: f */
    protected InneractiveAdRequest f6742f;

    /* renamed from: g */
    protected T f6743g;

    /* renamed from: h */
    protected C2767s f6744h;

    /* renamed from: i */
    protected final C2809u f6745i;

    /* renamed from: j */
    protected boolean f6746j = false;

    /* renamed from: k */
    boolean f6747k = false;

    /* renamed from: b */
    public abstract void mo18127b();

    /* renamed from: d */
    public abstract boolean mo18128d();

    public abstract boolean isVideoAd();

    protected C2836g(C2809u uVar, C2767s sVar) {
        this.f6745i = uVar;
        this.f6744h = sVar;
    }

    /* renamed from: f */
    public T mo18129f() {
        return this.f6743g;
    }

    /* renamed from: a */
    public final void mo18125a(T t) {
        this.f6743g = t;
    }

    /* renamed from: g */
    public final InneractiveAdRequest mo18130g() {
        return this.f6742f;
    }

    /* renamed from: a */
    public final void mo18124a(InneractiveAdRequest inneractiveAdRequest) {
        this.f6742f = inneractiveAdRequest;
    }

    /* renamed from: h */
    public final C2809u mo18131h() {
        return this.f6745i;
    }

    /* renamed from: i */
    public final C2767s mo18132i() {
        return this.f6744h;
    }

    /* renamed from: a_ */
    public boolean mo18126a_() {
        if (this.f6745i.mo18067d() != null) {
        }
        return false;
    }

    /* renamed from: j */
    public final void mo18134j() {
        this.f6746j = true;
    }

    /* renamed from: k */
    public final boolean mo18135k() {
        InneractiveAdRequest inneractiveAdRequest = this.f6742f;
        return (inneractiveAdRequest != null && inneractiveAdRequest.getMuteVideo()) || this.f6747k;
    }
}
