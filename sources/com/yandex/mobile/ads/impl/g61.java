package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.base.AdResponse;

public class g61<V extends ViewGroup> implements C12982el<V> {

    /* renamed from: a */
    private final C12947e0 f33890a;

    /* renamed from: b */
    private final ae1 f33891b;

    /* renamed from: c */
    private final lt0 f33892c;

    /* renamed from: d */
    private final C13019f0 f33893d;

    /* renamed from: com.yandex.mobile.ads.impl.g61$a */
    private static class C13177a implements C13019f0 {

        /* renamed from: a */
        private final lt0 f33894a;

        public C13177a(lt0 lt0) {
            this.f33894a = lt0;
        }

        /* renamed from: a */
        public void mo65687a() {
            this.f33894a.mo68507c();
        }

        /* renamed from: b */
        public void mo65688b() {
            this.f33894a.mo68506b();
        }
    }

    public g61(AdResponse<?> adResponse, C12947e0 e0Var, ae1 ae1, ht0 ht0) {
        this.f33890a = e0Var;
        this.f33891b = ae1;
        lt0 lt0 = new lt0(adResponse, ae1, ht0);
        this.f33892c = lt0;
        this.f33893d = new C13177a(lt0);
    }

    /* renamed from: a */
    public void mo65684a(V v) {
        this.f33890a.mo66722a(this.f33893d);
        this.f33892c.mo68505a(this.f33891b.mo65742b(v));
    }

    /* renamed from: c */
    public void mo65685c() {
        this.f33890a.mo66724b(this.f33893d);
        this.f33892c.mo68504a();
    }
}
