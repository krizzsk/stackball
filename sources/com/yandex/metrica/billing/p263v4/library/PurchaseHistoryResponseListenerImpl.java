package com.yandex.metrica.billing.p263v4.library;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.SkuDetailsParams;
import com.yandex.metrica.billing_interface.C10068a;
import com.yandex.metrica.billing_interface.C10073e;
import com.yandex.metrica.billing_interface.C10074f;
import com.yandex.metrica.billing_interface.C10075g;
import com.yandex.metrica.impl.p265ob.C11540n;
import com.yandex.metrica.impl.p265ob.C11614p;
import com.yandex.metrica.impl.p265ob.C11667q;
import com.yandex.metrica.impl.p265ob.C11727s;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo72091bv = {1, 0, 3}, mo72092d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b&\u0010'J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0003¢\u0006\u0004\b\b\u0010\tJ)\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\b\u0010\rJ9\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH\u0003¢\u0006\u0004\b\b\u0010\u0011J'\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0013\u0010\tR\u0016\u0010\u0016\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010$¨\u0006("}, mo72093d2 = {"Lcom/yandex/metrica/billing/v4/library/PurchaseHistoryResponseListenerImpl;", "Lcom/android/billingclient/api/PurchaseHistoryResponseListener;", "Lcom/android/billingclient/api/BillingResult;", "billingResult", "", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "purchaseHistoryRecords", "", "a", "(Lcom/android/billingclient/api/BillingResult;Ljava/util/List;)V", "", "", "Lcom/yandex/metrica/billing_interface/a;", "(Ljava/util/List;)Ljava/util/Map;", "newSkus", "Lkotlin/Function0;", "billingInfoSentListener", "(Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "list", "onPurchaseHistoryResponse", "d", "Ljava/lang/String;", "type", "Lcom/android/billingclient/api/BillingClient;", "b", "Lcom/android/billingclient/api/BillingClient;", "billingClient", "Lcom/yandex/metrica/billing/v4/library/b;", "e", "Lcom/yandex/metrica/billing/v4/library/b;", "billingLibraryConnectionHolder", "Lcom/yandex/metrica/impl/ob/q;", "c", "Lcom/yandex/metrica/impl/ob/q;", "utilsProvider", "Lcom/yandex/metrica/impl/ob/p;", "Lcom/yandex/metrica/impl/ob/p;", "config", "<init>", "(Lcom/yandex/metrica/impl/ob/p;Lcom/android/billingclient/api/BillingClient;Lcom/yandex/metrica/impl/ob/q;Ljava/lang/String;Lcom/yandex/metrica/billing/v4/library/b;)V", "billing-v4_publicBinaryProdRelease"}, mo72094k = 1, mo72095mv = {1, 1, 15})
/* renamed from: com.yandex.metrica.billing.v4.library.PurchaseHistoryResponseListenerImpl */
public final class PurchaseHistoryResponseListenerImpl implements PurchaseHistoryResponseListener {

    /* renamed from: a */
    private final C11614p f24151a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final BillingClient f24152b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C11667q f24153c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f24154d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C10065b f24155e;

    /* renamed from: com.yandex.metrica.billing.v4.library.PurchaseHistoryResponseListenerImpl$a */
    public static final class C10056a extends C10074f {

        /* renamed from: a */
        final /* synthetic */ PurchaseHistoryResponseListenerImpl f24156a;

        /* renamed from: b */
        final /* synthetic */ BillingResult f24157b;

        /* renamed from: c */
        final /* synthetic */ List f24158c;

        C10056a(PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl, BillingResult billingResult, List list) {
            this.f24156a = purchaseHistoryResponseListenerImpl;
            this.f24157b = billingResult;
            this.f24158c = list;
        }

        /* renamed from: a */
        public void mo60938a() {
            this.f24156a.m25914a(this.f24157b, this.f24158c);
            this.f24156a.f24155e.mo60953b(this.f24156a);
        }
    }

    /* renamed from: com.yandex.metrica.billing.v4.library.PurchaseHistoryResponseListenerImpl$b */
    static final class C10057b extends Lambda implements Function0<Unit> {

        /* renamed from: a */
        final /* synthetic */ PurchaseHistoryResponseListenerImpl f24159a;

        /* renamed from: b */
        final /* synthetic */ Map f24160b;

        /* renamed from: c */
        final /* synthetic */ Map f24161c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10057b(PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl, Map map, Map map2) {
            super(0);
            this.f24159a = purchaseHistoryResponseListenerImpl;
            this.f24160b = map;
            this.f24161c = map2;
        }

        public Object invoke() {
            C11540n nVar = C11540n.f27742a;
            Map map = this.f24160b;
            Map map2 = this.f24161c;
            String access$getType$p = this.f24159a.f24154d;
            C11727s e = this.f24159a.f24153c.mo60948e();
            Intrinsics.checkNotNullExpressionValue(e, "utilsProvider.billingInfoManager");
            C11540n.m29812a(nVar, map, map2, access$getType$p, e, (C10075g) null, 16);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.yandex.metrica.billing.v4.library.PurchaseHistoryResponseListenerImpl$c */
    public static final class C10058c extends C10074f {

        /* renamed from: a */
        final /* synthetic */ PurchaseHistoryResponseListenerImpl f24162a;

        /* renamed from: b */
        final /* synthetic */ SkuDetailsParams f24163b;

        /* renamed from: c */
        final /* synthetic */ SkuDetailsResponseListenerImpl f24164c;

        /* renamed from: com.yandex.metrica.billing.v4.library.PurchaseHistoryResponseListenerImpl$c$a */
        public static final class C10059a extends C10074f {

            /* renamed from: a */
            final /* synthetic */ C10058c f24165a;

            C10059a(C10058c cVar) {
                this.f24165a = cVar;
            }

            /* renamed from: a */
            public void mo60938a() {
                this.f24165a.f24162a.f24155e.mo60953b(this.f24165a.f24164c);
            }
        }

        C10058c(PurchaseHistoryResponseListenerImpl purchaseHistoryResponseListenerImpl, SkuDetailsParams skuDetailsParams, SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl) {
            this.f24162a = purchaseHistoryResponseListenerImpl;
            this.f24163b = skuDetailsParams;
            this.f24164c = skuDetailsResponseListenerImpl;
        }

        /* renamed from: a */
        public void mo60938a() {
            if (this.f24162a.f24152b.isReady()) {
                this.f24162a.f24152b.querySkuDetailsAsync(this.f24163b, this.f24164c);
            } else {
                this.f24162a.f24153c.mo60943a().execute(new C10059a(this));
            }
        }
    }

    public PurchaseHistoryResponseListenerImpl(C11614p pVar, BillingClient billingClient, C11667q qVar, String str, C10065b bVar) {
        Intrinsics.checkNotNullParameter(pVar, "config");
        Intrinsics.checkNotNullParameter(billingClient, "billingClient");
        Intrinsics.checkNotNullParameter(qVar, "utilsProvider");
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(bVar, "billingLibraryConnectionHolder");
        this.f24151a = pVar;
        this.f24152b = billingClient;
        this.f24153c = qVar;
        this.f24154d = str;
        this.f24155e = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m25914a(BillingResult billingResult, List<? extends PurchaseHistoryRecord> list) {
        if (billingResult.getResponseCode() == 0 && list != null) {
            Map<String, C10068a> a = m25913a(list);
            Map<String, C10068a> a2 = this.f24153c.mo60949f().mo63136a(this.f24151a, a, this.f24153c.mo60948e());
            Intrinsics.checkNotNullExpressionValue(a2, "utilsProvider.updatePoli…lingInfoManager\n        )");
            if (a2.isEmpty()) {
                C11540n nVar = C11540n.f27742a;
                String str = this.f24154d;
                C11727s e = this.f24153c.mo60948e();
                Intrinsics.checkNotNullExpressionValue(e, "utilsProvider.billingInfoManager");
                C11540n.m29812a(nVar, a, a2, str, e, (C10075g) null, 16);
                return;
            }
            m25915a(list, CollectionsKt.toList(a2.keySet()), new C10057b(this, a, a2));
        }
    }

    public void onPurchaseHistoryResponse(BillingResult billingResult, List<? extends PurchaseHistoryRecord> list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f24153c.mo60943a().execute(new C10056a(this, billingResult, list));
    }

    /* renamed from: a */
    private final Map<String, C10068a> m25913a(List<? extends PurchaseHistoryRecord> list) {
        C10073e eVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
            Iterator it = purchaseHistoryRecord.getSkus().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String str2 = this.f24154d;
                Intrinsics.checkNotNullParameter(str2, "type");
                int hashCode = str2.hashCode();
                if (hashCode != 3541555) {
                    if (hashCode == 100343516 && str2.equals(BillingClient.SkuType.INAPP)) {
                        eVar = C10073e.INAPP;
                        C10068a aVar = new C10068a(eVar, str, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0);
                        Intrinsics.checkNotNullExpressionValue(str, "info.sku");
                        linkedHashMap.put(str, aVar);
                    }
                } else if (str2.equals(BillingClient.SkuType.SUBS)) {
                    eVar = C10073e.SUBS;
                    C10068a aVar2 = new C10068a(eVar, str, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0);
                    Intrinsics.checkNotNullExpressionValue(str, "info.sku");
                    linkedHashMap.put(str, aVar2);
                }
                eVar = C10073e.UNKNOWN;
                C10068a aVar22 = new C10068a(eVar, str, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0);
                Intrinsics.checkNotNullExpressionValue(str, "info.sku");
                linkedHashMap.put(str, aVar22);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    private final void m25915a(List<? extends PurchaseHistoryRecord> list, List<String> list2, Function0<Unit> function0) {
        SkuDetailsParams build = SkuDetailsParams.newBuilder().setType(this.f24154d).setSkusList(list2).build();
        Intrinsics.checkNotNullExpressionValue(build, "SkuDetailsParams.newBuil…kus)\n            .build()");
        SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl = new SkuDetailsResponseListenerImpl(this.f24154d, this.f24152b, this.f24153c, function0, list, this.f24155e);
        this.f24155e.mo60952a((Object) skuDetailsResponseListenerImpl);
        this.f24153c.mo60946c().execute(new C10058c(this, build, skuDetailsResponseListenerImpl));
    }
}
