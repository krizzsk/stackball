package com.yandex.metrica.impl.p265ob;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.Ik */
class C10377Ik {

    /* renamed from: a */
    private final C10228Ek f24917a;

    /* renamed from: b */
    private final C10169Ck f24918b;

    C10377Ik(Context context) {
        this(new C10228Ek(context), new C10169Ck());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C11992yl mo61559a(Activity activity, C10378Il il) {
        if (il == null) {
            return C11992yl.NULL_UI_ACCESS_CONFIG;
        }
        if (!il.f24919a) {
            return C11992yl.UI_PARING_FEATURE_DISABLED;
        }
        C11091bm bmVar = il.f24923e;
        if (bmVar == null) {
            return C11992yl.NULL_UI_PARSING_CONFIG;
        }
        if (this.f24917a.mo64100a(activity, bmVar)) {
            return C11992yl.FORBIDDEN_FOR_APP;
        }
        if (this.f24918b.mo64100a(activity, il.f24923e)) {
            return C11992yl.FORBIDDEN_FOR_ACTIVITY;
        }
        return C11992yl.f28811a;
    }

    C10377Ik(C10228Ek ek, C10169Ck ck) {
        this.f24917a = ek;
        this.f24918b = ck;
    }
}
