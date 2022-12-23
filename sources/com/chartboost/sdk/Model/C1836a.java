package com.chartboost.sdk.Model;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.gdpr.tcfv2.encoder.BitLength;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.Model.a */
public class C1836a {

    /* renamed from: a */
    public final JSONObject f4421a;

    /* renamed from: b */
    public int f4422b;

    /* renamed from: c */
    public final Map<String, C1837b> f4423c;

    /* renamed from: d */
    public final Map<String, String> f4424d;

    /* renamed from: e */
    public final String f4425e;

    /* renamed from: f */
    public String f4426f;

    /* renamed from: g */
    public String f4427g;

    /* renamed from: h */
    public String f4428h;

    /* renamed from: i */
    public String f4429i;

    /* renamed from: j */
    public final String f4430j;

    /* renamed from: k */
    public final String f4431k;

    /* renamed from: l */
    public final int f4432l;

    /* renamed from: m */
    public final String f4433m;

    /* renamed from: n */
    public final String f4434n;

    /* renamed from: o */
    public final Map<String, List<String>> f4435o;

    /* renamed from: p */
    public final int f4436p;

    /* renamed from: q */
    public String f4437q;

    /* renamed from: r */
    public final String f4438r;

    /* renamed from: s */
    public C1837b f4439s;

    /* renamed from: t */
    public final HashSet<String> f4440t;

    public C1836a() {
        this.f4421a = null;
        this.f4422b = 1;
        this.f4423c = new HashMap();
        this.f4424d = new HashMap();
        this.f4425e = "dummy_template";
        this.f4426f = "";
        this.f4427g = "";
        this.f4428h = "";
        this.f4429i = "";
        this.f4430j = "";
        this.f4431k = "";
        this.f4432l = 0;
        this.f4433m = "";
        this.f4434n = "";
        this.f4435o = new HashMap();
        this.f4436p = 0;
        this.f4437q = "";
        this.f4438r = "";
        this.f4439s = new C1837b("", "", "");
        this.f4440t = new HashSet<>();
    }

    public C1836a(int i, JSONObject jSONObject, boolean z) throws JSONException {
        String str;
        this.f4422b = i;
        this.f4421a = jSONObject;
        this.f4426f = jSONObject.getString("ad_id");
        this.f4427g = jSONObject.getString("cgn");
        this.f4428h = jSONObject.getString(VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE);
        this.f4430j = jSONObject.optString("deep-link");
        this.f4431k = jSONObject.getString("link");
        this.f4434n = jSONObject.getString("to");
        this.f4436p = jSONObject.optInt(TJAdUnitConstants.String.SPLIT_VIEW_ANIMATION);
        this.f4437q = jSONObject.optString("media-type");
        this.f4438r = jSONObject.optString("name");
        this.f4423c = new HashMap();
        this.f4424d = new HashMap();
        this.f4435o = new HashMap();
        this.f4440t = new HashSet<>();
        String str2 = "";
        if (i == 1) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("webview");
            JSONArray jSONArray = jSONObject2.getJSONArray(MessengerShareContentUtility.ELEMENTS);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                str = "body";
                if (i2 >= jSONArray.length()) {
                    break;
                }
                JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                String string = jSONObject3.getString("name");
                String optString = jSONObject3.optString("param");
                String string2 = jSONObject3.getString("type");
                String string3 = jSONObject3.getString("value");
                if ("impression_id".equals(string)) {
                    this.f4429i = string3;
                }
                if (string2.equals("param")) {
                    this.f4424d.put(optString, string3);
                    if (string.equals(CampaignEx.JSON_KEY_REWARD_AMOUNT)) {
                        i3 = Integer.valueOf(string3).intValue();
                    } else if (string.equals("reward_currency")) {
                        str2 = string3;
                    }
                } else {
                    this.f4423c.put((!string2.equals(TJAdUnitConstants.String.HTML) || !optString.isEmpty()) ? optString.isEmpty() ? string : optString : str, new C1837b(string2, string, string3));
                }
                i2++;
            }
            this.f4432l = i3;
            this.f4433m = str2;
            C1837b bVar = this.f4423c.get(str);
            this.f4439s = bVar;
            if (bVar != null) {
                this.f4425e = jSONObject2.getString("template");
                JSONObject optJSONObject = jSONObject.optJSONObject("events");
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        JSONArray jSONArray2 = optJSONObject.getJSONArray(next);
                        ArrayList arrayList = new ArrayList();
                        for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                            arrayList.add(jSONArray2.getString(i4));
                        }
                        this.f4435o.put(next, arrayList);
                    }
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("certification_providers");
                if (optJSONArray != null) {
                    for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                        this.f4440t.add(optJSONArray.getString(i5));
                    }
                    return;
                }
                return;
            }
            throw new RuntimeException("WebView AdUnit does not have a template html body asset");
        }
        if (z) {
            String string4 = jSONObject.getJSONObject("icons").getString("lg");
            this.f4423c.put("lg", new C1837b("inPlayIcons", string4.substring(string4.lastIndexOf("/") + 1), string4));
            this.f4432l = 0;
            this.f4433m = str2;
        } else {
            JSONObject jSONObject4 = jSONObject.getJSONObject("assets");
            Iterator<String> keys2 = jSONObject4.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                JSONObject jSONObject5 = jSONObject4.getJSONObject(next2);
                String str3 = (next2.equals("video-portrait") || next2.equals("video-landscape")) ? "videos" : "images";
                String optString2 = jSONObject5.optString("id", (String) null);
                if (optString2 == null) {
                    optString2 = jSONObject5.getString(BitLength.CHECKSUM) + ".png";
                }
                this.f4423c.put(next2, new C1837b(str3, optString2, jSONObject5.getString("url")));
            }
            this.f4432l = jSONObject.optInt("reward");
            this.f4433m = jSONObject.optString("currency-name");
        }
        this.f4439s = null;
        this.f4425e = str2;
    }
}
