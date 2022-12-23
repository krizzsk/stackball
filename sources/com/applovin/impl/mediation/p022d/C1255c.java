package com.applovin.impl.mediation.p022d;

import android.text.TextUtils;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.impl.sdk.p025b.C1368b;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.appsflyer.ServerParameters;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.d.c */
public class C1255c {

    /* renamed from: a */
    private static final List<String> f2431a;

    /* renamed from: b */
    private static C1257a f2432b;

    /* renamed from: com.applovin.impl.mediation.d.c$a */
    public static class C1257a {

        /* renamed from: a */
        private final JSONArray f2433a;

        /* renamed from: b */
        private final JSONArray f2434b;

        private C1257a(JSONArray jSONArray, JSONArray jSONArray2) {
            this.f2433a = jSONArray;
            this.f2434b = jSONArray2;
        }

        /* renamed from: a */
        public JSONArray mo12397a() {
            return this.f2433a;
        }

        /* renamed from: b */
        public JSONArray mo12398b() {
            return this.f2434b;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f2431a = arrayList;
        arrayList.add("com.applovin.mediation.adapters.AdColonyMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.AmazonMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.AmazonBiddingMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.AppLovinMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.ByteDanceMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.ChartboostMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.FacebookMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.GoogleMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.HyperMXMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.IMobileMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.InMobiMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.InneractiveMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.IronSourceMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.LeadboltMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.MadvertiseMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.MaioMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.MintegralMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.MoPubMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.MyTargetMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.NendMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.OguryMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.OguryPresageMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.SmaatoMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.TapjoyMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.TencentMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.UnityAdsMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.VerizonAdsMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.VoodooAdsMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.VungleMediationAdapter");
        f2431a.add("com.applovin.mediation.adapters.YandexMediationAdapter");
    }

    /* renamed from: a */
    public static C1257a m2219a(C1469j jVar) {
        C1257a aVar;
        if (!((Boolean) jVar.mo13088a(C1368b.f2821Q)).booleanValue() && (aVar = f2432b) != null) {
            return aVar;
        }
        if (f2432b != null) {
            m2224b(jVar);
            return f2432b;
        }
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        for (String next : f2431a) {
            MaxAdapter a = m2221a(next, jVar);
            if (a != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("class", next);
                    jSONObject.put(ServerParameters.SDK_DATA_SDK_VERSION, a.getSdkVersion());
                    jSONObject.put("version", a.getAdapterVersion());
                } catch (Throwable unused) {
                }
                jSONArray.put(jSONObject);
            } else {
                jSONArray2.put(next);
            }
        }
        C1257a aVar2 = new C1257a(jSONArray, jSONArray2);
        f2432b = aVar2;
        return aVar2;
    }

    /* renamed from: a */
    public static C1435s.C1437a m2220a(MaxAdFormat maxAdFormat) {
        return maxAdFormat == MaxAdFormat.INTERSTITIAL ? C1435s.C1437a.MEDIATION_INTERSTITIAL : maxAdFormat == MaxAdFormat.REWARDED ? C1435s.C1437a.MEDIATION_INCENTIVIZED : C1435s.C1437a.MEDIATION_BANNER;
    }

    /* renamed from: a */
    public static MaxAdapter m2221a(String str, C1469j jVar) {
        if (TextUtils.isEmpty(str)) {
            jVar.mo13139v().mo13281e("AppLovinSdk", "Failed to create adapter instance. No class name provided");
            return null;
        }
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return (MaxAdapter) cls.getConstructor(new Class[]{AppLovinSdk.class}).newInstance(new Object[]{jVar.mo13078R()});
            }
            C1505q v = jVar.mo13139v();
            v.mo13281e("AppLovinSdk", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            C1505q v2 = jVar.mo13139v();
            v2.mo13278b("AppLovinSdk", "Failed to load: " + str, th);
        }
    }

    /* renamed from: a */
    public static boolean m2222a(Object obj) {
        return (obj instanceof C1355g) && C1553o.m3554b(((C1355g) obj).mo12756P());
    }

    /* renamed from: b */
    public static String m2223b(MaxAdFormat maxAdFormat) {
        return maxAdFormat.getLabel();
    }

    /* renamed from: b */
    private static void m2224b(C1469j jVar) {
        MaxAdapter a;
        JSONArray a2 = f2432b.mo12397a();
        for (int i = 0; i < a2.length(); i++) {
            JSONObject a3 = C1521i.m3474a(a2, i, (JSONObject) null, jVar);
            String b = C1521i.m3487b(a3, "class", "", jVar);
            if (!C1553o.m3554b(C1521i.m3487b(a3, ServerParameters.SDK_DATA_SDK_VERSION, "", jVar)) && (a = m2221a(b, jVar)) != null) {
                C1521i.m3477a(a3, ServerParameters.SDK_DATA_SDK_VERSION, a.getSdkVersion(), jVar);
            }
        }
    }
}
