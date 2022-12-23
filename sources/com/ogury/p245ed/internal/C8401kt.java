package com.ogury.p245ed.internal;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.ogury.ed.internal.kt */
class C8401kt extends C8400ks {
    /* renamed from: a */
    private static final <T> boolean m23760a(Iterable<? extends T> iterable, C8432lk<? super T, Boolean> lkVar) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (lkVar.mo53077a(it.next()).booleanValue()) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static final <T> boolean m23761a(List<T> list, C8432lk<? super T, Boolean> lkVar) {
        C8467mq.m23881b(list, "$this$removeAll");
        C8467mq.m23881b(lkVar, "predicate");
        return m23762b(list, lkVar);
    }

    /* renamed from: b */
    private static final <T> boolean m23762b(List<T> list, C8432lk<? super T, Boolean> lkVar) {
        int i;
        if (list instanceof RandomAccess) {
            int a = C8394km.m23754a(list);
            if (a >= 0) {
                int i2 = 0;
                i = 0;
                while (true) {
                    T t = list.get(i2);
                    if (!lkVar.mo53077a(t).booleanValue()) {
                        if (i != i2) {
                            list.set(i, t);
                        }
                        i++;
                    }
                    if (i2 == a) {
                        break;
                    }
                    i2++;
                }
            } else {
                i = 0;
            }
            if (i >= list.size()) {
                return false;
            }
            int a2 = C8394km.m23754a(list);
            if (a2 >= i) {
                while (true) {
                    list.remove(a2);
                    if (a2 == i) {
                        break;
                    }
                    a2--;
                }
            }
            return true;
        } else if (list != null) {
            return m23760a(C8473mw.m23896a((Object) list), lkVar);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableIterable<T>");
        }
    }
}
