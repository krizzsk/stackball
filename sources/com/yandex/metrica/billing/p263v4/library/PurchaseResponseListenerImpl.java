package com.yandex.metrica.billing.p263v4.library;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.SkuDetails;
import com.applovin.sdk.AppLovinEventParameters;
import com.yandex.metrica.billing_interface.C10072d;
import com.yandex.metrica.billing_interface.C10074f;
import com.yandex.metrica.impl.p265ob.C11475l;
import com.yandex.metrica.impl.p265ob.C11667q;
import com.yandex.metrica.impl.p265ob.C11835v3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72091bv = {1, 0, 3}, mo72092d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\f\u0010\rJ)\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H\u0003¢\u0006\u0004\b\b\u0010\rJ%\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\tR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, mo72093d2 = {"Lcom/yandex/metrica/billing/v4/library/PurchaseResponseListenerImpl;", "Lcom/android/billingclient/api/PurchasesResponseListener;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "Lcom/android/billingclient/api/Purchase;", "purchases", "", "a", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "", "", "b", "(Ljava/util/List;)Ljava/util/Map;", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "purchaseHistoryRecords", "onQueryPurchasesResponse", "Lcom/android/billingclient/api/SkuDetails;", "d", "Ljava/util/List;", "skuDetails", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "billingInfoSentListener", "Lcom/yandex/metrica/impl/ob/q;", "Lcom/yandex/metrica/impl/ob/q;", "utilsProvider", "c", "Lcom/yandex/metrica/billing/v4/library/b;", "e", "Lcom/yandex/metrica/billing/v4/library/b;", "billingLibraryConnectionHolder", "type", "<init>", "(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/q;Lkotlin/jvm/functions/Function0;Ljava/util/List;Ljava/util/List;Lcom/yandex/metrica/billing/v4/library/b;)V", "billing-v4_publicBinaryProdRelease"}, mo72094k = 1, mo72095mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.billing.v4.library.PurchaseResponseListenerImpl */
public final class PurchaseResponseListenerImpl implements PurchasesResponseListener {

    /* renamed from: a */
    private final C11667q f24166a;

    /* renamed from: b */
    private final Function0<Unit> f24167b;

    /* renamed from: c */
    private final List<PurchaseHistoryRecord> f24168c;

    /* renamed from: d */
    private final List<SkuDetails> f24169d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C10065b f24170e;

    /* renamed from: com.yandex.metrica.billing.v4.library.PurchaseResponseListenerImpl$a */
    public static final class C10060a extends C10074f {

        /* renamed from: a */
        final /* synthetic */ PurchaseResponseListenerImpl f24171a;

        /* renamed from: b */
        final /* synthetic */ BillingResult f24172b;

        /* renamed from: c */
        final /* synthetic */ List f24173c;

        C10060a(PurchaseResponseListenerImpl purchaseResponseListenerImpl, BillingResult billingResult, List list) {
            this.f24171a = purchaseResponseListenerImpl;
            this.f24172b = billingResult;
            this.f24173c = list;
        }

        /* renamed from: a */
        public void mo60938a() {
            this.f24171a.m25920a(this.f24172b, this.f24173c);
            this.f24171a.f24170e.mo60953b(this.f24171a);
        }
    }

    public PurchaseResponseListenerImpl(String str, C11667q qVar, Function0<Unit> function0, List<? extends PurchaseHistoryRecord> list, List<? extends SkuDetails> list2, C10065b bVar) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(qVar, "utilsProvider");
        Intrinsics.checkNotNullParameter(function0, "billingInfoSentListener");
        Intrinsics.checkNotNullParameter(list, "purchaseHistoryRecords");
        Intrinsics.checkNotNullParameter(list2, "skuDetails");
        Intrinsics.checkNotNullParameter(bVar, "billingLibraryConnectionHolder");
        this.f24166a = qVar;
        this.f24167b = function0;
        this.f24168c = list;
        this.f24169d = list2;
        this.f24170e = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m25920a(BillingResult billingResult, List<? extends Purchase> list) {
        C10072d dVar;
        if (billingResult.getResponseCode() == 0) {
            Map<String, Purchase> b = m25921b(list);
            Map<String, PurchaseHistoryRecord> a = m25919a(this.f24168c);
            List<SkuDetails> list2 = this.f24169d;
            ArrayList arrayList = new ArrayList();
            for (SkuDetails skuDetails : list2) {
                PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) ((LinkedHashMap) a).get(skuDetails.getSku());
                if (purchaseHistoryRecord != null) {
                    dVar = C11475l.f27619a.mo63250a(purchaseHistoryRecord, skuDetails, (Purchase) ((LinkedHashMap) b).get(skuDetails.getSku()));
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    arrayList.add(dVar);
                }
            }
            ((C11835v3) this.f24166a.mo60947d()).mo63817a((List<C10072d>) arrayList);
            this.f24167b.invoke();
        }
    }

    /* renamed from: b */
    private final Map<String, Purchase> m25921b(List<? extends Purchase> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Purchase purchase : list) {
            Iterator it = purchase.getSkus().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Intrinsics.checkNotNullExpressionValue(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
                linkedHashMap.put(str, purchase);
            }
        }
        return linkedHashMap;
    }

    public void onQueryPurchasesResponse(BillingResult billingResult, List<? extends Purchase> list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(list, "purchases");
        this.f24166a.mo60943a().execute(new C10060a(this, billingResult, list));
    }

    /* renamed from: a */
    private final Map<String, PurchaseHistoryRecord> m25919a(List<? extends PurchaseHistoryRecord> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
            Iterator it = purchaseHistoryRecord.getSkus().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Intrinsics.checkNotNullExpressionValue(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
                linkedHashMap.put(str, purchaseHistoryRecord);
            }
        }
        return linkedHashMap;
    }
}
