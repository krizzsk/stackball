package com.smaato.sdk.rewarded;

import android.os.Handler;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.p251fi.Supplier;
import com.smaato.sdk.rewarded.csm.RewardedCsmAdImpl;
import com.smaato.sdk.rewarded.csm.RewardedCsmAdPresenter;
import com.smaato.sdk.rewarded.repository.RetainedAdPresenterRepository;

final class RewardedFactory {
    final RetainedAdPresenterRepository retainedAdPresenterRepository;
    final Supplier<String> uniqueKeySupplier;

    /* JADX WARNING: type inference failed for: r2v0, types: [com.smaato.sdk.core.util.fi.Supplier<java.lang.String>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    RewardedFactory(com.smaato.sdk.rewarded.repository.RetainedAdPresenterRepository r1, com.smaato.sdk.core.util.p251fi.Supplier<java.lang.String> r2) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r1)
            com.smaato.sdk.rewarded.repository.RetainedAdPresenterRepository r1 = (com.smaato.sdk.rewarded.repository.RetainedAdPresenterRepository) r1
            r0.retainedAdPresenterRepository = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r2)
            com.smaato.sdk.core.util.fi.Supplier r1 = (com.smaato.sdk.core.util.p251fi.Supplier) r1
            r0.uniqueKeySupplier = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.rewarded.RewardedFactory.<init>(com.smaato.sdk.rewarded.repository.RetainedAdPresenterRepository, com.smaato.sdk.core.util.fi.Supplier):void");
    }

    static RewardedInterstitialAd buildRewardedCsmAd(Handler handler, Logger logger, RewardedCsmAdPresenter rewardedCsmAdPresenter, EventListener eventListener) {
        return new RewardedCsmAdImpl(handler, logger, rewardedCsmAdPresenter, eventListener);
    }
}
