package com.fyber.inneractive.sdk.p056m;

import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.m.k */
final class C3065k {

    /* renamed from: a */
    final String f7567a;

    /* renamed from: b */
    final String f7568b;

    /* renamed from: c */
    final Map<String, String> f7569c;

    C3065k(WebResourceRequest webResourceRequest) {
        Map<String, String> map;
        this.f7567a = webResourceRequest.getUrl().toString();
        this.f7568b = webResourceRequest.getMethod();
        if (webResourceRequest.getRequestHeaders() == null) {
            map = Collections.emptyMap();
        } else {
            map = webResourceRequest.getRequestHeaders();
        }
        this.f7569c = new HashMap(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3065k kVar = (C3065k) obj;
        if (this.f7567a.equals(kVar.f7567a) && this.f7568b.equals(kVar.f7568b)) {
            return this.f7569c.equals(kVar.f7569c);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f7567a.hashCode() * 31) + this.f7568b.hashCode()) * 31) + this.f7569c.hashCode();
    }
}
