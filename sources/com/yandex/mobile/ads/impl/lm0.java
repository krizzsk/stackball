package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.impl.C15312zh;
import com.yandex.mobile.ads.nativeads.MediaView;
import com.yandex.mobile.ads.nativeads.view.pager.MultiBannerControlsContainer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class lm0 {

    /* renamed from: a */
    private final bq0 f36750a = new bq0();

    /* renamed from: b */
    private final up0 f36751b = new up0();

    /* renamed from: c */
    private final tp0 f36752c = new tp0();

    /* renamed from: a */
    public final gm0 mo68490a(MediaView mediaView, ed0 ed0, List<? extends hd0> list, d81 d81) {
        Long l;
        sp0 sp0;
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(ed0, "imageProvider");
        Intrinsics.checkNotNullParameter(list, "imageValues");
        Context context = mediaView.getContext();
        ViewPager2 viewPager2 = new ViewPager2(context);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        vp0 vp0 = new vp0(context);
        cq0 cq0 = new cq0(viewPager2);
        if (d81 == null || (l = d81.mo66526a()) == null) {
            l = 0L;
        }
        long longValue = l.longValue();
        if (longValue > 0) {
            sp0 = new sp0(viewPager2, cq0, vp0);
            viewPager2.addOnAttachStateChangeListener(new yp0(sp0, longValue));
        } else {
            sp0 = null;
        }
        viewPager2.registerOnPageChangeCallback(new vx0(vp0, sp0));
        MultiBannerControlsContainer a = this.f36751b.mo70390a(context);
        if (a != null) {
            a.mo71934a(viewPager2);
            a.setOnClickLeftButtonListener(new C15312zh.C15313a(cq0, vp0, sp0));
            a.setOnClickRightButtonListener(new C15312zh.C15314b(cq0, vp0, sp0));
        }
        ExtendedViewContainer a2 = this.f36752c.mo70210a(context, list);
        this.f36750a.getClass();
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(a2, TtmlNode.RUBY_CONTAINER);
        Intrinsics.checkNotNullParameter(viewPager2, "viewPager");
        mediaView.removeAllViews();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        a2.addView(viewPager2, layoutParams);
        if (a != null) {
            a2.addView(a, layoutParams);
        }
        mediaView.addView(a2, layoutParams);
        return new cs1(mediaView, new eq0(viewPager2, ed0));
    }
}
