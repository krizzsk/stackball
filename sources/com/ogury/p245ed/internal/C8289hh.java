package com.ogury.p245ed.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import com.ogury.p245ed.internal.C8207ev;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;

/* renamed from: com.ogury.ed.internal.hh */
public final class C8289hh {

    /* renamed from: a */
    public static final C8289hh f21409a = new C8289hh();

    /* renamed from: b */
    private static C8285hd f21410b = C8285hd.f21403a;

    private C8289hh() {
    }

    /* renamed from: a */
    private static WebResourceResponse m23315a(String str, String str2) {
        String str3 = "javascript:" + str2 + str;
        Charset charset = C8506nz.f21713a;
        if (str3 != null) {
            byte[] bytes = str3.getBytes(charset);
            C8467mq.m23878a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(bytes));
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public static WebResourceResponse m23314a(Context context, C8195ek ekVar) {
        C8467mq.m23881b(context, "context");
        String a = C8285hd.m23306a(ekVar);
        C8207ev.C8208a aVar = C8207ev.f21255a;
        String b = C8207ev.C8208a.m22960a(context).mo53450b();
        if (b.length() > 0) {
            return m23315a(b, a);
        }
        return null;
    }
}
