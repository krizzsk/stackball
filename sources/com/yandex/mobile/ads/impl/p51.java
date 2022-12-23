package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.base.AdResponse;

public class p51<V extends ViewGroup> implements C12982el<V> {

    /* renamed from: a */
    private final AdResponse<?> f38525a;

    /* renamed from: b */
    private final ht0 f38526b;

    /* renamed from: c */
    private final C12947e0 f38527c;

    /* renamed from: d */
    private final u51 f38528d;

    /* renamed from: e */
    private final r51 f38529e = new r51();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public y70 f38530f;

    /* renamed from: g */
    private C13019f0 f38531g;

    /* renamed from: com.yandex.mobile.ads.impl.p51$b */
    private class C14256b implements C13019f0 {
        private C14256b() {
        }

        /* renamed from: a */
        public void mo65687a() {
            if (p51.this.f38530f != null) {
                p51.this.f38530f.resume();
            }
        }

        /* renamed from: b */
        public void mo65688b() {
            if (p51.this.f38530f != null) {
                p51.this.f38530f.pause();
            }
        }
    }

    public p51(AdResponse<?> adResponse, C12947e0 e0Var, u51 u51, ht0 ht0) {
        this.f38525a = adResponse;
        this.f38526b = ht0;
        this.f38527c = e0Var;
        this.f38528d = u51;
    }

    /* renamed from: c */
    public void mo65685c() {
        C13019f0 f0Var = this.f38531g;
        if (f0Var != null) {
            this.f38527c.mo66724b(f0Var);
        }
        y70 y70 = this.f38530f;
        if (y70 != null) {
            y70.invalidate();
        }
    }

    /* renamed from: a */
    public void mo65684a(V v) {
        C14256b bVar = new C14256b();
        this.f38531g = bVar;
        this.f38527c.mo66722a((C13019f0) bVar);
        y70 a = this.f38529e.mo69695a(this.f38525a, this.f38528d, this.f38526b);
        this.f38530f = a;
        a.mo65894a();
    }
}
