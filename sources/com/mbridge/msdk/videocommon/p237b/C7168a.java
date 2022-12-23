package com.mbridge.msdk.videocommon.p237b;

import com.vungle.warren.model.ReportDBAdapter;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.b.a */
/* compiled from: AdParams */
public final class C7168a {

    /* renamed from: a */
    private String f17884a;

    /* renamed from: b */
    private String f17885b;

    private C7168a(String str, String str2) {
        this.f17884a = str;
        this.f17885b = str2;
    }

    /* renamed from: a */
    public static C7168a m18094a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C7168a(jSONObject.optString("appId"), jSONObject.optString(ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
