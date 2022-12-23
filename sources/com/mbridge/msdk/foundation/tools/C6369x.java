package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;

/* renamed from: com.mbridge.msdk.foundation.tools.x */
/* compiled from: StringUtils */
public final class C6369x {
    /* renamed from: a */
    public static boolean m16235a(String str) {
        return str == null || TextUtils.isEmpty(str.trim()) || "null".equals(str);
    }

    /* renamed from: b */
    public static boolean m16236b(String str) {
        return str != null && !TextUtils.isEmpty(str.trim()) && !"null".equals(str);
    }
}
