package com.ogury.p244cm.internal;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ogury.core.OguryError;

/* renamed from: com.ogury.cm.internal.baaca */
public final class baaca implements baaab {

    /* renamed from: a */
    private baacc f20596a;

    public final void activateProduct(baacb baacb) {
        bbabc.m22051b(baacb, AppLovinEventTypes.USER_VIEWED_PRODUCT);
        throw new OguryError(1005, "This SDK implementation does not support FairChoice, but your asset has FairChoice enabled");
    }

    public final void endDataSourceConnections() {
        Log.d("FairChoice", "endDataSourceConnections");
    }

    public final boolean isBillingDisabled() {
        return true;
    }

    public final boolean isProductActivated() {
        return false;
    }

    public final void launchBillingFlow(Activity activity) {
        bbabc.m22051b(activity, "activity");
    }

    public final void queryProductDetails() {
        baacc baacc = this.f20596a;
        if (baacc != null) {
            baacc.mo52667a("ok", "");
        }
    }

    public final void queryPurchase(babaa babaa) {
        bbabc.m22051b(babaa, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        babaa.mo52617a();
    }

    public final void setBillingFinishedListener(baaaa baaaa) {
    }

    public final void setQueryProductDetailsListener(baacc baacc) {
        this.f20596a = baacc;
        if (baacc != null) {
            baacc.mo52667a("ok", "");
        }
    }

    public final void startDataSourceConnections(Context context) {
        bbabc.m22051b(context, "context");
        acccc acccc = acccc.f20564a;
        acccc.m21987b(context);
    }

    public final boolean tokenExistsForActiveProduct() {
        return false;
    }
}
