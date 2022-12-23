package com.ironsource.mediationsdk.p137a;

import com.ironsource.mediationsdk.p137a.C5634b;
import com.ironsource.mediationsdk.utils.C5804m;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ironsource.mediationsdk.a.d */
public final class C5642d extends C5634b {

    /* renamed from: v */
    private static C5642d f13343v;

    /* renamed from: w */
    private String f13344w = "";

    private C5642d() {
        this.f13315r = "ironbeast";
        this.f13314q = 2;
        this.f13316s = IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
    }

    /* renamed from: e */
    public static synchronized C5642d m13798e() {
        C5642d dVar;
        synchronized (C5642d.class) {
            if (f13343v == null) {
                C5642d dVar2 = new C5642d();
                f13343v = dVar2;
                dVar2.mo41677a();
            }
            dVar = f13343v;
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo41687b() {
        this.f13317t.add(2001);
        this.f13317t.add(2002);
        this.f13317t.add(2003);
        this.f13317t.add(2004);
        this.f13317t.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_LOAD_FAILED));
        this.f13317t.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_LOAD_NO_FILL));
        this.f13317t.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_READY_TRUE));
        this.f13317t.add(Integer.valueOf(IronSourceConstants.IS_INSTANCE_READY_FALSE));
        this.f13317t.add(3001);
        this.f13317t.add(Integer.valueOf(IronSourceConstants.BN_CALLBACK_LOAD_ERROR));
        this.f13317t.add(Integer.valueOf(IronSourceConstants.BN_RELOAD));
        this.f13317t.add(Integer.valueOf(IronSourceConstants.BN_RELOAD_FAILED));
        this.f13317t.add(Integer.valueOf(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS));
        this.f13317t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_LOAD));
        this.f13317t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD));
        this.f13317t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS));
        this.f13317t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_LOAD_ERROR));
        this.f13317t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS));
        this.f13317t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_RELOAD_ERROR));
        this.f13317t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS));
        this.f13317t.add(Integer.valueOf(IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo41696c(C5641c cVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo41697d(int i) {
        return this.f13344w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo41700d(C5641c cVar) {
        int a = cVar.mo41706a();
        return a == 2204 || a == 2004 || a == 2005 || a == 2301 || a == 2300 || a == 3005 || a == 3015;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo41701e(C5641c cVar) {
        return C5804m.m14360a().mo42136b(m13761e(cVar.mo41706a()) == C5634b.C5639a.BANNER.f13337f ? 3 : 2);
    }
}
