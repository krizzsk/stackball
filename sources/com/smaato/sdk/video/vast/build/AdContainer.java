package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.C8937Ad;

final class AdContainer<VastModel> {

    /* renamed from: ad */
    public final C8937Ad f21814ad;
    public final VastModel model;

    AdContainer(C8937Ad ad, VastModel vastmodel) {
        Objects.requireNonNull(ad, "Parameter ad cannot be null for AdContainer::new");
        Objects.requireNonNull(vastmodel, "Parameter model cannot be null for AdContainer::new");
        this.f21814ad = ad;
        this.model = vastmodel;
    }
}
