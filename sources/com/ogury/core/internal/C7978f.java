package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.f */
/* compiled from: Exceptions.kt */
public class C7978f {
    /* renamed from: a */
    public static boolean m22233a(String str) {
        C7921ai.m22144b(str, "className");
        try {
            Class.forName(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
