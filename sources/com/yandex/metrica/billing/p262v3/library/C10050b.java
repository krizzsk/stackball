package com.yandex.metrica.billing.p262v3.library;

import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.BillingClient;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.yandex.metrica.billing.v3.library.b */
class C10050b {

    /* renamed from: a */
    private final Handler f24129a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final BillingClient f24130b;

    /* renamed from: c */
    private final Set<Object> f24131c;

    C10050b(BillingClient billingClient) {
        this(billingClient, new Handler(Looper.getMainLooper()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo60942b(Object obj) {
        this.f24131c.remove(obj);
        if (this.f24131c.size() == 0) {
            this.f24129a.post(new C10049a(this));
        }
    }

    C10050b(BillingClient billingClient, Handler handler) {
        this.f24130b = billingClient;
        this.f24131c = new HashSet();
        this.f24129a = handler;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo60941a(Object obj) {
        this.f24131c.add(obj);
    }
}
