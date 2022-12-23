package com.smaato.sdk.core.deeplink;

import android.app.Application;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.network.DiNetworkLayer;
import com.smaato.sdk.core.network.execution.ErrorMapper;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;

public final class DiDeepLinkLayer {
    private DiDeepLinkLayer() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m24065of($$Lambda$DiDeepLinkLayer$S2H624c9gTZ7QBd1Gha9pyqVY8.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$2(DiRegistry diRegistry) {
        diRegistry.registerSingletonFactory(LinkResolver.class, $$Lambda$DiDeepLinkLayer$1MwPdqF9cNT7TsEP3e3OMxps8.INSTANCE);
        diRegistry.registerSingletonFactory(RedirectResolver.class, $$Lambda$DiDeepLinkLayer$I_50KN_szepRyH7fsfBCk8ErVNA.INSTANCE);
    }

    static /* synthetic */ LinkResolver lambda$null$0(DiConstructor diConstructor) {
        return new LinkResolver(DiLogLayer.getLoggerFrom(diConstructor), (Application) diConstructor.get(Application.class), (RedirectResolver) diConstructor.get(RedirectResolver.class), DiNetworkLayer.getUrlCreatorFrom(diConstructor));
    }

    static /* synthetic */ RedirectResolver lambda$null$1(DiConstructor diConstructor) {
        return new RedirectResolver(DiLogLayer.getLoggerFrom(diConstructor), DiNetworkLayer.getNetworkingExecutorServiceFrom(diConstructor), DiNetworkLayer.getNetworkActionsFrom(diConstructor), ErrorMapper.IDENTITY, DiNetworkLayer.getUrlRedirectResolverFrom(diConstructor));
    }

    public static LinkResolver getLinkResolverFrom(DiConstructor diConstructor) {
        return (LinkResolver) diConstructor.get(LinkResolver.class);
    }
}
