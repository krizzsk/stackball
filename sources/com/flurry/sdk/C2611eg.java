package com.flurry.sdk;

import android.location.Criteria;
import android.location.Location;
import com.google.common.net.HttpHeaders;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.flurry.sdk.eg */
public final class C2611eg extends C2612eh {

    /* renamed from: a */
    public static final Integer f6121a = 282;

    /* renamed from: b */
    public static final Integer f6122b = 11;

    /* renamed from: c */
    public static final Integer f6123c = 5;

    /* renamed from: d */
    public static final Integer f6124d = 0;

    /* renamed from: e */
    public static final String f6125e = null;

    /* renamed from: f */
    public static final Boolean f6126f = Boolean.TRUE;

    /* renamed from: g */
    public static final Boolean f6127g = Boolean.TRUE;

    /* renamed from: h */
    public static final String f6128h = null;

    /* renamed from: i */
    public static final Boolean f6129i = Boolean.TRUE;

    /* renamed from: j */
    public static final Criteria f6130j = null;

    /* renamed from: k */
    public static final Location f6131k = null;

    /* renamed from: l */
    public static final Long f6132l = Long.valueOf(TapjoyConstants.TIMER_INCREMENT);

    /* renamed from: m */
    public static final Boolean f6133m = Boolean.TRUE;

    /* renamed from: n */
    public static final Long f6134n = null;

    /* renamed from: o */
    public static final Byte f6135o = (byte) -1;

    /* renamed from: p */
    public static final Boolean f6136p = Boolean.FALSE;

    /* renamed from: q */
    public static final String f6137q = null;

    /* renamed from: r */
    public static final Boolean f6138r = Boolean.TRUE;

    /* renamed from: s */
    public static final Boolean f6139s = Boolean.TRUE;

    /* renamed from: t */
    private static C2611eg f6140t;

    private C2611eg() {
        mo17821a("AgentVersion", (Object) f6121a);
        mo17821a("ReleaseMajorVersion", (Object) f6122b);
        mo17821a("ReleaseMinorVersion", (Object) f6123c);
        mo17821a("ReleasePatchVersion", (Object) f6124d);
        mo17821a("ReleaseBetaVersion", (Object) "");
        mo17821a("VersionName", (Object) f6125e);
        mo17821a("CaptureUncaughtExceptions", (Object) f6126f);
        mo17821a("UseHttps", (Object) f6127g);
        mo17821a("ReportUrl", (Object) f6128h);
        mo17821a("ReportLocation", (Object) f6129i);
        mo17821a("ExplicitLocation", (Object) f6131k);
        mo17821a("ContinueSessionMillis", (Object) f6132l);
        mo17821a("LogEvents", (Object) f6133m);
        mo17821a(HttpHeaders.AGE, (Object) f6134n);
        mo17821a("Gender", (Object) f6135o);
        mo17821a("UserId", (Object) "");
        mo17821a("ProtonEnabled", (Object) f6136p);
        mo17821a("ProtonConfigUrl", (Object) f6137q);
        mo17821a("analyticsEnabled", (Object) f6138r);
        mo17821a("IncludeBackgroundSessionsInMetrics", (Object) f6139s);
        mo17821a("notificationsEnabled", (Object) Boolean.FALSE);
    }

    /* renamed from: a */
    public static synchronized C2611eg m5674a() {
        C2611eg egVar;
        synchronized (C2611eg.class) {
            if (f6140t == null) {
                f6140t = new C2611eg();
            }
            egVar = f6140t;
        }
        return egVar;
    }

    /* renamed from: b */
    public static synchronized void m5675b() {
        synchronized (C2611eg.class) {
            if (f6140t != null) {
                f6140t.mo17823c();
            }
            f6140t = null;
        }
    }
}
