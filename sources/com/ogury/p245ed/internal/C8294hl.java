package com.ogury.p245ed.internal;

import java.util.Locale;

/* renamed from: com.ogury.ed.internal.hl */
public final class C8294hl {
    /* renamed from: a */
    public static final boolean m23327a(String str) {
        C8467mq.m23881b(str, "<this>");
        Locale locale = Locale.US;
        C8467mq.m23878a((Object) locale, "US");
        String lowerCase = str.toLowerCase(locale);
        C8467mq.m23878a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return C8516oc.m23952b(lowerCase, "http://ogymraid") || C8516oc.m23952b(lowerCase, "https://ogymraid");
    }

    /* renamed from: b */
    public static final String m23328b(String str) {
        C8467mq.m23881b(str, "<this>");
        Locale locale = Locale.US;
        C8467mq.m23878a((Object) locale, "US");
        String lowerCase = str.toLowerCase(locale);
        C8467mq.m23878a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        String str2 = "http://ogymraid";
        if (!C8516oc.m23952b(lowerCase, str2)) {
            str2 = "https://ogymraid";
        }
        String substring = str.substring(C8467mq.m23873a(str2, (Object) "/?q=").length());
        C8467mq.m23878a((Object) substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }
}
