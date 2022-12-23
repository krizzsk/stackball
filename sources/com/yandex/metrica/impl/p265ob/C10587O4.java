package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.p265ob.C10910X3;

/* renamed from: com.yandex.metrica.impl.ob.O4 */
public class C10587O4 implements C10243F4, C10359I4<C11229f4> {
    /* renamed from: c */
    public C11229f4 mo61094a(Context context, C11101c4 c4Var, C10910X3.C10911a aVar, C10757Si si) {
        return new C11934x4(context, c4Var, aVar, C10619P0.m27164i().mo61894v(), si.mo62241c(), (C10890Wi) new C10930Xi(si));
    }

    /* renamed from: d */
    public C10771T4 mo61095b(Context context, C11101c4 c4Var, C10910X3.C10911a aVar, C10757Si si) {
        return new C10771T4(context, c4Var, aVar, si.mo62241c(), new C10930Xi(si), CounterConfiguration.C10019b.MANUAL);
    }

    /* renamed from: a */
    public C10210E4 mo61261a(Context context, C10391J4 j4, C10153C4 c4, C10910X3 x3) {
        return new C10537N4(context, j4.mo61598b(new C11101c4(c4.mo61130b(), c4.mo61129a()), x3, new C11736s4(this)));
    }
}
