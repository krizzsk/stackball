package com.smaato.sdk.p246ad;

import android.content.Context;
import com.smaato.sdk.SmaatoBridge;
import com.smaato.sdk.inject.Provider;
import com.smaato.sdk.net.HttpClient;
import com.smaato.sdk.util.Schedulers;

/* renamed from: com.smaato.sdk.ad.LinkResolverImpl_Factory */
public final class LinkResolverImpl_Factory implements Provider<LinkResolverImpl> {
    private final Provider<? extends SmaatoBridge> bridge;
    private final Provider<? extends Context> context;
    private final Provider<? extends HttpClient> httpClient;
    private final Provider<? extends Schedulers> schedulers;

    public LinkResolverImpl_Factory(Provider<? extends Context> provider, Provider<? extends HttpClient> provider2, Provider<? extends Schedulers> provider3, Provider<? extends SmaatoBridge> provider4) {
        this.context = provider;
        this.httpClient = provider2;
        this.schedulers = provider3;
        this.bridge = provider4;
    }

    public final LinkResolverImpl get() {
        return new LinkResolverImpl((Context) this.context.get(), (HttpClient) this.httpClient.get(), (Schedulers) this.schedulers.get(), (SmaatoBridge) this.bridge.get());
    }
}
