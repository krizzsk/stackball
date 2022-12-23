package com.smaato.sdk.banner.widget;

import com.smaato.sdk.core.util.p251fi.Consumer;

/* renamed from: com.smaato.sdk.banner.widget.-$$Lambda$BannerViewLoader$3JdSJqcN7yLHgZlPZfp8ZOba7Nk  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$BannerViewLoader$3JdSJqcN7yLHgZlPZfp8ZOba7Nk implements Consumer {
    public static final /* synthetic */ $$Lambda$BannerViewLoader$3JdSJqcN7yLHgZlPZfp8ZOba7Nk INSTANCE = new $$Lambda$BannerViewLoader$3JdSJqcN7yLHgZlPZfp8ZOba7Nk();

    private /* synthetic */ $$Lambda$BannerViewLoader$3JdSJqcN7yLHgZlPZfp8ZOba7Nk() {
    }

    public final void accept(Object obj) {
        ((BannerView) obj).onAdFailedToLoad(BannerError.INTERNAL_ERROR);
    }
}
