package com.smaato.sdk.res;

import android.content.Context;
import com.smaato.sdk.SmaatoBridge;
import com.smaato.sdk.inject.Provider;

public final class IntentLauncherImpl_Factory implements Provider<IntentLauncherImpl> {
    private final Provider<? extends SmaatoBridge> bridge;
    private final Provider<? extends Context> context;

    public IntentLauncherImpl_Factory(Provider<? extends Context> provider, Provider<? extends SmaatoBridge> provider2) {
        this.context = provider;
        this.bridge = provider2;
    }

    public final IntentLauncherImpl get() {
        return new IntentLauncherImpl((Context) this.context.get(), (SmaatoBridge) this.bridge.get());
    }
}
