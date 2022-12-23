package com.ironsource.mediationsdk.server;

import com.facebook.appevents.AppEventsConstants;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.p142c.C5688b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.server.b */
public class C5782b {

    /* renamed from: a */
    private String f13880a;

    /* renamed from: b */
    private String f13881b;

    /* renamed from: c */
    private String f13882c;

    /* renamed from: d */
    private List<String> f13883d;

    /* renamed from: e */
    private List<String> f13884e;

    /* renamed from: f */
    private List<String> f13885f;

    /* renamed from: g */
    private boolean f13886g;

    /* renamed from: h */
    private ImpressionData f13887h;

    public C5782b(String str) {
        this.f13880a = str;
        this.f13881b = "";
        this.f13882c = "";
        this.f13883d = new ArrayList();
        this.f13884e = new ArrayList();
        this.f13885f = new ArrayList();
        this.f13886g = true;
        this.f13887h = null;
    }

    public C5782b(JSONObject jSONObject) {
        this(jSONObject, (JSONObject) null);
    }

    public C5782b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f13886g = false;
        try {
            if (jSONObject.has("instance")) {
                this.f13880a = jSONObject.getString("instance");
            }
            this.f13881b = jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : jSONObject.has("serverData") ? jSONObject.getString("serverData") : "";
            this.f13882c = jSONObject.has("price") ? jSONObject.getString("price") : AppEventsConstants.EVENT_PARAM_VALUE_NO;
            this.f13883d = new ArrayList();
            this.f13884e = new ArrayList();
            this.f13885f = new ArrayList();
            if (jSONObject.has("notifications")) {
                JSONObject optJSONObject = jSONObject.optJSONObject("notifications");
                if (optJSONObject.has("burl")) {
                    JSONArray jSONArray = optJSONObject.getJSONArray("burl");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        this.f13883d.add(jSONArray.getString(i));
                    }
                }
                if (optJSONObject.has("lurl")) {
                    JSONArray jSONArray2 = optJSONObject.getJSONArray("lurl");
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        this.f13884e.add(jSONArray2.getString(i2));
                    }
                }
                if (optJSONObject.has("nurl")) {
                    JSONArray jSONArray3 = optJSONObject.getJSONArray("nurl");
                    for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                        this.f13885f.add(jSONArray3.getString(i3));
                    }
                }
            }
            this.f13887h = new ImpressionData(C5688b.m13985a(jSONObject2, jSONObject.has("armData") ? jSONObject.optJSONObject("armData") : null));
            this.f13886g = true;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public ImpressionData mo42081a(String str) {
        ImpressionData impressionData = this.f13887h;
        if (impressionData != null) {
            impressionData.replaceMacroForPlacementWithValue("${PLACEMENT_NAME}", str);
        }
        return this.f13887h;
    }

    /* renamed from: a */
    public String mo42082a() {
        return this.f13880a;
    }

    /* renamed from: b */
    public String mo42083b() {
        return this.f13881b;
    }

    /* renamed from: c */
    public String mo42084c() {
        return this.f13882c;
    }

    /* renamed from: d */
    public List<String> mo42085d() {
        return this.f13883d;
    }

    /* renamed from: e */
    public List<String> mo42086e() {
        return this.f13884e;
    }

    /* renamed from: f */
    public List<String> mo42087f() {
        return this.f13885f;
    }

    /* renamed from: g */
    public boolean mo42088g() {
        return this.f13886g;
    }
}
