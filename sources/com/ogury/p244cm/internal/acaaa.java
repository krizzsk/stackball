package com.ogury.p244cm.internal;

import com.appsflyer.ServerParameters;
import com.ogury.p244cm.ConsentActivity;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.acaaa */
public final class acaaa {

    /* renamed from: a */
    public static final aaaaa f20488a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private final String f20489b;

    /* renamed from: c */
    private final String f20490c;

    /* renamed from: d */
    private final String f20491d;

    /* renamed from: e */
    private final String f20492e;

    /* renamed from: f */
    private final String f20493f;

    /* renamed from: g */
    private final String f20494g;

    /* renamed from: h */
    private final String f20495h;

    /* renamed from: i */
    private final String f20496i;

    /* renamed from: j */
    private final String f20497j;

    /* renamed from: k */
    private final Integer f20498k;

    /* renamed from: l */
    private final Integer f20499l;

    /* renamed from: m */
    private final String f20500m;

    /* renamed from: n */
    private final String f20501n;

    /* renamed from: o */
    private final Double f20502o;

    /* renamed from: p */
    private final String f20503p;

    /* renamed from: q */
    private final String f20504q;

    /* renamed from: r */
    private final String f20505r;

    /* renamed from: s */
    private final String f20506s;

    /* renamed from: t */
    private final String f20507t;

    /* renamed from: u */
    private final Boolean f20508u;

    /* renamed from: v */
    private final Boolean f20509v;

    /* renamed from: w */
    private final Boolean f20510w;

    /* renamed from: com.ogury.cm.internal.acaaa$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    public acaaa(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num, Integer num2, String str10, String str11, Double d, String str12, String str13, String str14, String str15, String str16, Boolean bool, Boolean bool2, Boolean bool3) {
        this.f20489b = str;
        this.f20490c = str2;
        this.f20491d = str3;
        this.f20492e = str4;
        this.f20493f = str5;
        this.f20494g = str6;
        this.f20495h = str7;
        this.f20496i = str8;
        this.f20497j = str9;
        this.f20498k = num;
        this.f20499l = num2;
        this.f20500m = str10;
        this.f20501n = str11;
        this.f20502o = d;
        this.f20503p = str12;
        this.f20504q = str13;
        this.f20505r = str14;
        this.f20506s = str15;
        this.f20507t = str16;
        this.f20508u = bool;
        this.f20509v = bool2;
        this.f20510w = bool3;
    }

    /* renamed from: a */
    private static JSONArray m21918a(String str) {
        JSONArray jSONArray = new JSONArray(str);
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            System.out.print(jSONObject.toString() + "\n");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("product_id", jSONObject.getString("productId"));
            jSONObject2.put("purchase_token", jSONObject.getString("purchaseToken"));
            jSONArray2.put(jSONObject2);
        }
        return jSONArray2;
    }

    /* renamed from: a */
    public final JSONObject mo52729a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String str = this.f20489b;
        if (str != null) {
            jSONObject2.put("asset_key", str);
        }
        String str2 = this.f20490c;
        if (str2 != null) {
            jSONObject2.put("asset_type", str2);
        }
        String str3 = this.f20491d;
        if (str3 != null) {
            jSONObject2.put("bundle_id", str3);
        }
        String str4 = this.f20495h;
        if (str4 != null) {
            jSONObject2.put("version", str4);
        }
        if (!ConsentActivity.aaaaa.m21629a(jSONObject2)) {
            jSONObject.put(TapjoyConstants.TJC_APP_PLACEMENT, jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        String str5 = this.f20492e;
        if (str5 != null) {
            jSONObject3.put("module_version", str5);
        }
        if (!ConsentActivity.aaaaa.m21629a(jSONObject3)) {
            jSONObject.put("sdk", jSONObject3);
        }
        JSONObject jSONObject4 = new JSONObject();
        String str6 = this.f20493f;
        if (str6 != null) {
            jSONObject4.put("os", str6);
        }
        String str7 = this.f20494g;
        if (str7 != null) {
            jSONObject4.put(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, str7);
        }
        String str8 = this.f20496i;
        if (str8 != null) {
            jSONObject4.put("manufacturer", str8);
        }
        String str9 = this.f20497j;
        if (str9 != null) {
            jSONObject4.put(ServerParameters.MODEL, str9);
        }
        JSONObject jSONObject5 = new JSONObject();
        Integer num = this.f20498k;
        if (num != null) {
            jSONObject5.put("height", num.intValue());
        }
        String str10 = this.f20500m;
        if (str10 != null) {
            jSONObject5.put("ui_mode", str10);
        }
        String str11 = this.f20501n;
        if (str11 != null) {
            jSONObject5.put("layout_size", str11);
        }
        Integer num2 = this.f20499l;
        if (num2 != null) {
            jSONObject5.put("width", num2.intValue());
        }
        Double d = this.f20502o;
        if (d != null) {
            jSONObject5.put("density", d.doubleValue());
        }
        if (!ConsentActivity.aaaaa.m21629a(jSONObject5)) {
            jSONObject4.put("screen", jSONObject5);
        }
        JSONObject jSONObject6 = new JSONObject();
        JSONObject jSONObject7 = new JSONObject();
        String str12 = this.f20504q;
        if (str12 != null) {
            jSONObject7.put("country", str12);
        }
        String str13 = this.f20503p;
        if (str13 != null) {
            jSONObject7.put("language", str13);
        }
        if (!ConsentActivity.aaaaa.m21629a(jSONObject7)) {
            jSONObject6.put("locale", jSONObject7);
        }
        if (!ConsentActivity.aaaaa.m21629a(jSONObject6)) {
            jSONObject4.put("settings", jSONObject6);
        }
        JSONObject jSONObject8 = new JSONObject();
        String str14 = this.f20505r;
        if (str14 != null) {
            jSONObject8.put("connectivity", str14);
        }
        if (!ConsentActivity.aaaaa.m21629a(jSONObject8)) {
            jSONObject4.put(ServerParameters.NETWORK, jSONObject8);
        }
        if (!ConsentActivity.aaaaa.m21629a(jSONObject4)) {
            jSONObject.put("device", jSONObject4);
        }
        JSONObject jSONObject9 = new JSONObject();
        String str15 = this.f20506s;
        if (str15 != null) {
            jSONObject9.put("consent_token", str15);
        }
        Boolean bool = this.f20509v;
        if (bool != null) {
            bool.booleanValue();
            jSONObject9.put("is_child_under_coppa", this.f20509v.booleanValue());
        }
        Boolean bool2 = this.f20510w;
        if (bool2 != null) {
            bool2.booleanValue();
            jSONObject9.put("is_under_age_of_gdpr_consent", this.f20510w.booleanValue());
        }
        if (!ConsentActivity.aaaaa.m21629a(jSONObject9)) {
            jSONObject.put("privacy_compliancy", jSONObject9);
        }
        JSONObject jSONObject10 = new JSONObject();
        Boolean bool3 = this.f20508u;
        if (bool3 != null) {
            jSONObject10.put(TJAdUnitConstants.String.ENABLED, bool3.booleanValue());
        }
        CharSequence charSequence = this.f20507t;
        if (!(charSequence == null || charSequence.length() == 0)) {
            jSONObject10.put("purchase_tokens", m21918a(this.f20507t));
        }
        if (!ConsentActivity.aaaaa.m21629a(jSONObject10)) {
            jSONObject.put("billing", jSONObject10);
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acaaa)) {
            return false;
        }
        acaaa acaaa = (acaaa) obj;
        return bbabc.m22050a((Object) this.f20489b, (Object) acaaa.f20489b) && bbabc.m22050a((Object) this.f20490c, (Object) acaaa.f20490c) && bbabc.m22050a((Object) this.f20491d, (Object) acaaa.f20491d) && bbabc.m22050a((Object) this.f20492e, (Object) acaaa.f20492e) && bbabc.m22050a((Object) this.f20493f, (Object) acaaa.f20493f) && bbabc.m22050a((Object) this.f20494g, (Object) acaaa.f20494g) && bbabc.m22050a((Object) this.f20495h, (Object) acaaa.f20495h) && bbabc.m22050a((Object) this.f20496i, (Object) acaaa.f20496i) && bbabc.m22050a((Object) this.f20497j, (Object) acaaa.f20497j) && bbabc.m22050a((Object) this.f20498k, (Object) acaaa.f20498k) && bbabc.m22050a((Object) this.f20499l, (Object) acaaa.f20499l) && bbabc.m22050a((Object) this.f20500m, (Object) acaaa.f20500m) && bbabc.m22050a((Object) this.f20501n, (Object) acaaa.f20501n) && bbabc.m22050a((Object) this.f20502o, (Object) acaaa.f20502o) && bbabc.m22050a((Object) this.f20503p, (Object) acaaa.f20503p) && bbabc.m22050a((Object) this.f20504q, (Object) acaaa.f20504q) && bbabc.m22050a((Object) this.f20505r, (Object) acaaa.f20505r) && bbabc.m22050a((Object) this.f20506s, (Object) acaaa.f20506s) && bbabc.m22050a((Object) this.f20507t, (Object) acaaa.f20507t) && bbabc.m22050a((Object) this.f20508u, (Object) acaaa.f20508u) && bbabc.m22050a((Object) this.f20509v, (Object) acaaa.f20509v) && bbabc.m22050a((Object) this.f20510w, (Object) acaaa.f20510w);
    }

    public final int hashCode() {
        String str = this.f20489b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f20490c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f20491d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f20492e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f20493f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f20494g;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f20495h;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f20496i;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f20497j;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Integer num = this.f20498k;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f20499l;
        int hashCode11 = (hashCode10 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str10 = this.f20500m;
        int hashCode12 = (hashCode11 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.f20501n;
        int hashCode13 = (hashCode12 + (str11 != null ? str11.hashCode() : 0)) * 31;
        Double d = this.f20502o;
        int hashCode14 = (hashCode13 + (d != null ? d.hashCode() : 0)) * 31;
        String str12 = this.f20503p;
        int hashCode15 = (hashCode14 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.f20504q;
        int hashCode16 = (hashCode15 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.f20505r;
        int hashCode17 = (hashCode16 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.f20506s;
        int hashCode18 = (hashCode17 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.f20507t;
        int hashCode19 = (hashCode18 + (str16 != null ? str16.hashCode() : 0)) * 31;
        Boolean bool = this.f20508u;
        int hashCode20 = (hashCode19 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f20509v;
        int hashCode21 = (hashCode20 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.f20510w;
        if (bool3 != null) {
            i = bool3.hashCode();
        }
        return hashCode21 + i;
    }

    public final String toString() {
        return "RequestBody(assetKey=" + this.f20489b + ", assetType=" + this.f20490c + ", bundleId=" + this.f20491d + ", moduleVersion=" + this.f20492e + ", os=" + this.f20493f + ", osVersion=" + this.f20494g + ", version=" + this.f20495h + ", manufacturer=" + this.f20496i + ", model=" + this.f20497j + ", height=" + this.f20498k + ", width=" + this.f20499l + ", uiMode=" + this.f20500m + ", layoutSize=" + this.f20501n + ", density=" + this.f20502o + ", language=" + this.f20503p + ", country=" + this.f20504q + ", connectivity=" + this.f20505r + ", consentToken=" + this.f20506s + ", purchases=" + this.f20507t + ", enabled=" + this.f20508u + ", isChildUnderCoppa=" + this.f20509v + ", isUnderAgeOfGdprConsent=" + this.f20510w + ")";
    }
}
