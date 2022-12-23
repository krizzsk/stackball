package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.C2788f;

/* renamed from: com.fyber.inneractive.sdk.util.al */
public final class C3631al {
    /* renamed from: a */
    public static boolean m9052a(String str) {
        String e = C2788f.m6077e();
        return e != null && e.trim().length() > 0 && str != null && str.toLowerCase().startsWith("fyberInternalTesting".toLowerCase()) && str.contains("crash");
    }
}
