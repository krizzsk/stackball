package com.ogury.p244cm.internal;

import com.facebook.internal.NativeProtocol;

/* renamed from: com.ogury.cm.internal.bacca */
public final class bacca {

    /* renamed from: a */
    public static final bacbc f20614a;

    static {
        bacbc bacbc;
        Object newInstance;
        Object newInstance2;
        int a = m22036a();
        if (a >= 65544) {
            try {
                newInstance2 = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
                bbabc.m22048a((Object) newInstance2, "Class.forName(\"kotlin.in…entations\").newInstance()");
                if (newInstance2 != null) {
                    bacbc = (bacbc) newInstance2;
                    f20614a = bacbc;
                }
                throw new babca("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e) {
                ClassLoader classLoader = newInstance2.getClass().getClassLoader();
                ClassLoader classLoader2 = bacbc.class.getClassLoader();
                Throwable initCause = new ClassCastException("Instance classloader: " + classLoader + ", base type classloader: " + classLoader2).initCause(e);
                bbabc.m22048a((Object) initCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                throw initCause;
            } catch (ClassNotFoundException unused) {
                try {
                    Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    bbabc.m22048a((Object) newInstance3, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    if (newInstance3 != null) {
                        try {
                            bacbc = (bacbc) newInstance3;
                        } catch (ClassCastException e2) {
                            ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                            ClassLoader classLoader4 = bacbc.class.getClassLoader();
                            Throwable initCause2 = new ClassCastException("Instance classloader: " + classLoader3 + ", base type classloader: " + classLoader4).initCause(e2);
                            bbabc.m22048a((Object) initCause2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                            throw initCause2;
                        }
                    } else {
                        throw new babca("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        if (a >= 65543) {
            try {
                newInstance = Class.forName("com.ogury.cm.internal.baccb").newInstance();
                bbabc.m22048a(newInstance, "Class.forName(\"kotlin.in…entations\").newInstance()");
                if (newInstance != null) {
                    bacbc = (bacbc) newInstance;
                    f20614a = bacbc;
                }
                throw new babca("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            } catch (ClassCastException e3) {
                ClassLoader classLoader5 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader6 = bacbc.class.getClassLoader();
                Throwable initCause3 = new ClassCastException("Instance classloader: " + classLoader5 + ", base type classloader: " + classLoader6).initCause(e3);
                bbabc.m22048a((Object) initCause3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                throw initCause3;
            } catch (ClassNotFoundException unused3) {
                try {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    bbabc.m22048a(newInstance4, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    if (newInstance4 != null) {
                        try {
                            bacbc = (bacbc) newInstance4;
                        } catch (ClassCastException e4) {
                            ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                            ClassLoader classLoader8 = bacbc.class.getClassLoader();
                            Throwable initCause4 = new ClassCastException("Instance classloader: " + classLoader7 + ", base type classloader: " + classLoader8).initCause(e4);
                            bbabc.m22048a((Object) initCause4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                            throw initCause4;
                        }
                    } else {
                        throw new babca("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused4) {
                }
            }
        }
        bacbc = new bacbc();
        f20614a = bacbc;
    }

    /* renamed from: a */
    private static final int m22036a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return NativeProtocol.MESSAGE_GET_LIKE_STATUS_REQUEST;
        }
        CharSequence charSequence = property;
        int a = bbcbc.m22090a(charSequence, '.', 0, false, 6, (Object) null);
        if (a < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return NativeProtocol.MESSAGE_GET_LIKE_STATUS_REQUEST;
            }
        } else {
            int i = a + 1;
            int a2 = bbcbc.m22090a(charSequence, '.', i, false, 4, (Object) null);
            if (a2 < 0) {
                a2 = property.length();
            }
            if (property != null) {
                String substring = property.substring(0, a);
                bbabc.m22048a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                if (property != null) {
                    String substring2 = property.substring(i, a2);
                    bbabc.m22048a((Object) substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    try {
                        return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
                    } catch (NumberFormatException unused2) {
                        return NativeProtocol.MESSAGE_GET_LIKE_STATUS_REQUEST;
                    }
                } else {
                    throw new babca("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                throw new babca("null cannot be cast to non-null type java.lang.String");
            }
        }
    }
}
