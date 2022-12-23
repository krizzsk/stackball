package com.smaato.sdk.banner.csm;

import com.smaato.sdk.core.csm.CsmAdPresenter;
import com.smaato.sdk.core.p248ad.AdPresenter;

public interface BannerCsmAdPresenter extends CsmAdPresenter {
    void initialize();

    void setBannerAdPresenterListener(AdPresenter.Listener<BannerCsmAdPresenter> listener);
}
