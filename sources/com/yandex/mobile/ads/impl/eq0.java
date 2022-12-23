package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class eq0 extends un1<ViewPager2, List<? extends hd0>> {

    /* renamed from: c */
    private final ed0 f33043c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eq0(ViewPager2 viewPager2, ed0 ed0) {
        super(viewPager2);
        Intrinsics.checkNotNullParameter(viewPager2, "viewPager");
        Intrinsics.checkNotNullParameter(ed0, "imageProvider");
        this.f33043c = ed0;
    }

    /* renamed from: a */
    public boolean mo65825a(View view, Object obj) {
        ViewPager2 viewPager2 = (ViewPager2) view;
        Intrinsics.checkNotNullParameter(viewPager2, "viewPager");
        Intrinsics.checkNotNullParameter((List) obj, "imageValues");
        return viewPager2.getAdapter() instanceof aq0;
    }

    /* renamed from: b */
    public void mo65826b(View view, Object obj) {
        ViewPager2 viewPager2 = (ViewPager2) view;
        List list = (List) obj;
        Intrinsics.checkNotNullParameter(viewPager2, "viewPager");
        Intrinsics.checkNotNullParameter(list, "imageValues");
        viewPager2.setAdapter(new aq0(this.f33043c, list));
    }
}
