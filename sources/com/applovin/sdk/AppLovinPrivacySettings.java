package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.sdk.C1456g;

public class AppLovinPrivacySettings {
    public static boolean hasUserConsent(Context context) {
        Boolean a = C1456g.m3008a(context);
        if (a != null) {
            return a.booleanValue();
        }
        return false;
    }

    public static boolean isAgeRestrictedUser(Context context) {
        Boolean b = C1456g.m3012b(context);
        if (b != null) {
            return b.booleanValue();
        }
        return false;
    }

    public static boolean isDoNotSell(Context context) {
        Boolean c = C1456g.m3014c(context);
        if (c != null) {
            return c.booleanValue();
        }
        return false;
    }

    public static void setDoNotSell(boolean z, Context context) {
        if (C1456g.m3015c(z, context)) {
            AppLovinSdk.reinitializeAll((Boolean) null, (Boolean) null, Boolean.valueOf(z));
        }
    }

    public static void setHasUserConsent(boolean z, Context context) {
        if (C1456g.m3011a(z, context)) {
            AppLovinSdk.reinitializeAll(Boolean.valueOf(z), (Boolean) null, (Boolean) null);
        }
    }

    public static void setIsAgeRestrictedUser(boolean z, Context context) {
        if (C1456g.m3013b(z, context)) {
            AppLovinSdk.reinitializeAll((Boolean) null, Boolean.valueOf(z), (Boolean) null);
        }
    }
}
