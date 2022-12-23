package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.core.identifiers.p266ad.huawei.C12145a;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.yandex.mobile.ads.impl.d7 */
class C12857d7 {

    /* renamed from: a */
    private final Executor f32399a = Executors.newSingleThreadExecutor(new oq0("YandexMobileAds.AdvertisingId"));

    /* renamed from: b */
    private final C12363a7 f32400b;

    /* renamed from: c */
    private final C12363a7 f32401c;

    /* renamed from: d */
    private final d90 f32402d;

    /* renamed from: com.yandex.mobile.ads.impl.d7$a */
    class C12858a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12573b7 f32403b;

        C12858a(C12573b7 b7Var) {
            this.f32403b = b7Var;
        }

        public void run() {
            C15033w6 a = C12857d7.m35017a(C12857d7.this);
            if (a.mo70651a() == null && a.mo70652b() == null) {
                ((C15235y6) this.f32403b).mo70998a();
            } else {
                ((C15235y6) this.f32403b).mo71000a(a);
            }
        }
    }

    C12857d7(Context context) {
        this.f32400b = new e90(context);
        this.f32402d = d90.m35155a(context);
        this.f32401c = new C12145a(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66434a(C12573b7 b7Var) {
        this.f32399a.execute(new C12858a(b7Var));
    }

    /* renamed from: a */
    static C15033w6 m35017a(C12857d7 d7Var) {
        C14743u6 a = d7Var.f32400b.mo64730a();
        C14743u6 a2 = d7Var.f32401c.mo64730a();
        d7Var.f32402d.mo66534b(a);
        return new C15033w6(a, a2, d7Var.f32402d.mo66533a(a));
    }
}
