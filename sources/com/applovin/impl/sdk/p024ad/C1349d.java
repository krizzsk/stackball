package com.applovin.impl.sdk.p024ad;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.d */
public final class C1349d {

    /* renamed from: a */
    private static final Map<String, C1349d> f2723a = new HashMap();

    /* renamed from: b */
    private static final Object f2724b = new Object();

    /* renamed from: c */
    private C1469j f2725c;

    /* renamed from: d */
    private C1505q f2726d;

    /* renamed from: e */
    private JSONObject f2727e;

    /* renamed from: f */
    private final String f2728f;

    /* renamed from: g */
    private String f2729g;

    /* renamed from: h */
    private AppLovinAdSize f2730h;

    /* renamed from: i */
    private AppLovinAdType f2731i;

    private C1349d(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, C1469j jVar) {
        if (!TextUtils.isEmpty(str) || !(appLovinAdType == null || appLovinAdSize == null)) {
            this.f2725c = jVar;
            this.f2726d = jVar != null ? jVar.mo13139v() : null;
            this.f2730h = appLovinAdSize;
            this.f2731i = appLovinAdType;
            if (!TextUtils.isEmpty(str)) {
                this.f2728f = str.toLowerCase(Locale.ENGLISH);
                this.f2729g = str.toLowerCase(Locale.ENGLISH);
                return;
            }
            this.f2728f = (appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel()).toLowerCase(Locale.ENGLISH);
            return;
        }
        throw new IllegalArgumentException("No zone identifier or type or size specified");
    }

    /* renamed from: a */
    public static C1349d m2452a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, C1469j jVar) {
        return m2453a(appLovinAdSize, appLovinAdType, (String) null, jVar);
    }

    /* renamed from: a */
    public static C1349d m2453a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str, C1469j jVar) {
        C1349d dVar = new C1349d(appLovinAdSize, appLovinAdType, str, jVar);
        synchronized (f2724b) {
            String str2 = dVar.f2728f;
            if (f2723a.containsKey(str2)) {
                dVar = f2723a.get(str2);
            } else {
                f2723a.put(str2, dVar);
            }
        }
        return dVar;
    }

    /* renamed from: a */
    public static C1349d m2454a(String str, C1469j jVar) {
        return m2453a((AppLovinAdSize) null, (AppLovinAdType) null, str, jVar);
    }

    /* renamed from: a */
    public static C1349d m2455a(String str, JSONObject jSONObject, C1469j jVar) {
        C1349d a = m2454a(str, jVar);
        a.f2727e = jSONObject;
        return a;
    }

    /* renamed from: a */
    private <ST> C1369c<ST> m2456a(String str, C1369c<ST> cVar) {
        return this.f2725c.mo13087a(str + this.f2728f, cVar);
    }

    /* renamed from: a */
    public static void m2457a(JSONObject jSONObject, C1469j jVar) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f2724b) {
                C1349d dVar = f2723a.get(C1521i.m3487b(jSONObject, "zone_id", "", jVar));
                if (dVar != null) {
                    dVar.f2730h = AppLovinAdSize.fromString(C1521i.m3487b(jSONObject, "ad_size", "", jVar));
                    dVar.f2731i = AppLovinAdType.fromString(C1521i.m3487b(jSONObject, "ad_type", "", jVar));
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.applovin.impl.sdk.b.c<java.lang.String>, com.applovin.impl.sdk.b.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2458a(com.applovin.impl.sdk.p025b.C1369c<java.lang.String> r2, com.applovin.sdk.AppLovinAdSize r3) {
        /*
            r1 = this;
            com.applovin.impl.sdk.j r0 = r1.f2725c
            java.lang.Object r2 = r0.mo13088a(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toUpperCase(r0)
            java.lang.String r3 = r3.getLabel()
            boolean r2 = r2.contains(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p024ad.C1349d.m2458a(com.applovin.impl.sdk.b.c, com.applovin.sdk.AppLovinAdSize):boolean");
    }

    /* renamed from: b */
    public static C1349d m2459b(String str, C1469j jVar) {
        return m2453a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str, jVar);
    }

    /* renamed from: b */
    public static Collection<C1349d> m2460b(C1469j jVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(8);
        Collections.addAll(linkedHashSet, new C1349d[]{m2461c(jVar), m2462d(jVar), m2463e(jVar), m2464f(jVar), m2465g(jVar), m2466h(jVar)});
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* renamed from: c */
    public static C1349d m2461c(C1469j jVar) {
        return m2452a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR, jVar);
    }

    /* renamed from: d */
    public static C1349d m2462d(C1469j jVar) {
        return m2452a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR, jVar);
    }

    /* renamed from: e */
    public static C1349d m2463e(C1469j jVar) {
        return m2452a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR, jVar);
    }

    /* renamed from: f */
    public static C1349d m2464f(C1469j jVar) {
        return m2452a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR, jVar);
    }

    /* renamed from: g */
    public static C1349d m2465g(C1469j jVar) {
        return m2452a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, jVar);
    }

    /* renamed from: h */
    public static C1349d m2466h(C1469j jVar) {
        return m2452a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE, jVar);
    }

    /* renamed from: k */
    private boolean m2467k() {
        if (C1553o.m3554b(this.f2729g)) {
            return true;
        }
        return AppLovinAdType.INCENTIVIZED.equals(mo12716d()) ? ((Boolean) this.f2725c.mo13088a(C1369c.f2940bd)).booleanValue() : m2458a(C1369c.f2939bc, mo12715c());
    }

    /* renamed from: a */
    public String mo12712a() {
        return this.f2728f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12713a(C1469j jVar) {
        this.f2725c = jVar;
        this.f2726d = jVar.mo13139v();
    }

    /* renamed from: b */
    public MaxAdFormat mo12714b() {
        AppLovinAdSize c = mo12715c();
        if (c == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (c == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (c == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (c == AppLovinAdSize.NATIVE) {
            return MaxAdFormat.NATIVE;
        }
        if (c != AppLovinAdSize.INTERSTITIAL) {
            return null;
        }
        if (mo12716d() == AppLovinAdType.REGULAR) {
            return MaxAdFormat.INTERSTITIAL;
        }
        if (mo12716d() == AppLovinAdType.INCENTIVIZED) {
            return MaxAdFormat.REWARDED;
        }
        return null;
    }

    /* renamed from: c */
    public AppLovinAdSize mo12715c() {
        if (this.f2730h == null && C1521i.m3484a(this.f2727e, "ad_size")) {
            this.f2730h = AppLovinAdSize.fromString(C1521i.m3487b(this.f2727e, "ad_size", (String) null, this.f2725c));
        }
        return this.f2730h;
    }

    /* renamed from: d */
    public AppLovinAdType mo12716d() {
        if (this.f2731i == null && C1521i.m3484a(this.f2727e, "ad_type")) {
            this.f2731i = AppLovinAdType.fromString(C1521i.m3487b(this.f2727e, "ad_type", (String) null, this.f2725c));
        }
        return this.f2731i;
    }

    /* renamed from: e */
    public boolean mo12717e() {
        return AppLovinAdSize.NATIVE.equals(mo12715c()) && AppLovinAdType.NATIVE.equals(mo12716d());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f2728f.equalsIgnoreCase(((C1349d) obj).f2728f);
    }

    /* renamed from: f */
    public int mo12719f() {
        if (C1521i.m3484a(this.f2727e, "capacity")) {
            return C1521i.m3485b(this.f2727e, "capacity", 0, this.f2725c);
        }
        if (!TextUtils.isEmpty(this.f2729g)) {
            return mo12717e() ? ((Integer) this.f2725c.mo13088a(C1369c.f2955bs)).intValue() : ((Integer) this.f2725c.mo13088a(C1369c.f2954br)).intValue();
        }
        return ((Integer) this.f2725c.mo13088a(m2456a("preload_capacity_", C1369c.f2943bg))).intValue();
    }

    /* renamed from: g */
    public int mo12720g() {
        if (C1521i.m3484a(this.f2727e, "extended_capacity")) {
            return C1521i.m3485b(this.f2727e, "extended_capacity", 0, this.f2725c);
        }
        if (TextUtils.isEmpty(this.f2729g)) {
            return ((Integer) this.f2725c.mo13088a(m2456a("extended_preload_capacity_", C1369c.f2949bm))).intValue();
        } else if (mo12717e()) {
            return 0;
        } else {
            return ((Integer) this.f2725c.mo13088a(C1369c.f2956bt)).intValue();
        }
    }

    /* renamed from: h */
    public int mo12721h() {
        return C1521i.m3485b(this.f2727e, "preload_count", 0, this.f2725c);
    }

    public int hashCode() {
        return this.f2728f.hashCode();
    }

    /* renamed from: i */
    public boolean mo12723i() {
        if (!((Boolean) this.f2725c.mo13088a(C1369c.f2938bb)).booleanValue() || !m2467k()) {
            return false;
        }
        if (TextUtils.isEmpty(this.f2729g)) {
            C1369c a = m2456a("preload_merge_init_tasks_", (C1369c) null);
            return a != null && ((Boolean) this.f2725c.mo13088a(a)).booleanValue() && mo12719f() > 0;
        } else if (this.f2727e != null && mo12721h() == 0) {
            return false;
        } else {
            String upperCase = ((String) this.f2725c.mo13088a(C1369c.f2939bc)).toUpperCase(Locale.ENGLISH);
            return (upperCase.contains(AppLovinAdSize.INTERSTITIAL.getLabel()) || upperCase.contains(AppLovinAdSize.BANNER.getLabel()) || upperCase.contains(AppLovinAdSize.MREC.getLabel()) || upperCase.contains(AppLovinAdSize.LEADER.getLabel())) ? ((Boolean) this.f2725c.mo13088a(C1369c.f2911bA)).booleanValue() : this.f2725c.mo13082V().mo12731a(this) && mo12721h() > 0 && ((Boolean) this.f2725c.mo13088a(C1369c.f3020dF)).booleanValue();
        }
    }

    /* renamed from: j */
    public boolean mo12724j() {
        return m2460b(this.f2725c).contains(this);
    }

    public String toString() {
        return "AdZone{id=" + this.f2728f + ", zoneObject=" + this.f2727e + '}';
    }
}
