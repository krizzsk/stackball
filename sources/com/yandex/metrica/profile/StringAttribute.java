package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p265ob.C10137Bf;
import com.yandex.metrica.impl.p265ob.C10164Cf;
import com.yandex.metrica.impl.p265ob.C10223Ef;
import com.yandex.metrica.impl.p265ob.C10339Hf;
import com.yandex.metrica.impl.p265ob.C10650Pn;
import com.yandex.metrica.impl.p265ob.C11633pf;
import com.yandex.metrica.impl.p265ob.C11749sf;
import com.yandex.metrica.impl.p265ob.C11829uo;
import com.yandex.metrica.impl.p265ob.C11850vf;

public class StringAttribute {

    /* renamed from: a */
    private final C10650Pn<String> f28998a;

    /* renamed from: b */
    private final C11850vf f28999b;

    StringAttribute(String str, C10650Pn<String> pn, C11829uo<String> uoVar, C11633pf pfVar) {
        this.f28999b = new C11850vf(str, uoVar, pfVar);
        this.f28998a = pn;
    }

    public UserProfileUpdate<? extends C10339Hf> withValue(String str) {
        return new UserProfileUpdate<>(new C10223Ef(this.f28999b.mo63843a(), str, this.f28998a, this.f28999b.mo63844b(), new C11749sf(this.f28999b.mo63845c())));
    }

    public UserProfileUpdate<? extends C10339Hf> withValueIfUndefined(String str) {
        return new UserProfileUpdate<>(new C10223Ef(this.f28999b.mo63843a(), str, this.f28998a, this.f28999b.mo63844b(), new C10164Cf(this.f28999b.mo63845c())));
    }

    public UserProfileUpdate<? extends C10339Hf> withValueReset() {
        return new UserProfileUpdate<>(new C10137Bf(0, this.f28999b.mo63843a(), this.f28999b.mo63844b(), this.f28999b.mo63845c()));
    }
}
