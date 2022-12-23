package com.yandex.mobile.ads.impl;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.o7 */
public final class C14170o7 extends lz0 {

    /* renamed from: e */
    public static final C14171a f38106e = new C14171a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final boolean f38107f = (lz0.f37135a.mo68547b() && Build.VERSION.SDK_INT >= 29);

    /* renamed from: d */
    private final List<ta1> f38108d;

    /* renamed from: com.yandex.mobile.ads.impl.o7$a */
    public static final class C14171a {
        private C14171a() {
        }

        public /* synthetic */ C14171a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14170o7() {
        List listOfNotNull = CollectionsKt.listOfNotNull((T[]) new ta1[]{C14258p7.f38533a.mo69324a(), new C15327zk(C14871v7.f41203f.mo70454a())});
        ArrayList arrayList = new ArrayList();
        for (Object next : listOfNotNull) {
            if (((ta1) next).mo69321a()) {
                arrayList.add(next);
            }
        }
        this.f38108d = arrayList;
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
        Iterator<T> it = this.f38108d.iterator();
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
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    /* renamed from: a */
    public void mo68538a(SSLSocket sSLSocket, String str, List<? extends w11> list) {
        T t;
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(list, "protocols");
        Iterator<T> it = this.f38108d.iterator();
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
}
