package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;
import java.util.TimerTask;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class dq0 extends TimerTask {

    /* renamed from: b */
    private final cq0 f32740b;

    /* renamed from: c */
    private final vp0 f32741c;

    /* renamed from: d */
    private final WeakReference<ViewPager2> f32742d;

    /* renamed from: e */
    private C12913a f32743e = C12913a.LEFT;

    /* renamed from: com.yandex.mobile.ads.impl.dq0$a */
    public enum C12913a {
        LEFT,
        RIGHT
    }

    public dq0(ViewPager2 viewPager2, cq0 cq0, vp0 vp0) {
        Intrinsics.checkNotNullParameter(viewPager2, "viewPager");
        Intrinsics.checkNotNullParameter(cq0, "multiBannerSwiper");
        Intrinsics.checkNotNullParameter(vp0, "multiBannerEventTracker");
        this.f32740b = cq0;
        this.f32741c = vp0;
        this.f32742d = new WeakReference<>(viewPager2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m35419a(dq0 dq0, ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(dq0, "this$0");
        Intrinsics.checkNotNullParameter(viewPager2, "$viewPager");
        dq0.getClass();
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        int itemCount = adapter == null ? 0 : adapter.getItemCount();
        if (itemCount != 0) {
            int currentItem = viewPager2.getCurrentItem();
            if (currentItem == 0) {
                dq0.f32743e = C12913a.LEFT;
            } else if (currentItem == itemCount - 1) {
                dq0.f32743e = C12913a.RIGHT;
            }
        } else {
            dq0.cancel();
        }
        int ordinal = dq0.f32743e.ordinal();
        if (ordinal == 0) {
            dq0.f32740b.mo66344a();
        } else if (ordinal == 1) {
            dq0.f32740b.mo66345b();
        }
        dq0.f32741c.mo70510a();
    }

    public void run() {
        Unit unit;
        ViewPager2 viewPager2 = (ViewPager2) this.f32742d.get();
        if (viewPager2 == null) {
            unit = null;
        } else {
            if (lo1.m38870b((View) viewPager2) > 0) {
                viewPager2.post(new Runnable(viewPager2) {
                    public final /* synthetic */ ViewPager2 f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        dq0.m35419a(dq0.this, this.f$1);
                    }
                });
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            cancel();
        }
    }
}
