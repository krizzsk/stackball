package com.smaato.sdk.richmedia.p255ad;

import com.smaato.sdk.core.p248ad.AdPresenterBuilder;
import com.smaato.sdk.core.p248ad.AdPresenterBuilderException;
import com.smaato.sdk.flow.Flow;
import com.smaato.sdk.flow.Function1;

/* renamed from: com.smaato.sdk.richmedia.ad.-$$Lambda$RichMediaAdPresenterBuilder$IqvG4sRVshRTVZzWOe4fG8p0dZQ */
/* compiled from: lambda */
public final /* synthetic */ class C8885x40bea78 implements Function1 {
    public static final /* synthetic */ C8885x40bea78 INSTANCE = new C8885x40bea78();

    private /* synthetic */ C8885x40bea78() {
    }

    public final Object apply(Object obj) {
        return Flow.error((Throwable) new AdPresenterBuilderException(AdPresenterBuilder.Error.GENERIC, (Exception) ((Throwable) obj)));
    }
}
