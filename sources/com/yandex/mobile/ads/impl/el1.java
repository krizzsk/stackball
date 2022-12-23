package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

public final class el1<T> {

    /* renamed from: a */
    private final g21 f33002a;

    /* renamed from: b */
    private final q11 f33003b;

    /* renamed from: c */
    private final gi1<T> f33004c;

    /* renamed from: d */
    private final to1<T> f33005d;

    public el1(Context context, ck1<T> ck1, rn1 rn1, ll1 ll1, ln1 ln1, mk1<T> mk1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ck1, "videoAdInfo");
        Intrinsics.checkNotNullParameter(rn1, "videoViewProvider");
        Intrinsics.checkNotNullParameter(ll1, "adStatusController");
        Intrinsics.checkNotNullParameter(ln1, "videoTracker");
        Intrinsics.checkNotNullParameter(mk1, "playbackEventsListener");
        this.f33002a = new g21(ln1);
        this.f33003b = new q11(context, ck1);
        this.f33004c = new gi1<>(ck1, rn1, ln1, mk1);
        this.f33005d = new to1(ck1, rn1, ll1, ln1, mk1);
    }

    /* renamed from: a */
    public final void mo66844a(cl1 cl1) {
        Intrinsics.checkNotNullParameter(cl1, "progressEventsObservable");
        cl1.mo66329a(this.f33002a, this.f33003b, this.f33004c, this.f33005d);
        cl1.mo66330a(this.f33005d);
    }
}
