package com.fyber.inneractive.sdk.p049h;

import com.google.common.net.HttpHeaders;

/* renamed from: com.fyber.inneractive.sdk.h.i */
public enum C2960i {
    AD_TIMEOUT("X-IA-SESSION-TIMEOUT"),
    RETURNED_AD_TYPE("X-IA-Ad-Type"),
    HEIGHT("X-IA-Ad-Height"),
    WIDTH("X-IA-Ad-Width"),
    AD_NETWORK("X-IA-AdNetwork"),
    AD_NETWORK_ID("X-IA-AdNetwork-Id"),
    CLIENT_UNIQUE_ID("X-IA-Cuid"),
    ERROR_CODE("X-IA-Error"),
    SESSION_ID("X-IA-Session"),
    CONTENT_ID("X-IA-Content"),
    PUBLISHER_ID("X-IA-Publisher"),
    AD_UNIT_ID("X-IA-Ad-Unit-ID"),
    AD_UNIT_TYPE("X-IA-Ad-Unit-Type"),
    AD_COMPLETION_URL("X-IA-Completion"),
    AD_UNIT_DISPLAY_TYPE("X-IA-Ad-Unit-Display-Type"),
    AD_DOMAIN("X-IA-Adomain"),
    APP_BUNDLE("X-IA-App-Bundle"),
    CAMPAIGN_ID("X-IA-Campaign-ID"),
    CREATIVE_ID("X-IA-Creative-ID"),
    SDK_ADAPTER_NAME("X-IA-SdkAdapterName"),
    SDK_ADAPTER_DATA("X-IA-SdkAdapterData"),
    CPM_VALUE("X-IA-Pricing-Value"),
    CPM_CURRENCY("X-IA-Pricing-Currency"),
    LOCATION(HttpHeaders.LOCATION),
    SDK_IMPRESSION_URL("X-IA-sdkImpressionUrl"),
    SDK_CLICK_URL("X-IA-sdkClickUrl"),
    BANNER_MRC_PERCENT("X-IA-MRC-Percent"),
    BANNER_MRC_DURATION("X-IA-MRC-Duration"),
    BANNER_MRC_IMPRESSION_URL("X-IA-MRC-Impression"),
    INTERSTITIAL_SKIP_MODE("X-IA-skipMode");
    

    /* renamed from: E */
    public final String f7154E;

    private C2960i(String str) {
        this.f7154E = str;
    }
}
