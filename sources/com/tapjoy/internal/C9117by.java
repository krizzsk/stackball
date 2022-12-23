package com.tapjoy.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.tapjoy.internal.by */
public final class C9117by {

    /* renamed from: a */
    public WeakReference f22435a;

    /* renamed from: a */
    public final Object mo57896a() {
        WeakReference weakReference = this.f22435a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo57897a(Object obj) {
        this.f22435a = new WeakReference(obj);
    }
}
