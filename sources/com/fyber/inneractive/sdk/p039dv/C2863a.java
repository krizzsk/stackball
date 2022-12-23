package com.fyber.inneractive.sdk.p039dv;

import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.p037d.C2836g;
import com.fyber.inneractive.sdk.p051j.C3018e;
import com.google.android.gms.ads.AdRequest;

/* renamed from: com.fyber.inneractive.sdk.dv.a */
public abstract class C2863a<T> extends C2836g<C2895f> {

    /* renamed from: b */
    protected C2870c f6809b;

    /* renamed from: c */
    protected C2886e f6810c;

    /* renamed from: d */
    protected T f6811d;

    /* renamed from: d */
    public boolean mo18128d() {
        return false;
    }

    public boolean isVideoAd() {
        return false;
    }

    public C2863a(C2809u uVar, C2767s sVar, C2895f fVar) {
        super(uVar, sVar);
        mo18125a(fVar);
    }

    /* renamed from: b */
    public final void mo18127b() {
        this.f6809b = null;
        this.f6811d = null;
    }

    /* renamed from: c */
    public final C2895f mo18227c() {
        return (C2895f) super.mo18129f();
    }

    /* renamed from: e */
    public final T mo18228e() {
        return this.f6811d;
    }

    /* renamed from: a */
    public void mo18226a(AdRequest adRequest, C2870c cVar) {
        this.f6809b = cVar;
    }

    /* renamed from: a */
    public void mo18225a(C2886e eVar) {
        this.f6810c = eVar;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C3018e mo18129f() {
        return (C2895f) super.mo18129f();
    }
}
