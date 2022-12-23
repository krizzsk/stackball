package com.amazon.device.ads;

import android.graphics.Rect;
import android.view.View;
import android.webkit.WebView;
import com.amazon.device.ads.MobileAdsLogger;
import org.json.JSONException;
import org.json.JSONObject;

class ViewabilityChecker {
    static final String HEIGHT_AD = "height";
    static final String INSTRUMENTATION_URL = "instrumentationPixelUrl";
    static final String IS_AD_ONSCREEN = "isAdOnScreen";
    private static final String LOGTAG = ViewabilityChecker.class.getSimpleName();
    static final String VIEWABLE_PERCENTAGE = "viewablePercentage";
    static final String WIDTH_AD = "width";
    static final String X_POSITION_AD = "x";
    static final String Y_POSITION_AD = "y";
    private final AdController adController;
    private float adTotalArea;
    private View adView;
    private final MobileAdsLogger logger;
    private ViewabilityOverlapCalculator viewabilityOverlapCalculator;

    public ViewabilityChecker(AdController adController2) {
        this(adController2, new MobileAdsLoggerFactory(), new ViewabilityOverlapCalculator(adController2));
    }

    ViewabilityChecker(AdController adController2, MobileAdsLoggerFactory mobileAdsLoggerFactory, ViewabilityOverlapCalculator viewabilityOverlapCalculator2) {
        this.adController = adController2;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
        if (this.adController != null) {
            this.viewabilityOverlapCalculator = viewabilityOverlapCalculator2;
            return;
        }
        throw new IllegalArgumentException("AdController is null");
    }

    public ViewabilityInfo getViewabilityInfo() {
        float f;
        Rect rect = new Rect();
        WebView currentAdView = this.adController.getAdContainer().getCurrentAdView();
        this.adView = currentAdView;
        if (currentAdView == null) {
            this.adTotalArea = 0.0f;
        } else {
            this.adTotalArea = (float) (currentAdView.getWidth() * this.adView.getHeight());
        }
        if (((double) this.adTotalArea) == 0.0d) {
            this.logger.mo10942w("AdView width and height not set");
            return null;
        }
        boolean globalVisibleRect = this.adView.getGlobalVisibleRect(rect);
        boolean isShown = this.adView.isShown();
        boolean hasWindowFocus = hasWindowFocus();
        boolean isAdTransparent = AndroidTargetUtils.isAdTransparent(this.adController.getAdContainer());
        boolean z = false;
        if (isAdTransparent) {
            this.logger.forceLog(MobileAdsLogger.Level.WARN, "This ad view is transparent therefore it will not be considered viewable. Please ensure the ad view is completely opaque.", new Object[0]);
        }
        this.logger.mo11019d("IsAdVisible: %s, IsAdShown: %s, windowHasFocus: %s, IsAdTransparent: %s", Boolean.valueOf(globalVisibleRect), Boolean.valueOf(isShown), Boolean.valueOf(hasWindowFocus), Boolean.valueOf(isAdTransparent));
        boolean z2 = globalVisibleRect && isShown && hasWindowFocus && !isAdTransparent;
        if (!z2) {
            f = 0.0f;
        } else if (this.adController.isModal()) {
            f = 100.0f;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            f = this.viewabilityOverlapCalculator.calculateViewablePercentage(this.adView, rect);
            this.logger.mo11019d("Total computation time: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
        if (f != 0.0f) {
            z = z2;
        }
        return new ViewabilityInfo(z, getJSONObject(f, z, this.adView));
    }

    private JSONObject getJSONObject(float f, boolean z, View view) {
        JSONObject jSONObject = new JSONObject();
        int[] iArr = new int[2];
        try {
            jSONObject.put(VIEWABLE_PERCENTAGE, (double) f);
            jSONObject.put("width", view.getWidth());
            jSONObject.put("height", view.getHeight());
            if (z) {
                this.adView.getLocationOnScreen(iArr);
            }
            jSONObject.put(X_POSITION_AD, iArr[0]);
            jSONObject.put(Y_POSITION_AD, iArr[1]);
            return jSONObject;
        } catch (JSONException e) {
            this.logger.mo11028w("JSON Error occured %s", e.getMessage());
            return null;
        }
    }

    private boolean hasWindowFocus() {
        View rootView = this.adController.getRootView();
        if (rootView == null) {
            return false;
        }
        return rootView.hasWindowFocus();
    }
}
