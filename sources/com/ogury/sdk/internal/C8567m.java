package com.ogury.sdk.internal;

import java.util.Arrays;

/* renamed from: com.ogury.sdk.internal.m */
/* compiled from: Intrinsics */
public class C8567m {
    private C8567m() {
    }

    /* renamed from: a */
    public static void m24057a(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) m24055a(new NullPointerException(str + " must not be null")));
        }
    }

    /* renamed from: a */
    public static boolean m24058a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    private static <T extends Throwable> T m24055a(T t) {
        return m24056a(t, C8567m.class.getName());
    }

    /* renamed from: a */
    private static <T extends Throwable> T m24056a(T t, String str) {
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
    public static void m24059b(Object obj, String str) {
        if (obj == null) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            throw ((NullPointerException) m24055a(new NullPointerException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str)));
        }
    }
}
