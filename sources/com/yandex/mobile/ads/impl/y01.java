package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public final class y01 extends SSLSocketFactory {

    /* renamed from: a */
    private final SSLSocketFactory f42736a;

    private y01(SSLSocketFactory sSLSocketFactory) {
        this.f42736a = sSLSocketFactory;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static javax.net.ssl.SSLSocketFactory m44159a() {
        /*
            r0 = 0
            java.lang.String r1 = "TLSv1"
            javax.net.ssl.SSLContext r1 = javax.net.ssl.SSLContext.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0014 }
            r1.init(r0, r0, r0)     // Catch:{ KeyManagementException -> 0x000a }
        L_0x000a:
            com.yandex.mobile.ads.impl.y01 r2 = new com.yandex.mobile.ads.impl.y01     // Catch:{ NoSuchAlgorithmException -> 0x0014 }
            javax.net.ssl.SSLSocketFactory r1 = r1.getSocketFactory()     // Catch:{ NoSuchAlgorithmException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0014 }
            r0 = r2
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.y01.m44159a():javax.net.ssl.SSLSocketFactory");
    }

    public Socket createSocket(String str, int i) throws IOException {
        Socket createSocket = this.f42736a.createSocket(str, i);
        ((SSLSocket) createSocket).setEnabledCipherSuites(m44160a(this.f42736a));
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        return m44160a(this.f42736a);
    }

    public String[] getSupportedCipherSuites() {
        ArrayList arrayList = new ArrayList(Arrays.asList(this.f42736a.getSupportedCipherSuites()));
        arrayList.remove("TLS_RSA_WITH_AES_128_CBC_SHA");
        arrayList.add(0, "TLS_RSA_WITH_AES_128_CBC_SHA");
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket createSocket = this.f42736a.createSocket(inetAddress, i);
        ((SSLSocket) createSocket).setEnabledCipherSuites(m44160a(this.f42736a));
        return createSocket;
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.f42736a.createSocket(socket, str, i, z);
        ((SSLSocket) createSocket).setEnabledCipherSuites(m44160a(this.f42736a));
        return createSocket;
    }

    /* renamed from: a */
    private static String[] m44160a(SSLSocketFactory sSLSocketFactory) {
        ArrayList arrayList = new ArrayList(Arrays.asList(sSLSocketFactory.getDefaultCipherSuites()));
        arrayList.remove("TLS_RSA_WITH_AES_128_CBC_SHA");
        arrayList.add(0, "TLS_RSA_WITH_AES_128_CBC_SHA");
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket createSocket = this.f42736a.createSocket(str, i, inetAddress, i2);
        ((SSLSocket) createSocket).setEnabledCipherSuites(m44160a(this.f42736a));
        return createSocket;
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket createSocket = this.f42736a.createSocket(inetAddress, i, inetAddress2, i2);
        ((SSLSocket) createSocket).setEnabledCipherSuites(m44160a(this.f42736a));
        return createSocket;
    }
}
