package com.mbridge.msdk.foundation.same.net.p179h;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.same.net.C6269f;
import com.mbridge.msdk.foundation.same.net.C6293k;
import com.mbridge.msdk.foundation.same.net.p172a.C6240a;
import com.mbridge.msdk.foundation.same.net.p178g.C6274a;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.net.h.c */
/* compiled from: CommonMBListener */
public abstract class C6286c extends C6269f<JSONObject> {
    /* renamed from: a */
    public abstract void mo42768a(String str);

    /* renamed from: a */
    public abstract void mo42769a(JSONObject jSONObject);

    /* renamed from: a */
    public final void mo43799a(C6293k<JSONObject> kVar) {
        if (kVar != null) {
            int optInt = ((JSONObject) kVar.f15627a).optInt("status");
            if (optInt == 1 || optInt == 200) {
                mo42769a(((JSONObject) kVar.f15627a).optJSONObject("data"));
            } else {
                mo42768a(((JSONObject) kVar.f15627a).optString(NotificationCompat.CATEGORY_MESSAGE));
            }
        }
    }

    /* renamed from: a */
    public final void mo43798a(C6240a aVar) {
        mo42768a(C6274a.m15856a(aVar.f15490a));
    }
}
