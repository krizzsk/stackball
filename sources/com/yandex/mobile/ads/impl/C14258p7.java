package com.yandex.mobile.ads.impl;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.p7 */
public final class C14258p7 implements ta1 {

    /* renamed from: a */
    public static final C14259a f38533a = new C14259a((DefaultConstructorMarker) null);

    /* renamed from: com.yandex.mobile.ads.impl.p7$a */
    public static final class C14259a {
        private C14259a() {
        }

        public /* synthetic */ C14259a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ta1 mo69324a() {
            if (lz0.f37135a.mo68547b() && Build.VERSION.SDK_INT >= 29) {
                return new C14258p7();
            }
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo69322a(SSLSocket sSLSocket) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    /* renamed from: b */
    public String mo69323b(SSLSocket sSLSocket) {
        boolean z;
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null) {
            z = true;
        } else {
            z = Intrinsics.areEqual((Object) applicationProtocol, (Object) "");
        }
        if (z) {
            return null;
        }
        return applicationProtocol;
    }

    /* renamed from: a */
    public void mo69320a(SSLSocket sSLSocket, String str, List<? extends w11> list) {
        Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            Object[] array = lz0.f37135a.mo68546a(list).toArray(new String[0]);
            if (array != null) {
                sSLParameters.setApplicationProtocols((String[]) array);
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }

    /* renamed from: a */
    public boolean mo69321a() {
        return lz0.f37135a.mo68547b() && Build.VERSION.SDK_INT >= 29;
    }
}
