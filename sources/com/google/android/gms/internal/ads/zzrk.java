package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
public final class zzrk extends zzrq {
    private final WeakReference<AppOpenAd.AppOpenAdLoadCallback> zzbrz;

    public zzrk(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzbrz = new WeakReference<>(appOpenAdLoadCallback);
    }

    public final void zza(zzrm zzrm) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = (AppOpenAd.AppOpenAdLoadCallback) this.zzbrz.get();
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdLoaded(new zzrt(zzrm));
        }
    }

    public final void onAppOpenAdFailedToLoad(int i) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = (AppOpenAd.AppOpenAdLoadCallback) this.zzbrz.get();
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAppOpenAdFailedToLoad(i);
        }
    }
}
