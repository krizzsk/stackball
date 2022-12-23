package com.p243my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.my.tracker.obfuscated.s0 */
public final class C7871s0 {
    /* renamed from: a */
    public static <T> T m21529a(Context context, String str, Class<T> cls) {
        try {
            return cls.cast(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(str));
        } catch (Throwable th) {
            C7877u0.m21548a("SystemUtils: exception when access to application info with key - " + str, th);
            return null;
        }
    }

    /* renamed from: a */
    public static String m21530a(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{str});
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            C7877u0.m21547a("SystemUtils: value in system properties is null for " + str);
            return null;
        } catch (Throwable th) {
            C7877u0.m21548a("SystemUtils: error occurred when getting value for property - " + str, th);
        }
    }
}
