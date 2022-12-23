package com.moat.analytics.mobile.inm.p240a.p242b;

import java.util.NoSuchElementException;

/* renamed from: com.moat.analytics.mobile.inm.a.b.a */
public final class C7224a<T> {

    /* renamed from: a */
    private static final C7224a<?> f18099a = new C7224a<>();

    /* renamed from: b */
    private final T f18100b;

    private C7224a() {
        this.f18100b = null;
    }

    private C7224a(T t) {
        if (t != null) {
            this.f18100b = t;
            return;
        }
        throw new NullPointerException("Optional of null value.");
    }

    /* renamed from: a */
    public static <T> C7224a<T> m18384a() {
        return f18099a;
    }

    /* renamed from: a */
    public static <T> C7224a<T> m18385a(T t) {
        return new C7224a<>(t);
    }

    /* renamed from: b */
    public static <T> C7224a<T> m18386b(T t) {
        return t == null ? m18384a() : m18385a(t);
    }

    /* renamed from: b */
    public final T mo49331b() {
        T t = this.f18100b;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    /* renamed from: c */
    public final T mo49332c(T t) {
        T t2 = this.f18100b;
        return t2 != null ? t2 : t;
    }

    /* renamed from: c */
    public final boolean mo49333c() {
        return this.f18100b != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7224a)) {
            return false;
        }
        T t = this.f18100b;
        T t2 = ((C7224a) obj).f18100b;
        return t == t2 || !(t == null || t2 == null || !t.equals(t2));
    }

    public final int hashCode() {
        T t = this.f18100b;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        T t = this.f18100b;
        if (t == null) {
            return "Optional.empty";
        }
        return String.format("Optional[%s]", new Object[]{t});
    }
}
