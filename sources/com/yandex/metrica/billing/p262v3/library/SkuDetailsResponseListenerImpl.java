package com.yandex.metrica.billing.p262v3.library;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.yandex.metrica.billing_interface.C10068a;
import com.yandex.metrica.billing_interface.C10070c;
import com.yandex.metrica.billing_interface.C10072d;
import com.yandex.metrica.billing_interface.C10074f;
import com.yandex.metrica.impl.p265ob.C11327i;
import com.yandex.metrica.impl.p265ob.C11667q;
import com.yandex.metrica.impl.p265ob.C11835v3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.billing.v3.library.SkuDetailsResponseListenerImpl */
class SkuDetailsResponseListenerImpl implements SkuDetailsResponseListener {

    /* renamed from: a */
    private final String f24118a;

    /* renamed from: b */
    private final Executor f24119b;

    /* renamed from: c */
    private final BillingClient f24120c;

    /* renamed from: d */
    private final C11667q f24121d;

    /* renamed from: e */
    private final Callable<Void> f24122e;

    /* renamed from: f */
    private final Map<String, C10068a> f24123f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C10050b f24124g;

    /* renamed from: com.yandex.metrica.billing.v3.library.SkuDetailsResponseListenerImpl$a */
    class C10048a extends C10074f {

        /* renamed from: a */
        final /* synthetic */ BillingResult f24125a;

        /* renamed from: b */
        final /* synthetic */ List f24126b;

        C10048a(BillingResult billingResult, List list) {
            this.f24125a = billingResult;
            this.f24126b = list;
        }

        /* renamed from: a */
        public void mo60938a() throws Throwable {
            SkuDetailsResponseListenerImpl.this.m25889a(this.f24125a, this.f24126b);
            SkuDetailsResponseListenerImpl.this.f24124g.mo60942b(SkuDetailsResponseListenerImpl.this);
        }
    }

    SkuDetailsResponseListenerImpl(String str, Executor executor, BillingClient billingClient, C11667q qVar, Callable<Void> callable, Map<String, C10068a> map, C10050b bVar) {
        this.f24118a = str;
        this.f24119b = executor;
        this.f24120c = billingClient;
        this.f24121d = qVar;
        this.f24122e = callable;
        this.f24123f = map;
        this.f24124g = bVar;
    }

    /* renamed from: b */
    private int m25891b(SkuDetails skuDetails) {
        if (!skuDetails.getFreeTrialPeriod().isEmpty()) {
            return 1;
        }
        try {
            return skuDetails.getIntroductoryPriceCycles();
        } catch (Throwable unused) {
        }
        return 0;
    }

    /* renamed from: c */
    private C10070c m25892c(SkuDetails skuDetails) {
        if (skuDetails.getFreeTrialPeriod().isEmpty()) {
            return C10070c.m25940a(skuDetails.getIntroductoryPricePeriod());
        }
        return C10070c.m25940a(skuDetails.getFreeTrialPeriod());
    }

    public void onSkuDetailsResponse(BillingResult billingResult, List<SkuDetails> list) {
        this.f24119b.execute(new C10048a(billingResult, list));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25889a(BillingResult billingResult, List<SkuDetails> list) throws Throwable {
        if (billingResult.getResponseCode() == 0 && list != null && !list.isEmpty()) {
            Map<String, Purchase> a = m25888a();
            ArrayList arrayList = new ArrayList();
            for (SkuDetails next : list) {
                C10068a aVar = this.f24123f.get(next.getSku());
                Purchase purchase = (Purchase) ((HashMap) a).get(next.getSku());
                if (aVar != null) {
                    arrayList.add(m25887a(next, aVar, purchase));
                }
            }
            ((C11835v3) this.f24121d.mo60947d()).mo63817a((List<C10072d>) arrayList);
            this.f24122e.call();
        }
    }

    /* renamed from: a */
    private Map<String, Purchase> m25888a() {
        HashMap hashMap = new HashMap();
        Purchase.PurchasesResult queryPurchases = this.f24120c.queryPurchases(this.f24118a);
        List<Purchase> purchasesList = queryPurchases.getPurchasesList();
        if (queryPurchases.getResponseCode() == 0 && purchasesList != null) {
            for (Purchase next : purchasesList) {
                hashMap.put(next.getSku(), next);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private C10072d m25887a(SkuDetails skuDetails, C10068a aVar, Purchase purchase) {
        C10068a aVar2 = aVar;
        return new C10072d(C11327i.m29176c(skuDetails.getType()), skuDetails.getSku(), 1, skuDetails.getPriceAmountMicros(), skuDetails.getPriceCurrencyCode(), m25885a(skuDetails), m25892c(skuDetails), m25891b(skuDetails), C10070c.m25940a(skuDetails.getSubscriptionPeriod()), purchase != null ? purchase.getSignature() : "", aVar2.f24201c, aVar2.f24202d, purchase != null ? purchase.isAutoRenewing() : false, purchase != null ? purchase.getOriginalJson() : "{}");
    }

    /* renamed from: a */
    private long m25885a(SkuDetails skuDetails) {
        if (skuDetails.getFreeTrialPeriod().isEmpty()) {
            return skuDetails.getIntroductoryPriceAmountMicros();
        }
        return 0;
    }
}
