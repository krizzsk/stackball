package com.ogury.core.internal.crash;

import android.content.Context;
import com.ogury.core.internal.C7921ai;

/* compiled from: OguryCrashReport.kt */
public final class OguryCrashReport {
    public static final int LOG_LEVEL_CRASH_REPORT = 1;
    public static final int LOG_LEVEL_TWO = 2;

    /* renamed from: a */
    private static final C7957h f20706a = new C7957h();

    /* renamed from: b */
    private static C7956g f20707b;

    /* renamed from: c */
    private static OguryCrashReport f20708c = new OguryCrashReport();

    private OguryCrashReport() {
    }

    public static final synchronized void start(String str, Context context, SdkInfo sdkInfo, CrashConfig crashConfig) {
        synchronized (OguryCrashReport.class) {
            C7921ai.m22144b(str, "sdkKey");
            C7921ai.m22144b(context, "context");
            C7921ai.m22144b(sdkInfo, "sdkInfo");
            C7921ai.m22144b(crashConfig, "crashConfig");
            m22167a(context, sdkInfo);
            C7956g gVar = f20707b;
            if (gVar != null) {
                gVar.mo52943a(str, crashConfig);
            }
        }
    }

    /* renamed from: a */
    private static void m22167a(Context context, SdkInfo sdkInfo) {
        if (f20707b == null) {
            f20707b = C7957h.m22205a(context, sdkInfo);
        }
    }

    public static final void uploadLevelTwoCrashes(String str) {
        C7921ai.m22144b(str, "sdkKey");
        C7956g gVar = f20707b;
        if (gVar != null) {
            gVar.mo52942a(str);
        }
    }

    public static final synchronized void stop(String str, Context context, SdkInfo sdkInfo) {
        synchronized (OguryCrashReport.class) {
            C7921ai.m22144b(str, "sdkKey");
            C7921ai.m22144b(context, "context");
            C7921ai.m22144b(sdkInfo, "sdkInfo");
            m22167a(context, sdkInfo);
            C7956g gVar = f20707b;
            if (gVar != null) {
                gVar.mo52945b(str);
            }
        }
    }

    public static final void logException(String str, Throwable th) {
        C7921ai.m22144b(str, "sdkKey");
        C7921ai.m22144b(th, "throwable");
        C7956g gVar = f20707b;
        if (gVar != null) {
            gVar.mo52946b(str, th);
        }
    }

    public static final void logLevelTwoException(String str, Throwable th) {
        C7921ai.m22144b(str, "sdkKey");
        C7921ai.m22144b(th, "throwable");
        C7956g gVar = f20707b;
        if (gVar != null) {
            gVar.mo52944a(str, th);
        }
    }
}
