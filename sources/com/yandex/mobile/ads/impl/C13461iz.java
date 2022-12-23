package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.yandex.mobile.ads.impl.C12667bz;
import com.yandex.mobile.ads.impl.C14065nb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.iz */
public final class C13461iz implements ViewPager.OnPageChangeListener, C14065nb.C14069c<C14687tm> {

    /* renamed from: a */
    private final C13513jm f35082a;

    /* renamed from: b */
    private final C15056wm f35083b;

    /* renamed from: c */
    private final C12903dm f35084c;

    /* renamed from: d */
    private final s10 f35085d;

    /* renamed from: e */
    private final uc1 f35086e;

    /* renamed from: f */
    private C12667bz f35087f;

    /* renamed from: g */
    private int f35088g = -1;

    public C13461iz(C13513jm jmVar, C15056wm wmVar, C12903dm dmVar, s10 s10, uc1 uc1, C12667bz bzVar) {
        Intrinsics.checkNotNullParameter(jmVar, "div2View");
        Intrinsics.checkNotNullParameter(wmVar, "actionBinder");
        Intrinsics.checkNotNullParameter(dmVar, "div2Logger");
        Intrinsics.checkNotNullParameter(s10, "visibilityActionTracker");
        Intrinsics.checkNotNullParameter(uc1, "tabLayout");
        Intrinsics.checkNotNullParameter(bzVar, "div");
        this.f35082a = jmVar;
        this.f35083b = wmVar;
        this.f35084c = dmVar;
        this.f35085d = s10;
        this.f35086e = uc1;
        this.f35087f = bzVar;
    }

    /* renamed from: a */
    public void mo67907a(Object obj, int i) {
        C14687tm tmVar = (C14687tm) obj;
        Intrinsics.checkNotNullParameter(tmVar, "action");
        if (tmVar.f40360d != null) {
            ii0 ii0 = ii0.f34887a;
        }
        this.f35084c.mo66625a(this.f35082a, i, tmVar);
        this.f35083b.mo70718a(this.f35082a, tmVar);
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        this.f35084c.mo66624a(this.f35082a, i);
        mo67905a(i);
    }

    /* renamed from: a */
    public final void mo67906a(C12667bz bzVar) {
        Intrinsics.checkNotNullParameter(bzVar, "<set-?>");
        this.f35087f = bzVar;
    }

    /* renamed from: a */
    public final void mo67905a(int i) {
        int i2 = this.f35088g;
        if (i != i2) {
            if (i2 != -1) {
                s10.m41777a(this.f35085d, this.f35082a, (View) null, this.f35087f.f31682n.get(i2).f31703a, (List) null, 8, (Object) null);
                this.f35082a.mo68026a((View) this.f35086e.mo70328j());
            }
            C12667bz.C12674g gVar = this.f35087f.f31682n.get(i);
            s10.m41777a(this.f35085d, this.f35082a, this.f35086e.mo70328j(), gVar.f31703a, (List) null, 8, (Object) null);
            this.f35082a.mo68027a((View) this.f35086e.mo70328j(), gVar.f31703a);
            this.f35088g = i;
        }
    }
}
