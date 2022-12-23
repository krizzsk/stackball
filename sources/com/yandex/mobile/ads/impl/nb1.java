package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

public final class nb1 extends IOException {

    /* renamed from: b */
    public final o30 f37792b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nb1(o30 o30) {
        super(Intrinsics.stringPlus("stream was reset: ", o30));
        Intrinsics.checkNotNullParameter(o30, IronSourceConstants.EVENTS_ERROR_CODE);
        this.f37792b = o30;
    }
}
