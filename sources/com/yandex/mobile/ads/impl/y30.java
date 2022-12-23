package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.jvm.internal.Intrinsics;

public final class y30 {

    /* renamed from: a */
    private final boolean f42767a;

    /* renamed from: b */
    private final t30 f42768b;

    /* renamed from: c */
    private u30 f42769c;

    @Inject
    public y30(q30 q30, @Named("visual_errors") boolean z) {
        Intrinsics.checkNotNullParameter(q30, "errorCollectors");
        this.f42767a = z;
        this.f42768b = new t30(q30);
    }

    /* renamed from: a */
    public final void mo70992a(FrameLayout frameLayout, C12758cr crVar) {
        Intrinsics.checkNotNullParameter(frameLayout, "root");
        Intrinsics.checkNotNullParameter(crVar, "dataTag");
        if (this.f42767a) {
            u30 u30 = this.f42769c;
            if (u30 != null) {
                u30.close();
            }
            this.f42769c = new u30(frameLayout, this.f42768b);
            this.f42768b.mo70121a(crVar);
        }
    }

    /* renamed from: a */
    public final void mo70993a(C12758cr crVar) {
        Intrinsics.checkNotNullParameter(crVar, "dataTag");
        if (this.f42767a) {
            this.f42768b.mo70121a(crVar);
        }
    }
}
