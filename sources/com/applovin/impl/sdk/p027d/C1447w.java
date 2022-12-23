package com.applovin.impl.sdk.p027d;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p024ad.C1349d;
import com.applovin.impl.sdk.p024ad.NativeAdImpl;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p026c.C1374a;
import com.applovin.impl.sdk.utils.C1517e;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.nativeAds.AppLovinNativeAdLoadListener;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.d.w */
class C1447w extends C1392a {

    /* renamed from: a */
    private final AppLovinNativeAdLoadListener f3407a;

    /* renamed from: c */
    private final JSONObject f3408c;

    C1447w(JSONObject jSONObject, C1469j jVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        super("TaskRenderNativeAd", jVar);
        this.f3407a = appLovinNativeAdLoadListener;
        this.f3408c = jSONObject;
    }

    /* renamed from: a */
    private String m2973a(String str, JSONObject jSONObject, String str2) {
        String b = C1521i.m3487b(jSONObject, str, (String) null, this.f3279b);
        if (b != null) {
            return b.replace("{CLCODE}", str2);
        }
        return null;
    }

    /* renamed from: a */
    private String m2974a(JSONObject jSONObject, String str, String str2) {
        String b = C1521i.m3487b(jSONObject, "click_url", (String) null, this.f3279b);
        if (str2 == null) {
            str2 = "";
        }
        return b.replace("{CLCODE}", str).replace("{EVENT_ID}", str2);
    }

    /* renamed from: a */
    private void m2975a(int i) {
        try {
            if (this.f3407a != null) {
                this.f3407a.onNativeAdsFailedToLoad(i);
            }
        } catch (Exception e) {
            mo12945a("Unable to notify listener about failure.", e);
        }
    }

    /* renamed from: a */
    private void m2976a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        JSONArray b = C1521i.m3491b(jSONObject2, "native_ads", new JSONArray(), this.f3279b);
        JSONObject b2 = C1521i.m3492b(jSONObject2, "native_settings", new JSONObject(), this.f3279b);
        if (b.length() > 0) {
            ArrayList arrayList = new ArrayList(b.length());
            int i = 0;
            while (i < b.length()) {
                JSONObject a = C1521i.m3474a(b, i, (JSONObject) null, this.f3279b);
                String b3 = C1521i.m3487b(a, "clcode", (String) null, this.f3279b);
                String b4 = C1521i.m3487b(a, "event_id", "", this.f3279b);
                String a2 = m2973a("simp_url", b2, b3);
                String a3 = m2974a(b2, b3, b4);
                List<C1374a> a4 = C1557r.m3593a("simp_urls", b2, b3, a2, this.f3279b);
                List<C1374a> a5 = C1557r.m3594a("click_tracking_urls", b2, b3, (Map<String, String>) C1517e.m3426a("{EVENT_ID}", b4), C1521i.m3463a(b2, "should_post_click_url", (Boolean) true, this.f3279b).booleanValue() ? a3 : null, this.f3279b);
                if (a4.size() == 0) {
                    throw new IllegalArgumentException("No impression URL available");
                } else if (a5.size() != 0) {
                    String b5 = C1521i.m3487b(a, "resource_cache_prefix", (String) null, this.f3279b);
                    JSONArray jSONArray = b;
                    int i2 = i;
                    NativeAdImpl a6 = new NativeAdImpl.C1344a().mo12674a(C1349d.m2466h(this.f3279b)).mo12684e(C1521i.m3487b(a, "title", (String) null, this.f3279b)).mo12685f(C1521i.m3487b(a, "description", (String) null, this.f3279b)).mo12686g(C1521i.m3487b(a, ShareConstants.FEED_CAPTION_PARAM, (String) null, this.f3279b)).mo12695p(C1521i.m3487b(a, SDKConstants.PARAM_GAME_REQUESTS_CTA, (String) null, this.f3279b)).mo12676a(C1521i.m3487b(a, CampaignEx.JSON_KEY_ICON_URL, (String) null, this.f3279b)).mo12679b(C1521i.m3487b(a, "image_url", (String) null, this.f3279b)).mo12683d(C1521i.m3487b(a, "video_url", (String) null, this.f3279b)).mo12681c(C1521i.m3487b(a, "star_rating_url", (String) null, this.f3279b)).mo12687h(C1521i.m3487b(a, CampaignEx.JSON_KEY_ICON_URL, (String) null, this.f3279b)).mo12688i(C1521i.m3487b(a, "image_url", (String) null, this.f3279b)).mo12689j(C1521i.m3487b(a, "video_url", (String) null, this.f3279b)).mo12672a(C1521i.m3460a(a, "star_rating", 5.0f, this.f3279b)).mo12694o(b3).mo12690k(a3).mo12691l(a2).mo12692m(m2973a("video_start_url", b2, b3)).mo12693n(m2973a("video_end_url", b2, b3)).mo12677a(a4).mo12680b(a5).mo12673a(C1521i.m3461a(a, "ad_id", 0, this.f3279b)).mo12682c(C1553o.m3554b(b5) ? C1517e.m3423a(b5) : this.f3279b.mo13114b((C1369c) C1369c.f2919bI)).mo12675a(this.f3279b).mo12678a();
                    arrayList.add(a6);
                    mo12944a("Prepared native ad: " + a6.getAdId());
                    i = i2 + 1;
                    b = jSONArray;
                } else {
                    throw new IllegalArgumentException("No click tracking URL available");
                }
            }
            AppLovinNativeAdLoadListener appLovinNativeAdLoadListener = this.f3407a;
            if (appLovinNativeAdLoadListener != null) {
                appLovinNativeAdLoadListener.onNativeAdsLoaded(arrayList);
                return;
            }
            return;
        }
        mo12947c("No ads were returned from the server");
        this.f3407a.onNativeAdsFailedToLoad(204);
    }

    public void run() {
        JSONObject jSONObject = this.f3408c;
        if (jSONObject == null || jSONObject.length() <= 0) {
            mo12949d("Attempting to run task with empty or null ad response");
            m2975a(204);
            return;
        }
        m2976a(this.f3408c);
    }
}
