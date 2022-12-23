package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.hc0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

public class ho0 extends C14576sb {

    /* renamed from: a */
    private final C12467b f34496a;

    /* renamed from: b */
    private final C14576sb f34497b;

    /* renamed from: c */
    private final q21 f34498c = new q21();

    /* renamed from: d */
    private final C15296z7 f34499d;

    /* renamed from: e */
    private final gv0 f34500e = new gv0();

    public ho0(Context context, SSLSocketFactory sSLSocketFactory) {
        ic0 ic0 = new ic0();
        this.f34496a = new C12467b(context, sSLSocketFactory);
        this.f34497b = ic0.mo67773a(context, (hc0.C13311b) null, sSLSocketFactory);
        this.f34499d = new C15296z7(context);
    }

    /* renamed from: a */
    public bc0 mo65925a(l41<?> l41, Map<String, String> map) throws IOException, C13965ma {
        fv0 a = this.f34500e.mo67354a(l41);
        if (a != null) {
            this.f34498c.getClass();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry next : a.f33757c.entrySet()) {
                arrayList.add(new n90((String) next.getKey(), (String) next.getValue()));
            }
            return new bc0(a.f33755a, arrayList, a.f33756b);
        } else if (this.f34499d.mo71161a()) {
            return this.f34496a.mo65925a(l41, map);
        } else {
            return this.f34497b.mo65925a(l41, map);
        }
    }
}
