package com.smaato.sdk.banner.widget;

import com.smaato.sdk.banner.p247ad.BannerAdSize;
import com.smaato.sdk.core.p248ad.AdPresenter;
import com.smaato.sdk.core.p248ad.BannerAdPresenter;
import com.smaato.sdk.core.repository.CoreAdTypeStrategy;
import java.io.Serializable;
import java.util.Arrays;

final class BannerAdTypeStrategy extends CoreAdTypeStrategy {
    private final BannerAdSize adSize;

    BannerAdTypeStrategy(String str, String str2, BannerAdSize bannerAdSize) {
        super(str, str2);
        this.adSize = bannerAdSize;
    }

    /* access modifiers changed from: protected */
    public final Iterable getParams() {
        if (this.adSize == null) {
            return Arrays.asList(new String[]{this.publisherId, this.adSpaceId});
        }
        return Arrays.asList(new Serializable[]{this.publisherId, this.adSpaceId, Integer.valueOf(this.adSize.ordinal())});
    }

    public final Class<? extends AdPresenter> getAdPresenterClass() {
        return BannerAdPresenter.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BannerAdTypeStrategy bannerAdTypeStrategy = (BannerAdTypeStrategy) obj;
            if (this.publisherId.equals(bannerAdTypeStrategy.publisherId) && this.adSpaceId.equals(bannerAdTypeStrategy.adSpaceId) && this.adSize == bannerAdTypeStrategy.adSize) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.publisherId.hashCode() * 31) + this.adSpaceId.hashCode()) * 31;
        BannerAdSize bannerAdSize = this.adSize;
        return hashCode + (bannerAdSize != null ? bannerAdSize.hashCode() : 0);
    }
}
