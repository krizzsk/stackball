package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.yandex.mobile.ads.C12066R;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;

/* renamed from: com.yandex.mobile.ads.impl.vl */
public class C14896vl<V extends ViewGroup> implements C12982el<V> {

    /* renamed from: a */
    private final tq0 f41312a = new tq0();

    /* renamed from: b */
    private final ar0 f41313b = new ar0();

    /* renamed from: c */
    private final e31 f41314c = new e31(10, 400);

    /* renamed from: d */
    private final e31 f41315d = new e31(20, 400);

    /* renamed from: e */
    private final e31 f41316e = new e31(30, 400);

    /* renamed from: f */
    private final e31 f41317f = new e31(40, 400);

    /* renamed from: g */
    private final e31 f41318g = new e31(60, 400);

    /* renamed from: h */
    private final e31 f41319h = new e31(60, 400);

    /* renamed from: i */
    private final AlphaAnimation f41320i;

    public C14896vl() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.f41320i = alphaAnimation;
        alphaAnimation.setDuration(400);
    }

    /* renamed from: a */
    public void mo65684a(ViewGroup viewGroup) {
        TextView k = this.f41312a.mo65911k(viewGroup);
        if (k != null) {
            this.f41318g.mo66393a(k);
        }
        ExtendedViewContainer a = this.f41313b.mo65848a(viewGroup);
        if (a != null) {
            this.f41317f.mo66393a(a);
        }
        TextView g = this.f41312a.mo65907g(viewGroup);
        if (g != null) {
            this.f41315d.mo66393a(g);
        }
        TextView a2 = this.f41312a.mo65901a(viewGroup);
        if (a2 != null) {
            this.f41316e.mo66393a(a2);
        }
        this.f41313b.getClass();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C12066R.C12068id.warning_container);
        if (viewGroup2 != null) {
            this.f41319h.mo66393a(viewGroup2);
        }
        this.f41313b.getClass();
        ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(C12066R.C12068id.header_container);
        if (viewGroup3 != null) {
            this.f41314c.mo66393a(viewGroup3);
        }
        viewGroup.startAnimation(this.f41320i);
    }

    /* renamed from: c */
    public void mo65685c() {
        this.f41314c.mo66392a();
        this.f41315d.mo66392a();
        this.f41316e.mo66392a();
        this.f41317f.mo66392a();
        this.f41318g.mo66392a();
        this.f41319h.mo66392a();
        this.f41320i.cancel();
    }
}
