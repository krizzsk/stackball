package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Ql */
public class C10680Ql implements C11506ll {
    /* renamed from: a */
    public JSONObject mo61839a(Activity activity, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ssh", new JSONArray().put(new JSONObject().put("si", new JSONObject().put("cn", activity.getClass().getName())).put(BidResponsedEx.KEY_CID, j)));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
