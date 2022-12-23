package com.smaato.sdk.interstitial;

import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.InterstitialAdPresenter;
import com.smaato.sdk.core.repository.CoreAdTypeStrategy;
import java.util.Arrays;

final class InterstitialAdTypeStrategy extends CoreAdTypeStrategy {
    InterstitialAdTypeStrategy(String str, String str2) {
        super(str, str2);
    }

    /* access modifiers changed from: protected */
    public final Iterable getParams() {
        return Arrays.asList(new String[]{this.publisherId, this.adSpaceId});
    }

    public final Class<? extends AdPresenter> getAdPresenterClass() {
        return InterstitialAdPresenter.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InterstitialAdTypeStrategy interstitialAdTypeStrategy = (InterstitialAdTypeStrategy) obj;
        if (!this.publisherId.equals(interstitialAdTypeStrategy.publisherId)) {
            return false;
        }
        return this.adSpaceId.equals(interstitialAdTypeStrategy.adSpaceId);
    }

    public final int hashCode() {
        return (this.publisherId.hashCode() * 31) + this.adSpaceId.hashCode();
    }
}
