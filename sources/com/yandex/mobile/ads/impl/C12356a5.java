package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.h41;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.yandex.mobile.ads.impl.a5 */
public class C12356a5 {

    /* renamed from: c */
    private static final ExecutorService f30443c = Executors.newCachedThreadPool(new oq0("YandexMobileAds.UrlTracker"));

    /* renamed from: a */
    private final Context f30444a;

    /* renamed from: b */
    private C14645t1 f30445b;

    /* renamed from: com.yandex.mobile.ads.impl.a5$a */
    private static class C12357a implements Runnable {

        /* renamed from: b */
        private final String f30446b;

        /* renamed from: c */
        private final xg1 f30447c;

        C12357a(String str, xg1 xg1) {
            this.f30446b = str;
            this.f30447c = xg1;
        }

        public void run() {
            if (!TextUtils.isEmpty(this.f30446b)) {
                this.f30447c.mo66740a(this.f30446b);
            }
        }
    }

    public C12356a5(Context context, C14645t1 t1Var) {
        this.f30444a = context.getApplicationContext();
        this.f30445b = t1Var;
    }

    /* renamed from: a */
    public void mo65674a(String str) {
        jz0 jz0 = new jz0(this.f30444a);
        if (!TextUtils.isEmpty(str)) {
            f30443c.execute(new C12357a(str, jz0));
        }
    }

    /* renamed from: a */
    public void mo65675a(String str, AdResponse adResponse, wc1 wc1) {
        e11 e11 = new e11(new C13198gf(this.f30444a, adResponse, this.f30445b, (h41.C13275a) null), wc1);
        if (!TextUtils.isEmpty(str)) {
            f30443c.execute(new C12357a(str, e11));
        }
    }

    /* renamed from: a */
    public void mo65676a(String str, wc1 wc1, k41 k41) {
        e11 e11 = new e11(k41, wc1);
        if (!TextUtils.isEmpty(str)) {
            f30443c.execute(new C12357a(str, e11));
        }
    }
}
