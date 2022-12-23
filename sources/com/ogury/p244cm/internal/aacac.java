package com.ogury.p244cm.internal;

import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;

/* renamed from: com.ogury.cm.internal.aacac */
public final class aacac {

    /* renamed from: a */
    public static final aacac f20366a = new aacac();

    /* renamed from: b */
    private static final Bundle f20367b = new Bundle();

    private aacac() {
    }

    /* renamed from: a */
    public static Boolean m21777a(String str) {
        bbabc.m22051b(str, SDKConstants.PARAM_KEY);
        bbabc.m22051b(str, "configurationKey");
        if (f20367b.containsKey(str)) {
            return Boolean.valueOf(f20367b.getBoolean(str));
        }
        return null;
    }

    /* renamed from: a */
    public static void m21778a(String str, Boolean bool) {
        bbabc.m22051b(str, SDKConstants.PARAM_KEY);
        if (bool != null) {
            f20367b.putBoolean(str, bool.booleanValue());
            return;
        }
        bbabc.m22051b(str, "configurationKey");
        f20367b.remove(str);
    }
}
