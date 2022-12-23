package com.yandex.metrica.billing.p263v4.library;

import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.BillingClient;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.billing.v4.library.b */
public final class C10065b {

    /* renamed from: a */
    private final Set<Object> f24187a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final BillingClient f24188b;

    /* renamed from: c */
    private final Handler f24189c;

    public C10065b(BillingClient billingClient, Handler handler) {
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        Intrinsics.checkNotNullParameter(handler, "mainHandler");
        this.f24188b = billingClient;
        this.f24189c = handler;
        this.f24187a = new LinkedHashSet();
    }

    /* renamed from: b */
    public final void mo60953b(Object obj) {
        Intrinsics.checkNotNullParameter(obj, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f24187a.remove(obj);
        if (this.f24187a.size() == 0) {
            this.f24189c.post(new C10064a(this));
        }
    }

    /* renamed from: a */
    public final void mo60952a(Object obj) {
        Intrinsics.checkNotNullParameter(obj, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f24187a.add(obj);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10065b(BillingClient billingClient, Handler handler, int i) {
        this(billingClient, (i & 2) != 0 ? new Handler(Looper.getMainLooper()) : null);
    }
}
