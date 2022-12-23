package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.tapjoy.TJAdUnitConstants;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* renamed from: com.yandex.metrica.impl.ob.um */
public final class C11827um {

    /* renamed from: a */
    private final Context f28439a;

    /* renamed from: b */
    private final C11196ec f28440b;

    /* renamed from: c */
    private final C11344ic f28441c;

    public C11827um(Context context, C11196ec ecVar, C11344ic icVar) {
        this.f28439a = context;
        this.f28440b = ecVar;
        this.f28441c = icVar;
    }

    /* renamed from: b */
    private final String m30545b() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "UUID.randomUUID().toString()");
        String replace$default = StringsKt.replace$default(uuid, "-", "", false, 4, (Object) null);
        Locale locale = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
        if (replace$default != null) {
            String lowerCase = replace$default.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public final String mo63814a() {
        boolean z;
        byte[] bArr;
        C11279gc a = this.f28440b.mo62816a(this.f28439a, (C11560nc) new C11597oc(5, TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL));
        Intrinsics.checkNotNullExpressionValue(a, "advertisingIdGetter.getI…sedRetryStrategy(5, 500))");
        C11078bc c = a.mo62962c();
        Intrinsics.checkNotNullExpressionValue(c, "advertisingIdGetter.getI…yStrategy(5, 500)).yandex");
        boolean z2 = false;
        if (c.mo62691a()) {
            C11037ac acVar = c.f26600a;
            Intrinsics.checkNotNull(acVar);
            String str = acVar.f26512b;
            Intrinsics.checkNotNull(str);
            Intrinsics.checkNotNullExpressionValue(str, "yandexAdvId.mAdTrackingInfo!!.advId!!");
            Charset charset = Charsets.UTF_8;
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                try {
                    bArr = MessageDigest.getInstance(SameMD5.TAG).digest(bytes);
                } catch (NoSuchAlgorithmException unused) {
                    bArr = new byte[0];
                }
                String a2 = C10585O2.m27104a(bArr);
                Intrinsics.checkNotNullExpressionValue(a2, "StringUtils.toHexString(…!.advId!!.toByteArray()))");
                return a2;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String a3 = this.f28441c.mo63037a().mo63003a();
        if (a3 != null) {
            if (!(a3.length() == 0)) {
                try {
                    UUID.fromString(a3);
                    z = true;
                } catch (Throwable unused2) {
                    z = false;
                }
                if (z && (!Intrinsics.areEqual((Object) a3, (Object) "00000000-0000-0000-0000-000000000000"))) {
                    z2 = true;
                }
            }
            if (z2) {
                return StringsKt.replace$default(a3, "-", "", false, 4, (Object) null);
            }
        }
        return m30545b();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11827um(android.content.Context r4) {
        /*
            r3 = this;
            com.yandex.metrica.impl.ob.P0 r0 = com.yandex.metrica.impl.p265ob.C10619P0.m27164i()
            java.lang.String r1 = "GlobalServiceLocator.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.yandex.metrica.impl.ob.ec r0 = r0.mo61892t()
            java.lang.String r2 = "GlobalServiceLocator.get…ternalAdvertisingIdGetter"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            com.yandex.metrica.impl.ob.P0 r2 = com.yandex.metrica.impl.p265ob.C10619P0.m27164i()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            com.yandex.metrica.impl.ob.ic r1 = r2.mo61875b()
            java.lang.String r2 = "GlobalServiceLocator.getInstance().appSetIdGetter"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r3.<init>(r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11827um.<init>(android.content.Context):void");
    }
}
