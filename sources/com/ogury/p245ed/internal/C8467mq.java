package com.ogury.p245ed.internal;

import java.util.Arrays;

/* renamed from: com.ogury.ed.internal.mq */
public class C8467mq {
    private C8467mq() {
    }

    /* renamed from: a */
    public static String m23873a(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: a */
    public static void m23877a(Object obj) {
        if (obj == null) {
            m23876a();
        }
    }

    /* renamed from: a */
    private static void m23876a() {
        throw ((NullPointerException) m23874a(new NullPointerException()));
    }

    /* renamed from: b */
    private static void m23882b(String str) {
        throw ((C8385kd) m23874a(new C8385kd(str)));
    }

    /* renamed from: a */
    public static void m23879a(String str) {
        m23882b("lateinit property " + str + " has not been initialized");
    }

    /* renamed from: a */
    public static void m23878a(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) m23874a(new NullPointerException(str + " must not be null")));
        }
    }

    /* renamed from: b */
    public static void m23881b(Object obj, String str) {
        if (obj == null) {
            m23883c(str);
        }
    }

    /* renamed from: c */
    private static void m23883c(String str) {
        throw ((NullPointerException) m23874a(new NullPointerException(m23884d(str))));
    }

    /* renamed from: d */
    private static String m23884d(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: a */
    public static boolean m23880a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    private static <T extends Throwable> T m23874a(T t) {
        return m23875a(t, C8467mq.class.getName());
    }

    /* renamed from: a */
    static <T extends Throwable> T m23875a(T t, String str) {
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
}
