package com.yandex.mobile.ads.impl;

import com.applovin.sdk.AppLovinEventParameters;
import com.appsflyer.internal.referrer.Payload;
import com.google.common.net.HttpHeaders;
import com.yandex.mobile.ads.impl.m41;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.ByteString;

public final class rh0 implements C14174oa {

    /* renamed from: b */
    private final a20 f39462b;

    /* renamed from: com.yandex.mobile.ads.impl.rh0$a */
    public /* synthetic */ class C14462a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39463a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            f39463a = iArr;
        }
    }

    public rh0(a20 a20) {
        Intrinsics.checkNotNullParameter(a20, "defaultDns");
        this.f39462b = a20;
    }

    /* renamed from: a */
    public m41 mo68945a(k61 k61, b51 b51) throws IOException {
        Proxy proxy;
        PasswordAuthentication passwordAuthentication;
        C14563s5 a;
        Intrinsics.checkNotNullParameter(b51, Payload.RESPONSE);
        List<C14753ue> e = b51.mo65978e();
        m41 o = b51.mo65988o();
        fc0 g = o.mo68568g();
        boolean z = b51.mo65979f() == 407;
        if (k61 == null) {
            proxy = null;
        } else {
            proxy = k61.mo68141b();
        }
        if (proxy == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C14753ue next : e) {
            if (StringsKt.equals("Basic", next.mo70338c(), true)) {
                a20 c = (k61 == null || (a = k61.mo68140a()) == null) ? null : a.mo69875c();
                if (c == null) {
                    c = this.f39462b;
                }
                if (z) {
                    SocketAddress address = proxy.address();
                    if (address != null) {
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                        String hostName = inetSocketAddress.getHostName();
                        Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                        passwordAuthentication = Authenticator.requestPasswordAuthentication(hostName, m41586a(proxy, g, c), inetSocketAddress.getPort(), g.mo66964l(), next.mo70337b(), next.mo70338c(), g.mo66966n(), Authenticator.RequestorType.PROXY);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                } else {
                    String g2 = g.mo66958g();
                    Intrinsics.checkNotNullExpressionValue(proxy, "proxy");
                    passwordAuthentication = Authenticator.requestPasswordAuthentication(g2, m41586a(proxy, g, c), g.mo66961i(), g.mo66964l(), next.mo70337b(), next.mo70338c(), g.mo66966n(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthentication != null) {
                    String str = z ? HttpHeaders.PROXY_AUTHORIZATION : HttpHeaders.AUTHORIZATION;
                    String userName = passwordAuthentication.getUserName();
                    Intrinsics.checkNotNullExpressionValue(userName, "auth.userName");
                    char[] password = passwordAuthentication.getPassword();
                    Intrinsics.checkNotNullExpressionValue(password, "auth.password");
                    String str2 = new String(password);
                    Charset a2 = next.mo70336a();
                    Intrinsics.checkNotNullParameter(userName, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
                    Intrinsics.checkNotNullParameter(str2, "password");
                    Intrinsics.checkNotNullParameter(a2, "charset");
                    return new m41.C13954a(o).mo68577b(str, Intrinsics.stringPlus("Basic ", ByteString.Companion.encodeString(userName + ':' + str2, a2).base64())).mo68576a();
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private final InetAddress m41586a(Proxy proxy, fc0 fc0, a20 a20) throws IOException {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C14462a.f39463a[type.ordinal()]) == 1) {
            return (InetAddress) CollectionsKt.first(a20.mo65654a(fc0.mo66958g()));
        }
        SocketAddress address = proxy.address();
        if (address != null) {
            InetAddress address2 = ((InetSocketAddress) address).getAddress();
            Intrinsics.checkNotNullExpressionValue(address2, "address() as InetSocketAddress).address");
            return address2;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
    }
}
