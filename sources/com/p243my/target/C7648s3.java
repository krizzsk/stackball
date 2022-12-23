package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.p243my.target.C7596p1;
import com.p243my.target.common.models.ImageData;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.s3 */
public class C7648s3 {

    /* renamed from: a */
    public final Context f19314a;

    /* renamed from: b */
    public final C7617q1 f19315b;

    /* renamed from: c */
    public final C7298a f19316c;

    /* renamed from: d */
    public final C7437h4 f19317d;

    /* renamed from: e */
    public String f19318e;

    /* renamed from: f */
    public boolean f19319f = true;

    public C7648s3(C7617q1 q1Var, C7298a aVar, Context context) {
        this.f19315b = q1Var;
        this.f19316c = aVar;
        this.f19314a = context;
        this.f19317d = C7437h4.m19248a(q1Var, aVar, context);
    }

    /* renamed from: a */
    public static C7648s3 m20309a(C7617q1 q1Var, C7298a aVar, Context context) {
        return new C7648s3(q1Var, aVar, context);
    }

    /* renamed from: a */
    public static String m20310a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            StringBuilder sb = new StringBuilder(str2);
            if (sb.length() > 0) {
                Matcher matcher = Pattern.compile("<script\\s+[^>]*\\bsrc\\s*=\\s*(\\\\?[\\\"\\'])mraid\\.js\\1[^>]*>\\s*<\\/script>\\n*", 2).matcher(str2);
                if (matcher.find()) {
                    int start = matcher.start();
                    sb.delete(start, matcher.end());
                    sb.insert(start, "<script src=\"" + str + "\"></script>");
                    return sb.toString();
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static String m20311c(JSONObject jSONObject) {
        String str;
        String optString = jSONObject.optString("src", "");
        if (!TextUtils.isEmpty(optString)) {
            str = C7466i8.m19410a(optString);
            if (str != null) {
                return str;
            }
        } else {
            str = null;
        }
        String optString2 = jSONObject.optString("source", "");
        return !TextUtils.isEmpty(optString2) ? C7784z8.m21026a(optString2) : str;
    }

    /* renamed from: a */
    public final C7581o2 mo51482a(C7581o2 o2Var, JSONObject jSONObject) {
        return jSONObject == null ? o2Var : C7361d4.m18928a(this.f19316c, this.f19315b.f19227b, this.f19319f, this.f19314a).mo49991a(o2Var, jSONObject);
    }

    /* renamed from: a */
    public final C7596p1.C7597a mo51483a(JSONObject jSONObject) {
        String str;
        if (jSONObject == null) {
            str = "null adChoices option";
        } else {
            String optString = jSONObject.optString("name");
            if (!TextUtils.isEmpty(optString)) {
                return C7596p1.C7597a.m20061a(optString, jSONObject.optString("url"), jSONObject.optString("clickLink"), jSONObject.optBoolean("shouldCloseAd", true));
            }
            str = "empty name in adChoices option";
        }
        mo51487b("Bad value", str);
        return null;
    }

    /* renamed from: a */
    public final void mo51484a(C7768z1 z1Var, JSONObject jSONObject) {
        String optString = jSONObject.optString("iconLink");
        String optString2 = jSONObject.optString("clickLink");
        if (!TextUtils.isEmpty(optString)) {
            List<C7596p1.C7597a> b = mo51486b(jSONObject);
            if (b != null || !TextUtils.isEmpty(optString2)) {
                C7596p1 a = C7596p1.m20056a(ImageData.newImageData(optString), optString2);
                z1Var.setAdChoices(a);
                if (b != null) {
                    a.mo51316a(b);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:85:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0260  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo51485a(org.json.JSONObject r10, com.p243my.target.C7768z1 r11) {
        /*
            r9 = this;
            java.lang.String r0 = "logErrors"
            boolean r1 = r10.has(r0)
            r2 = 1
            if (r1 == 0) goto L_0x001d
            boolean r0 = r10.optBoolean(r0, r2)
            r9.f19319f = r0
            com.my.target.h4 r1 = r9.f19317d
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.mo50292a(r0)
            boolean r0 = r9.f19319f
            r11.setLogErrors(r0)
        L_0x001d:
            java.lang.String r0 = "id"
            java.lang.String r0 = r10.optString(r0)
            r9.f19318e = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = r11.getId()
            java.lang.String r1 = "bannerID"
            java.lang.String r0 = r10.optString(r1, r0)
            r9.f19318e = r0
        L_0x0037:
            java.lang.String r0 = r9.f19318e
            r11.setId(r0)
            java.lang.String r0 = "type"
            java.lang.String r0 = r10.optString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x004b
            r11.setType(r0)
        L_0x004b:
            int r0 = r11.getWidth()
            java.lang.String r1 = "width"
            int r0 = r10.optInt(r1, r0)
            r11.setWidth(r0)
            int r0 = r11.getHeight()
            java.lang.String r1 = "height"
            int r0 = r10.optInt(r1, r0)
            r11.setHeight(r0)
            java.lang.String r0 = "ageRestrictions"
            java.lang.String r0 = r10.optString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0074
            r11.setAgeRestrictions(r0)
        L_0x0074:
            java.lang.String r0 = "deeplink"
            java.lang.String r1 = r10.optString(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0083
            r11.setDeeplink(r1)
        L_0x0083:
            java.lang.String r1 = "trackingLink"
            java.lang.String r1 = r10.optString(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x0092
            r11.setTrackingLink(r1)
        L_0x0092:
            java.lang.String r1 = "bundle_id"
            java.lang.String r1 = r10.optString(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x00a1
            r11.setBundleId(r1)
        L_0x00a1:
            java.lang.String r1 = "urlscheme"
            java.lang.String r1 = r10.optString(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x00b0
            r11.setUrlscheme(r1)
        L_0x00b0:
            com.my.target.q1 r1 = r9.f19315b
            java.lang.Boolean r1 = r1.mo51407r()
            if (r1 == 0) goto L_0x00bd
            boolean r1 = r1.booleanValue()
            goto L_0x00c7
        L_0x00bd:
            boolean r1 = r11.isOpenInBrowser()
            java.lang.String r3 = "openInBrowser"
            boolean r1 = r10.optBoolean(r3, r1)
        L_0x00c7:
            r11.setOpenInBrowser(r1)
            com.my.target.q1 r1 = r9.f19315b
            java.lang.Boolean r1 = r1.mo51400k()
            if (r1 == 0) goto L_0x00d7
            boolean r1 = r1.booleanValue()
            goto L_0x00e1
        L_0x00d7:
            boolean r1 = r11.isDirectLink()
            java.lang.String r3 = "directLink"
            boolean r1 = r10.optBoolean(r3, r1)
        L_0x00e1:
            r11.setDirectLink(r1)
            java.lang.String r1 = r11.getPaidType()
            java.lang.String r3 = "paidType"
            java.lang.String r1 = r10.optString(r3, r1)
            r11.setPaidType(r1)
            java.lang.String r1 = "navigationType"
            java.lang.String r1 = r10.optString(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x010c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = "store"
            r11.setNavigationType(r0)
            goto L_0x010c
        L_0x0109:
            r11.setNavigationType(r1)
        L_0x010c:
            java.lang.String r0 = "title"
            java.lang.String r0 = r10.optString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x011b
            r11.setTitle(r0)
        L_0x011b:
            java.lang.String r0 = "description"
            java.lang.String r0 = r10.optString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x012a
            r11.setDescription(r0)
        L_0x012a:
            java.lang.String r0 = "disclaimer"
            java.lang.String r0 = r10.optString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0139
            r11.setDisclaimer(r0)
        L_0x0139:
            int r0 = r11.getVotes()
            java.lang.String r1 = "votes"
            int r0 = r10.optInt(r1, r0)
            r11.setVotes(r0)
            java.lang.String r0 = "category"
            java.lang.String r0 = r10.optString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0155
            r11.setCategory(r0)
        L_0x0155:
            java.lang.String r0 = "subcategory"
            java.lang.String r0 = r10.optString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0164
            r11.setSubCategory(r0)
        L_0x0164:
            java.lang.String r0 = "domain"
            java.lang.String r0 = r10.optString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0173
            r11.setDomain(r0)
        L_0x0173:
            float r0 = r11.getDuration()
            double r0 = (double) r0
            java.lang.String r3 = "duration"
            double r0 = r10.optDouble(r3, r0)
            float r0 = (float) r0
            r11.setDuration(r0)
            java.lang.String r0 = "rating"
            boolean r1 = r10.has(r0)
            java.lang.String r4 = "Bad value"
            if (r1 == 0) goto L_0x01b8
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r0 = r10.optDouble(r0, r5)
            float r0 = (float) r0
            double r5 = (double) r0
            r7 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x01a4
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x01a4
            r11.setRating(r0)
            goto L_0x01b8
        L_0x01a4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "unable to parse rating "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.mo51487b(r4, r0)
        L_0x01b8:
            java.lang.String r0 = r11.getCtaText()
            java.lang.String r1 = "ctaText"
            java.lang.String r0 = r10.optString(r1, r0)
            r11.setCtaText(r0)
            java.lang.String r0 = "iconLink"
            java.lang.String r0 = r10.optString(r0)
            java.lang.String r1 = "iconWidth"
            int r1 = r10.optInt(r1)
            java.lang.String r5 = "iconHeight"
            int r5 = r10.optInt(r5)
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 != 0) goto L_0x01e4
            com.my.target.common.models.ImageData r0 = com.p243my.target.common.models.ImageData.newImageData(r0, r1, r5)
            r11.setIcon(r0)
        L_0x01e4:
            java.lang.String r0 = "imageLink"
            java.lang.String r0 = r10.optString(r0)
            java.lang.String r1 = "imageWidth"
            int r1 = r10.optInt(r1)
            java.lang.String r5 = "imageHeight"
            int r5 = r10.optInt(r5)
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 != 0) goto L_0x0203
            com.my.target.common.models.ImageData r0 = com.p243my.target.common.models.ImageData.newImageData(r0, r1, r5)
            r11.setImage(r0)
        L_0x0203:
            java.lang.String r0 = "clickArea"
            boolean r1 = r10.has(r0)
            if (r1 == 0) goto L_0x022e
            int r0 = r10.optInt(r0)
            if (r0 > 0) goto L_0x0226
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Bad ClickArea mask "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.mo51487b(r4, r0)
            goto L_0x0242
        L_0x0226:
            com.my.target.r1 r0 = com.p243my.target.C7631r1.m20228a(r0)
        L_0x022a:
            r11.setClickArea(r0)
            goto L_0x0242
        L_0x022e:
            java.lang.String r0 = "extendedClickArea"
            boolean r1 = r10.has(r0)
            if (r1 == 0) goto L_0x0242
            boolean r0 = r10.optBoolean(r0, r2)
            if (r0 == 0) goto L_0x023f
            com.my.target.r1 r0 = com.p243my.target.C7631r1.f19276a
            goto L_0x022a
        L_0x023f:
            com.my.target.r1 r0 = com.p243my.target.C7631r1.f19277b
            goto L_0x022a
        L_0x0242:
            java.lang.String r0 = "advertisingLabel"
            java.lang.String r1 = ""
            java.lang.String r0 = r10.optString(r0, r1)
            r11.setAdvertisingLabel(r0)
            java.lang.String r0 = "adChoices"
            org.json.JSONObject r0 = r10.optJSONObject(r0)
            if (r0 == 0) goto L_0x0258
            r9.mo51484a((com.p243my.target.C7768z1) r11, (org.json.JSONObject) r0)
        L_0x0258:
            java.lang.String r0 = "viewability"
            org.json.JSONObject r0 = r10.optJSONObject(r0)
            if (r0 == 0) goto L_0x02cb
            com.my.target.y1 r1 = r11.getViewability()
            java.lang.String r2 = "percent"
            boolean r5 = r0.has(r2)
            if (r5 == 0) goto L_0x0293
            int r2 = r0.optInt(r2)
            r5 = 5
            if (r2 < r5) goto L_0x027f
            r5 = 100
            if (r2 > r5) goto L_0x027f
            float r2 = (float) r2
            r5 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r5
            r1.mo51864c(r2)
            goto L_0x0293
        L_0x027f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "invalid viewability percent "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r9.mo51487b(r4, r2)
        L_0x0293:
            java.lang.String r2 = "rate"
            boolean r5 = r0.has(r2)
            if (r5 == 0) goto L_0x02be
            double r5 = r0.optDouble(r2)
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x02aa
            float r2 = (float) r5
            r1.mo51862b(r2)
            goto L_0x02be
        L_0x02aa:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "invalid viewability rate "
            r2.append(r7)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r9.mo51487b(r4, r2)
        L_0x02be:
            float r2 = r1.mo51859a()
            double r4 = (double) r2
            double r2 = r0.optDouble(r3, r4)
            float r0 = (float) r2
            r1.mo51860a(r0)
        L_0x02cb:
            boolean r0 = r11.isAppInWhiteList()
            java.lang.String r1 = "isAppInWhitelist"
            boolean r0 = r10.optBoolean(r1, r0)
            r11.setAppInWhiteList(r0)
            com.my.target.q1 r0 = r9.f19315b
            com.my.target.o2 r0 = r0.mo51405p()
            java.lang.String r1 = "omdata"
            org.json.JSONObject r1 = r10.optJSONObject(r1)
            com.my.target.o2 r0 = r9.mo51482a((com.p243my.target.C7581o2) r0, (org.json.JSONObject) r1)
            r11.setOmData(r0)
            com.my.target.h4 r0 = r9.f19317d
            com.my.target.c3 r1 = r11.getStatHolder()
            java.lang.String r2 = r9.f19318e
            float r11 = r11.getDuration()
            r0.mo50291a(r1, r10, r2, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7648s3.mo51485a(org.json.JSONObject, com.my.target.z1):void");
    }

    /* renamed from: b */
    public final List<C7596p1.C7597a> mo51486b(JSONObject jSONObject) {
        int length;
        JSONArray optJSONArray = jSONObject.optJSONArray(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
        if (optJSONArray == null || (length = optJSONArray.length()) == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < length; i++) {
            C7596p1.C7597a a = mo51483a(optJSONArray.optJSONObject(i));
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo51487b(String str, String str2) {
        if (this.f19319f) {
            String str3 = this.f19315b.f19226a;
            C7498k3 c = C7498k3.m19572a(str).mo50704d(str2).mo50699a(this.f19316c.getSlotId()).mo50703c(this.f19318e);
            if (str3 == null) {
                str3 = this.f19315b.f19227b;
            }
            c.mo50701b(str3).mo50702b(this.f19314a);
        }
    }
}
