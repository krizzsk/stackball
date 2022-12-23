package com.mbridge.msdk.mbbid.common.p203b;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.same.net.C6269f;
import com.mbridge.msdk.foundation.same.net.C6293k;
import com.mbridge.msdk.foundation.same.net.p172a.C6240a;
import com.mbridge.msdk.foundation.same.net.p174c.C6245b;
import com.mbridge.msdk.foundation.same.net.p178g.C6274a;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbbid.common.b.b */
/* compiled from: BidResponseHandler */
public abstract class C6521b extends C6269f<JSONObject> {

    /* renamed from: a */
    private static final String f16272a = C6521b.class.getSimpleName();

    /* renamed from: a */
    public abstract void mo44368a(int i, String str);

    /* renamed from: a */
    public abstract void mo44369a(BidResponsedEx bidResponsedEx);

    public C6521b(String str, String str2) {
        this.f15543d = str2;
        this.f15544e = str;
    }

    /* renamed from: a */
    public final void mo43799a(C6293k<JSONObject> kVar) {
        super.mo43799a(kVar);
        if (kVar != null && kVar.f15629c != null) {
            List<C6245b> list = kVar.f15629c.f15555d;
            JSONObject jSONObject = (JSONObject) kVar.f15627a;
            int optInt = jSONObject.optInt("status");
            if (200 == optInt) {
                BidResponsedEx parseBidResponsedEx = BidResponsedEx.parseBidResponsedEx(jSONObject.optJSONObject("data"), this.f15543d);
                if (parseBidResponsedEx != null) {
                    mo44369a(parseBidResponsedEx);
                } else {
                    mo44368a(optInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
                }
            } else {
                mo44368a(optInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            }
        }
    }

    /* renamed from: a */
    public final void mo43798a(C6240a aVar) {
        mo44368a(aVar.f15490a, C6274a.m15856a(aVar.f15490a));
    }
}
