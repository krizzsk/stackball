package com.ogury.p245ed.internal;

import java.util.Arrays;

/* renamed from: com.ogury.ed.internal.ea */
public final class C8184ea {

    /* renamed from: a */
    public static final C8184ea f21172a = new C8184ea();

    /* renamed from: b */
    private static String f21173b = "https://%s-%s.presage.io/%s";

    private C8184ea() {
    }

    /* renamed from: a */
    public static String m22794a() {
        return m22795a("ad_sync", "sy", "v1");
    }

    /* renamed from: b */
    public static String m22797b() {
        return m22795a("pl", "pl", "v2");
    }

    /* renamed from: a */
    public static String m22796a(boolean z) {
        String a = m22795a("p", "pad", "v3");
        return z ? C8516oc.m23951b(a, "https://", "http://") : a;
    }

    /* renamed from: c */
    public static String m22798c() {
        return m22795a("track", "tr", "v1");
    }

    /* renamed from: d */
    public static String m22799d() {
        return m22795a("ad_history", "ah", "v1");
    }

    /* renamed from: a */
    private static String m22795a(String str, String str2, String str3) {
        C8472mv mvVar = C8472mv.f21701a;
        String format = String.format(f21173b + '/' + str, Arrays.copyOf(new Object[]{str2, str3, str3}, 3));
        C8467mq.m23878a((Object) format, "java.lang.String.format(format, *args)");
        return format;
    }
}
