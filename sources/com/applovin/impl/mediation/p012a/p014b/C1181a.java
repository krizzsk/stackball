package com.applovin.impl.mediation.p012a.p014b;

import android.os.Build;
import com.applovin.impl.mediation.p022d.C1254b;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1473k;
import com.applovin.impl.sdk.network.C1484a;
import com.applovin.impl.sdk.network.C1488b;
import com.applovin.impl.sdk.p025b.C1368b;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.p027d.C1449y;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.appsflyer.ServerParameters;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.b.a */
public class C1181a extends C1392a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1484a.C1487c<JSONObject> f2244a;

    public C1181a(C1484a.C1487c<JSONObject> cVar, C1469j jVar) {
        super("TaskFetchMediationDebuggerInfo", jVar, true);
        this.f2244a = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo12192a() {
        HashMap hashMap = new HashMap();
        hashMap.put(ServerParameters.SDK_DATA_SDK_VERSION, AppLovinSdk.VERSION);
        hashMap.put("build", String.valueOf(131));
        if (!((Boolean) this.f3279b.mo13088a(C1369c.f3081eO)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3279b.mo13136t());
        }
        C1473k.C1476b c = this.f3279b.mo13074N().mo13151c();
        hashMap.put(CampaignEx.JSON_KEY_PACKAGE_NAME, C1553o.m3557e(c.f3531c));
        hashMap.put(TapjoyConstants.TJC_APP_VERSION_NAME, C1553o.m3557e(c.f3530b));
        hashMap.put("platform", "android");
        hashMap.put("os", C1553o.m3557e(Build.VERSION.RELEASE));
        return hashMap;
    }

    public void run() {
        C11821 r1 = new C1449y<JSONObject>(C1488b.m3193a(this.f3279b).mo13200a(C1254b.m2217c(this.f3279b)).mo13210c(C1254b.m2218d(this.f3279b)).mo13201a(mo12192a()).mo13206b("GET").mo13199a(new JSONObject()).mo13205b(((Long) this.f3279b.mo13088a(C1368b.f2828g)).intValue()).mo13204a(), this.f3279b, mo12952g()) {
            /* renamed from: a */
            public void mo12144a(int i) {
                C1181a.this.f2244a.mo12144a(i);
            }

            /* renamed from: a */
            public void mo12145a(JSONObject jSONObject, int i) {
                C1181a.this.f2244a.mo12145a(jSONObject, i);
            }
        };
        r1.mo13035a(C1368b.f2824c);
        r1.mo13037b(C1368b.f2825d);
        this.f3279b.mo13071K().mo13013a((C1392a) r1);
    }
}
