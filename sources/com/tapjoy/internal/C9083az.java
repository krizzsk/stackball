package com.tapjoy.internal;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.tapjoy.internal.az */
public final class C9083az extends AbstractMap {

    /* renamed from: a */
    private final HashMap f22375a = new HashMap();

    /* renamed from: b */
    private final C9116bx f22376b = new C9116bx();

    public final int size() {
        m24322b();
        return this.f22375a.size();
    }

    public final void clear() {
        this.f22375a.clear();
        do {
        } while (this.f22376b.mo57894a() != null);
    }

    public final boolean containsKey(Object obj) {
        m24322b();
        return this.f22375a.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        m24322b();
        for (C9115bw bwVar : this.f22375a.values()) {
            if (obj.equals(bwVar.get())) {
                return true;
            }
        }
        return false;
    }

    public final Object get(Object obj) {
        m24322b();
        return m24321a((C9115bw) this.f22375a.get(obj));
    }

    public final Object put(Object obj, Object obj2) {
        m24322b();
        return m24321a((C9115bw) this.f22375a.put(obj, new C9115bw(obj, obj2, this.f22376b)));
    }

    public final Object remove(Object obj) {
        m24322b();
        return m24321a((C9115bw) this.f22375a.remove(obj));
    }

    /* renamed from: a */
    private static Object m24321a(C9115bw bwVar) {
        if (bwVar != null) {
            return bwVar.get();
        }
        return null;
    }

    public final Set entrySet() {
        m24322b();
        throw new UnsupportedOperationException();
    }

    public final Set keySet() {
        m24322b();
        return this.f22375a.keySet();
    }

    public final Collection values() {
        m24322b();
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        m24322b();
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        m24322b();
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        m24322b();
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    private void m24322b() {
        while (true) {
            C9115bw a = this.f22376b.mo57894a();
            if (a != null) {
                this.f22375a.remove(a.f22434a);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static C9083az m24320a() {
        return new C9083az();
    }
}
