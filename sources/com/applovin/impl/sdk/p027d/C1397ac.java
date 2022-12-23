package com.applovin.impl.sdk.p027d;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.network.C1484a;
import com.applovin.impl.sdk.network.C1488b;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.utils.C1520h;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.d.ac */
public abstract class C1397ac extends C1392a {
    protected C1397ac(String str, C1469j jVar) {
        super(str, jVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo12389a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12390a(int i) {
        C1520h.m3441a(i, this.f3279b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo12391a(JSONObject jSONObject);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12958a(JSONObject jSONObject, final C1484a.C1487c<JSONObject> cVar) {
        C13981 r0 = new C1449y<JSONObject>(C1488b.m3193a(this.f3279b).mo13200a(C1520h.m3438a(mo12389a(), this.f3279b)).mo13210c(C1520h.m3448b(mo12389a(), this.f3279b)).mo13201a(C1520h.m3451e(this.f3279b)).mo13206b("POST").mo13202a(jSONObject).mo13199a(new JSONObject()).mo13198a(mo12953h()).mo13204a(), this.f3279b) {
            /* renamed from: a */
            public void mo12144a(int i) {
                cVar.mo12144a(i);
            }

            /* renamed from: a */
            public void mo12145a(JSONObject jSONObject, int i) {
                cVar.mo12145a(jSONObject, i);
            }
        };
        r0.mo13035a(C1369c.f2870aM);
        r0.mo13037b(C1369c.f2871aN);
        this.f3279b.mo13071K().mo13013a((C1392a) r0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract int mo12953h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public JSONObject mo12959i() {
        JSONObject jSONObject = new JSONObject();
        String i = this.f3279b.mo13125i();
        if (((Boolean) this.f3279b.mo13088a(C1369c.f3030dP)).booleanValue() && C1553o.m3554b(i)) {
            C1521i.m3477a(jSONObject, "cuid", i, this.f3279b);
        }
        if (((Boolean) this.f3279b.mo13088a(C1369c.f3032dR)).booleanValue()) {
            C1521i.m3477a(jSONObject, "compass_random_token", this.f3279b.mo13126j(), this.f3279b);
        }
        if (((Boolean) this.f3279b.mo13088a(C1369c.f3034dT)).booleanValue()) {
            C1521i.m3477a(jSONObject, "applovin_random_token", this.f3279b.mo13127k(), this.f3279b);
        }
        mo12391a(jSONObject);
        return jSONObject;
    }
}
