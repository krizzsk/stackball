package com.smaato.sdk.dns;

import com.smaato.sdk.inject.Provider;

public final class DnsLookupImpl_Factory implements Provider<DnsLookupImpl> {
    public final DnsLookupImpl get() {
        return new DnsLookupImpl();
    }
}
