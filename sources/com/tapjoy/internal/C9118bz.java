package com.tapjoy.internal;

import com.google.common.net.HttpHeaders;
import java.io.InputStream;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.tapjoy.internal.bz */
public abstract class C9118bz extends C9120ca {
    /* renamed from: a */
    public abstract Object mo57898a(C9101bn bnVar);

    /* renamed from: a */
    public final Map mo57900a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(HttpHeaders.ACCEPT, WebRequest.CONTENT_TYPE_JSON);
        return linkedHashMap;
    }

    /* renamed from: a */
    public final Object mo57899a(URI uri, InputStream inputStream) {
        C9101bn a = C9101bn.m24357a(inputStream);
        a.mo57849a("BASE_URI", uri);
        int i = 0;
        try {
            a.mo57868h();
            Object obj = null;
            String str = null;
            while (a.mo57870j()) {
                String l = a.mo57872l();
                if ("status".equals(l)) {
                    i = a.mo57878r();
                } else if ("message".equals(l)) {
                    str = a.mo57873m();
                } else if ("data".equals(l)) {
                    obj = mo57898a(a);
                } else {
                    a.mo57879s();
                }
            }
            a.mo57869i();
            if (i == 200) {
                return obj;
            }
            throw new C9121cb(i, str);
        } finally {
            a.close();
        }
    }
}
