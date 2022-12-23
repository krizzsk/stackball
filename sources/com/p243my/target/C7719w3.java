package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.p243my.target.common.models.ImageData;
import com.p243my.target.common.models.VideoData;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.w3 */
public class C7719w3 {

    /* renamed from: a */
    public final C7617q1 f19554a;

    /* renamed from: b */
    public final C7298a f19555b;

    /* renamed from: c */
    public final Context f19556c;

    /* renamed from: d */
    public final C7648s3 f19557d;

    /* renamed from: e */
    public boolean f19558e = true;

    public C7719w3(C7617q1 q1Var, C7298a aVar, Context context) {
        this.f19554a = q1Var;
        this.f19555b = aVar;
        this.f19556c = context;
        this.f19557d = C7648s3.m20309a(q1Var, aVar, context);
    }

    /* renamed from: a */
    public static C7719w3 m20744a(C7617q1 q1Var, C7298a aVar, Context context) {
        return new C7719w3(q1Var, aVar, context);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p243my.target.C7327b2 mo51791a(org.json.JSONObject r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "type"
            java.lang.String r1 = ""
            java.lang.String r0 = r6.optString(r0, r1)
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r1) {
                case -1396342996: goto L_0x0037;
                case 3213227: goto L_0x002c;
                case 106940687: goto L_0x0021;
                case 110066619: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0042
        L_0x0016:
            java.lang.String r1 = "fullscreen"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001f
            goto L_0x0042
        L_0x001f:
            r0 = 3
            goto L_0x0043
        L_0x0021:
            java.lang.String r1 = "promo"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002a
            goto L_0x0042
        L_0x002a:
            r0 = 2
            goto L_0x0043
        L_0x002c:
            java.lang.String r1 = "html"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0035
            goto L_0x0042
        L_0x0035:
            r0 = 1
            goto L_0x0043
        L_0x0037:
            java.lang.String r1 = "banner"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r0 = 0
            goto L_0x0043
        L_0x0042:
            r0 = -1
        L_0x0043:
            if (r0 == 0) goto L_0x0062
            if (r0 == r4) goto L_0x0057
            if (r0 == r3) goto L_0x004c
            if (r0 == r2) goto L_0x0062
            goto L_0x006d
        L_0x004c:
            com.my.target.f2 r0 = com.p243my.target.C7399f2.newBanner()
            boolean r6 = r5.mo51797a((org.json.JSONObject) r6, (com.p243my.target.C7399f2) r0, (java.lang.String) r7)
            if (r6 == 0) goto L_0x006d
            return r0
        L_0x0057:
            com.my.target.d2 r0 = com.p243my.target.C7359d2.newBanner()
            boolean r6 = r5.mo51795a((org.json.JSONObject) r6, (com.p243my.target.C7359d2) r0, (java.lang.String) r7)
            if (r6 == 0) goto L_0x006d
            return r0
        L_0x0062:
            com.my.target.e2 r7 = com.p243my.target.C7377e2.newBanner()
            boolean r6 = r5.mo51796a((org.json.JSONObject) r6, (com.p243my.target.C7377e2) r7)
            if (r6 == 0) goto L_0x006d
            return r7
        L_0x006d:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p243my.target.C7719w3.mo51791a(org.json.JSONObject, java.lang.String):com.my.target.b2");
    }

    /* renamed from: a */
    public final void mo51792a(String str, String str2, String str3) {
        if (this.f19558e) {
            String str4 = this.f19554a.f19226a;
            C7498k3 c = C7498k3.m19572a(str).mo50704d(str2).mo50699a(this.f19555b.getSlotId()).mo50703c(str3);
            if (str4 == null) {
                str4 = this.f19554a.f19227b;
            }
            c.mo50701b(str4).mo50702b(this.f19556c);
        }
    }

    /* renamed from: a */
    public final void mo51793a(JSONObject jSONObject, C7327b2 b2Var) {
        this.f19557d.mo51485a(jSONObject, (C7768z1) b2Var);
        this.f19558e = b2Var.isLogErrors();
        b2Var.setAllowBackButton(jSONObject.optBoolean("allowBackButton", b2Var.isAllowBackButton()));
        b2Var.setAllowCloseDelay((float) jSONObject.optDouble("allowCloseDelay", (double) b2Var.getAllowCloseDelay()));
        String optString = jSONObject.optString("close_icon_hd");
        if (!TextUtils.isEmpty(optString)) {
            b2Var.setCloseIcon(ImageData.newImageData(optString));
        }
    }

    /* renamed from: a */
    public final void mo51794a(JSONObject jSONObject, C7698v1 v1Var) {
        v1Var.mo51711c(C7748y3.m20871a(jSONObject, "ctaButtonColor", v1Var.mo51712d()));
        v1Var.mo51715e(C7748y3.m20871a(jSONObject, "ctaButtonTouchColor", v1Var.mo51716f()));
        v1Var.mo51713d(C7748y3.m20871a(jSONObject, "ctaButtonTextColor", v1Var.mo51714e()));
        v1Var.mo51706a(C7748y3.m20871a(jSONObject, "backgroundColor", v1Var.mo51704a()));
        v1Var.mo51721h(C7748y3.m20871a(jSONObject, "textColor", v1Var.mo51724j()));
        v1Var.mo51723i(C7748y3.m20871a(jSONObject, "titleTextColor", v1Var.mo51724j()));
        v1Var.mo51717f(C7748y3.m20871a(jSONObject, "domainTextColor", v1Var.mo51718g()));
        v1Var.mo51719g(C7748y3.m20871a(jSONObject, "progressBarColor", v1Var.mo51720h()));
        v1Var.mo51709b(C7748y3.m20871a(jSONObject, "barColor", v1Var.mo51708b()));
        float optDouble = (float) jSONObject.optDouble("barOverlayAlpha", (double) v1Var.mo51710c());
        if (0.0f <= optDouble && optDouble <= 1.0f) {
            v1Var.mo51705a(optDouble);
        }
        String optString = jSONObject.optString("storeIcon");
        if (!TextUtils.isEmpty(optString)) {
            v1Var.mo51707a(ImageData.newImageData(optString));
        }
    }

    /* renamed from: a */
    public boolean mo51795a(JSONObject jSONObject, C7359d2 d2Var, String str) {
        String a;
        mo51793a(jSONObject, (C7327b2) d2Var);
        String c = C7648s3.m20311c(jSONObject);
        if (TextUtils.isEmpty(c)) {
            mo51792a("Required field", "Banner with type 'html' has no source field", d2Var.getId());
            return false;
        }
        if (!TextUtils.isEmpty(str) && (a = C7648s3.m20310a(str, c)) != null) {
            d2Var.setType(CampaignEx.JSON_KEY_MRAID);
            c = a;
        }
        if (d2Var.getOmData() != null) {
            c = C7599p3.m20070a(c);
        }
        d2Var.setSource(c);
        d2Var.setTimeToReward((float) jSONObject.optDouble("timeToReward", (double) d2Var.getTimeToReward()));
        return true;
    }

    /* renamed from: a */
    public boolean mo51796a(JSONObject jSONObject, C7377e2 e2Var) {
        mo51793a(jSONObject, (C7327b2) e2Var);
        return C7732x3.m20802a(this.f19554a, this.f19555b, this.f19556c).mo51827a(jSONObject, e2Var);
    }

    /* renamed from: a */
    public boolean mo51797a(JSONObject jSONObject, C7399f2 f2Var, String str) {
        JSONObject optJSONObject;
        C7342c2 b;
        mo51793a(jSONObject, (C7327b2) f2Var);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("styleSettings");
        if (optJSONObject2 != null) {
            mo51794a(optJSONObject2, f2Var.getPromoStyleSettings());
        }
        f2Var.setStyle(jSONObject.optInt("style", f2Var.getStyle()));
        f2Var.setCloseOnClick(jSONObject.optBoolean("closeOnClick", f2Var.isCloseOnClick()));
        f2Var.setVideoRequired(jSONObject.optBoolean("videoRequired", f2Var.isVideoRequired()));
        JSONArray optJSONArray = jSONObject.optJSONArray("cards");
        if (optJSONArray != null && C7761y8.m20953d()) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
                if (!(optJSONObject3 == null || (b = mo51798b(optJSONObject3, f2Var)) == null)) {
                    f2Var.addInterstitialAdCard(b);
                }
            }
        }
        if (f2Var.getInterstitialAdCards().isEmpty() && (optJSONObject = jSONObject.optJSONObject("video")) != null) {
            C7413g2<VideoData> newVideoBanner = C7413g2.newVideoBanner();
            newVideoBanner.setId(f2Var.getId());
            newVideoBanner.setLogErrors(f2Var.isLogErrors());
            if (C7666t3.m20436a(this.f19554a, this.f19555b, this.f19556c).mo51576c(optJSONObject, newVideoBanner)) {
                f2Var.setVideoBanner(newVideoBanner);
                if (newVideoBanner.isAutoPlay()) {
                    f2Var.setAllowClose(newVideoBanner.isAllowClose());
                    f2Var.setAllowCloseDelay(newVideoBanner.getAllowCloseDelay());
                }
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
            if (optJSONObject4 != null) {
                C7327b2 a = mo51791a(optJSONObject4, str);
                if (a != null && a.getId().length() == 0) {
                    a.setId(f2Var.getId());
                }
                f2Var.setEndCard(a);
            }
        }
        String optString = jSONObject.optString("adIconLink");
        if (TextUtils.isEmpty(optString)) {
            return true;
        }
        f2Var.setAdIcon(ImageData.newImageData(optString));
        f2Var.setAdIconClickLink(jSONObject.optString("adIconClickLink"));
        return true;
    }

    /* renamed from: b */
    public C7342c2 mo51798b(JSONObject jSONObject, C7327b2 b2Var) {
        String id;
        String str;
        C7342c2 newCard = C7342c2.newCard(b2Var);
        newCard.setClickArea(b2Var.getClickArea());
        this.f19557d.mo51485a(jSONObject, (C7768z1) newCard);
        if (!jSONObject.has("title")) {
            newCard.setImageOnly(true);
        }
        if (TextUtils.isEmpty(newCard.getTrackingLink())) {
            id = b2Var.getId();
            str = "no tracking link in interstitialAdCard";
        } else if (newCard.getImage() == null) {
            id = b2Var.getId();
            str = "no image in interstitialAdCard";
        } else {
            newCard.setId(jSONObject.optString("cardID", newCard.getId()));
            return newCard;
        }
        mo51792a("Required field", str, id);
        return null;
    }
}
