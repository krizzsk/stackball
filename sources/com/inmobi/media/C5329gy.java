package com.inmobi.media;

import android.content.Context;

/* renamed from: com.inmobi.media.gy */
/* compiled from: PermissionUtils */
public class C5329gy {

    /* renamed from: a */
    private static final String f12213a = C5329gy.class.getSimpleName();

    /* renamed from: a */
    public static boolean m12278a(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Exception unused) {
        }
    }
}
