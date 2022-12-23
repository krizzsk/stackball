package com.ogury.p244cm.internal;

import android.app.Activity;
import android.content.Context;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;

/* renamed from: com.ogury.cm.internal.baaba */
public final class baaba implements baaab {

    /* renamed from: a */
    public static final baaba f20569a = new baaba();

    /* renamed from: b */
    private static baaab f20570b;

    private baaba() {
    }

    /* renamed from: a */
    public static void m21993a(Context context) {
        bbabc.m22051b(context, "context");
        acccc acccc = acccc.f20564a;
        acccc.m21985a();
        f20570b = acccc.f20564a.mo52763a(context);
    }

    public final void activateProduct(baacb baacb) {
        bbabc.m22051b(baacb, AppLovinEventTypes.USER_VIEWED_PRODUCT);
        baaab baaab = f20570b;
        if (baaab == null) {
            bbabc.m22049a("implementation");
        }
        baaab.activateProduct(baacb);
    }

    public final void endDataSourceConnections() {
        baaab baaab = f20570b;
        if (baaab == null) {
            bbabc.m22049a("implementation");
        }
        baaab.endDataSourceConnections();
    }

    public final boolean isBillingDisabled() {
        baaab baaab = f20570b;
        if (baaab == null) {
            bbabc.m22049a("implementation");
        }
        return baaab.isBillingDisabled();
    }

    public final boolean isProductActivated() {
        baaab baaab = f20570b;
        if (baaab == null) {
            bbabc.m22049a("implementation");
        }
        return baaab.isProductActivated();
    }

    public final void launchBillingFlow(Activity activity) {
        bbabc.m22051b(activity, "activity");
        baaab baaab = f20570b;
        if (baaab == null) {
            bbabc.m22049a("implementation");
        }
        baaab.launchBillingFlow(activity);
    }

    public final void queryProductDetails() {
        baaab baaab = f20570b;
        if (baaab == null) {
            bbabc.m22049a("implementation");
        }
        baaab.queryProductDetails();
    }

    public final void queryPurchase(babaa babaa) {
        bbabc.m22051b(babaa, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        baaab baaab = f20570b;
        if (baaab == null) {
            bbabc.m22049a("implementation");
        }
        baaab.queryPurchase(babaa);
    }

    public final void setBillingFinishedListener(baaaa baaaa) {
        baaab baaab = f20570b;
        if (baaab == null) {
            bbabc.m22049a("implementation");
        }
        baaab.setBillingFinishedListener(baaaa);
    }

    public final void setQueryProductDetailsListener(baacc baacc) {
        baaab baaab = f20570b;
        if (baaab == null) {
            bbabc.m22049a("implementation");
        }
        baaab.setQueryProductDetailsListener(baacc);
    }

    public final void startDataSourceConnections(Context context) {
        bbabc.m22051b(context, "context");
        baaab a = acccc.f20564a.mo52763a(context);
        f20570b = a;
        if (a == null) {
            bbabc.m22049a("implementation");
        }
        a.startDataSourceConnections(context);
    }

    public final boolean tokenExistsForActiveProduct() {
        baaab baaab = f20570b;
        if (baaab == null) {
            bbabc.m22049a("implementation");
        }
        return baaab.tokenExistsForActiveProduct();
    }
}
