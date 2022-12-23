package com.smaato.sdk.banner.widget;

import com.smaato.sdk.core.p248ad.AdLoader;
import com.smaato.sdk.core.p248ad.AdLoaderException;
import com.smaato.sdk.flow.Flow;
import com.smaato.sdk.flow.Function1;

/* renamed from: com.smaato.sdk.banner.widget.-$$Lambda$BannerViewLoader$ybXMQcU0iABpNDn_6M8VpqV6HFA  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$BannerViewLoader$ybXMQcU0iABpNDn_6M8VpqV6HFA implements Function1 {
    public static final /* synthetic */ $$Lambda$BannerViewLoader$ybXMQcU0iABpNDn_6M8VpqV6HFA INSTANCE = new $$Lambda$BannerViewLoader$ybXMQcU0iABpNDn_6M8VpqV6HFA();

    private /* synthetic */ $$Lambda$BannerViewLoader$ybXMQcU0iABpNDn_6M8VpqV6HFA() {
    }

    public final Object apply(Object obj) {
        return Flow.error((Throwable) new AdLoaderException(AdLoader.Error.BAD_REQUEST, new Exception((Throwable) obj)));
    }
}
