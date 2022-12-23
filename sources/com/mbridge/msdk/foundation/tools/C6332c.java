package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.appsflyer.share.Constants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C6129a;
import com.mbridge.msdk.foundation.same.C6204a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.tools.c */
/* compiled from: DomainDeviceInfo */
public class C6332c {

    /* renamed from: a */
    public String f15701a = C6349m.m16096b();

    /* renamed from: b */
    public String f15702b = C6349m.m16106f();

    /* renamed from: c */
    public String f15703c = "android";

    /* renamed from: d */
    public String f15704d = C6349m.m16113i();

    /* renamed from: e */
    public String f15705e;

    /* renamed from: f */
    public String f15706f;

    /* renamed from: g */
    public String f15707g;

    /* renamed from: h */
    public String f15708h;

    /* renamed from: i */
    public String f15709i;

    /* renamed from: j */
    public String f15710j;

    /* renamed from: k */
    public String f15711k;

    /* renamed from: l */
    public String f15712l;

    /* renamed from: m */
    public String f15713m;

    /* renamed from: n */
    public String f15714n;

    /* renamed from: o */
    public String f15715o;

    public C6332c(Context context) {
        int n = C6349m.m16123n(context);
        this.f15705e = String.valueOf(n);
        this.f15706f = C6349m.m16092a(context, n);
        this.f15707g = C6349m.m16121m(context);
        this.f15708h = C6122a.m15302b().mo42897f();
        this.f15709i = C6122a.m15302b().mo42896e();
        this.f15710j = String.valueOf(C6366u.m16224h(context));
        this.f15711k = String.valueOf(C6366u.m16222g(context));
        this.f15715o = String.valueOf(C6366u.m16215d(context));
        if (context.getResources().getConfiguration().orientation == 2) {
            this.f15712l = "landscape";
        } else {
            this.f15712l = "portrait";
        }
        this.f15713m = C6204a.f15401k;
        this.f15714n = C6204a.f15402l;
    }

    /* renamed from: a */
    public JSONObject mo43936a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                jSONObject.put("device", this.f15701a);
                jSONObject.put("system_version", this.f15702b);
                jSONObject.put("network_type", this.f15705e);
                jSONObject.put("network_type_str", this.f15706f);
                jSONObject.put("device_ua", this.f15707g);
            }
            jSONObject.put("plantform", this.f15703c);
            if (C6129a.m15330a().mo42922a(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                jSONObject.put("google_ad_id", this.f15704d);
            }
            jSONObject.put("appkey", this.f15708h);
            jSONObject.put("appId", this.f15709i);
            jSONObject.put("screen_width", this.f15710j);
            jSONObject.put("screen_height", this.f15711k);
            jSONObject.put("orientation", this.f15712l);
            jSONObject.put("scale", this.f15715o);
            jSONObject.put("b", this.f15713m);
            jSONObject.put(Constants.URL_CAMPAIGN, this.f15714n);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
