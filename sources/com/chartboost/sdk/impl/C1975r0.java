package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.C1840e;
import com.chartboost.sdk.Model.C1841f;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Networking.C1848a;
import com.chartboost.sdk.Networking.C1853e;
import com.chartboost.sdk.Networking.C1854f;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.r0 */
public class C1975r0 extends C1965p0 {

    /* renamed from: o */
    private static final String f5080o = "r0";

    public C1975r0(Context context, C1840e eVar, C1848a aVar) {
        super(eVar.f4474a, eVar.f4475b, eVar.f4476c, eVar.f4477d, eVar.f4478e);
        this.f5053k = new C1841f(context, eVar.f4476c, aVar).mo14303e();
    }

    /* renamed from: a */
    public C1853e<JSONObject> mo14331a(C1854f fVar) {
        if (fVar.f4575b == null) {
            return C1853e.m4180a(new CBError(CBError.C1835b.INVALID_RESPONSE, "Response is not a valid json object"));
        }
        try {
            return C1853e.m4181a(new JSONObject(new String(fVar.f4575b)));
        } catch (JSONException e) {
            String str = f5080o;
            CBLogging.m3993b(str, "parseServerResponse: " + e.toString());
            return C1853e.m4180a(new CBError(CBError.C1835b.HTTP_NOT_FOUND, "No Bid"));
        }
    }

    /* renamed from: c */
    public void mo14752c() {
    }
}
