package com.yandex.mobile.ads.impl;

import android.util.DisplayMetrics;
import com.yandex.mobile.ads.impl.C12667bz;
import com.yandex.mobile.ads.impl.C13452ix;
import com.yandex.mobile.ads.impl.C14065nb;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.hx */
public final class C13357hx implements C14065nb.C14073g.C14074a {

    /* renamed from: a */
    private final C12667bz.C12674g f34636a;

    /* renamed from: b */
    private final DisplayMetrics f34637b;

    /* renamed from: c */
    private final j50 f34638c;

    public C13357hx(C12667bz.C12674g gVar, DisplayMetrics displayMetrics, j50 j50) {
        Intrinsics.checkNotNullParameter(gVar, "item");
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        this.f34636a = gVar;
        this.f34637b = displayMetrics;
        this.f34638c = j50;
    }

    /* renamed from: a */
    public Integer mo67698a() {
        C13452ix g = this.f34636a.f31703a.mo70911b().mo66148g();
        if (g instanceof C13452ix.C13455c) {
            return Integer.valueOf(C14175ob.m40326a(g, this.f34637b, this.f34638c));
        }
        return null;
    }

    /* renamed from: b */
    public Object mo67699b() {
        return this.f34636a.f31705c;
    }

    /* renamed from: c */
    public String mo67700c() {
        return this.f34636a.f31704b.mo66924a(this.f34638c);
    }

    /* renamed from: d */
    public C12667bz.C12674g mo67701d() {
        return this.f34636a;
    }
}
