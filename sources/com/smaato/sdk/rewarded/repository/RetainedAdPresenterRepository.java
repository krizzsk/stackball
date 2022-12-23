package com.smaato.sdk.rewarded.repository;

import com.smaato.sdk.core.p248ad.RewardedAdPresenter;
import com.smaato.sdk.core.util.Objects;
import java.util.Map;

public class RetainedAdPresenterRepository {
    private final Map<String, AdPresenterCacheEntry<RewardedAdPresenter>> adPresentersCache;

    RetainedAdPresenterRepository(Map<String, AdPresenterCacheEntry<RewardedAdPresenter>> map) {
        this.adPresentersCache = (Map) Objects.requireNonNull(map);
    }

    public synchronized RewardedAdPresenter get(String str) {
        AdPresenterCacheEntry adPresenterCacheEntry = this.adPresentersCache.get(str);
        if (adPresenterCacheEntry == null) {
            return null;
        }
        return (RewardedAdPresenter) adPresenterCacheEntry.adPresenter;
    }

    public synchronized String put(RewardedAdPresenter rewardedAdPresenter, final String str) {
        C88431 r0 = new RetainedRepositoryAdPresenterListener(rewardedAdPresenter) {
            public final void onReadyToBeRemovedFromCache(RewardedAdPresenter rewardedAdPresenter) {
                rewardedAdPresenter.getAdInteractor().removeStateListener(this);
                RetainedAdPresenterRepository.this.remove(str);
            }
        };
        rewardedAdPresenter.getAdInteractor().addStateListener(r0);
        this.adPresentersCache.put(str, new AdPresenterCacheEntry(rewardedAdPresenter, r0, rewardedAdPresenter.getListener()));
        return str;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void remove(String str) {
        this.adPresentersCache.remove(str);
    }
}
