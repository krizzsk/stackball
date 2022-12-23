package com.smaato.sdk.p246ad;

import com.smaato.sdk.inject.Provider;
import com.smaato.sdk.net.HttpClient;
import com.smaato.sdk.util.Schedulers;

/* renamed from: com.smaato.sdk.ad.BeaconTrackerImpl_Factory */
public final class BeaconTrackerImpl_Factory implements Provider<BeaconTrackerImpl> {
    private final Provider<? extends HttpClient> defaultHttpClient;
    private final Provider<? extends Schedulers> schedulers;

    public BeaconTrackerImpl_Factory(Provider<? extends HttpClient> provider, Provider<? extends Schedulers> provider2) {
        this.defaultHttpClient = provider;
        this.schedulers = provider2;
    }

    public final BeaconTrackerImpl get() {
        return new BeaconTrackerImpl((HttpClient) this.defaultHttpClient.get(), (Schedulers) this.schedulers.get());
    }
}
