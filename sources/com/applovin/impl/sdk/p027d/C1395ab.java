package com.applovin.impl.sdk.p027d;

import com.applovin.impl.p008a.C1006c;
import com.applovin.impl.p008a.C1007d;
import com.applovin.impl.p008a.C1013i;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.network.C1488b;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.impl.sdk.utils.C1560t;
import com.applovin.sdk.AppLovinAdLoadListener;

/* renamed from: com.applovin.impl.sdk.d.ab */
class C1395ab extends C1392a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C1006c f3284a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AppLovinAdLoadListener f3285c;

    C1395ab(C1006c cVar, AppLovinAdLoadListener appLovinAdLoadListener, C1469j jVar) {
        super("TaskResolveVastWrapper", jVar);
        this.f3285c = appLovinAdLoadListener;
        this.f3284a = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2797a(int i) {
        mo12949d("Failed to resolve VAST wrapper due to error code " + i);
        if (i == -103) {
            C1557r.m3600a(this.f3285c, this.f3284a.mo11707g(), i, this.f3279b);
        } else {
            C1013i.m1367a(this.f3284a, this.f3285c, i == -102 ? C1007d.TIMED_OUT : C1007d.GENERAL_WRAPPER_ERROR, i, this.f3279b);
        }
    }

    public void run() {
        String a = C1013i.m1363a(this.f3284a);
        if (C1553o.m3554b(a)) {
            mo12944a("Resolving VAST ad with depth " + this.f3284a.mo11701a() + " at " + a);
            try {
                this.f3279b.mo13071K().mo13013a((C1392a) new C1449y<C1560t>(C1488b.m3193a(this.f3279b).mo13200a(a).mo13206b("GET").mo13199a(C1560t.f3799a).mo13198a(((Integer) this.f3279b.mo13088a(C1369c.f3079eM)).intValue()).mo13205b(((Integer) this.f3279b.mo13088a(C1369c.f3080eN)).intValue()).mo13203a(false).mo13204a(), this.f3279b) {
                    /* renamed from: a */
                    public void mo12144a(int i) {
                        mo12949d("Unable to resolve VAST wrapper. Server returned " + i);
                        C1395ab.this.m2797a(i);
                    }

                    /* renamed from: a */
                    public void mo12145a(C1560t tVar, int i) {
                        this.f3279b.mo13071K().mo13013a((C1392a) C1442u.m2968a(tVar, C1395ab.this.f3284a, C1395ab.this.f3285c, C1395ab.this.f3279b));
                    }
                });
            } catch (Throwable th) {
                mo12945a("Unable to resolve VAST wrapper", th);
            }
        } else {
            mo12949d("Resolving VAST failed. Could not find resolution URL");
            m2797a(-1);
        }
    }
}
