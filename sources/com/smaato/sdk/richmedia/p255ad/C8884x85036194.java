package com.smaato.sdk.richmedia.p255ad;

import com.smaato.sdk.core.p248ad.AdPresenterBuilder;
import com.smaato.sdk.core.p248ad.AdPresenterBuilderException;
import com.smaato.sdk.flow.Flow;
import com.smaato.sdk.flow.Function1;

/* renamed from: com.smaato.sdk.richmedia.ad.-$$Lambda$RichMediaAdPresenterBuilder$8dfnzZMJ75L-iV-ZrwEFJkvRtm0 */
/* compiled from: lambda */
public final /* synthetic */ class C8884x85036194 implements Function1 {
    public static final /* synthetic */ C8884x85036194 INSTANCE = new C8884x85036194();

    private /* synthetic */ C8884x85036194() {
    }

    public final Object apply(Object obj) {
        return Flow.error((Throwable) new AdPresenterBuilderException(AdPresenterBuilder.Error.INVALID_RESPONSE, (Exception) ((Throwable) obj)));
    }
}
