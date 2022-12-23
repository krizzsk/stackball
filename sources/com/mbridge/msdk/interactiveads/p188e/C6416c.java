package com.mbridge.msdk.interactiveads.p188e;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C6269f;
import com.mbridge.msdk.foundation.same.net.C6293k;
import com.mbridge.msdk.foundation.same.net.p172a.C6240a;
import com.mbridge.msdk.foundation.same.net.p174c.C6245b;
import com.mbridge.msdk.foundation.same.net.p178g.C6274a;
import com.mbridge.msdk.foundation.tools.C6361q;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.interactiveads.e.c */
/* compiled from: InteractiveResponseHandler */
public abstract class C6416c extends C6269f<JSONObject> {

    /* renamed from: a */
    private static final String f15967a = C6416c.class.getSimpleName();

    /* renamed from: a */
    public abstract void mo44089a(List<C6245b> list, CampaignUnit campaignUnit);

    /* renamed from: b */
    public abstract void mo44090b(int i, String str);

    /* renamed from: a */
    public final void mo43799a(C6293k<JSONObject> kVar) {
        CampaignUnit campaignUnit;
        super.mo43799a(kVar);
        if (kVar != null && kVar.f15629c != null) {
            List<C6245b> list = kVar.f15629c.f15555d;
            JSONObject jSONObject = (JSONObject) kVar.f15627a;
            int optInt = jSONObject.optInt("status");
            if (1 == optInt) {
                mo43849a(System.currentTimeMillis());
                if ("v5".equals(jSONObject.optString("version"))) {
                    campaignUnit = CampaignUnit.parseV5CampaignUnit(jSONObject.optJSONObject("data"));
                } else {
                    campaignUnit = CampaignUnit.parseCampaignUnit(jSONObject.optJSONObject("data"));
                }
                if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                    String str = null;
                    if (campaignUnit != null) {
                        str = campaignUnit.getMsg();
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                    }
                    mo44090b(optInt, str);
                    return;
                }
                mo44089a(list, campaignUnit);
                mo43848a(campaignUnit.getAds().size());
                return;
            }
            mo44090b(optInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
        }
    }

    /* renamed from: a */
    public final void mo43798a(C6240a aVar) {
        String str = f15967a;
        C6361q.m16158d(str, "errorCode = " + aVar.f15490a);
        mo44090b(aVar.f15490a, C6274a.m15856a(aVar.f15490a));
    }
}
