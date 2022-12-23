package com.yandex.metrica.impl.p265ob;

import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: com.yandex.metrica.impl.ob.k5 */
public class C11417k5 extends C11305h5 {
    public C11417k5(C10978Z3 z3) {
        super(z3);
    }

    /* renamed from: a */
    public boolean mo62989a(C11411k0 k0Var, C10328H4 h4) {
        Bundle k = k0Var.mo63158k();
        mo62988a().mo62562a(k != null ? (ResultReceiver) k.getParcelable("com.yandex.metrica.impl.referrer.common.ReferrerResultReceiver") : null);
        return false;
    }
}
