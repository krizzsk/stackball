package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class ni1 implements r41<ci1> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final r41<List<lj1>> f37810a;

    /* renamed from: b */
    private final pi1 f37811b;

    public ni1(Context context, r41<List<lj1>> r41) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(r41, "adsRequestListener");
        this.f37810a = r41;
        this.f37811b = new pi1(context);
    }

    /* renamed from: a */
    public void mo66590a(Object obj) {
        ci1 ci1 = (ci1) obj;
        Intrinsics.checkNotNullParameter(ci1, IronSourceConstants.EVENTS_RESULT);
        List<lj1> b = ci1.mo66309b().mo70898b();
        Intrinsics.checkNotNullExpressionValue(b, "result.vast.videoAds");
        this.f37811b.mo69370a(b, new mi1(this, b));
    }

    /* renamed from: a */
    public void mo66589a(wj1 wj1) {
        Intrinsics.checkNotNullParameter(wj1, "error");
        this.f37810a.mo66589a(wj1);
    }
}
