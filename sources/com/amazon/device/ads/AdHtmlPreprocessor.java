package com.amazon.device.ads;

import java.util.Iterator;

class AdHtmlPreprocessor {
    private static final String LOGTAG = AdHtmlPreprocessor.class.getSimpleName();
    private final AdControlAccessor adControlAccessor;
    private final AdUtils2 adUtils;
    private final AdSDKBridgeList bridgeList;
    private final BridgeSelector bridgeSelector;
    private final MobileAdsLogger logger;

    public AdHtmlPreprocessor(BridgeSelector bridgeSelector2, AdSDKBridgeList adSDKBridgeList, AdControlAccessor adControlAccessor2, MobileAdsLoggerFactory mobileAdsLoggerFactory, AdUtils2 adUtils2) {
        this.bridgeSelector = bridgeSelector2;
        this.bridgeList = adSDKBridgeList;
        this.adControlAccessor = adControlAccessor2;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
        this.adUtils = adUtils2;
    }

    private void addAdSDKBridge(AdSDKBridge adSDKBridge) {
        this.bridgeList.addBridge(adSDKBridge);
    }

    public String preprocessHtml(String str, boolean z) {
        for (AdSDKBridgeFactory createAdSDKBridge : this.bridgeSelector.getBridgeFactories(str)) {
            addAdSDKBridge(createAdSDKBridge.createAdSDKBridge(this.adControlAccessor));
        }
        this.logger.mo11019d("Scaling Params: scalingDensity: %f, windowWidth: %d, windowHeight: %d, adWidth: %d, adHeight: %d, scale: %f", Float.valueOf(this.adUtils.getScalingFactorAsFloat()), Integer.valueOf(this.adControlAccessor.getWindowWidth()), Integer.valueOf(this.adControlAccessor.getWindowHeight()), Integer.valueOf((int) (((float) this.adControlAccessor.getAdWidth()) * this.adUtils.getScalingFactorAsFloat())), Integer.valueOf((int) (((float) this.adControlAccessor.getAdHeight()) * this.adUtils.getScalingFactorAsFloat())), Double.valueOf(this.adControlAccessor.getScalingMultiplier()));
        Iterator<AdSDKBridge> it = this.bridgeList.iterator();
        String str2 = "";
        while (it.hasNext()) {
            AdSDKBridge next = it.next();
            if (next.getSDKEventListener() != null) {
                this.adControlAccessor.addSDKEventListener(next.getSDKEventListener());
            }
            if (next.getJavascript() != null) {
                str2 = str2 + next.getJavascript();
            }
            if (next.hasNativeExecution()) {
                this.adControlAccessor.addJavascriptInterface(next.getJavascriptInteractorExecutor(), z, next.getName());
            }
        }
        return addHeadData(ensureHtmlTags(str), str2);
    }

    private String ensureHtmlTags(String str) {
        String str2 = "";
        String str3 = !StringUtils.containsRegEx("\\A\\s*<![Dd][Oo][Cc][Tt][Yy][Pp][Ee]\\s+[Hh][Tt][Mm][Ll][\\s>]", str) ? "<!DOCTYPE html>" : str2;
        if (!StringUtils.containsRegEx("<[Hh][Tt][Mm][Ll][\\s>]", str)) {
            str3 = str3 + "<html>";
            str2 = "</html>";
        }
        if (!StringUtils.containsRegEx("<[Hh][Ee][Aa][Dd][\\s>]", str)) {
            str3 = str3 + "<head></head>";
        }
        if (!StringUtils.containsRegEx("<[Bb][Oo][Dd][Yy][\\s>]", str)) {
            str3 = str3 + "<body>";
            str2 = "</body>" + str2;
        }
        return str3 + str + str2;
    }

    private String addHeadData(String str, String str2) {
        String firstMatch = StringUtils.getFirstMatch("<[Hh][Ee][Aa][Dd](\\s*>|\\s[^>]*>)", str);
        String str3 = "";
        if (!StringUtils.containsRegEx("<[Mm][Ee][Tt][Aa](\\s[^>]*\\s|\\s)[Nn][Aa][Mm][Ee]\\s*=\\s*[\"'][Vv][Ii][Ee][Ww][Pp][Oo][Rr][Tt][\"']", str)) {
            if (this.adControlAccessor.getScalingMultiplier() >= 0.0d) {
                str3 = str3 + "<meta name=\"viewport\" content=\"width=" + this.adControlAccessor.getWindowWidth() + ", height=" + this.adControlAccessor.getWindowHeight() + ", initial-scale=" + this.adUtils.getViewportInitialScale(this.adControlAccessor.getScalingMultiplier()) + ", minimum-scale=" + this.adControlAccessor.getScalingMultiplier() + ", maximum-scale=" + this.adControlAccessor.getScalingMultiplier() + "\"/>";
            } else {
                str3 = str3 + "<meta name=\"viewport\" content=\"width=device-width, height=device-height, user-scalable=no, initial-scale=1.0\"/>";
            }
        }
        String str4 = str3 + "<style>html,body{margin:0;padding:0;height:100%;border:none;}</style>";
        if (str2.length() > 0) {
            str4 = str4 + "<script type='text/javascript'>" + str2 + "</script>";
        }
        return str.replace(firstMatch, firstMatch + str4);
    }
}
