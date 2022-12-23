package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p265ob.C10137Bf;
import com.yandex.metrica.impl.p265ob.C10164Cf;
import com.yandex.metrica.impl.p265ob.C10321Gn;
import com.yandex.metrica.impl.p265ob.C10339Hf;
import com.yandex.metrica.impl.p265ob.C11633pf;
import com.yandex.metrica.impl.p265ob.C11749sf;
import com.yandex.metrica.impl.p265ob.C11829uo;
import com.yandex.metrica.impl.p265ob.C11850vf;
import com.yandex.metrica.impl.p265ob.C11913wf;
import com.yandex.metrica.impl.p265ob.C11948xf;
import com.yandex.metrica.impl.p265ob.C12028zf;

public final class NumberAttribute {

    /* renamed from: a */
    private final C11850vf f28997a;

    NumberAttribute(String str, C11829uo<String> uoVar, C11633pf pfVar) {
        this.f28997a = new C11850vf(str, uoVar, pfVar);
    }

    public UserProfileUpdate<? extends C10339Hf> withValue(double d) {
        return new UserProfileUpdate<>(new C12028zf(this.f28997a.mo63843a(), d, new C11913wf(), new C11749sf(new C11948xf(new C10321Gn(100)))));
    }

    public UserProfileUpdate<? extends C10339Hf> withValueIfUndefined(double d) {
        return new UserProfileUpdate<>(new C12028zf(this.f28997a.mo63843a(), d, new C11913wf(), new C10164Cf(new C11948xf(new C10321Gn(100)))));
    }

    public UserProfileUpdate<? extends C10339Hf> withValueReset() {
        return new UserProfileUpdate<>(new C10137Bf(1, this.f28997a.mo63843a(), new C11913wf(), new C11948xf(new C10321Gn(100))));
    }
}
