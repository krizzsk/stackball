package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.base.AdResponse;

/* renamed from: com.yandex.mobile.ads.impl.bg */
public class C12586bg<V extends ViewGroup> implements C12982el<V>, C13019f0 {

    /* renamed from: a */
    private final AdResponse<?> f31315a;

    /* renamed from: b */
    private final br0 f31316b;

    /* renamed from: c */
    private final C12947e0 f31317c;

    /* renamed from: d */
    private final C14096nf f31318d;

    /* renamed from: e */
    private final C14384qh f31319e;

    /* renamed from: f */
    private C14381qf f31320f;

    /* renamed from: com.yandex.mobile.ads.impl.bg$a */
    private static class C12587a implements View.OnClickListener {

        /* renamed from: a */
        private final C14384qh f31321a;

        C12587a(C14384qh qhVar) {
            this.f31321a = qhVar;
        }

        public void onClick(View view) {
            this.f31321a.mo67136g();
        }
    }

    public C12586bg(AdResponse<?> adResponse, C12947e0 e0Var, C14096nf nfVar, C14384qh qhVar, br0 br0) {
        this.f31315a = adResponse;
        this.f31317c = e0Var;
        this.f31318d = nfVar;
        this.f31319e = qhVar;
        this.f31316b = br0;
    }

    /* renamed from: a */
    public void mo65684a(V v) {
        View a = this.f31316b.mo66109a(v);
        if (a != null) {
            this.f31317c.mo66722a((C13019f0) this);
            a.setOnClickListener(new C12587a(this.f31319e));
            Long r = this.f31315a.mo64438r();
            C12591bk bkVar = new C12591bk(a, this.f31318d, r != null ? r.longValue() : 0);
            this.f31320f = bkVar;
            bkVar.mo66086d();
            return;
        }
        this.f31319e.mo67136g();
    }

    /* renamed from: b */
    public void mo65688b() {
        C14381qf qfVar = this.f31320f;
        if (qfVar != null) {
            qfVar.mo66085b();
        }
    }

    /* renamed from: c */
    public void mo65685c() {
        this.f31317c.mo66724b(this);
        C14381qf qfVar = this.f31320f;
        if (qfVar != null) {
            qfVar.invalidate();
        }
    }

    /* renamed from: a */
    public void mo65687a() {
        C14381qf qfVar = this.f31320f;
        if (qfVar != null) {
            qfVar.mo66083a();
        }
    }
}
