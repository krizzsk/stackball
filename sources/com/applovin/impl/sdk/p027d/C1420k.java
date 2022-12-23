package com.applovin.impl.sdk.p027d;

import android.os.Build;
import com.applovin.impl.mediation.p022d.C1254b;
import com.applovin.impl.mediation.p022d.C1255c;
import com.applovin.impl.sdk.C1456g;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1473k;
import com.applovin.impl.sdk.network.C1488b;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p025b.C1371e;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.impl.sdk.utils.C1520h;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.appsflyer.ServerParameters;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.d.k */
public class C1420k extends C1392a {

    /* renamed from: a */
    private static int f3321a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AtomicBoolean f3322c = new AtomicBoolean();

    /* renamed from: com.applovin.impl.sdk.d.k$a */
    private class C1422a extends C1392a {
        public C1422a(C1469j jVar) {
            super("TaskTimeoutFetchBasicSettings", jVar, true);
        }

        public void run() {
            if (!C1420k.this.f3322c.get()) {
                mo12949d("Timing out fetch basic settings...");
                C1420k.this.m2891a(new JSONObject());
            }
        }
    }

    public C1420k(C1469j jVar) {
        super("TaskFetchBasicSettings", jVar, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2891a(JSONObject jSONObject) {
        boolean z = true;
        if (this.f3322c.compareAndSet(false, true)) {
            C1520h.m3450d(jSONObject, this.f3279b);
            C1520h.m3449c(jSONObject, this.f3279b);
            if (jSONObject.length() <= 0) {
                z = false;
            }
            C1520h.m3442a(jSONObject, z, this.f3279b);
            C1254b.m2214a(jSONObject, this.f3279b);
            C1254b.m2216b(jSONObject, this.f3279b);
            mo12946b("Executing initialize SDK...");
            this.f3279b.mo13143z().mo12147a(C1521i.m3463a(jSONObject, "smd", (Boolean) false, this.f3279b).booleanValue());
            C1520h.m3456g(jSONObject, this.f3279b);
            C1520h.m3452e(jSONObject, this.f3279b);
            this.f3279b.mo13102a(jSONObject);
            this.f3279b.mo13071K().mo13013a((C1392a) new C1433r(this.f3279b));
            C1520h.m3454f(jSONObject, this.f3279b);
            mo12946b("Finished executing initialize SDK");
        }
    }

    /* renamed from: c */
    private String m2892c() {
        return C1520h.m3439a((String) this.f3279b.mo13088a(C1369c.f2866aI), "5.0/i", mo12948d());
    }

    /* renamed from: h */
    private String m2893h() {
        return C1520h.m3439a((String) this.f3279b.mo13088a(C1369c.f2867aJ), "5.0/i", mo12948d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo12993a() {
        HashMap hashMap = new HashMap();
        hashMap.put("rid", UUID.randomUUID().toString());
        if (!((Boolean) this.f3279b.mo13088a(C1369c.f3081eO)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3279b.mo13136t());
        }
        Boolean a = C1456g.m3008a(mo12951f());
        if (a != null) {
            hashMap.put("huc", a.toString());
        }
        Boolean b = C1456g.m3012b(mo12951f());
        if (b != null) {
            hashMap.put("aru", b.toString());
        }
        Boolean c = C1456g.m3014c(mo12951f());
        if (c != null) {
            hashMap.put("dns", c.toString());
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public JSONObject mo12994b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ServerParameters.SDK_DATA_SDK_VERSION, AppLovinSdk.VERSION);
            jSONObject.put("build", String.valueOf(131));
            int i = f3321a + 1;
            f3321a = i;
            jSONObject.put("init_count", String.valueOf(i));
            jSONObject.put("server_installed_at", C1553o.m3557e((String) this.f3279b.mo13088a(C1369c.f2885ab)));
            if (this.f3279b.mo13068H()) {
                jSONObject.put("first_install", true);
            }
            if (!this.f3279b.mo13069I()) {
                jSONObject.put("first_install_v2", true);
            }
            String str = (String) this.f3279b.mo13088a(C1369c.f3036dV);
            if (C1553o.m3554b(str)) {
                jSONObject.put("plugin_version", C1553o.m3557e(str));
            }
            String n = this.f3279b.mo13130n();
            if (C1553o.m3554b(n)) {
                jSONObject.put("mediation_provider", C1553o.m3557e(n));
            }
            C1255c.C1257a a = C1255c.m2219a(this.f3279b);
            jSONObject.put("installed_mediation_adapters", a.mo12397a());
            jSONObject.put("uninstalled_mediation_adapter_classnames", a.mo12398b());
            C1473k.C1476b c = this.f3279b.mo13074N().mo13151c();
            jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, C1553o.m3557e(c.f3531c));
            jSONObject.put(TapjoyConstants.TJC_APP_VERSION_NAME, C1553o.m3557e(c.f3530b));
            jSONObject.put("test_ads", c.f3537i);
            jSONObject.put("debug", String.valueOf(c.f3535g));
            jSONObject.put("platform", "android");
            jSONObject.put("os", C1553o.m3557e(Build.VERSION.RELEASE));
            jSONObject.put("tg", C1557r.m3588a(C1371e.f3155g, this.f3279b));
            jSONObject.put("ltg", C1557r.m3588a(C1371e.f3156h, this.f3279b));
            if (((Boolean) this.f3279b.mo13088a(C1369c.f3031dQ)).booleanValue()) {
                jSONObject.put("compass_random_token", this.f3279b.mo13126j());
            }
            if (((Boolean) this.f3279b.mo13088a(C1369c.f3033dS)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.f3279b.mo13127k());
            }
        } catch (JSONException e) {
            mo12945a("Failed to construct JSON body", e);
        }
        return jSONObject;
    }

    public void run() {
        Map<String, String> a = mo12993a();
        C1488b<T> a2 = C1488b.m3193a(this.f3279b).mo13200a(m2892c()).mo13210c(m2893h()).mo13201a(a).mo13202a(mo12994b()).mo13206b("POST").mo13199a(new JSONObject()).mo13198a(((Integer) this.f3279b.mo13088a(C1369c.f3015dA)).intValue()).mo13209c(((Integer) this.f3279b.mo13088a(C1369c.f3018dD)).intValue()).mo13205b(((Integer) this.f3279b.mo13088a(C1369c.f3066dz)).intValue()).mo13208b(true).mo13204a();
        this.f3279b.mo13071K().mo13015a(new C1422a(this.f3279b), C1435s.C1437a.TIMEOUT, ((long) ((Integer) this.f3279b.mo13088a(C1369c.f3066dz)).intValue()) + 250);
        C14211 r1 = new C1449y<JSONObject>(a2, this.f3279b, mo12952g()) {
            /* renamed from: a */
            public void mo12144a(int i) {
                mo12949d("Unable to fetch basic SDK settings: server returned " + i);
                C1420k.this.m2891a(new JSONObject());
            }

            /* renamed from: a */
            public void mo12145a(JSONObject jSONObject, int i) {
                C1420k.this.m2891a(jSONObject);
            }
        };
        r1.mo13035a(C1369c.f2868aK);
        r1.mo13037b(C1369c.f2869aL);
        this.f3279b.mo13071K().mo13013a((C1392a) r1);
    }
}
