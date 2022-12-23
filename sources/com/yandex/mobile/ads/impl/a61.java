package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.base.AdResponse;
import java.lang.ref.WeakReference;

public class a61<V extends ViewGroup> implements C12982el<V> {

    /* renamed from: a */
    private final AdResponse<?> f30451a;

    /* renamed from: b */
    private final ht0 f30452b;

    /* renamed from: c */
    private final br0 f30453c;

    /* renamed from: d */
    private final C12947e0 f30454d;

    /* renamed from: e */
    private final C14384qh f30455e;

    /* renamed from: f */
    private final C14885vf f30456f = new C14885vf();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public y70 f30457g;

    /* renamed from: h */
    private a61<V>.c f30458h;

    /* renamed from: com.yandex.mobile.ads.impl.a61$b */
    private static class C12360b implements View.OnClickListener {

        /* renamed from: a */
        private final C14384qh f30459a;

        C12360b(C14384qh qhVar) {
            this.f30459a = qhVar;
        }

        public void onClick(View view) {
            this.f30459a.mo67136g();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.a61$c */
    private class C12361c implements C13019f0 {
        private C12361c() {
        }

        /* renamed from: a */
        public void mo65687a() {
            if (a61.this.f30457g != null) {
                a61.this.f30457g.resume();
            }
        }

        /* renamed from: b */
        public void mo65688b() {
            if (a61.this.f30457g != null) {
                a61.this.f30457g.pause();
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.a61$d */
    private static class C12362d implements C15170xf {

        /* renamed from: a */
        private final WeakReference<View> f30461a;

        public C12362d(View view) {
            this.f30461a = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo65689a() {
            View view = (View) this.f30461a.get();
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public a61(AdResponse<?> adResponse, C12947e0 e0Var, C14384qh qhVar, br0 br0, ht0 ht0) {
        this.f30451a = adResponse;
        this.f30452b = ht0;
        this.f30454d = e0Var;
        this.f30455e = qhVar;
        this.f30453c = br0;
    }

    /* renamed from: c */
    public void mo65685c() {
        a61<V>.c cVar = this.f30458h;
        if (cVar != null) {
            this.f30454d.mo66724b(cVar);
        }
        y70 y70 = this.f30457g;
        if (y70 != null) {
            y70.invalidate();
        }
    }

    /* renamed from: a */
    public void mo65684a(V v) {
        View a = this.f30453c.mo66109a(v);
        if (a != null) {
            a61<V>.c cVar = new C12361c();
            this.f30458h = cVar;
            this.f30454d.mo66722a((C13019f0) cVar);
            a.setOnClickListener(new C12360b(this.f30455e));
            a.setVisibility(8);
            y70 a2 = this.f30456f.mo70479a(this.f30451a, new C12362d(a), this.f30452b);
            this.f30457g = a2;
            a2.mo65894a();
            return;
        }
        this.f30455e.mo67136g();
    }
}
