package com.smaato.sdk.core.violationreporter;

import com.smaato.sdk.core.datacollector.DataCollector;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.network.DiNetworkLayer;
import com.smaato.sdk.core.network.NetworkClient;
import com.smaato.sdk.core.network.NetworkHttpClient;
import com.smaato.sdk.core.network.execution.ErrorMapper;
import com.smaato.sdk.core.network.execution.Executioner;
import com.smaato.sdk.core.network.execution.HttpTasksExecutioner;
import com.smaato.sdk.core.p249di.CoreDiNames;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.util.HeaderUtils;
import java.util.concurrent.ExecutorService;

public final class DiAdQualityViolationReporterLayer {
    private DiAdQualityViolationReporterLayer() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m24065of(C8708x3dec002.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$6(DiRegistry diRegistry) {
        diRegistry.registerFactory(CoreDiNames.SOMA_VIOLATIONS_AGGREGATOR_URL, String.class, C8705xc405ebb1.INSTANCE);
        diRegistry.registerSingletonFactory("ad_quality_violation_reporter", ExecutorService.class, C8703x3c82a9de.INSTANCE);
        diRegistry.registerFactory("ad_quality_violation_reporter", Executioner.class, C8709x9529a33d.INSTANCE);
        diRegistry.registerFactory("ad_quality_violation_reporter", NetworkClient.class, C8704x53856c5.INSTANCE);
        diRegistry.registerFactory(AdQualityViolationReportMapper.class, C8707xdd579273.INSTANCE);
        diRegistry.registerSingletonFactory(AdQualityViolationReporter.class, C8706x36e3a68c.INSTANCE);
    }

    static /* synthetic */ Executioner lambda$null$2(DiConstructor diConstructor) {
        return new HttpTasksExecutioner(DiLogLayer.getLoggerFrom(diConstructor), DiNetworkLayer.getNetworkActionsFrom(diConstructor), (ExecutorService) diConstructor.get("ad_quality_violation_reporter", ExecutorService.class), ErrorMapper.NETWORK_LAYER_EXCEPTION);
    }

    static /* synthetic */ NetworkClient lambda$null$3(DiConstructor diConstructor) {
        return new NetworkHttpClient(DiLogLayer.getLoggerFrom(diConstructor), (Executioner) diConstructor.get("ad_quality_violation_reporter", Executioner.class));
    }

    static /* synthetic */ AdQualityViolationReportMapper lambda$null$4(DiConstructor diConstructor) {
        return new AdQualityViolationReportMapper(DiLogLayer.getLoggerFrom(diConstructor), (HeaderUtils) diConstructor.get(HeaderUtils.class));
    }

    static /* synthetic */ AdQualityViolationReporter lambda$null$5(DiConstructor diConstructor) {
        return new AdQualityViolationReporter(DiLogLayer.getLoggerFrom(diConstructor), (NetworkClient) diConstructor.get("ad_quality_violation_reporter", NetworkClient.class), (AdQualityViolationReportMapper) diConstructor.get(AdQualityViolationReportMapper.class), (String) diConstructor.get(CoreDiNames.SOMA_VIOLATIONS_AGGREGATOR_URL, String.class), ((DataCollector) diConstructor.get(DataCollector.class)).getSystemInfo().getUserAgent());
    }
}
