package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.hc0;
import java.io.IOException;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.yandex.mobile.ads.impl.b */
class C12467b extends C14576sb implements hc0.C13311b {

    /* renamed from: a */
    private final C14576sb f30859a;

    /* renamed from: b */
    private final C12347a f30860b = new C12347a();

    C12467b(Context context, SSLSocketFactory sSLSocketFactory) {
        this.f30859a = new ic0().mo67773a(context, this, sSLSocketFactory);
    }

    /* renamed from: a */
    public bc0 mo65925a(l41<?> l41, Map<String, String> map) throws IOException, C13965ma {
        String l = l41.mo67768l();
        if (l != null && !this.f30860b.mo65629a(l)) {
            map.put(wb0.AAB_FETCH_URL.mo70671a(), l41.mo67768l());
        }
        return this.f30859a.mo65925a(l41, map);
    }

    /* renamed from: a */
    public String mo65926a(String str) {
        return str != null && !this.f30860b.mo65629a(str) ? "https://yandex.ru/appcry" : str;
    }
}
