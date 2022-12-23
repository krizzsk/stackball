package com.smaato.sdk.p246ad;

import com.smaato.sdk.inject.Provider;
import com.smaato.sdk.util.Schedulers;

/* renamed from: com.smaato.sdk.ad.ExpirationCheckerImpl_Factory */
public final class ExpirationCheckerImpl_Factory implements Provider<ExpirationCheckerImpl> {
    private final Provider<? extends Schedulers> schedulers;

    public ExpirationCheckerImpl_Factory(Provider<? extends Schedulers> provider) {
        this.schedulers = provider;
    }

    public final ExpirationCheckerImpl get() {
        return new ExpirationCheckerImpl((Schedulers) this.schedulers.get());
    }
}
