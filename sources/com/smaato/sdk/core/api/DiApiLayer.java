package com.smaato.sdk.core.api;

import com.smaato.sdk.core.datacollector.DataCollector;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.network.NetworkClient;
import com.smaato.sdk.core.p249di.CoreDiNames;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.util.CurrentTimeProvider;
import com.smaato.sdk.core.util.HeaderUtils;

public final class DiApiLayer {
    private DiApiLayer() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m24065of($$Lambda$DiApiLayer$B4uI3udrLOus0CTPWfs7SfA6UDQ.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$5(DiRegistry diRegistry) {
        diRegistry.registerFactory(ApiConnector.class, $$Lambda$DiApiLayer$ifQp1CdwbXdCfjpoq5dhwC_r1c.INSTANCE);
        diRegistry.registerFactory(ApiRequestMapper.class, $$Lambda$DiApiLayer$U0Q_Kpnk_FTloSDdvXvZkxfese4.INSTANCE);
        diRegistry.registerFactory(CurrentTimeProvider.class, $$Lambda$DiApiLayer$DxSdHWpajuK3x1M5e0Lu6AJvNhE.INSTANCE);
        diRegistry.registerFactory(ExpirationTimestampFactory.class, $$Lambda$DiApiLayer$vBzqGhXSaj1JyLi3KqpbHkR7Rs.INSTANCE);
        diRegistry.registerFactory(ApiResponseMapper.class, $$Lambda$DiApiLayer$NYKR52kjdA4x7klH1yzKn_VyVo.INSTANCE);
    }

    static /* synthetic */ ApiConnector lambda$null$0(DiConstructor diConstructor) {
        return new ApiConnector(DiLogLayer.getLoggerFrom(diConstructor), (ApiRequestMapper) diConstructor.get(ApiRequestMapper.class), (ApiResponseMapper) diConstructor.get(ApiResponseMapper.class), (NetworkClient) diConstructor.get(NetworkClient.class));
    }

    static /* synthetic */ ApiRequestMapper lambda$null$1(DiConstructor diConstructor) {
        return new ApiRequestMapper((String) diConstructor.get(CoreDiNames.SOMA_API_URL, String.class), ((DataCollector) diConstructor.get(DataCollector.class)).getSystemInfo().getUserAgent());
    }

    static /* synthetic */ CurrentTimeProvider lambda$null$2(DiConstructor diConstructor) {
        return new CurrentTimeProvider();
    }

    static /* synthetic */ ExpirationTimestampFactory lambda$null$3(DiConstructor diConstructor) {
        return new ExpirationTimestampFactory((CurrentTimeProvider) diConstructor.get(CurrentTimeProvider.class));
    }

    static /* synthetic */ ApiResponseMapper lambda$null$4(DiConstructor diConstructor) {
        return new ApiResponseMapper(DiLogLayer.getLoggerFrom(diConstructor), (HeaderUtils) diConstructor.get(HeaderUtils.class), (ExpirationTimestampFactory) diConstructor.get(ExpirationTimestampFactory.class));
    }
}
