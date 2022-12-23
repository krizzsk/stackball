package com.ogury.core.internal;

import com.facebook.internal.NativeProtocol;

/* renamed from: com.ogury.core.internal.y */
/* compiled from: PlatformImplementations.kt */
public final class C8002y {

    /* renamed from: a */
    public static final C8000x f20790a;

    static {
        C8000x xVar;
        Object newInstance;
        Object newInstance2;
        int a = m22249a();
        if (a >= 65544) {
            try {
                newInstance2 = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                C7921ai.m22142a((Object) newInstance2, "Class.forName(\"kotlin.in…entations\").newInstance()");
                if (newInstance2 != null) {
                    xVar = (C8000x) newInstance2;
                    f20790a = xVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e) {
                ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader2 = C8000x.class.getClassLoader();
                Throwable initCause = new ClassCastException("Instance classloader: " + classLoader + ", base type classloader: " + classLoader2).initCause(e);
                C7921ai.m22142a((Object) initCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                throw initCause;
            } catch (ClassNotFoundException unused) {
                try {
                    Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    C7921ai.m22142a((Object) newInstance3, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    if (newInstance3 != null) {
                        try {
                            xVar = (C8000x) newInstance3;
                        } catch (ClassCastException e2) {
                            ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                            ClassLoader classLoader4 = C8000x.class.getClassLoader();
                            Throwable initCause2 = new ClassCastException("Instance classloader: " + classLoader3 + ", base type classloader: " + classLoader4).initCause(e2);
                            C7921ai.m22142a((Object) initCause2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                            throw initCause2;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        if (a >= 65543) {
            try {
                newInstance = Class.forName("com.ogury.core.internal.z").newInstance();
                C7921ai.m22142a(newInstance, "Class.forName(\"kotlin.in…entations\").newInstance()");
                if (newInstance != null) {
                    xVar = (C8000x) newInstance;
                    f20790a = xVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e3) {
                ClassLoader classLoader5 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader6 = C8000x.class.getClassLoader();
                Throwable initCause3 = new ClassCastException("Instance classloader: " + classLoader5 + ", base type classloader: " + classLoader6).initCause(e3);
                C7921ai.m22142a((Object) initCause3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                throw initCause3;
            } catch (ClassNotFoundException unused3) {
                try {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    C7921ai.m22142a(newInstance4, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    if (newInstance4 != null) {
                        try {
                            xVar = (C8000x) newInstance4;
                        } catch (ClassCastException e4) {
                            ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                            ClassLoader classLoader8 = C8000x.class.getClassLoader();
                            Throwable initCause4 = new ClassCastException("Instance classloader: " + classLoader7 + ", base type classloader: " + classLoader8).initCause(e4);
                            C7921ai.m22142a((Object) initCause4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                            throw initCause4;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused4) {
                }
            }
        }
        xVar = new C8000x();
        f20790a = xVar;
    }

    /* renamed from: a */
    private static final int m22249a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return NativeProtocol.MESSAGE_GET_LIKE_STATUS_REQUEST;
        }
        CharSequence charSequence = property;
        int a = C7936av.m22159a(charSequence, '.', 0, false, 6);
        if (a < 0) {
            try {
                return Integer.parseInt(property) << 16;
            } catch (NumberFormatException unused) {
                return NativeProtocol.MESSAGE_GET_LIKE_STATUS_REQUEST;
            }
        } else {
            int i = a + 1;
            int a2 = C7936av.m22159a(charSequence, '.', i, false, 4);
            if (a2 < 0) {
                a2 = property.length();
            }
            if (property != null) {
                String substring = property.substring(0, a);
                C7921ai.m22142a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                if (property != null) {
                    String substring2 = property.substring(i, a2);
                    C7921ai.m22142a((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    try {
                        return (Integer.parseInt(substring) << 16) + Integer.parseInt(substring2);
                    } catch (NumberFormatException unused2) {
                        return NativeProtocol.MESSAGE_GET_LIKE_STATUS_REQUEST;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
    }
}
