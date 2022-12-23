package com.facebook.appevents.iap;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

public class InAppPurchaseAutoLogger {
    private static final String BILLING_CLIENT_PURCHASE_NAME = "com.android.billingclient.api.Purchase";

    static /* synthetic */ void access$000() {
        Class<InAppPurchaseAutoLogger> cls = InAppPurchaseAutoLogger.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                logPurchase();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    public static void startIapLogging(Context context) {
        InAppPurchaseBillingClientWrapper orCreateInstance;
        Class<InAppPurchaseAutoLogger> cls = InAppPurchaseAutoLogger.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                if (InAppPurchaseUtils.getClass(BILLING_CLIENT_PURCHASE_NAME) != null && (orCreateInstance = InAppPurchaseBillingClientWrapper.getOrCreateInstance(context)) != null && InAppPurchaseBillingClientWrapper.isServiceConnected.get()) {
                    if (InAppPurchaseLoggerManager.eligibleQueryPurchaseHistory()) {
                        orCreateInstance.queryPurchaseHistory(BillingClient.SkuType.INAPP, new Runnable() {
                            public void run() {
                                if (!CrashShieldHandler.isObjectCrashing(this)) {
                                    try {
                                        InAppPurchaseAutoLogger.access$000();
                                    } catch (Throwable th) {
                                        CrashShieldHandler.handleThrowable(th, this);
                                    }
                                }
                            }
                        });
                    } else {
                        orCreateInstance.queryPurchase(BillingClient.SkuType.INAPP, new Runnable() {
                            public void run() {
                                if (!CrashShieldHandler.isObjectCrashing(this)) {
                                    try {
                                        InAppPurchaseAutoLogger.access$000();
                                    } catch (Throwable th) {
                                        CrashShieldHandler.handleThrowable(th, this);
                                    }
                                }
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }

    private static void logPurchase() {
        Class<InAppPurchaseAutoLogger> cls = InAppPurchaseAutoLogger.class;
        if (!CrashShieldHandler.isObjectCrashing(cls)) {
            try {
                InAppPurchaseLoggerManager.filterPurchaseLogging(InAppPurchaseBillingClientWrapper.purchaseDetailsMap, InAppPurchaseBillingClientWrapper.skuDetailsMap);
                InAppPurchaseBillingClientWrapper.purchaseDetailsMap.clear();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, cls);
            }
        }
    }
}
