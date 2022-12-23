package com.mbridge.msdk.video.dynview.p222e.p223a;

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

/* renamed from: com.mbridge.msdk.video.dynview.e.a.a */
/* compiled from: AbsMoreOfferResponseHandler */
public abstract class C6937a extends C6269f<JSONObject> {

    /* renamed from: a */
    private int f17095a;

    /* renamed from: b */
    private String f17096b;

    /* renamed from: a */
    public abstract void mo48445a(int i, String str);

    /* renamed from: a */
    public abstract void mo48446a(List<C6245b> list, CampaignUnit campaignUnit);

    /* renamed from: a */
    public final void mo43842a() {
        super.mo43842a();
    }

    /* renamed from: a */
    public final void mo43799a(C6293k<JSONObject> kVar) {
        CampaignUnit campaignUnit;
        super.mo43799a(kVar);
        if (kVar != null && kVar.f15629c != null && this.f17095a == 0) {
            List<C6245b> list = kVar.f15629c.f15555d;
            JSONObject jSONObject = (JSONObject) kVar.f15627a;
            int optInt = jSONObject.optInt("status");
            if (1 == optInt) {
                mo43849a(System.currentTimeMillis());
                if ("v5".equals(jSONObject.optString("version"))) {
                    campaignUnit = CampaignUnit.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.f17096b);
                } else {
                    campaignUnit = CampaignUnit.parseCampaignUnit(jSONObject.optJSONObject("data"), this.f17096b);
                }
                if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                    String str = null;
                    if (campaignUnit != null) {
                        str = campaignUnit.getMsg();
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                    }
                    mo48445a(optInt, str);
                    return;
                }
                mo48446a(list, campaignUnit);
                mo43848a(campaignUnit.getAds().size());
                return;
            }
            mo48445a(optInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
        }
    }

    /* renamed from: a */
    public final void mo43798a(C6240a aVar) {
        mo48445a(aVar.f15490a, C6274a.m15856a(aVar.f15490a));
    }
}
