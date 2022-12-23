package com.applovin.impl.sdk.p027d;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1473k;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.network.C1488b;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p025b.C1371e;
import com.applovin.impl.sdk.utils.C1520h;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.appsflyer.ServerParameters;
import com.facebook.appevents.AppEventsConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.d.p */
public class C1428p extends C1392a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1430a f3332a;

    /* renamed from: com.applovin.impl.sdk.d.p$a */
    public interface C1430a {
        /* renamed from: a */
        void mo12599a();
    }

    public C1428p(C1469j jVar, C1430a aVar) {
        super("TaskFetchVariables", jVar);
        this.f3332a = aVar;
    }

    /* renamed from: a */
    private Map<String, String> m2925a() {
        C1473k N = this.f3279b.mo13074N();
        C1473k.C1478d b = N.mo13150b();
        C1473k.C1476b c = N.mo13151c();
        HashMap hashMap = new HashMap();
        hashMap.put("platform", C1553o.m3557e(b.f3558a));
        hashMap.put(ServerParameters.MODEL, C1553o.m3557e(b.f3561d));
        hashMap.put("api_level", String.valueOf(b.f3560c));
        hashMap.put(CampaignEx.JSON_KEY_PACKAGE_NAME, C1553o.m3557e(c.f3531c));
        hashMap.put("installer_name", C1553o.m3557e(c.f3532d));
        hashMap.put("ia", Long.toString(c.f3536h));
        hashMap.put("api_did", this.f3279b.mo13088a(C1369c.f2851U));
        hashMap.put(ServerParameters.BRAND, C1553o.m3557e(b.f3562e));
        hashMap.put("brand_name", C1553o.m3557e(b.f3563f));
        hashMap.put("hardware", C1553o.m3557e(b.f3564g));
        hashMap.put("revision", C1553o.m3557e(b.f3565h));
        hashMap.put(ServerParameters.SDK_DATA_SDK_VERSION, AppLovinSdk.VERSION);
        hashMap.put("os", C1553o.m3557e(b.f3559b));
        hashMap.put("orientation_lock", b.f3569l);
        hashMap.put(TapjoyConstants.TJC_APP_VERSION_NAME, C1553o.m3557e(c.f3530b));
        hashMap.put(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, C1553o.m3557e(b.f3566i));
        hashMap.put(ServerParameters.CARRIER, C1553o.m3557e(b.f3567j));
        hashMap.put("tz_offset", String.valueOf(b.f3575r));
        hashMap.put("aida", String.valueOf(b.f3553N));
        String str = "1";
        hashMap.put("adr", b.f3577t ? str : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        hashMap.put("volume", String.valueOf(b.f3581x));
        hashMap.put("sb", String.valueOf(b.f3582y));
        if (!b.f3540A) {
            str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        hashMap.put("sim", str);
        hashMap.put("gy", String.valueOf(b.f3541B));
        hashMap.put("is_tablet", String.valueOf(b.f3542C));
        hashMap.put("tv", String.valueOf(b.f3543D));
        hashMap.put("vs", String.valueOf(b.f3544E));
        hashMap.put("lpm", String.valueOf(b.f3545F));
        hashMap.put("tg", c.f3533e);
        hashMap.put("ltg", c.f3534f);
        hashMap.put("fs", String.valueOf(b.f3547H));
        hashMap.put("tds", String.valueOf(b.f3548I));
        hashMap.put("fm", String.valueOf(b.f3549J.f3585b));
        hashMap.put("tm", String.valueOf(b.f3549J.f3584a));
        hashMap.put("lmt", String.valueOf(b.f3549J.f3586c));
        hashMap.put("lm", String.valueOf(b.f3549J.f3587d));
        hashMap.put("adns", String.valueOf(b.f3570m));
        hashMap.put("adnsd", String.valueOf(b.f3571n));
        hashMap.put("xdpi", String.valueOf(b.f3572o));
        hashMap.put("ydpi", String.valueOf(b.f3573p));
        hashMap.put("screen_size_in", String.valueOf(b.f3574q));
        hashMap.put("debug", Boolean.toString(c.f3535g));
        hashMap.put("af", String.valueOf(b.f3579v));
        hashMap.put("font", String.valueOf(b.f3580w));
        hashMap.put("bt_ms", String.valueOf(b.f3556Q));
        hashMap.put("mute_switch", String.valueOf(b.f3557R));
        if (!((Boolean) this.f3279b.mo13088a(C1369c.f3081eO)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3279b.mo13136t());
        }
        m2926a((Map<String, String>) hashMap);
        if (((Boolean) this.f3279b.mo13088a(C1369c.f3029dO)).booleanValue()) {
            C1557r.m3602a("cuid", this.f3279b.mo13125i(), (Map<String, String>) hashMap);
        }
        if (((Boolean) this.f3279b.mo13088a(C1369c.f3032dR)).booleanValue()) {
            hashMap.put("compass_random_token", this.f3279b.mo13126j());
        }
        if (((Boolean) this.f3279b.mo13088a(C1369c.f3034dT)).booleanValue()) {
            hashMap.put("applovin_random_token", this.f3279b.mo13127k());
        }
        Boolean bool = b.f3550K;
        if (bool != null) {
            hashMap.put("huc", bool.toString());
        }
        Boolean bool2 = b.f3551L;
        if (bool2 != null) {
            hashMap.put("aru", bool2.toString());
        }
        Boolean bool3 = b.f3552M;
        if (bool3 != null) {
            hashMap.put("dns", bool3.toString());
        }
        C1473k.C1477c cVar = b.f3578u;
        if (cVar != null) {
            hashMap.put("act", String.valueOf(cVar.f3538a));
            hashMap.put("acm", String.valueOf(cVar.f3539b));
        }
        String str2 = b.f3583z;
        if (C1553o.m3554b(str2)) {
            hashMap.put("ua", C1553o.m3557e(str2));
        }
        String str3 = b.f3546G;
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("so", C1553o.m3557e(str3));
        }
        if (b.f3554O > 0.0f) {
            hashMap.put("da", String.valueOf(b.f3554O));
        }
        if (b.f3555P > 0.0f) {
            hashMap.put("dm", String.valueOf(b.f3555P));
        }
        hashMap.put("sc", C1553o.m3557e((String) this.f3279b.mo13088a(C1369c.f2855Y)));
        hashMap.put("sc2", C1553o.m3557e((String) this.f3279b.mo13088a(C1369c.f2856Z)));
        hashMap.put("sc3", C1553o.m3557e((String) this.f3279b.mo13088a(C1369c.f2884aa)));
        hashMap.put("server_installed_at", C1553o.m3557e((String) this.f3279b.mo13088a(C1369c.f2885ab)));
        C1557r.m3602a("persisted_data", C1553o.m3557e((String) this.f3279b.mo13089a(C1371e.f3174z)), (Map<String, String>) hashMap);
        return hashMap;
    }

    /* renamed from: a */
    private void m2926a(Map<String, String> map) {
        try {
            C1473k.C1475a d = this.f3279b.mo13074N().mo13152d();
            String str = d.f3528b;
            if (C1553o.m3554b(str)) {
                map.put("idfa", str);
            }
            map.put("dnt", Boolean.toString(d.f3527a));
        } catch (Throwable th) {
            mo12945a("Failed to populate advertising info", th);
        }
    }

    public void run() {
        C14291 r1 = new C1449y<JSONObject>(C1488b.m3193a(this.f3279b).mo13200a(C1520h.m3458i(this.f3279b)).mo13210c(C1520h.m3459j(this.f3279b)).mo13201a(m2925a()).mo13206b("GET").mo13199a(new JSONObject()).mo13205b(((Integer) this.f3279b.mo13088a(C1369c.f3019dE)).intValue()).mo13204a(), this.f3279b) {
            /* renamed from: a */
            public void mo12144a(int i) {
                mo12949d("Unable to fetch variables: server returned " + i);
                C1505q.m3345i("AppLovinVariableService", "Failed to load variables.");
                C1428p.this.f3332a.mo12599a();
            }

            /* renamed from: a */
            public void mo12145a(JSONObject jSONObject, int i) {
                C1520h.m3450d(jSONObject, this.f3279b);
                C1520h.m3449c(jSONObject, this.f3279b);
                C1520h.m3456g(jSONObject, this.f3279b);
                C1428p.this.f3332a.mo12599a();
            }
        };
        r1.mo13035a(C1369c.f2874aQ);
        r1.mo13037b(C1369c.f2875aR);
        this.f3279b.mo13071K().mo13013a((C1392a) r1);
    }
}
