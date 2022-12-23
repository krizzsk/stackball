package com.yandex.mobile.ads.common;

import android.content.Context;
import com.yandex.mobile.ads.core.initializer.C12151b;
import com.yandex.mobile.ads.impl.c21;
import com.yandex.mobile.ads.impl.l71;
import com.yandex.mobile.ads.impl.le0;

public final class MobileAds {
    public static void enableDebugErrorIndicator(boolean z) {
        l71.m38631c().mo68365a(z);
    }

    public static void enableLogging(boolean z) {
        c21.m34568a(z);
    }

    public static String getLibraryVersion() {
        return "5.2.0";
    }

    public static void initialize(Context context, InitializationListener initializationListener) {
        C12151b.m31627b().mo64748a(context, (le0) null, initializationListener);
    }

    public static void setLocationConsent(boolean z) {
        l71.m38631c().mo68367b(z);
    }

    public static void setUserConsent(boolean z) {
        l71.m38631c().mo68368c(z);
    }
}
