package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.xl */
class C11958xl {

    /* renamed from: a */
    private final C11693ql f28729a;

    /* renamed from: b */
    private final C10144Bl f28730b;

    C11958xl(C11693ql qlVar, C10144Bl bl) {
        this.f28729a = qlVar;
        this.f28730b = bl;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo64100a(Activity activity, C11091bm bmVar) {
        String str;
        Bundle a = this.f28729a.mo61202a(activity);
        if (a == null) {
            str = null;
        } else {
            str = a.getString("yandex:ads:context");
        }
        return this.f28730b.mo61117a(str, bmVar);
    }
}
