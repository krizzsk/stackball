package com.chartboost.sdk.impl;

import com.chartboost.sdk.Model.C1842g;
import com.chartboost.sdk.Networking.requests.models.ShowParamsModel;
import com.chartboost.sdk.impl.C1965p0;
import com.facebook.appevents.AppEventsConstants;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.chartboost.sdk.impl.s0 */
public class C1978s0 extends C1965p0 {
    public C1978s0(String str, C1842g gVar, ShowParamsModel showParamsModel, C1965p0.C1966a aVar) {
        super("https://live.chartboost.com", str, gVar, 2, aVar);
        this.f4568i = 1;
        m4807a(showParamsModel);
    }

    /* renamed from: a */
    private void m4807a(ShowParamsModel showParamsModel) {
        mo14750a("cached", (Object) AppEventsConstants.EVENT_PARAM_VALUE_NO);
        mo14750a(FirebaseAnalytics.Param.LOCATION, (Object) showParamsModel.getLocation());
        String adId = showParamsModel.getAdId();
        if (!adId.isEmpty()) {
            mo14750a("ad_id", (Object) adId);
        }
    }
}
