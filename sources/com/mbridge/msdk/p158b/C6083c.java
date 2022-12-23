package com.mbridge.msdk.p158b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.p162a.p163a.C6121a;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.same.net.p179h.C6286c;
import com.mbridge.msdk.foundation.same.net.p179h.C6287d;
import com.mbridge.msdk.foundation.same.report.C6308c;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.p158b.p159a.C6075b;
import com.mbridge.msdk.p158b.p160b.C6077a;
import com.mbridge.msdk.p158b.p160b.C6080b;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.b.c */
/* compiled from: SettingRequestController */
public class C6083c {

    /* renamed from: a */
    private static final String f14963a = C6083c.class.getSimpleName();

    /* renamed from: a */
    public final void mo42766a(final Context context, final String str, final String str2) {
        if (context != null) {
            C6075b bVar = new C6075b(context);
            C6287d dVar = new C6287d();
            dVar.mo43870a("app_id", str);
            dVar.mo43870a("sign", SameMD5.getMD5(str + str2));
            bVar.mo43864a(1, C6280d.m15868c().f15573i, dVar, new C6286c() {
                /* renamed from: a */
                public final void mo42768a(String str) {
                    C6308c cVar = new C6308c(context);
                    cVar.mo43924a();
                    cVar.mo43930a(str, C6280d.m15868c().f15567c);
                    C6280d.m15868c().f15577m++;
                    C6083c.this.m15125b(context, str, str2);
                }

                /* renamed from: a */
                public final void mo42769a(JSONObject jSONObject) {
                    if (jSONObject != null) {
                        try {
                            SharedPreferences.Editor edit = C6122a.m15302b().mo42895d().getApplicationContext().getSharedPreferences("cv", 0).edit();
                            edit.clear();
                            edit.commit();
                            jSONObject.put("current_time", System.currentTimeMillis());
                            jSONObject.put("host_setting", C6280d.m15868c().f15567c);
                            C6076b.m15089a().mo42750b(str, jSONObject.toString());
                            C6280d.m15868c().mo43861d();
                            if (!TextUtils.isEmpty(jSONObject.optString("mraid_js"))) {
                                C6077a.m15106a().mo42758a(context, jSONObject.optString("mraid_js"));
                            }
                            if (!TextUtils.isEmpty(jSONObject.optString("web_env_url"))) {
                                C6080b.m15114a().mo42763a(context, jSONObject.optString("web_env_url"));
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                    new C6308c(context).mo43924a();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m15125b(Context context, String str, String str2) {
        if (!C6280d.m15868c().mo43859a()) {
            try {
                if (!C6280d.m15868c().f15578n) {
                    C6280d.m15868c().f15578n = true;
                    if (System.currentTimeMillis() >= C6121a.m15293a().mo42878a("mkey_spare_host_ts").longValue() + 86400000) {
                        String b = C6121a.m15293a().mo42882b("mkey_spare_host");
                        if (!TextUtils.isEmpty(b)) {
                            for (String str3 : b.split("\n")) {
                                if (!TextUtils.isEmpty(str3.trim()) && !C6280d.m15868c().f15579o.contains(str3.trim())) {
                                    C6280d.m15868c().f15579o.add(str3.trim());
                                }
                            }
                            m15125b(context, str, str2);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        } else {
            mo42766a(context, str, str2);
        }
    }

    /* renamed from: a */
    public final void mo42767a(Context context, final String str, String str2, final String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            str = C6122a.m15302b().mo42896e();
            str2 = C6122a.m15302b().mo42897f();
        }
        if (C6076b.m15089a().mo42747a(str3, str) && C6076b.m15089a().mo42746a(str, 2, str3)) {
            C6075b bVar = new C6075b(context);
            C6287d dVar = new C6287d();
            dVar.mo43870a("unit_ids", "[" + str3 + "]");
            dVar.mo43870a("app_id", str);
            dVar.mo43870a("sign", SameMD5.getMD5(str + str2));
            bVar.mo43864a(1, C6280d.m15868c().f15573i, dVar, new C6286c() {
                /* renamed from: a */
                public final void mo42768a(String str) {
                }

                /* renamed from: a */
                public final void mo42769a(JSONObject jSONObject) {
                    if (jSONObject != null) {
                        try {
                            JSONArray optJSONArray = jSONObject.optJSONArray("unitSetting");
                            if (optJSONArray != null && optJSONArray.length() > 0) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(0);
                                optJSONObject.put("current_time", System.currentTimeMillis());
                                C6076b.m15089a().mo42744a(str, str3, optJSONObject.toString());
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
    }
}
