package com.ogury.p245ed.internal;

/* renamed from: com.ogury.ed.internal.ms */
public final class C8469ms implements C8459mj {

    /* renamed from: a */
    private final Class<?> f21697a;

    /* renamed from: b */
    private final String f21698b;

    public C8469ms(Class<?> cls, String str) {
        C8467mq.m23881b(cls, "jClass");
        C8467mq.m23881b(str, "moduleName");
        this.f21697a = cls;
        this.f21698b = str;
    }

    /* renamed from: a */
    public final Class<?> mo53971a() {
        return this.f21697a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8469ms) && C8467mq.m23880a((Object) mo53971a(), (Object) ((C8469ms) obj).mo53971a());
    }

    public final int hashCode() {
        return mo53971a().hashCode();
    }

    public final String toString() {
        return mo53971a().toString() + " (Kotlin reflection is not available)";
    }
}
