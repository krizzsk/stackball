package com.ogury.p244cm.internal;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.ogury.cm.internal.bbabc */
public class bbabc {
    private bbabc() {
    }

    /* renamed from: a */
    private static <T extends Throwable> T m22045a(T t) {
        return m22046a(t, bbabc.class.getName());
    }

    /* renamed from: a */
    private static <T extends Throwable> T m22046a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i + 1, length);
        t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t;
    }

    /* renamed from: a */
    public static void m22047a() {
        throw ((babba) m22045a(new babba()));
    }

    /* renamed from: a */
    public static void m22048a(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) m22045a(new IllegalStateException(str + " must not be null")));
        }
    }

    /* renamed from: a */
    public static void m22049a(String str) {
        throw ((babcb) m22045a(new babcb("lateinit property " + str + " has not been initialized")));
    }

    /* renamed from: a */
    public static boolean m22050a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m22051b(Object obj, String str) {
        if (obj == null) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            throw ((IllegalArgumentException) m22045a(new IllegalArgumentException("Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str)));
        }
    }
}
