package com.smaato.sdk.iahb;

import com.smaato.sdk.inject.Provider;
import com.smaato.sdk.p257ub.UbCache;
import com.smaato.sdk.util.JsonAdapter;

public final class IahbInteractor_Factory implements Provider<IahbInteractor> {
    private final Provider<? extends JsonAdapter<IahbResponse>> jsonAdapter;
    private final Provider<? extends UbCache> ubCache;

    public IahbInteractor_Factory(Provider<? extends UbCache> provider, Provider<? extends JsonAdapter<IahbResponse>> provider2) {
        this.ubCache = provider;
        this.jsonAdapter = provider2;
    }

    public final IahbInteractor get() {
        return new IahbInteractor((UbCache) this.ubCache.get(), (JsonAdapter) this.jsonAdapter.get());
    }
}
