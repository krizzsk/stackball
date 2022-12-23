package com.smaato.sdk.iahb;

import com.smaato.sdk.inject.Provider;

public final class IahbJsonAdapter_Factory implements Provider<IahbJsonAdapter> {
    public final IahbJsonAdapter get() {
        return new IahbJsonAdapter();
    }
}
