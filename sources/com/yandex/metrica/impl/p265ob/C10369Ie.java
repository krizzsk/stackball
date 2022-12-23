package com.yandex.metrica.impl.p265ob;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.Ie */
public final class C10369Ie extends C10174D0<C10459Le> {
    /* renamed from: a */
    public boolean mo61162a(Object obj, Object obj2) {
        C10459Le le = (C10459Le) obj;
        C10459Le le2 = (C10459Le) obj2;
        if (le.f25111c) {
            if (le2.f25111c) {
                int intValue = mo61161a().mo61334a(le.f25113e).intValue();
                Integer a = mo61161a().mo61334a(le2.f25113e);
                Intrinsics.checkNotNullExpressionValue(a, "priorities[oldData.source]");
                if (Intrinsics.compare(intValue, a.intValue()) > 0) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }
}
