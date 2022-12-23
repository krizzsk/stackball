package com.yandex.mobile.ads.impl;

import com.facebook.internal.AnalyticsEvents;
import com.yandex.metrica.IIdentifierCallback;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.impl.v8 */
class C14874v8 {

    /* renamed from: a */
    private static final Map<IIdentifierCallback.Reason, String> f41211a;

    static {
        EnumMap enumMap = new EnumMap(IIdentifierCallback.Reason.class);
        f41211a = enumMap;
        enumMap.put(IIdentifierCallback.Reason.NETWORK, "Network error");
        enumMap.put(IIdentifierCallback.Reason.INVALID_RESPONSE, "Invalid response");
        enumMap.put(IIdentifierCallback.Reason.UNKNOWN, AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN);
    }

    C14874v8() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo70456a(IIdentifierCallback.Reason reason) {
        String str = (String) ((EnumMap) f41211a).get(reason);
        return str != null ? str : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }
}
