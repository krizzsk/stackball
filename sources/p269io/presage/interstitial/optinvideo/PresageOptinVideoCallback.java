package p269io.presage.interstitial.optinvideo;

import p269io.presage.common.network.models.RewardItem;
import p269io.presage.interstitial.PresageInterstitialCallback;

@Deprecated
/* renamed from: io.presage.interstitial.optinvideo.PresageOptinVideoCallback */
public interface PresageOptinVideoCallback extends PresageInterstitialCallback {
    void onAdRewarded(RewardItem rewardItem);
}
