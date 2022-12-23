package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import com.p243my.target.common.models.AudioData;
import com.p243my.target.common.models.ShareButtonData;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.CompanionAds;
import com.smaato.sdk.video.vast.model.MediaFile;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.r3 */
public class C7633r3 {

    /* renamed from: a */
    public final C7617q1 f19293a;

    /* renamed from: b */
    public final C7298a f19294b;

    /* renamed from: c */
    public final Context f19295c;

    /* renamed from: d */
    public final C7648s3 f19296d;

    /* renamed from: e */
    public boolean f19297e = true;

    public C7633r3(C7617q1 q1Var, C7298a aVar, Context context) {
        this.f19293a = q1Var;
        this.f19294b = aVar;
        this.f19295c = context;
        this.f19296d = C7648s3.m20309a(q1Var, aVar, context);
    }

    /* renamed from: a */
    public static C7633r3 m20235a(C7617q1 q1Var, C7298a aVar, Context context) {
        return new C7633r3(q1Var, aVar, context);
    }

    /* renamed from: a */
    public final C7302a2 mo51448a(JSONObject jSONObject, String str) {
        C7302a2 newBanner = C7302a2.newBanner();
        this.f19296d.mo51485a(jSONObject, (C7768z1) newBanner);
        if (newBanner.getWidth() == 0 || newBanner.getHeight() == 0) {
            mo51449a("Required field", "Unable to add companion banner with width " + newBanner.getWidth() + " and height " + newBanner.getHeight(), str);
            return null;
        }
        newBanner.setAssetWidth(jSONObject.optInt(Companion.ASSET_WIDTH));
        newBanner.setAssetHeight(jSONObject.optInt(Companion.ASSET_HEIGHT));
        newBanner.setExpandedWidth(jSONObject.optInt(Companion.EXPANDED_WIDTH));
        newBanner.setExpandedHeight(jSONObject.optInt(Companion.EXPANDED_HEIGHT));
        newBanner.setStaticResource(jSONObject.optString("staticResource"));
        newBanner.setIframeResource(jSONObject.optString("iframeResource"));
        newBanner.setHtmlResource(jSONObject.optString("htmlResource"));
        newBanner.setApiFramework(jSONObject.optString("apiFramework"));
        newBanner.setAdSlotID(jSONObject.optString(Companion.AD_SLOT_ID));
        String optString = jSONObject.optString(CompanionAds.REQUIRED);
        if (!TextUtils.isEmpty(optString)) {
            if (TtmlNode.COMBINE_ALL.equals(optString) || "any".equals(optString) || "none".equals(optString)) {
                newBanner.setRequired(optString);
            } else {
                mo51449a("Bad value", "Wrong companion required attribute:" + optString, str);
            }
        }
        return newBanner;
    }

    /* renamed from: a */
    public final void mo51449a(String str, String str2, String str3) {
        if (this.f19297e) {
            String str4 = this.f19293a.f19226a;
            C7498k3 c = C7498k3.m19572a(str).mo50704d(str2).mo50699a(this.f19294b.getSlotId()).mo50703c(str3);
            if (str4 == null) {
                str4 = this.f19293a.f19227b;
            }
            c.mo50701b(str4).mo50702b(this.f19295c);
        }
    }

    /* renamed from: a */
    public final void mo51450a(JSONObject jSONObject, C7413g2<AudioData> g2Var) {
        mo51451b(jSONObject, g2Var);
        Boolean a = this.f19293a.mo51362a();
        g2Var.setAllowClose(a != null ? a.booleanValue() : jSONObject.optBoolean("allowClose", g2Var.isAllowClose()));
        Boolean e = this.f19293a.mo51390e();
        g2Var.setAllowSeek(e != null ? e.booleanValue() : jSONObject.optBoolean("allowSeek", g2Var.isAllowSeek()));
        Boolean f = this.f19293a.mo51392f();
        g2Var.setAllowSkip(f != null ? f.booleanValue() : jSONObject.optBoolean("allowSkip", g2Var.isAllowSkip()));
        Boolean g = this.f19293a.mo51394g();
        g2Var.setAllowTrackChange(g != null ? g.booleanValue() : jSONObject.optBoolean("allowTrackChange", g2Var.isAllowTrackChange()));
        Boolean c = this.f19293a.mo51379c();
        g2Var.setAllowPause(c != null ? c.booleanValue() : jSONObject.optBoolean("hasPause", g2Var.isAllowPause()));
        Boolean d = this.f19293a.mo51386d();
        g2Var.setAllowReplay(d != null ? d.booleanValue() : jSONObject.optBoolean("allowReplay", g2Var.isAllowReplay()));
        float b = this.f19293a.mo51372b();
        if (b < 0.0f) {
            b = (float) jSONObject.optDouble("allowCloseDelay", (double) g2Var.getAllowCloseDelay());
        }
        g2Var.setAllowCloseDelay(b);
    }

    /* renamed from: b */
    public final void mo51451b(JSONObject jSONObject, C7413g2<AudioData> g2Var) {
        float s = this.f19293a.mo51408s();
        if (s < 0.0f && jSONObject.has("point")) {
            s = (float) jSONObject.optDouble("point");
            if (s < 0.0f) {
                mo51449a("Bad value", "Wrong value " + s + " for point", g2Var.getId());
            }
        }
        float t = this.f19293a.mo51409t();
        if (t < 0.0f && jSONObject.has("pointP")) {
            t = (float) jSONObject.optDouble("pointP");
            if (t < 0.0f) {
                mo51449a("Bad value", "Wrong value " + t + " for pointP", g2Var.getId());
            }
        }
        if (s < 0.0f && t < 0.0f) {
            s = -1.0f;
            t = -1.0f;
        }
        g2Var.setPoint(s);
        g2Var.setPointP(t);
    }

    /* renamed from: c */
    public boolean mo51452c(JSONObject jSONObject, C7413g2<AudioData> g2Var) {
        C7302a2 a;
        this.f19296d.mo51485a(jSONObject, (C7768z1) g2Var);
        this.f19297e = g2Var.isLogErrors();
        if (g2Var.getType().equals("statistics")) {
            mo51451b(jSONObject, g2Var);
            return true;
        }
        float optDouble = (float) jSONObject.optDouble("duration", 0.0d);
        if (optDouble <= 0.0f) {
            mo51449a("Required field", "unable to set duration " + optDouble, g2Var.getId());
            return false;
        }
        g2Var.setAutoPlay(jSONObject.optBoolean("autoplay", g2Var.isAutoPlay()));
        g2Var.setHasCtaButton(jSONObject.optBoolean("hasCtaButton", g2Var.isHasCtaButton()));
        g2Var.setAdText(jSONObject.optString("adText", g2Var.getAdText()));
        mo51450a(jSONObject, g2Var);
        JSONArray optJSONArray = jSONObject.optJSONArray("companionAds");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (!(optJSONObject == null || (a = mo51448a(optJSONObject, g2Var.getId())) == null)) {
                    g2Var.addCompanion(a);
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("shareButtons");
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                if (optJSONObject2 != null) {
                    ShareButtonData newData = ShareButtonData.newData();
                    newData.setName(optJSONObject2.optString("name"));
                    newData.setUrl(optJSONObject2.optString("url"));
                    newData.setImageUrl(optJSONObject2.optString("imageUrl"));
                    g2Var.addShareButtonData(newData);
                }
            }
        }
        return mo51453d(jSONObject, g2Var);
    }

    /* renamed from: d */
    public final boolean mo51453d(JSONObject jSONObject, C7413g2<AudioData> g2Var) {
        JSONArray optJSONArray = jSONObject.optJSONArray("mediafiles");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            C7374e0.m18989a("mediafiles array is empty");
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("src");
                if (!TextUtils.isEmpty(optString)) {
                    AudioData newAudioData = AudioData.newAudioData(optString);
                    newAudioData.setBitrate(optJSONObject.optInt(MediaFile.BITRATE));
                    g2Var.setMediaData(newAudioData);
                    return true;
                }
                mo51449a("Bad value", "bad mediafile object, src = " + optString, g2Var.getId());
            }
        }
        return false;
    }
}
