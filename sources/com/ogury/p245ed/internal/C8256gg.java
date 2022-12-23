package com.ogury.p245ed.internal;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.gg */
public final class C8256gg {
    /* renamed from: a */
    public static final int m23191a(Map<String, String> map, String str) {
        C8467mq.m23881b(map, "<this>");
        C8467mq.m23881b(str, SDKConstants.PARAM_KEY);
        String str2 = map.get(str);
        if (str2 != null) {
            return Integer.parseInt(str2);
        }
        throw new IllegalStateException(("Key " + str + " not found in map").toString());
    }
}
