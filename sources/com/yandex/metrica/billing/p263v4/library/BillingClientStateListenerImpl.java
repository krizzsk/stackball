package com.yandex.metrica.billing.p263v4.library;

import android.os.Handler;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.yandex.metrica.billing_interface.C10074f;
import com.yandex.metrica.impl.p265ob.C11614p;
import com.yandex.metrica.impl.p265ob.C11667q;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72091bv = {1, 0, 3}, mo72092d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aB!\b\u0016\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, mo72093d2 = {"Lcom/yandex/metrica/billing/v4/library/BillingClientStateListenerImpl;", "Lcom/android/billingclient/api/BillingClientStateListener;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "a", "(Lcom/android/billingclient/api/BillingResult;)V", "onBillingSetupFinished", "onBillingServiceDisconnected", "()V", "Lcom/yandex/metrica/impl/ob/p;", "Lcom/yandex/metrica/impl/ob/p;", "config", "Lcom/yandex/metrica/billing/v4/library/b;", "d", "Lcom/yandex/metrica/billing/v4/library/b;", "billingLibraryConnectionHolder", "Lcom/android/billingclient/api/BillingClient;", "b", "Lcom/android/billingclient/api/BillingClient;", "billingClient", "Lcom/yandex/metrica/impl/ob/q;", "c", "Lcom/yandex/metrica/impl/ob/q;", "utilsProvider", "<init>", "(Lcom/yandex/metrica/impl/ob/p;Lcom/android/billingclient/api/BillingClient;Lcom/yandex/metrica/impl/ob/q;Lcom/yandex/metrica/billing/v4/library/b;)V", "(Lcom/yandex/metrica/impl/ob/p;Lcom/android/billingclient/api/BillingClient;Lcom/yandex/metrica/impl/ob/q;)V", "billing-v4_publicBinaryProdRelease"}, mo72094k = 1, mo72095mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.billing.v4.library.BillingClientStateListenerImpl */
public final class BillingClientStateListenerImpl implements BillingClientStateListener {

    /* renamed from: a */
    private final C11614p f24141a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final BillingClient f24142b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C11667q f24143c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10065b f24144d;

    /* renamed from: com.yandex.metrica.billing.v4.library.BillingClientStateListenerImpl$a */
    public static final class C10053a extends C10074f {

        /* renamed from: a */
        final /* synthetic */ BillingClientStateListenerImpl f24145a;

        /* renamed from: b */
        final /* synthetic */ BillingResult f24146b;

        C10053a(BillingClientStateListenerImpl billingClientStateListenerImpl, BillingResult billingResult) {
            this.f24145a = billingClientStateListenerImpl;
            this.f24146b = billingResult;
        }

        /* renamed from: a */
        public void mo60938a() {
            this.f24145a.m25909a(this.f24146b);
        }
    }

    /* renamed from: com.yandex.metrica.billing.v4.library.BillingClientStateListenerImpl$b */
    public static final class C10054b extends C10074f {

        /* renamed from: a */
        final /* synthetic */ String f24147a;

        /* renamed from: b */
        final /* synthetic */ PurchaseHistoryResponseListenerImpl f24148b;

        /* renamed from: c */
        final /* synthetic */ BillingClientStateListenerImpl f24149c;

        /* renamed from: com.yandex.metrica.billing.v4.library.BillingClientStateListenerImpl$b$a */
        public static final class C10055a extends C10074f {

            /* renamed from: a */
            final /* synthetic */ C10054b f24150a;

            C10055a(C10054b bVar) {
                this.f24150a = bVar;
            }

            /* renamed from: a */
            public void mo60938a() {
                this.f24150a.f24149c.f24144d.mo60953b(this.f24150a.f24148b);
            }
        }

        C10054b(String str, PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl, BillingClientStateListenerImpl billingClientStateListenerImpl) {
            this.f24147a = str;
            this.f24148b = purchaseHistoryResponseListenerImpl;
            this.f24149c = billingClientStateListenerImpl;
        }

        /* renamed from: a */
        public void mo60938a() {
            if (this.f24149c.f24142b.isReady()) {
                this.f24149c.f24142b.queryPurchaseHistoryAsync(this.f24147a, this.f24148b);
            } else {
                this.f24149c.f24143c.mo60943a().execute(new C10055a(this));
            }
        }
    }

    public BillingClientStateListenerImpl(C11614p pVar, BillingClient billingClient, C11667q qVar, C10065b bVar) {
        Intrinsics.checkNotNullParameter(pVar, "config");
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        Intrinsics.checkNotNullParameter(qVar, "utilsProvider");
        Intrinsics.checkNotNullParameter(bVar, "billingLibraryConnectionHolder");
        this.f24141a = pVar;
        this.f24142b = billingClient;
        this.f24143c = qVar;
        this.f24144d = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m25909a(BillingResult billingResult) {
        if (billingResult.getResponseCode() == 0) {
            for (String str : CollectionsKt.listOf(BillingClient.SkuType.INAPP, BillingClient.SkuType.SUBS)) {
                PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl = new PurchaseHistoryResponseListenerImpl(this.f24141a, this.f24142b, this.f24143c, str, this.f24144d);
                this.f24144d.mo60952a((Object) purchaseHistoryResponseListenerImpl);
                this.f24143c.mo60946c().execute(new C10054b(str, purchaseHistoryResponseListenerImpl, this));
            }
        }
    }

    public void onBillingServiceDisconnected() {
    }

    public void onBillingSetupFinished(BillingResult billingResult) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f24143c.mo60943a().execute(new C10053a(this, billingResult));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BillingClientStateListenerImpl(C11614p pVar, BillingClient billingClient, C11667q qVar) {
        this(pVar, billingClient, qVar, new C10065b(billingClient, (Handler) null, 2));
        Intrinsics.checkNotNullParameter(pVar, "config");
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        Intrinsics.checkNotNullParameter(qVar, "utilsProvider");
    }
}
