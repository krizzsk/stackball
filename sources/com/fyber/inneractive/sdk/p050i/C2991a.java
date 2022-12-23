package com.fyber.inneractive.sdk.p050i;

import android.content.Context;
import com.fyber.inneractive.sdk.config.C2739a;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.p037d.C2857q;
import com.fyber.inneractive.sdk.p037d.C2858r;
import com.fyber.inneractive.sdk.player.C3145b;
import com.fyber.inneractive.sdk.player.C3304d;
import com.fyber.inneractive.sdk.player.C3312g;
import com.fyber.inneractive.sdk.player.p058b.C3154b;
import com.fyber.inneractive.sdk.player.p058b.C3172g;
import com.fyber.inneractive.sdk.player.p083e.C3599d;
import com.fyber.inneractive.sdk.player.p083e.C3600e;

/* renamed from: com.fyber.inneractive.sdk.i.a */
public final class C2991a extends C3013i {

    /* renamed from: c */
    private C3304d f7278c;

    /* renamed from: a */
    public final void mo18450a(C3145b.C3151a aVar) {
    }

    public C2991a(C3312g gVar) {
        this.f7278c = (C3304d) gVar.f8554d;
    }

    /* renamed from: a */
    public final C3600e mo18449a(Context context) {
        if (this.f7375b == null) {
            this.f7375b = new C3599d(context);
        }
        return this.f7375b;
    }

    /* renamed from: a */
    public final C3154b mo18448a(InneractiveAdSpot inneractiveAdSpot, C2857q qVar) {
        if (this.f7374a == null) {
            InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            this.f7374a = new C3172g(this.f7278c, (C3599d) this.f7375b, C2739a.m5956a(inneractiveAdSpot.getAdContent().mo18129f().f7413p), qVar.mo18132i(), selectedUnitController instanceof C2858r ? ((C2858r) selectedUnitController).isOverlayOutside() : false);
        }
        return this.f7374a;
    }

    /* renamed from: a */
    public final boolean mo18451a() {
        return this.f7278c.mo18762p();
    }
}
