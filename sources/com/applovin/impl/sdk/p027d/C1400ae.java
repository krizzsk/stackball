package com.applovin.impl.sdk.p027d;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p023a.C1342c;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.d.ae */
public class C1400ae extends C1401af {

    /* renamed from: a */
    private final C1355g f3290a;

    /* renamed from: c */
    private final AppLovinAdRewardListener f3291c;

    public C1400ae(C1355g gVar, AppLovinAdRewardListener appLovinAdRewardListener, C1469j jVar) {
        super("TaskValidateAppLovinReward", jVar);
        this.f3290a = gVar;
        this.f3291c = appLovinAdRewardListener;
    }

    /* renamed from: a */
    public String mo12389a() {
        return "2.0/vr";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12390a(int i) {
        String str;
        super.mo12390a(i);
        if (i < 400 || i >= 500) {
            this.f3291c.validationRequestFailed(this.f3290a, i);
            str = "network_timeout";
        } else {
            this.f3291c.userRewardRejected(this.f3290a, Collections.emptyMap());
            str = "rejected";
        }
        this.f3290a.mo12769a(C1342c.m2403a(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12395a(C1342c cVar) {
        this.f3290a.mo12769a(cVar);
        String b = cVar.mo12640b();
        Map<String, String> a = cVar.mo12639a();
        if (b.equals("accepted")) {
            this.f3291c.userRewardVerified(this.f3290a, a);
        } else if (b.equals("quota_exceeded")) {
            this.f3291c.userOverQuota(this.f3290a, a);
        } else if (b.equals("rejected")) {
            this.f3291c.userRewardRejected(this.f3290a, a);
        } else {
            this.f3291c.validationRequestFailed(this.f3290a, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12391a(JSONObject jSONObject) {
        C1521i.m3477a(jSONObject, "zone_id", this.f3290a.getAdZone().mo12712a(), this.f3279b);
        String clCode = this.f3290a.getClCode();
        if (!C1553o.m3554b(clCode)) {
            clCode = "NO_CLCODE";
        }
        C1521i.m3477a(jSONObject, "clcode", clCode, this.f3279b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo12396b() {
        return this.f3290a.mo12783aM();
    }
}
