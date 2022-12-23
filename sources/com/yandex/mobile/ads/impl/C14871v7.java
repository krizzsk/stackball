package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C14656t7;
import com.yandex.mobile.ads.impl.C15327zk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.v7 */
public class C14871v7 implements ta1 {

    /* renamed from: f */
    public static final C14872a f41203f = new C14872a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C15327zk.C15328a f41204g = new C14744u7("com.google.android.gms.org.conscrypt");

    /* renamed from: a */
    private final Class<? super SSLSocket> f41205a;

    /* renamed from: b */
    private final Method f41206b;

    /* renamed from: c */
    private final Method f41207c;

    /* renamed from: d */
    private final Method f41208d;

    /* renamed from: e */
    private final Method f41209e;

    /* renamed from: com.yandex.mobile.ads.impl.v7$a */
    public static final class C14872a {
        private C14872a() {
        }

        public /* synthetic */ C14872a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C15327zk.C15328a mo70454a() {
            return C14871v7.f41204g;
        }
    }

    public C14871v7(Class<? super SSLSocket> cls) {
        Intrinsics.checkNotNullParameter(cls, "sslSocketClass");
        this.f41205a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclaredMethod(\"setUseSessionTickets\", Boolean::class.javaPrimitiveType)");
        this.f41206b = declaredMethod;
        this.f41207c = cls.getMethod("setHostname", new Class[]{String.class});
        this.f41208d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f41209e = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    /* renamed from: a */
    public boolean mo69321a() {
        C14656t7.C14657a aVar = C14656t7.f40246f;
        return C14656t7.f40247g;
    }

    static {
        Intrinsics.checkNotNullParameter("com.google.android.gms.org.conscrypt", "packageName");
    }

    /* renamed from: b */
    public String mo69323b(SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        if (!mo69322a(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f41208d.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "UTF_8");
            return new String(bArr, charset);
        } catch (NullPointerException e) {
            if (Intrinsics.areEqual((Object) e.getMessage(), (Object) "ssl == null")) {
                return null;
            }
            throw e;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError(e3);
        }
    }

    /* renamed from: a */
    public boolean mo69322a(SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        return this.f41205a.isInstance(sSLSocket);
    }

    /* renamed from: a */
    public void mo69320a(SSLSocket sSLSocket, String str, List<? extends w11> list) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(list, "protocols");
        if (mo69322a(sSLSocket)) {
            try {
                this.f41206b.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.f41207c.invoke(sSLSocket, new Object[]{str});
                }
                this.f41209e.invoke(sSLSocket, new Object[]{lz0.f37135a.mo68548b(list)});
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
