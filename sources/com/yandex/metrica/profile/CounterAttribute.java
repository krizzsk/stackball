package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p265ob.C10339Hf;
import com.yandex.metrica.impl.p265ob.C11633pf;
import com.yandex.metrica.impl.p265ob.C11817uf;
import com.yandex.metrica.impl.p265ob.C11829uo;
import com.yandex.metrica.impl.p265ob.C11850vf;

public final class CounterAttribute {

    /* renamed from: a */
    private final C11850vf f28995a;

    CounterAttribute(String str, C11829uo<String> uoVar, C11633pf pfVar) {
        this.f28995a = new C11850vf(str, uoVar, pfVar);
    }

    public UserProfileUpdate<? extends C10339Hf> withDelta(double d) {
        return new UserProfileUpdate<>(new C11817uf(this.f28995a.mo63843a(), d));
    }
}
