package com.smaato.sdk.core.webview;

import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;

public final class DiWebViewLayer {
    private DiWebViewLayer() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m24065of($$Lambda$DiWebViewLayer$e2_U8Bj31iwiNmmNRxx0bFlgvoE.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$2(DiRegistry diRegistry) {
        diRegistry.registerFactory(BaseWebViewClient.class, $$Lambda$DiWebViewLayer$PorDjObPGpkHL_7sEqcM196zV3Y.INSTANCE);
        diRegistry.registerFactory(BaseWebChromeClient.class, $$Lambda$DiWebViewLayer$5BLm_lygEVAmw6mLHmqwF8da50s.INSTANCE);
    }

    static /* synthetic */ BaseWebViewClient lambda$null$0(DiConstructor diConstructor) {
        return new BaseWebViewClient();
    }

    static /* synthetic */ BaseWebChromeClient lambda$null$1(DiConstructor diConstructor) {
        return new BaseWebChromeClient();
    }

    public static BaseWebViewClient getBaseWebViewClientFrom(DiConstructor diConstructor) {
        return (BaseWebViewClient) diConstructor.get(BaseWebViewClient.class);
    }

    public static BaseWebChromeClient getBaseWebChromeClientFrom(DiConstructor diConstructor) {
        return (BaseWebChromeClient) diConstructor.get(BaseWebChromeClient.class);
    }
}
