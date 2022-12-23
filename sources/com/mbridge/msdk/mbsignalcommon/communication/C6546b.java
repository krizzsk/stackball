package com.mbridge.msdk.mbsignalcommon.communication;

import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.C6196f;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6152j;
import com.mbridge.msdk.foundation.same.C6204a;
import com.mbridge.msdk.foundation.same.p166a.C6208d;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6366u;
import com.mbridge.msdk.mbsignalcommon.windvane.C6563g;
import com.p243my.tracker.ads.AdFormat;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbsignalcommon.communication.b */
/* compiled from: CommonSignalCommunicatioImpUtils */
public class C6546b {

    /* renamed from: a */
    public static final String f16318a = C6546b.class.getSimpleName();

    /* renamed from: b */
    public static int f16319b = 0;

    /* renamed from: c */
    public static int f16320c = 1;

    /* renamed from: a */
    public static void m16831a(Object obj, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                m16830a(obj, "data is empty");
                return;
            }
            final CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject);
            if (parseCampaignWithBackData == null) {
                m16830a(obj, "data camapign is empty");
                return;
            }
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        C6152j a = C6152j.m15441a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d()));
                        if (a != null) {
                            if (!a.mo43013a(CampaignEx.this.getId())) {
                                C6196f fVar = new C6196f();
                                fVar.mo43631a(CampaignEx.this.getId());
                                fVar.mo43629a(CampaignEx.this.getFca());
                                fVar.mo43633b(CampaignEx.this.getFcb());
                                fVar.mo43637d(0);
                                fVar.mo43635c(1);
                                fVar.mo43630a(System.currentTimeMillis());
                                a.mo43012a(fVar);
                            } else {
                                a.mo43016b(CampaignEx.this.getId());
                            }
                        }
                        C6546b.m16832a(CampaignEx.this.getCampaignUnitId(), CampaignEx.this);
                    } catch (Throwable th) {
                        C6361q.m16155a(C6546b.f16318a, th.getMessage(), th);
                    }
                }
            }).start();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f16319b);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("id", "");
            jSONObject2.put("data", jSONObject3);
            C6563g.m16891a().mo44523a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e) {
            m16830a(obj, e.getMessage());
            C6361q.m16154a(f16318a, e.getMessage());
        } catch (Throwable th) {
            m16830a(obj, th.getMessage());
        }
    }

    /* renamed from: a */
    public static String m16828a(float f, float f2) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C6204a.f15395e, C6366u.m16186a(C6122a.m15302b().mo42895d(), f));
            jSONObject2.put(C6204a.f15396f, C6366u.m16186a(C6122a.m15302b().mo42895d(), f2));
            jSONObject2.put(C6204a.f15398h, 0);
            jSONObject2.put(C6204a.f15399i, C6122a.m15302b().mo42895d().getResources().getConfiguration().orientation);
            jSONObject2.put(C6204a.f15400j, (double) C6366u.m16215d(C6122a.m15302b().mo42895d()));
            jSONObject.put(C6204a.f15397g, jSONObject2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static String m16829a(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                return Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            return "";
        } catch (Throwable unused) {
            C6361q.m16158d(f16318a, "code to string is error");
            return "";
        }
    }

    /* renamed from: a */
    public static void m16830a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f16320c);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            C6563g.m16891a().mo44523a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            C6361q.m16154a(f16318a, e.getMessage());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m16832a(String str, CampaignEx campaignEx) {
        if (C6208d.f15424g != null && !TextUtils.isEmpty(campaignEx.getId())) {
            C6208d.m15706b(str, campaignEx, AdFormat.BANNER);
        }
    }
}
