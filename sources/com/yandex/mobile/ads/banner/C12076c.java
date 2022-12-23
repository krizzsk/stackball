package com.yandex.mobile.ads.banner;

import android.view.View;
import com.yandex.mobile.ads.impl.C13955m5;
import com.yandex.mobile.ads.impl.lo1;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.banner.c */
public class C12076c implements C13955m5 {

    /* renamed from: a */
    private WeakReference<C12080g> f29049a;

    C12076c(C12080g gVar) {
        this.f29049a = new WeakReference<>(gVar);
    }

    /* renamed from: a */
    public boolean mo64374a() {
        C12080g gVar = (C12080g) this.f29049a.get();
        return gVar != null && !lo1.m38874d((View) gVar);
    }

    /* renamed from: a */
    public boolean mo64375a(int i) {
        C12080g gVar = (C12080g) this.f29049a.get();
        return gVar != null && lo1.m38870b((View) gVar) >= i;
    }
}
