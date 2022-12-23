package com.yandex.metrica.impl.p265ob;

import com.android.billingclient.api.SkuDetails;
import com.yandex.metrica.billing_interface.C10070c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.l */
public final class C11475l {

    /* renamed from: a */
    public static final C11475l f27619a = new C11475l();

    private C11475l() {
    }

    /* renamed from: b */
    private final int m29670b(SkuDetails skuDetails) {
        String freeTrialPeriod = skuDetails.getFreeTrialPeriod();
        Intrinsics.checkNotNullExpressionValue(freeTrialPeriod, "skuDetails.freeTrialPeriod");
        if (freeTrialPeriod.length() == 0) {
            return skuDetails.getIntroductoryPriceCycles();
        }
        return 1;
    }

    /* renamed from: c */
    private final C10070c m29671c(SkuDetails skuDetails) {
        String freeTrialPeriod = skuDetails.getFreeTrialPeriod();
        Intrinsics.checkNotNullExpressionValue(freeTrialPeriod, "skuDetails.freeTrialPeriod");
        if (freeTrialPeriod.length() == 0) {
            return C10070c.m25940a(skuDetails.getIntroductoryPricePeriod());
        }
        return C10070c.m25940a(skuDetails.getFreeTrialPeriod());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0080  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.yandex.metrica.billing_interface.C10072d mo63250a(com.android.billingclient.api.PurchaseHistoryRecord r22, com.android.billingclient.api.SkuDetails r23, com.android.billingclient.api.Purchase r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            java.lang.String r2 = "purchasesHistoryRecord"
            r3 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.String r2 = "skuDetails"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            com.yandex.metrica.billing_interface.d r2 = new com.yandex.metrica.billing_interface.d
            java.lang.String r4 = r23.getType()
            java.lang.String r5 = "skuDetails.type"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.String r5 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            int r5 = r4.hashCode()
            r6 = 3541555(0x360a33, float:4.962776E-39)
            if (r5 == r6) goto L_0x003a
            r6 = 100343516(0x5fb1edc, float:2.3615263E-35)
            if (r5 == r6) goto L_0x002f
            goto L_0x0045
        L_0x002f:
            java.lang.String r5 = "inapp"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0045
            com.yandex.metrica.billing_interface.e r4 = com.yandex.metrica.billing_interface.C10073e.INAPP
            goto L_0x0047
        L_0x003a:
            java.lang.String r5 = "subs"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0045
            com.yandex.metrica.billing_interface.e r4 = com.yandex.metrica.billing_interface.C10073e.SUBS
            goto L_0x0047
        L_0x0045:
            com.yandex.metrica.billing_interface.e r4 = com.yandex.metrica.billing_interface.C10073e.UNKNOWN
        L_0x0047:
            java.lang.String r5 = r23.getSku()
            int r6 = r22.getQuantity()
            long r7 = r23.getPriceAmountMicros()
            java.lang.String r9 = r23.getPriceCurrencyCode()
            long r10 = r0.m29669a(r1)
            com.yandex.metrica.billing_interface.c r12 = r0.m29671c(r1)
            int r13 = r0.m29670b(r1)
            java.lang.String r1 = r23.getSubscriptionPeriod()
            com.yandex.metrica.billing_interface.c r14 = com.yandex.metrica.billing_interface.C10070c.m25940a(r1)
            java.lang.String r15 = r22.getSignature()
            java.lang.String r16 = r22.getPurchaseToken()
            long r17 = r22.getPurchaseTime()
            if (r24 == 0) goto L_0x0080
            boolean r1 = r24.isAutoRenewing()
            r19 = r1
            goto L_0x0083
        L_0x0080:
            r1 = 0
            r19 = 0
        L_0x0083:
            if (r24 == 0) goto L_0x008c
            java.lang.String r1 = r24.getOriginalJson()
            if (r1 == 0) goto L_0x008c
            goto L_0x008e
        L_0x008c:
            java.lang.String r1 = "{}"
        L_0x008e:
            r20 = r1
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r9, r10, r12, r13, r14, r15, r16, r17, r19, r20)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11475l.mo63250a(com.android.billingclient.api.PurchaseHistoryRecord, com.android.billingclient.api.SkuDetails, com.android.billingclient.api.Purchase):com.yandex.metrica.billing_interface.d");
    }

    /* renamed from: a */
    private final long m29669a(SkuDetails skuDetails) {
        String freeTrialPeriod = skuDetails.getFreeTrialPeriod();
        Intrinsics.checkNotNullExpressionValue(freeTrialPeriod, "skuDetails.freeTrialPeriod");
        if (freeTrialPeriod.length() == 0) {
            return skuDetails.getIntroductoryPriceAmountMicros();
        }
        return 0;
    }
}
