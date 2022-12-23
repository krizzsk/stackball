package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class zx0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C13513jm f43490a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C14215ov f43491b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C15056wm f43492c;

    /* renamed from: d */
    private ViewPager2.OnPageChangeCallback f43493d;

    /* renamed from: com.yandex.mobile.ads.impl.zx0$a */
    private final class C15404a extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a */
        private int f43494a = -1;

        /* renamed from: b */
        private final ArrayDeque<Integer> f43495b = new ArrayDeque<>();

        /* renamed from: c */
        final /* synthetic */ zx0 f43496c;

        public C15404a(zx0 zx0) {
            Intrinsics.checkNotNullParameter(zx0, "this$0");
            this.f43496c = zx0;
        }

        /* renamed from: a */
        private final void m44852a() {
            while (!this.f43495b.isEmpty()) {
                int intValue = this.f43495b.removeFirst().intValue();
                ii0 ii0 = ii0.f34887a;
                zx0 zx0 = this.f43496c;
                zx0.m44847a(zx0, zx0.f43491b.f38363n.get(intValue));
            }
        }

        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                m44852a();
            }
        }

        public void onPageSelected(int i) {
            ii0 ii0 = ii0.f34887a;
            if (this.f43494a != i) {
                this.f43495b.add(Integer.valueOf(i));
                if (this.f43494a == -1) {
                    m44852a();
                }
                this.f43494a = i;
            }
        }
    }

    public zx0(C13513jm jmVar, C14215ov ovVar, C15056wm wmVar) {
        Intrinsics.checkNotNullParameter(jmVar, "divView");
        Intrinsics.checkNotNullParameter(ovVar, "div");
        Intrinsics.checkNotNullParameter(wmVar, "divActionBinder");
        this.f43490a = jmVar;
        this.f43491b = ovVar;
        this.f43492c = wmVar;
    }

    /* renamed from: a */
    public static final void m44847a(zx0 zx0, C15177xl xlVar) {
        zx0.getClass();
        List<C14687tm> e = xlVar.mo70911b().mo66146e();
        if (e != null) {
            zx0.f43490a.mo68030a((Function0<Unit>) new ay0(e, zx0));
        }
    }

    /* renamed from: b */
    public final void mo71283b(ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "viewPager");
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.f43493d;
        if (onPageChangeCallback != null) {
            viewPager2.unregisterOnPageChangeCallback(onPageChangeCallback);
        }
        this.f43493d = null;
    }

    /* renamed from: a */
    public final void mo71282a(ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "viewPager");
        C15404a aVar = new C15404a(this);
        viewPager2.registerOnPageChangeCallback(aVar);
        this.f43493d = aVar;
    }
}
