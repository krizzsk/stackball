package com.mbridge.msdk.interactiveads.signalcommon;

import android.app.Activity;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C6331b;
import com.mbridge.msdk.p158b.C6076b;
import com.mbridge.msdk.p158b.C6086d;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.interactiveads.signalcommon.a */
/* compiled from: JSCommon */
public final class C6422a {

    /* renamed from: a */
    protected String f15972a;

    /* renamed from: b */
    protected String f15973b;

    /* renamed from: c */
    protected C6086d f15974c = null;

    /* renamed from: d */
    private String f15975d = "JSCommon";

    /* renamed from: e */
    private Activity f15976e;

    /* renamed from: f */
    private List<CampaignEx> f15977f;

    /* renamed from: g */
    private int f15978g;

    /* renamed from: h */
    private int f15979h = 2;

    public C6422a(Activity activity, List<CampaignEx> list) {
        this.f15976e = activity;
        this.f15977f = list;
    }

    /* renamed from: a */
    public final void mo44121a(C6086d dVar) {
        this.f15974c = dVar;
    }

    /* renamed from: a */
    public final void mo44119a(int i) {
        this.f15978g = i;
    }

    /* renamed from: a */
    public final void mo44122a(String str) {
        this.f15973b = str;
    }

    /* renamed from: a */
    public final String mo44118a() {
        return this.f15973b;
    }

    /* renamed from: b */
    public final void mo44125b(String str) {
        this.f15972a = str;
    }

    /* renamed from: b */
    public final String mo44124b() {
        JSONObject jSONObject = new JSONObject();
        C6331b bVar = new C6331b(C6122a.m15302b().mo42895d());
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.f15979h);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", bVar.mo43936a());
            jSONObject.put("campaignList", CampaignEx.parseCamplistToJson(this.f15977f));
            jSONObject.put("unitSetting", mo44128e());
            String c = C6076b.m15089a().mo42752c(C6122a.m15302b().mo42896e());
            if (!TextUtils.isEmpty(c)) {
                jSONObject.put("appSetting", new JSONObject(c));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: c */
    public final List<CampaignEx> mo44126c() {
        return this.f15977f;
    }

    /* renamed from: a */
    public final void mo44123a(List<CampaignEx> list) {
        this.f15977f = list;
    }

    /* renamed from: d */
    public final Activity mo44127d() {
        return this.f15976e;
    }

    /* renamed from: a */
    public final void mo44120a(Activity activity) {
        this.f15976e = activity;
    }

    /* renamed from: e */
    public final JSONObject mo44128e() {
        if (this.f15974c == null) {
            return new JSONObject();
        }
        if (!TextUtils.isEmpty(this.f15972a)) {
            this.f15974c.mo42782h(this.f15972a);
        }
        return this.f15974c.mo42795u();
    }
}
