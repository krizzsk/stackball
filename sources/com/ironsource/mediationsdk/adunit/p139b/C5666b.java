package com.ironsource.mediationsdk.adunit.p139b;

import com.ironsource.mediationsdk.C5543A;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.mediationsdk.adunit.b.b */
final class C5666b {

    /* renamed from: a */
    IronSource.AD_UNIT f13430a;

    public C5666b(IronSource.AD_UNIT ad_unit) {
        this.f13430a = ad_unit;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41776a(IronSourceError ironSourceError) {
        if (this.f13430a == IronSource.AD_UNIT.INTERSTITIAL) {
            C5543A.m13206a().mo41283b(ironSourceError);
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + this.f13430a);
    }
}
