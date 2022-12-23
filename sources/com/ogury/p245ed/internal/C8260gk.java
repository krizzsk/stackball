package com.ogury.p245ed.internal;

import android.content.SharedPreferences;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;

/* renamed from: com.ogury.ed.internal.gk */
public final class C8260gk {
    /* renamed from: a */
    public static final String m23199a(SharedPreferences sharedPreferences, String str, String str2) {
        C8467mq.m23881b(sharedPreferences, "<this>");
        C8467mq.m23881b(str, SDKConstants.PARAM_KEY);
        C8467mq.m23881b(str2, "defaultValue");
        String string = sharedPreferences.getString(str, str2);
        return string == null ? str2 : string;
    }
}
