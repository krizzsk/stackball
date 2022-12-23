package com.applovin.impl.mediation.p021c;

import android.app.Activity;
import android.graphics.Point;
import com.applovin.impl.adview.C1072c;
import com.applovin.impl.mediation.C1259f;
import com.applovin.impl.mediation.p022d.C1254b;
import com.applovin.impl.mediation.p022d.C1255c;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1473k;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.network.C1484a;
import com.applovin.impl.sdk.network.C1488b;
import com.applovin.impl.sdk.p025b.C1368b;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p025b.C1371e;
import com.applovin.impl.sdk.p026c.C1387g;
import com.applovin.impl.sdk.p026c.C1388h;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.p027d.C1449y;
import com.applovin.impl.sdk.utils.C1519g;
import com.applovin.impl.sdk.utils.C1520h;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1522j;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.appsflyer.ServerParameters;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.c */
public class C1241c extends C1392a {

    /* renamed from: a */
    private final String f2396a;

    /* renamed from: c */
    private final MaxAdFormat f2397c;

    /* renamed from: d */
    private final C1259f f2398d;

    /* renamed from: e */
    private final JSONArray f2399e;

    /* renamed from: f */
    private final Activity f2400f;

    /* renamed from: g */
    private final MaxAdListener f2401g;

    public C1241c(String str, MaxAdFormat maxAdFormat, C1259f fVar, JSONArray jSONArray, Activity activity, C1469j jVar, MaxAdListener maxAdListener) {
        super("TaskFetchMediatedAd " + str, jVar);
        this.f2396a = str;
        this.f2397c = maxAdFormat;
        this.f2398d = fVar;
        this.f2399e = jSONArray;
        this.f2400f = activity;
        this.f2401g = maxAdListener;
    }

    /* renamed from: a */
    private String m2154a() {
        return C1254b.m2213a(this.f3279b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2155a(int i) {
        boolean z = i != 204;
        C1505q v = this.f3279b.mo13139v();
        String e = mo12950e();
        Boolean valueOf = Boolean.valueOf(z);
        v.mo13273a(e, valueOf, "Unable to fetch " + this.f2396a + " ad: server returned " + i);
        if (i == -800) {
            this.f3279b.mo13072L().mo12926a(C1387g.f3262o);
        }
        m2162b(i);
    }

    /* renamed from: a */
    private void m2158a(C1388h hVar) {
        long b = hVar.mo12929b(C1387g.f3250c);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b > TimeUnit.MINUTES.toMillis((long) ((Integer) this.f3279b.mo13088a(C1369c.f3022dH)).intValue())) {
            hVar.mo12931b(C1387g.f3250c, currentTimeMillis);
            hVar.mo12933c(C1387g.f3251d);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2159a(JSONObject jSONObject) {
        try {
            C1520h.m3450d(jSONObject, this.f3279b);
            C1520h.m3449c(jSONObject, this.f3279b);
            C1520h.m3456g(jSONObject, this.f3279b);
            C1254b.m2214a(jSONObject, this.f3279b);
            C1254b.m2216b(jSONObject, this.f3279b);
            this.f3279b.mo13071K().mo13013a((C1392a) m2160b(jSONObject));
        } catch (Throwable th) {
            mo12945a("Unable to process mediated ad response", th);
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    /* renamed from: b */
    private C1246f m2160b(JSONObject jSONObject) {
        return new C1246f(this.f2396a, this.f2397c, jSONObject, this.f2400f, this.f3279b, this.f2401g);
    }

    /* renamed from: b */
    private String m2161b() {
        return C1254b.m2215b(this.f3279b);
    }

    /* renamed from: b */
    private void m2162b(int i) {
        C1522j.m3503a(this.f2401g, this.f2396a, i);
    }

    /* renamed from: c */
    private JSONObject m2163c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        m2166e(jSONObject);
        m2167f(jSONObject);
        m2165d(jSONObject);
        m2164c(jSONObject);
        jSONObject.put("sc", C1553o.m3557e((String) this.f3279b.mo13088a(C1369c.f2855Y)));
        jSONObject.put("sc2", C1553o.m3557e((String) this.f3279b.mo13088a(C1369c.f2856Z)));
        jSONObject.put("sc3", C1553o.m3557e((String) this.f3279b.mo13088a(C1369c.f2884aa)));
        jSONObject.put("server_installed_at", C1553o.m3557e((String) this.f3279b.mo13088a(C1369c.f2885ab)));
        String str = (String) this.f3279b.mo13089a(C1371e.f3174z);
        if (C1553o.m3554b(str)) {
            jSONObject.put("persisted_data", C1553o.m3557e(str));
        }
        if (((Boolean) this.f3279b.mo13088a(C1369c.f3114ev)).booleanValue()) {
            m2169h(jSONObject);
        }
        jSONObject.put("mediation_provider", this.f3279b.mo13130n());
        return jSONObject;
    }

    /* renamed from: c */
    private void m2164c(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("loaded", new JSONArray(this.f3279b.mo13140w().mo12415a()));
            jSONObject2.put("failed", new JSONArray(this.f3279b.mo13140w().mo12416b()));
            jSONObject.put("classname_info", jSONObject2);
            jSONObject.put("initialized_adapters", this.f3279b.mo13141x().mo12413c());
            jSONObject.put("initialized_adapter_classnames", new JSONArray(this.f3279b.mo13141x().mo12412b()));
            jSONObject.put("installed_mediation_adapters", C1255c.m2219a(this.f3279b).mo12397a());
        } catch (Exception e) {
            mo12945a("Failed to populate adapter classnames", e);
            throw new RuntimeException("Failed to populate classnames: " + e);
        }
    }

    /* renamed from: d */
    private void m2165d(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.f2399e;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    /* renamed from: e */
    private void m2166e(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", this.f2396a);
        jSONObject2.put("ad_format", C1255c.m2223b(this.f2397c));
        if (this.f2398d != null && ((Boolean) this.f3279b.mo13088a(C1368b.f2829h)).booleanValue()) {
            jSONObject2.put("extra_parameters", C1521i.m3473a((Map<String, ?>) C1521i.m3468a(this.f2398d.mo12402a())));
        }
        if (((Boolean) this.f3279b.mo13088a(C1369c.f2886ac)).booleanValue()) {
            jSONObject2.put("n", String.valueOf(this.f3279b.mo13104aa().mo13294a(this.f2396a)));
        }
        jSONObject.put("ad_info", jSONObject2);
    }

    /* renamed from: f */
    private void m2167f(JSONObject jSONObject) throws JSONException {
        C1473k N = this.f3279b.mo13074N();
        C1473k.C1478d b = N.mo13150b();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(ServerParameters.BRAND, b.f3562e);
        jSONObject2.put("brand_name", b.f3563f);
        jSONObject2.put("hardware", b.f3564g);
        jSONObject2.put("api_level", b.f3560c);
        jSONObject2.put(ServerParameters.CARRIER, b.f3567j);
        jSONObject2.put(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, b.f3566i);
        jSONObject2.put("locale", b.f3568k);
        jSONObject2.put(ServerParameters.MODEL, b.f3561d);
        jSONObject2.put("os", b.f3559b);
        jSONObject2.put("platform", b.f3558a);
        jSONObject2.put("revision", b.f3565h);
        jSONObject2.put("orientation_lock", b.f3569l);
        jSONObject2.put("tz_offset", b.f3575r);
        jSONObject2.put("aida", C1553o.m3550a(b.f3553N));
        jSONObject2.put("wvvc", b.f3576s);
        jSONObject2.put("adns", (double) b.f3570m);
        jSONObject2.put("adnsd", b.f3571n);
        jSONObject2.put("xdpi", (double) b.f3572o);
        jSONObject2.put("ydpi", (double) b.f3573p);
        jSONObject2.put("screen_size_in", b.f3574q);
        jSONObject2.put("sim", C1553o.m3550a(b.f3540A));
        jSONObject2.put("gy", C1553o.m3550a(b.f3541B));
        jSONObject2.put("is_tablet", C1553o.m3550a(b.f3542C));
        jSONObject2.put("tv", C1553o.m3550a(b.f3543D));
        jSONObject2.put("vs", C1553o.m3550a(b.f3544E));
        jSONObject2.put("lpm", b.f3545F);
        jSONObject2.put("fs", b.f3547H);
        jSONObject2.put("tds", b.f3548I);
        jSONObject2.put("fm", b.f3549J.f3585b);
        jSONObject2.put("tm", b.f3549J.f3584a);
        jSONObject2.put("lmt", b.f3549J.f3586c);
        jSONObject2.put("lm", b.f3549J.f3587d);
        jSONObject2.put("adr", C1553o.m3550a(b.f3577t));
        jSONObject2.put("volume", b.f3581x);
        jSONObject2.put("sb", b.f3582y);
        jSONObject2.put(ServerParameters.NETWORK, C1520h.m3453f(this.f3279b));
        jSONObject2.put("af", b.f3579v);
        jSONObject2.put("font", (double) b.f3580w);
        if (C1553o.m3554b(b.f3583z)) {
            jSONObject2.put("ua", b.f3583z);
        }
        if (C1553o.m3554b(b.f3546G)) {
            jSONObject2.put("so", b.f3546G);
        }
        jSONObject2.put("bt_ms", String.valueOf(b.f3556Q));
        jSONObject2.put("mute_switch", String.valueOf(b.f3557R));
        C1473k.C1477c cVar = b.f3578u;
        if (cVar != null) {
            jSONObject2.put("act", cVar.f3538a);
            jSONObject2.put("acm", cVar.f3539b);
        }
        Boolean bool = b.f3550K;
        if (bool != null) {
            jSONObject2.put("huc", bool.toString());
        }
        Boolean bool2 = b.f3551L;
        if (bool2 != null) {
            jSONObject2.put("aru", bool2.toString());
        }
        Boolean bool3 = b.f3552M;
        if (bool3 != null) {
            jSONObject2.put("dns", bool3.toString());
        }
        Point a = C1519g.m3428a(mo12951f());
        jSONObject2.put("dx", Integer.toString(a.x));
        jSONObject2.put("dy", Integer.toString(a.y));
        if (b.f3554O > 0.0f) {
            jSONObject2.put("da", (double) b.f3554O);
        }
        if (b.f3555P > 0.0f) {
            jSONObject2.put("dm", (double) b.f3555P);
        }
        m2168g(jSONObject2);
        jSONObject.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, jSONObject2);
        C1473k.C1476b c = N.mo13151c();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(CampaignEx.JSON_KEY_PACKAGE_NAME, c.f3531c);
        jSONObject3.put("installer_name", c.f3532d);
        jSONObject3.put("app_name", c.f3529a);
        jSONObject3.put(TapjoyConstants.TJC_APP_VERSION_NAME, c.f3530b);
        jSONObject3.put("installed_at", c.f3536h);
        jSONObject3.put("tg", c.f3533e);
        jSONObject3.put("ltg", c.f3534f);
        jSONObject3.put("api_did", this.f3279b.mo13088a(C1369c.f2851U));
        jSONObject3.put(ServerParameters.SDK_DATA_SDK_VERSION, AppLovinSdk.VERSION);
        jSONObject3.put("build", 131);
        jSONObject3.put("first_install", String.valueOf(this.f3279b.mo13068H()));
        jSONObject3.put("first_install_v2", String.valueOf(!this.f3279b.mo13069I()));
        jSONObject3.put("test_ads", c.f3537i);
        jSONObject3.put("debug", Boolean.toString(c.f3535g));
        String i = this.f3279b.mo13125i();
        if (((Boolean) this.f3279b.mo13088a(C1369c.f3029dO)).booleanValue() && C1553o.m3554b(i)) {
            jSONObject3.put("cuid", i);
        }
        if (((Boolean) this.f3279b.mo13088a(C1369c.f3032dR)).booleanValue()) {
            jSONObject3.put("compass_random_token", this.f3279b.mo13126j());
        }
        if (((Boolean) this.f3279b.mo13088a(C1369c.f3034dT)).booleanValue()) {
            jSONObject3.put("applovin_random_token", this.f3279b.mo13127k());
        }
        String str = (String) this.f3279b.mo13088a(C1369c.f3036dV);
        if (C1553o.m3554b(str)) {
            jSONObject3.put("plugin_version", str);
        }
        jSONObject.put("app_info", jSONObject3);
        C1484a.C1486b a2 = this.f3279b.mo13070J().mo13169a();
        if (a2 != null) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("lrm_ts_ms", String.valueOf(a2.mo13173a()));
            jSONObject4.put("lrm_url", a2.mo13174b());
            jSONObject4.put("lrm_ct_ms", String.valueOf(a2.mo13176d()));
            jSONObject4.put("lrm_rs", String.valueOf(a2.mo13175c()));
            jSONObject.put("connection_info", jSONObject4);
        }
    }

    /* renamed from: g */
    private void m2168g(JSONObject jSONObject) throws JSONException {
        C1473k.C1475a d = this.f3279b.mo13074N().mo13152d();
        String str = d.f3528b;
        if (C1553o.m3554b(str)) {
            jSONObject.put("idfa", str);
        }
        jSONObject.put("dnt", d.f3527a);
    }

    /* renamed from: h */
    private void m2169h(JSONObject jSONObject) throws JSONException {
        C1388h L = this.f3279b.mo13072L();
        jSONObject.put("li", String.valueOf(L.mo12929b(C1387g.f3249b)));
        jSONObject.put("si", String.valueOf(L.mo12929b(C1387g.f3251d)));
        jSONObject.put("pf", String.valueOf(L.mo12929b(C1387g.f3255h)));
        jSONObject.put("mpf", String.valueOf(L.mo12929b(C1387g.f3262o)));
        jSONObject.put("gpf", String.valueOf(L.mo12929b(C1387g.f3256i)));
        jSONObject.put("asoac", String.valueOf(L.mo12929b(C1387g.f3260m)));
    }

    public void run() {
        mo12944a("Fetching next ad for ad unit id: " + this.f2396a + " and format: " + this.f2397c);
        if (((Boolean) this.f3279b.mo13088a(C1369c.f3095ec)).booleanValue() && C1557r.m3628d()) {
            mo12944a("User is connected to a VPN");
        }
        C1388h L = this.f3279b.mo13072L();
        L.mo12926a(C1387g.f3261n);
        if (L.mo12929b(C1387g.f3250c) == 0) {
            L.mo12931b(C1387g.f3250c, System.currentTimeMillis());
        }
        try {
            JSONObject c = m2163c();
            HashMap hashMap = new HashMap();
            hashMap.put("rid", UUID.randomUUID().toString());
            if (c.has("huc")) {
                hashMap.put("huc", String.valueOf(C1521i.m3463a(c, "huc", (Boolean) false, this.f3279b)));
            }
            if (c.has("aru")) {
                hashMap.put("aru", String.valueOf(C1521i.m3463a(c, "aru", (Boolean) false, this.f3279b)));
            }
            if (c.has("dns")) {
                hashMap.put("dns", String.valueOf(C1521i.m3463a(c, "dns", (Boolean) false, this.f3279b)));
            }
            if (!((Boolean) this.f3279b.mo13088a(C1369c.f3081eO)).booleanValue()) {
                hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3279b.mo13136t());
            }
            Map<String, String> map = null;
            if (((Boolean) this.f3279b.mo13088a(C1369c.f3106en)).booleanValue()) {
                map = C1072c.m1576b(((Long) this.f3279b.mo13088a(C1369c.f3107eo)).longValue());
            }
            m2158a(L);
            C12421 r1 = new C1449y<JSONObject>(C1488b.m3193a(this.f3279b).mo13206b("POST").mo13207b(map).mo13200a(m2154a()).mo13210c(m2161b()).mo13201a((Map<String, String>) hashMap).mo13202a(c).mo13199a(new JSONObject()).mo13205b(((Long) this.f3279b.mo13088a(C1368b.f2827f)).intValue()).mo13198a(((Integer) this.f3279b.mo13088a(C1369c.f3063dw)).intValue()).mo13209c(((Long) this.f3279b.mo13088a(C1368b.f2826e)).intValue()).mo13208b(true).mo13204a(), this.f3279b) {
                /* renamed from: a */
                public void mo12144a(int i) {
                    C1241c.this.m2155a(i);
                }

                /* renamed from: a */
                public void mo12145a(JSONObject jSONObject, int i) {
                    if (i == 200) {
                        C1521i.m3493b(jSONObject, "ad_fetch_latency_millis", this.f3413d.mo13171a(), this.f3279b);
                        C1521i.m3493b(jSONObject, "ad_fetch_response_size", this.f3413d.mo13172b(), this.f3279b);
                        C1241c.this.m2159a(jSONObject);
                        return;
                    }
                    C1241c.this.m2155a(i);
                }
            };
            r1.mo13035a(C1368b.f2824c);
            r1.mo13037b(C1368b.f2825d);
            this.f3279b.mo13071K().mo13013a((C1392a) r1);
        } catch (Throwable th) {
            mo12945a("Unable to fetch ad " + this.f2396a, th);
            throw new RuntimeException("Unable to fetch ad: " + th);
        }
    }
}
