package com.yandex.mobile.ads.impl;

import com.google.common.net.HttpHeaders;
import com.yandex.mobile.ads.impl.b51;
import com.yandex.mobile.ads.impl.jh0;
import com.yandex.mobile.ads.impl.m41;
import java.io.IOException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.GzipSource;
import okio.Okio;
import okio.Source;

/* renamed from: com.yandex.mobile.ads.impl.xc */
public final class C15159xc implements jh0 {

    /* renamed from: a */
    private final C12979ei f42490a;

    public C15159xc(C12979ei eiVar) {
        Intrinsics.checkNotNullParameter(eiVar, "cookieJar");
        this.f42490a = eiVar;
    }

    /* renamed from: a */
    public b51 mo66058a(jh0.C13502a aVar) throws IOException {
        boolean z;
        e51 b;
        Intrinsics.checkNotNullParameter(aVar, "chain");
        c31 c31 = (c31) aVar;
        m41 i = c31.mo66201i();
        i.getClass();
        m41.C13954a aVar2 = new m41.C13954a(i);
        o41 a = i.mo68561a();
        if (a != null) {
            a.mo68890b();
            long a2 = a.mo68888a();
            if (a2 != -1) {
                aVar2.mo68577b(HttpHeaders.CONTENT_LENGTH, String.valueOf(a2));
                aVar2.mo68572a(HttpHeaders.TRANSFER_ENCODING);
            } else {
                aVar2.mo68577b(HttpHeaders.TRANSFER_ENCODING, "chunked");
                aVar2.mo68572a(HttpHeaders.CONTENT_LENGTH);
            }
        }
        int i2 = 0;
        if (i.mo68562a(HttpHeaders.HOST) == null) {
            aVar2.mo68577b(HttpHeaders.HOST, jh1.m37819a(i.mo68568g(), false));
        }
        if (i.mo68562a(HttpHeaders.CONNECTION) == null) {
            aVar2.mo68577b(HttpHeaders.CONNECTION, "Keep-Alive");
        }
        if (i.mo68562a(HttpHeaders.ACCEPT_ENCODING) == null && i.mo68562a("Range") == null) {
            aVar2.mo68577b(HttpHeaders.ACCEPT_ENCODING, "gzip");
            z = true;
        } else {
            z = false;
        }
        List<C12739ci> a3 = this.f42490a.mo66587a(i.mo68568g());
        if (!a3.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (T next : a3) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                C12739ci ciVar = (C12739ci) next;
                if (i2 > 0) {
                    sb.append("; ");
                }
                sb.append(ciVar.mo66302e());
                sb.append('=');
                sb.append(ciVar.mo66304f());
                i2 = i3;
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            aVar2.mo68577b(HttpHeaders.COOKIE, sb2);
        }
        if (i.mo68562a("User-Agent") == null) {
            aVar2.mo68577b("User-Agent", "okhttp/4.9.3");
        }
        b51 a4 = c31.mo66193a(aVar2.mo68576a());
        yb0.m44241a(this.f42490a, i.mo68568g(), a4.mo65982i());
        b51.C12571a a5 = new b51.C12571a(a4).mo65995a(i);
        if (z && StringsKt.equals("gzip", b51.m34138a(a4, HttpHeaders.CONTENT_ENCODING, (String) null, 2), true) && yb0.m44243a(a4) && (b = a4.mo65974b()) != null) {
            GzipSource gzipSource = new GzipSource(b.mo66402c());
            a5.mo65997a(a4.mo65982i().mo69508a().mo69518a(HttpHeaders.CONTENT_ENCODING).mo69518a(HttpHeaders.CONTENT_LENGTH).mo69520a());
            a5.mo65994a((e51) new d31(b51.m34138a(a4, "Content-Type", (String) null, 2), -1, Okio.buffer((Source) gzipSource)));
        }
        return a5.mo66001a();
    }
}
