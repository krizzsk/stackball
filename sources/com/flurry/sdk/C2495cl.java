package com.flurry.sdk;

import java.util.Locale;

/* renamed from: com.flurry.sdk.cl */
public class C2495cl {

    /* renamed from: a */
    private static final String f5838a = C2495cl.class.getSimpleName();

    /* renamed from: a */
    public static String m5381a() {
        return String.format(Locale.getDefault(), "Flurry_Android_%d_%d.%d.%d%s%s", new Object[]{Integer.valueOf(m5382b()), Integer.valueOf(((Integer) C2611eg.m5674a().mo17819a("ReleaseMajorVersion")).intValue()), Integer.valueOf(((Integer) C2611eg.m5674a().mo17819a("ReleaseMinorVersion")).intValue()), Integer.valueOf(((Integer) C2611eg.m5674a().mo17819a("ReleasePatchVersion")).intValue()), m5383c().length() > 0 ? "." : "", m5383c()});
    }

    /* renamed from: c */
    private static String m5383c() {
        return (String) C2611eg.m5674a().mo17819a("ReleaseBetaVersion");
    }

    /* renamed from: b */
    public static int m5382b() {
        int intValue = ((Integer) C2611eg.m5674a().mo17819a("AgentVersion")).intValue();
        C2530db.m5474a(4, f5838a, "getAgentVersion() = ".concat(String.valueOf(intValue)));
        return intValue;
    }
}
