package com.yandex.metrica.impl.p265ob;

import android.content.ContentValues;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Ee */
public final class C10222Ee implements C11170e0<C10459Le> {
    public Object invoke(Object obj) {
        ContentValues contentValues = (ContentValues) obj;
        String asString = contentValues.getAsString("tracking_id");
        if (TextUtils.isEmpty(asString)) {
            C10122B2.m26040b("Tracking id is empty", new Object[0]);
            return null;
        }
        try {
            String asString2 = contentValues.getAsString("additional_params");
            if (TextUtils.isEmpty(asString2)) {
                C10122B2.m26040b("No additional params", new Object[0]);
                return null;
            }
            JSONObject jSONObject = new JSONObject(asString2);
            if (jSONObject.length() == 0) {
                C10122B2.m26040b("Additional params are empty", new Object[0]);
                return null;
            }
            C10122B2.m26034a("Successfully parsed preload info. Tracking id = %s, additionalParams = %s", asString, jSONObject);
            return new C10459Le(asString, jSONObject, true, false, C10202E0.RETAIL);
        } catch (Throwable th) {
            C10122B2.m26035a(th, "Could not parse additional parameters", new Object[0]);
            return null;
        }
    }
}
