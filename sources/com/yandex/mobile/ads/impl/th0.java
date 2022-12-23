package com.yandex.mobile.ads.impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class th0 extends lz0 {

    /* renamed from: i */
    public static final C14682b f40325i = new C14682b((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final Method f40326d;

    /* renamed from: e */
    private final Method f40327e;

    /* renamed from: f */
    private final Method f40328f;

    /* renamed from: g */
    private final Class<?> f40329g;

    /* renamed from: h */
    private final Class<?> f40330h;

    /* renamed from: com.yandex.mobile.ads.impl.th0$a */
    private static final class C14681a implements InvocationHandler {

        /* renamed from: a */
        private final List<String> f40331a;

        /* renamed from: b */
        private boolean f40332b;

        /* renamed from: c */
        private String f40333c;

        public C14681a(List<String> list) {
            Intrinsics.checkNotNullParameter(list, "protocols");
            this.f40331a = list;
        }

        /* renamed from: a */
        public final String mo70182a() {
            return this.f40333c;
        }

        /* renamed from: b */
        public final boolean mo70183b() {
            return this.f40332b;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Intrinsics.checkNotNullParameter(obj, "proxy");
            Intrinsics.checkNotNullParameter(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (Intrinsics.areEqual((Object) name, (Object) "supports") && Intrinsics.areEqual((Object) Boolean.TYPE, (Object) returnType)) {
                return Boolean.TRUE;
            }
            if (!Intrinsics.areEqual((Object) name, (Object) "unsupported") || !Intrinsics.areEqual((Object) Void.TYPE, (Object) returnType)) {
                if (Intrinsics.areEqual((Object) name, (Object) "protocols")) {
                    if (objArr.length == 0) {
                        return this.f40331a;
                    }
                }
                if ((Intrinsics.areEqual((Object) name, (Object) "selectProtocol") || Intrinsics.areEqual((Object) name, (Object) "select")) && Intrinsics.areEqual((Object) String.class, (Object) returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        List list = (List) obj2;
                        int size = list.size();
                        if (size >= 0) {
                            int i = 0;
                            while (true) {
                                int i2 = i + 1;
                                Object obj3 = list.get(i);
                                if (obj3 != null) {
                                    String str = (String) obj3;
                                    if (this.f40331a.contains(str)) {
                                        this.f40333c = str;
                                        return str;
                                    } else if (i == size) {
                                        break;
                                    } else {
                                        i = i2;
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                            }
                        }
                        String str2 = this.f40331a.get(0);
                        this.f40333c = str2;
                        return str2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                } else if ((!Intrinsics.areEqual((Object) name, (Object) "protocolSelected") && !Intrinsics.areEqual((Object) name, (Object) "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                } else {
                    Object obj4 = objArr[0];
                    if (obj4 != null) {
                        this.f40333c = (String) obj4;
                        return null;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                this.f40332b = true;
                return null;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.th0$b */
    public static final class C14682b {
        private C14682b() {
        }

        public /* synthetic */ C14682b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public th0(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        Intrinsics.checkNotNullParameter(method, "putMethod");
        Intrinsics.checkNotNullParameter(method2, "getMethod");
        Intrinsics.checkNotNullParameter(method3, "removeMethod");
        Intrinsics.checkNotNullParameter(cls, "clientProviderClass");
        Intrinsics.checkNotNullParameter(cls2, "serverProviderClass");
        this.f40326d = method;
        this.f40327e = method2;
        this.f40328f = method3;
        this.f40329g = cls;
        this.f40330h = cls2;
    }

    /* renamed from: a */
    public void mo68538a(SSLSocket sSLSocket, String str, List<? extends w11> list) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(list, "protocols");
        Intrinsics.checkNotNullParameter(list, "protocols");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((w11) next) == w11.HTTP_1_0) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((w11) it2.next()).toString());
        }
        try {
            Object newProxyInstance = Proxy.newProxyInstance(lz0.class.getClassLoader(), new Class[]{this.f40329g, this.f40330h}, new C14681a(arrayList2));
            this.f40326d.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    /* renamed from: b */
    public String mo68540b(SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f40327e.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                C14681a aVar = (C14681a) invocationHandler;
                if (!aVar.mo70183b() && aVar.mo70182a() == null) {
                    lz0.m39194a(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, (Throwable) null, 6, (Object) null);
                    return null;
                } else if (aVar.mo70183b()) {
                    return null;
                } else {
                    return aVar.mo70182a();
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.yandex.mobile.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }

    /* renamed from: a */
    public void mo68537a(SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        try {
            this.f40328f.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }
}
