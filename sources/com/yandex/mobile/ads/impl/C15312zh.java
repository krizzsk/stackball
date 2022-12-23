package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.zh */
public abstract class C15312zh implements View.OnClickListener {

    /* renamed from: a */
    private final vp0 f43119a;

    /* renamed from: b */
    private final sp0 f43120b;

    /* renamed from: com.yandex.mobile.ads.impl.zh$a */
    public static final class C15313a extends C15312zh {

        /* renamed from: c */
        private final cq0 f43121c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15313a(cq0 cq0, vp0 vp0, sp0 sp0) {
            super(vp0, sp0, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(cq0, "multiBannerSwiper");
            Intrinsics.checkNotNullParameter(vp0, "multiBannerEventTracker");
            this.f43121c = cq0;
        }

        public void onClick(View view) {
            this.f43121c.mo66345b();
            C15312zh.super.onClick(view);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zh$b */
    public static final class C15314b extends C15312zh {

        /* renamed from: c */
        private final cq0 f43122c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15314b(cq0 cq0, vp0 vp0, sp0 sp0) {
            super(vp0, sp0, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(cq0, "multiBannerSwiper");
            Intrinsics.checkNotNullParameter(vp0, "multiBannerEventTracker");
            this.f43122c = cq0;
        }

        public void onClick(View view) {
            this.f43122c.mo66344a();
            C15312zh.super.onClick(view);
        }
    }

    private C15312zh(vp0 vp0, sp0 sp0) {
        this.f43119a = vp0;
        this.f43120b = sp0;
    }

    public /* synthetic */ C15312zh(vp0 vp0, sp0 sp0, DefaultConstructorMarker defaultConstructorMarker) {
        this(vp0, sp0);
    }

    public void onClick(View view) {
        sp0 sp0 = this.f43120b;
        if (sp0 != null) {
            sp0.mo70041a();
        }
        this.f43119a.mo70511b();
    }
}
