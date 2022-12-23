package com.yandex.metrica.billing.p262v3.library;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.SkuDetailsParams;
import com.yandex.metrica.billing_interface.C10068a;
import com.yandex.metrica.billing_interface.C10073e;
import com.yandex.metrica.billing_interface.C10074f;
import com.yandex.metrica.billing_interface.C10075g;
import com.yandex.metrica.impl.p265ob.C11327i;
import com.yandex.metrica.impl.p265ob.C11614p;
import com.yandex.metrica.impl.p265ob.C11667q;
import com.yandex.metrica.impl.p265ob.C11727s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.yandex.metrica.billing.v3.library.PurchaseHistoryResponseListenerImpl */
class PurchaseHistoryResponseListenerImpl implements PurchaseHistoryResponseListener {

    /* renamed from: a */
    private final C11614p f24100a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f24101b;

    /* renamed from: c */
    private final Executor f24102c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final BillingClient f24103d;

    /* renamed from: e */
    private final C11667q f24104e;

    /* renamed from: f */
    private final String f24105f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C10050b f24106g;

    /* renamed from: h */
    private final C10075g f24107h;

    /* renamed from: com.yandex.metrica.billing.v3.library.PurchaseHistoryResponseListenerImpl$a */
    class C10044a extends C10074f {

        /* renamed from: a */
        final /* synthetic */ BillingResult f24108a;

        /* renamed from: b */
        final /* synthetic */ List f24109b;

        C10044a(BillingResult billingResult, List list) {
            this.f24108a = billingResult;
            this.f24109b = list;
        }

        /* renamed from: a */
        public void mo60938a() throws Throwable {
            PurchaseHistoryResponseListenerImpl.this.m25876a(this.f24108a, (List<PurchaseHistoryRecord>) this.f24109b);
            PurchaseHistoryResponseListenerImpl.this.f24106g.mo60942b(PurchaseHistoryResponseListenerImpl.this);
        }
    }

    /* renamed from: com.yandex.metrica.billing.v3.library.PurchaseHistoryResponseListenerImpl$b */
    class C10045b implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Map f24111a;

        /* renamed from: b */
        final /* synthetic */ Map f24112b;

        C10045b(Map map, Map map2) {
            this.f24111a = map;
            this.f24112b = map2;
        }

        public Object call() throws Exception {
            PurchaseHistoryResponseListenerImpl.this.mo60939a((Map<String, C10068a>) this.f24111a, (Map<String, C10068a>) this.f24112b);
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.billing.v3.library.PurchaseHistoryResponseListenerImpl$c */
    class C10046c extends C10074f {

        /* renamed from: a */
        final /* synthetic */ SkuDetailsParams f24114a;

        /* renamed from: b */
        final /* synthetic */ SkuDetailsResponseListenerImpl f24115b;

        /* renamed from: com.yandex.metrica.billing.v3.library.PurchaseHistoryResponseListenerImpl$c$a */
        class C10047a extends C10074f {
            C10047a() {
            }

            /* renamed from: a */
            public void mo60938a() {
                PurchaseHistoryResponseListenerImpl.this.f24106g.mo60942b(C10046c.this.f24115b);
            }
        }

        C10046c(SkuDetailsParams skuDetailsParams, SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl) {
            this.f24114a = skuDetailsParams;
            this.f24115b = skuDetailsResponseListenerImpl;
        }

        /* renamed from: a */
        public void mo60938a() throws Throwable {
            if (PurchaseHistoryResponseListenerImpl.this.f24103d.isReady()) {
                PurchaseHistoryResponseListenerImpl.this.f24103d.querySkuDetailsAsync(this.f24114a, this.f24115b);
            } else {
                PurchaseHistoryResponseListenerImpl.this.f24101b.execute(new C10047a());
            }
        }
    }

    PurchaseHistoryResponseListenerImpl(C11614p pVar, Executor executor, Executor executor2, BillingClient billingClient, C11667q qVar, String str, C10050b bVar, C10075g gVar) {
        this.f24100a = pVar;
        this.f24101b = executor;
        this.f24102c = executor2;
        this.f24103d = billingClient;
        this.f24104e = qVar;
        this.f24105f = str;
        this.f24106g = bVar;
        this.f24107h = gVar;
    }

    public void onPurchaseHistoryResponse(BillingResult billingResult, List<PurchaseHistoryRecord> list) {
        this.f24101b.execute(new C10044a(billingResult, list));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25876a(BillingResult billingResult, List<PurchaseHistoryRecord> list) throws Throwable {
        if (billingResult.getResponseCode() == 0 && list != null) {
            Map<String, C10068a> a = m25875a(list);
            Map<String, C10068a> a2 = this.f24104e.mo60949f().mo63136a(this.f24100a, a, this.f24104e.mo60948e());
            if (a2.isEmpty()) {
                mo60939a(a, a2);
            } else {
                m25878a(a2, (Callable<Void>) new C10045b(a, a2));
            }
        }
    }

    /* renamed from: a */
    private Map<String, C10068a> m25875a(List<PurchaseHistoryRecord> list) {
        HashMap hashMap = new HashMap();
        for (PurchaseHistoryRecord next : list) {
            C10073e c = C11327i.m29176c(this.f24105f);
            String sku = next.getSku();
            hashMap.put(sku, new C10068a(c, sku, next.getPurchaseToken(), next.getPurchaseTime(), 0));
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m25878a(Map<String, C10068a> map, Callable<Void> callable) {
        SkuDetailsParams build = SkuDetailsParams.newBuilder().setType(this.f24105f).setSkusList(new ArrayList(map.keySet())).build();
        String str = this.f24105f;
        Executor executor = this.f24101b;
        BillingClient billingClient = this.f24103d;
        C11667q qVar = this.f24104e;
        C10050b bVar = this.f24106g;
        SkuDetailsResponseListenerImpl skuDetailsResponseListenerImpl = new SkuDetailsResponseListenerImpl(str, executor, billingClient, qVar, callable, map, bVar);
        bVar.mo60941a((Object) skuDetailsResponseListenerImpl);
        this.f24102c.execute(new C10046c(build, skuDetailsResponseListenerImpl));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo60939a(Map<String, C10068a> map, Map<String, C10068a> map2) {
        C11727s e = this.f24104e.mo60948e();
        this.f24107h.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        for (C10068a next : map.values()) {
            if (map2.containsKey(next.f24200b)) {
                next.f24203e = currentTimeMillis;
            } else {
                C10068a a = e.mo63052a(next.f24200b);
                if (a != null) {
                    next.f24203e = a.f24203e;
                }
            }
        }
        e.mo63053a(map);
        if (!e.mo63054a() && BillingClient.SkuType.INAPP.equals(this.f24105f)) {
            e.mo63055b();
        }
    }
}
