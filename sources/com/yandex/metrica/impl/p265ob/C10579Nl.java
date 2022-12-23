package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Nl */
public class C10579Nl implements C11506ll {
    /* renamed from: a */
    public JSONObject mo61839a(Activity activity, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sid", activity.getClass().getName()).put(BidResponsedEx.KEY_CID, j);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
