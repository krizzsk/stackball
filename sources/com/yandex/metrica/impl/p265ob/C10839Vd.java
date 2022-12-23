package com.yandex.metrica.impl.p265ob;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.yandex.metrica.impl.ob.Vd */
public abstract class C10839Vd {

    /* renamed from: a */
    private final String f26006a;

    /* renamed from: com.yandex.metrica.impl.ob.Vd$a */
    public static final class C10840a {

        /* renamed from: a */
        public static final int f26007a = ((int) TimeUnit.SECONDS.toMillis(30));
    }

    public C10839Vd(String str) {
        this.f26006a = str;
    }

    /* renamed from: a */
    public HttpsURLConnection mo62379a() throws IOException {
        HttpsURLConnection a = C10619P0.m27164i().mo61896x().mo62577a(this.f26006a);
        int i = C10840a.f26007a;
        a.setConnectTimeout(i);
        a.setReadTimeout(i);
        a.setDoInput(true);
        a.setRequestProperty(HttpHeaders.ACCEPT, WebRequest.CONTENT_TYPE_JSON);
        a.setRequestProperty("User-Agent", C10122B2.m26042c("com.yandex.mobile.metrica.sdk"));
        return a;
    }
}
