package com.p243my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import java.util.UUID;

/* renamed from: com.my.tracker.obfuscated.w0 */
public final class C7882w0 {

    /* renamed from: a */
    private static volatile String f20199a;

    /* renamed from: a */
    public static String m21600a(Context context) {
        String str = f20199a;
        if (str == null) {
            synchronized (C7882w0.class) {
                str = f20199a;
                if (str == null) {
                    str = C7823k0.m21211a(context).mo52323i();
                    if (TextUtils.isEmpty(str)) {
                        str = UUID.randomUUID().toString();
                        C7823k0.m21211a(context).mo52328k(str);
                        f20199a = str;
                    }
                }
            }
        }
        return str;
    }
}
