package com.mbridge.msdk.reward.p211c;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.C6269f;
import com.mbridge.msdk.foundation.same.net.C6293k;
import com.mbridge.msdk.foundation.same.net.p172a.C6240a;
import com.mbridge.msdk.foundation.same.net.p174c.C6245b;
import com.mbridge.msdk.foundation.same.net.p178g.C6274a;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.out.Frame;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.reward.c.c */
/* compiled from: RewardResponseHandler */
public abstract class C6807c extends C6269f<JSONObject> {

    /* renamed from: a */
    private static final String f16788a = C6807c.class.getSimpleName();

    /* renamed from: b */
    private int f16789b;

    /* renamed from: c */
    private String f16790c;

    /* renamed from: a */
    public abstract void mo47066a(List<Frame> list);

    /* renamed from: a */
    public abstract void mo47067a(List<C6245b> list, CampaignUnit campaignUnit);

    /* renamed from: b */
    public abstract void mo47068b(int i, String str);

    /* renamed from: a */
    public final void mo47069a(String str) {
        this.f16790c = str;
    }

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
            int i = this.f16789b;
            String str = null;
            if (i == 0) {
                List<C6245b> list = kVar.f15629c.f15555d;
                JSONObject jSONObject = (JSONObject) kVar.f15627a;
                int optInt = jSONObject.optInt("status");
                if (1 == optInt) {
                    mo43849a(System.currentTimeMillis());
                    if ("v5".equals(jSONObject.optString("version"))) {
                        campaignUnit2 = CampaignUnit.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.f16790c);
                    } else {
                        campaignUnit2 = CampaignUnit.parseCampaignUnit(jSONObject.optJSONObject("data"), this.f16790c);
                    }
                    if (campaignUnit2 == null || campaignUnit2.getAds() == null || campaignUnit2.getAds().size() <= 0) {
                        if (campaignUnit2 != null) {
                            str = campaignUnit2.getMsg();
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                        }
                        mo47068b(optInt, str);
                        return;
                    }
                    mo47067a(list, campaignUnit2);
                    mo43848a(campaignUnit2.getAds().size());
                    return;
                }
                mo47068b(optInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            } else if (i == 1) {
                List<C6245b> list2 = kVar.f15629c.f15555d;
                JSONObject jSONObject2 = (JSONObject) kVar.f15627a;
                int optInt2 = jSONObject2.optInt("status");
                if (1 == optInt2) {
                    mo43849a(System.currentTimeMillis());
                    if ("v5".equals(jSONObject2.optString("version"))) {
                        campaignUnit = CampaignUnit.parseV5CampaignUnit(jSONObject2.optJSONObject("data"), this.f16790c);
                    } else {
                        campaignUnit = CampaignUnit.parseCampaignUnit(jSONObject2.optJSONObject("data"), this.f16790c);
                    }
                    if (campaignUnit == null || campaignUnit.getListFrames() == null || campaignUnit.getListFrames().size() <= 0) {
                        if (campaignUnit != null) {
                            str = campaignUnit.getMsg();
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = jSONObject2.optString(NotificationCompat.CATEGORY_MESSAGE);
                        }
                        mo47068b(optInt2, str);
                        return;
                    }
                    List<Frame> listFrames = campaignUnit.getListFrames();
                    mo47066a(listFrames);
                    mo43848a(listFrames.size());
                    return;
                }
                mo47068b(optInt2, jSONObject2.optString(NotificationCompat.CATEGORY_MESSAGE));
            }
        }
    }

    /* renamed from: a */
    public final void mo43798a(C6240a aVar) {
        String str = f16788a;
        C6361q.m16158d(str, "errorCode = " + aVar.f15490a);
        mo47068b(aVar.f15490a, C6274a.m15856a(aVar.f15490a));
    }
}
