package com.fyber.inneractive.sdk.p037d;

import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p047g.p048a.C2917b;
import com.fyber.inneractive.sdk.p051j.C3020g;
import com.fyber.inneractive.sdk.player.C3312g;

/* renamed from: com.fyber.inneractive.sdk.d.q */
public final class C2857q extends C2836g<C3020g> {

    /* renamed from: a */
    public C3312g f6799a;

    /* renamed from: b */
    public boolean f6800b = false;

    public final boolean isVideoAd() {
        return true;
    }

    public C2857q(C2809u uVar, C2767s sVar, C3020g gVar, InneractiveAdRequest inneractiveAdRequest) {
        super(uVar, sVar);
        mo18125a(gVar);
        mo18124a(inneractiveAdRequest);
    }

    /* renamed from: b */
    public final void mo18127b() {
        C3312g gVar = this.f6799a;
        if (gVar != null) {
            gVar.mo19116d();
            this.f6799a = null;
        }
    }

    /* renamed from: a */
    public final void mo18216a(String str, String... strArr) {
        C3312g gVar = this.f6799a;
        if (gVar != null) {
            gVar.mo19113a(str, strArr);
        }
    }

    /* renamed from: c */
    public final String mo18217c() {
        if (this.f6743g != null) {
            C3020g gVar = (C3020g) this.f6743g;
            if (gVar.f7426E != null) {
                return gVar.f7426E.f6941b;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final String mo18218e() {
        String str = null;
        if (this.f6743g != null) {
            C2917b bVar = ((C3020g) this.f6743g).f7426E.f6946g;
            if (bVar != null) {
                str = bVar.f6954f;
            }
            if (str == null) {
                return mo18217c();
            }
        }
        return str;
    }

    /* renamed from: d */
    public final boolean mo18128d() {
        return this.f6799a != null;
    }

    /* renamed from: a_ */
    public final boolean mo18126a_() {
        if (this.f6745i.mo18070g() == null) {
            return false;
        }
        return this.f6745i.mo18070g().mo18081i();
    }
}
