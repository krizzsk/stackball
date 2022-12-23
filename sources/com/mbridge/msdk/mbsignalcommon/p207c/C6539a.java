package com.mbridge.msdk.mbsignalcommon.p207c;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.mbridge.msdk.mbsignalcommon.c.a */
/* compiled from: Mapping */
public final class C6539a {

    /* renamed from: a */
    private static C6540a f16310a;

    /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$a */
    /* compiled from: Mapping */
    public interface C6540a {
        /* renamed from: a */
        boolean mo44432a(C6541b.C6542a aVar);
    }

    /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$b */
    /* compiled from: Mapping */
    public static abstract class C6541b {

        /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$b$a */
        /* compiled from: Mapping */
        public static class C6542a extends Throwable {

            /* renamed from: a */
            private Class<?> f16311a;

            /* renamed from: b */
            private String f16312b;

            public C6542a(String str) {
                super(str);
            }

            public C6542a(Exception exc) {
                super(exc);
            }

            public final String toString() {
                if (getCause() == null) {
                    return super.toString();
                }
                return getClass().getName() + ": " + getCause();
            }

            /* renamed from: a */
            public final void mo44433a(Class<?> cls) {
                this.f16311a = cls;
            }

            /* renamed from: a */
            public final void mo44434a(String str) {
                this.f16312b = str;
            }
        }
    }

    /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$d */
    /* compiled from: Mapping */
    public static class C6544d {

        /* renamed from: a */
        protected final Method f16314a;

        /* renamed from: a */
        public final Object mo44437a(Object obj, Object... objArr) throws IllegalArgumentException, InvocationTargetException {
            try {
                return this.f16314a.invoke(obj, objArr);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            }
        }

        C6544d(Class<?> cls, String str, Class<?>[] clsArr, int i) throws C6541b.C6542a {
            Method method = null;
            if (cls == null) {
                this.f16314a = null;
                return;
            }
            try {
                method = cls.getDeclaredMethod(str, clsArr);
                if (i > 0 && (method.getModifiers() & i) != i) {
                    C6539a.m16806b(new C6541b.C6542a(method + " does not match modifiers: " + i));
                }
                method.setAccessible(true);
            } catch (NoSuchMethodException e) {
                C6541b.C6542a aVar = new C6541b.C6542a((Exception) e);
                aVar.mo44433a(cls);
                aVar.mo44434a(str);
                C6539a.m16806b(aVar);
            } catch (Throwable th) {
                this.f16314a = null;
                throw th;
            }
            this.f16314a = method;
        }

        /* renamed from: a */
        public final Method mo44438a() {
            return this.f16314a;
        }
    }

    /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$c */
    /* compiled from: Mapping */
    public static class C6543c<C> {

        /* renamed from: a */
        protected Class<C> f16313a;

        /* renamed from: a */
        public final C6544d mo44436a(String str, Class<?>... clsArr) throws C6541b.C6542a {
            return new C6544d(this.f16313a, str, clsArr, 0);
        }

        public C6543c(Class<C> cls) {
            this.f16313a = cls;
        }
    }

    /* renamed from: a */
    public static <T> C6543c<T> m16804a(ClassLoader classLoader, String str) throws C6541b.C6542a {
        try {
            return new C6543c<>(classLoader.loadClass(str));
        } catch (Exception e) {
            m16806b(new C6541b.C6542a(e));
            return new C6543c<>((Class) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m16806b(C6541b.C6542a aVar) throws C6541b.C6542a {
        C6540a aVar2 = f16310a;
        if (aVar2 == null || !aVar2.mo44432a(aVar)) {
            throw aVar;
        }
    }
}
