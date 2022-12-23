package com.ogury.p245ed.internal;

import com.ogury.p245ed.OguryAdClickCallback;
import p269io.presage.interstitial.PresageInterstitialCallback;

/* renamed from: com.ogury.ed.internal.gs */
public final class C8270gs {

    /* renamed from: a */
    private C8271gt f21377a;

    /* renamed from: b */
    private OguryAdClickCallback f21378b;

    /* renamed from: a */
    public final C8271gt mo53623a(PresageInterstitialCallback presageInterstitialCallback) {
        if (presageInterstitialCallback == null) {
            return null;
        }
        C8271gt gtVar = new C8271gt(presageInterstitialCallback);
        gtVar.mo53625a(this.f21378b);
        this.f21377a = gtVar;
        return gtVar;
    }

    /* renamed from: a */
    public final void mo53624a(OguryAdClickCallback oguryAdClickCallback) {
        C8271gt gtVar = this.f21377a;
        if (gtVar != null) {
            gtVar.mo53625a(oguryAdClickCallback);
        }
        this.f21378b = oguryAdClickCallback;
    }
}
