package com.yandex.metrica.impl.p265ob;

import android.net.Uri;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.di */
public class C11161di extends C11049ai {
    C11161di(Socket socket, Uri uri, C11288gi giVar, C10226Ei ei, C11320hi hiVar) {
        super(socket, uri, giVar, ei, hiVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo61985a() {
        Set<String> queryParameterNames = this.f26537d.getQueryParameterNames();
        HashMap hashMap = new HashMap();
        for (String next : queryParameterNames) {
            hashMap.put(next, this.f26537d.getQueryParameter(next));
        }
        hashMap.remove("t");
        mo62650a("HTTP/1.1 200 OK", (Map<String, String>) new HashMap(), new byte[0]);
        ((C11390ji) this.f26535b).mo63115a(hashMap, this.f26534a.getLocalPort(), this.f26538e);
    }
}
