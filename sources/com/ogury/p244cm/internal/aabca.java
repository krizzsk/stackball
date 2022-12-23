package com.ogury.p244cm.internal;

import androidx.core.app.NotificationCompat;
import com.ogury.core.internal.OguryEventBus;
import com.ogury.core.internal.OguryEventBuses;
import com.ogury.core.internal.OguryIntegrationLogger;

/* renamed from: com.ogury.cm.internal.aabca */
public final class aabca {

    /* renamed from: a */
    public static final aabca f20358a = new aabca();

    /* renamed from: b */
    private static OguryEventBuses f20359b;

    private aabca() {
    }

    /* renamed from: a */
    public static void m21760a() {
        OguryEventBus broadcast;
        OguryIntegrationLogger.m22104d("[Consent][EventBus] Dispatch CM-consent-change");
        OguryEventBuses oguryEventBuses = f20359b;
        if (oguryEventBuses != null && (broadcast = oguryEventBuses.getBroadcast()) != null) {
            broadcast.dispatch("CM-consent-change", "");
        }
    }

    /* renamed from: a */
    public static void m21761a(OguryEventBuses oguryEventBuses) {
        f20359b = oguryEventBuses;
    }

    /* renamed from: a */
    public static void m21762a(String str) {
        OguryEventBus persistentMessage;
        OguryEventBus persistentMessage2;
        bbabc.m22051b(str, NotificationCompat.CATEGORY_MESSAGE);
        if (str.length() > 0) {
            OguryIntegrationLogger.m22104d("[Consent][EventBus] Dispatch CM-status ".concat(String.valueOf(str)));
            OguryEventBuses oguryEventBuses = f20359b;
            if (oguryEventBuses != null && (persistentMessage2 = oguryEventBuses.getPersistentMessage()) != null) {
                persistentMessage2.dispatch("CM-status", str);
                return;
            }
            return;
        }
        OguryIntegrationLogger.m22104d("[Consent][EventBus] Dispatch CM-status UNKNOWN");
        OguryEventBuses oguryEventBuses2 = f20359b;
        if (oguryEventBuses2 != null && (persistentMessage = oguryEventBuses2.getPersistentMessage()) != null) {
            persistentMessage.dispatch("CM-status", "UNKNOWN");
        }
    }
}
