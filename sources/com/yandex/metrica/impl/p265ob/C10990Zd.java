package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.yandex.metrica.impl.ob.Zd */
public final class C10990Zd {

    /* renamed from: a */
    private boolean f26424a = true;

    /* renamed from: b */
    private final Context f26425b;

    /* renamed from: c */
    private final C10957Yd f26426c;

    /* renamed from: d */
    private final C10925Xd f26427d;

    public C10990Zd(Context context, C10957Yd yd, C10925Xd xd) {
        this.f26425b = context;
        this.f26426c = yd;
        this.f26427d = xd;
    }

    /* renamed from: a */
    public void mo62578a(C10675Qi qi) {
        Boolean bool = qi.mo62014f().f28203y;
        this.f26424a = bool != null ? bool.booleanValue() : true;
    }

    /* renamed from: a */
    public final HttpsURLConnection mo62577a(String str) throws IOException {
        this.f26426c.getClass();
        URLConnection openConnection = new URL(str).openConnection();
        if (!(openConnection instanceof HttpsURLConnection)) {
            openConnection = null;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
        if (httpsURLConnection == null) {
            return null;
        }
        if (this.f26424a) {
            this.f26427d.getClass();
        }
        return httpsURLConnection;
    }
}
