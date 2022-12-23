package com.flurry.sdk;

import android.content.Context;
import com.flurry.sdk.C2612eh;
import java.lang.Thread;
import java.util.Map;

/* renamed from: com.flurry.sdk.ev */
public class C2631ev implements C2534df, C2612eh.C2613a, Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private static final String f6186a = C2631ev.class.getSimpleName();

    /* renamed from: b */
    private boolean f6187b;

    public void init(Context context) {
        C2611eg a = C2611eg.m5674a();
        this.f6187b = ((Boolean) a.mo17819a("CaptureUncaughtExceptions")).booleanValue();
        a.mo17820a("CaptureUncaughtExceptions", (C2612eh.C2613a) this);
        String str = f6186a;
        C2530db.m5474a(4, str, "initSettings, CrashReportingEnabled = " + this.f6187b);
        C2632ew a2 = C2632ew.m5731a();
        synchronized (a2.f6190b) {
            a2.f6190b.put(this, (Object) null);
        }
    }

    public void destroy() {
        C2632ew.m5732b();
        C2611eg.m5674a().mo17822b("CaptureUncaughtExceptions", this);
    }

    /* renamed from: a */
    public final void mo17569a(String str, Object obj) {
        if (str.equals("CaptureUncaughtExceptions")) {
            this.f6187b = ((Boolean) obj).booleanValue();
            String str2 = f6186a;
            C2530db.m5474a(4, str2, "onSettingUpdate, CrashReportingEnabled = " + this.f6187b);
            return;
        }
        C2530db.m5474a(6, f6186a, "onSettingUpdate internal error!");
    }

    public void uncaughtException(Thread thread, Throwable th) {
        String str;
        th.printStackTrace();
        if (this.f6187b) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace == null || stackTrace.length <= 0) {
                str = th.getMessage() != null ? th.getMessage() : "";
            } else {
                StringBuilder sb = new StringBuilder();
                if (th.getMessage() != null) {
                    sb.append(" (");
                    sb.append(th.getMessage());
                    sb.append(")\n");
                }
                str = sb.toString();
            }
            C2669x.m5819a().mo17879a("uncaught", str, th, (Map<String, String>) null);
        }
        C2599ed.m5642a().mo17808c();
        C2464bw.m5304a().mo17655f();
    }
}
