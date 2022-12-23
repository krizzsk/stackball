package com.smaato.sdk.banner.widget;

import com.smaato.sdk.core.util.p251fi.Consumer;

/* renamed from: com.smaato.sdk.banner.widget.-$$Lambda$BannerViewLoader$BannerAdPresenterListenerImpl$PiT-_aKUKJ9v3RVPQH1yq3x-oec */
/* compiled from: lambda */
public final /* synthetic */ class C8581xef6b381d implements Consumer {
    public static final /* synthetic */ C8581xef6b381d INSTANCE = new C8581xef6b381d();

    private /* synthetic */ C8581xef6b381d() {
    }

    public final void accept(Object obj) {
        ((BannerView) obj).onAdFailedToLoad(BannerError.AD_UNLOADED);
    }
}
