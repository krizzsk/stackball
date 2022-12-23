package com.applovin.impl.sdk.p027d;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p024ad.C1346b;
import com.applovin.impl.sdk.p024ad.C1347c;
import com.applovin.impl.sdk.p024ad.C1349d;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.d.o */
public class C1427o extends C1424m {

    /* renamed from: a */
    private final C1347c f3331a;

    public C1427o(C1347c cVar, AppLovinAdLoadListener appLovinAdLoadListener, C1469j jVar) {
        super(C1349d.m2454a("adtoken_zone", jVar), appLovinAdLoadListener, "TaskFetchTokenAd", jVar);
        this.f3331a = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<String, String> mo12998a() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", C1553o.m3557e(this.f3331a.mo12704a()));
        hashMap.put("adtoken_prefix", C1553o.m3557e(this.f3331a.mo12706c()));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1346b mo12999b() {
        return C1346b.REGULAR_AD_TOKEN;
    }
}
