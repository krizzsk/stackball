package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.billing.p262v3.library.C10051c;
import com.yandex.metrica.billing.p263v4.library.C10066c;
import com.yandex.metrica.billing_interface.C10069b;
import com.yandex.metrica.billing_interface.C10075g;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.impl.ob.x3 */
public final class C11933x3 {
    /* renamed from: a */
    public final C11698r mo64066a(Context context, Executor executor, Executor executor2, C10069b bVar, C11800u uVar, C11771t tVar) {
        C11800u uVar2 = uVar;
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            return new C10051c(context, executor, executor2, new C11360j(uVar2), new C11410k(), tVar);
        } else if (ordinal != 1) {
            return new C10096A3();
        } else {
            return new C10066c(context, executor, executor2, uVar, tVar, new C11510m(uVar2), new C11573o((C10075g) null, 1));
        }
    }
}
