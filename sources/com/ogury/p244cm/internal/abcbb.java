package com.ogury.p244cm.internal;

import com.ogury.p244cm.ConsentActivity;
import com.tapjoy.TapjoyConstants;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.abcbb */
public final class abcbb {

    /* renamed from: a */
    public static final aaaaa f20456a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private final String f20457b;

    /* renamed from: c */
    private final String f20458c;

    /* renamed from: d */
    private final String f20459d;

    /* renamed from: e */
    private final String f20460e;

    /* renamed from: f */
    private final String f20461f;

    /* renamed from: g */
    private final String f20462g;

    /* renamed from: h */
    private final String f20463h;

    /* renamed from: i */
    private final String f20464i;

    /* renamed from: j */
    private final String f20465j;

    /* renamed from: k */
    private final String f20466k;

    /* renamed from: l */
    private final Boolean f20467l;

    /* renamed from: m */
    private final String f20468m;

    /* renamed from: n */
    private final Integer[] f20469n;

    /* renamed from: com.ogury.cm.internal.abcbb$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    public abcbb(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, Integer[] numArr) {
        this.f20457b = str;
        this.f20458c = str2;
        this.f20459d = str3;
        this.f20460e = str4;
        this.f20461f = str5;
        this.f20462g = str6;
        this.f20463h = str7;
        this.f20464i = str8;
        this.f20465j = str9;
        this.f20466k = str10;
        this.f20467l = bool;
        this.f20468m = str11;
        this.f20469n = numArr;
    }

    /* renamed from: b */
    private final JSONObject m21906b() {
        JSONObject jSONObject = new JSONObject();
        String str = this.f20465j;
        if (str != null) {
            jSONObject.put("retrieval_method", str);
        }
        String str2 = this.f20466k;
        if (str2 != null) {
            jSONObject.put("iab_string", str2);
        }
        Integer[] numArr = this.f20469n;
        boolean z = true;
        if (numArr != null) {
            if (!(numArr.length == 0)) {
                z = false;
            }
        }
        if (!z) {
            JSONArray jSONArray = new JSONArray();
            for (Integer intValue : this.f20469n) {
                jSONArray.put(intValue.intValue());
            }
            jSONObject.put("vendor_ids", jSONArray);
        }
        Boolean bool = this.f20467l;
        if (bool != null) {
            bool.booleanValue();
            jSONObject.put("has_consent", this.f20467l.booleanValue());
        }
        String str3 = this.f20468m;
        if (str3 != null) {
            jSONObject.put("origin", str3);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final JSONObject mo52719a() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String str = this.f20457b;
        if (str != null) {
            jSONObject2.put("asset_key", str);
        }
        String str2 = this.f20458c;
        if (str2 != null) {
            jSONObject2.put("asset_type", str2);
        }
        String str3 = this.f20459d;
        if (str3 != null) {
            jSONObject2.put("bundle_id", str3);
        }
        String str4 = this.f20463h;
        if (str4 != null) {
            jSONObject2.put("version", str4);
        }
        if (!ConsentActivity.aaaaa.m21629a(jSONObject2)) {
            jSONObject.put(TapjoyConstants.TJC_APP_PLACEMENT, jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        String str5 = this.f20460e;
        if (str5 != null) {
            jSONObject3.put("module_version", str5);
        }
        if (!ConsentActivity.aaaaa.m21629a(jSONObject3)) {
            jSONObject.put("sdk", jSONObject3);
        }
        JSONObject jSONObject4 = new JSONObject();
        String str6 = this.f20461f;
        if (str6 != null) {
            jSONObject4.put("os", str6);
        }
        String str7 = this.f20462g;
        if (str7 != null) {
            jSONObject4.put(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, str7);
        }
        if (!ConsentActivity.aaaaa.m21629a(jSONObject4)) {
            jSONObject.put("device", jSONObject4);
        }
        JSONObject jSONObject5 = new JSONObject();
        String str8 = this.f20464i;
        if (str8 != null) {
            jSONObject5.put("consent_token", str8);
        }
        if (!ConsentActivity.aaaaa.m21629a(m21906b())) {
            jSONObject5.put("consent", m21906b());
        }
        if (!ConsentActivity.aaaaa.m21629a(jSONObject5)) {
            jSONObject.put("privacy_compliancy", jSONObject5);
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abcbb)) {
            return false;
        }
        abcbb abcbb = (abcbb) obj;
        return bbabc.m22050a((Object) this.f20457b, (Object) abcbb.f20457b) && bbabc.m22050a((Object) this.f20458c, (Object) abcbb.f20458c) && bbabc.m22050a((Object) this.f20459d, (Object) abcbb.f20459d) && bbabc.m22050a((Object) this.f20460e, (Object) abcbb.f20460e) && bbabc.m22050a((Object) this.f20461f, (Object) abcbb.f20461f) && bbabc.m22050a((Object) this.f20462g, (Object) abcbb.f20462g) && bbabc.m22050a((Object) this.f20463h, (Object) abcbb.f20463h) && bbabc.m22050a((Object) this.f20464i, (Object) abcbb.f20464i) && bbabc.m22050a((Object) this.f20465j, (Object) abcbb.f20465j) && bbabc.m22050a((Object) this.f20466k, (Object) abcbb.f20466k) && bbabc.m22050a((Object) this.f20467l, (Object) abcbb.f20467l) && bbabc.m22050a((Object) this.f20468m, (Object) abcbb.f20468m) && bbabc.m22050a((Object) this.f20469n, (Object) abcbb.f20469n);
    }

    public final int hashCode() {
        String str = this.f20457b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f20458c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f20459d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f20460e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f20461f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f20462g;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f20463h;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f20464i;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f20465j;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.f20466k;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        Boolean bool = this.f20467l;
        int hashCode11 = (hashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str11 = this.f20468m;
        int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31;
        Integer[] numArr = this.f20469n;
        if (numArr != null) {
            i = Arrays.hashCode(numArr);
        }
        return hashCode12 + i;
    }

    public final String toString() {
        return "ExternalRequestBody(assetKey=" + this.f20457b + ", assetType=" + this.f20458c + ", bundleId=" + this.f20459d + ", moduleVersion=" + this.f20460e + ", os=" + this.f20461f + ", osVersion=" + this.f20462g + ", version=" + this.f20463h + ", consentToken=" + this.f20464i + ", retrievalMethod=" + this.f20465j + ", iabString=" + this.f20466k + ", hasConsent=" + this.f20467l + ", origin=" + this.f20468m + ", vendorIds=" + Arrays.toString(this.f20469n) + ")";
    }
}
