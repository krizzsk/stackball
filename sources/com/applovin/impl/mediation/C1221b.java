package com.applovin.impl.mediation;

import com.applovin.impl.mediation.C1168a;
import com.applovin.impl.mediation.C1231c;
import com.applovin.impl.mediation.p020b.C1225c;
import com.applovin.impl.sdk.C1469j;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.mediation.b */
public class C1221b implements C1168a.C1169a, C1231c.C1233a {

    /* renamed from: a */
    private final C1168a f2352a;

    /* renamed from: b */
    private final C1231c f2353b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final MaxAdListener f2354c;

    public C1221b(C1469j jVar, MaxAdListener maxAdListener) {
        this.f2354c = maxAdListener;
        this.f2352a = new C1168a(jVar);
        this.f2353b = new C1231c(jVar, this);
    }

    /* renamed from: a */
    public void mo12143a(final C1225c cVar) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
            public void run() {
                C1221b.this.f2354c.onAdHidden(cVar);
            }
        }, cVar.mo12326s());
    }

    /* renamed from: a */
    public void mo12279a(MaxAd maxAd) {
        this.f2353b.mo12372a();
        this.f2352a.mo12141a();
    }

    /* renamed from: b */
    public void mo12280b(C1225c cVar) {
        long q = cVar.mo12324q();
        if (q >= 0) {
            this.f2353b.mo12373a(cVar, q);
        }
        if (cVar.mo12325r()) {
            this.f2352a.mo12142a(cVar, this);
        }
    }

    /* renamed from: c */
    public void mo12281c(C1225c cVar) {
        this.f2354c.onAdHidden(cVar);
    }
}
