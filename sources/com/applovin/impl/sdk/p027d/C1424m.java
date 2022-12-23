package com.applovin.impl.sdk.p027d;

import com.applovin.impl.adview.C1072c;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1483n;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.network.C1488b;
import com.applovin.impl.sdk.p024ad.C1346b;
import com.applovin.impl.sdk.p024ad.C1349d;
import com.applovin.impl.sdk.p024ad.C1351f;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p026c.C1387g;
import com.applovin.impl.sdk.p026c.C1388h;
import com.applovin.impl.sdk.utils.C1520h;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.d.m */
public class C1424m extends C1392a {

    /* renamed from: a */
    private final C1349d f3326a;

    /* renamed from: c */
    private final AppLovinAdLoadListener f3327c;

    /* renamed from: d */
    private boolean f3328d;

    public C1424m(C1349d dVar, AppLovinAdLoadListener appLovinAdLoadListener, C1469j jVar) {
        this(dVar, appLovinAdLoadListener, "TaskFetchNextAd", jVar);
    }

    C1424m(C1349d dVar, AppLovinAdLoadListener appLovinAdLoadListener, String str, C1469j jVar) {
        super(str, jVar);
        this.f3328d = false;
        this.f3326a = dVar;
        this.f3327c = appLovinAdLoadListener;
    }

    /* renamed from: a */
    private void m2902a(C1388h hVar) {
        long b = hVar.mo12929b(C1387g.f3250c);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b > TimeUnit.MINUTES.toMillis((long) ((Integer) this.f3279b.mo13088a(C1369c.f3022dH)).intValue())) {
            hVar.mo12931b(C1387g.f3250c, currentTimeMillis);
            hVar.mo12933c(C1387g.f3251d);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m2905b(int i) {
        boolean z = i != 204;
        C1505q v = mo12948d().mo13139v();
        String e = mo12950e();
        Boolean valueOf = Boolean.valueOf(z);
        v.mo13273a(e, valueOf, "Unable to fetch " + this.f3326a + " ad: server returned " + i);
        if (i == -800) {
            this.f3279b.mo13072L().mo12926a(C1387g.f3255h);
        }
        this.f3279b.mo13082V().mo12728a(this.f3326a, m2907i(), i);
        try {
            mo13001a(i);
        } catch (Throwable th) {
            C1505q.m3341c(mo12950e(), "Unable process a failure to receive an ad", th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m2906b(JSONObject jSONObject) {
        C1520h.m3450d(jSONObject, this.f3279b);
        C1520h.m3449c(jSONObject, this.f3279b);
        C1520h.m3454f(jSONObject, this.f3279b);
        C1349d.m2457a(jSONObject, this.f3279b);
        this.f3279b.mo13071K().mo13013a(mo13000a(jSONObject));
    }

    /* renamed from: i */
    private boolean m2907i() {
        return (this instanceof C1427o) || (this instanceof C1423l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1392a mo13000a(JSONObject jSONObject) {
        C1351f.C1353a aVar = new C1351f.C1353a(this.f3326a, this.f3327c, this.f3279b);
        aVar.mo12738a(m2907i());
        return new C1441t(jSONObject, this.f3326a, mo12999b(), aVar, this.f3279b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<String, String> mo12998a() {
        HashMap hashMap = new HashMap(4);
        hashMap.put("zone_id", C1553o.m3557e(this.f3326a.mo12712a()));
        if (this.f3326a.mo12715c() != null) {
            hashMap.put("size", this.f3326a.mo12715c().getLabel());
        }
        if (this.f3326a.mo12716d() != null) {
            hashMap.put("require", this.f3326a.mo12716d().getLabel());
        }
        if (((Boolean) this.f3279b.mo13088a(C1369c.f2886ac)).booleanValue()) {
            hashMap.put("n", String.valueOf(this.f3279b.mo13104aa().mo13294a(this.f3326a.mo12712a())));
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13001a(int i) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f3327c;
        if (appLovinAdLoadListener == null) {
            return;
        }
        if (appLovinAdLoadListener instanceof C1483n) {
            ((C1483n) appLovinAdLoadListener).mo12865a(this.f3326a, i);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(i);
        }
    }

    /* renamed from: a */
    public void mo13002a(boolean z) {
        this.f3328d = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1346b mo12999b() {
        return this.f3326a.mo12724j() ? C1346b.APPLOVIN_PRIMARY_ZONE : C1346b.APPLOVIN_CUSTOM_ZONE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo13003c() {
        return C1520h.m3455g(this.f3279b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo13004h() {
        return C1520h.m3457h(this.f3279b);
    }

    public void run() {
        String str;
        StringBuilder sb;
        if (this.f3328d) {
            sb = new StringBuilder();
            str = "Preloading next ad of zone: ";
        } else {
            sb = new StringBuilder();
            str = "Fetching next ad of zone: ";
        }
        sb.append(str);
        sb.append(this.f3326a);
        mo12944a(sb.toString());
        if (((Boolean) this.f3279b.mo13088a(C1369c.f3095ec)).booleanValue() && C1557r.m3628d()) {
            mo12944a("User is connected to a VPN");
        }
        C1388h L = this.f3279b.mo13072L();
        L.mo12926a(C1387g.f3248a);
        if (L.mo12929b(C1387g.f3250c) == 0) {
            L.mo12931b(C1387g.f3250c, System.currentTimeMillis());
        }
        try {
            Map<String, String> a = this.f3279b.mo13074N().mo13149a(mo12998a(), this.f3328d, false);
            Map<String, String> map = null;
            if (((Boolean) this.f3279b.mo13088a(C1369c.f3106en)).booleanValue()) {
                map = C1072c.m1576b(((Long) this.f3279b.mo13088a(C1369c.f3107eo)).longValue());
            }
            m2902a(L);
            C14251 r2 = new C1449y<JSONObject>(C1488b.m3193a(this.f3279b).mo13200a(mo13003c()).mo13201a(a).mo13210c(mo13004h()).mo13206b("GET").mo13207b(map).mo13199a(new JSONObject()).mo13198a(((Integer) this.f3279b.mo13088a(C1369c.f3063dw)).intValue()).mo13205b(((Integer) this.f3279b.mo13088a(C1369c.f3062dv)).intValue()).mo13208b(true).mo13204a(), this.f3279b) {
                /* renamed from: a */
                public void mo12144a(int i) {
                    C1424m.this.m2905b(i);
                }

                /* renamed from: a */
                public void mo12145a(JSONObject jSONObject, int i) {
                    if (i == 200) {
                        C1521i.m3493b(jSONObject, "ad_fetch_latency_millis", this.f3413d.mo13171a(), this.f3279b);
                        C1521i.m3493b(jSONObject, "ad_fetch_response_size", this.f3413d.mo13172b(), this.f3279b);
                        C1424m.this.m2906b(jSONObject);
                        return;
                    }
                    C1424m.this.m2905b(i);
                }
            };
            r2.mo13035a(C1369c.f2868aK);
            r2.mo13037b(C1369c.f2869aL);
            this.f3279b.mo13071K().mo13013a((C1392a) r2);
        } catch (Throwable th) {
            mo12945a("Unable to fetch ad " + this.f3326a, th);
            m2905b(0);
        }
    }
}
