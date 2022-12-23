package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.Correlator;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzxx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class PublisherInterstitialAd {
    private final zzxx zzacn;

    public PublisherInterstitialAd(Context context) {
        this.zzacn = new zzxx(context, this);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    @Deprecated
    public final void setCorrelator(Correlator correlator) {
    }

    public final AdListener getAdListener() {
        return this.zzacn.getAdListener();
    }

    public final String getAdUnitId() {
        return this.zzacn.getAdUnitId();
    }

    public final AppEventListener getAppEventListener() {
        return this.zzacn.getAppEventListener();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.zzacn.getOnCustomRenderedAdLoadedListener();
    }

    public final boolean isLoaded() {
        return this.zzacn.isLoaded();
    }

    public final boolean isLoading() {
        return this.zzacn.isLoading();
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        this.zzacn.zza(publisherAdRequest.zzdq());
    }

    public final void setAdListener(AdListener adListener) {
        this.zzacn.setAdListener(adListener);
    }

    public final void setAdUnitId(String str) {
        this.zzacn.setAdUnitId(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.zzacn.setAppEventListener(appEventListener);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzacn.setOnCustomRenderedAdLoadedListener(onCustomRenderedAdLoadedListener);
    }

    @Deprecated
    public final String getMediationAdapterClassName() {
        return this.zzacn.getMediationAdapterClassName();
    }

    public final void show() {
        this.zzacn.show();
    }

    public final void setImmersiveMode(boolean z) {
        this.zzacn.setImmersiveMode(z);
    }

    public final ResponseInfo getResponseInfo() {
        return this.zzacn.getResponseInfo();
    }
}
