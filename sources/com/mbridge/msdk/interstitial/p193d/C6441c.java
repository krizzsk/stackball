package com.mbridge.msdk.interstitial.p193d;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C6269f;
import com.mbridge.msdk.foundation.same.net.C6293k;
import com.mbridge.msdk.foundation.same.net.p172a.C6240a;
import com.mbridge.msdk.foundation.same.net.p174c.C6245b;
import com.mbridge.msdk.foundation.same.net.p178g.C6274a;
import com.mbridge.msdk.out.Frame;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.interstitial.d.c */
/* compiled from: InterstitialResponseHandler */
public abstract class C6441c extends C6269f<JSONObject> {

    /* renamed from: a */
    private static final String f16040a = C6441c.class.getSimpleName();

    /* renamed from: b */
    private int f16041b;

    /* renamed from: a */
    public abstract void mo44167a(List<Frame> list);

    /* renamed from: a */
    public abstract void mo44168a(List<C6245b> list, CampaignUnit campaignUnit);

    /* renamed from: b */
    public abstract void mo44169b(int i, String str);

    /* renamed from: a */
    public final void mo43842a() {
        super.mo43842a();
    }

    /* renamed from: a */
    public final void mo43799a(C6293k<JSONObject> kVar) {
        CampaignUnit campaignUnit;
        CampaignUnit campaignUnit2;
        super.mo43799a(kVar);
        if (kVar != null && kVar.f15629c != null) {
            int i = this.f16041b;
            String str = null;
            if (i == 0) {
                List<C6245b> list = kVar.f15629c.f15555d;
                JSONObject jSONObject = (JSONObject) kVar.f15627a;
                int optInt = jSONObject.optInt("status");
                if (1 == optInt) {
                    mo43849a(System.currentTimeMillis());
                    if ("v5".equals(jSONObject.optString("version"))) {
                        campaignUnit2 = CampaignUnit.parseV5CampaignUnit(jSONObject.optJSONObject("data"));
                    } else {
                        campaignUnit2 = CampaignUnit.parseCampaignUnit(jSONObject.optJSONObject("data"));
                    }
                    if (campaignUnit2 == null || campaignUnit2.getAds() == null || campaignUnit2.getAds().size() <= 0) {
                        if (campaignUnit2 != null) {
                            str = campaignUnit2.getMsg();
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                        }
                        mo44169b(optInt, str);
                        return;
                    }
                    mo44168a(list, campaignUnit2);
                    mo43848a(campaignUnit2.getAds().size());
                    return;
                }
                mo44169b(optInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            } else if (i == 1) {
                List<C6245b> list2 = kVar.f15629c.f15555d;
                JSONObject jSONObject2 = (JSONObject) kVar.f15627a;
                int optInt2 = jSONObject2.optInt("status");
                if (1 == optInt2) {
                    mo43849a(System.currentTimeMillis());
                    if ("v5".equals(jSONObject2.optString("version"))) {
                        campaignUnit = CampaignUnit.parseV5CampaignUnit(jSONObject2.optJSONObject("data"));
                    } else {
                        campaignUnit = CampaignUnit.parseCampaignUnit(jSONObject2.optJSONObject("data"));
                    }
                    if (campaignUnit == null || campaignUnit.getListFrames() == null || campaignUnit.getListFrames().size() <= 0) {
                        if (campaignUnit != null) {
                            str = campaignUnit.getMsg();
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = jSONObject2.optString(NotificationCompat.CATEGORY_MESSAGE);
                        }
                        mo44169b(optInt2, str);
                        return;
                    }
                    List<Frame> listFrames = campaignUnit.getListFrames();
                    mo44167a(listFrames);
                    mo43848a(listFrames.size());
                    return;
                }
                mo44169b(optInt2, jSONObject2.optString(NotificationCompat.CATEGORY_MESSAGE));
            }
        }
    }

    /* renamed from: a */
    public final void mo43798a(C6240a aVar) {
        mo44169b(aVar.f15490a, C6274a.m15856a(aVar.f15490a));
    }
}
