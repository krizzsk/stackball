package com.ogury.core.internal;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.ogury.core.internal.n */
/* compiled from: MutableCollections.kt */
class C7986n extends C7985m {
    /* renamed from: a */
    private static final <T> boolean m22237a(Iterable<? extends T> iterable, C7918af<? super T, Boolean> afVar, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (afVar.mo52870a(it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: a */
    public static final <T> boolean m22238a(List<T> list, C7918af<? super T, Boolean> afVar) {
        int i;
        C7921ai.m22144b(list, "$this$removeAll");
        C7921ai.m22144b(afVar, "predicate");
        if (list instanceof RandomAccess) {
            int a = C7983k.m22234a(list);
            if (a >= 0) {
                int i2 = 0;
                i = 0;
                while (true) {
                    T t = list.get(i2);
                    if (!afVar.mo52870a(t).booleanValue()) {
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
            int a2 = C7983k.m22234a(list);
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
            return m22237a(C7924al.m22146a((Object) list), afVar, true);
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableIterable<T>");
        }
    }
}
