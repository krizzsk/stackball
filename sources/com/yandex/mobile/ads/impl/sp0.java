package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class sp0 {

    /* renamed from: a */
    private final cq0 f40101a;

    /* renamed from: b */
    private final vp0 f40102b;

    /* renamed from: c */
    private final WeakReference<ViewPager2> f40103c;

    /* renamed from: d */
    private final Timer f40104d = new Timer();

    /* renamed from: e */
    private TimerTask f40105e;

    /* renamed from: f */
    private boolean f40106f = true;

    public sp0(ViewPager2 viewPager2, cq0 cq0, vp0 vp0) {
        Intrinsics.checkNotNullParameter(viewPager2, "viewPager");
        Intrinsics.checkNotNullParameter(cq0, "multiBannerSwiper");
        Intrinsics.checkNotNullParameter(vp0, "multiBannerEventTracker");
        this.f40101a = cq0;
        this.f40102b = vp0;
        this.f40103c = new WeakReference<>(viewPager2);
    }

    /* renamed from: a */
    public final void mo70042a(long j) {
        Unit unit;
        if (j > 0 && this.f40106f) {
            mo70043b();
            ViewPager2 viewPager2 = (ViewPager2) this.f40103c.get();
            if (viewPager2 == null) {
                unit = null;
            } else {
                dq0 dq0 = new dq0(viewPager2, this.f40101a, this.f40102b);
                this.f40105e = dq0;
                try {
                    this.f40104d.schedule(dq0, j, j);
                } catch (Exception unused) {
                    mo70043b();
                }
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                mo70041a();
            }
        }
    }

    /* renamed from: b */
    public final void mo70043b() {
        TimerTask timerTask = this.f40105e;
        if (timerTask != null) {
            timerTask.cancel();
        }
        this.f40105e = null;
    }

    /* renamed from: a */
    public final void mo70041a() {
        mo70043b();
        this.f40106f = false;
        this.f40104d.cancel();
    }
}
