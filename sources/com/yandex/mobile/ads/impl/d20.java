package com.yandex.mobile.ads.impl;

import javax.inject.Provider;

public final class d20<T> implements Provider<T>, xi0<T> {

    /* renamed from: c */
    private static final Object f32347c = new Object();

    /* renamed from: d */
    static final /* synthetic */ boolean f32348d = (!d20.class.desiredAssertionStatus());

    /* renamed from: a */
    private volatile Provider<T> f32349a;

    /* renamed from: b */
    private volatile Object f32350b = f32347c;

    private d20(Provider<T> provider) {
        this.f32349a = provider;
    }

    /* renamed from: a */
    public static Object m34975a(Object obj, Object obj2) {
        if (!(obj != f32347c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    /* renamed from: b */
    public static <P extends Provider<T>, T> Provider<T> m34976b(P p) {
        p.getClass();
        if (p instanceof d20) {
            return p;
        }
        return new d20(p);
    }

    public T get() {
        T t = this.f32350b;
        T t2 = f32347c;
        if (t == t2) {
            synchronized (this) {
                t = this.f32350b;
                if (t == t2) {
                    t = this.f32349a.get();
                    this.f32350b = m34975a(this.f32350b, t);
                    this.f32349a = null;
                }
            }
        }
        return t;
    }

    /* renamed from: a */
    public static <P extends Provider<T>, T> xi0<T> m34974a(P p) {
        if (p instanceof xi0) {
            return (xi0) p;
        }
        p.getClass();
        return new d20(p);
    }
}
