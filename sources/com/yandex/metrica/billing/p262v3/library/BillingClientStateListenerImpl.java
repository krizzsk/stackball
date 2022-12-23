package com.yandex.metrica.billing.p262v3.library;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.yandex.metrica.billing_interface.C10074f;
import com.yandex.metrica.billing_interface.C10075g;
import com.yandex.metrica.impl.p265ob.C11614p;
import com.yandex.metrica.impl.p265ob.C11667q;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.billing.v3.library.BillingClientStateListenerImpl */
class BillingClientStateListenerImpl implements BillingClientStateListener {

    /* renamed from: a */
    private final C11614p f24088a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f24089b;

    /* renamed from: c */
    private final Executor f24090c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final BillingClient f24091d;

    /* renamed from: e */
    private final C11667q f24092e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10050b f24093f;

    /* renamed from: com.yandex.metrica.billing.v3.library.BillingClientStateListenerImpl$a */
    class C10041a extends C10074f {

        /* renamed from: a */
        final /* synthetic */ BillingResult f24094a;

        C10041a(BillingResult billingResult) {
            this.f24094a = billingResult;
        }

        /* renamed from: a */
        public void mo60938a() throws Throwable {
            BillingClientStateListenerImpl.this.m25867a(this.f24094a);
        }
    }

    /* renamed from: com.yandex.metrica.billing.v3.library.BillingClientStateListenerImpl$b */
    class C10042b extends C10074f {

        /* renamed from: a */
        final /* synthetic */ String f24096a;

        /* renamed from: b */
        final /* synthetic */ PurchaseHistoryResponseListenerImpl f24097b;

        /* renamed from: com.yandex.metrica.billing.v3.library.BillingClientStateListenerImpl$b$a */
        class C10043a extends C10074f {
            C10043a() {
            }

            /* renamed from: a */
            public void mo60938a() {
                BillingClientStateListenerImpl.this.f24093f.mo60942b(C10042b.this.f24097b);
            }
        }

        C10042b(String str, PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl) {
            this.f24096a = str;
            this.f24097b = purchaseHistoryResponseListenerImpl;
        }

        /* renamed from: a */
        public void mo60938a() throws Throwable {
            if (BillingClientStateListenerImpl.this.f24091d.isReady()) {
                BillingClientStateListenerImpl.this.f24091d.queryPurchaseHistoryAsync(this.f24096a, this.f24097b);
            } else {
                BillingClientStateListenerImpl.this.f24089b.execute(new C10043a());
            }
        }
    }

    BillingClientStateListenerImpl(C11614p pVar, Executor executor, Executor executor2, BillingClient billingClient, C11667q qVar, C10050b bVar) {
        this.f24088a = pVar;
        this.f24089b = executor;
        this.f24090c = executor2;
        this.f24091d = billingClient;
        this.f24092e = qVar;
        this.f24093f = bVar;
    }

    public void onBillingServiceDisconnected() {
    }

    public void onBillingSetupFinished(BillingResult billingResult) {
        this.f24089b.execute(new C10041a(billingResult));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25867a(BillingResult billingResult) throws Throwable {
        if (billingResult.getResponseCode() == 0) {
            for (String str : Arrays.asList(new String[]{BillingClient.SkuType.INAPP, BillingClient.SkuType.SUBS})) {
                C11614p pVar = this.f24088a;
                Executor executor = this.f24089b;
                Executor executor2 = this.f24090c;
                BillingClient billingClient = this.f24091d;
                C11667q qVar = this.f24092e;
                C10050b bVar = this.f24093f;
                PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl = new PurchaseHistoryResponseListenerImpl(pVar, executor, executor2, billingClient, qVar, str, bVar, new C10075g());
                bVar.mo60941a((Object) purchaseHistoryResponseListenerImpl);
                this.f24090c.execute(new C10042b(str, purchaseHistoryResponseListenerImpl));
            }
        }
    }
}
