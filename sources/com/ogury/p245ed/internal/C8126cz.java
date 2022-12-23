package com.ogury.p245ed.internal;

import com.ogury.core.internal.OguryEventBus;
import com.ogury.core.internal.OguryEventBuses;
import com.ogury.core.internal.OguryEventCallback;
import com.ogury.core.internal.OguryIntegrationLogger;

/* renamed from: com.ogury.ed.internal.cz */
public final class C8126cz {

    /* renamed from: a */
    public static final C8126cz f21060a = new C8126cz();

    /* renamed from: b */
    private static OguryEventBuses f21061b;

    private C8126cz() {
    }

    /* renamed from: a */
    public static void m22644a(OguryEventBuses oguryEventBuses) {
        f21061b = oguryEventBuses;
    }

    /* renamed from: a */
    public static OguryEventCallback m22642a(C8431lj<C8386ke> ljVar) {
        C8467mq.m23881b(ljVar, "consentDoneAction");
        OguryEventBuses oguryEventBuses = f21061b;
        OguryEventBus persistentMessage = oguryEventBuses == null ? null : oguryEventBuses.getPersistentMessage();
        if (persistentMessage == null) {
            OguryIntegrationLogger.m22104d("[Ads][EvenBus] Consent sync not available");
            ljVar.mo53190a();
            return null;
        }
        OguryEventCallback a = m22643a(ljVar, persistentMessage);
        OguryIntegrationLogger.m22104d("[Ads][EvenBus] Register to consent status");
        persistentMessage.register("CM-status", a);
        return a;
    }

    /* renamed from: b */
    public static OguryEventCallback m22648b(C8431lj<C8386ke> ljVar) {
        C8467mq.m23881b(ljVar, "consentChangedAction");
        OguryEventBuses oguryEventBuses = f21061b;
        OguryEventBus broadcast = oguryEventBuses == null ? null : oguryEventBuses.getBroadcast();
        if (broadcast == null) {
            OguryIntegrationLogger.m22104d("[Ads][EvenBus] Impossible to register to consent changes");
            return null;
        }
        OguryEventCallback c = m22650c(ljVar);
        OguryIntegrationLogger.m22104d("[Ads][EvenBus] Register to consent changes");
        broadcast.register("CM-consent-change", c);
        return c;
    }

    /* renamed from: com.ogury.ed.internal.cz$a */
    public static final class C8127a implements OguryEventCallback {

        /* renamed from: a */
        final /* synthetic */ C8431lj<C8386ke> f21062a;

        /* renamed from: b */
        final /* synthetic */ OguryEventBus f21063b;

        C8127a(C8431lj<C8386ke> ljVar, OguryEventBus oguryEventBus) {
            this.f21062a = ljVar;
            this.f21063b = oguryEventBus;
        }

        public final void onNewEvent(String str, String str2, long j) {
            C8467mq.m23881b(str, "event");
            C8467mq.m23881b(str2, "message");
            OguryIntegrationLogger.m22104d("[Ads][EvenBus] " + str + ' ' + str2 + " received");
            if (!C8467mq.m23880a((Object) str2, (Object) "COMPLETE") && !C8467mq.m23880a((Object) str2, (Object) "UNKNOWN") && !C8467mq.m23880a((Object) str2, (Object) "ERROR")) {
                C8126cz czVar = C8126cz.f21060a;
                if (!C8126cz.m22649b(j)) {
                    return;
                }
            }
            OguryIntegrationLogger.m22104d("[Ads][EvenBus] Consent synced");
            this.f21062a.mo53190a();
            OguryIntegrationLogger.m22104d("[Ads][EvenBus] Unregister from consent status");
            this.f21063b.unregister(str, this);
        }
    }

    /* renamed from: a */
    private static OguryEventCallback m22643a(C8431lj<C8386ke> ljVar, OguryEventBus oguryEventBus) {
        return new C8127a(ljVar, oguryEventBus);
    }

    /* renamed from: c */
    private static OguryEventCallback m22650c(C8431lj<C8386ke> ljVar) {
        return new OguryEventCallback() {
            public final void onNewEvent(String str, String str2, long j) {
                C8126cz.m22646a(C8431lj.this, str, str2, j);
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m22646a(C8431lj ljVar, String str, String str2, long j) {
        C8467mq.m23881b(ljVar, "$consentChangedAction");
        OguryIntegrationLogger.m22104d("[Ads][EvenBus] " + str + ' ' + str2 + " received");
        ljVar.mo53190a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m22649b(long j) {
        return j < System.currentTimeMillis() - 30000;
    }

    /* renamed from: a */
    public static void m22645a(OguryEventCallback oguryEventCallback) {
        OguryEventBus persistentMessage;
        if (oguryEventCallback != null) {
            OguryIntegrationLogger.m22104d("[Ads][EvenBus] Unregister from consent status");
            OguryEventBuses oguryEventBuses = f21061b;
            if (oguryEventBuses != null && (persistentMessage = oguryEventBuses.getPersistentMessage()) != null) {
                persistentMessage.unregister("CM-status", oguryEventCallback);
            }
        }
    }
}
