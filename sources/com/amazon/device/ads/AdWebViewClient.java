package com.amazon.device.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

class AdWebViewClient extends WebViewClient {
    protected static final String AAX_REDIRECT_BETA = "aax-beta.integ.amazon.com";
    protected static final String AAX_REDIRECT_GAMMA = "aax-us-east.amazon-adsystem.com";
    protected static final String AAX_REDIRECT_PROD = "aax-us-east.amazon-adsystem.com";
    public static final String AMAZON_MOBILE = "amazonmobile";
    protected static final String CORNERSTONE_BEST_ENDPOINT_BETA = "d16g-cornerstone-bes.integ.amazon.com";
    protected static final String CORNERSTONE_BEST_ENDPOINT_PROD = "pda-bes.amazon.com";
    public static final String GEO = "geo";
    public static final String GOOGLE_STREETVIEW = "google.streetview";
    /* access modifiers changed from: private */
    public static final String LOGTAG = AdWebViewClient.class.getSimpleName();
    public static final String MAILTO = "mailto";
    public static final String SMS = "sms";
    public static final String TELEPHONE = "tel";
    public static final String VOICEMAIL = "voicemail";
    protected static final HashSet<String> intentSchemes;
    protected static Set<String> redirectHosts;
    /* access modifiers changed from: private */
    public final AdControlAccessor adControlAccessor;
    private final AndroidBuildInfo androidBuildInfo;
    private final AdSDKBridgeList bridgeList;
    private final Context context;
    private AdWebViewClientListener listener;
    private final MobileAdsLogger logger;
    private final MobileAdsLoggerFactory loggerFactory;
    private CopyOnWriteArrayList<String> resourceList = new CopyOnWriteArrayList<>();
    private final HashMap<String, UrlExecutor> urlExecutors;
    private final WebUtils2 webUtils;

    interface AdWebViewClientListener {
        void onLoadResource(WebView webView, String str);

        void onPageFinished(WebView webView, String str);

        void onPageStarted(WebView webView, String str);

        void onReceivedError(WebView webView, int i, String str, String str2);
    }

    interface UrlExecutor {
        boolean execute(String str);
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        intentSchemes = hashSet;
        hashSet.add(TELEPHONE);
        intentSchemes.add(VOICEMAIL);
        intentSchemes.add(SMS);
        intentSchemes.add(MAILTO);
        intentSchemes.add(GEO);
        intentSchemes.add(GOOGLE_STREETVIEW);
        HashSet hashSet2 = new HashSet();
        redirectHosts = hashSet2;
        hashSet2.add("aax-us-east.amazon-adsystem.com");
        redirectHosts.add("aax-us-east.amazon-adsystem.com");
        redirectHosts.add(AAX_REDIRECT_BETA);
        redirectHosts.add(CORNERSTONE_BEST_ENDPOINT_PROD);
        redirectHosts.add(CORNERSTONE_BEST_ENDPOINT_BETA);
    }

    public AdWebViewClient(Context context2, AdSDKBridgeList adSDKBridgeList, AdControlAccessor adControlAccessor2, WebUtils2 webUtils2, MobileAdsLoggerFactory mobileAdsLoggerFactory, AndroidBuildInfo androidBuildInfo2) {
        this.context = context2;
        this.urlExecutors = new HashMap<>();
        this.bridgeList = adSDKBridgeList;
        this.adControlAccessor = adControlAccessor2;
        this.webUtils = webUtils2;
        this.loggerFactory = mobileAdsLoggerFactory;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
        this.androidBuildInfo = androidBuildInfo2;
        setupUrlExecutors();
    }

    public void setListener(AdWebViewClientListener adWebViewClientListener) {
        this.listener = adWebViewClientListener;
    }

    private void setupUrlExecutors() {
        this.urlExecutors.put(AMAZON_MOBILE, new AmazonMobileExecutor(this.context, this.loggerFactory, new AmazonDeviceLauncher(), this.webUtils));
        DefaultExecutor defaultExecutor = new DefaultExecutor(this.context);
        Iterator<String> it = intentSchemes.iterator();
        while (it.hasNext()) {
            putUrlExecutor(it.next(), defaultExecutor);
        }
    }

    public void putUrlExecutor(String str, UrlExecutor urlExecutor) {
        this.urlExecutors.put(str, urlExecutor);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.logger.mo11020e("Error: %s", str);
        super.onReceivedError(webView, i, str, str2);
        this.listener.onReceivedError(webView, i, str, str2);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return openUrl(str);
    }

    public boolean openUrl(String str) {
        boolean z = !redirectHosts.contains(Uri.parse(str).getHost()) || isHoneycombVersion();
        if (interpretScheme(str, getScheme(str))) {
            return true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public String getScheme(String str) {
        return this.webUtils.getScheme(str);
    }

    /* access modifiers changed from: protected */
    public boolean interpretScheme(String str, String str2) {
        if (str2 == null) {
            return false;
        }
        if (str2.equals("about") && str.equalsIgnoreCase("about:blank")) {
            return false;
        }
        if (this.urlExecutors.containsKey(str2)) {
            return this.urlExecutors.get(str2).execute(str);
        }
        this.logger.mo11019d("Scheme %s unrecognized. Launching as intent.", str2);
        return this.webUtils.launchActivityForIntentLink(str, this.context);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.listener.onPageStarted(webView, str);
    }

    public void onPageFinished(WebView webView, String str) {
        this.logger.mo11019d("Page Finished %s", str);
        if (!checkResources()) {
            AdWebViewClientListener adWebViewClientListener = this.listener;
            if (adWebViewClientListener == null) {
                this.logger.mo10942w("Call to onPageFinished() ignored because listener is null.");
            } else {
                adWebViewClientListener.onPageFinished(webView, str);
            }
        }
    }

    public void onLoadResource(WebView webView, String str) {
        this.resourceList.add(str);
        this.logger.mo11019d("Loading resource: %s", str);
        this.listener.onLoadResource(webView, str);
    }

    private boolean checkResources() {
        Iterator<String> it = this.resourceList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Set<AdSDKBridgeFactory> bridgeFactoriesForResourceLoad = BridgeSelector.getInstance().getBridgeFactoriesForResourceLoad(it.next());
            if (bridgeFactoriesForResourceLoad.size() > 0) {
                for (AdSDKBridgeFactory createAdSDKBridge : bridgeFactoriesForResourceLoad) {
                    AdSDKBridge createAdSDKBridge2 = createAdSDKBridge.createAdSDKBridge(this.adControlAccessor);
                    if (!this.bridgeList.contains(createAdSDKBridge2)) {
                        z = true;
                        this.bridgeList.addBridge(createAdSDKBridge2);
                    }
                }
            }
        }
        if (z) {
            ThreadUtils.executeOnMainThread(new Runnable() {
                public void run() {
                    AdWebViewClient.this.adControlAccessor.reload();
                }
            });
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public boolean isHoneycombVersion() {
        return AndroidTargetUtils.isBetweenAndroidAPIs(this.androidBuildInfo, 11, 13);
    }

    static class AmazonMobileExecutor implements UrlExecutor {
        private final Context context;
        private final AmazonDeviceLauncher launcher;
        private final MobileAdsLogger logger;
        private final WebUtils2 webUtils;

        AmazonMobileExecutor(Context context2) {
            this(context2, new MobileAdsLoggerFactory(), new AmazonDeviceLauncher(), new WebUtils2());
        }

        AmazonMobileExecutor(Context context2, MobileAdsLoggerFactory mobileAdsLoggerFactory, AmazonDeviceLauncher amazonDeviceLauncher, WebUtils2 webUtils2) {
            this.context = context2;
            this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(AdWebViewClient.LOGTAG);
            this.launcher = amazonDeviceLauncher;
            this.webUtils = webUtils2;
        }

        public boolean execute(String str) {
            specialUrlClicked(str);
            return true;
        }

        public void specialUrlClicked(String str) {
            List<String> list;
            String queryParameter;
            this.logger.mo10938d("Executing AmazonMobile Intent");
            Uri parse = Uri.parse(str);
            try {
                list = parse.getQueryParameters(SDKConstants.PARAM_INTENT);
            } catch (UnsupportedOperationException unused) {
                list = null;
            }
            if (list != null && list.size() > 0) {
                for (String launchExternalActivity : list) {
                    if (launchExternalActivity(launchExternalActivity)) {
                        return;
                    }
                }
                handleApplicationDefinedSpecialURL(str);
            } else if (!this.launcher.isWindowshopPresent(this.context) || this.launcher.isInWindowshopApp(this.context)) {
                handleApplicationDefinedSpecialURL(str);
            } else if (parse.getHost().equals("shopping") && (queryParameter = parse.getQueryParameter("app-action")) != null && queryParameter.length() != 0) {
                if (queryParameter.equals("detail")) {
                    String queryParameter2 = parse.getQueryParameter("asin");
                    if (queryParameter2 != null && queryParameter2.length() != 0) {
                        this.launcher.launchWindowshopDetailPage(this.context, queryParameter2);
                    }
                } else if (queryParameter.equals("search")) {
                    String queryParameter3 = parse.getQueryParameter("keyword");
                    if (queryParameter3 != null && queryParameter3.length() != 0) {
                        this.launcher.launchWindowshopSearchPage(this.context, queryParameter3);
                    }
                } else if (queryParameter.equals("webview")) {
                    handleApplicationDefinedSpecialURL(str);
                }
            }
        }

        /* access modifiers changed from: protected */
        public void handleApplicationDefinedSpecialURL(String str) {
            this.logger.mo11024i("Special url clicked, but was not handled by SDK. Url: %s", str);
        }

        /* access modifiers changed from: protected */
        public boolean launchExternalActivity(String str) {
            return this.webUtils.launchActivityForIntentLink(str, this.context);
        }
    }

    static class DefaultExecutor implements UrlExecutor {
        private final Context context;

        public DefaultExecutor(Context context2) {
            this.context = context2;
        }

        public boolean execute(String str) {
            WebUtils.launchActivityForIntentLink(str, this.context);
            return true;
        }
    }
}
