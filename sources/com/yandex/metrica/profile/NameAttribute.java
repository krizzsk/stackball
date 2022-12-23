package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p265ob.C10190Df;
import com.yandex.metrica.impl.p265ob.C10581Nn;
import com.yandex.metrica.impl.p265ob.C11572no;

public class NameAttribute extends StringAttribute {
    NameAttribute() {
        super("appmetrica_name", new C10581Nn(100, "Name attribute"), new C11572no(), new C10190Df());
    }
}
