package com.yandex.mobile.ads.impl;

import androidx.core.app.NotificationCompat;
import com.appsflyer.internal.referrer.Payload;
import com.google.common.net.HttpHeaders;
import com.yandex.mobile.ads.impl.C14881vd;
import com.yandex.mobile.ads.impl.b51;
import com.yandex.mobile.ads.impl.jh0;
import com.yandex.mobile.ads.impl.q90;
import java.io.Closeable;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: com.yandex.mobile.ads.impl.rd */
public final class C14455rd implements jh0 {

    /* renamed from: a */
    public static final C14456a f39436a = new C14456a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public b51 mo66058a(jh0.C13502a aVar) throws IOException {
        Intrinsics.checkNotNullParameter(aVar, "chain");
        c31 c31 = (c31) aVar;
        C12380ae a = c31.mo66192a();
        C14881vd a2 = new C14881vd.C14882a(System.currentTimeMillis(), c31.mo66201i(), (b51) null).mo70473a();
        m41 b = a2.mo70472b();
        b51 a3 = a2.mo70471a();
        if (a instanceof x21) {
            x21 x21 = (x21) a;
        }
        if (b == null && a3 == null) {
            b51 a4 = new b51.C12571a().mo65995a(c31.mo66201i()).mo65998a(w11.HTTP_1_1).mo65991a(504).mo65999a("Unsatisfiable Request (only-if-cached)").mo65994a(jh1.f35307c).mo66004b(-1).mo65992a(System.currentTimeMillis()).mo66001a();
            Intrinsics.checkNotNullParameter(a, NotificationCompat.CATEGORY_CALL);
            Intrinsics.checkNotNullParameter(a4, Payload.RESPONSE);
            return a4;
        } else if (b == null) {
            Intrinsics.checkNotNull(a3);
            a3.getClass();
            b51 a5 = new b51.C12571a(a3).mo65993a(C14456a.m41566a(f39436a, a3)).mo66001a();
            Intrinsics.checkNotNullParameter(a, NotificationCompat.CATEGORY_CALL);
            Intrinsics.checkNotNullParameter(a5, Payload.RESPONSE);
            return a5;
        } else {
            if (a3 != null) {
                Intrinsics.checkNotNullParameter(a, NotificationCompat.CATEGORY_CALL);
                Intrinsics.checkNotNullParameter(a3, "cachedResponse");
            }
            b51 a6 = c31.mo66193a(b);
            if (a3 != null) {
                Integer valueOf = Integer.valueOf(a6.mo65979f());
                if (valueOf != null && valueOf.intValue() == 304) {
                    b51.C12571a aVar2 = new b51.C12571a(a3);
                    C14456a aVar3 = f39436a;
                    aVar2.mo65997a(C14456a.m41567a(aVar3, a3.mo65982i(), a6.mo65982i())).mo66004b(a6.mo65989p()).mo65992a(a6.mo65987n()).mo65993a(C14456a.m41566a(aVar3, a3)).mo66005b(C14456a.m41566a(aVar3, a6)).mo66001a();
                    e51 b2 = a6.mo65974b();
                    Intrinsics.checkNotNull(b2);
                    jh1.m37826a((Closeable) b2.mo66402c());
                    Intrinsics.checkNotNull((Object) null);
                    throw null;
                }
                e51 b3 = a3.mo65974b();
                if (b3 != null) {
                    jh1.m37826a((Closeable) b3);
                }
            }
            Intrinsics.checkNotNull(a6);
            b51.C12571a aVar4 = new b51.C12571a(a6);
            C14456a aVar5 = f39436a;
            return aVar4.mo65993a(C14456a.m41566a(aVar5, a3)).mo66005b(C14456a.m41566a(aVar5, a6)).mo66001a();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rd$a */
    public static final class C14456a {
        private C14456a() {
        }

        public /* synthetic */ C14456a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static final b51 m41566a(C14456a aVar, b51 b51) {
            if ((b51 == null ? null : b51.mo65974b()) == null) {
                return b51;
            }
            b51.getClass();
            return new b51.C12571a(b51).mo65994a((e51) null).mo66001a();
        }

        /* renamed from: b */
        private final boolean m41569b(String str) {
            if (StringsKt.equals(HttpHeaders.CONNECTION, str, true) || StringsKt.equals("Keep-Alive", str, true) || StringsKt.equals(HttpHeaders.PROXY_AUTHENTICATE, str, true) || StringsKt.equals(HttpHeaders.PROXY_AUTHORIZATION, str, true) || StringsKt.equals(HttpHeaders.f10183TE, str, true) || StringsKt.equals("Trailers", str, true) || StringsKt.equals(HttpHeaders.TRANSFER_ENCODING, str, true) || StringsKt.equals(HttpHeaders.UPGRADE, str, true)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public static final q90 m41567a(C14456a aVar, q90 q90, q90 q902) {
            q90.C14366a aVar2 = new q90.C14366a();
            int size = q90.size();
            int i = 0;
            if (size > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    String a = q90.mo69509a(i2);
                    String b = q90.mo69511b(i2);
                    if ((!StringsKt.equals(HttpHeaders.WARNING, a, true) || !StringsKt.startsWith$default(b, "1", false, 2, (Object) null)) && (aVar.m41568a(a) || !aVar.m41569b(a) || q902.mo69510a(a) == null)) {
                        aVar2.mo69519a(a, b);
                    }
                    if (i3 >= size) {
                        break;
                    }
                    i2 = i3;
                }
            }
            int size2 = q902.size();
            if (size2 > 0) {
                while (true) {
                    int i4 = i + 1;
                    String a2 = q902.mo69509a(i);
                    if (!aVar.m41568a(a2) && aVar.m41569b(a2)) {
                        aVar2.mo69519a(a2, q902.mo69511b(i));
                    }
                    if (i4 >= size2) {
                        break;
                    }
                    i = i4;
                }
            }
            return aVar2.mo69520a();
        }

        /* renamed from: a */
        private final boolean m41568a(String str) {
            if (StringsKt.equals(HttpHeaders.CONTENT_LENGTH, str, true) || StringsKt.equals(HttpHeaders.CONTENT_ENCODING, str, true) || StringsKt.equals("Content-Type", str, true)) {
                return true;
            }
            return false;
        }
    }
}
