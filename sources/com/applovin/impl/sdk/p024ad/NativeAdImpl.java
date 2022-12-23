package com.applovin.impl.sdk.p024ad;

import android.content.Context;
import android.net.Uri;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.network.C1496f;
import com.applovin.impl.sdk.p026c.C1374a;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.nativeAds.AppLovinNativeAd;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.ad.NativeAdImpl */
public class NativeAdImpl implements C1363j, AppLovinNativeAd {
    public static final String QUERY_PARAM_IS_FIRST_PLAY = "fp";
    public static final String QUERY_PARAM_VIDEO_PERCENT_VIEWED = "pv";

    /* renamed from: a */
    private final C1469j f2659a;

    /* renamed from: b */
    private final C1349d f2660b;

    /* renamed from: c */
    private final String f2661c;

    /* renamed from: d */
    private final String f2662d;

    /* renamed from: e */
    private final String f2663e;

    /* renamed from: f */
    private final String f2664f;

    /* renamed from: g */
    private final String f2665g;

    /* renamed from: h */
    private final String f2666h;

    /* renamed from: i */
    private final String f2667i;

    /* renamed from: j */
    private final String f2668j;

    /* renamed from: k */
    private final String f2669k;

    /* renamed from: l */
    private final String f2670l;

    /* renamed from: m */
    private final String f2671m;

    /* renamed from: n */
    private final String f2672n;

    /* renamed from: o */
    private final List<C1374a> f2673o;

    /* renamed from: p */
    private final List<C1374a> f2674p;

    /* renamed from: q */
    private final String f2675q;

    /* renamed from: r */
    private final long f2676r;

    /* renamed from: s */
    private final List<String> f2677s;

    /* renamed from: t */
    private String f2678t;

    /* renamed from: u */
    private String f2679u;

    /* renamed from: v */
    private float f2680v;

    /* renamed from: w */
    private String f2681w;

    /* renamed from: x */
    private AtomicBoolean f2682x;

    /* renamed from: com.applovin.impl.sdk.ad.NativeAdImpl$a */
    public static class C1344a {

        /* renamed from: a */
        private C1349d f2683a;

        /* renamed from: b */
        private String f2684b;

        /* renamed from: c */
        private String f2685c;

        /* renamed from: d */
        private String f2686d;

        /* renamed from: e */
        private String f2687e;

        /* renamed from: f */
        private String f2688f;

        /* renamed from: g */
        private String f2689g;

        /* renamed from: h */
        private String f2690h;

        /* renamed from: i */
        private String f2691i;

        /* renamed from: j */
        private String f2692j;

        /* renamed from: k */
        private float f2693k;

        /* renamed from: l */
        private String f2694l;

        /* renamed from: m */
        private String f2695m;

        /* renamed from: n */
        private String f2696n;

        /* renamed from: o */
        private String f2697o;

        /* renamed from: p */
        private String f2698p;

        /* renamed from: q */
        private List<C1374a> f2699q;

        /* renamed from: r */
        private List<C1374a> f2700r;

        /* renamed from: s */
        private String f2701s;

        /* renamed from: t */
        private String f2702t;

        /* renamed from: u */
        private long f2703u;

        /* renamed from: v */
        private List<String> f2704v;

        /* renamed from: w */
        private C1469j f2705w;

        /* renamed from: a */
        public C1344a mo12672a(float f) {
            this.f2693k = f;
            return this;
        }

        /* renamed from: a */
        public C1344a mo12673a(long j) {
            this.f2703u = j;
            return this;
        }

        /* renamed from: a */
        public C1344a mo12674a(C1349d dVar) {
            this.f2683a = dVar;
            return this;
        }

        /* renamed from: a */
        public C1344a mo12675a(C1469j jVar) {
            this.f2705w = jVar;
            return this;
        }

        /* renamed from: a */
        public C1344a mo12676a(String str) {
            this.f2684b = str;
            return this;
        }

        /* renamed from: a */
        public C1344a mo12677a(List<C1374a> list) {
            this.f2699q = list;
            return this;
        }

        /* renamed from: a */
        public NativeAdImpl mo12678a() {
            return new NativeAdImpl(this.f2683a, this.f2684b, this.f2685c, this.f2686d, this.f2687e, this.f2688f, this.f2689g, this.f2690h, this.f2691i, this.f2692j, this.f2693k, this.f2694l, this.f2695m, this.f2696n, this.f2697o, this.f2698p, this.f2699q, this.f2700r, this.f2701s, this.f2702t, this.f2703u, this.f2704v, this.f2705w);
        }

        /* renamed from: b */
        public C1344a mo12679b(String str) {
            this.f2685c = str;
            return this;
        }

        /* renamed from: b */
        public C1344a mo12680b(List<C1374a> list) {
            this.f2700r = list;
            return this;
        }

        /* renamed from: c */
        public C1344a mo12681c(String str) {
            this.f2686d = str;
            return this;
        }

        /* renamed from: c */
        public C1344a mo12682c(List<String> list) {
            this.f2704v = list;
            return this;
        }

        /* renamed from: d */
        public C1344a mo12683d(String str) {
            this.f2687e = str;
            return this;
        }

        /* renamed from: e */
        public C1344a mo12684e(String str) {
            this.f2688f = str;
            return this;
        }

        /* renamed from: f */
        public C1344a mo12685f(String str) {
            this.f2689g = str;
            return this;
        }

        /* renamed from: g */
        public C1344a mo12686g(String str) {
            this.f2690h = str;
            return this;
        }

        /* renamed from: h */
        public C1344a mo12687h(String str) {
            this.f2691i = str;
            return this;
        }

        /* renamed from: i */
        public C1344a mo12688i(String str) {
            this.f2692j = str;
            return this;
        }

        /* renamed from: j */
        public C1344a mo12689j(String str) {
            this.f2694l = str;
            return this;
        }

        /* renamed from: k */
        public C1344a mo12690k(String str) {
            this.f2695m = str;
            return this;
        }

        /* renamed from: l */
        public C1344a mo12691l(String str) {
            this.f2696n = str;
            return this;
        }

        /* renamed from: m */
        public C1344a mo12692m(String str) {
            this.f2697o = str;
            return this;
        }

        /* renamed from: n */
        public C1344a mo12693n(String str) {
            this.f2698p = str;
            return this;
        }

        /* renamed from: o */
        public C1344a mo12694o(String str) {
            this.f2701s = str;
            return this;
        }

        /* renamed from: p */
        public C1344a mo12695p(String str) {
            this.f2702t = str;
            return this;
        }
    }

    private NativeAdImpl(C1349d dVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, float f, String str10, String str11, String str12, String str13, String str14, List<C1374a> list, List<C1374a> list2, String str15, String str16, long j, List<String> list3, C1469j jVar) {
        this.f2682x = new AtomicBoolean();
        this.f2660b = dVar;
        this.f2661c = str;
        this.f2662d = str2;
        this.f2663e = str3;
        this.f2664f = str4;
        this.f2665g = str5;
        this.f2666h = str6;
        this.f2667i = str7;
        this.f2678t = str8;
        this.f2679u = str9;
        this.f2680v = f;
        this.f2681w = str10;
        this.f2669k = str11;
        this.f2670l = str12;
        this.f2671m = str13;
        this.f2672n = str14;
        this.f2673o = list;
        this.f2674p = list2;
        this.f2675q = str15;
        this.f2668j = str16;
        this.f2676r = j;
        this.f2677s = list3;
        this.f2659a = jVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NativeAdImpl nativeAdImpl = (NativeAdImpl) obj;
        C1349d dVar = this.f2660b;
        if (dVar == null ? nativeAdImpl.f2660b != null : !dVar.equals(nativeAdImpl.f2660b)) {
            return false;
        }
        String str = this.f2667i;
        if (str == null ? nativeAdImpl.f2667i != null : !str.equals(nativeAdImpl.f2667i)) {
            return false;
        }
        String str2 = this.f2675q;
        if (str2 == null ? nativeAdImpl.f2675q != null : !str2.equals(nativeAdImpl.f2675q)) {
            return false;
        }
        String str3 = this.f2669k;
        if (str3 == null ? nativeAdImpl.f2669k != null : !str3.equals(nativeAdImpl.f2669k)) {
            return false;
        }
        String str4 = this.f2668j;
        if (str4 == null ? nativeAdImpl.f2668j != null : !str4.equals(nativeAdImpl.f2668j)) {
            return false;
        }
        String str5 = this.f2666h;
        if (str5 == null ? nativeAdImpl.f2666h != null : !str5.equals(nativeAdImpl.f2666h)) {
            return false;
        }
        String str6 = this.f2670l;
        if (str6 == null ? nativeAdImpl.f2670l != null : !str6.equals(nativeAdImpl.f2670l)) {
            return false;
        }
        String str7 = this.f2661c;
        if (str7 == null ? nativeAdImpl.f2661c != null : !str7.equals(nativeAdImpl.f2661c)) {
            return false;
        }
        String str8 = this.f2662d;
        if (str8 == null ? nativeAdImpl.f2662d != null : !str8.equals(nativeAdImpl.f2662d)) {
            return false;
        }
        String str9 = this.f2663e;
        if (str9 == null ? nativeAdImpl.f2663e != null : !str9.equals(nativeAdImpl.f2663e)) {
            return false;
        }
        String str10 = this.f2664f;
        if (str10 == null ? nativeAdImpl.f2664f != null : !str10.equals(nativeAdImpl.f2664f)) {
            return false;
        }
        String str11 = this.f2665g;
        if (str11 == null ? nativeAdImpl.f2665g != null : !str11.equals(nativeAdImpl.f2665g)) {
            return false;
        }
        String str12 = this.f2672n;
        if (str12 == null ? nativeAdImpl.f2672n != null : !str12.equals(nativeAdImpl.f2672n)) {
            return false;
        }
        String str13 = this.f2671m;
        if (str13 == null ? nativeAdImpl.f2671m != null : !str13.equals(nativeAdImpl.f2671m)) {
            return false;
        }
        List<C1374a> list = this.f2673o;
        if (list == null ? nativeAdImpl.f2673o != null : !list.equals(nativeAdImpl.f2673o)) {
            return false;
        }
        List<C1374a> list2 = this.f2674p;
        if (list2 == null ? nativeAdImpl.f2674p != null : !list2.equals(nativeAdImpl.f2674p)) {
            return false;
        }
        List<String> list3 = this.f2677s;
        List<String> list4 = nativeAdImpl.f2677s;
        return list3 == null ? list4 == null : list3.equals(list4);
    }

    public long getAdId() {
        return this.f2676r;
    }

    public C1349d getAdZone() {
        return this.f2660b;
    }

    public String getCaptionText() {
        return this.f2667i;
    }

    public String getClCode() {
        return this.f2675q;
    }

    public String getCtaText() {
        return this.f2668j;
    }

    public String getDescriptionText() {
        return this.f2666h;
    }

    public String getIconUrl() {
        return this.f2678t;
    }

    public String getImageUrl() {
        return this.f2679u;
    }

    public List<String> getResourcePrefixes() {
        return this.f2677s;
    }

    public String getSourceIconUrl() {
        return this.f2661c;
    }

    public String getSourceImageUrl() {
        return this.f2662d;
    }

    public String getSourceStarRatingImageUrl() {
        return this.f2663e;
    }

    public String getSourceVideoUrl() {
        return this.f2664f;
    }

    public float getStarRating() {
        return this.f2680v;
    }

    public String getTitle() {
        return this.f2665g;
    }

    public String getVideoEndTrackingUrl(int i, boolean z) {
        Uri build;
        if (this.f2672n == null) {
            build = Uri.EMPTY;
        } else {
            if (i < 0 || i > 100) {
                C1505q.m3341c("AppLovinNativeAd", "Invalid percent viewed supplied.", new IllegalArgumentException("Percent viewed must be an integer between 0 and 100."));
            }
            build = Uri.parse(this.f2672n).buildUpon().appendQueryParameter(QUERY_PARAM_VIDEO_PERCENT_VIEWED, Integer.toString(i)).appendQueryParameter(QUERY_PARAM_IS_FIRST_PLAY, Boolean.toString(z)).build();
        }
        return build.toString();
    }

    public String getVideoStartTrackingUrl() {
        return this.f2671m;
    }

    public String getVideoUrl() {
        return this.f2681w;
    }

    public String getZoneId() {
        return "";
    }

    public int hashCode() {
        String str = this.f2661c;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f2662d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f2663e;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f2664f;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f2665g;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f2666h;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f2667i;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f2668j;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f2669k;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f2670l;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f2671m;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.f2672n;
        int hashCode12 = (hashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
        List<C1374a> list = this.f2673o;
        int hashCode13 = (hashCode12 + (list != null ? list.hashCode() : 0)) * 31;
        List<C1374a> list2 = this.f2674p;
        int hashCode14 = (hashCode13 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str13 = this.f2675q;
        int hashCode15 = (hashCode14 + (str13 != null ? str13.hashCode() : 0)) * 31;
        C1349d dVar = this.f2660b;
        int hashCode16 = (hashCode15 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        List<String> list3 = this.f2677s;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode16 + i;
    }

    public boolean isImagePrecached() {
        String str = this.f2678t;
        boolean z = str != null && !str.equals(this.f2661c);
        String str2 = this.f2679u;
        return z && (str2 != null && !str2.equals(this.f2662d));
    }

    public boolean isVideoPrecached() {
        String str = this.f2681w;
        return str != null && !str.equals(this.f2664f);
    }

    public void launchClickTarget(Context context) {
        for (C1374a next : this.f2674p) {
            this.f2659a.mo13073M().mo13215a(C1496f.m3253l().mo13233a(next.mo12879a()).mo13237b(next.mo12880b()).mo13235a(false).mo13236a());
        }
        C1557r.m3608a(context, Uri.parse(this.f2669k), this.f2659a);
    }

    public void setIconUrl(String str) {
        this.f2678t = str;
    }

    public void setImageUrl(String str) {
        this.f2679u = str;
    }

    public void setStarRating(float f) {
        this.f2680v = f;
    }

    public void setVideoUrl(String str) {
        this.f2681w = str;
    }

    public String toString() {
        return "AppLovinNativeAd{clCode='" + this.f2675q + '\'' + ", adZone='" + this.f2660b + '\'' + ", sourceIconUrl='" + this.f2661c + '\'' + ", sourceImageUrl='" + this.f2662d + '\'' + ", sourceStarRatingImageUrl='" + this.f2663e + '\'' + ", sourceVideoUrl='" + this.f2664f + '\'' + ", title='" + this.f2665g + '\'' + ", descriptionText='" + this.f2666h + '\'' + ", captionText='" + this.f2667i + '\'' + ", ctaText='" + this.f2668j + '\'' + ", iconUrl='" + this.f2678t + '\'' + ", imageUrl='" + this.f2679u + '\'' + ", starRating='" + this.f2680v + '\'' + ", videoUrl='" + this.f2681w + '\'' + ", clickUrl='" + this.f2669k + '\'' + ", impressionTrackingUrl='" + this.f2670l + '\'' + ", videoStartTrackingUrl='" + this.f2671m + '\'' + ", videoEndTrackingUrl='" + this.f2672n + '\'' + ", impressionPostbacks=" + this.f2673o + '\'' + ", clickTrackingPostbacks=" + this.f2674p + '\'' + ", resourcePrefixes=" + this.f2677s + '}';
    }

    public void trackImpression() {
        trackImpression((AppLovinPostbackListener) null);
    }

    public void trackImpression(AppLovinPostbackListener appLovinPostbackListener) {
        if (!this.f2682x.getAndSet(true)) {
            this.f2659a.mo13139v().mo13277b("AppLovinNativeAd", "Tracking impression...");
            for (C1374a next : this.f2673o) {
                this.f2659a.mo13073M().mo13217a(C1496f.m3253l().mo13233a(next.mo12879a()).mo13237b(next.mo12880b()).mo13235a(false).mo13236a(), true, appLovinPostbackListener);
            }
        } else if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.f2670l, AppLovinErrorCodes.NATIVE_AD_IMPRESSION_ALREADY_TRACKED);
        }
    }
}
