package com.mbridge.msdk.videocommon.p238c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.p162a.p163a.C6121a;
import com.mbridge.msdk.foundation.same.net.p178g.C6280d;
import com.mbridge.msdk.foundation.same.net.p179h.C6286c;
import com.mbridge.msdk.foundation.same.net.p179h.C6287d;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.videocommon.p239d.C7176a;
import com.mbridge.msdk.videocommon.p239d.C7177b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.c.a */
/* compiled from: RewardSettingController */
public class C7171a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f17891a = C7171a.class.getName();

    /* renamed from: a */
    public final void mo49087a(Context context, final String str, String str2) {
        C7174b bVar = new C7174b(context);
        C6287d dVar = new C6287d();
        dVar.mo43870a("app_id", str);
        dVar.mo43870a("sign", SameMD5.getMD5(str + str2));
        bVar.mo43864a(1, C6280d.m15868c().f15575k, dVar, new C6286c() {
            /* renamed from: a */
            public final void mo42769a(JSONObject jSONObject) {
                if (jSONObject != null) {
                    try {
                        jSONObject.put("current_time", System.currentTimeMillis());
                        C7177b.m18135a();
                        String str = str;
                        String jSONObject2 = jSONObject.toString();
                        C6121a.m15293a().mo42880a("reward_" + str, jSONObject2);
                        C7177b.f17907a = C7176a.m18116a(jSONObject2);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }

            /* renamed from: a */
            public final void mo42768a(String str) {
                C6361q.m16158d(C7171a.f17891a, str);
            }
        });
    }

    /* renamed from: a */
    public final void mo49088a(Context context, final String str, String str2, String str3, final C7175c cVar) {
        C7174b bVar = new C7174b(context);
        C6287d dVar = new C6287d();
        dVar.mo43870a("app_id", str);
        dVar.mo43870a("sign", SameMD5.getMD5(str + str2));
        dVar.mo43870a("unit_ids", "[" + str3 + "]");
        C71732 r5 = new C6286c() {
            /* renamed from: a */
            public final void mo42769a(JSONObject jSONObject) {
                if (jSONObject != null) {
                    try {
                        if (C7177b.m18139b(jSONObject.toString())) {
                            jSONObject.put("current_time", System.currentTimeMillis());
                            C7177b.m18135a().mo49110a(str, this.f15543d, jSONObject.toString());
                            if (cVar != null) {
                                cVar.mo46989a("request success");
                            }
                        } else if (cVar != null) {
                            cVar.mo46990b("data error");
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }

            /* renamed from: a */
            public final void mo42768a(String str) {
                if (!TextUtils.isEmpty(str)) {
                    C7175c cVar = cVar;
                    if (cVar != null) {
                        cVar.mo46990b(str);
                        return;
                    }
                    return;
                }
                C7175c cVar2 = cVar;
                if (cVar2 != null) {
                    cVar2.mo46990b("request error");
                }
            }
        };
        r5.f15543d = str3;
        bVar.mo43864a(1, C6280d.m15868c().f15575k, dVar, r5);
    }
}
