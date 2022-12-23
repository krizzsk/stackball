package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.mobile.ads.impl.gm0;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class cs1 extends gm0 {

    /* renamed from: c */
    private final vn1<ViewPager2, List<hd0>> f32078c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cs1(MediaView mediaView, eq0 eq0) {
        super(mediaView);
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(eq0, "multiBannerViewAdapter");
        this.f32078c = new vn1<>(eq0);
    }

    /* renamed from: a */
    public void mo65866a(View view) {
        MediaView mediaView = (MediaView) view;
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        this.f32078c.mo70504a();
        super.mo65866a(mediaView);
    }

    /* renamed from: b */
    public void mo65826b(View view, Object obj) {
        dm0 dm0 = (dm0) obj;
        Intrinsics.checkNotNullParameter((MediaView) view, "mediaView");
        Intrinsics.checkNotNullParameter(dm0, "mediaValue");
        List<hd0> a = dm0.mo66637a();
        if (dm0.mo66638b() == null) {
            if (Intrinsics.areEqual((Object) a == null ? null : Boolean.valueOf(!a.isEmpty()), (Object) Boolean.TRUE)) {
                this.f32078c.mo70508b(a);
            }
        }
    }

    /* renamed from: e */
    public gm0.C13214a mo65827e() {
        return gm0.C13214a.MULTIBANNER;
    }

    /* renamed from: a */
    public void mo65867a(C13690k9 k9Var, yn1 yn1, Object obj) {
        dm0 dm0 = (dm0) obj;
        Intrinsics.checkNotNullParameter(k9Var, "asset");
        Intrinsics.checkNotNullParameter(yn1, "viewConfigurator");
        this.f32078c.mo70505a(k9Var, yn1, dm0 == null ? null : dm0.mo66637a());
    }

    /* renamed from: a */
    public void mo65824a(dm0 dm0) {
        Intrinsics.checkNotNullParameter(dm0, "mediaValue");
        List<hd0> a = dm0.mo66637a();
        if (dm0.mo66638b() == null) {
            if (Intrinsics.areEqual((Object) a == null ? null : Boolean.valueOf(!a.isEmpty()), (Object) Boolean.TRUE)) {
                this.f32078c.mo70508b(a);
            }
        }
    }

    /* renamed from: a */
    public boolean mo65825a(MediaView mediaView, dm0 dm0) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(dm0, "mediaValue");
        List<hd0> a = dm0.mo66637a();
        if (dm0.mo66638b() == null) {
            if (Intrinsics.areEqual((Object) a == null ? null : Boolean.valueOf(!a.isEmpty()), (Object) Boolean.TRUE)) {
                return this.f32078c.mo70506a(a);
            }
        }
        return false;
    }
}
