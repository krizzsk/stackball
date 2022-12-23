package com.mbridge.msdk.mbbanner.common.p201f;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C6269f;
import com.mbridge.msdk.foundation.same.net.C6293k;
import com.mbridge.msdk.foundation.same.net.p172a.C6240a;
import com.mbridge.msdk.foundation.same.net.p174c.C6245b;
import com.mbridge.msdk.foundation.same.net.p178g.C6274a;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbbanner.common.f.a */
/* compiled from: BannerResponseHandler */
public abstract class C6504a extends C6269f<JSONObject> {

    /* renamed from: a */
    private static final String f16232a = C6504a.class.getSimpleName();

    /* renamed from: b */
    private String f16233b = "";

    /* renamed from: a */
    public abstract void mo44326a(int i, String str);

    /* renamed from: a */
    public abstract void mo44327a(CampaignUnit campaignUnit);

    /* renamed from: a */
    public final void mo44344a(String str) {
        this.f16233b = str;
    }

    /* renamed from: a */
    public final void mo43799a(C6293k<JSONObject> kVar) {
        CampaignUnit campaignUnit;
        super.mo43799a(kVar);
        List<C6245b> list = kVar.f15629c.f15555d;
        JSONObject jSONObject = (JSONObject) kVar.f15627a;
        int optInt = jSONObject.optInt("status");
        if (1 == optInt) {
            mo43849a(System.currentTimeMillis());
            if ("v5".equals(jSONObject.optString("version"))) {
                campaignUnit = CampaignUnit.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.f16233b);
            } else {
                campaignUnit = CampaignUnit.parseCampaignUnit(jSONObject.optJSONObject("data"), this.f16233b);
            }
            if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                String str = null;
                if (campaignUnit != null) {
                    str = campaignUnit.getMsg();
                }
                if (TextUtils.isEmpty(str)) {
                    str = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                mo44326a(optInt, str);
                return;
            }
            mo44327a(campaignUnit);
            if (!TextUtils.isEmpty(this.f16233b)) {
                mo43850b(1);
            }
            mo43848a(campaignUnit.getAds().size());
            return;
        }
        mo44326a(optInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }

    /* renamed from: a */
    public final void mo43798a(C6240a aVar) {
        mo44326a(aVar.f15490a, C6274a.m15856a(aVar.f15490a));
    }
}
