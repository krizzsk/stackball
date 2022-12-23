package com.unity3d.services.ads;

import android.app.Activity;
import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.properties.AdsProperties;
import com.unity3d.services.IUnityServicesListener;
import com.unity3d.services.UnityServices;
import com.unity3d.services.ads.operation.load.LoadModule;
import com.unity3d.services.ads.operation.load.LoadOperationState;
import com.unity3d.services.ads.operation.show.ShowModule;
import com.unity3d.services.ads.operation.show.ShowOperationState;
import com.unity3d.services.ads.placement.Placement;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.bridge.WebViewBridgeInvoker;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class UnityAdsImplementation {
    static ExecutorService _showExecutorService = Executors.newSingleThreadExecutor();
    private static Configuration configuration = null;
    private static WebViewBridgeInvoker webViewBridgeInvoker = new WebViewBridgeInvoker();

    public static void initialize(Context context, String str, IUnityAdsListener iUnityAdsListener) {
        initialize(context, str, iUnityAdsListener, false);
    }

    public static void initialize(Context context, String str, IUnityAdsListener iUnityAdsListener, boolean z) {
        initialize(context, str, iUnityAdsListener, z, false, (IUnityAdsInitializationListener) null);
    }

    public static void initialize(Context context, String str, final IUnityAdsListener iUnityAdsListener, boolean z, boolean z2, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        DeviceLog.entered();
        addListener(iUnityAdsListener);
        UnityServices.initialize(context, str, new IUnityServicesListener() {
            public void onUnityServicesError(UnityServices.UnityServicesError unityServicesError, String str) {
                if (IUnityAdsListener.this != null) {
                    if (unityServicesError == UnityServices.UnityServicesError.INIT_SANITY_CHECK_FAIL) {
                        IUnityAdsListener.this.onUnityAdsError(UnityAds.UnityAdsError.INIT_SANITY_CHECK_FAIL, str);
                    } else if (unityServicesError == UnityServices.UnityServicesError.INVALID_ARGUMENT) {
                        IUnityAdsListener.this.onUnityAdsError(UnityAds.UnityAdsError.INVALID_ARGUMENT, str);
                    }
                }
            }
        }, z, z2, iUnityAdsInitializationListener);
    }

    public static boolean isInitialized() {
        return UnityServices.isInitialized();
    }

    @Deprecated
    public static void setListener(IUnityAdsListener iUnityAdsListener) {
        AdsProperties.setListener(iUnityAdsListener);
    }

    @Deprecated
    public static IUnityAdsListener getListener() {
        return AdsProperties.getListener();
    }

    public static void addListener(IUnityAdsListener iUnityAdsListener) {
        AdsProperties.addListener(iUnityAdsListener);
    }

    public static void removeListener(IUnityAdsListener iUnityAdsListener) {
        AdsProperties.removeListener(iUnityAdsListener);
    }

    public static boolean isSupported() {
        return UnityServices.isSupported();
    }

    public static String getVersion() {
        return UnityServices.getVersion();
    }

    public static boolean isReady() {
        return isSupported() && isInitialized() && Placement.isReady();
    }

    public static boolean isReady(String str) {
        return isSupported() && isInitialized() && str != null && Placement.isReady(str);
    }

    public static UnityAds.PlacementState getPlacementState() {
        if (!isSupported() || !isInitialized()) {
            return UnityAds.PlacementState.NOT_AVAILABLE;
        }
        return Placement.getPlacementState();
    }

    public static UnityAds.PlacementState getPlacementState(String str) {
        if (!isSupported() || !isInitialized() || str == null) {
            return UnityAds.PlacementState.NOT_AVAILABLE;
        }
        return Placement.getPlacementState(str);
    }

    public static void show(Activity activity) {
        if (Placement.getDefaultPlacement() != null) {
            show(activity, Placement.getDefaultPlacement());
        } else {
            handleLegacyListenerShowError("", UnityAds.UnityAdsError.NOT_INITIALIZED, "Unity Ads default placement is not initialized");
        }
    }

    public static void show(Activity activity, String str) {
        show(activity, str, new UnityAdsShowOptions(), (IUnityAdsShowListener) null);
    }

    public static void show(Activity activity, String str, IUnityAdsShowListener iUnityAdsShowListener) {
        show(activity, str, new UnityAdsShowOptions(), iUnityAdsShowListener);
    }

    public static void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, IUnityAdsShowListener iUnityAdsShowListener) {
        if (!isSupported()) {
            handleLegacyListenerShowError(str, UnityAds.UnityAdsError.NOT_INITIALIZED, "Unity Ads is not supported for this device");
            handleShowError(iUnityAdsShowListener, str, UnityAds.UnityAdsShowError.NOT_INITIALIZED, "Unity Ads is not supported for this device");
        } else if (!isInitialized()) {
            handleLegacyListenerShowError(str, UnityAds.UnityAdsError.NOT_INITIALIZED, "Unity Ads is not initialized");
            handleShowError(iUnityAdsShowListener, str, UnityAds.UnityAdsShowError.NOT_INITIALIZED, "Unity Ads is not initialized");
        } else if (activity == null) {
            handleLegacyListenerShowError(str, UnityAds.UnityAdsError.INVALID_ARGUMENT, "Activity must not be null");
            handleShowError(iUnityAdsShowListener, str, UnityAds.UnityAdsShowError.INVALID_ARGUMENT, "Activity must not be null");
        } else {
            Configuration configuration2 = configuration;
            if (configuration2 == null) {
                configuration2 = new Configuration();
            }
            ClientProperties.setActivity(activity);
            ShowModule.getInstance().executeAdOperation(WebViewApp.getCurrentApp(), new ShowOperationState(str, iUnityAdsShowListener, activity, unityAdsShowOptions, configuration2));
        }
    }

    private static void handleShowError(IUnityAdsShowListener iUnityAdsShowListener, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        if (iUnityAdsShowListener != null) {
            iUnityAdsShowListener.onUnityAdsShowFailure(str, unityAdsShowError, str2);
        }
    }

    private static void handleLegacyListenerShowError(final String str, final UnityAds.UnityAdsError unityAdsError, String str2) {
        final String str3 = "Unity Ads show failed: " + str2;
        DeviceLog.error(str3);
        Utilities.runOnUiThread(new Runnable() {
            public void run() {
                for (IUnityAdsListener next : AdsProperties.getListeners()) {
                    next.onUnityAdsError(UnityAds.UnityAdsError.this, str3);
                    String str = str;
                    if (str != null) {
                        next.onUnityAdsFinish(str, UnityAds.FinishState.ERROR);
                    } else {
                        next.onUnityAdsFinish("", UnityAds.FinishState.ERROR);
                    }
                }
            }
        });
    }

    public static void setDebugMode(boolean z) {
        UnityServices.setDebugMode(z);
    }

    public static boolean getDebugMode() {
        return UnityServices.getDebugMode();
    }

    public static void load(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener) {
        Configuration configuration2 = configuration;
        if (configuration2 == null) {
            configuration2 = new Configuration();
        }
        LoadModule.getInstance().executeAdOperation(webViewBridgeInvoker, new LoadOperationState(str, iUnityAdsLoadListener, unityAdsLoadOptions, configuration2));
    }

    public static String getToken() {
        return TokenStorage.getToken();
    }

    public static void setConfiguration(Configuration configuration2) {
        configuration = configuration2;
    }
}
