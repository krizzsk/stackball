package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p265ob.C10910X3;

/* renamed from: com.yandex.metrica.impl.ob.K4 */
class C10419K4 implements C10243F4, C10359I4<C11586o4> {
    C10419K4() {
    }

    /* renamed from: a */
    public C10210E4 mo61261a(Context context, C10391J4 j4, C10153C4 c4, C10910X3 x3) {
        return new C10446L4(context, j4.mo61598b(new C11672q4(c4.mo61130b(), c4.mo61129a()), x3, new C11736s4(this)));
    }

    /* renamed from: b */
    public C11416k4 mo61095b(Context context, C11101c4 c4Var, C10910X3.C10911a aVar, C10757Si si) {
        return new C10771T4(context, c4Var, aVar, si.mo62241c(), new C10930Xi(si), CounterConfiguration.C10019b.MAIN);
    }

    /* renamed from: a */
    public C11517m4 mo61094a(Context context, C11101c4 c4Var, C10910X3.C10911a aVar, C10757Si si) {
        return new C11586o4(context, si.mo62241c(), c4Var, aVar, C10619P0.m27164i().mo61887o(), C10619P0.m27164i().mo61894v(), new C10930Xi(si));
    }
}
