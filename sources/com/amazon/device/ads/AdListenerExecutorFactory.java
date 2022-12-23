package com.amazon.device.ads;

import android.graphics.Rect;

class AdListenerExecutorFactory {
    private final AdListenerExecutorConstructor adListenerExecutorConstructor;
    private final MobileAdsLoggerFactory loggerFactory;

    public AdListenerExecutorFactory(MobileAdsLoggerFactory mobileAdsLoggerFactory) {
        this(mobileAdsLoggerFactory, new AdListenerExecutorConstructor());
    }

    public AdListenerExecutorFactory(MobileAdsLoggerFactory mobileAdsLoggerFactory, AdListenerExecutorConstructor adListenerExecutorConstructor2) {
        this.loggerFactory = mobileAdsLoggerFactory;
        this.adListenerExecutorConstructor = adListenerExecutorConstructor2;
    }

    /* access modifiers changed from: protected */
    public MobileAdsLoggerFactory getLoggerFactory() {
        return this.loggerFactory;
    }

    public AdListenerExecutor createAdListenerExecutor(AdListener adListener) {
        return createAdListenerExecutor(adListener, this.loggerFactory);
    }

    public AdListenerExecutor createAdListenerExecutor(AdListener adListener, MobileAdsLoggerFactory mobileAdsLoggerFactory) {
        AdListenerExecutor createAdListenerExecutor = this.adListenerExecutorConstructor.createAdListenerExecutor(adListener, mobileAdsLoggerFactory);
        if (adListener instanceof ExtendedAdListener) {
            createAdResizedCommand(createAdListenerExecutor);
            createAdExpiredCommand(createAdListenerExecutor);
        }
        return createAdListenerExecutor;
    }

    private void createAdResizedCommand(final AdListenerExecutor adListenerExecutor) {
        adListenerExecutor.setOnAdResizedCommand(new OnAdResizedCommand() {
            public void onAdResized(final C0898Ad ad, final Rect rect) {
                adListenerExecutor.execute(new Runnable() {
                    public void run() {
                        ((ExtendedAdListener) adListenerExecutor.getAdListener()).onAdResized(ad, rect);
                    }
                });
            }
        });
    }

    private void createAdExpiredCommand(final AdListenerExecutor adListenerExecutor) {
        adListenerExecutor.setOnAdExpiredCommand(new OnAdExpiredCommand() {
            public void onAdExpired(final C0898Ad ad) {
                adListenerExecutor.execute(new Runnable() {
                    public void run() {
                        ((ExtendedAdListener) adListenerExecutor.getAdListener()).onAdExpired(ad);
                    }
                });
            }
        });
    }

    static class AdListenerExecutorConstructor {
        AdListenerExecutorConstructor() {
        }

        public AdListenerExecutor createAdListenerExecutor(AdListener adListener, MobileAdsLoggerFactory mobileAdsLoggerFactory) {
            return new AdListenerExecutor(adListener, mobileAdsLoggerFactory);
        }
    }
}
