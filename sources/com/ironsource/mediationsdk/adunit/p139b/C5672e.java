package com.ironsource.mediationsdk.adunit.p139b;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.p140c.C5673a;
import com.ironsource.mediationsdk.adunit.p140c.C5674b;
import com.ironsource.mediationsdk.adunit.p140c.C5676c;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.model.C5726j;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import java.util.Set;

/* renamed from: com.ironsource.mediationsdk.adunit.b.e */
public final class C5672e extends C5668d<C5676c> {
    public C5672e(List<NetworkSettings> list, C5726j jVar, String str, int i, Set<ImpressionDataListener> set) {
        super(new C5665a(IronSource.AD_UNIT.INTERSTITIAL, str, list, jVar.f13757i, jVar.f13751c, jVar.f13752d, jVar.f13753e, i), set);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ C5674b mo41784a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i) {
        return new C5676c(new C5673a(IronSource.AD_UNIT.INTERSTITIAL, this.f13438h.f13423b, i, this.f13436f, this.f13433c, this.f13434d, this.f13435e, networkSettings, this.f13438h.f13429h), baseAdAdapter, this);
    }
}
