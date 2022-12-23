package com.smaato.sdk.sys;

import android.content.Context;
import com.smaato.sdk.dns.DnsLookup;
import com.smaato.sdk.inject.Provider;

public final class LocationAwareImpl_Factory implements Provider<LocationAwareImpl> {
    private final Provider<? extends Context> context;
    private final Provider<? extends DnsLookup> dns;
    private final Provider<? extends SimInfo> simInfo;
    private final Provider<? extends TzSettings> tzSettings;

    public LocationAwareImpl_Factory(Provider<? extends Context> provider, Provider<? extends SimInfo> provider2, Provider<? extends TzSettings> provider3, Provider<? extends DnsLookup> provider4) {
        this.context = provider;
        this.simInfo = provider2;
        this.tzSettings = provider3;
        this.dns = provider4;
    }

    public final LocationAwareImpl get() {
        return new LocationAwareImpl((Context) this.context.get(), (SimInfo) this.simInfo.get(), (TzSettings) this.tzSettings.get(), (DnsLookup) this.dns.get());
    }
}
