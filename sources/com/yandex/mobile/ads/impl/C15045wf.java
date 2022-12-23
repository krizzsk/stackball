package com.yandex.mobile.ads.impl;

import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.wf */
public final class C15045wf {

    /* renamed from: d */
    public static final C15046a f41974d = new C15046a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Method f41975a;

    /* renamed from: b */
    private final Method f41976b;

    /* renamed from: c */
    private final Method f41977c;

    /* renamed from: com.yandex.mobile.ads.impl.wf$a */
    public static final class C15046a {
        private C15046a() {
        }

        public /* synthetic */ C15046a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C15045wf mo70687a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new C15045wf(method3, method, method2);
        }
    }

    public C15045wf(Method method, Method method2, Method method3) {
        this.f41975a = method;
        this.f41976b = method2;
        this.f41977c = method3;
    }

    /* renamed from: a */
    public final Object mo70685a(String str) {
        Intrinsics.checkNotNullParameter(str, "closer");
        Method method = this.f41975a;
        if (method != null) {
            try {
                Object invoke = method.invoke((Object) null, new Object[0]);
                Method method2 = this.f41976b;
                Intrinsics.checkNotNull(method2);
                method2.invoke(invoke, new Object[]{str});
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo70686a(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f41977c;
            Intrinsics.checkNotNull(method);
            method.invoke(obj, new Object[0]);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
