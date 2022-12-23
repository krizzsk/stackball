package com.chartboost.sdk.impl;

import com.appsflyer.ServerParameters;
import com.chartboost.sdk.C2026k;
import com.chartboost.sdk.Libraries.C1823d;
import com.chartboost.sdk.Libraries.C1825e;
import com.chartboost.sdk.Model.C1842g;
import com.chartboost.sdk.Networking.requests.models.MediationModel;
import com.chartboost.sdk.impl.C1965p0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.q0 */
public final class C1972q0 extends C1965p0 {

    /* renamed from: o */
    private final JSONObject f5070o = new JSONObject();

    /* renamed from: p */
    private final JSONObject f5071p = new JSONObject();

    /* renamed from: q */
    private final JSONObject f5072q = new JSONObject();

    /* renamed from: r */
    private final JSONObject f5073r = new JSONObject();

    public C1972q0(String str, C1842g gVar, int i, C1965p0.C1966a aVar) {
        super("https://live.chartboost.com", str, gVar, i, aVar);
    }

    /* renamed from: a */
    public void mo14782a(String str, Object obj, int i) {
        if (i == 0) {
            C1825e.m4026a(this.f5073r, str, obj);
            mo14750a("ad", (Object) this.f5073r);
        }
    }

    /* renamed from: c */
    public void mo14752c() {
        C1842g.C1843a d = this.f5056n.mo14308d();
        C1825e.m4026a(this.f5071p, TapjoyConstants.TJC_APP_PLACEMENT, this.f5056n.f4502l);
        C1825e.m4026a(this.f5071p, TJAdUnitConstants.String.BUNDLE, this.f5056n.f4499i);
        C1825e.m4026a(this.f5071p, "bundle_id", this.f5056n.f4500j);
        C1825e.m4026a(this.f5071p, "custom_id", C2026k.f5245b);
        C1825e.m4026a(this.f5071p, "session_id", "");
        C1825e.m4026a(this.f5071p, "ui", -1);
        C1825e.m4026a(this.f5071p, "test_mode", Boolean.FALSE);
        mo14750a(TapjoyConstants.TJC_APP_PLACEMENT, (Object) this.f5071p);
        boolean z = false;
        C1825e.m4026a(this.f5072q, ServerParameters.CARRIER, C1825e.m4025a(C1825e.m4023a((String) TapjoyConstants.TJC_CARRIER_NAME, (Object) this.f5056n.f4505o.optString("carrier-name")), C1825e.m4023a((String) TapjoyConstants.TJC_MOBILE_COUNTRY_CODE, (Object) this.f5056n.f4505o.optString("mobile-country-code")), C1825e.m4023a((String) TapjoyConstants.TJC_MOBILE_NETWORK_CODE, (Object) this.f5056n.f4505o.optString("mobile-network-code")), C1825e.m4023a("iso_country_code", (Object) this.f5056n.f4505o.optString("iso-country-code")), C1825e.m4023a("phone_type", (Object) Integer.valueOf(this.f5056n.f4505o.optInt("phone-type")))));
        C1825e.m4026a(this.f5072q, ServerParameters.MODEL, this.f5056n.f4495e);
        C1825e.m4026a(this.f5072q, TapjoyConstants.TJC_DEVICE_TYPE_NAME, this.f5056n.f4503m);
        C1825e.m4026a(this.f5072q, "actual_device_type", this.f5056n.f4504n);
        C1825e.m4026a(this.f5072q, "os", this.f5056n.f4496f);
        C1825e.m4026a(this.f5072q, "country", this.f5056n.f4497g);
        C1825e.m4026a(this.f5072q, "language", this.f5056n.f4498h);
        C1825e.m4026a(this.f5072q, "timestamp", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(this.f5056n.f4494d.mo14254a())));
        C1825e.m4026a(this.f5072q, "reachability", Integer.valueOf(this.f5056n.f4492b.mo14338b()));
        C1825e.m4026a(this.f5072q, "is_portrait", Boolean.valueOf(this.f5056n.mo14316l()));
        C1825e.m4026a(this.f5072q, "scale", Float.valueOf(d.f4516e));
        C1825e.m4026a(this.f5072q, "rooted_device", Boolean.valueOf(this.f5056n.f4507q));
        C1825e.m4026a(this.f5072q, TapjoyConstants.TJC_DEVICE_TIMEZONE, this.f5056n.f4508r);
        C1825e.m4026a(this.f5072q, "mobile_network", Integer.valueOf(this.f5056n.mo14304a()));
        C1825e.m4026a(this.f5072q, "dw", Integer.valueOf(d.f4512a));
        C1825e.m4026a(this.f5072q, "dh", Integer.valueOf(d.f4513b));
        C1825e.m4026a(this.f5072q, "dpi", d.f4517f);
        C1825e.m4026a(this.f5072q, "w", Integer.valueOf(d.f4514c));
        C1825e.m4026a(this.f5072q, "h", Integer.valueOf(d.f4515d));
        C1825e.m4026a(this.f5072q, "user_agent", C2026k.f5260q);
        C1825e.m4026a(this.f5072q, "device_family", "");
        C1825e.m4026a(this.f5072q, "retina", Boolean.FALSE);
        C1823d.C1824a e = this.f5056n.mo14309e();
        C1825e.m4026a(this.f5072q, "identity", e.f4385b);
        int i = e.f4384a;
        if (i != -1) {
            if (i == 1) {
                z = true;
            }
            C1825e.m4026a(this.f5072q, "limit_ad_tracking", Boolean.valueOf(z));
        }
        C1825e.m4026a(this.f5072q, "pidatauseconsent", Integer.valueOf(C1988v0.f5103a.getValue()));
        C1825e.m4026a(this.f5072q, "privacy", this.f5056n.mo14312h());
        mo14750a("device", (Object) this.f5072q);
        C1825e.m4026a(this.f5070o, "sdk", this.f5056n.f4501k);
        if (C2026k.f5248e != null) {
            C1825e.m4026a(this.f5070o, "framework_version", C2026k.f5250g);
            C1825e.m4026a(this.f5070o, "wrapper_version", C2026k.f5246c);
        }
        MediationModel mediationModel = C2026k.f5252i;
        if (mediationModel != null) {
            C1825e.m4026a(this.f5070o, "mediation", mediationModel.getMediation());
            C1825e.m4026a(this.f5070o, "mediation_version", C2026k.f5252i.getMediationVersion());
            C1825e.m4026a(this.f5070o, TapjoyConstants.TJC_ADAPTER_VERSION, C2026k.f5252i.getAdapterVersion());
        }
        C1825e.m4026a(this.f5070o, "commit_hash", "47ae58346b771626762a300b4688c6bcdeb1fde2");
        String str = this.f5056n.f4493c.get().f4520a;
        if (!C2014x.m4911b().mo14884a((CharSequence) str)) {
            C1825e.m4026a(this.f5070o, "config_variant", str);
        }
        mo14750a("sdk", (Object) this.f5070o);
        C1825e.m4026a(this.f5073r, "session", Integer.valueOf(this.f5056n.mo14314j()));
        if (this.f5073r.isNull("cache")) {
            C1825e.m4026a(this.f5073r, "cache", Boolean.FALSE);
        }
        if (this.f5073r.isNull("amount")) {
            C1825e.m4026a(this.f5073r, "amount", 0);
        }
        if (this.f5073r.isNull("retry_count")) {
            C1825e.m4026a(this.f5073r, "retry_count", 0);
        }
        if (this.f5073r.isNull(FirebaseAnalytics.Param.LOCATION)) {
            C1825e.m4026a(this.f5073r, FirebaseAnalytics.Param.LOCATION, "");
        }
        mo14750a("ad", (Object) this.f5073r);
    }
}
