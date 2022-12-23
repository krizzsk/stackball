package com.p243my.target;

import android.content.Context;

/* renamed from: com.my.target.m8 */
public final class C7553m8 {

    /* renamed from: a */
    public static boolean f19046a;

    /* renamed from: a */
    public static void m19858a(Context context) {
        if (!C7374e0.f18489a && !f19046a) {
            try {
                Integer num = (Integer) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("com.my.target.debugMode");
                if (num != null && num.intValue() == 1) {
                    C7374e0.f18489a = true;
                }
            } catch (Throwable unused) {
            }
            f19046a = true;
        }
    }
}
