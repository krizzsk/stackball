package com.amazon.device.ads;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.webkit.WebViewDatabase;

class WebViewFactory {
    private static WebViewFactory instance = new WebViewFactory();
    private final MobileAdsCookieManager cookieManager;
    private final DebugProperties debugProperties;
    private final MobileAdsInfoStore infoStore;
    private final MobileAdsLoggerFactory loggerFactory;
    private final WebViewConstructor webViewConstructor;
    private boolean webViewDebugging;

    protected WebViewFactory() {
        this(MobileAdsInfoStore.getInstance(), new MobileAdsLoggerFactory(), DebugProperties.getInstance(), new MobileAdsCookieManager(), new WebViewConstructor());
    }

    WebViewFactory(MobileAdsInfoStore mobileAdsInfoStore, MobileAdsLoggerFactory mobileAdsLoggerFactory, DebugProperties debugProperties2, MobileAdsCookieManager mobileAdsCookieManager, WebViewConstructor webViewConstructor2) {
        this.webViewDebugging = false;
        this.infoStore = mobileAdsInfoStore;
        this.loggerFactory = mobileAdsLoggerFactory;
        this.debugProperties = debugProperties2;
        this.cookieManager = mobileAdsCookieManager;
        this.webViewConstructor = webViewConstructor2;
    }

    public static final WebViewFactory getInstance() {
        return instance;
    }

    public synchronized WebView createWebView(Context context) {
        WebView createWebView;
        shouldDebugWebViews();
        createWebView = this.webViewConstructor.createWebView(context.getApplicationContext());
        this.infoStore.getDeviceInfo().setUserAgentString(createWebView.getSettings().getUserAgentString());
        createWebView.getSettings().setUserAgentString(this.infoStore.getDeviceInfo().getUserAgentString());
        this.cookieManager.createCookieSyncManager(context);
        updateAdIdCookie();
        return createWebView;
    }

    private void updateAdIdCookie() {
        if (this.cookieManager.isCookieSyncManagerCreated()) {
            String adId = this.infoStore.getRegistrationInfo().getAdId();
            if (adId == null) {
                adId = "";
            }
            MobileAdsCookieManager mobileAdsCookieManager = this.cookieManager;
            mobileAdsCookieManager.setCookie("http://amazon-adsystem.com", "ad-id=" + adId + "; Domain=.amazon-adsystem.com");
        }
    }

    public boolean isWebViewOk(Context context) {
        try {
            return WebViewDatabase.getInstance(context) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean setJavaScriptEnabledForWebView(boolean z, WebView webView, String str) {
        try {
            webView.getSettings().setJavaScriptEnabled(z);
            return true;
        } catch (NullPointerException unused) {
            this.loggerFactory.createMobileAdsLogger(str).mo10942w("Could not set JavaScriptEnabled because a NullPointerException was encountered.");
            return false;
        }
    }

    private void shouldDebugWebViews() {
        boolean booleanValue = this.debugProperties.getDebugPropertyAsBoolean(DebugProperties.DEBUG_WEBVIEWS, Boolean.valueOf(this.webViewDebugging)).booleanValue();
        if (booleanValue != this.webViewDebugging) {
            this.webViewDebugging = booleanValue;
            AndroidTargetUtils.enableWebViewDebugging(booleanValue);
        }
    }

    static class MobileAdsCookieManager {
        private boolean cookieSyncManagerCreated = false;

        MobileAdsCookieManager() {
        }

        public void createCookieSyncManager(Context context) {
            if (!this.cookieSyncManagerCreated) {
                CookieSyncManager.createInstance(context);
                this.cookieSyncManagerCreated = true;
            }
        }

        public void setCookie(String str, String str2) {
            CookieManager.getInstance().setCookie(str, str2);
        }

        public boolean isCookieSyncManagerCreated() {
            return this.cookieSyncManagerCreated;
        }

        public void startSync() {
            CookieSyncManager.getInstance().startSync();
        }

        public void stopSync() {
            CookieSyncManager.getInstance().stopSync();
        }
    }

    static class WebViewConstructor {
        WebViewConstructor() {
        }

        public WebView createWebView(Context context) {
            return new WebView(context);
        }
    }
}
