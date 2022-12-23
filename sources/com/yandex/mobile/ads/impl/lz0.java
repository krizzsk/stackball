package com.yandex.mobile.ads.impl;

import com.facebook.appevents.integrity.IntegrityManager;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;

public class lz0 {

    /* renamed from: a */
    public static final C13944a f37135a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static volatile lz0 f37136b;

    /* renamed from: c */
    private static final Logger f37137c = Logger.getLogger(hw0.class.getName());

    /* renamed from: com.yandex.mobile.ads.impl.lz0$a */
    public static final class C13944a {
        private C13944a() {
        }

        public /* synthetic */ C13944a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final lz0 mo68545a() {
            return lz0.f37136b;
        }

        /* renamed from: b */
        public final boolean mo68547b() {
            return Intrinsics.areEqual((Object) "Dalvik", (Object) System.getProperty("java.vm.name"));
        }

        /* renamed from: a */
        public final List<String> mo68546a(List<? extends w11> list) {
            Intrinsics.checkNotNullParameter(list, "protocols");
            ArrayList<w11> arrayList = new ArrayList<>();
            for (T next : list) {
                if (((w11) next) != w11.HTTP_1_0) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            for (w11 w11 : arrayList) {
                arrayList2.add(w11.toString());
            }
            return arrayList2;
        }

        /* renamed from: b */
        public final byte[] mo68548b(List<? extends w11> list) {
            Intrinsics.checkNotNullParameter(list, "protocols");
            Buffer buffer = new Buffer();
            Iterator it = ((ArrayList) mo68546a(list)).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                buffer.writeByte(str.length());
                buffer.writeUtf8(str);
            }
            return buffer.readByteArray();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.yandex.mobile.ads.impl.t7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.yandex.mobile.ads.impl.t7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.yandex.mobile.ads.impl.t7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.yandex.mobile.ads.impl.t7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.yandex.mobile.ads.impl.t7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.yandex.mobile.ads.impl.t7} */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (java.lang.Integer.parseInt(r1) >= 9) goto L_0x00d1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d5  */
    static {
        /*
            java.lang.String r0 = "org.eclipse.jetty.alpn.ALPN"
            com.yandex.mobile.ads.impl.lz0$a r1 = new com.yandex.mobile.ads.impl.lz0$a
            r2 = 0
            r1.<init>(r2)
            f37135a = r1
            boolean r1 = r1.mo68547b()
            if (r1 == 0) goto L_0x0039
            com.yandex.mobile.ads.impl.r7 r0 = com.yandex.mobile.ads.impl.C14442r7.f39371a
            r0.mo69699a()
            com.yandex.mobile.ads.impl.o7$a r0 = com.yandex.mobile.ads.impl.C14170o7.f38106e
            boolean r0 = com.yandex.mobile.ads.impl.C14170o7.f38107f
            if (r0 == 0) goto L_0x0023
            com.yandex.mobile.ads.impl.o7 r0 = new com.yandex.mobile.ads.impl.o7
            r0.<init>()
            goto L_0x0024
        L_0x0023:
            r0 = r2
        L_0x0024:
            if (r0 != 0) goto L_0x00da
            com.yandex.mobile.ads.impl.t7$a r0 = com.yandex.mobile.ads.impl.C14656t7.f40246f
            boolean r0 = com.yandex.mobile.ads.impl.C14656t7.f40247g
            if (r0 == 0) goto L_0x0033
            com.yandex.mobile.ads.impl.t7 r2 = new com.yandex.mobile.ads.impl.t7
            r2.<init>()
        L_0x0033:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
        L_0x0036:
            r0 = r2
            goto L_0x00da
        L_0x0039:
            com.yandex.mobile.ads.impl.uh0$a r1 = com.yandex.mobile.ads.impl.uh0.f40650d
            boolean r1 = com.yandex.mobile.ads.impl.uh0.f40651e
            if (r1 == 0) goto L_0x0047
            com.yandex.mobile.ads.impl.uh0 r1 = new com.yandex.mobile.ads.impl.uh0
            r1.<init>()
            goto L_0x0048
        L_0x0047:
            r1 = r2
        L_0x0048:
            if (r1 == 0) goto L_0x004d
            r0 = r1
            goto L_0x00da
        L_0x004d:
            java.lang.String r1 = "java.specification.version"
            java.lang.String r3 = "unknown"
            java.lang.String r1 = java.lang.System.getProperty(r1, r3)
            java.lang.String r3 = "jvmVersion"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)     // Catch:{ NumberFormatException -> 0x0063 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0063 }
            r3 = 9
            if (r1 < r3) goto L_0x0063
            goto L_0x00d1
        L_0x0063:
            r1 = 1
            java.lang.Class r3 = java.lang.Class.forName(r0, r1, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            java.lang.String r4 = "$Provider"
            java.lang.String r4 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r4)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            java.lang.Class r4 = java.lang.Class.forName(r4, r1, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            java.lang.String r5 = "$ClientProvider"
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            java.lang.Class r10 = java.lang.Class.forName(r5, r1, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            java.lang.String r5 = "$ServerProvider"
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            java.lang.Class r11 = java.lang.Class.forName(r0, r1, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            java.lang.String r0 = "put"
            r5 = 2
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            java.lang.Class<javax.net.ssl.SSLSocket> r6 = javax.net.ssl.SSLSocket.class
            r7 = 0
            r5[r7] = r6     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            r5[r1] = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            java.lang.reflect.Method r0 = r3.getMethod(r0, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            java.lang.String r4 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            java.lang.Class<javax.net.ssl.SSLSocket> r6 = javax.net.ssl.SSLSocket.class
            r5[r7] = r6     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            java.lang.reflect.Method r8 = r3.getMethod(r4, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            java.lang.String r4 = "remove"
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            java.lang.Class<javax.net.ssl.SSLSocket> r5 = javax.net.ssl.SSLSocket.class
            r1[r7] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            java.lang.reflect.Method r9 = r3.getMethod(r4, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            com.yandex.mobile.ads.impl.th0 r1 = new com.yandex.mobile.ads.impl.th0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            java.lang.String r3 = "putMethod"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            java.lang.String r3 = "getMethod"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            java.lang.String r3 = "removeMethod"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            java.lang.String r3 = "clientProviderClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            java.lang.String r3 = "serverProviderClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r3)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            r6 = r1
            r7 = r0
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00d0 }
            r2 = r1
            goto L_0x00d1
        L_0x00d0:
        L_0x00d1:
            if (r2 == 0) goto L_0x00d5
            goto L_0x0036
        L_0x00d5:
            com.yandex.mobile.ads.impl.lz0 r0 = new com.yandex.mobile.ads.impl.lz0
            r0.<init>()
        L_0x00da:
            f37136b = r0
            java.lang.Class<com.yandex.mobile.ads.impl.hw0> r0 = com.yandex.mobile.ads.impl.hw0.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f37137c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.lz0.<clinit>():void");
    }

    /* renamed from: a */
    public void mo68537a(SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
    }

    /* renamed from: a */
    public void mo68538a(SSLSocket sSLSocket, String str, List<w11> list) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(list, "protocols");
    }

    /* renamed from: b */
    public String mo68540b(SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        return null;
    }

    /* renamed from: b */
    public X509TrustManager mo68541b() {
        TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore) null);
        TrustManager[] trustManagers = instance.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager != null) {
                return (X509TrustManager) trustManager;
            }
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        String arrays = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(arrays, "java.util.Arrays.toString(this)");
        throw new IllegalStateException(Intrinsics.stringPlus("Unexpected default trust managers: ", arrays).toString());
    }

    /* renamed from: b */
    public boolean mo68542b(String str) {
        Intrinsics.checkNotNullParameter(str, "hostname");
        return true;
    }

    /* renamed from: c */
    public SSLSocketFactory mo68543c(X509TrustManager x509TrustManager) {
        Intrinsics.checkNotNullParameter(x509TrustManager, "trustManager");
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            Intrinsics.checkNotNullExpressionValue(instance, "getInstance(\"TLS\")");
            instance.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            SSLSocketFactory socketFactory = instance.getSocketFactory();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "newSSLContext().apply {\n        init(null, arrayOf<TrustManager>(trustManager), null)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError(Intrinsics.stringPlus("No System TLS: ", e), e);
        }
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "javaClass.simpleName");
        return simpleName;
    }

    /* renamed from: a */
    public void mo68536a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(inetSocketAddress, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        socket.connect(inetSocketAddress, i);
    }

    /* renamed from: a */
    public static /* synthetic */ void m39194a(lz0 lz0, String str, int i, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        lz0.mo68534a(str, i, (Throwable) null);
    }

    /* renamed from: a */
    public void mo68534a(String str, int i, Throwable th) {
        Intrinsics.checkNotNullParameter(str, "message");
        f37137c.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: a */
    public Object mo68533a(String str) {
        Intrinsics.checkNotNullParameter(str, "closer");
        if (f37137c.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: a */
    public void mo68535a(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, "message");
        if (obj == null) {
            str = Intrinsics.stringPlus(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        mo68534a(str, 5, (Throwable) obj);
    }

    /* renamed from: a */
    public C14587se mo68532a(X509TrustManager x509TrustManager) {
        Intrinsics.checkNotNullParameter(x509TrustManager, "trustManager");
        return new C14750ub(mo68539b(x509TrustManager));
    }

    /* renamed from: b */
    public of1 mo68539b(X509TrustManager x509TrustManager) {
        Intrinsics.checkNotNullParameter(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C15039wb((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }
}
