package com.smaato.sdk.rewarded.repository;

import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.RewardedAdPresenter;
import com.smaato.sdk.core.repository.CoreAdTypeStrategy;
import java.util.Arrays;

public final class RewardedAdTypeStrategy extends CoreAdTypeStrategy {
    public RewardedAdTypeStrategy(String str, String str2) {
        super(str, str2);
    }

    /* access modifiers changed from: protected */
    public final Iterable getParams() {
        return Arrays.asList(new String[]{this.publisherId, this.adSpaceId});
    }

    public final Class<? extends AdPresenter> getAdPresenterClass() {
        return RewardedAdPresenter.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RewardedAdTypeStrategy rewardedAdTypeStrategy = (RewardedAdTypeStrategy) obj;
        if (!this.publisherId.equals(rewardedAdTypeStrategy.publisherId)) {
            return false;
        }
        return this.adSpaceId.equals(rewardedAdTypeStrategy.adSpaceId);
    }

    public final int hashCode() {
        return (this.publisherId.hashCode() * 31) + this.adSpaceId.hashCode();
    }
}
