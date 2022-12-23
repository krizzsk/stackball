package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class tp0 {

    /* renamed from: a */
    private final zp0 f40413a = new zp0();

    /* renamed from: a */
    public final ExtendedViewContainer mo70210a(Context context, List<? extends hd0> list) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(list, "imageValues");
        ExtendedViewContainer extendedViewContainer = new ExtendedViewContainer(context);
        extendedViewContainer.setMeasureSpecProvider(new u11((float) this.f40413a.mo71270a(list)));
        return extendedViewContainer;
    }
}
