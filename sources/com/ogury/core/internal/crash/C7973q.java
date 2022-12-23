package com.ogury.core.internal.crash;

import com.ogury.core.internal.C7921ai;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ogury.core.internal.crash.q */
/* compiled from: UploadCrashesFilter.kt */
public final class C7973q {

    /* renamed from: a */
    public static final C7973q f20765a = new C7973q();

    private C7973q() {
    }

    /* renamed from: a */
    public static JSONArray m22228a(JSONArray jSONArray, int i) {
        C7921ai.m22144b(jSONArray, "crashes");
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            int i3 = jSONObject.getInt("number_of_crashes");
            int i4 = jSONObject.getInt("number_of_crashes_on_last_upload");
            if ((i4 == 0) || i3 - i4 >= i) {
                jSONArray2.put(jSONObject);
            }
        }
        return jSONArray2;
    }
}
