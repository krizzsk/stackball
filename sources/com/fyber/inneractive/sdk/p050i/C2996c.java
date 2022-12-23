package com.fyber.inneractive.sdk.p050i;

import android.content.Context;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.p037d.C2855o;
import com.fyber.inneractive.sdk.p037d.C2857q;
import com.fyber.inneractive.sdk.p037d.C2858r;
import com.fyber.inneractive.sdk.player.C3145b;
import com.fyber.inneractive.sdk.player.C3304d;
import com.fyber.inneractive.sdk.player.C3312g;
import com.fyber.inneractive.sdk.player.p058b.C3154b;
import com.fyber.inneractive.sdk.player.p058b.C3160e;
import com.fyber.inneractive.sdk.player.p083e.C3597b;
import com.fyber.inneractive.sdk.player.p083e.C3600e;

/* renamed from: com.fyber.inneractive.sdk.i.c */
public final class C2996c extends C3013i {

    /* renamed from: c */
    private C3304d f7292c;

    public C2996c(C3312g gVar) {
        this.f7292c = (C3304d) gVar.f8554d;
    }

    /* renamed from: a */
    public final C3600e mo18449a(Context context) {
        if (this.f7375b == null) {
            this.f7375b = new C3597b(context);
        }
        return this.f7375b;
    }

    /* renamed from: a */
    public final C3154b mo18448a(InneractiveAdSpot inneractiveAdSpot, C2857q qVar) {
        if (this.f7374a == null) {
            InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            boolean isOverlayOutside = selectedUnitController instanceof C2858r ? ((C2858r) selectedUnitController).isOverlayOutside() : false;
            Skip skip = null;
            if (inneractiveAdSpot instanceof C2855o) {
                skip = ((C2855o) inneractiveAdSpot).mo18203a();
            }
            this.f7374a = new C3160e(this.f7292c, (C3597b) this.f7375b, inneractiveAdSpot.getAdContent().mo18131h(), qVar.mo18132i(), isOverlayOutside, skip, qVar.mo18135k());
        }
        return this.f7374a;
    }

    /* renamed from: a */
    public final boolean mo18451a() {
        return this.f7292c.mo18762p();
    }

    /* renamed from: a */
    public final void mo18450a(C3145b.C3151a aVar) {
        C3304d dVar = this.f7292c;
        if (dVar.f7784l == null || dVar.f7782j) {
            aVar.mo18475a();
        } else {
            dVar.f7785m = aVar;
        }
    }
}
