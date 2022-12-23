package com.yandex.mobile.ads.impl;

import com.google.common.net.HttpHeaders;
import com.yandex.mobile.ads.impl.b51;
import com.yandex.mobile.ads.impl.jh0;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.BufferedSink;
import okio.Okio;

/* renamed from: com.yandex.mobile.ads.impl.be */
public final class C12584be implements jh0 {

    /* renamed from: a */
    private final boolean f31310a;

    public C12584be(boolean z) {
        this.f31310a = z;
    }

    /* renamed from: a */
    public b51 mo66058a(jh0.C13502a aVar) throws IOException {
        boolean z;
        b51.C12571a aVar2;
        b51 b51;
        Intrinsics.checkNotNullParameter(aVar, "chain");
        c31 c31 = (c31) aVar;
        d40 d = c31.mo66196d();
        Intrinsics.checkNotNull(d);
        m41 f = c31.mo66198f();
        o41 a = f.mo68561a();
        long currentTimeMillis = System.currentTimeMillis();
        d.mo66408a(f);
        Long l = null;
        if (!zb0.m44524a(f.mo68567f()) || a == null) {
            d.mo66420l();
            aVar2 = null;
            z = true;
        } else {
            if (StringsKt.equals("100-continue", f.mo68562a(HttpHeaders.EXPECT), true)) {
                d.mo66412d();
                aVar2 = d.mo66403a(true);
                d.mo66421m();
                z = false;
            } else {
                aVar2 = null;
                z = true;
            }
            if (aVar2 == null) {
                BufferedSink buffer = Okio.buffer(d.mo66406a(f, false));
                a.mo68889a(buffer);
                buffer.close();
            } else {
                d.mo66420l();
                if (!d.mo66414f().mo70985h()) {
                    d.mo66419k();
                }
            }
        }
        d.mo66411c();
        if (aVar2 == null) {
            aVar2 = d.mo66403a(false);
            Intrinsics.checkNotNull(aVar2);
            if (z) {
                d.mo66421m();
                z = false;
            }
        }
        b51 a2 = aVar2.mo65995a(f).mo65996a(d.mo66414f().mo70983f()).mo66004b(currentTimeMillis).mo65992a(System.currentTimeMillis()).mo66001a();
        int f2 = a2.mo65979f();
        if (f2 == 100) {
            b51.C12571a a3 = d.mo66403a(false);
            Intrinsics.checkNotNull(a3);
            if (z) {
                d.mo66421m();
            }
            a2 = a3.mo65995a(f).mo65996a(d.mo66414f().mo70983f()).mo66004b(currentTimeMillis).mo65992a(System.currentTimeMillis()).mo66001a();
            f2 = a2.mo65979f();
        }
        d.mo66410b(a2);
        if (!this.f31310a || f2 != 101) {
            b51 = new b51.C12571a(a2).mo65994a(d.mo66404a(a2)).mo66001a();
        } else {
            b51 = new b51.C12571a(a2).mo65994a(jh1.f35307c).mo66001a();
        }
        if (StringsKt.equals("close", b51.mo65988o().mo68562a(HttpHeaders.CONNECTION), true) || StringsKt.equals("close", b51.m34138a(b51, HttpHeaders.CONNECTION, (String) null, 2), true)) {
            d.mo66419k();
        }
        if (f2 == 204 || f2 == 205) {
            e51 b = b51.mo65974b();
            if ((b == null ? -1 : b.mo66401b()) > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("HTTP ");
                sb.append(f2);
                sb.append(" had non-zero Content-Length: ");
                e51 b2 = b51.mo65974b();
                if (b2 != null) {
                    l = Long.valueOf(b2.mo66401b());
                }
                sb.append(l);
                throw new ProtocolException(sb.toString());
            }
        }
        return b51;
    }
}
