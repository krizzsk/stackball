package com.ogury.sdk;

import android.content.Context;
import com.ogury.core.internal.InternalCore;
import com.ogury.core.internal.OguryBroadcastEventBus;
import com.ogury.core.internal.OguryEventBuses;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.core.internal.OguryPersistentMessageEventBus;
import com.ogury.p244cm.internal.InternalCM;
import com.ogury.p245ed.internal.InternalAds;
import com.ogury.sdk.internal.C8551a;
import com.ogury.sdk.internal.C8553c;
import com.ogury.sdk.internal.C8554d;
import com.ogury.sdk.internal.C8558f;
import com.ogury.sdk.internal.C8559g;
import com.ogury.sdk.internal.C8560h;
import com.ogury.sdk.internal.C8562i;
import com.ogury.sdk.internal.C8565k;
import com.ogury.sdk.internal.C8567m;

/* compiled from: Ogury.kt */
public final class Ogury {
    public static final Ogury INSTANCE = new Ogury();

    /* renamed from: a */
    private static OguryEventBuses f21773a;

    public static final String getSdkVersion() {
        return "5.3.0";
    }

    private Ogury() {
    }

    public static final synchronized void start(OguryConfiguration oguryConfiguration) {
        synchronized (Ogury.class) {
            C8567m.m24059b(oguryConfiguration, "configuration");
            OguryIntegrationLogger.m22104d("[Ogury] Starting Ogury SDK " + getSdkVersion() + "...");
            Context applicationContext = oguryConfiguration.getContext().getApplicationContext();
            if (f21773a == null) {
                f21773a = new OguryEventBuses(new OguryPersistentMessageEventBus(), new OguryBroadcastEventBus());
            }
            OguryIntegrationLogger.m22104d("[Ogury] Starting modules...");
            boolean z = false;
            if (!m24033a()) {
                C8567m.m24057a((Object) applicationContext, "appContext");
                if ((applicationContext.getApplicationInfo().flags & 2) != 0) {
                    z = true;
                }
                if (z) {
                    throw new OguryIntegrationException("Core module is missing!");
                }
                return;
            }
            C8567m.m24057a((Object) applicationContext, "appContext");
            OguryEventBuses oguryEventBuses = f21773a;
            try {
                String version = InternalCM.getVersion();
                OguryIntegrationLogger.m22104d("[Ogury] Starting Consent module " + version + "...");
                InternalCM.start(applicationContext, oguryConfiguration.getAssetKey(), oguryEventBuses);
                if (!C8567m.m24058a((Object) version, (Object) "3.3.0")) {
                    OguryIntegrationLogger.m22107i("[Ogury] Unexpected CM version: " + version + " (3.3.0 expected)");
                }
            } catch (NoClassDefFoundError unused) {
                OguryIntegrationLogger.m22107i("[Ogury] Consent module missing!");
            } catch (Throwable th) {
                OguryIntegrationLogger.m22106e(th);
            }
            OguryEventBuses oguryEventBuses2 = f21773a;
            try {
                String version2 = InternalAds.getVersion();
                OguryIntegrationLogger.m22104d("[Ogury] Starting Ads module " + version2 + "...");
                InternalAds.start(applicationContext, oguryConfiguration.getAssetKey(), oguryEventBuses2);
                if (!C8567m.m24058a((Object) version2, (Object) "4.2.0")) {
                    OguryIntegrationLogger.m22107i("[Ogury] Unexpected Ads version: " + version2 + " (4.2.0 expected)");
                }
            } catch (NoClassDefFoundError unused2) {
                OguryIntegrationLogger.m22107i("[Ogury] Ads module missing!");
            } catch (Throwable th2) {
                OguryIntegrationLogger.m22106e(th2);
            }
            OguryIntegrationLogger.m22104d("[Ogury] Ogury SDK is started");
            OguryIntegrationLogger.m22104d("[Ogury] Checking environment...");
            try {
                C8558f fVar = new C8558f(oguryConfiguration);
                OguryIntegrationLogger.m22104d("[Ogury][environment] Package name: " + fVar.mo54039c() + " ; version name: " + fVar.mo54040d() + " ; asset key: " + fVar.mo54038a() + " ; environment: " + C8558f.m24044b());
                C8559g gVar = new C8559g(new C8551a());
                new C8553c(new C8554d(fVar), new C8562i(new C8565k(oguryConfiguration.getContext()), gVar), new C8560h(fVar, gVar)).execute(new Object[0]);
            } catch (Exception e) {
                OguryIntegrationLogger.m22106e((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    private static boolean m24033a() {
        try {
            String version = InternalCore.getVersion();
            OguryIntegrationLogger.m22104d("[Ogury] Core module " + version + " detected");
            if (!C8567m.m24058a((Object) version, (Object) "1.1.0")) {
                OguryIntegrationLogger.m22107i("[Ogury] Unexpected Core version: " + version + " (1.1.0 expected)");
            }
            return true;
        } catch (NoClassDefFoundError unused) {
            OguryIntegrationLogger.m22105e("[Ogury] Core module is missing!");
            return false;
        } catch (Throwable th) {
            OguryIntegrationLogger.m22106e(th);
            return false;
        }
    }

    public static final void applyChildPrivacy(int i) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3 = null;
        if (i == 1) {
            bool2 = Boolean.FALSE;
        } else if (i != 2) {
            if (i != 4) {
                bool = i != 8 ? null : Boolean.TRUE;
            } else {
                bool = Boolean.FALSE;
            }
            InternalCM.setChildUnderCoppaTreatment(bool3);
            InternalCM.setUnderAgeOfGdprConsentTreatment(bool);
            InternalAds.setChildUnderCoppaTreatment(bool3);
            InternalAds.setUnderAgeOfGdprConsentTreatment(bool);
        } else {
            bool2 = Boolean.TRUE;
        }
        bool3 = bool2;
        bool = null;
        InternalCM.setChildUnderCoppaTreatment(bool3);
        InternalCM.setUnderAgeOfGdprConsentTreatment(bool);
        InternalAds.setChildUnderCoppaTreatment(bool3);
        InternalAds.setUnderAgeOfGdprConsentTreatment(bool);
    }
}
