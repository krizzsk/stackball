package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p265ob.C10137Bf;
import com.yandex.metrica.impl.p265ob.C10164Cf;
import com.yandex.metrica.impl.p265ob.C10339Hf;
import com.yandex.metrica.impl.p265ob.C11633pf;
import com.yandex.metrica.impl.p265ob.C11716rf;
import com.yandex.metrica.impl.p265ob.C11749sf;
import com.yandex.metrica.impl.p265ob.C11829uo;
import com.yandex.metrica.impl.p265ob.C11850vf;

public class BooleanAttribute {

    /* renamed from: a */
    private final C11850vf f28994a;

    BooleanAttribute(String str, C11829uo<String> uoVar, C11633pf pfVar) {
        this.f28994a = new C11850vf(str, uoVar, pfVar);
    }

    public UserProfileUpdate<? extends C10339Hf> withValue(boolean z) {
        return new UserProfileUpdate<>(new C11716rf(this.f28994a.mo63843a(), z, this.f28994a.mo63844b(), new C11749sf(this.f28994a.mo63845c())));
    }

    public UserProfileUpdate<? extends C10339Hf> withValueIfUndefined(boolean z) {
        return new UserProfileUpdate<>(new C11716rf(this.f28994a.mo63843a(), z, this.f28994a.mo63844b(), new C10164Cf(this.f28994a.mo63845c())));
    }

    public UserProfileUpdate<? extends C10339Hf> withValueReset() {
        return new UserProfileUpdate<>(new C10137Bf(3, this.f28994a.mo63843a(), this.f28994a.mo63844b(), this.f28994a.mo63845c()));
    }
}
