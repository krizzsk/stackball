package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p265ob.C10137Bf;
import com.yandex.metrica.impl.p265ob.C10164Cf;
import com.yandex.metrica.impl.p265ob.C10190Df;
import com.yandex.metrica.impl.p265ob.C10223Ef;
import com.yandex.metrica.impl.p265ob.C10339Hf;
import com.yandex.metrica.impl.p265ob.C10381In;
import com.yandex.metrica.impl.p265ob.C11572no;
import com.yandex.metrica.impl.p265ob.C11749sf;
import com.yandex.metrica.impl.p265ob.C11850vf;

public class GenderAttribute {

    /* renamed from: a */
    private final C11850vf f28996a = new C11850vf("appmetrica_gender", new C11572no(), new C10190Df());

    public enum Gender {
        MALE("M"),
        FEMALE("F"),
        OTHER("O");
        
        private final String mStringValue;

        private Gender(String str) {
            this.mStringValue = str;
        }

        public String getStringValue() {
            return this.mStringValue;
        }
    }

    GenderAttribute() {
    }

    public UserProfileUpdate<? extends C10339Hf> withValue(Gender gender) {
        return new UserProfileUpdate<>(new C10223Ef(this.f28996a.mo63843a(), gender.getStringValue(), new C10381In(), this.f28996a.mo63844b(), new C11749sf(this.f28996a.mo63845c())));
    }

    public UserProfileUpdate<? extends C10339Hf> withValueIfUndefined(Gender gender) {
        return new UserProfileUpdate<>(new C10223Ef(this.f28996a.mo63843a(), gender.getStringValue(), new C10381In(), this.f28996a.mo63844b(), new C10164Cf(this.f28996a.mo63845c())));
    }

    public UserProfileUpdate<? extends C10339Hf> withValueReset() {
        return new UserProfileUpdate<>(new C10137Bf(0, this.f28996a.mo63843a(), this.f28996a.mo63844b(), this.f28996a.mo63845c()));
    }
}
