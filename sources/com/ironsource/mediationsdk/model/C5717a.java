package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.model.a */
public final class C5717a {

    /* renamed from: a */
    public NetworkSettings f13706a;

    /* renamed from: b */
    public JSONObject f13707b;

    /* renamed from: c */
    public boolean f13708c;

    /* renamed from: d */
    public int f13709d;

    /* renamed from: e */
    public int f13710e;

    /* renamed from: f */
    public IronSource.AD_UNIT f13711f;

    public C5717a(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.f13706a = networkSettings;
        this.f13707b = jSONObject;
        int optInt = jSONObject.optInt(IronSourceConstants.EVENTS_INSTANCE_TYPE);
        this.f13709d = optInt;
        this.f13708c = optInt == 2;
        this.f13710e = jSONObject.optInt("maxAdsPerSession", 99);
        this.f13711f = ad_unit;
    }
}
