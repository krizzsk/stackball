package com.ogury.sdk.internal;

import android.os.AsyncTask;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.core.internal.network.OguryNetworkResponse;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.ogury.sdk.internal.c */
/* compiled from: MonitoringInfoAsyncTask.kt */
public final class C8553c extends AsyncTask<Object, Object, Object> {

    /* renamed from: a */
    private final C8554d f21775a;

    /* renamed from: b */
    private final C8562i f21776b;

    /* renamed from: c */
    private final C8560h f21777c;

    public C8553c(C8554d dVar, C8562i iVar, C8560h hVar) {
        C8567m.m24059b(dVar, "monitoringInfoFetcher");
        C8567m.m24059b(iVar, "monitoringInfoStorage");
        C8567m.m24059b(hVar, "monitoringInfoSender");
        this.f21775a = dVar;
        this.f21776b = iVar;
        this.f21777c = hVar;
    }

    public final Object doInBackground(Object[] objArr) {
        C8567m.m24059b(objArr, "objects");
        try {
            C8552b a = this.f21775a.mo54036a();
            if (a.mo54026a()) {
                OguryIntegrationLogger.m22104d("[Ogury][[environment] Failed to check environment");
                return null;
            }
            C8552b a2 = this.f21776b.mo54044a();
            if (a.mo54028a(TapjoyConstants.TJC_APP_VERSION_NAME) && a2.mo54028a(TapjoyConstants.TJC_APP_VERSION_NAME) && (!C8567m.m24058a((Object) a.mo54029b(TapjoyConstants.TJC_APP_VERSION_NAME), (Object) a2.mo54029b(TapjoyConstants.TJC_APP_VERSION_NAME)))) {
                OguryIntegrationLogger.m22104d("[Ogury][environment] New environment detected");
                this.f21776b.mo54046b();
                a2.mo54032c();
            }
            if (!a2.mo54027a(a)) {
                OguryIntegrationLogger.m22104d("[Ogury][environment] New environment info detected");
                a2.mo54031b(a);
                if (this.f21777c.mo54043a(a2) instanceof OguryNetworkResponse.Success) {
                    this.f21776b.mo54045a(a2);
                }
            }
            OguryIntegrationLogger.m22104d("[Ogury][environment] Environment checked");
            return null;
        } catch (Throwable unused) {
        }
    }
}
