package com.ogury.p245ed.internal;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.ge */
public final class C8254ge {
    /* renamed from: a */
    public static final int m23185a(JSONObject jSONObject, String str, int i) {
        C8467mq.m23881b(str, SDKConstants.PARAM_KEY);
        return jSONObject == null ? i : jSONObject.optInt(str, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        r1 = r1.optString(r2, r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m23187a(org.json.JSONObject r1, java.lang.String r2, java.lang.String r3) {
        /*
            java.lang.String r0 = "key"
            com.ogury.p245ed.internal.C8467mq.m23881b(r2, r0)
            java.lang.String r0 = "defaultValue"
            com.ogury.p245ed.internal.C8467mq.m23881b(r3, r0)
            if (r1 != 0) goto L_0x000d
            return r3
        L_0x000d:
            java.lang.String r1 = r1.optString(r2, r3)
            if (r1 != 0) goto L_0x0014
            return r3
        L_0x0014:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p245ed.internal.C8254ge.m23187a(org.json.JSONObject, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static final boolean m23189a(JSONObject jSONObject, String str, boolean z) {
        C8467mq.m23881b(str, SDKConstants.PARAM_KEY);
        return jSONObject == null ? z : jSONObject.optBoolean(str, z);
    }

    /* renamed from: a */
    public static final long m23186a(JSONObject jSONObject, String str, long j) {
        C8467mq.m23881b(str, SDKConstants.PARAM_KEY);
        return jSONObject == null ? j : jSONObject.optLong(str, j);
    }

    /* renamed from: a */
    public static final boolean m23188a(JSONObject jSONObject) {
        C8467mq.m23881b(jSONObject, "<this>");
        return jSONObject.length() == 0;
    }
}
