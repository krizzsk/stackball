package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.C13028f5;
import com.yandex.mobile.ads.impl.C13690k9;
import com.yandex.mobile.ads.impl.C13838l9;
import com.yandex.mobile.ads.impl.uu0;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.nativeads.q0 */
class C15521q0 implements uu0 {

    /* renamed from: a */
    private final List<C13690k9> f43940a;

    C15521q0(List<C13690k9> list) {
        this.f43940a = list;
    }

    /* renamed from: a */
    public void mo70408a() {
    }

    /* renamed from: a */
    public void mo70409a(C15550v vVar) {
    }

    /* renamed from: a */
    public void mo70410a(C15550v vVar, C15474b bVar) {
        List<C13690k9> list = this.f43940a;
        if (list != null) {
            C13028f5 f5Var = new C13028f5(vVar, bVar);
            for (C13690k9 next : list) {
                C13838l9 a = vVar.mo71921a(next);
                if (a != null) {
                    a.mo67823c(next.mo68169d());
                    a.mo67818a(next, f5Var);
                }
            }
        }
    }
}
