package com.ironsource.sdk;

import com.ironsource.sdk.p153j.C6025a;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.c */
public final class C5836c {

    /* renamed from: a */
    public boolean f14208a = false;

    /* renamed from: b */
    public boolean f14209b = false;

    /* renamed from: c */
    public C5820a f14210c = null;

    /* renamed from: d */
    public Map<String, String> f14211d;

    /* renamed from: e */
    private String f14212e;

    /* renamed from: f */
    private final C6025a f14213f;

    public C5836c(String str, C6025a aVar) {
        this.f14212e = SDKUtils.requireNonEmptyOrNull(str, "Instance name can't be null");
        this.f14213f = (C6025a) SDKUtils.requireNonNull(aVar, "AdListener name can't be null");
    }

    /* renamed from: a */
    public final C5829b mo42177a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.f14212e);
            jSONObject.put("rewarded", this.f14208a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new C5829b(this.f14209b ? C5978d.m14740a() : C5978d.m14742a(jSONObject), this.f14212e, this.f14208a, this.f14209b, this.f14211d, this.f14213f, this.f14210c);
    }
}
