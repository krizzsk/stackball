package com.smaato.sdk.res;

import com.smaato.sdk.inject.Provider;
import com.smaato.sdk.net.HttpClient;
import com.smaato.sdk.util.Schedulers;

public final class ImageLoaderImpl_Factory implements Provider<ImageLoaderImpl> {
    private final Provider<? extends Schedulers> executors;
    private final Provider<? extends HttpClient> httpClient;

    public ImageLoaderImpl_Factory(Provider<? extends HttpClient> provider, Provider<? extends Schedulers> provider2) {
        this.httpClient = provider;
        this.executors = provider2;
    }

    public final ImageLoaderImpl get() {
        return new ImageLoaderImpl((HttpClient) this.httpClient.get(), (Schedulers) this.executors.get());
    }
}
