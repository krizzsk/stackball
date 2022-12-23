package com.tapjoy.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.tapjoy.internal.jt */
public final class C9468jt {

    /* renamed from: a */
    static final C9473jw f23563a = new C9473jw() {
        public final boolean hasNext() {
            return false;
        }

        public final Object next() {
            throw new NoSuchElementException();
        }
    };

    /* renamed from: b */
    private static final Iterator f23564b = new Iterator() {
        public final boolean hasNext() {
            return false;
        }

        public final Object next() {
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new IllegalStateException();
        }
    };

    /* renamed from: a */
    public static Object m25453a(Iterator it) {
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }
}
