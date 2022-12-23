package p269io.presage.common;

import android.content.Context;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p245ed.internal.C8125cy;
import com.ogury.p245ed.internal.C8134de;
import com.ogury.p245ed.internal.C8467mq;

/* renamed from: io.presage.common.PresageSdk */
public final class PresageSdk {

    /* renamed from: a */
    public static final PresageSdk f44180a = new PresageSdk();

    /* renamed from: b */
    private static C8134de f44181b = new C8134de();

    private PresageSdk() {
    }

    public static final void init(Context context, String str) {
        C8467mq.m23881b(context, "context");
        m45481a(new C8125cy(context, str));
    }

    /* renamed from: a */
    public static void m45481a(C8125cy cyVar) {
        C8467mq.m23881b(cyVar, "adsConfig");
        OguryIntegrationLogger.m22104d("[Ads] Setting up...");
        f44181b.mo53294a(cyVar);
    }

    public static final String getAdsSdkVersion() {
        return C8134de.m22679d();
    }

    /* renamed from: a */
    public static boolean m45482a() {
        return f44181b.mo53296a();
    }

    /* renamed from: b */
    public static boolean m45483b() {
        return f44181b.mo53297b();
    }

    /* renamed from: c */
    public static boolean m45484c() {
        return f44181b.mo53298c();
    }

    public final void addSdkInitCallback(PresageSdkInitCallback presageSdkInitCallback) {
        C8467mq.m23881b(presageSdkInitCallback, "presageSdkInitCallback");
        f44181b.mo53295a(presageSdkInitCallback);
    }
}
