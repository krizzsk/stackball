package com.yandex.metrica.impl.p265ob;

import android.net.Uri;
import android.util.Base64;
import com.google.common.net.HttpHeaders;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Qh */
class C10673Qh extends C11049ai {

    /* renamed from: f */
    private final String f25491f;

    /* renamed from: com.yandex.metrica.impl.ob.Qh$a */
    class C10674a extends HashMap<String, String> {

        /* renamed from: a */
        final /* synthetic */ byte[] f25492a;

        C10674a(C10673Qh qh, byte[] bArr) {
            this.f25492a = bArr;
            put("Content-Type", "text/plain; charset=utf-8");
            put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
            put(HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS, "GET");
            put(HttpHeaders.CONTENT_LENGTH, String.valueOf(bArr.length));
        }
    }

    C10673Qh(Socket socket, Uri uri, C11288gi giVar, C10226Ei ei, String str, C11320hi hiVar) {
        super(socket, uri, giVar, ei, hiVar);
        this.f25491f = str;
    }

    /* renamed from: a */
    public void mo61985a() {
        try {
            byte[] encode = Base64.encode(new C11294gn().mo62977a(this.f25491f.getBytes()), 0);
            mo62650a("HTTP/1.1 200 OK", (Map<String, String>) new C10674a(this, encode), encode);
        } catch (Throwable unused) {
        }
    }
}
