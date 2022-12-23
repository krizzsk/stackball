package com.p243my.tracker.obfuscated;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.p243my.tracker.obfuscated.C7825l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.l0 */
public final class C7825l0 {

    /* renamed from: g */
    public static final Boolean f19930g = true;

    /* renamed from: h */
    private static final Set<C7825l0> f19931h = new HashSet();

    /* renamed from: i */
    private static final PurchasesUpdatedListener f19932i = $$Lambda$l0$0qjVs3bbWcc8BnUt1IfzJ6vAhA.INSTANCE;

    /* renamed from: a */
    final BillingClientStateListener f19933a = new C7826a();

    /* renamed from: b */
    private final AtomicBoolean f19934b = new AtomicBoolean();

    /* renamed from: c */
    private final List<String> f19935c;

    /* renamed from: d */
    private final String f19936d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C7827b f19937e;

    /* renamed from: f */
    private final BillingClient f19938f;

    /* renamed from: com.my.tracker.obfuscated.l0$a */
    class C7826a implements BillingClientStateListener {

        /* renamed from: a */
        final AtomicInteger f19939a = new AtomicInteger(0);

        C7826a() {
        }

        public void onBillingServiceDisconnected() {
            if (this.f19939a.incrementAndGet() >= 3 || !C7825l0.this.mo52345c()) {
                C7877u0.m21547a("ProductHelper: exceeded numbers of billing client connection attempts");
                C7825l0.this.f19937e.mo52347a(1, Collections.EMPTY_MAP);
                C7825l0.this.mo52343a();
            }
        }

        public void onBillingSetupFinished(BillingResult billingResult) {
            if (billingResult == null || billingResult.getResponseCode() != 0) {
                C7877u0.m21547a("ProductHelper: error while connecting with billing client");
                onBillingServiceDisconnected();
                return;
            }
            C7877u0.m21547a("ProductHelper: connection with billing client has been established");
            this.f19939a.set(0);
            C7825l0.this.mo52344b();
        }
    }

    /* renamed from: com.my.tracker.obfuscated.l0$b */
    public interface C7827b {
        /* renamed from: a */
        void mo52347a(int i, Map<String, JSONObject> map);
    }

    private C7825l0(List<String> list, String str, C7827b bVar, Context context) {
        this.f19935c = list;
        this.f19937e = bVar;
        this.f19938f = BillingClient.newBuilder(context).setListener(f19932i).enablePendingPurchases().build();
        this.f19936d = str;
    }

    /* renamed from: a */
    public static C7866q0 m21268a(Object obj) {
        if (!f19930g.booleanValue()) {
            C7877u0.m21551b("ProductHelper: purchase helper is disabled");
            return null;
        }
        try {
            if (obj instanceof Purchase) {
                Purchase purchase = (Purchase) obj;
                return C7866q0.m21507a(purchase.getOriginalJson(), purchase.getSignature(), C7875t0.m21540a());
            }
        } catch (Throwable th) {
            C7877u0.m21552b("ProductHelper error: exception occurred while processing uncasted object", th);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m21270a(List list, String str, C7827b bVar, Context context) {
        try {
            C7825l0 l0Var = new C7825l0(list, str, bVar, context);
            if (!l0Var.mo52345c()) {
                l0Var.mo52343a();
                bVar.mo52347a(1, Collections.EMPTY_MAP);
            }
        } catch (Throwable th) {
            C7877u0.m21552b("ProductHelper error: error while creating ProductHelper", th);
        }
    }

    /* renamed from: a */
    public static void m21271a(List<C7866q0> list, boolean z, C7827b bVar, Context context) {
        if (list.isEmpty()) {
            C7877u0.m21547a("ProductHelper: empty purchases list");
            bVar.mo52347a(0, Collections.EMPTY_MAP);
            return;
        }
        String str = z ? BillingClient.SkuType.SUBS : BillingClient.SkuType.INAPP;
        ArrayList arrayList = new ArrayList();
        for (C7866q0 c : list) {
            String c2 = c.mo52493c();
            if (!arrayList.contains(c2)) {
                arrayList.add(c2);
            }
        }
        C7806d.m21132c(new Runnable(arrayList, str, bVar, context) {
            public final /* synthetic */ List f$0;
            public final /* synthetic */ String f$1;
            public final /* synthetic */ C7825l0.C7827b f$2;
            public final /* synthetic */ Context f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C7825l0.m21270a(this.f$0, this.f$1, this.f$2, this.f$3);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m21272b(BillingResult billingResult, List list) {
        C7806d.m21130a(new Runnable(billingResult, list) {
            public final /* synthetic */ BillingResult f$1;
            public final /* synthetic */ List f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C7825l0.this.m21269a(this.f$1, this.f$2);
            }
        });
        mo52343a();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m21273c(BillingResult billingResult, List list) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52343a() {
        try {
            C7877u0.m21547a("ProductHelper: end connection with billing client");
            f19931h.remove(this);
            this.f19938f.endConnection();
        } catch (Throwable th) {
            C7877u0.m21552b("ProductHelper error: exception while end connection:", th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo52344b() {
        try {
            C7877u0.m21547a("ProductHelper: querying for " + this.f19936d);
            this.f19938f.querySkuDetailsAsync(SkuDetailsParams.newBuilder().setSkusList(this.f19935c).setType(this.f19936d).build(), new SkuDetailsResponseListener() {
                public final void onSkuDetailsResponse(BillingResult billingResult, List list) {
                    C7825l0.this.m21272b(billingResult, list);
                }
            });
        } catch (Throwable th) {
            C7877u0.m21552b("ProductHelper error: exception while querying details for " + this.f19936d, th);
            mo52343a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo52345c() {
        try {
            C7877u0.m21547a("ProductHelper: start connection with billing client");
            this.f19938f.startConnection(this.f19933a);
            f19931h.add(this);
            return true;
        } catch (Throwable th) {
            C7877u0.m21552b("ProductHelper error: exception while start connection:", th);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void m21269a(BillingResult billingResult, List<SkuDetails> list) {
        if (!this.f19934b.compareAndSet(false, true)) {
            C7877u0.m21547a("ProductHelper: skuDetails has already been received");
            return;
        }
        int responseCode = billingResult != null ? billingResult.getResponseCode() : 6;
        if (responseCode != 0) {
            String debugMessage = billingResult != null ? billingResult.getDebugMessage() : "{empty message}";
            C7877u0.m21547a("ProductHelper: getSkuDetails completed with errorCode: " + responseCode + ", message: " + debugMessage);
            this.f19937e.mo52347a(1, Collections.EMPTY_MAP);
        } else if (list == null || list.isEmpty()) {
            C7877u0.m21547a("ProductHelper: null list of skuDetail has been received");
            this.f19937e.mo52347a(0, Collections.EMPTY_MAP);
        } else {
            HashMap hashMap = new HashMap();
            C7877u0.m21547a("ProductHelper: populating map of skuDetails data");
            for (SkuDetails next : list) {
                try {
                    hashMap.put(next.getSku(), new JSONObject(next.getOriginalJson()));
                } catch (Throwable th) {
                    C7877u0.m21552b("ProductHelper error: exception while parsing skuData", th);
                }
            }
            this.f19937e.mo52347a(0, hashMap);
        }
    }
}
