package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.smaato.sdk.video.vast.model.CompanionAds;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.r9 */
public class C14444r9 {

    /* renamed from: a */
    private final Context f39383a;

    /* renamed from: b */
    private final fj0 f39384b;

    public C14444r9(Context context, fj0 fj0) {
        this.f39383a = context.getApplicationContext();
        this.f39384b = fj0;
    }

    /* renamed from: a */
    public C13690k9 mo69704a(JSONObject jSONObject) throws JSONException, xr0 {
        C14570s9 s9Var;
        if (gt0.m36700a(jSONObject, "name", "type", TJAdUnitConstants.String.CLICKABLE, CompanionAds.REQUIRED, "value")) {
            String a = ft0.m36302a(jSONObject, "type");
            String a2 = ft0.m36302a(jSONObject, "name");
            JSONObject optJSONObject = jSONObject.optJSONObject("link");
            ej0 a3 = optJSONObject != null ? this.f39384b.mo67022a(optJSONObject) : null;
            Context context = this.f39383a;
            a2.getClass();
            char c = 65535;
            switch (a2.hashCode()) {
                case -1678958759:
                    if (a2.equals("close_button")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1074675180:
                    if (a2.equals("favicon")) {
                        c = 1;
                        break;
                    }
                    break;
                case -938102371:
                    if (a2.equals(CampaignEx.JSON_KEY_STAR)) {
                        c = 2;
                        break;
                    }
                    break;
                case -807286424:
                    if (a2.equals("review_count")) {
                        c = 3;
                        break;
                    }
                    break;
                case -191501435:
                    if (a2.equals("feedback")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3226745:
                    if (a2.equals(RewardPlus.ICON)) {
                        c = 5;
                        break;
                    }
                    break;
                case 103772132:
                    if (a2.equals("media")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    s9Var = new C14674tf();
                    break;
                case 1:
                case 5:
                    s9Var = new kd0();
                    break;
                case 2:
                case 3:
                    s9Var = new xv0();
                    break;
                case 4:
                    s9Var = new s60(new kd0());
                    break;
                case 6:
                    s9Var = new em0(context);
                    break;
                default:
                    s9Var = new ub1();
                    break;
            }
            return new C13690k9(a2, a, s9Var.mo66845a(jSONObject), a3, jSONObject.getBoolean(TJAdUnitConstants.String.CLICKABLE), jSONObject.getBoolean(CompanionAds.REQUIRED));
        }
        throw new xr0("Native Ad json has not required attributes");
    }
}
