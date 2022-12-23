package com.unity3d.services.core.api;

import com.unity3d.services.core.connectivity.ConnectivityMonitor;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

/* renamed from: com.unity3d.services.core.api.Connectivity */
public class C9726Connectivity {
    @WebViewExposed
    public static void setConnectionMonitoring(Boolean bool, WebViewCallback webViewCallback) {
        ConnectivityMonitor.setConnectionMonitoring(bool.booleanValue());
        webViewCallback.invoke(new Object[0]);
    }
}
