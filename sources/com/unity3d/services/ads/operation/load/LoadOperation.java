package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.operation.AdOperation;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.bridge.invocation.IWebViewBridgeInvocation;

public class LoadOperation extends AdOperation implements ILoadOperation {
    /* access modifiers changed from: private */
    public LoadOperationState _loadOperationState;

    public LoadOperation(LoadOperationState loadOperationState, IWebViewBridgeInvocation iWebViewBridgeInvocation) {
        super(iWebViewBridgeInvocation, "load");
        this._loadOperationState = loadOperationState;
    }

    public LoadOperationState getLoadOperationState() {
        return this._loadOperationState;
    }

    public void onUnityAdsAdLoaded(final String str) {
        LoadOperationState loadOperationState = this._loadOperationState;
        if (loadOperationState != null && loadOperationState.listener != null && str != null) {
            Utilities.runOnUiThread(new Runnable() {
                public void run() {
                    LoadOperation.this._loadOperationState.listener.onUnityAdsAdLoaded(str);
                }
            });
        }
    }

    public void onUnityAdsFailedToLoad(final String str, final UnityAds.UnityAdsLoadError unityAdsLoadError, final String str2) {
        LoadOperationState loadOperationState = this._loadOperationState;
        if (loadOperationState != null && loadOperationState.listener != null && str != null) {
            Utilities.runOnUiThread(new Runnable() {
                public void run() {
                    LoadOperation.this._loadOperationState.listener.onUnityAdsFailedToLoad(str, unityAdsLoadError, str2);
                }
            });
        }
    }

    public String getId() {
        return this._loadOperationState.f23971id;
    }
}
