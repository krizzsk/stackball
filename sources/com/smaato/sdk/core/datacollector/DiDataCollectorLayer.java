package com.smaato.sdk.core.datacollector;

import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.location.LocationManager;
import android.telephony.TelephonyManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.DiNetworkLayer;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.util.AppMetaData;
import com.smaato.sdk.core.util.Clock;
import com.smaato.sdk.core.util.Objects;
import java.util.concurrent.ExecutorService;

public final class DiDataCollectorLayer {
    private DiDataCollectorLayer() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m24065of($$Lambda$DiDataCollectorLayer$1dVx2efY0k764If19b8FUmo_IcY.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$10(DiRegistry diRegistry) {
        diRegistry.registerSingletonFactory("DATA_COLLECTION_EXECUTOR_SERVICE", ExecutorService.class, $$Lambda$DiDataCollectorLayer$aeiDTdLrQO4vmRP_IFsfMLSDt8k.INSTANCE);
        diRegistry.registerSingletonFactory(DataCollector.class, $$Lambda$DiDataCollectorLayer$wU3yHUJQmmtpC_GvqzyYlNNTHOk.INSTANCE);
        diRegistry.registerSingletonFactory(TelephonyManager.class, $$Lambda$DiDataCollectorLayer$nesPCMno8bPxekP5BiVI4sJ5eg.INSTANCE);
        diRegistry.registerSingletonFactory(ContentResolver.class, $$Lambda$DiDataCollectorLayer$urJ_PZibfk4oXRSOoiZTiflfwoE.INSTANCE);
        diRegistry.registerSingletonFactory(SystemInfoProvider.class, $$Lambda$DiDataCollectorLayer$TU7ZIkealXmNerFR_2csndmvLSc.INSTANCE);
        diRegistry.registerSingletonFactory(LocationProvider.class, $$Lambda$DiDataCollectorLayer$111HmrmTnAo18e1UFFFjgUWxs.INSTANCE);
        diRegistry.registerFactory(Clock.class, $$Lambda$DiDataCollectorLayer$9XYj_mvuOFJ0HP3KOjIVMKhMsM.INSTANCE);
        diRegistry.registerFactory(LocationDetector.class, $$Lambda$DiDataCollectorLayer$SCQpxikCNjnTQiFvPDQydwm6c.INSTANCE);
        diRegistry.registerFactory(LocationManager.class, $$Lambda$DiDataCollectorLayer$XFEelp_8gDuAsEEUc94mK8EQ5lo.INSTANCE);
        diRegistry.registerFactory(UserAgentProvider.class, $$Lambda$DiDataCollectorLayer$1e0bveBSIxjzcKheGv6f5ePBtQ4.INSTANCE);
    }

    static /* synthetic */ DataCollector lambda$null$1(DiConstructor diConstructor) {
        return new DataCollector((SystemInfoProvider) diConstructor.get(SystemInfoProvider.class), (LocationProvider) diConstructor.get(LocationProvider.class));
    }

    static /* synthetic */ TelephonyManager lambda$null$2(DiConstructor diConstructor) {
        return (TelephonyManager) Objects.requireNonNull((TelephonyManager) ((Application) diConstructor.get(Application.class)).getSystemService("phone"));
    }

    static /* synthetic */ ContentResolver lambda$null$3(DiConstructor diConstructor) {
        return (ContentResolver) Objects.requireNonNull(((Application) diConstructor.get(Application.class)).getContentResolver());
    }

    static /* synthetic */ SystemInfoProvider lambda$null$4(DiConstructor diConstructor) {
        return new SystemInfoProvider((Logger) diConstructor.get(Logger.class), (Context) diConstructor.get(Application.class), DiNetworkLayer.getNetworkStateMonitorFrom(diConstructor), (TelephonyManager) diConstructor.get(TelephonyManager.class), (UserAgentProvider) diConstructor.get(UserAgentProvider.class));
    }

    static /* synthetic */ LocationProvider lambda$null$5(DiConstructor diConstructor) {
        return new LocationProvider((LocationDetector) diConstructor.get(LocationDetector.class), (Clock) diConstructor.get(Clock.class));
    }

    static /* synthetic */ Clock lambda$null$6(DiConstructor diConstructor) {
        return new Clock();
    }

    static /* synthetic */ LocationDetector lambda$null$7(DiConstructor diConstructor) {
        return new LocationDetector((LocationManager) diConstructor.get(LocationManager.class), (AppMetaData) diConstructor.get(AppMetaData.class));
    }

    static /* synthetic */ LocationManager lambda$null$8(DiConstructor diConstructor) {
        return (LocationManager) Objects.requireNonNull(((Application) diConstructor.get(Application.class)).getSystemService(FirebaseAnalytics.Param.LOCATION));
    }

    static /* synthetic */ UserAgentProvider lambda$null$9(DiConstructor diConstructor) {
        return new UserAgentProvider((Context) diConstructor.get(Application.class));
    }
}
