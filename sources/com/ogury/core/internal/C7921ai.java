package com.ogury.core.internal;

import java.util.Arrays;

/* renamed from: com.ogury.core.internal.ai */
/* compiled from: Intrinsics */
public class C7921ai {
    private C7921ai() {
    }

    /* renamed from: a */
    public static void m22142a(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) m22140a(new NullPointerException(str + " must not be null")));
        }
    }

    /* renamed from: a */
    public static boolean m22143a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    private static <T extends Throwable> T m22140a(T t) {
        return m22141a(t, C7921ai.class.getName());
    }

    /* renamed from: a */
    static <T extends Throwable> T m22141a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: b */
    public static void m22144b(Object obj, String str) {
        if (obj == null) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            throw ((NullPointerException) m22140a(new NullPointerException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str)));
        }
    }
}
