package com.chartboost.sdk.Model;

import com.chartboost.sdk.Libraries.C1821b;
import com.chartboost.sdk.Privacy.model.CCPA;
import com.chartboost.sdk.impl.C2014x;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.Model.h */
public class C1844h {

    /* renamed from: A */
    private String f4518A;

    /* renamed from: B */
    private C1847i f4519B;

    /* renamed from: a */
    public final String f4520a;

    /* renamed from: b */
    public final boolean f4521b;

    /* renamed from: c */
    public final boolean f4522c;

    /* renamed from: d */
    public final List<String> f4523d;

    /* renamed from: e */
    public final boolean f4524e;

    /* renamed from: f */
    public final boolean f4525f;

    /* renamed from: g */
    public final boolean f4526g;

    /* renamed from: h */
    public final boolean f4527h;

    /* renamed from: i */
    public final int f4528i;

    /* renamed from: j */
    public final boolean f4529j;

    /* renamed from: k */
    public final long f4530k;

    /* renamed from: l */
    public final int f4531l;

    /* renamed from: m */
    public final int f4532m;

    /* renamed from: n */
    public final int f4533n;

    /* renamed from: o */
    public final int f4534o;

    /* renamed from: p */
    public final List<String> f4535p;

    /* renamed from: q */
    public final boolean f4536q;

    /* renamed from: r */
    public final boolean f4537r;

    /* renamed from: s */
    public final boolean f4538s;

    /* renamed from: t */
    public final boolean f4539t;

    /* renamed from: u */
    public final int f4540u;

    /* renamed from: v */
    public final boolean f4541v;

    /* renamed from: w */
    public final String f4542w;

    /* renamed from: x */
    public final String f4543x;

    /* renamed from: y */
    private final C1845a f4544y;

    /* renamed from: z */
    public C1846b f4545z;

    public C1844h(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        this.f4520a = jSONObject2.optString("configVariant");
        this.f4521b = jSONObject2.optBoolean("prefetchDisable");
        this.f4522c = jSONObject2.optBoolean("publisherDisable");
        this.f4544y = C1845a.m4156a(jSONObject);
        try {
            this.f4545z = C1846b.m4160a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.f4518A = jSONObject2.optString("publisherWarning", (String) null);
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject2.optJSONArray("invalidateFolderList");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = optJSONArray.optString(i);
                if (!optString.isEmpty()) {
                    arrayList.add(optString);
                }
            }
        }
        this.f4523d = Collections.unmodifiableList(arrayList);
        JSONObject optJSONObject = jSONObject2.optJSONObject("native");
        optJSONObject = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.f4524e = optJSONObject.optBoolean(TJAdUnitConstants.String.ENABLED, true);
        this.f4525f = optJSONObject.optBoolean("inplayEnabled", true);
        this.f4526g = optJSONObject.optBoolean("interstitialEnabled", true);
        this.f4527h = optJSONObject.optBoolean("lockOrientation");
        this.f4528i = optJSONObject.optInt("prefetchSession", 3);
        this.f4529j = optJSONObject.optBoolean("rewardVideoEnabled", true);
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("trackingLevels");
        optJSONObject2 = optJSONObject2 == null ? new JSONObject() : optJSONObject2;
        optJSONObject2.optBoolean("critical", true);
        optJSONObject2.optBoolean("includeStackTrace", true);
        optJSONObject2.optBoolean("error");
        optJSONObject2.optBoolean("debug");
        optJSONObject2.optBoolean("session");
        optJSONObject2.optBoolean("system");
        optJSONObject2.optBoolean("timing");
        optJSONObject2.optBoolean("user");
        this.f4519B = C1847i.m4164a(jSONObject);
        this.f4530k = jSONObject2.optLong("getAdRetryBaseMs", 200);
        this.f4531l = jSONObject2.optInt("getAdRetryMaxBackoffExponent", 3);
        JSONObject optJSONObject3 = jSONObject2.optJSONObject("webview");
        optJSONObject3 = optJSONObject3 == null ? new JSONObject() : optJSONObject3;
        this.f4532m = optJSONObject3.optInt("cacheMaxBytes", 104857600);
        int i2 = 10;
        int optInt = optJSONObject3.optInt("cacheMaxUnits", 10);
        this.f4533n = optInt > 0 ? optInt : i2;
        this.f4534o = (int) TimeUnit.SECONDS.toDays((long) optJSONObject3.optInt("cacheTTLs", C1821b.f4379a));
        ArrayList arrayList2 = new ArrayList();
        JSONArray optJSONArray2 = optJSONObject3.optJSONArray("directories");
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i3 = 0; i3 < length2; i3++) {
                String optString2 = optJSONArray2.optString(i3);
                if (!optString2.isEmpty()) {
                    arrayList2.add(optString2);
                }
            }
        }
        this.f4535p = Collections.unmodifiableList(arrayList2);
        this.f4536q = optJSONObject3.optBoolean(TJAdUnitConstants.String.ENABLED, m4151e());
        this.f4537r = optJSONObject3.optBoolean("inplayEnabled", true);
        this.f4538s = optJSONObject3.optBoolean("interstitialEnabled", true);
        optJSONObject3.optInt("invalidatePendingImpression", 3);
        this.f4539t = optJSONObject3.optBoolean("lockOrientation", true);
        this.f4540u = optJSONObject3.optInt("prefetchSession", 3);
        this.f4541v = optJSONObject3.optBoolean("rewardVideoEnabled", true);
        String optString3 = optJSONObject3.optString("version", "v2");
        this.f4542w = optString3;
        String.format("%s/%s%s", new Object[]{"webview", optString3, "/interstitial/get"});
        this.f4543x = String.format("%s/%s/%s", new Object[]{"webview", this.f4542w, "prefetch"});
        String.format("%s/%s%s", new Object[]{"webview", this.f4542w, "/reward/get"});
    }

    /* renamed from: e */
    private static boolean m4151e() {
        int[] iArr = {4, 4, 2};
        String a = C2014x.m4911b().mo14882a();
        if (a != null && a.length() > 0) {
            String[] split = a.replaceAll("[^\\d.]", "").split("\\.");
            int i = 0;
            while (i < split.length && i < 3) {
                try {
                    if (Integer.valueOf(split[i]).intValue() > iArr[i]) {
                        return true;
                    }
                    if (Integer.valueOf(split[i]).intValue() < iArr[i]) {
                        return false;
                    }
                    i++;
                } catch (NumberFormatException unused) {
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public C1845a mo14317a() {
        return this.f4544y;
    }

    /* renamed from: b */
    public boolean mo14318b() {
        return this.f4522c;
    }

    /* renamed from: c */
    public String mo14319c() {
        return this.f4518A;
    }

    /* renamed from: d */
    public C1847i mo14320d() {
        return this.f4519B;
    }

    /* renamed from: com.chartboost.sdk.Model.h$a */
    public static class C1845a {

        /* renamed from: a */
        private double f4546a;

        /* renamed from: b */
        private double f4547b;

        /* renamed from: c */
        private boolean f4548c;

        /* renamed from: a */
        public static C1845a m4156a(JSONObject jSONObject) {
            C1845a aVar = new C1845a();
            aVar.f4548c = jSONObject.optBoolean("bannerEnable", true);
            aVar.f4546a = jSONObject.optDouble("bannerRefreshInterval", 30.0d);
            aVar.f4547b = jSONObject.optDouble("bannerShowTimeout", 30.0d);
            return aVar;
        }

        /* renamed from: b */
        public double mo14322b() {
            return this.f4547b;
        }

        /* renamed from: c */
        public boolean mo14323c() {
            return this.f4548c;
        }

        /* renamed from: a */
        public double mo14321a() {
            return this.f4546a;
        }
    }

    /* renamed from: com.chartboost.sdk.Model.h$b */
    public static class C1846b {

        /* renamed from: a */
        private HashSet<String> f4549a;

        /* renamed from: a */
        public static C1846b m4160a(JSONObject jSONObject) throws JSONException {
            C1846b bVar = new C1846b();
            HashSet<String> hashSet = new HashSet<>();
            hashSet.add(CCPA.CCPA_STANDARD);
            JSONArray optJSONArray = jSONObject.optJSONArray("privacyStandards");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                m4162a(optJSONArray, hashSet, length);
                m4161a(hashSet, length);
            }
            bVar.f4549a = hashSet;
            return bVar;
        }

        /* renamed from: a */
        private static void m4162a(JSONArray jSONArray, HashSet<String> hashSet, int i) throws JSONException {
            for (int i2 = 0; i2 < i; i2++) {
                hashSet.add(jSONArray.getString(i2));
            }
        }

        /* renamed from: a */
        private static void m4161a(HashSet<String> hashSet, int i) {
            if (i == 0) {
                hashSet.clear();
            }
        }

        /* renamed from: a */
        public HashSet<String> mo14324a() {
            return this.f4549a;
        }
    }
}
