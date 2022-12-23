package com.yandex.metrica.billing.p263v4.library;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.yandex.metrica.billing_interface.C10074f;
import com.yandex.metrica.impl.p265ob.C11667q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72091bv = {1, 0, 3}, mo72092d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010#J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\b\u0010\tJ'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\n\u0010\tR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, mo72093d2 = {"Lcom/yandex/metrica/billing/v4/library/SkuDetailsResponseListenerImpl;", "Lcom/android/billingclient/api/SkuDetailsResponseListener;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "Lcom/android/billingclient/api/SkuDetails;", "skuDetails", "", "a", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "onSkuDetailsResponse", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "e", "Ljava/util/List;", "purchaseHistoryRecords", "Lkotlin/Function0;", "d", "Lkotlin/jvm/functions/Function0;", "billingInfoSentListener", "", "Ljava/lang/String;", "type", "Lcom/android/billingclient/api/BillingClient;", "b", "Lcom/android/billingclient/api/BillingClient;", "billingClient", "Lcom/yandex/metrica/impl/ob/q;", "c", "Lcom/yandex/metrica/impl/ob/q;", "utilsProvider", "Lcom/yandex/metrica/billing/v4/library/b;", "f", "Lcom/yandex/metrica/billing/v4/library/b;", "billingLibraryConnectionHolder", "<init>", "(Ljava/lang/String;Lcom/android/billingclient/api/BillingClient;Lcom/yandex/metrica/impl/ob/q;Lkotlin/jvm/functions/Function0;Ljava/util/List;Lcom/yandex/metrica/billing/v4/library/b;)V", "billing-v4_publicBinaryProdRelease"}, mo72094k = 1, mo72095mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.billing.v4.library.SkuDetailsResponseListenerImpl */
public final class SkuDetailsResponseListenerImpl implements SkuDetailsResponseListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f24174a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final BillingClient f24175b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C11667q f24176c;

    /* renamed from: d */
    private final Function0<Unit> f24177d;

    /* renamed from: e */
    private final List<PurchaseHistoryRecord> f24178e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10065b f24179f;

    /* renamed from: com.yandex.metrica.billing.v4.library.SkuDetailsResponseListenerImpl$a */
    public static final class C10061a extends C10074f {

        /* renamed from: a */
        final /* synthetic */ SkuDetailsResponseListenerImpl f24180a;

        /* renamed from: b */
        final /* synthetic */ BillingResult f24181b;

        /* renamed from: c */
        final /* synthetic */ List f24182c;

        C10061a(SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl, BillingResult billingResult, List list) {
            this.f24180a = skuDetailsResponseListenerImpl;
            this.f24181b = billingResult;
            this.f24182c = list;
        }

        /* renamed from: a */
        public void mo60938a() {
            this.f24180a.m25923a(this.f24181b, this.f24182c);
            this.f24180a.f24179f.mo60953b(this.f24180a);
        }
    }

    /* renamed from: com.yandex.metrica.billing.v4.library.SkuDetailsResponseListenerImpl$b */
    public static final class C10062b extends C10074f {

        /* renamed from: a */
        final /* synthetic */ SkuDetailsResponseListenerImpl f24183a;

        /* renamed from: b */
        final /* synthetic */ PurchaseResponseListenerImpl f24184b;

        /* renamed from: com.yandex.metrica.billing.v4.library.SkuDetailsResponseListenerImpl$b$a */
        public static final class C10063a extends C10074f {

            /* renamed from: a */
            final /* synthetic */ C10062b f24185a;

            C10063a(C10062b bVar) {
                this.f24185a = bVar;
            }

            /* renamed from: a */
            public void mo60938a() {
                this.f24185a.f24183a.f24179f.mo60953b(this.f24185a.f24184b);
            }
        }

        C10062b(SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl, PurchaseResponseListenerImpl purchaseResponseListenerImpl) {
            this.f24183a = skuDetailsResponseListenerImpl;
            this.f24184b = purchaseResponseListenerImpl;
        }

        /* renamed from: a */
        public void mo60938a() {
            if (this.f24183a.f24175b.isReady()) {
                this.f24183a.f24175b.queryPurchasesAsync(this.f24183a.f24174a, this.f24184b);
            } else {
                this.f24183a.f24176c.mo60943a().execute(new C10063a(this));
            }
        }
    }

    public SkuDetailsResponseListenerImpl(String str, BillingClient billingClient, C11667q qVar, Function0<Unit> function0, List<? extends PurchaseHistoryRecord> list, C10065b bVar) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        Intrinsics.checkNotNullParameter(qVar, "utilsProvider");
        Intrinsics.checkNotNullParameter(function0, "billingInfoSentListener");
        Intrinsics.checkNotNullParameter(list, "purchaseHistoryRecords");
        Intrinsics.checkNotNullParameter(bVar, "billingLibraryConnectionHolder");
        this.f24174a = str;
        this.f24175b = billingClient;
        this.f24176c = qVar;
        this.f24177d = function0;
        this.f24178e = list;
        this.f24179f = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m25923a(BillingResult billingResult, List<? extends SkuDetails> list) {
        if (billingResult.getResponseCode() == 0) {
            if (!(list == null || list.isEmpty())) {
                PurchaseResponseListenerImpl purchaseResponseListenerImpl = new PurchaseResponseListenerImpl(this.f24174a, this.f24176c, this.f24177d, this.f24178e, list, this.f24179f);
                this.f24179f.mo60952a((Object) purchaseResponseListenerImpl);
                this.f24176c.mo60946c().execute(new C10062b(this, purchaseResponseListenerImpl));
            }
        }
    }

    public void onSkuDetailsResponse(BillingResult billingResult, List<? extends SkuDetails> list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f24176c.mo60943a().execute(new C10061a(this, billingResult, list));
    }
}
