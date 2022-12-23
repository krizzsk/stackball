package com.ogury.p245ed.internal;

/* renamed from: com.ogury.ed.internal.mu */
public final class C8471mu {
    /* renamed from: a */
    public static C8494no m23892a(C8465mo moVar) {
        return moVar;
    }

    /* renamed from: a */
    public static C8493nn m23891a(Class cls, String str) {
        return new C8469ms(cls, str);
    }

    /* renamed from: a */
    public static C8492nm m23890a(Class cls) {
        return new C8460mk(cls);
    }

    /* renamed from: a */
    public static String m23894a(C8468mr mrVar) {
        return m23893a((C8464mn) mrVar);
    }

    /* renamed from: a */
    private static String m23893a(C8464mn mnVar) {
        String obj = mnVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
