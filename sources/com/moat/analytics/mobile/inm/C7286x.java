package com.moat.analytics.mobile.inm;

import com.moat.analytics.mobile.inm.C7276w;
import com.moat.analytics.mobile.inm.p240a.p241a.C7223a;
import com.moat.analytics.mobile.inm.p240a.p242b.C7224a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: com.moat.analytics.mobile.inm.x */
class C7286x<T> implements InvocationHandler {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Object[] f18270a = new Object[0];

    /* renamed from: b */
    private final C7288a<T> f18271b;

    /* renamed from: c */
    private final Class<T> f18272c;

    /* renamed from: d */
    private final LinkedList<C7286x<T>.b> f18273d = new LinkedList<>();

    /* renamed from: e */
    private boolean f18274e;

    /* renamed from: f */
    private T f18275f;

    /* renamed from: com.moat.analytics.mobile.inm.x$a */
    interface C7288a<T> {
        /* renamed from: a */
        C7224a<T> mo49314a();
    }

    /* renamed from: com.moat.analytics.mobile.inm.x$b */
    class C7289b {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final WeakReference[] f18278b;

        /* renamed from: c */
        private final LinkedList<Object> f18279c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final Method f18280d;

        private C7289b(Method method, Object... objArr) {
            this.f18279c = new LinkedList<>();
            objArr = objArr == null ? C7286x.f18270a : objArr;
            WeakReference[] weakReferenceArr = new WeakReference[objArr.length];
            int length = objArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                Object obj = objArr[i];
                if ((obj instanceof Map) || (obj instanceof Integer) || (obj instanceof Double)) {
                    this.f18279c.add(obj);
                }
                weakReferenceArr[i2] = new WeakReference(obj);
                i++;
                i2++;
            }
            this.f18278b = weakReferenceArr;
            this.f18280d = method;
        }
    }

    C7286x(C7288a<T> aVar, Class<T> cls) {
        C7223a.m18383a(aVar);
        C7223a.m18383a(cls);
        this.f18271b = aVar;
        this.f18272c = cls;
        C7276w.m18582a().mo49426a((C7276w.C7282b) new C7276w.C7282b() {
            /* renamed from: c */
            public void mo49405c() {
                C7286x.this.m18610c();
            }

            /* renamed from: d */
            public void mo49406d() {
            }
        });
    }

    /* renamed from: a */
    static <T> T m18603a(C7288a<T> aVar, Class<T> cls) {
        ClassLoader classLoader = cls.getClassLoader();
        C7286x xVar = new C7286x(aVar, cls);
        return Proxy.newProxyInstance(classLoader, new Class[]{cls}, xVar);
    }

    /* renamed from: a */
    private Object m18604a(Method method) {
        try {
            if (Boolean.TYPE.equals(method.getReturnType())) {
                return Boolean.TRUE;
            }
            return null;
        } catch (Exception e) {
            C7252m.m18508a(e);
            return null;
        }
    }

    /* renamed from: a */
    private Object m18605a(Method method, Object[] objArr) {
        Class<?> declaringClass = method.getDeclaringClass();
        C7276w a = C7276w.m18582a();
        if (Object.class.equals(declaringClass)) {
            String name = method.getName();
            if ("getClass".equals(name)) {
                return this.f18272c;
            }
            boolean equals = "toString".equals(name);
            Object invoke = method.invoke(this, objArr);
            if (!equals) {
                return invoke;
            }
            return String.valueOf(invoke).replace(C7286x.class.getName(), this.f18272c.getName());
        } else if (!this.f18274e || this.f18275f != null) {
            if (a.f18242a == C7276w.C7284d.ON) {
                m18610c();
                T t = this.f18275f;
                if (t != null) {
                    return method.invoke(t, objArr);
                }
            }
            if (a.f18242a == C7276w.C7284d.OFF && (!this.f18274e || this.f18275f != null)) {
                m18609b(method, objArr);
            }
            return m18604a(method);
        } else {
            this.f18273d.clear();
            return m18604a(method);
        }
    }

    /* renamed from: b */
    private void m18608b() {
        if (!this.f18274e) {
            try {
                this.f18275f = this.f18271b.mo49314a().mo49332c(null);
            } catch (Exception e) {
                C7261p.m18546a("OnOffTrackerProxy", (Object) this, "Could not create instance", (Throwable) e);
                C7252m.m18508a(e);
            }
            this.f18274e = true;
        }
    }

    /* renamed from: b */
    private void m18609b(Method method, Object[] objArr) {
        if (this.f18273d.size() >= 15) {
            this.f18273d.remove(5);
        }
        this.f18273d.add(new C7289b(method, objArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m18610c() {
        m18608b();
        if (this.f18275f != null) {
            Iterator it = this.f18273d.iterator();
            while (it.hasNext()) {
                C7289b bVar = (C7289b) it.next();
                try {
                    Object[] objArr = new Object[bVar.f18278b.length];
                    WeakReference[] a = bVar.f18278b;
                    int length = a.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        objArr[i2] = a[i].get();
                        i++;
                        i2++;
                    }
                    bVar.f18280d.invoke(this.f18275f, objArr);
                } catch (Exception e) {
                    C7252m.m18508a(e);
                }
            }
            this.f18273d.clear();
        }
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return m18605a(method, objArr);
        } catch (Exception e) {
            C7252m.m18508a(e);
            return m18604a(method);
        }
    }
}
