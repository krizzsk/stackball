package com.applovin.impl.sdk.p027d;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p023a.C1342c;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.d.z */
public class C1451z extends C1393aa {

    /* renamed from: a */
    private final C1355g f3419a;

    public C1451z(C1355g gVar, C1469j jVar) {
        super("TaskReportAppLovinReward", jVar);
        this.f3419a = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo12389a() {
        return "2.0/cr";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12390a(int i) {
        super.mo12390a(i);
        mo12949d("Failed to report reward for ad: " + this.f3419a + " - error code: " + i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12391a(JSONObject jSONObject) {
        C1521i.m3477a(jSONObject, "zone_id", this.f3419a.getAdZone().mo12712a(), this.f3279b);
        C1521i.m3475a(jSONObject, "fire_percent", this.f3419a.mo12800an(), this.f3279b);
        String clCode = this.f3419a.getClCode();
        if (!C1553o.m3554b(clCode)) {
            clCode = "NO_CLCODE";
        }
        C1521i.m3477a(jSONObject, "clcode", clCode, this.f3279b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1342c mo12392b() {
        return this.f3419a.mo12785aO();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo12393b(JSONObject jSONObject) {
        mo12944a("Reported reward successfully for ad: " + this.f3419a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12394c() {
        mo12949d("No reward result was found for ad: " + this.f3419a);
    }
}
