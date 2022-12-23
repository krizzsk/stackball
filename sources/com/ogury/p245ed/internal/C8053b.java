package com.ogury.p245ed.internal;

import com.ogury.p245ed.OguryBannerCallback;

/* renamed from: com.ogury.ed.internal.b */
public final class C8053b extends C8271gt {

    /* renamed from: a */
    private final OguryBannerCallback f20926a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8053b(OguryBannerCallback oguryBannerCallback) {
        super(oguryBannerCallback);
        C8467mq.m23881b(oguryBannerCallback, "callback");
        this.f20926a = oguryBannerCallback;
    }

    /* renamed from: a */
    public final void mo53203a() {
        this.f20926a.onAdClicked();
    }
}
