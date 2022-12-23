package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.network.StaticWrapperLoaderExecutioner;

public class WrapperLoader {
    /* access modifiers changed from: private */
    public final WrapperLoaderErrorMapper errorMapper;
    final StaticWrapperLoaderExecutioner executioner;

    public WrapperLoader(WrapperLoaderErrorMapper wrapperLoaderErrorMapper, StaticWrapperLoaderExecutioner staticWrapperLoaderExecutioner) {
        this.errorMapper = (WrapperLoaderErrorMapper) Objects.requireNonNull(wrapperLoaderErrorMapper);
        this.executioner = (StaticWrapperLoaderExecutioner) Objects.requireNonNull(staticWrapperLoaderExecutioner);
    }
}
