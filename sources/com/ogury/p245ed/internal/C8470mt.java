package com.ogury.p245ed.internal;

/* renamed from: com.ogury.ed.internal.mt */
public final class C8470mt {

    /* renamed from: a */
    private static final C8471mu f21699a;

    /* renamed from: b */
    private static final C8492nm[] f21700b = new C8492nm[0];

    static {
        C8471mu muVar = null;
        try {
            muVar = (C8471mu) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (muVar == null) {
            muVar = new C8471mu();
        }
        f21699a = muVar;
    }

    /* renamed from: a */
    public static C8493nn m23886a(Class cls) {
        return C8471mu.m23891a(cls, "");
    }

    /* renamed from: b */
    public static C8492nm m23889b(Class cls) {
        return C8471mu.m23890a(cls);
    }

    /* renamed from: a */
    public static String m23888a(C8468mr mrVar) {
        return C8471mu.m23894a(mrVar);
    }

    /* renamed from: a */
    public static C8494no m23887a(C8465mo moVar) {
        return C8471mu.m23892a(moVar);
    }
}
