package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C14662tb;

public class jz0 implements xg1 {

    /* renamed from: a */
    private final Context f35884a;

    /* renamed from: b */
    private final s41 f35885b = s41.m41806a();

    public jz0(Context context) {
        this.f35884a = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo66740a(String str) {
        iz0 iz0 = new iz0(this.f35884a, str, new C13662a(str));
        s41 s41 = this.f35885b;
        Context context = this.f35884a;
        synchronized (s41) {
            lv0.m39021a(context).mo70284a(iz0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.jz0$a */
    private static class C13662a implements C14662tb.C14663a<fv0> {
        C13662a(String str) {
        }

        /* renamed from: a */
        public void mo64360a(Object obj) {
            int i = ((fv0) obj).f33755a;
        }

        /* renamed from: a */
        public void mo64579a(op1 op1) {
            op1.toString();
        }
    }
}
