package com.smaato.sdk.rewarded.repository;

import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.RewardedAdPresenter;
import com.smaato.sdk.core.util.Objects;

final class AdPresenterCacheEntry<T extends AdPresenter> {
    final T adPresenter;
    private final Object listener;
    private final RewardedAdPresenter.Listener rewardedAdPresenterListener;

    AdPresenterCacheEntry(T t, Object obj, RewardedAdPresenter.Listener listener2) {
        this.adPresenter = (AdPresenter) Objects.requireNonNull(t);
        this.listener = Objects.requireNonNull(obj);
        this.rewardedAdPresenterListener = listener2;
    }
}
