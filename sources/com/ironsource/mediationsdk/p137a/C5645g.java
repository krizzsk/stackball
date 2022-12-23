package com.ironsource.mediationsdk.p137a;

import com.ironsource.mediationsdk.p137a.C5634b;
import com.ironsource.mediationsdk.utils.C5804m;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ironsource.mediationsdk.a.g */
public final class C5645g extends C5634b {

    /* renamed from: v */
    private static C5645g f13350v;

    /* renamed from: w */
    private String f13351w = "";

    private C5645g() {
        this.f13315r = "outcome";
        this.f13314q = 3;
        this.f13316s = IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
    }

    /* renamed from: e */
    public static synchronized C5645g m13810e() {
        C5645g gVar;
        synchronized (C5645g.class) {
            if (f13350v == null) {
                C5645g gVar2 = new C5645g();
                f13350v = gVar2;
                gVar2.mo41677a();
            }
            gVar = f13350v;
        }
        return gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo41687b() {
        this.f13317t.add(1000);
        this.f13317t.add(1001);
        this.f13317t.add(1002);
        this.f13317t.add(1003);
        this.f13317t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_LOAD_FAILED));
        this.f13317t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.f13317t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_READY_TRUE));
        this.f13317t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_READY_FALSE));
        this.f13317t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f13317t.add(Integer.valueOf(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo41696c(C5641c cVar) {
        return cVar.mo41706a() == 305;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo41697d(int i) {
        return (i == 15 || (i >= 300 && i < 400)) ? this.f13351w : "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo41700d(C5641c cVar) {
        int a = cVar.mo41706a();
        return a == 14 || a == 514 || a == 305 || a == 1003 || a == 1005 || a == 1203 || a == 1010 || a == 1301 || a == 1302;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo41701e(C5641c cVar) {
        return C5804m.m14360a().mo42136b((m13761e(cVar.mo41706a()) == C5634b.C5639a.OFFERWALL.f13337f ? 1 : 0) ^ 1);
    }
}
