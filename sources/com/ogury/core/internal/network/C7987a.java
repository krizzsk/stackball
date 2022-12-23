package com.ogury.core.internal.network;

import com.google.common.net.HttpHeaders;
import com.ogury.core.internal.C7921ai;
import com.ogury.core.internal.C7996u;
import java.net.HttpURLConnection;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ogury.core.internal.network.a */
/* compiled from: HeadersLoader.kt */
public final class C7987a {
    /* renamed from: a */
    public static final boolean m22239a(HeadersLoader headersLoader) {
        C7921ai.m22144b(headersLoader, "$this$isContentGzipEncoded");
        return C7921ai.m22143a((Object) headersLoader.loadHeaders().get(HttpHeaders.CONTENT_ENCODING), (Object) "gzip");
    }

    /* renamed from: a */
    public static final boolean m22240a(HttpURLConnection httpURLConnection) {
        C7921ai.m22144b(httpURLConnection, "$this$isResponseGzipEncoded");
        String headerField = httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING);
        if (headerField == null) {
            return false;
        }
        Locale locale = Locale.US;
        C7921ai.m22142a((Object) locale, "Locale.US");
        String lowerCase = headerField.toLowerCase(locale);
        C7921ai.m22142a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return C7921ai.m22143a((Object) lowerCase, (Object) "gzip");
    }

    /* renamed from: com.ogury.core.internal.network.a$a */
    /* compiled from: HeadersLoader.kt */
    public static final class C7988a implements HeadersLoader {
        C7988a() {
        }

        public final Map<String, String> loadHeaders() {
            return C7996u.m22243a();
        }
    }

    static {
        new C7988a();
    }
}
