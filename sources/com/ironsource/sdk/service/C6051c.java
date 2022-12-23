package com.ironsource.sdk.service;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.ironsource.environment.C5527g;
import com.ironsource.mediationsdk.C5710l;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.c */
public final class C6051c {

    /* renamed from: a */
    private C5710l f14823a = new C5710l();

    /* renamed from: a */
    public final void mo42595a() {
        HashMap hashMap = new HashMap();
        hashMap.put("omv", Omid.getVersion());
        hashMap.put("ompv", "7");
        C5710l.m14090a((Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public final void mo42596a(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (Build.VERSION.SDK_INT >= 19) {
                C5710l.m14087a("imm", (Object) Boolean.valueOf(C5527g.m13135a(activity)));
            }
        }
    }

    /* renamed from: b */
    public final void mo42597b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (!TextUtils.isEmpty(controllerConfig)) {
            try {
                C5710l.m14087a("cncdn", new JSONObject(controllerConfig).opt("chinaCDN"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final void mo42598b(Context context) {
        C5710l.m14087a("gpi", (Object) Boolean.valueOf(C6052d.m14932a(context)));
    }

    /* renamed from: c */
    public final void mo42599c() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            C5710l.m14089a("debug", jSONObject);
        }
    }
}
