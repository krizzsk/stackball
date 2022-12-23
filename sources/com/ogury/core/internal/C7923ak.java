package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.ak */
/* compiled from: Reflection */
public final class C7923ak {

    /* renamed from: a */
    private static final C7920ah f20690a;

    static {
        C7920ah ahVar = null;
        try {
            ahVar = (C7920ah) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (ahVar == null) {
            ahVar = new C7920ah();
        }
        f20690a = ahVar;
    }

    /* renamed from: a */
    public static String m22145a(C7922aj ajVar) {
        return f20690a.mo52895a(ajVar);
    }
}
