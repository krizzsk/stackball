package com.ogury.p245ed.internal;

import java.util.Iterator;

/* renamed from: com.ogury.ed.internal.lb */
public abstract class C8423lb implements C8474mx, Iterator<Integer> {
    /* renamed from: a */
    public abstract int mo53956a();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Integer next() {
        return Integer.valueOf(mo53956a());
    }
}
