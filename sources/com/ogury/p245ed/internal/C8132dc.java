package com.ogury.p245ed.internal;

import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;

/* renamed from: com.ogury.ed.internal.dc */
public final class C8132dc {

    /* renamed from: a */
    public static final C8132dc f21070a = new C8132dc();

    /* renamed from: b */
    private static final Bundle f21071b = new Bundle();

    private C8132dc() {
    }

    /* renamed from: a */
    public static void m22655a(String str, Boolean bool) {
        C8467mq.m23881b(str, SDKConstants.PARAM_KEY);
        if (bool != null) {
            f21071b.putBoolean(str, bool.booleanValue());
        } else {
            m22661d(str);
        }
    }

    /* renamed from: a */
    public static void m22656a(String str, String str2) {
        C8467mq.m23881b(str, SDKConstants.PARAM_KEY);
        if (str2 != null) {
            f21071b.putString(str, str2);
        } else {
            m22661d(str);
        }
    }

    /* renamed from: a */
    public static Boolean m22654a(String str) {
        C8467mq.m23881b(str, SDKConstants.PARAM_KEY);
        if (m22660c(str)) {
            return Boolean.valueOf(f21071b.getBoolean(str));
        }
        return null;
    }

    /* renamed from: b */
    public static String m22658b(String str) {
        C8467mq.m23881b(str, SDKConstants.PARAM_KEY);
        return f21071b.getString(str, (String) null);
    }

    /* renamed from: b */
    public static String m22659b(String str, String str2) {
        C8467mq.m23881b(str, SDKConstants.PARAM_KEY);
        C8467mq.m23881b(str2, "defaultValue");
        String string = f21071b.getString(str, str2);
        C8467mq.m23878a((Object) string, "extraAdConfigurations.getString(key, defaultValue)");
        return string;
    }

    /* renamed from: c */
    private static boolean m22660c(String str) {
        C8467mq.m23881b(str, "configurationKey");
        return f21071b.containsKey(str);
    }

    /* renamed from: d */
    private static void m22661d(String str) {
        C8467mq.m23881b(str, "configurationKey");
        f21071b.remove(str);
    }

    /* renamed from: a */
    public static boolean m22657a() {
        return C8467mq.m23880a((Object) m22654a("IS_CHILD_UNDER_COPPA"), (Object) Boolean.TRUE) || C8467mq.m23880a((Object) m22654a("IS_UNDER_AGE_OF_GDPR_CONSENT"), (Object) Boolean.TRUE);
    }
}
