package com.tapjoy.internal;

import java.util.Observable;

/* renamed from: com.tapjoy.internal.fs */
public final class C9288fs {

    /* renamed from: a */
    public static final C9289a f22965a = new C9289a();

    /* renamed from: b */
    public static final C9289a f22966b = new C9289a();

    /* renamed from: c */
    public static final C9289a f22967c = new C9289a();

    /* renamed from: d */
    public static final C9289a f22968d = new C9289a();

    /* renamed from: e */
    public static final C9289a f22969e = new C9289a();

    /* renamed from: com.tapjoy.internal.fs$a */
    public static class C9289a extends Observable {
        public final void notifyObservers() {
            setChanged();
            super.notifyObservers();
        }

        public final void notifyObservers(Object obj) {
            setChanged();
            super.notifyObservers(obj);
        }
    }
}
