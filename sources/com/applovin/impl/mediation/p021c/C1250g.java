package com.applovin.impl.mediation.p021c;

import com.applovin.impl.mediation.p020b.C1225c;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p023a.C1342c;
import com.applovin.impl.sdk.p027d.C1393aa;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.g */
public class C1250g extends C1393aa {

    /* renamed from: a */
    private final C1225c f2425a;

    public C1250g(C1225c cVar, C1469j jVar) {
        super("TaskReportMaxReward", jVar);
        this.f2425a = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo12389a() {
        return "2.0/mcr";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12390a(int i) {
        super.mo12390a(i);
        mo12944a("Failed to report reward for mediated ad: " + this.f2425a + " - error code: " + i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12391a(JSONObject jSONObject) {
        C1521i.m3477a(jSONObject, "ad_unit_id", this.f2425a.getAdUnitId(), this.f3279b);
        C1521i.m3477a(jSONObject, "placement", this.f2425a.mo12344P(), this.f3279b);
        String x = this.f2425a.mo12331x();
        if (!C1553o.m3554b(x)) {
            x = "NO_MCODE";
        }
        C1521i.m3477a(jSONObject, "mcode", x, this.f3279b);
        String w = this.f2425a.mo12330w();
        if (!C1553o.m3554b(w)) {
            w = "NO_BCODE";
        }
        C1521i.m3477a(jSONObject, "bcode", w, this.f3279b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1342c mo12392b() {
        return this.f2425a.mo12313A();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo12393b(JSONObject jSONObject) {
        mo12944a("Reported reward successfully for mediated ad: " + this.f2425a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12394c() {
        mo12949d("No reward result was found for mediated ad: " + this.f2425a);
    }
}
