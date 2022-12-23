package com.amazon.device.ads;

import android.graphics.Rect;
import com.amazon.device.ads.ThreadUtils;

class AdListenerExecutor {
    private static final String LOGTAG = AdListenerExecutor.class.getSimpleName();
    private final AdListener adListener;
    private final MobileAdsLogger logger;
    private OnAdEventCommand onAdEventCommand;
    private OnAdExpiredCommand onAdExpiredCommand;
    private OnAdReceivedCommand onAdReceivedCommand;
    private OnAdResizedCommand onAdResizedCommand;
    private OnSpecialUrlClickedCommand onSpecialUrlClickedCommand;
    private final ThreadUtils.ThreadRunner threadRunner;

    public AdListenerExecutor(AdListener adListener2, MobileAdsLoggerFactory mobileAdsLoggerFactory) {
        this(adListener2, ThreadUtils.getThreadRunner(), mobileAdsLoggerFactory);
    }

    AdListenerExecutor(AdListener adListener2, ThreadUtils.ThreadRunner threadRunner2, MobileAdsLoggerFactory mobileAdsLoggerFactory) {
        this.adListener = adListener2;
        this.threadRunner = threadRunner2;
        this.logger = mobileAdsLoggerFactory.createMobileAdsLogger(LOGTAG);
    }

    /* access modifiers changed from: package-private */
    public AdListener getAdListener() {
        return this.adListener;
    }

    public void onAdLoaded(final C0898Ad ad, final AdProperties adProperties) {
        execute(new Runnable() {
            public void run() {
                AdListenerExecutor.this.getAdListener().onAdLoaded(ad, adProperties);
            }
        });
    }

    public void onAdFailedToLoad(final C0898Ad ad, final AdError adError) {
        execute(new Runnable() {
            public void run() {
                AdListenerExecutor.this.getAdListener().onAdFailedToLoad(ad, adError);
            }
        });
    }

    public void onAdExpanded(final C0898Ad ad) {
        execute(new Runnable() {
            public void run() {
                AdListenerExecutor.this.getAdListener().onAdExpanded(ad);
            }
        });
    }

    public void onAdCollapsed(final C0898Ad ad) {
        execute(new Runnable() {
            public void run() {
                AdListenerExecutor.this.getAdListener().onAdCollapsed(ad);
            }
        });
    }

    public void onAdDismissed(final C0898Ad ad) {
        execute(new Runnable() {
            public void run() {
                AdListenerExecutor.this.getAdListener().onAdDismissed(ad);
            }
        });
    }

    public void onAdResized(C0898Ad ad, Rect rect) {
        OnAdResizedCommand onAdResizedCommand2 = this.onAdResizedCommand;
        if (onAdResizedCommand2 == null) {
            this.logger.mo10938d("Ad listener called - Ad Resized.");
        } else {
            onAdResizedCommand2.onAdResized(ad, rect);
        }
    }

    public void onAdExpired(C0898Ad ad) {
        OnAdExpiredCommand onAdExpiredCommand2 = this.onAdExpiredCommand;
        if (onAdExpiredCommand2 == null) {
            this.logger.mo10938d("Ad listener called - Ad Expired.");
        } else {
            onAdExpiredCommand2.onAdExpired(ad);
        }
    }

    public void onSpecialUrlClicked(C0898Ad ad, String str) {
        OnSpecialUrlClickedCommand onSpecialUrlClickedCommand2 = this.onSpecialUrlClickedCommand;
        if (onSpecialUrlClickedCommand2 == null) {
            this.logger.mo10938d("Ad listener called - Special Url Clicked.");
        } else {
            onSpecialUrlClickedCommand2.onSpecialUrlClicked(ad, str);
        }
    }

    public ActionCode onAdReceived(C0898Ad ad, AdData adData) {
        OnAdReceivedCommand onAdReceivedCommand2 = this.onAdReceivedCommand;
        if (onAdReceivedCommand2 != null) {
            return onAdReceivedCommand2.onAdReceived(ad, adData);
        }
        this.logger.mo10938d("Ad listener called - Ad Received.");
        return ActionCode.DISPLAY;
    }

    public void onAdEvent(AdEvent adEvent) {
        OnAdEventCommand onAdEventCommand2 = this.onAdEventCommand;
        if (onAdEventCommand2 == null) {
            MobileAdsLogger mobileAdsLogger = this.logger;
            mobileAdsLogger.mo10938d("Ad listener called - Ad Event: " + adEvent);
            return;
        }
        onAdEventCommand2.onAdEvent(adEvent);
    }

    /* access modifiers changed from: protected */
    public void execute(Runnable runnable) {
        this.threadRunner.execute(runnable, ThreadUtils.ExecutionStyle.SCHEDULE, ThreadUtils.ExecutionThread.MAIN_THREAD);
    }

    public void setOnAdEventCommand(OnAdEventCommand onAdEventCommand2) {
        this.onAdEventCommand = onAdEventCommand2;
    }

    public void setOnAdResizedCommand(OnAdResizedCommand onAdResizedCommand2) {
        this.onAdResizedCommand = onAdResizedCommand2;
    }

    public void setOnAdExpiredCommand(OnAdExpiredCommand onAdExpiredCommand2) {
        this.onAdExpiredCommand = onAdExpiredCommand2;
    }

    public void setOnSpecialUrlClickedCommand(OnSpecialUrlClickedCommand onSpecialUrlClickedCommand2) {
        this.onSpecialUrlClickedCommand = onSpecialUrlClickedCommand2;
    }

    public void setOnAdReceivedCommand(OnAdReceivedCommand onAdReceivedCommand2) {
        this.onAdReceivedCommand = onAdReceivedCommand2;
    }
}
