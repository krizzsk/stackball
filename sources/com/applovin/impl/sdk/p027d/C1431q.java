package com.applovin.impl.sdk.p027d;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1473k;
import com.applovin.impl.sdk.network.C1488b;
import com.applovin.impl.sdk.p024ad.C1351f;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p025b.C1371e;
import com.applovin.impl.sdk.utils.C1520h;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.d.q */
public class C1431q extends C1392a {

    /* renamed from: a */
    private final C1351f.C1354b f3334a;

    /* renamed from: c */
    private final C1351f.C1354b f3335c;

    /* renamed from: d */
    private final JSONArray f3336d;

    /* renamed from: e */
    private final MaxAdFormat f3337e;

    public C1431q(C1351f.C1354b bVar, C1351f.C1354b bVar2, JSONArray jSONArray, MaxAdFormat maxAdFormat, C1469j jVar) {
        super("TaskFlushZones", jVar);
        this.f3334a = bVar;
        this.f3335c = bVar2;
        this.f3336d = jSONArray;
        this.f3337e = maxAdFormat;
    }

    /* renamed from: a */
    private Map<String, String> m2931a() {
        Map<String, String> a = this.f3279b.mo13074N().mo13151c().mo13154a();
        a.putAll(this.f3279b.mo13074N().mo13150b().mo13155a());
        if (!((Boolean) this.f3279b.mo13088a(C1369c.f3081eO)).booleanValue()) {
            a.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3279b.mo13136t());
        }
        a.put("api_did", this.f3279b.mo13088a(C1369c.f2851U));
        m2932a(a);
        if (((Boolean) this.f3279b.mo13088a(C1369c.f3029dO)).booleanValue()) {
            C1557r.m3602a("cuid", this.f3279b.mo13125i(), a);
        }
        if (((Boolean) this.f3279b.mo13088a(C1369c.f3032dR)).booleanValue()) {
            a.put("compass_random_token", this.f3279b.mo13126j());
        }
        if (((Boolean) this.f3279b.mo13088a(C1369c.f3034dT)).booleanValue()) {
            a.put("applovin_random_token", this.f3279b.mo13127k());
        }
        a.put("sc", C1553o.m3557e((String) this.f3279b.mo13088a(C1369c.f2855Y)));
        a.put("sc2", C1553o.m3557e((String) this.f3279b.mo13088a(C1369c.f2856Z)));
        a.put("sc3", C1553o.m3557e((String) this.f3279b.mo13088a(C1369c.f2884aa)));
        a.put("server_installed_at", C1553o.m3557e((String) this.f3279b.mo13088a(C1369c.f2885ab)));
        C1557r.m3602a("persisted_data", C1553o.m3557e((String) this.f3279b.mo13089a(C1371e.f3174z)), a);
        return a;
    }

    /* renamed from: a */
    private void m2932a(Map<String, String> map) {
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

    /* renamed from: b */
    private JSONObject m2933b() {
        JSONObject jSONObject = new JSONObject();
        C1521i.m3493b(jSONObject, "ts_s", TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()), this.f3279b);
        if (this.f3334a != C1351f.C1354b.UNKNOWN_ZONE) {
            C1521i.m3477a(jSONObject, "format", this.f3337e.getLabel(), this.f3279b);
            C1521i.m3475a(jSONObject, "previous_trigger_code", this.f3335c.mo12739a(), this.f3279b);
            C1521i.m3477a(jSONObject, "previous_trigger_reason", this.f3335c.mo12740b(), this.f3279b);
        }
        C1521i.m3475a(jSONObject, "trigger_code", this.f3334a.mo12739a(), this.f3279b);
        C1521i.m3477a(jSONObject, "trigger_reason", this.f3334a.mo12740b(), this.f3279b);
        C1521i.m3478a(jSONObject, "zones", this.f3336d, this.f3279b);
        return jSONObject;
    }

    public void run() {
        Map<String, String> a = m2931a();
        JSONObject b = m2933b();
        String a2 = C1520h.m3439a((String) this.f3279b.mo13088a(C1369c.f3129fk), "1.0/flush_zones", this.f3279b);
        C14321 r1 = new C1449y<JSONObject>(C1488b.m3193a(this.f3279b).mo13200a(a2).mo13210c(C1520h.m3439a((String) this.f3279b.mo13088a(C1369c.f3130fl), "1.0/flush_zones", this.f3279b)).mo13201a(a).mo13202a(b).mo13206b("POST").mo13199a(new JSONObject()).mo13205b(((Integer) this.f3279b.mo13088a(C1369c.f3131fm)).intValue()).mo13204a(), this.f3279b) {
            /* renamed from: a */
            public void mo12144a(int i) {
            }

            /* renamed from: a */
            public void mo12145a(JSONObject jSONObject, int i) {
                C1520h.m3450d(jSONObject, this.f3279b);
            }
        };
        r1.mo13035a(C1369c.f2874aQ);
        r1.mo13037b(C1369c.f2875aR);
        this.f3279b.mo13071K().mo13013a((C1392a) r1);
    }
}
