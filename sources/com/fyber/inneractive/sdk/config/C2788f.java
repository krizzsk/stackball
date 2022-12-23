package com.fyber.inneractive.sdk.config;

/* renamed from: com.fyber.inneractive.sdk.config.f */
public final class C2788f {
    static {
        System.setProperty("ia.testEnvironmentConfiguration.removeInClose", "true");
    }

    /* renamed from: a */
    public static String m6073a() {
        return System.getProperty("ia.testEnvironmentConfiguration.name");
    }

    /* renamed from: b */
    public static String m6074b() {
        return System.getProperty("ia.testEnvironmentConfiguration.logger");
    }

    /* renamed from: c */
    public static String m6075c() {
        return System.getProperty("ia.testEnvironmentConfiguration.number");
    }

    /* renamed from: d */
    public static String m6076d() {
        return System.getProperty("ia.testEnvironmentConfiguration.device");
    }

    /* renamed from: e */
    public static String m6077e() {
        return System.getProperty("ia.testEnvironmentConfiguration.response");
    }

    /* renamed from: f */
    public static String m6078f() {
        return System.getProperty("ia.testEnvironmentConfiguration.assetResponse");
    }

    /* renamed from: g */
    public static String m6079g() {
        return System.getProperty("ia.testEnvironmentConfiguration.baseConfigUrl");
    }

    /* renamed from: h */
    public static String m6080h() {
        return System.getProperty("ia.testEnvironmentConfiguration.globalConfigUrl");
    }

    /* renamed from: i */
    public static String m6081i() {
        return System.getProperty("ia.testEnvironmentConfiguration.remoteConfigUrl");
    }

    /* renamed from: j */
    public static Boolean m6082j() {
        return Boolean.valueOf(System.getProperty("ia.testEnvironmentConfiguration.forceConfigRefresh", Boolean.toString(false)));
    }

    /* renamed from: k */
    public static String m6083k() {
        return System.getProperty("ia.testEnvironmentConfiguration.chosenUnitId");
    }
}
