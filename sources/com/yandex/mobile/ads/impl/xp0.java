package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Intrinsics;

public final class xp0 {

    /* renamed from: a */
    private final ed0 f42669a;

    /* renamed from: com.yandex.mobile.ads.impl.xp0$a */
    private static final class C15201a implements View.OnClickListener {
        public void onClick(View view) {
            ViewParent viewParent;
            ViewPager2 viewPager2 = null;
            ViewParent parent = view == null ? null : view.getParent();
            if (parent == null) {
                viewParent = null;
            } else {
                viewParent = parent.getParent();
            }
            if (viewParent instanceof ViewPager2) {
                viewPager2 = (ViewPager2) viewParent;
            }
            if (viewPager2 != null) {
                viewPager2.callOnClick();
            }
        }
    }

    public xp0(ed0 ed0) {
        Intrinsics.checkNotNullParameter(ed0, "imageProvider");
        this.f42669a = ed0;
    }

    /* renamed from: a */
    public final wp0 mo70932a(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setOnClickListener(new C15201a());
        return new wp0(imageView, new od0(imageView, this.f42669a));
    }
}
