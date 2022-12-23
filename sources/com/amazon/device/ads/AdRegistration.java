package com.amazon.device.ads;

import android.content.Context;

public class AdRegistration {
    private static final String LOGTAG;
    private static final AdRegistrationExecutor amazonAdRegistration;

    static {
        String simpleName = AdRegistration.class.getSimpleName();
        LOGTAG = simpleName;
        amazonAdRegistration = new AdRegistrationExecutor(simpleName);
    }

    private AdRegistration() {
    }

    public static final void setAppKey(String str) throws IllegalArgumentException {
        amazonAdRegistration.setAppKey(str);
    }

    public static final void enableLogging(boolean z) {
        amazonAdRegistration.enableLogging(z);
    }

    public static final void enableTesting(boolean z) {
        amazonAdRegistration.enableTesting(z);
    }

    public static final String getVersion() {
        return amazonAdRegistration.getVersion();
    }

    public static final void registerApp(Context context) {
        amazonAdRegistration.registerApp(context);
    }

    static AdRegistrationExecutor getAmazonAdRegistrationExecutor() {
        return amazonAdRegistration;
    }
}
