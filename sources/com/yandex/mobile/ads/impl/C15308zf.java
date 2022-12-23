package com.yandex.mobile.ads.impl;

import android.net.Uri;

/* renamed from: com.yandex.mobile.ads.impl.zf */
public class C15308zf extends C12985en {

    /* renamed from: a */
    private final C15246yf f43103a;

    public C15308zf(C15246yf yfVar) {
        this.f43103a = yfVar;
    }

    /* renamed from: a */
    public boolean mo66849a(C14687tm tmVar, d10 d10) {
        f50<Uri> f50 = tmVar.f40364h;
        boolean a = f50 != null ? m44580a(f50.mo66924a(j50.f35129a).toString()) : false;
        return a ? a : super.mo66849a(tmVar, d10);
    }

    /* renamed from: a */
    private boolean m44580a(String str) {
        str.getClass();
        if (str.equals("close_dialog")) {
            this.f43103a.mo71043b();
            return true;
        } else if (!str.equals("close_ad")) {
            return false;
        } else {
            this.f43103a.mo71042a();
            return true;
        }
    }
}
