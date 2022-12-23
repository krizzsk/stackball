package com.smaato.sdk.core.network;

import android.app.Application;
import android.net.ConnectivityManager;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.appsflyer.ServerParameters;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.network.execution.ClickThroughUrlRedirectResolver;
import com.smaato.sdk.core.network.execution.ErrorMapper;
import com.smaato.sdk.core.network.execution.Executioner;
import com.smaato.sdk.core.network.execution.HttpTasksExecutioner;
import com.smaato.sdk.core.network.execution.HttpsOnlyPolicy;
import com.smaato.sdk.core.network.execution.NetworkActions;
import com.smaato.sdk.core.network.trackers.BeaconTracker;
import com.smaato.sdk.core.network.trackers.BeaconTrackerAdQualityViolationUtils;
import com.smaato.sdk.core.network.trackers.BeaconsExecutioner;
import com.smaato.sdk.core.p249di.CoreDiNames;
import com.smaato.sdk.core.p249di.DiConstructor;
import com.smaato.sdk.core.p249di.DiRegistry;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Optional;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.violationreporter.AdQualityViolationReporter;
import java.util.concurrent.ExecutorService;

public final class DiNetworkLayer {
    private DiNetworkLayer() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m24065of($$Lambda$DiNetworkLayer$knBjBRTeZ3U5rN115K7IKCNbxiA.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$11(DiRegistry diRegistry) {
        diRegistry.registerFactory(NetworkClient.class, $$Lambda$DiNetworkLayer$qHLyXtiN7hWNP7PNNjyrG4TGzYc.INSTANCE);
        diRegistry.registerFactory(ServerParameters.NETWORK, UrlCreator.class, $$Lambda$DiNetworkLayer$Hrq6lUTNMxh549yTb74Ys9OSug.INSTANCE);
        diRegistry.registerFactory(ServerParameters.NETWORK, Executioner.class, $$Lambda$DiNetworkLayer$qI3vqvi4GKvpHWO3H024Y8V4Oao.INSTANCE);
        diRegistry.registerSingletonFactory(ServerParameters.NETWORK, ExecutorService.class, $$Lambda$DiNetworkLayer$5IInb6FLd2cADAYevppwD3XP5nE.INSTANCE);
        diRegistry.registerSingletonFactory(NetworkStateMonitor.class, $$Lambda$DiNetworkLayer$k_afH6F3q3JNbVUaQJVSrpIwRsI.INSTANCE);
        diRegistry.registerSingletonFactory(ConnectionStatusWatcher.class, $$Lambda$DiNetworkLayer$IJrE31QyNymAIOHq3cHiahqDt10.INSTANCE);
        diRegistry.registerFactory(ServerParameters.NETWORK, ConnectivityManager.class, $$Lambda$DiNetworkLayer$9y6uN1PS_LurU0VI5RnZbm6GGVE.INSTANCE);
        diRegistry.registerSingletonFactory(ServerParameters.NETWORK, BeaconTracker.class, $$Lambda$DiNetworkLayer$WHqykf7jxgHQeS4SayUgJx4rg.INSTANCE);
        diRegistry.registerSingletonFactory(BeaconTrackerAdQualityViolationUtils.class, $$Lambda$DiNetworkLayer$LzktX2ib6PRlEeJk2pvlGtpDFxQ.INSTANCE);
        diRegistry.registerSingletonFactory(ServerParameters.NETWORK, BeaconsExecutioner.class, $$Lambda$DiNetworkLayer$H9V7QX11Gvyz_btAwGP5F9Mvpw.INSTANCE);
        diRegistry.registerSingletonFactory(NetworkActions.class, $$Lambda$DiNetworkLayer$cG80l1zR9DyA6AKqEmaDxfA4I.INSTANCE);
        diRegistry.registerSingletonFactory(ClickThroughUrlRedirectResolver.class, $$Lambda$DiNetworkLayer$UcUZImwOMPW0HaQPT7qd7x8lCcI.INSTANCE);
        diRegistry.registerSingletonFactory(HttpsOnlyPolicy.class, $$Lambda$DiNetworkLayer$UMQoTQhl2mWCz28Lx6s_zn4B3fE.INSTANCE);
        diRegistry.registerSingletonFactory("networkSecurityPolicy", Optional.class, $$Lambda$DiNetworkLayer$WHATytNLxd2xPn0rLCBravLoE0.INSTANCE);
    }

    static /* synthetic */ NetworkClient lambda$null$0(DiConstructor diConstructor) {
        return new NetworkHttpClient(DiLogLayer.getLoggerFrom(diConstructor), (Executioner) diConstructor.get(ServerParameters.NETWORK, Executioner.class));
    }

    static /* synthetic */ UrlCreator lambda$null$1(DiConstructor diConstructor) {
        return new UrlCreator();
    }

    static /* synthetic */ Executioner lambda$null$2(DiConstructor diConstructor) {
        return new HttpTasksExecutioner(DiLogLayer.getLoggerFrom(diConstructor), getNetworkActionsFrom(diConstructor), (ExecutorService) diConstructor.get(ServerParameters.NETWORK, ExecutorService.class), ErrorMapper.NETWORK_LAYER_EXCEPTION);
    }

    static /* synthetic */ NetworkStateMonitor lambda$null$4(DiConstructor diConstructor) {
        return new NetworkStateMonitor((ConnectivityManager) diConstructor.get(ServerParameters.NETWORK, ConnectivityManager.class), (ConnectionStatusWatcher) diConstructor.get(ConnectionStatusWatcher.class));
    }

    static /* synthetic */ ConnectivityManager lambda$null$5(DiConstructor diConstructor) {
        return (ConnectivityManager) Objects.requireNonNull((ConnectivityManager) ((Application) diConstructor.get(Application.class)).getSystemService("connectivity"));
    }

    static /* synthetic */ BeaconTracker lambda$null$6(DiConstructor diConstructor) {
        return new BeaconTracker(DiLogLayer.getLoggerFrom(diConstructor), (BeaconsExecutioner) diConstructor.get(ServerParameters.NETWORK, BeaconsExecutioner.class), (BeaconTrackerAdQualityViolationUtils) diConstructor.get(BeaconTrackerAdQualityViolationUtils.class));
    }

    static /* synthetic */ BeaconTrackerAdQualityViolationUtils lambda$null$7(DiConstructor diConstructor) {
        return new BeaconTrackerAdQualityViolationUtils((AdQualityViolationReporter) diConstructor.get(AdQualityViolationReporter.class));
    }

    static /* synthetic */ BeaconsExecutioner lambda$null$8(DiConstructor diConstructor) {
        return new BeaconsExecutioner(DiLogLayer.getLoggerFrom(diConstructor), getNetworkActionsFrom(diConstructor), ErrorMapper.IDENTITY, (ExecutorService) diConstructor.get(ServerParameters.NETWORK, ExecutorService.class));
    }

    static /* synthetic */ NetworkActions lambda$null$9(DiConstructor diConstructor) {
        return new NetworkActions(DiLogLayer.getLoggerFrom(diConstructor), (UrlCreator) diConstructor.get(ServerParameters.NETWORK, UrlCreator.class), getNetworkStateMonitorFrom(diConstructor), getRedirectPolicyFrom(diConstructor));
    }

    static /* synthetic */ ClickThroughUrlRedirectResolver lambda$null$10(DiConstructor diConstructor) {
        return new ClickThroughUrlRedirectResolver(DiLogLayer.getLoggerFrom(diConstructor), getNetworkActionsFrom(diConstructor), getUrlCreatorFrom(diConstructor), getRedirectPolicyFrom(diConstructor));
    }

    /* access modifiers changed from: private */
    public static ConnectionStatusWatcher createConnectionStatusWatcher(DiConstructor diConstructor) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new PieConnectionStatusWatcher((ConnectivityManager) diConstructor.get(ServerParameters.NETWORK, ConnectivityManager.class));
        }
        return new BaseConnectionStatusWatcher((Application) diConstructor.get(Application.class));
    }

    static /* synthetic */ HttpsOnlyPolicy lambda$registerSecurityPolicies$12(DiConstructor diConstructor) {
        return new HttpsOnlyPolicy(DiLogLayer.getLoggerFrom(diConstructor), Lists.m24071of((T[]) new String[]{(String) diConstructor.get(CoreDiNames.SOMA_API_URL, String.class), (String) diConstructor.get(CoreDiNames.SOMA_VIOLATIONS_AGGREGATOR_URL, String.class)}), getUrlCreatorFrom(diConstructor), getNetworkSecurityPolicyOptional(diConstructor));
    }

    static /* synthetic */ Optional lambda$registerSecurityPolicies$13(DiConstructor diConstructor) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Optional.m24069of(NetworkSecurityPolicy.getInstance());
        }
        return Optional.empty();
    }

    public static ExecutorService getNetworkingExecutorServiceFrom(DiConstructor diConstructor) {
        return (ExecutorService) diConstructor.get(ServerParameters.NETWORK, ExecutorService.class);
    }

    public static HttpsOnlyPolicy getRedirectPolicyFrom(DiConstructor diConstructor) {
        return (HttpsOnlyPolicy) diConstructor.get(HttpsOnlyPolicy.class);
    }

    public static BeaconTracker getBeaconTrackerFrom(DiConstructor diConstructor) {
        return (BeaconTracker) diConstructor.get(ServerParameters.NETWORK, BeaconTracker.class);
    }

    public static UrlCreator getUrlCreatorFrom(DiConstructor diConstructor) {
        return (UrlCreator) diConstructor.get(ServerParameters.NETWORK, UrlCreator.class);
    }

    public static NetworkStateMonitor getNetworkStateMonitorFrom(DiConstructor diConstructor) {
        return (NetworkStateMonitor) diConstructor.get(NetworkStateMonitor.class);
    }

    public static NetworkActions getNetworkActionsFrom(DiConstructor diConstructor) {
        return (NetworkActions) diConstructor.get(NetworkActions.class);
    }

    public static Optional<NetworkSecurityPolicy> getNetworkSecurityPolicyOptional(DiConstructor diConstructor) {
        return (Optional) diConstructor.get("networkSecurityPolicy", Optional.class);
    }

    public static ClickThroughUrlRedirectResolver getUrlRedirectResolverFrom(DiConstructor diConstructor) {
        return (ClickThroughUrlRedirectResolver) diConstructor.get(ClickThroughUrlRedirectResolver.class);
    }
}
