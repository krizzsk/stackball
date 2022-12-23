package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.AdUnitIdBiddingSettings;
import com.yandex.mobile.ads.base.model.BiddingSettings;

/* renamed from: com.yandex.mobile.ads.impl.c5 */
class C12698c5 {

    /* renamed from: a */
    private final BiddingSettings f31808a;

    public C12698c5(BiddingSettings biddingSettings) {
        this.f31808a = biddingSettings;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdUnitIdBiddingSettings mo66203a(String str) {
        for (AdUnitIdBiddingSettings next : this.f31808a.mo64539c()) {
            if (next.mo64530c().equals(str)) {
                return next;
            }
        }
        return null;
    }
}
