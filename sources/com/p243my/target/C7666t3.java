package com.p243my.target;

import android.content.Context;
import android.text.TextUtils;
import com.p243my.target.common.models.ImageData;
import com.p243my.target.common.models.VideoData;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.t3 */
public class C7666t3 {

    /* renamed from: a */
    public final C7617q1 f19356a;

    /* renamed from: b */
    public final C7298a f19357b;

    /* renamed from: c */
    public final Context f19358c;

    /* renamed from: d */
    public final C7648s3 f19359d;

    /* renamed from: e */
    public String f19360e;

    /* renamed from: f */
    public boolean f19361f = true;

    public C7666t3(C7617q1 q1Var, C7298a aVar, Context context) {
        this.f19356a = q1Var;
        this.f19357b = aVar;
        this.f19358c = context;
        this.f19359d = C7648s3.m20309a(q1Var, aVar, context);
    }

    /* renamed from: a */
    public static C7666t3 m20436a(C7617q1 q1Var, C7298a aVar, Context context) {
        return new C7666t3(q1Var, aVar, context);
    }

    /* renamed from: a */
    public final VideoData mo51572a(JSONObject jSONObject) {
        String optString = jSONObject.optString("src");
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        if (TextUtils.isEmpty(optString) || optInt <= 0 || optInt2 <= 0) {
            mo51573a("Bad value", "bad mediafile object, src = " + optString + ", width = " + optInt + ", height = " + optInt2);
            return null;
        }
        VideoData newVideoData = VideoData.newVideoData(optString, optInt, optInt2);
        newVideoData.setBitrate(jSONObject.optInt(MediaFile.BITRATE));
        if (!newVideoData.getUrl().endsWith(VideoData.M3U8) || C7566n8.m19954b()) {
            return newVideoData;
        }
        C7374e0.m18989a("HLS Video does not supported, add com.google.android.exoplayer:exoplayer-hls dependency to play HLS video ");
        return null;
    }

    /* renamed from: a */
    public final void mo51573a(String str, String str2) {
        if (this.f19361f) {
            String str3 = this.f19356a.f19226a;
            C7498k3 c = C7498k3.m19572a(str).mo50704d(str2).mo50699a(this.f19357b.getSlotId()).mo50703c(this.f19360e);
            if (str3 == null) {
                str3 = this.f19356a.f19227b;
            }
            c.mo50701b(str3).mo50702b(this.f19358c);
        }
    }

    /* renamed from: a */
    public final void mo51574a(JSONObject jSONObject, C7413g2<VideoData> g2Var) {
        mo51575b(jSONObject, g2Var);
        Boolean a = this.f19356a.mo51362a();
        g2Var.setAllowClose(a != null ? a.booleanValue() : jSONObject.optBoolean("allowClose", g2Var.isAllowClose()));
        Boolean c = this.f19356a.mo51379c();
        g2Var.setAllowPause(c != null ? c.booleanValue() : jSONObject.optBoolean("hasPause", g2Var.isAllowPause()));
        Boolean d = this.f19356a.mo51386d();
        g2Var.setAllowReplay(d != null ? d.booleanValue() : jSONObject.optBoolean("allowReplay", g2Var.isAllowReplay()));
        float b = this.f19356a.mo51372b();
        if (b < 0.0f) {
            b = (float) jSONObject.optDouble("allowCloseDelay", (double) g2Var.getAllowCloseDelay());
        }
        g2Var.setAllowCloseDelay(b);
    }

    /* renamed from: b */
    public final void mo51575b(JSONObject jSONObject, C7413g2<VideoData> g2Var) {
        float s = this.f19356a.mo51408s();
        if (s < 0.0f && jSONObject.has("point")) {
            s = (float) jSONObject.optDouble("point");
            if (s < 0.0f) {
                mo51573a("Bad value", "Wrong value " + s + " for point");
            }
        }
        float t = this.f19356a.mo51409t();
        if (t < 0.0f && jSONObject.has("pointP")) {
            t = (float) jSONObject.optDouble("pointP");
            if (t < 0.0f) {
                mo51573a("Bad value", "Wrong value " + t + " for pointP");
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
    public boolean mo51576c(JSONObject jSONObject, C7413g2<VideoData> g2Var) {
        VideoData chooseBest;
        VideoData a;
        this.f19359d.mo51485a(jSONObject, (C7768z1) g2Var);
        this.f19361f = g2Var.isLogErrors();
        if ("statistics".equals(g2Var.getType())) {
            mo51575b(jSONObject, g2Var);
            return true;
        }
        this.f19360e = g2Var.getId();
        float duration = g2Var.getDuration();
        if (duration <= 0.0f) {
            mo51573a("Bad value", "wrong videoBanner duration " + duration);
            return false;
        }
        g2Var.setCloseActionText(jSONObject.optString("closeActionText", "Close"));
        g2Var.setReplayActionText(jSONObject.optString("replayActionText", g2Var.getReplayActionText()));
        g2Var.setCloseDelayActionText(jSONObject.optString("closeDelayActionText", g2Var.getCloseDelayActionText()));
        g2Var.setAutoMute(jSONObject.optBoolean("automute", g2Var.isAutoMute()));
        g2Var.setShowPlayerControls(jSONObject.optBoolean("showPlayerControls", g2Var.isShowPlayerControls()));
        g2Var.setAutoPlay(jSONObject.optBoolean("autoplay", g2Var.isAutoPlay()));
        g2Var.setHasCtaButton(jSONObject.optBoolean("hasCtaButton", g2Var.isHasCtaButton()));
        mo51574a(jSONObject, g2Var);
        String optString = jSONObject.optString("previewLink");
        if (!TextUtils.isEmpty(optString)) {
            g2Var.setPreview(ImageData.newImageData(optString, jSONObject.optInt("previewWidth"), jSONObject.optInt("previewHeight")));
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("mediafiles");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            C7374e0.m18989a("mediafiles array is empty");
            mo51573a("Required field", "unable to find mediaFiles in MediaBanner");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (!(optJSONObject == null || (a = mo51572a(optJSONObject)) == null)) {
                arrayList.add(a);
            }
        }
        if (arrayList.size() <= 0 || (chooseBest = VideoData.chooseBest(arrayList, this.f19357b.getVideoQuality())) == null) {
            return false;
        }
        g2Var.setMediaData(chooseBest);
        return true;
    }
}
