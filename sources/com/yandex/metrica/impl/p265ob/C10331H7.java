package com.yandex.metrica.impl.p265ob;

import android.util.Base64;
import com.appsflyer.share.Constants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p265ob.C10734S;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.H7 */
public class C10331H7 {

    /* renamed from: a */
    private final byte[] f24811a;

    /* renamed from: b */
    private final String f24812b;

    /* renamed from: c */
    private final int f24813c;

    /* renamed from: d */
    private final HashMap<C10734S.C10735a, Integer> f24814d;

    /* renamed from: e */
    private final String f24815e;

    /* renamed from: f */
    private final Integer f24816f;

    /* renamed from: g */
    private final String f24817g;

    /* renamed from: h */
    private final String f24818h;

    /* renamed from: i */
    private final CounterConfiguration.C10019b f24819i;

    /* renamed from: j */
    private final String f24820j;

    public C10331H7(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObject2 = jSONObject.getJSONObject("event");
        this.f24811a = Base64.decode(jSONObject2.getString("jvm_crash"), 0);
        this.f24812b = jSONObject2.getString("name");
        this.f24813c = jSONObject2.getInt("bytes_truncated");
        this.f24820j = C11993ym.m30992e(jSONObject2, "environment");
        String optString = jSONObject2.optString("trimmed_fields");
        this.f24814d = new HashMap<>();
        if (optString != null) {
            try {
                HashMap<String, String> d = C11993ym.m30990d(optString);
                if (d != null) {
                    for (Map.Entry next : d.entrySet()) {
                        this.f24814d.put(C10734S.C10735a.valueOf((String) next.getKey()), Integer.valueOf(Integer.parseInt((String) next.getValue())));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("process_configuration");
        this.f24815e = jSONObject3.getString(CampaignEx.JSON_KEY_PACKAGE_NAME);
        this.f24816f = Integer.valueOf(jSONObject3.getInt(Constants.URL_MEDIA_SOURCE));
        this.f24817g = jSONObject3.getString("psid");
        JSONObject jSONObject4 = jSONObject.getJSONObject("reporter_configuration");
        this.f24818h = jSONObject4.getString(TapjoyConstants.TJC_API_KEY);
        this.f24819i = m26436a(jSONObject4);
    }

    /* renamed from: a */
    public String mo61417a() {
        return this.f24818h;
    }

    /* renamed from: b */
    public int mo61418b() {
        return this.f24813c;
    }

    /* renamed from: c */
    public byte[] mo61419c() {
        return this.f24811a;
    }

    /* renamed from: d */
    public String mo61420d() {
        return this.f24820j;
    }

    /* renamed from: e */
    public String mo61421e() {
        return this.f24812b;
    }

    /* renamed from: f */
    public String mo61422f() {
        return this.f24815e;
    }

    /* renamed from: g */
    public Integer mo61423g() {
        return this.f24816f;
    }

    /* renamed from: h */
    public String mo61424h() {
        return this.f24817g;
    }

    /* renamed from: i */
    public CounterConfiguration.C10019b mo61425i() {
        return this.f24819i;
    }

    /* renamed from: j */
    public HashMap<C10734S.C10735a, Integer> mo61426j() {
        return this.f24814d;
    }

    /* renamed from: k */
    public String mo61427k() throws JSONException {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f24814d.entrySet()) {
            hashMap.put(((C10734S.C10735a) next.getKey()).name(), next.getValue());
        }
        return new JSONObject().put("process_configuration", new JSONObject().put(Constants.URL_MEDIA_SOURCE, this.f24816f).put("psid", this.f24817g).put(CampaignEx.JSON_KEY_PACKAGE_NAME, this.f24815e)).put("reporter_configuration", new JSONObject().put(TapjoyConstants.TJC_API_KEY, this.f24818h).put("reporter_type", this.f24819i.mo60823a())).put("event", new JSONObject().put("jvm_crash", Base64.encodeToString(this.f24811a, 0)).put("name", this.f24812b).put("bytes_truncated", this.f24813c).put("trimmed_fields", C11993ym.m30997g(hashMap)).putOpt("environment", this.f24820j)).toString();
    }

    @Deprecated
    /* renamed from: a */
    private CounterConfiguration.C10019b m26436a(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("reporter_type")) {
            return CounterConfiguration.C10019b.m25810a(jSONObject.getString("reporter_type"));
        }
        if (jSONObject.getBoolean("is_commutation")) {
            return CounterConfiguration.C10019b.COMMUTATION;
        }
        return CounterConfiguration.C10019b.MAIN;
    }

    public C10331H7(C11411k0 k0Var, C10770T3 t3, HashMap<C10734S.C10735a, Integer> hashMap) {
        this.f24811a = k0Var.mo63164q();
        this.f24812b = k0Var.mo63154g();
        this.f24813c = k0Var.mo63150d();
        if (hashMap != null) {
            this.f24814d = hashMap;
        } else {
            this.f24814d = new HashMap<>();
        }
        C10797U3 a = t3.mo62271a();
        this.f24815e = a.mo62340f();
        this.f24816f = a.mo62341g();
        this.f24817g = a.mo62342h();
        CounterConfiguration b = t3.mo62272b();
        this.f24818h = b.mo60794a();
        this.f24819i = b.mo60812k();
        this.f24820j = k0Var.mo63155h();
    }
}
