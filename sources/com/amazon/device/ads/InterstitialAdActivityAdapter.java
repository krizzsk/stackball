package com.amazon.device.ads;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.ViewGroup;
import com.amazon.device.ads.AdActivity;
import com.amazon.device.ads.SDKEvent;

class InterstitialAdActivityAdapter implements AdActivity.AdActivityAdapter {
    private static final String LOGTAG = InterstitialAdActivityAdapter.class.getSimpleName();
    private Activity activity = null;
    private AdController adController;
    private final AndroidBuildInfo buildInfo = new AndroidBuildInfo();
    private final MobileAdsLogger logger = new MobileAdsLoggerFactory().createMobileAdsLogger(LOGTAG);

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onResume() {
    }

    InterstitialAdActivityAdapter() {
    }

    public void setActivity(Activity activity2) {
        this.activity = activity2;
    }

    public void preOnCreate() {
        this.activity.requestWindowFeature(1);
        this.activity.getWindow().setFlags(1024, 1024);
        AndroidTargetUtils.hideActionAndStatusBars(this.buildInfo, this.activity);
    }

    public void onCreate() {
        AndroidTargetUtils.enableHardwareAcceleration(this.buildInfo, this.activity.getWindow());
        AdController adController2 = getAdController();
        this.adController = adController2;
        if (adController2 == null) {
            this.logger.mo10939e("Failed to show interstitial ad due to an error in the Activity.");
            InterstitialAd.resetIsAdShowing();
            this.activity.finish();
            return;
        }
        adController2.setAdActivity(this.activity);
        this.adController.addSDKEventListener(new InterstitialAdSDKEventListener());
        ViewGroup viewGroup = (ViewGroup) this.adController.getView().getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.adController.getView());
        }
        this.activity.setContentView(this.adController.getView());
        this.adController.adShown();
    }

    /* access modifiers changed from: package-private */
    public AdController getAdController() {
        return AdControllerFactory.getCachedAdController();
    }

    public void onPause() {
        AdController adController2 = this.adController;
        if (adController2 != null) {
            adController2.fireViewableEvent();
        }
    }

    public void onStop() {
        AdController adController2;
        if (this.activity.isFinishing() && (adController2 = this.adController) != null) {
            adController2.fireViewableEvent();
            this.adController.closeAd();
        }
    }

    public void onDestroy() {
        AdController adController2 = this.adController;
        if (adController2 != null) {
            adController2.fireViewableEvent();
            this.adController.closeAd();
        }
    }

    public boolean onBackPressed() {
        AdController adController2 = this.adController;
        if (adController2 != null) {
            return adController2.onBackButtonPress();
        }
        return false;
    }

    public void onWindowFocusChanged() {
        AdController adController2 = this.adController;
        if (adController2 != null) {
            adController2.fireViewableEvent();
        }
    }

    /* access modifiers changed from: package-private */
    public Activity getActivity() {
        return this.activity;
    }

    /* access modifiers changed from: private */
    public void finishActivity() {
        if (!this.activity.isFinishing()) {
            this.adController = null;
            this.activity.finish();
        }
    }

    class InterstitialAdSDKEventListener implements SDKEventListener {
        InterstitialAdSDKEventListener() {
        }

        public void onSDKEvent(SDKEvent sDKEvent, AdControlAccessor adControlAccessor) {
            if (sDKEvent.getEventType().equals(SDKEvent.SDKEventType.CLOSED)) {
                InterstitialAdActivityAdapter.this.finishActivity();
            }
        }
    }
}
