package com.ogury.p244cm.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ogury.p244cm.internal.bacab;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.internal.baabb */
public final class baabb implements BillingClientStateListener, PurchasesUpdatedListener, SkuDetailsResponseListener, baaab {

    /* renamed from: a */
    private baacb f20571a;

    /* renamed from: b */
    private babab f20572b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public babaa f20573c;

    /* renamed from: d */
    private baacc f20574d;

    /* renamed from: e */
    private baaaa f20575e;

    /* renamed from: f */
    private int f20576f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public volatile boolean f20577g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public baabc f20578h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public BillingClient f20579i;

    /* renamed from: j */
    private Context f20580j;

    /* renamed from: com.ogury.cm.internal.baabb$aaaaa */
    static final class aaaaa {

        /* renamed from: a */
        public static final aaaaa f20581a = new aaaaa();

        /* renamed from: b */
        private static AtomicInteger f20582b = new AtomicInteger(1);

        /* renamed from: com.ogury.cm.internal.baabb$aaaaa$aaaaa  reason: collision with other inner class name */
        static final class C15672aaaaa implements Runnable {

            /* renamed from: a */
            final /* synthetic */ bbaaa f20583a;

            C15672aaaaa(bbaaa bbaaa) {
                this.f20583a = bbaaa;
            }

            public final void run() {
                this.f20583a.mo52622a();
            }
        }

        /* renamed from: com.ogury.cm.internal.baabb$aaaaa$aaaab */
        static final class aaaab implements Runnable {

            /* renamed from: a */
            final /* synthetic */ bbaaa f20584a;

            aaaab(bbaaa bbaaa) {
                this.f20584a = bbaaa;
            }

            public final void run() {
                this.f20584a.mo52622a();
            }
        }

        private aaaaa() {
        }

        /* renamed from: a */
        public static void m21997a() {
            f20582b.set(1);
        }

        /* renamed from: a */
        public static void m21998a(BillingClient billingClient, baabb baabb, bbaaa<babcc> bbaaa) {
            bbabc.m22051b(billingClient, "billingClient");
            bbabc.m22051b(baabb, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            bbabc.m22051b(bbaaa, "task");
            if (billingClient.isReady()) {
                bbaaa.mo52622a();
                return;
            }
            Log.d("FairChoice", "taskExecutionRetryPolicy billing not ready");
            billingClient.startConnection(baabb);
            new Handler(Looper.getMainLooper()).postDelayed(new aaaab(bbaaa), 2000);
        }

        /* renamed from: a */
        public static void m21999a(bbaaa<babcc> bbaaa) {
            bbabc.m22051b(bbaaa, "block");
            int andIncrement = f20582b.getAndIncrement();
            if (andIncrement < 5) {
                new Handler(Looper.getMainLooper()).postDelayed(new C15672aaaaa(bbaaa), (long) (((float) Math.pow(2.0d, (double) andIncrement)) * 500.0f));
            }
        }
    }

    /* renamed from: com.ogury.cm.internal.baabb$aaaab */
    static final class aaaab extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ baabb f20585a;

        /* renamed from: b */
        final /* synthetic */ Activity f20586b;

        /* renamed from: c */
        final /* synthetic */ BillingFlowParams f20587c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaab(baabb baabb, Activity activity, BillingFlowParams billingFlowParams) {
            super(0);
            this.f20585a = baabb;
            this.f20586b = activity;
            this.f20587c = billingFlowParams;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo52622a() {
            baabb.access$getPlayStoreBillingClient$p(this.f20585a).launchBillingFlow(this.f20586b, this.f20587c);
            return babcc.f20603a;
        }
    }

    /* renamed from: com.ogury.cm.internal.baabb$aaaac */
    static final class aaaac extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ baabb f20588a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaac(baabb baabb) {
            super(0);
            this.f20588a = baabb;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo52622a() {
            boolean unused = this.f20588a.m21996b();
            return babcc.f20603a;
        }
    }

    /* renamed from: com.ogury.cm.internal.baabb$aaaba */
    static final class aaaba extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ baabb f20589a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaba(baabb baabb) {
            super(0);
            this.f20589a = baabb;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo52622a() {
            mo52778b();
            return babcc.f20603a;
        }

        /* renamed from: b */
        public final void mo52778b() {
            List<Purchase> purchasesList;
            List<Purchase> purchasesList2;
            Log.d("FairChoice", "queryPurchases called");
            this.f20589a.f20577g = false;
            HashSet hashSet = new HashSet();
            Purchase.PurchasesResult queryPurchases = baabb.access$getPlayStoreBillingClient$p(this.f20589a).queryPurchases(BillingClient.SkuType.INAPP);
            bbabc.m22048a((Object) queryPurchases, "playStoreBillingClient.q…lingClient.SkuType.INAPP)");
            StringBuilder sb = new StringBuilder("queryPurchases INAPP results: ");
            List<Purchase> list = null;
            sb.append(queryPurchases != null ? queryPurchases.getPurchasesList() : null);
            Log.d("FairChoice", sb.toString());
            if (!(queryPurchases == null || (purchasesList2 = queryPurchases.getPurchasesList()) == null)) {
                hashSet.addAll(purchasesList2);
            }
            if (baabb.access$isSubscriptionSupported(this.f20589a)) {
                Purchase.PurchasesResult queryPurchases2 = baabb.access$getPlayStoreBillingClient$p(this.f20589a).queryPurchases(BillingClient.SkuType.SUBS);
                bbabc.m22048a((Object) queryPurchases2, "playStoreBillingClient.q…llingClient.SkuType.SUBS)");
                if (!(queryPurchases2 == null || (purchasesList = queryPurchases2.getPurchasesList()) == null)) {
                    hashSet.addAll(purchasesList);
                }
                StringBuilder sb2 = new StringBuilder("queryPurchases SUBS results: ");
                if (queryPurchases2 != null) {
                    list = queryPurchases2.getPurchasesList();
                }
                sb2.append(list);
                Log.d("FairChoice", sb2.toString());
            }
            baabb.access$getSharedPreferences$p(this.f20589a);
            baabc.m22009a((HashSet<Purchase>) hashSet);
            babaa access$getPurchaseQueryListener$p = this.f20589a.f20573c;
            if (access$getPurchaseQueryListener$p != null) {
                access$getPurchaseQueryListener$p.mo52617a();
            }
        }
    }

    /* renamed from: com.ogury.cm.internal.baabb$aaabb */
    static final class aaabb extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ aaaba f20590a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaabb(aaaba aaaba) {
            super(0);
            this.f20590a = aaaba;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo52622a() {
            this.f20590a.mo52778b();
            return babcc.f20603a;
        }
    }

    /* renamed from: com.ogury.cm.internal.baabb$aaabc */
    static final class aaabc extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ baabb f20591a;

        /* renamed from: b */
        final /* synthetic */ String f20592b;

        /* renamed from: c */
        final /* synthetic */ SkuDetailsParams.Builder f20593c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaabc(baabb baabb, String str, SkuDetailsParams.Builder builder) {
            super(0);
            this.f20591a = baabb;
            this.f20592b = str;
            this.f20593c = builder;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo52622a() {
            Log.d("FairChoice", "querySkuDetailsAsync for " + this.f20592b);
            baabb.access$getPlayStoreBillingClient$p(this.f20591a).querySkuDetailsAsync(this.f20593c.build(), this.f20591a);
            return babcc.f20603a;
        }
    }

    /* renamed from: a */
    private static String m21994a(SkuDetails skuDetails) {
        JSONObject jSONObject = new JSONObject();
        if (skuDetails != null) {
            try {
                jSONObject = new JSONObject(skuDetails.getOriginalJson());
            } catch (Exception e) {
                Log.w("FairChoice", "Error while parsing skuDetailsJson: ".concat(String.valueOf(e)));
            }
            jSONObject.remove("skuDetailsToken");
            jSONObject.remove("rewardToken");
        }
        String jSONObject2 = jSONObject.toString();
        bbabc.m22048a((Object) jSONObject2, "billingJson.toString()");
        return jSONObject2;
    }

    /* renamed from: a */
    private final void m21995a() {
        aaaba aaaba2 = new aaaba(this);
        aaaaa aaaaa2 = aaaaa.f20581a;
        BillingClient billingClient = this.f20579i;
        if (billingClient == null) {
            bbabc.m22049a("playStoreBillingClient");
        }
        aaaaa.m21998a(billingClient, this, new aaabb(aaaba2));
    }

    public static final /* synthetic */ BillingClient access$getPlayStoreBillingClient$p(baabb baabb) {
        BillingClient billingClient = baabb.f20579i;
        if (billingClient == null) {
            bbabc.m22049a("playStoreBillingClient");
        }
        return billingClient;
    }

    public static final /* synthetic */ baabc access$getSharedPreferences$p(baabb baabb) {
        baabc baabc = baabb.f20578h;
        if (baabc == null) {
            bbabc.m22049a("sharedPreferences");
        }
        return baabc;
    }

    public static final /* synthetic */ boolean access$isSubscriptionSupported(baabb baabb) {
        BillingClient billingClient = baabb.f20579i;
        if (billingClient == null) {
            bbabc.m22049a("playStoreBillingClient");
        }
        BillingResult isFeatureSupported = billingClient.isFeatureSupported(BillingClient.FeatureType.SUBSCRIPTIONS);
        bbabc.m22048a((Object) isFeatureSupported, "playStoreBillingClient.i…eatureType.SUBSCRIPTIONS)");
        int responseCode = isFeatureSupported.getResponseCode();
        if (responseCode != 0) {
            Log.w("FairChoice", "isSubscriptionSupported() got an error response: ".concat(String.valueOf(responseCode)));
        }
        return responseCode == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final boolean m21996b() {
        Log.d("FairChoice", "connectToPlayBillingService");
        BillingClient billingClient = this.f20579i;
        if (billingClient == null) {
            bbabc.m22049a("playStoreBillingClient");
        }
        if (billingClient.isReady()) {
            return false;
        }
        BillingClient billingClient2 = this.f20579i;
        if (billingClient2 == null) {
            bbabc.m22049a("playStoreBillingClient");
        }
        billingClient2.startConnection(this);
        return true;
    }

    public final void activateProduct(baacb baacb) {
        bbabc.m22051b(baacb, AppLovinEventTypes.USER_VIEWED_PRODUCT);
        this.f20571a = baacb;
        if (this.f20578h == null) {
            bbabc.m22049a("sharedPreferences");
        }
        baabc.m22008a(baacb);
    }

    public final void endDataSourceConnections() {
        Log.d("FairChoice", "endDataSourceConnections");
        BillingClient billingClient = this.f20579i;
        if (billingClient == null) {
            bbabc.m22049a("playStoreBillingClient");
        }
        billingClient.endConnection();
    }

    public final boolean isBillingDisabled() {
        return false;
    }

    public final boolean isProductActivated() {
        return this.f20571a != null;
    }

    public final void launchBillingFlow(Activity activity) {
        bbabc.m22051b(activity, "activity");
        BillingFlowParams.Builder newBuilder = BillingFlowParams.newBuilder();
        babab babab = this.f20572b;
        SkuDetails b = babab != null ? babab.mo52782b() : null;
        if (b == null) {
            bbabc.m22047a();
        }
        BillingFlowParams build = newBuilder.setSkuDetails(b).build();
        bbabc.m22048a((Object) build, "BillingFlowParams.newBui…fo?.skuDetails!!).build()");
        aaaaa aaaaa2 = aaaaa.f20581a;
        BillingClient billingClient = this.f20579i;
        if (billingClient == null) {
            bbabc.m22049a("playStoreBillingClient");
        }
        aaaaa.m21998a(billingClient, this, new aaaab(this, activity, build));
    }

    public final void onBillingServiceDisconnected() {
        Log.d("FairChoice", "onBillingServiceDisconnected");
        aaaaa aaaaa2 = aaaaa.f20581a;
        aaaaa.m21999a(new aaaac(this));
    }

    public final void onBillingSetupFinished(BillingResult billingResult) {
        bbabc.m22051b(billingResult, "billingResult");
        int responseCode = billingResult.getResponseCode();
        if (responseCode == 0) {
            Log.d("FairChoice", "onBillingSetupFinished successfully");
            aaaaa aaaaa2 = aaaaa.f20581a;
            aaaaa.m21997a();
            if (this.f20577g) {
                m21995a();
                return;
            }
            return;
        }
        if (responseCode == 3) {
            Log.e("FairChoice", "Ogury FairChoice not available - Android Billing Library is unavailable");
            baaba baaba = baaba.f20569a;
            Context context = this.f20580j;
            if (context == null) {
                bbabc.m22049a("context");
            }
            baaba.m21993a(context);
        }
        baaac baaac = baaac.f20568a;
        Log.d("FairChoice", "onBillingSetupFinished with failure response code: ".concat(String.valueOf(baaac.m21992a(responseCode))));
        this.f20576f = responseCode;
        babaa babaa = this.f20573c;
        if (babaa != null) {
            babaa.mo52617a();
        }
    }

    public final void onPurchasesUpdated(BillingResult billingResult, List<Purchase> list) {
        bbabc.m22051b(billingResult, "billingResult");
        int responseCode = billingResult.getResponseCode();
        String str = null;
        if (responseCode != 0) {
            if (responseCode == 5) {
                Log.e("FairChoice", "Your app's configuration is incorrect. Review in the Google PlayConsole. Possible causes of this error include: APK is not signed with release key; SKU productId mismatch.");
            } else if (responseCode != 7) {
                StringBuilder sb = new StringBuilder("BillingClient.BillingResponse error code:");
                baaac baaac = baaac.f20568a;
                sb.append(baaac.m21992a(responseCode));
                Log.i("FairChoice", sb.toString());
            } else {
                Log.d("FairChoice", "already owned items");
            }
        } else if (list != null) {
            String str2 = null;
            for (Purchase purchase : list) {
                if (purchase.getPurchaseState() == 1) {
                    String sku = purchase.getSku();
                    baacb baacb = this.f20571a;
                    if (bbabc.m22050a((Object) sku, (Object) baacb != null ? baacb.mo52780b() : null)) {
                        str2 = purchase.getPurchaseToken();
                    }
                } else if (purchase.getPurchaseState() == 2) {
                    Log.d("FairChoice", "Received a pending purchase of SKU: " + purchase.getSku());
                }
            }
            str = str2;
        }
        baaaa baaaa = this.f20575e;
        if (baaaa != null) {
            JSONObject jSONObject = new JSONObject();
            if (responseCode == 0) {
                jSONObject.put("paid", true);
                jSONObject.put("token", str);
            } else {
                jSONObject.put("paid", false);
                baaac baaac2 = baaac.f20568a;
                jSONObject.put("errorMessage", baaac.m21992a(responseCode));
            }
            String jSONObject2 = jSONObject.toString();
            bbabc.m22048a((Object) jSONObject2, "json.toString()");
            baaaa.mo52669a(jSONObject2);
        }
    }

    public final void onSkuDetailsResponse(BillingResult billingResult, List<SkuDetails> list) {
        baacc baacc;
        bbabc.m22051b(billingResult, "billingResult");
        int responseCode = billingResult.getResponseCode();
        if (responseCode != 0) {
            if (this.f20576f != 0) {
                baaac baaac = baaac.f20568a;
                responseCode = this.f20576f;
            } else {
                baaac baaac2 = baaac.f20568a;
            }
            String a = baaac.m21992a(responseCode);
            this.f20576f = 0;
            Log.w("FairChoice", "SkuDetails query failed with response: ".concat(String.valueOf(a)));
            baacc baacc2 = this.f20574d;
            if (baacc2 != null) {
                baacc2.mo52667a(a, "");
                return;
            }
            return;
        }
        Log.d("FairChoice", "SkuDetails query responded with success. List: ".concat(String.valueOf(list)));
        if (list == null || list.isEmpty()) {
            this.f20572b = new babab("store-product-not-available", (SkuDetails) null);
        }
        if (list != null) {
            for (SkuDetails skuDetails : list) {
                String sku = skuDetails.getSku();
                baacb baacb = this.f20571a;
                if (bbabc.m22050a((Object) sku, (Object) baacb != null ? baacb.mo52780b() : null)) {
                    this.f20572b = new babab("ok", skuDetails);
                }
            }
        }
        babab babab = this.f20572b;
        if (babab != null && (baacc = this.f20574d) != null) {
            baacc.mo52667a(babab.mo52781a(), m21994a(babab.mo52782b()));
        }
    }

    public final void queryProductDetails() {
        baacb baacb = this.f20571a;
        if (baacb == null) {
            Log.i("FairChoice", "Product must be activated(saved) prior to calling queryProductDetails() -> FairChoice disabled");
        } else if (baacb != null) {
            String a = baacb.mo52779a();
            List a2 = bacab.aaaaa.m22026a(baacb.mo52780b());
            SkuDetailsParams.Builder newBuilder = SkuDetailsParams.newBuilder();
            bbabc.m22048a((Object) newBuilder, "SkuDetailsParams.newBuilder()");
            newBuilder.setSkusList(a2).setType(a);
            aaaaa aaaaa2 = aaaaa.f20581a;
            BillingClient billingClient = this.f20579i;
            if (billingClient == null) {
                bbabc.m22049a("playStoreBillingClient");
            }
            aaaaa.m21998a(billingClient, this, new aaabc(this, a, newBuilder));
        }
    }

    public final void queryPurchase(babaa babaa) {
        bbabc.m22051b(babaa, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f20573c = babaa;
        BillingClient billingClient = this.f20579i;
        if (billingClient == null) {
            bbabc.m22049a("playStoreBillingClient");
        }
        if (billingClient.isReady()) {
            m21995a();
        } else {
            this.f20577g = true;
        }
    }

    public final void setBillingFinishedListener(baaaa baaaa) {
        this.f20575e = baaaa;
    }

    public final void setPurchaseQueryListener(babaa babaa) {
        bbabc.m22051b(babaa, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f20577g = true;
        this.f20573c = babaa;
    }

    public final void setQueryProductDetailsListener(baacc baacc) {
        this.f20574d = baacc;
        babab babab = this.f20572b;
        if (babab != null && baacc != null) {
            baacc.mo52667a(babab.mo52781a(), m21994a(babab.mo52782b()));
        }
    }

    public final void startDataSourceConnections(Context context) {
        bbabc.m22051b(context, "context");
        this.f20580j = context;
        acccc acccc = acccc.f20564a;
        this.f20578h = acccc.m21987b(context);
        this.f20579i = acccc.f20564a.mo52762a(context, (PurchasesUpdatedListener) this);
        m21996b();
    }

    public final boolean tokenExistsForActiveProduct() {
        if (this.f20578h == null) {
            bbabc.m22049a("sharedPreferences");
        }
        String b = baabc.m22010b();
        if (this.f20578h == null) {
            bbabc.m22049a("sharedPreferences");
        }
        String a = baabc.m22006a();
        if (a != null) {
            try {
                JSONArray jSONArray = new JSONArray(a);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (bbabc.m22050a((Object) jSONObject.getString("productId"), (Object) b) && jSONObject.has("purchaseToken")) {
                        return true;
                    }
                }
                babcc babcc = babcc.f20603a;
            } catch (JSONException e) {
                Integer.valueOf(Log.e("FairChoice", "Error while parsing purchases json: " + e + ')'));
            }
        }
        return false;
    }
}
