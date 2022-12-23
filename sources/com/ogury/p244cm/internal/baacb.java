package com.ogury.p244cm.internal;

import android.util.Log;
import com.android.billingclient.api.BillingClient;
import com.applovin.sdk.AppLovinEventParameters;

/* renamed from: com.ogury.cm.internal.baacb */
public final class baacb {

    /* renamed from: a */
    private String f20597a = "";

    /* renamed from: b */
    private final String f20598b;

    public baacb(String str, String str2) {
        bbabc.m22051b(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        bbabc.m22051b(str2, "skuType");
        this.f20598b = str;
        int hashCode = str2.hashCode();
        if (hashCode != 505523517) {
            if (hashCode == 1741942868 && str2.equals("OneTimePurchase")) {
                this.f20597a = BillingClient.SkuType.INAPP;
                return;
            }
        } else if (str2.equals("Subscription")) {
            this.f20597a = BillingClient.SkuType.SUBS;
            return;
        }
        Log.e("FairChoice", "Illegal SKU type");
    }

    /* renamed from: a */
    public final String mo52779a() {
        return this.f20597a;
    }

    /* renamed from: b */
    public final String mo52780b() {
        return this.f20598b;
    }
}
