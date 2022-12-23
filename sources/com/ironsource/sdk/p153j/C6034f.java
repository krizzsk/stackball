package com.ironsource.sdk.p153j;

import com.ironsource.sdk.p150g.C6004a;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.ironsource.sdk.j.f */
public interface C6034f extends C6025a {
    void onRVAdClicked();

    void onRVAdClosed();

    void onRVAdCredited(int i);

    void onRVAdOpened();

    void onRVEventNotificationReceived(String str, JSONObject jSONObject);

    void onRVInitFail(String str);

    void onRVInitSuccess(C6004a aVar);

    void onRVNoMoreOffers();

    void onRVShowFail(String str);
}
