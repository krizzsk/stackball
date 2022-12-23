package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import com.p243my.target.common.models.ImageData;
import com.p243my.target.common.models.VideoData;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.a4 */
public class C7304a4 {

    /* renamed from: a */
    public final C7617q1 f18309a;

    /* renamed from: b */
    public final C7298a f18310b;

    /* renamed from: c */
    public final Context f18311c;

    /* renamed from: d */
    public final C7648s3 f18312d;

    /* renamed from: e */
    public String f18313e;

    /* renamed from: f */
    public boolean f18314f = true;

    public C7304a4(C7617q1 q1Var, C7298a aVar, Context context) {
        this.f18309a = q1Var;
        this.f18310b = aVar;
        this.f18311c = context;
        this.f18312d = C7648s3.m20309a(q1Var, aVar, context);
    }

    /* renamed from: a */
    public static C7304a4 m18698a(C7617q1 q1Var, C7298a aVar, Context context) {
        return new C7304a4(q1Var, aVar, context);
    }

    /* renamed from: a */
    public final void mo49577a(String str, String str2) {
        if (this.f18314f) {
            String str3 = this.f18309a.f19226a;
            C7498k3 c = C7498k3.m19572a(str).mo50704d(str2).mo50699a(this.f18310b.getSlotId()).mo50703c(this.f18313e);
            if (str3 == null) {
                str3 = this.f18309a.f19227b;
            }
            c.mo50701b(str3).mo50702b(this.f18311c);
        }
    }

    /* renamed from: a */
    public void mo49578a(JSONObject jSONObject, C7435h2 h2Var) {
        C7453i2 b;
        this.f18312d.mo51485a(jSONObject, (C7768z1) h2Var);
        this.f18314f = h2Var.isLogErrors();
        this.f18313e = h2Var.getId();
        JSONArray optJSONArray = jSONObject.optJSONArray("cards");
        if (optJSONArray == null || !C7761y8.m20953d()) {
            if (jSONObject.has("content")) {
                h2Var.setCtcText(jSONObject.optString("ctcText", h2Var.getCtcText()));
                String optString = jSONObject.optString("ctcIconLink");
                if (!TextUtils.isEmpty(optString)) {
                    h2Var.setCtcIcon(ImageData.newImageData(optString));
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("content");
                if (optJSONObject != null) {
                    h2Var.setContent(mo49580c(optJSONObject, h2Var));
                }
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("video");
            if (optJSONObject2 != null) {
                C7413g2<VideoData> newVideoBanner = C7413g2.newVideoBanner();
                newVideoBanner.setId(h2Var.getId());
                newVideoBanner.setLogErrors(h2Var.isLogErrors());
                if (C7666t3.m20436a(this.f18309a, this.f18310b, this.f18311c).mo51576c(optJSONObject2, newVideoBanner)) {
                    h2Var.setVideoBanner(newVideoBanner);
                    return;
                }
                return;
            }
            return;
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject3 = optJSONArray.optJSONObject(i);
            if (!(optJSONObject3 == null || (b = mo49579b(optJSONObject3, h2Var)) == null)) {
                h2Var.addNativeAdCard(b);
            }
        }
    }

    /* renamed from: b */
    public C7453i2 mo49579b(JSONObject jSONObject, C7435h2 h2Var) {
        String str;
        C7453i2 newCard = C7453i2.newCard(h2Var);
        this.f18312d.mo51485a(jSONObject, (C7768z1) newCard);
        if (TextUtils.isEmpty(newCard.getTrackingLink())) {
            str = "no tracking link in nativeAdCard";
        } else if (newCard.getImage() == null) {
            str = "no image in nativeAdCard";
        } else {
            newCard.setId(jSONObject.optString("cardID", newCard.getId()));
            return newCard;
        }
        mo49577a("Required field", str);
        return null;
    }

    /* renamed from: c */
    public C7479j2 mo49580c(JSONObject jSONObject, C7435h2 h2Var) {
        String optString = jSONObject.optString("type");
        if (!TJAdUnitConstants.String.HTML.equals(optString)) {
            C7374e0.m18989a("NativeAdContent banner has type " + optString);
            return null;
        }
        String c = C7648s3.m20311c(jSONObject);
        if (TextUtils.isEmpty(c)) {
            mo49577a("Required field", "NativeAdContent has no source field");
            return null;
        }
        C7479j2 newContent = C7479j2.newContent(h2Var, c);
        this.f18312d.mo51485a(jSONObject, (C7768z1) newContent);
        return newContent;
    }
}
