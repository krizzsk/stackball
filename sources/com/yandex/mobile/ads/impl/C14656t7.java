package com.yandex.mobile.ads.impl;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.facebook.appevents.integrity.IntegrityManager;
import com.yandex.mobile.ads.impl.fb1;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.t7 */
public final class C14656t7 extends lz0 {

    /* renamed from: f */
    public static final C14657a f40246f = new C14657a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final boolean f40247g;

    /* renamed from: d */
    private final List<ta1> f40248d;

    /* renamed from: e */
    private final C15045wf f40249e;

    /* renamed from: com.yandex.mobile.ads.impl.t7$a */
    public static final class C14657a {
        private C14657a() {
        }

        public /* synthetic */ C14657a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.t7$b */
    public static final class C14658b implements of1 {

        /* renamed from: a */
        private final X509TrustManager f40250a;

        /* renamed from: b */
        private final Method f40251b;

        public C14658b(X509TrustManager x509TrustManager, Method method) {
            Intrinsics.checkNotNullParameter(x509TrustManager, "trustManager");
            Intrinsics.checkNotNullParameter(method, "findByIssuerAndSignatureMethod");
            this.f40250a = x509TrustManager;
            this.f40251b = method;
        }

        /* renamed from: a */
        public X509Certificate mo69154a(X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "cert");
            try {
                Object invoke = this.f40251b.invoke(this.f40250a, new Object[]{x509Certificate});
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14658b)) {
                return false;
            }
            C14658b bVar = (C14658b) obj;
            return Intrinsics.areEqual((Object) this.f40250a, (Object) bVar.f40250a) && Intrinsics.areEqual((Object) this.f40251b, (Object) bVar.f40251b);
        }

        public int hashCode() {
            return (this.f40250a.hashCode() * 31) + this.f40251b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f40250a + ", findByIssuerAndSignatureMethod=" + this.f40251b + ')';
        }
    }

    static {
        int i;
        boolean z = true;
        boolean z2 = false;
        if (lz0.f37135a.mo68547b() && (i = Build.VERSION.SDK_INT) < 30) {
            if (i >= 21) {
                z2 = true;
            }
            if (!z2) {
                throw new IllegalStateException(Intrinsics.stringPlus("Expected Android API level 21+ but was ", Integer.valueOf(i)).toString());
            }
        } else {
            z = false;
        }
        f40247g = z;
    }

    public C14656t7() {
        List listOfNotNull = CollectionsKt.listOfNotNull((T[]) new ta1[]{fb1.C13041a.m35948a(fb1.f33292h, (String) null, 1), new C15327zk(C14871v7.f41203f.mo70454a())});
        ArrayList arrayList = new ArrayList();
        for (Object next : listOfNotNull) {
            if (((ta1) next).mo69321a()) {
                arrayList.add(next);
            }
        }
        this.f40248d = arrayList;
        this.f40249e = C15045wf.f41974d.mo70687a();
    }

    /* renamed from: a */
    public C14587se mo68532a(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Intrinsics.checkNotNullParameter(x509TrustManager, "trustManager");
        Intrinsics.checkNotNullParameter(x509TrustManager, "trustManager");
        C14360q7 q7Var = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            q7Var = new C14360q7(x509TrustManager, x509TrustManagerExtensions);
        }
        return q7Var == null ? super.mo68532a(x509TrustManager) : q7Var;
    }

    /* renamed from: b */
    public String mo68540b(SSLSocket sSLSocket) {
        T t;
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        Iterator<T> it = this.f40248d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((ta1) t).mo69322a(sSLSocket)) {
                break;
            }
        }
        ta1 ta1 = (ta1) t;
        if (ta1 == null) {
            return null;
        }
        return ta1.mo69323b(sSLSocket);
    }

    /* renamed from: b */
    public boolean mo68542b(String str) {
        Intrinsics.checkNotNullParameter(str, "hostname");
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        if (i >= 23) {
            return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        return true;
    }

    /* renamed from: b */
    public of1 mo68539b(X509TrustManager x509TrustManager) {
        Intrinsics.checkNotNullParameter(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(declaredMethod, "method");
            return new C14658b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo68539b(x509TrustManager);
        }
    }

    /* renamed from: a */
    public void mo68536a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(inetSocketAddress, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e);
            }
            throw e;
        }
    }

    /* renamed from: a */
    public void mo68538a(SSLSocket sSLSocket, String str, List<w11> list) {
        T t;
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(list, "protocols");
        Iterator<T> it = this.f40248d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((ta1) t).mo69322a(sSLSocket)) {
                break;
            }
        }
        ta1 ta1 = (ta1) t;
        if (ta1 != null) {
            ta1.mo69320a(sSLSocket, str, list);
        }
    }

    /* renamed from: a */
    public Object mo68533a(String str) {
        Intrinsics.checkNotNullParameter(str, "closer");
        return this.f40249e.mo70685a(str);
    }

    /* renamed from: a */
    public void mo68535a(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, "message");
        if (!this.f40249e.mo70686a(obj)) {
            lz0.m39194a(this, str, 5, (Throwable) null, 4, (Object) null);
        }
    }
}
