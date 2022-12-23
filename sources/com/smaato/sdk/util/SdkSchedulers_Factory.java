package com.smaato.sdk.util;

import com.smaato.sdk.inject.Provider;

public final class SdkSchedulers_Factory implements Provider<SdkSchedulers> {
    public final SdkSchedulers get() {
        return new SdkSchedulers();
    }
}
