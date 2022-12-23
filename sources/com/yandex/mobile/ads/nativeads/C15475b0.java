package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.C12394al;
import com.yandex.mobile.ads.impl.C13680k5;
import com.yandex.mobile.ads.impl.C13690k9;
import com.yandex.mobile.ads.impl.C13838l9;
import com.yandex.mobile.ads.impl.pq0;
import com.yandex.mobile.ads.impl.uu0;

/* renamed from: com.yandex.mobile.ads.nativeads.b0 */
public class C15475b0 implements uu0 {

    /* renamed from: a */
    private final pq0 f43819a;

    /* renamed from: b */
    private C15550v f43820b;

    C15475b0(pq0 pq0) {
        this.f43819a = pq0;
    }

    /* renamed from: a */
    public void mo70409a(C15550v vVar) {
        vVar.mo71922a();
    }

    /* renamed from: a */
    public void mo70410a(C15550v vVar, C15474b bVar) {
        this.f43820b = vVar;
        C13680k5 k5Var = new C13680k5(vVar, bVar, this.f43819a.mo69415e());
        for (C13690k9 next : this.f43819a.mo69407b()) {
            C13838l9 a = vVar.mo71921a(next);
            if (a != null) {
                a.mo67823c(next.mo68169d());
                a.mo67818a(next, k5Var);
            }
        }
    }

    /* renamed from: a */
    public void mo70408a() {
        if (this.f43820b != null) {
            for (C13690k9 next : this.f43819a.mo69407b()) {
                C13838l9 a = this.f43820b.mo71921a(next);
                if (a instanceof C12394al) {
                    ((C12394al) a).mo65797b(next.mo68169d());
                }
            }
        }
    }
}
