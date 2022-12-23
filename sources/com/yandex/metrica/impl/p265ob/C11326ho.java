package com.yandex.metrica.impl.p265ob;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.ho */
public class C11326ho<T> implements Comparator<Collection<T>> {

    /* renamed from: a */
    private final C11219eo<T> f27083a;

    /* renamed from: b */
    private final Comparator<T> f27084b;

    public C11326ho(C11219eo<T> eoVar, Comparator<T> comparator) {
        this.f27083a = eoVar;
        this.f27084b = comparator;
    }

    public int compare(Object obj, Object obj2) {
        Collection collection = (Collection) obj;
        Collection collection2 = (Collection) obj2;
        boolean z = true;
        boolean z2 = collection == null;
        if (collection2 != null) {
            z = false;
        }
        if (!(z ^ z2)) {
            if (collection == collection2) {
                return 0;
            }
            if (collection.size() == collection2.size()) {
                HashMap hashMap = new HashMap();
                for (Object next : collection) {
                    hashMap.put(this.f27083a.mo62557a(next), next);
                }
                for (Object next2 : collection2) {
                    Object obj3 = hashMap.get(this.f27083a.mo62557a(next2));
                    if (obj3 != null) {
                        if (this.f27084b.compare(obj3, next2) != 0) {
                        }
                    }
                }
                return 0;
            }
        }
        return 10;
    }
}
