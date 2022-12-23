package com.google.ads.mediation;

import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
final class zzb implements RewardedVideoAdListener {
    private final /* synthetic */ AbstractAdViewAdapter zzmd;

    zzb(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.zzmd = abstractAdViewAdapter;
    }

    public final void onRewardedVideoAdLoaded() {
        this.zzmd.zzmb.onAdLoaded(this.zzmd);
    }

    public final void onRewardedVideoAdOpened() {
        this.zzmd.zzmb.onAdOpened(this.zzmd);
    }

    public final void onRewardedVideoStarted() {
        this.zzmd.zzmb.onVideoStarted(this.zzmd);
    }

    public final void onRewardedVideoAdClosed() {
        this.zzmd.zzmb.onAdClosed(this.zzmd);
        InterstitialAd unused = this.zzmd.zzma = null;
    }

    public final void onRewarded(RewardItem rewardItem) {
        this.zzmd.zzmb.onRewarded(this.zzmd, rewardItem);
    }

    public final void onRewardedVideoAdLeftApplication() {
        this.zzmd.zzmb.onAdLeftApplication(this.zzmd);
    }

    public final void onRewardedVideoAdFailedToLoad(int i) {
        this.zzmd.zzmb.onAdFailedToLoad(this.zzmd, i);
    }

    public final void onRewardedVideoCompleted() {
        this.zzmd.zzmb.onVideoCompleted(this.zzmd);
    }
}
