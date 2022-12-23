package com.tapjoy.internal;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: com.tapjoy.internal.fn */
public final class C9278fn {
    /* renamed from: a */
    public static Object m24888a(Object obj, Class cls) {
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C9279a(obj, Thread.currentThread(), Looper.myLooper()));
    }

    /* renamed from: com.tapjoy.internal.fn$a */
    static class C9279a implements InvocationHandler {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Object f22942a;

        /* renamed from: b */
        private final Thread f22943b;

        /* renamed from: c */
        private final Looper f22944c;

        public C9279a(Object obj, Thread thread, Looper looper) {
            this.f22942a = obj;
            this.f22943b = thread;
            this.f22944c = looper;
        }

        public final Object invoke(Object obj, final Method method, final Object[] objArr) {
            if (this.f22943b == Thread.currentThread()) {
                return method.invoke(this.f22942a, objArr);
            }
            if (method.getReturnType().equals(Void.TYPE)) {
                C92801 r4 = new Runnable() {
                    public final void run() {
                        try {
                            method.invoke(C9279a.this.f22942a, objArr);
                        } catch (IllegalArgumentException e) {
                            throw C9466jr.m25450a(e);
                        } catch (IllegalAccessException e2) {
                            throw C9466jr.m25450a(e2);
                        } catch (InvocationTargetException e3) {
                            throw C9466jr.m25450a(e3);
                        }
                    }
                };
                if (this.f22944c != null && new Handler(this.f22944c).post(r4)) {
                    return null;
                }
                if (this.f22943b == C9330gr.m25024b() && C9330gr.f23071a.mo57827a(r4)) {
                    return null;
                }
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper == null || !new Handler(mainLooper).post(r4)) {
                    return method.invoke(this.f22942a, objArr);
                }
                return null;
            }
            throw new UnsupportedOperationException("method not return void: " + method.getName());
        }
    }
}
