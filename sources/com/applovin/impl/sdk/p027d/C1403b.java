package com.applovin.impl.sdk.p027d;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1473k;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.network.C1488b;
import com.applovin.impl.sdk.network.C1492d;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.utils.C1520h;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.sdk.AppLovinSdk;
import com.appsflyer.ServerParameters;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.ReportDBAdapter;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.d.b */
class C1403b extends C1392a {
    C1403b(C1469j jVar) {
        super("TaskApiSubmitData", jVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2827a(JSONObject jSONObject) {
        try {
            this.f3279b.mo13075O().mo12923c();
            JSONObject a = C1520h.m3440a(jSONObject);
            this.f3279b.mo13064C().mo12844a((C1369c<?>) C1369c.f2851U, (Object) a.getString("device_id"));
            this.f3279b.mo13064C().mo12844a((C1369c<?>) C1369c.f2852V, (Object) a.getString("device_token"));
            this.f3279b.mo13064C().mo12844a((C1369c<?>) C1369c.f2853W, (Object) Long.valueOf(a.getLong("publisher_id")));
            this.f3279b.mo13064C().mo12847b();
            C1520h.m3450d(a, this.f3279b);
            C1520h.m3454f(a, this.f3279b);
            String b = C1521i.m3487b(a, "latest_version", "", this.f3279b);
            if (!TextUtils.isEmpty(b) && !AppLovinSdk.VERSION.equals(b)) {
                String str = "Current SDK version (" + AppLovinSdk.VERSION + ") is outdated. Please integrate the latest version of the AppLovin SDK (" + b + "). Doing so will improve your CPMs and ensure you have access to the latest revenue earning features.";
                if (C1521i.m3484a(a, "sdk_update_message")) {
                    str = C1521i.m3487b(a, "sdk_update_message", str, this.f3279b);
                }
                C1505q.m3344h("AppLovinSdk", str);
            }
            this.f3279b.mo13072L().mo12930b();
        } catch (Throwable th) {
            mo12945a("Unable to parse API response", th);
        }
    }

    /* renamed from: b */
    private void m2828b(JSONObject jSONObject) throws JSONException {
        C1473k N = this.f3279b.mo13074N();
        C1473k.C1476b c = N.mo13151c();
        C1473k.C1478d b = N.mo13150b();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(ServerParameters.MODEL, b.f3561d);
        jSONObject2.put("os", b.f3559b);
        jSONObject2.put(ServerParameters.BRAND, b.f3562e);
        jSONObject2.put("brand_name", b.f3563f);
        jSONObject2.put("hardware", b.f3564g);
        jSONObject2.put(ServerParameters.SDK_DATA_SDK_VERSION, b.f3560c);
        jSONObject2.put("revision", b.f3565h);
        jSONObject2.put("adns", (double) b.f3570m);
        jSONObject2.put("adnsd", b.f3571n);
        jSONObject2.put("xdpi", String.valueOf(b.f3572o));
        jSONObject2.put("ydpi", String.valueOf(b.f3573p));
        jSONObject2.put("screen_size_in", String.valueOf(b.f3574q));
        jSONObject2.put("gy", C1553o.m3550a(b.f3541B));
        jSONObject2.put(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, b.f3566i);
        jSONObject2.put(ServerParameters.CARRIER, b.f3567j);
        jSONObject2.put("orientation_lock", b.f3569l);
        jSONObject2.put("tz_offset", b.f3575r);
        jSONObject2.put("aida", String.valueOf(b.f3553N));
        jSONObject2.put("adr", C1553o.m3550a(b.f3577t));
        jSONObject2.put("wvvc", b.f3576s);
        jSONObject2.put("volume", b.f3581x);
        jSONObject2.put("sb", b.f3582y);
        jSONObject2.put("type", "android");
        jSONObject2.put("sim", C1553o.m3550a(b.f3540A));
        jSONObject2.put("is_tablet", C1553o.m3550a(b.f3542C));
        jSONObject2.put("lpm", b.f3545F);
        jSONObject2.put("tv", C1553o.m3550a(b.f3543D));
        jSONObject2.put("vs", C1553o.m3550a(b.f3544E));
        jSONObject2.put("fs", b.f3547H);
        jSONObject2.put("tds", b.f3548I);
        jSONObject2.put("fm", String.valueOf(b.f3549J.f3585b));
        jSONObject2.put("tm", String.valueOf(b.f3549J.f3584a));
        jSONObject2.put("lmt", String.valueOf(b.f3549J.f3586c));
        jSONObject2.put("lm", String.valueOf(b.f3549J.f3587d));
        jSONObject2.put("af", String.valueOf(b.f3579v));
        jSONObject2.put("font", String.valueOf(b.f3580w));
        jSONObject2.put("bt_ms", String.valueOf(b.f3556Q));
        jSONObject2.put("mute_switch", String.valueOf(b.f3557R));
        m2832f(jSONObject2);
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
        C1473k.C1477c cVar = b.f3578u;
        if (cVar != null) {
            jSONObject2.put("act", cVar.f3538a);
            jSONObject2.put("acm", cVar.f3539b);
        }
        String str = b.f3583z;
        if (C1553o.m3554b(str)) {
            jSONObject2.put("ua", C1553o.m3557e(str));
        }
        String str2 = b.f3546G;
        if (!TextUtils.isEmpty(str2)) {
            jSONObject2.put("so", C1553o.m3557e(str2));
        }
        Locale locale = b.f3568k;
        if (locale != null) {
            jSONObject2.put("locale", C1553o.m3557e(locale.toString()));
        }
        if (b.f3554O > 0.0f) {
            jSONObject2.put("da", (double) b.f3554O);
        }
        if (b.f3555P > 0.0f) {
            jSONObject2.put("dm", (double) b.f3555P);
        }
        jSONObject.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(CampaignEx.JSON_KEY_PACKAGE_NAME, c.f3531c);
        jSONObject3.put("installer_name", c.f3532d);
        jSONObject3.put("app_name", c.f3529a);
        jSONObject3.put(TapjoyConstants.TJC_APP_VERSION_NAME, c.f3530b);
        jSONObject3.put("installed_at", c.f3536h);
        jSONObject3.put("tg", c.f3533e);
        jSONObject3.put("ltg", c.f3534f);
        jSONObject3.put("applovin_sdk_version", AppLovinSdk.VERSION);
        jSONObject3.put("first_install", String.valueOf(this.f3279b.mo13068H()));
        jSONObject3.put("first_install_v2", String.valueOf(!this.f3279b.mo13069I()));
        jSONObject3.put("test_ads", c.f3537i);
        jSONObject3.put("debug", Boolean.toString(c.f3535g));
        String str3 = (String) this.f3279b.mo13088a(C1369c.f3036dV);
        if (C1553o.m3554b(str3)) {
            jSONObject3.put("plugin_version", str3);
        }
        if (((Boolean) this.f3279b.mo13088a(C1369c.f3029dO)).booleanValue() && C1553o.m3554b(this.f3279b.mo13125i())) {
            jSONObject3.put("cuid", this.f3279b.mo13125i());
        }
        if (((Boolean) this.f3279b.mo13088a(C1369c.f3032dR)).booleanValue()) {
            jSONObject3.put("compass_random_token", this.f3279b.mo13126j());
        }
        if (((Boolean) this.f3279b.mo13088a(C1369c.f3034dT)).booleanValue()) {
            jSONObject3.put("applovin_random_token", this.f3279b.mo13127k());
        }
        jSONObject.put("app_info", jSONObject3);
    }

    /* renamed from: c */
    private void m2829c(JSONObject jSONObject) throws JSONException {
        if (((Boolean) this.f3279b.mo13088a(C1369c.f3114ev)).booleanValue()) {
            jSONObject.put("stats", this.f3279b.mo13072L().mo12932c());
        }
        if (((Boolean) this.f3279b.mo13088a(C1369c.f2888ae)).booleanValue()) {
            JSONObject b = C1492d.m3233b(mo12951f());
            if (b.length() > 0) {
                jSONObject.put("network_response_codes", b);
            }
            if (((Boolean) this.f3279b.mo13088a(C1369c.f2889af)).booleanValue()) {
                C1492d.m3231a(mo12951f());
            }
        }
    }

    /* renamed from: d */
    private void m2830d(JSONObject jSONObject) throws JSONException {
        JSONArray a;
        if (((Boolean) this.f3279b.mo13088a(C1369c.f3068eB)).booleanValue() && (a = this.f3279b.mo13075O().mo12920a()) != null && a.length() > 0) {
            jSONObject.put(ReportDBAdapter.ReportColumns.COLUMN_ERRORS, a);
        }
    }

    /* renamed from: e */
    private void m2831e(JSONObject jSONObject) {
        C14041 r0 = new C1449y<JSONObject>(C1488b.m3193a(this.f3279b).mo13200a(C1520h.m3438a("2.0/device", this.f3279b)).mo13210c(C1520h.m3448b("2.0/device", this.f3279b)).mo13201a(C1520h.m3451e(this.f3279b)).mo13206b("POST").mo13202a(jSONObject).mo13199a(new JSONObject()).mo13198a(((Integer) this.f3279b.mo13088a(C1369c.f3064dx)).intValue()).mo13204a(), this.f3279b) {
            /* renamed from: a */
            public void mo12144a(int i) {
                C1520h.m3441a(i, this.f3279b);
            }

            /* renamed from: a */
            public void mo12145a(JSONObject jSONObject, int i) {
                C1403b.this.m2827a(jSONObject);
            }
        };
        r0.mo13035a(C1369c.f2870aM);
        r0.mo13037b(C1369c.f2871aN);
        this.f3279b.mo13071K().mo13013a((C1392a) r0);
    }

    /* renamed from: f */
    private void m2832f(JSONObject jSONObject) {
        try {
            C1473k.C1475a d = this.f3279b.mo13074N().mo13152d();
            String str = d.f3528b;
            if (C1553o.m3554b(str)) {
                jSONObject.put("idfa", str);
            }
            jSONObject.put("dnt", Boolean.toString(d.f3527a));
        } catch (Throwable th) {
            mo12945a("Failed to populate advertising info", th);
        }
    }

    public void run() {
        try {
            mo12946b("Submitting user data...");
            JSONObject jSONObject = new JSONObject();
            m2828b(jSONObject);
            m2829c(jSONObject);
            m2830d(jSONObject);
            m2831e(jSONObject);
        } catch (JSONException e) {
            mo12945a("Unable to build JSON message with collected data", e);
        }
    }
}
