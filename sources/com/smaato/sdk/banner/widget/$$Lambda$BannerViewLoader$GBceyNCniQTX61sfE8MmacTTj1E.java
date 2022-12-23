package com.smaato.sdk.banner.widget;

import com.smaato.sdk.core.p248ad.AdLoader;
import com.smaato.sdk.core.p248ad.AdLoaderException;
import com.smaato.sdk.flow.Flow;
import com.smaato.sdk.flow.Function1;

/* renamed from: com.smaato.sdk.banner.widget.-$$Lambda$BannerViewLoader$GBceyNCniQTX61sfE8MmacTTj1E  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$BannerViewLoader$GBceyNCniQTX61sfE8MmacTTj1E implements Function1 {
    public static final /* synthetic */ $$Lambda$BannerViewLoader$GBceyNCniQTX61sfE8MmacTTj1E INSTANCE = new $$Lambda$BannerViewLoader$GBceyNCniQTX61sfE8MmacTTj1E();

    private /* synthetic */ $$Lambda$BannerViewLoader$GBceyNCniQTX61sfE8MmacTTj1E() {
    }

    public final Object apply(Object obj) {
        return Flow.error((Throwable) new AdLoaderException(AdLoader.Error.BAD_REQUEST, new Exception((Throwable) obj)));
    }
}
