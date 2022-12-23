package com.facebook.appevents;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import kotlin.Metadata;

@Metadata(mo72092d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo72093d2 = {"<anonymous>", "", "run"}, mo72094k = 3, mo72095mv = {1, 5, 1})
/* compiled from: AppEventsLoggerImpl.kt */
final class AppEventsLoggerImpl$Companion$initializeLib$1 implements Runnable {
    final /* synthetic */ Context $context;
    final /* synthetic */ AppEventsLoggerImpl $logger;

    AppEventsLoggerImpl$Companion$initializeLib$1(Context context, AppEventsLoggerImpl appEventsLoggerImpl) {
        this.$context = context;
        this.$logger = appEventsLoggerImpl;
    }

    public final void run() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                Bundle bundle = new Bundle();
                String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                int i = 0;
                for (int i2 = 0; i2 < 11; i2++) {
                    String str = strArr[i2];
                    String str2 = strArr2[i2];
                    try {
                        Class.forName(str);
                        bundle.putInt(str2, 1);
                        i |= 1 << i2;
                    } catch (ClassNotFoundException unused) {
                    }
                }
                SharedPreferences sharedPreferences = this.$context.getSharedPreferences(FacebookSdk.APP_EVENT_PREFERENCES, 0);
                if (sharedPreferences.getInt("kitsBitmask", 0) != i) {
                    sharedPreferences.edit().putInt("kitsBitmask", i).apply();
                    this.$logger.logEventImplicitly(AnalyticsEvents.EVENT_SDK_INITIALIZE, (Double) null, bundle);
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }
}
