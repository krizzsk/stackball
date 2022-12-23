package com.applovin.impl.sdk.p027d;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p024ad.C1346b;
import com.applovin.impl.sdk.p024ad.C1349d;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.d.t */
public class C1441t extends C1392a implements AppLovinAdLoadListener {

    /* renamed from: a */
    private final JSONObject f3395a;

    /* renamed from: c */
    private final C1349d f3396c;

    /* renamed from: d */
    private final C1346b f3397d;

    /* renamed from: e */
    private final AppLovinAdLoadListener f3398e;

    public C1441t(JSONObject jSONObject, C1349d dVar, C1346b bVar, AppLovinAdLoadListener appLovinAdLoadListener, C1469j jVar) {
        super("TaskProcessAdResponse", jVar);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        } else if (dVar != null) {
            this.f3395a = jSONObject;
            this.f3396c = dVar;
            this.f3397d = bVar;
            this.f3398e = appLovinAdLoadListener;
        } else {
            throw new IllegalArgumentException("No zone specified");
        }
    }

    /* renamed from: a */
    private void m2966a(int i) {
        C1557r.m3600a(this.f3398e, this.f3396c, i, this.f3279b);
    }

    /* renamed from: a */
    private void m2967a(JSONObject jSONObject) {
        String b = C1521i.m3487b(jSONObject, "type", "undefined", this.f3279b);
        if ("applovin".equalsIgnoreCase(b)) {
            mo12944a("Starting task for AppLovin ad...");
            this.f3279b.mo13071K().mo13013a((C1392a) new C1446v(jSONObject, this.f3395a, this.f3397d, this, this.f3279b));
        } else if ("vast".equalsIgnoreCase(b)) {
            mo12944a("Starting task for VAST ad...");
            this.f3279b.mo13071K().mo13013a((C1392a) C1442u.m2969a(jSONObject, this.f3395a, this.f3397d, this, this.f3279b));
        } else {
            mo12947c("Unable to process ad of unknown type: " + b);
            failedToReceiveAd(AppLovinErrorCodes.INVALID_RESPONSE);
        }
    }

    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f3398e;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
    }

    public void failedToReceiveAd(int i) {
        m2966a(i);
    }

    public void run() {
        JSONArray b = C1521i.m3491b(this.f3395a, CampaignUnit.JSON_KEY_ADS, new JSONArray(), this.f3279b);
        if (b.length() > 0) {
            mo12944a("Processing ad...");
            m2967a(C1521i.m3474a(b, 0, new JSONObject(), this.f3279b));
            return;
        }
        mo12947c("No ads were returned from the server");
        C1557r.m3603a(this.f3396c.mo12712a(), this.f3395a, this.f3279b);
        m2966a(204);
    }
}
