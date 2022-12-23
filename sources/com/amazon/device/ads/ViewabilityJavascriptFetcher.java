package com.amazon.device.ads;

import com.amazon.device.ads.Configuration;
import com.amazon.device.ads.Metrics;
import com.amazon.device.ads.ThreadUtils;
import com.amazon.device.ads.WebRequest;

class ViewabilityJavascriptFetcher {
    private static final String CDN_URL = "https://dwxjayoxbnyrr.cloudfront.net/amazon-ads.viewablejs";
    private static final String LOGTAG = ViewabilityJavascriptFetcher.class.getSimpleName();
    private static ViewabilityJavascriptFetcher instance = new ViewabilityJavascriptFetcher();
    private final Configuration configuration;
    private int currentJSVersion;
    private final DebugProperties debugProperties;
    private final MobileAdsInfoStore infoStore;
    private final MobileAdsLogger logger;
    private final Metrics metrics;
    private final PermissionChecker permissionChecker;
    private final Settings settings;
    private final ThreadUtils.ThreadRunner threadRunner;
    private final WebRequest.WebRequestFactory webRequestFactory;

    protected ViewabilityJavascriptFetcher() {
        this(new MobileAdsLoggerFactory(), new PermissionChecker(), DebugProperties.getInstance(), Settings.getInstance(), new WebRequest.WebRequestFactory(), Metrics.getInstance(), ThreadUtils.getThreadRunner(), MobileAdsInfoStore.getInstance(), Configuration.getInstance());
    }

    ViewabilityJavascriptFetcher(MobileAdsLoggerFactory mobileAdsLoggerFactory, PermissionChecker permissionChecker2, DebugProperties debugProperties2, Settings settings2, WebRequest.WebRequestFactory webRequestFactory2, Metrics metrics2, ThreadUtils.ThreadRunner threadRunner2, MobileAdsInfoStore mobileAdsInfoStore, Configuration configuration2) {
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
        this.permissionChecker = permissionChecker2;
        this.debugProperties = debugProperties2;
        this.settings = settings2;
        this.webRequestFactory = webRequestFactory2;
        this.metrics = metrics2;
        this.threadRunner = threadRunner2;
        this.infoStore = mobileAdsInfoStore;
        this.configuration = configuration2;
    }

    private boolean shouldFetch() {
        this.currentJSVersion = this.configuration.getInt(Configuration.ConfigOption.VIEWABLE_JS_VERSION_CONFIG);
        if (this.settings.getInt("viewableJSVersionStored", -1) >= this.currentJSVersion && !StringUtils.isNullOrEmpty(this.settings.getString("viewableJSSettingsNameAmazonAdSDK", (String) null))) {
            return false;
        }
        return true;
    }

    public void fetchJavascript() {
        if (shouldFetch()) {
            beginFetch();
        }
    }

    /* access modifiers changed from: protected */
    public void beginFetch() {
        this.threadRunner.execute(new Runnable() {
            public void run() {
                ViewabilityJavascriptFetcher.this.fetchJavascriptFromURLOnBackgroundThread();
            }
        }, ThreadUtils.ExecutionStyle.SCHEDULE, ThreadUtils.ExecutionThread.BACKGROUND_THREAD);
    }

    public void fetchJavascriptFromURLOnBackgroundThread() {
        this.logger.mo10938d("In ViewabilityJavascriptFetcher background thread");
        if (!this.permissionChecker.hasInternetPermission(this.infoStore.getApplicationContext())) {
            this.logger.mo10939e("Network task cannot commence because the INTERNET permission is missing from the app's manifest.");
            onFetchFailure();
            return;
        }
        WebRequest createWebRequest = createWebRequest();
        if (createWebRequest == null) {
            onFetchFailure();
            return;
        }
        try {
            this.settings.putString("viewableJSSettingsNameAmazonAdSDK", createWebRequest.makeCall().getResponseReader().readAsString());
            this.settings.putInt("viewableJSVersionStored", this.currentJSVersion);
            this.logger.mo10938d("Viewability Javascript fetched and saved");
        } catch (WebRequest.WebRequestException unused) {
            onFetchFailure();
        }
    }

    /* access modifiers changed from: protected */
    public WebRequest createWebRequest() {
        WebRequest createWebRequest = this.webRequestFactory.createWebRequest();
        createWebRequest.setExternalLogTag(LOGTAG);
        createWebRequest.enableLog(true);
        createWebRequest.setUrlString(this.configuration.getStringWithDefault(Configuration.ConfigOption.VIEWABLE_JAVASCRIPT_URL, CDN_URL));
        createWebRequest.setMetricsCollector(this.metrics.getMetricsCollector());
        createWebRequest.setServiceCallLatencyMetric(Metrics.MetricType.CDN_JAVASCRIPT_DOWLOAD_LATENCY);
        createWebRequest.setUseSecure(this.debugProperties.getDebugPropertyAsBoolean(DebugProperties.DEBUG_AAX_CONFIG_USE_SECURE, true).booleanValue());
        return createWebRequest;
    }

    private void onFetchFailure() {
        this.metrics.getMetricsCollector().incrementMetric(Metrics.MetricType.CDN_JAVASCRIPT_DOWNLOAD_FAILED);
        this.logger.mo10942w("Viewability Javascript fetch failed");
    }

    public static final ViewabilityJavascriptFetcher getInstance() {
        return instance;
    }
}
