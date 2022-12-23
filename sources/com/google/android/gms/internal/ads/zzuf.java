package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzuf extends zzvp {
    private final AdListener zzcee;

    public zzuf(AdListener adListener) {
        this.zzcee = adListener;
    }

    public final void onAdClosed() {
        this.zzcee.onAdClosed();
    }

    public final void onAdFailedToLoad(int i) {
        this.zzcee.onAdFailedToLoad(i);
    }

    public final void onAdLeftApplication() {
        this.zzcee.onAdLeftApplication();
    }

    public final void onAdLoaded() {
        this.zzcee.onAdLoaded();
    }

    public final void onAdOpened() {
        this.zzcee.onAdOpened();
    }

    public final void onAdClicked() {
        this.zzcee.onAdClicked();
    }

    public final void onAdImpression() {
        this.zzcee.onAdImpression();
    }

    public final AdListener getAdListener() {
        return this.zzcee;
    }
}
