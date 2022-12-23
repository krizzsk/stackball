package com.smaato.sdk.iahb;

import com.smaato.sdk.SdkBase;
import com.smaato.sdk.SdkModule;
import com.smaato.sdk.inject.Providers;
import com.smaato.sdk.log.Logger;

public final class IahbModule implements SdkModule {
    private static volatile IahbComponent component;

    static IahbComponent getComponent() {
        return component;
    }

    public final void init(SdkBase sdkBase) {
        if (sdkBase != null) {
            if (component == null) {
                synchronized (this) {
                    if (component == null) {
                        component = SmaatoIahbComponent.builder().sdkBase(Providers.wrap(sdkBase)).build();
                        return;
                    }
                }
            }
            Logger.m24077e("IahbModule is already initialized", new Object[0]);
            return;
        }
        throw new NullPointerException("'sdkBase' specified as non-null is null");
    }
}
