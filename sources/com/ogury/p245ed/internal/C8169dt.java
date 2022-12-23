package com.ogury.p245ed.internal;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.dt */
public final class C8169dt {
    /* renamed from: a */
    public static boolean m22762a(JSONObject jSONObject) {
        C8467mq.m23881b(jSONObject, "requestBody");
        return m22761a() && C8254ge.m23188a(jSONObject);
    }

    /* renamed from: a */
    private static boolean m22761a() {
        if (Build.VERSION.SDK_INT >= 23) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        return true;
    }
}
