package com.amazon.device.ads;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CompositeAdListenerExecutor extends AdListenerExecutor {
    private final List<AdListenerExecutor> adListenerExecutors = new ArrayList();

    public CompositeAdListenerExecutor(MobileAdsLoggerFactory mobileAdsLoggerFactory) {
        super((AdListener) null, mobileAdsLoggerFactory);
    }

    public void addAdListenerExecutor(AdListenerExecutor adListenerExecutor) {
        this.adListenerExecutors.add(adListenerExecutor);
    }

    private List<AdListenerExecutor> getAdListenerExecutors() {
        return this.adListenerExecutors;
    }

    public void onAdLoaded(C0898Ad ad, AdProperties adProperties) {
        for (AdListenerExecutor onAdLoaded : getAdListenerExecutors()) {
            onAdLoaded.onAdLoaded(ad, adProperties);
        }
    }

    public void onAdFailedToLoad(C0898Ad ad, AdError adError) {
        for (AdListenerExecutor onAdFailedToLoad : getAdListenerExecutors()) {
            onAdFailedToLoad.onAdFailedToLoad(ad, adError);
        }
    }

    public void onAdExpanded(C0898Ad ad) {
        for (AdListenerExecutor onAdExpanded : getAdListenerExecutors()) {
            onAdExpanded.onAdExpanded(ad);
        }
    }

    public void onAdCollapsed(C0898Ad ad) {
        for (AdListenerExecutor onAdCollapsed : getAdListenerExecutors()) {
            onAdCollapsed.onAdCollapsed(ad);
        }
    }

    public void onAdDismissed(C0898Ad ad) {
        for (AdListenerExecutor onAdDismissed : getAdListenerExecutors()) {
            onAdDismissed.onAdDismissed(ad);
        }
    }

    public void onAdResized(C0898Ad ad, Rect rect) {
        for (AdListenerExecutor onAdResized : getAdListenerExecutors()) {
            onAdResized.onAdResized(ad, rect);
        }
    }

    public void onAdExpired(C0898Ad ad) {
        for (AdListenerExecutor onAdExpired : getAdListenerExecutors()) {
            onAdExpired.onAdExpired(ad);
        }
    }

    public void onSpecialUrlClicked(C0898Ad ad, String str) {
        for (AdListenerExecutor onSpecialUrlClicked : getAdListenerExecutors()) {
            onSpecialUrlClicked.onSpecialUrlClicked(ad, str);
        }
    }

    public ActionCode onAdReceived(C0898Ad ad, AdData adData) {
        Iterator<AdListenerExecutor> it = getAdListenerExecutors().iterator();
        if (it.hasNext()) {
            return it.next().onAdReceived(ad, adData);
        }
        return null;
    }

    public void onAdEvent(AdEvent adEvent) {
        for (AdListenerExecutor onAdEvent : getAdListenerExecutors()) {
            onAdEvent.onAdEvent(adEvent);
        }
    }
}
