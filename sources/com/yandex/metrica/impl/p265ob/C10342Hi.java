package com.yandex.metrica.impl.p265ob;

import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.Hi */
public enum C10342Hi {
    UNKNOWN(0),
    NETWORK(1),
    PARSE(2);
    

    /* renamed from: a */
    private int f24841a;

    private C10342Hi(int i) {
        this.f24841a = i;
    }

    /* renamed from: a */
    public Bundle mo61468a(Bundle bundle) {
        bundle.putInt("startup_error_key_code", this.f24841a);
        return bundle;
    }
}
