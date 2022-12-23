package bitter.jnibridge;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JNIBridge {

    /* renamed from: bitter.jnibridge.JNIBridge$a */
    private static class C0527a implements InvocationHandler {

        /* renamed from: a */
        private Object f40a = new Object[0];

        /* renamed from: b */
        private long f41b;

        /* renamed from: c */
        private Constructor f42c;

        public C0527a(long j) {
            this.f41b = j;
            Class<MethodHandles.Lookup> cls = MethodHandles.Lookup.class;
            try {
                Constructor<MethodHandles.Lookup> declaredConstructor = cls.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
                this.f42c = declaredConstructor;
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError unused) {
                this.f42c = null;
            } catch (NoSuchMethodException unused2) {
                this.f42c = null;
            }
        }

        /* renamed from: a */
        private Object m29a(Object obj, Method method, Object[] objArr) {
            if (objArr == null) {
                objArr = new Object[0];
            }
            Class<?> declaringClass = method.getDeclaringClass();
            return ((MethodHandles.Lookup) this.f42c.newInstance(new Object[]{declaringClass, 2})).in(declaringClass).unreflectSpecial(method, declaringClass).bindTo(obj).invokeWithArguments(objArr);
        }

        /* renamed from: a */
        public final void mo9098a() {
            synchronized (this.f40a) {
                this.f41b = 0;
            }
        }

        public final void finalize() {
            synchronized (this.f40a) {
                if (this.f41b != 0) {
                    JNIBridge.delete(this.f41b);
                }
            }
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            synchronized (this.f40a) {
                if (this.f41b == 0) {
                    return null;
                }
                try {
                    Object invoke = JNIBridge.invoke(this.f41b, method.getDeclaringClass(), method, objArr);
                    return invoke;
                } catch (NoSuchMethodError e) {
                    if (this.f42c == null) {
                        System.err.println("JNIBridge error: Java interface default methods are only supported since Android Oreo");
                        throw e;
                    } else if ((method.getModifiers() & 1024) == 0) {
                        return m29a(obj, method, objArr);
                    } else {
                        throw e;
                    }
                }
            }
        }
    }

    static native void delete(long j);

    static void disableInterfaceProxy(Object obj) {
        if (obj != null) {
            ((C0527a) Proxy.getInvocationHandler(obj)).mo9098a();
        }
    }

    static native Object invoke(long j, Class cls, Method method, Object[] objArr);

    static Object newInterfaceProxy(long j, Class[] clsArr) {
        return Proxy.newProxyInstance(JNIBridge.class.getClassLoader(), clsArr, new C0527a(j));
    }
}
