package com.amazon.device.ads;

import com.amazon.device.ads.AdWebViewClient;
import com.amazon.device.ads.ThreadUtils;
import com.amazon.device.ads.WebRequest;

class AdUrlLoader {
    private static final String LOGTAG = AdUrlLoader.class.getSimpleName();
    /* access modifiers changed from: private */
    public final AdControlAccessor adControlAccessor;
    private final AdWebViewClient adWebViewClient;
    private final DeviceInfo deviceInfo;
    private final MobileAdsLogger logger;
    private final ThreadUtils.ThreadRunner threadRunner;
    private final WebRequest.WebRequestFactory webRequestFactory;
    private final WebUtils2 webUtils;

    public AdUrlLoader(ThreadUtils.ThreadRunner threadRunner2, AdWebViewClient adWebViewClient2, WebRequest.WebRequestFactory webRequestFactory2, AdControlAccessor adControlAccessor2, WebUtils2 webUtils2, MobileAdsLoggerFactory mobileAdsLoggerFactory, DeviceInfo deviceInfo2) {
        this.threadRunner = threadRunner2;
        this.adWebViewClient = adWebViewClient2;
        this.webRequestFactory = webRequestFactory2;
        this.adControlAccessor = adControlAccessor2;
        this.webUtils = webUtils2;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
        this.deviceInfo = deviceInfo2;
    }

    public void putUrlExecutorInAdWebViewClient(String str, AdWebViewClient.UrlExecutor urlExecutor) {
        this.adWebViewClient.putUrlExecutor(str, urlExecutor);
    }

    public void setAdWebViewClientListener(AdWebViewClient.AdWebViewClientListener adWebViewClientListener) {
        this.adWebViewClient.setListener(adWebViewClientListener);
    }

    public AdWebViewClient getAdWebViewClient() {
        return this.adWebViewClient;
    }

    public void loadUrl(final String str, final boolean z, final PreloadCallback preloadCallback) {
        String scheme = this.webUtils.getScheme(str);
        if (scheme.equals("http") || scheme.equals("https")) {
            this.threadRunner.execute(new Runnable() {
                public void run() {
                    AdUrlLoader.this.loadUrlInThread(str, z, preloadCallback);
                }
            }, ThreadUtils.ExecutionStyle.RUN_ASAP, ThreadUtils.ExecutionThread.BACKGROUND_THREAD);
        } else {
            openUrl(str);
        }
    }

    /* access modifiers changed from: private */
    public void loadUrlInThread(String str, boolean z, PreloadCallback preloadCallback) {
        WebRequest.WebResponse webResponse;
        WebRequest createWebRequest = this.webRequestFactory.createWebRequest();
        createWebRequest.setExternalLogTag(LOGTAG);
        createWebRequest.enableLogUrl(true);
        createWebRequest.setUrlString(str);
        createWebRequest.putHeader("User-Agent", this.deviceInfo.getUserAgentString());
        try {
            webResponse = createWebRequest.makeCall();
        } catch (WebRequest.WebRequestException e) {
            this.logger.mo11020e("Could not load URL (%s) into AdContainer: %s", str, e.getMessage());
            webResponse = null;
        }
        if (webResponse != null) {
            final String readAsString = webResponse.getResponseReader().readAsString();
            if (readAsString != null) {
                final String str2 = str;
                final boolean z2 = z;
                final PreloadCallback preloadCallback2 = preloadCallback;
                this.threadRunner.execute(new Runnable() {
                    public void run() {
                        AdUrlLoader.this.adControlAccessor.loadHtml(str2, readAsString, z2, preloadCallback2);
                    }
                }, ThreadUtils.ExecutionStyle.RUN_ASAP, ThreadUtils.ExecutionThread.MAIN_THREAD);
                return;
            }
            this.logger.mo11020e("Could not load URL (%s) into AdContainer.", str);
        }
    }

    public void openUrl(String str) {
        this.adWebViewClient.openUrl(str);
    }
}
