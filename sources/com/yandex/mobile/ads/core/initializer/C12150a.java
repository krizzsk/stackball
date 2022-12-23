package com.yandex.mobile.ads.core.initializer;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.C12365a9;
import com.yandex.mobile.ads.impl.C12575b9;
import com.yandex.mobile.ads.impl.C14184og;
import com.yandex.mobile.ads.impl.h21;
import com.yandex.mobile.ads.impl.l30;
import com.yandex.mobile.ads.impl.le0;
import com.yandex.mobile.ads.impl.w01;
import com.yandex.mobile.ads.impl.wk0;
import com.yandex.mobile.ads.impl.x01;
import com.yandex.mobile.ads.impl.xk0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.core.initializer.a */
public class C12150a {

    /* renamed from: a */
    private final l30 f29455a = new l30();

    /* renamed from: b */
    private C12575b9 f29456b;

    /* renamed from: c */
    private xk0 f29457c;

    /* renamed from: d */
    private List<h21> f29458d = Collections.emptyList();

    /* renamed from: e */
    private Map<String, String> f29459e = Collections.emptyMap();

    /* renamed from: f */
    private String f29460f;

    /* renamed from: g */
    private String f29461g;

    /* renamed from: h */
    private String f29462h;

    public C12150a(Context context) {
        this.f29457c = wk0.m43667a(context);
        this.f29456b = C12365a9.m33637a(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo64745a(le0 le0) {
        this.f29455a.mo68314a(le0.mo68412d());
        this.f29455a.mo68315a(le0.mo68410b());
        this.f29455a.mo68317b(le0.mo68414f());
        String a = le0.mo68409a();
        boolean z = false;
        this.f29455a.mo68312a((TextUtils.isEmpty(a) || !"https://adlib-mock.yandex.net".equals(a)) ? 1 : 0);
        List<h21> d = le0.mo68412d();
        Map<String, String> b = le0.mo68410b();
        String e = le0.mo68413e();
        String c = le0.mo68411c();
        String a2 = le0.mo68409a();
        List<h21> d2 = le0.mo68412d();
        Map<String, String> b2 = le0.mo68410b();
        String e2 = le0.mo68413e();
        String c2 = le0.mo68411c();
        String a3 = le0.mo68409a();
        if (!C14184og.m40402a(this.f29458d, d2) || !C14184og.m40402a(this.f29459e, b2) || !C14184og.m40402a(this.f29460f, e2) || !C14184og.m40402a(this.f29461g, c2) || !C14184og.m40402a(this.f29462h, a3)) {
            z = true;
        }
        if (z) {
            this.f29456b = new w01(e, a2, this.f29456b);
            this.f29458d = d;
            this.f29459e = b;
            this.f29461g = c;
            this.f29460f = e;
            this.f29462h = a2;
            if (!TextUtils.isEmpty(c)) {
                this.f29457c = new x01(c);
            }
        }
    }

    /* renamed from: b */
    public C12575b9 mo64746b() {
        return this.f29456b;
    }

    /* renamed from: c */
    public xk0 mo64747c() {
        return this.f29457c;
    }

    /* renamed from: a */
    public l30 mo64744a() {
        return this.f29455a;
    }
}
