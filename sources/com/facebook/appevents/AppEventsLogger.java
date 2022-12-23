package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72092d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 02\u00020\u0001:\u00040123B#\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0018\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u0016J\"\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0001\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u00052\b\u0010 \u001a\u0004\u0018\u00010\u00052\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010\u00052\b\u0010&\u001a\u0004\u0018\u00010\u00052\b\u0010'\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u001a\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$J$\u0010(\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J&\u0010*\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007J\u000e\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u0014J\u0018\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u00142\b\u0010-\u001a\u0004\u0018\u00010\u0005J)\u0010.\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0002\u0010/R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u00064"}, mo72093d2 = {"Lcom/facebook/appevents/AppEventsLogger;", "", "context", "Landroid/content/Context;", "applicationId", "", "accessToken", "Lcom/facebook/AccessToken;", "(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/AccessToken;)V", "getApplicationId", "()Ljava/lang/String;", "loggerImpl", "Lcom/facebook/appevents/AppEventsLoggerImpl;", "flush", "", "isValidForAccessToken", "", "logEvent", "eventName", "parameters", "Landroid/os/Bundle;", "valueToSum", "", "logProductItem", "itemID", "availability", "Lcom/facebook/appevents/AppEventsLogger$ProductAvailability;", "condition", "Lcom/facebook/appevents/AppEventsLogger$ProductCondition;", "description", "imageLink", "link", "title", "priceAmount", "Ljava/math/BigDecimal;", "currency", "Ljava/util/Currency;", "gtin", "mpn", "brand", "logPurchase", "purchaseAmount", "logPurchaseImplicitly", "logPushNotificationOpen", "payload", "action", "logSdkEvent", "(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V", "Companion", "FlushBehavior", "ProductAvailability", "ProductCondition", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
/* compiled from: AppEventsLogger.kt */
public final class AppEventsLogger {
    public static final String ACTION_APP_EVENTS_FLUSHED = "com.facebook.sdk.APP_EVENTS_FLUSHED";
    public static final String APP_EVENTS_EXTRA_FLUSH_RESULT = "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT";
    public static final String APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED = "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = AppEventsLogger.class.getCanonicalName();
    private final AppEventsLoggerImpl loggerImpl;

    @Metadata(mo72092d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo72093d2 = {"Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "", "(Ljava/lang/String;I)V", "AUTO", "EXPLICIT_ONLY", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
    /* compiled from: AppEventsLogger.kt */
    public enum FlushBehavior {
        AUTO,
        EXPLICIT_ONLY
    }

    @Metadata(mo72092d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo72093d2 = {"Lcom/facebook/appevents/AppEventsLogger$ProductAvailability;", "", "(Ljava/lang/String;I)V", "IN_STOCK", "OUT_OF_STOCK", "PREORDER", "AVALIABLE_FOR_ORDER", "DISCONTINUED", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
    /* compiled from: AppEventsLogger.kt */
    public enum ProductAvailability {
        IN_STOCK,
        OUT_OF_STOCK,
        PREORDER,
        AVALIABLE_FOR_ORDER,
        DISCONTINUED
    }

    @Metadata(mo72092d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo72093d2 = {"Lcom/facebook/appevents/AppEventsLogger$ProductCondition;", "", "(Ljava/lang/String;I)V", "NEW", "REFURBISHED", "USED", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
    /* compiled from: AppEventsLogger.kt */
    public enum ProductCondition {
        NEW,
        REFURBISHED,
        USED
    }

    @JvmStatic
    public static final void activateApp(Application application) {
        Companion.activateApp(application);
    }

    @JvmStatic
    public static final void activateApp(Application application, String str) {
        Companion.activateApp(application, str);
    }

    @JvmStatic
    @Deprecated(message = "Use {@link AppEventsLogger#activateApp(Application)} ")
    public static final void activateApp(Context context) {
        Companion.activateApp(context);
    }

    @JvmStatic
    @Deprecated(message = "Use {@link AppEventsLogger#activateApp(Application)} ")
    public static final void activateApp(Context context, String str) {
        Companion.activateApp(context, str);
    }

    @JvmStatic
    public static final void augmentWebView(WebView webView, Context context) {
        Companion.augmentWebView(webView, context);
    }

    @JvmStatic
    public static final void clearUserData() {
        Companion.clearUserData();
    }

    @JvmStatic
    public static final void clearUserID() {
        Companion.clearUserID();
    }

    @JvmStatic
    @Deprecated(message = "When using {@link AppEventsLogger#activateApp(Application)} deactivate app will be\n        logged automatically.")
    public static final void deactivateApp(Context context) {
        Companion.deactivateApp(context);
    }

    @JvmStatic
    @Deprecated(message = "When using {@link AppEventsLogger#activateApp(Application)} deactivate app will be\n        logged automatically.")
    public static final void deactivateApp(Context context, String str) {
        Companion.deactivateApp(context, str);
    }

    @JvmStatic
    public static final String getAnonymousAppDeviceGUID(Context context) {
        return Companion.getAnonymousAppDeviceGUID(context);
    }

    @JvmStatic
    public static final FlushBehavior getFlushBehavior() {
        return Companion.getFlushBehavior();
    }

    @JvmStatic
    public static final String getUserData() {
        return Companion.getUserData();
    }

    @JvmStatic
    public static final String getUserID() {
        return Companion.getUserID();
    }

    @JvmStatic
    public static final void initializeLib(Context context, String str) {
        Companion.initializeLib(context, str);
    }

    @JvmStatic
    public static final AppEventsLogger newLogger(Context context) {
        return Companion.newLogger(context);
    }

    @JvmStatic
    public static final AppEventsLogger newLogger(Context context, AccessToken accessToken) {
        return Companion.newLogger(context, accessToken);
    }

    @JvmStatic
    public static final AppEventsLogger newLogger(Context context, String str) {
        return Companion.newLogger(context, str);
    }

    @JvmStatic
    public static final AppEventsLogger newLogger(Context context, String str, AccessToken accessToken) {
        return Companion.newLogger(context, str, accessToken);
    }

    @JvmStatic
    public static final void onContextStop() {
        Companion.onContextStop();
    }

    @JvmStatic
    public static final void setFlushBehavior(FlushBehavior flushBehavior) {
        Companion.setFlushBehavior(flushBehavior);
    }

    @JvmStatic
    public static final void setInstallReferrer(String str) {
        Companion.setInstallReferrer(str);
    }

    @JvmStatic
    public static final void setPushNotificationsRegistrationId(String str) {
        Companion.setPushNotificationsRegistrationId(str);
    }

    @JvmStatic
    @Deprecated(message = "")
    public static final void setUserData(Bundle bundle) {
        Companion.setUserData(bundle);
    }

    @JvmStatic
    public static final void setUserData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Companion.setUserData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    @JvmStatic
    public static final void setUserID(String str) {
        Companion.setUserID(str);
    }

    @JvmStatic
    @Deprecated(message = "")
    public static final void updateUserProperties(Bundle bundle, GraphRequest.Callback callback) {
        Companion.updateUserProperties(bundle, callback);
    }

    @JvmStatic
    @Deprecated(message = "")
    public static final void updateUserProperties(Bundle bundle, String str, GraphRequest.Callback callback) {
        Companion.updateUserProperties(bundle, str, callback);
    }

    public /* synthetic */ AppEventsLogger(Context context, String str, AccessToken accessToken, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, accessToken);
    }

    private AppEventsLogger(Context context, String str, AccessToken accessToken) {
        this.loggerImpl = new AppEventsLoggerImpl(context, str, accessToken);
    }

    public final void logEvent(String str) {
        this.loggerImpl.logEvent(str);
    }

    public final void logEvent(String str, double d) {
        this.loggerImpl.logEvent(str, d);
    }

    public final void logEvent(String str, Bundle bundle) {
        this.loggerImpl.logEvent(str, bundle);
    }

    public final void logEvent(String str, double d, Bundle bundle) {
        this.loggerImpl.logEvent(str, d, bundle);
    }

    public final void logPurchase(BigDecimal bigDecimal, Currency currency) {
        this.loggerImpl.logPurchase(bigDecimal, currency);
    }

    public final void logPurchase(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        this.loggerImpl.logPurchase(bigDecimal, currency, bundle);
    }

    @Deprecated(message = "Use {@link AppEventsLogger#logPurchase( java.math.BigDecimal, java.util.Currency,\n   *     android.os.Bundle)} instead.")
    public final void logPurchaseImplicitly(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append("Function logPurchaseImplicitly() is deprecated and your purchase events cannot be logged with this function. ");
        sb.append(AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled() ? "Auto-logging of in-app purchase has been enabled in the SDK, so you don't have to manually log purchases" : "Please use logPurchase() function instead.");
        Log.e(TAG, sb.toString());
    }

    public final void logPushNotificationOpen(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "payload");
        this.loggerImpl.logPushNotificationOpen(bundle, (String) null);
    }

    public final void logPushNotificationOpen(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(bundle, "payload");
        this.loggerImpl.logPushNotificationOpen(bundle, str);
    }

    public final void logProductItem(String str, ProductAvailability productAvailability, ProductCondition productCondition, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, Currency currency, String str6, String str7, String str8, Bundle bundle) {
        this.loggerImpl.logProductItem(str, productAvailability, productCondition, str2, str3, str4, str5, bigDecimal, currency, str6, str7, str8, bundle);
    }

    public final void flush() {
        this.loggerImpl.flush();
    }

    public final boolean isValidForAccessToken(AccessToken accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, SDKConstants.PARAM_ACCESS_TOKEN);
        return this.loggerImpl.isValidForAccessToken(accessToken);
    }

    @Deprecated(message = "")
    public final void logSdkEvent(String str, Double d, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "eventName");
        this.loggerImpl.logSdkEvent(str, d, bundle);
    }

    public final String getApplicationId() {
        return this.loggerImpl.getApplicationId();
    }

    @Metadata(mo72092d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u001c\u0010\b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\b\u0010\u0013\u001a\u00020\tH\u0007J\b\u0010\u0014\u001a\u00020\tH\u0007J\u0012\u0010\u0015\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u001c\u0010\u0015\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u0004H\u0007J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u001b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0007J\b\u0010 \u001a\u00020\tH\u0007J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0018H\u0007J\u0012\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010)H\u0007Jl\u0010'\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010\u00042\b\u0010+\u001a\u0004\u0018\u00010\u00042\b\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010-\u001a\u0004\u0018\u00010\u00042\b\u0010.\u001a\u0004\u0018\u00010\u00042\b\u0010/\u001a\u0004\u0018\u00010\u00042\b\u00100\u001a\u0004\u0018\u00010\u00042\b\u00101\u001a\u0004\u0018\u00010\u00042\b\u00102\u001a\u0004\u0018\u00010\u00042\b\u00103\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\u0004H\u0007J\u001c\u00106\u001a\u00020\t2\b\u00107\u001a\u0004\u0018\u00010)2\b\u00108\u001a\u0004\u0018\u000109H\u0007J&\u00106\u001a\u00020\t2\b\u00107\u001a\u0004\u0018\u00010)2\b\u0010:\u001a\u0004\u0018\u00010\u00042\b\u00108\u001a\u0004\u0018\u000109H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, mo72093d2 = {"Lcom/facebook/appevents/AppEventsLogger$Companion;", "", "()V", "ACTION_APP_EVENTS_FLUSHED", "", "APP_EVENTS_EXTRA_FLUSH_RESULT", "APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED", "TAG", "activateApp", "", "application", "Landroid/app/Application;", "applicationId", "context", "Landroid/content/Context;", "str", "augmentWebView", "webView", "Landroid/webkit/WebView;", "clearUserData", "clearUserID", "deactivateApp", "getAnonymousAppDeviceGUID", "getFlushBehavior", "Lcom/facebook/appevents/AppEventsLogger$FlushBehavior;", "getUserData", "getUserID", "initializeLib", "newLogger", "Lcom/facebook/appevents/AppEventsLogger;", "accessToken", "Lcom/facebook/AccessToken;", "onContextStop", "setFlushBehavior", "flushBehavior", "setInstallReferrer", "referrer", "setPushNotificationsRegistrationId", "registrationId", "setUserData", "userData", "Landroid/os/Bundle;", "email", "firstName", "lastName", "phone", "dateOfBirth", "gender", "city", "state", "zip", "country", "setUserID", "userID", "updateUserProperties", "parameters", "callback", "Lcom/facebook/GraphRequest$Callback;", "applicationID", "facebook-core_release"}, mo72094k = 1, mo72095mv = {1, 5, 1})
    /* compiled from: AppEventsLogger.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void activateApp(Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            AppEventsLoggerImpl.Companion.activateApp(application, (String) null);
        }

        @JvmStatic
        public final void activateApp(Application application, String str) {
            Intrinsics.checkNotNullParameter(application, "application");
            AppEventsLoggerImpl.Companion.activateApp(application, str);
        }

        @JvmStatic
        @Deprecated(message = "Use {@link AppEventsLogger#activateApp(Application)} ")
        public final void activateApp(Context context) {
            activateApp(context, (String) null);
        }

        @JvmStatic
        @Deprecated(message = "Use {@link AppEventsLogger#activateApp(Application)} ")
        public final void activateApp(Context context, String str) {
            AppEventsLoggerImpl.Companion.functionDEPRECATED("Please use activateApp(Application) or activateApp(Application, String), activateApp(Context) and activateApp(Context, String) will be removed since v12");
        }

        @JvmStatic
        @Deprecated(message = "When using {@link AppEventsLogger#activateApp(Application)} deactivate app will be\n        logged automatically.")
        public final void deactivateApp(Context context) {
            deactivateApp((Context) null, (String) null);
        }

        @JvmStatic
        @Deprecated(message = "When using {@link AppEventsLogger#activateApp(Application)} deactivate app will be\n        logged automatically.")
        public final void deactivateApp(Context context, String str) {
            AppEventsLoggerImpl.Companion.functionDEPRECATED("Deactivate app will be logged automatically, AppEventsLogger#deactivateApp will be removed since v12");
        }

        @JvmStatic
        public final void initializeLib(Context context, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            AppEventsLoggerImpl.Companion.initializeLib(context, str);
        }

        @JvmStatic
        public final AppEventsLogger newLogger(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new AppEventsLogger(context, (String) null, (AccessToken) null, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        public final AppEventsLogger newLogger(Context context, AccessToken accessToken) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new AppEventsLogger(context, (String) null, accessToken, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        public final AppEventsLogger newLogger(Context context, String str, AccessToken accessToken) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new AppEventsLogger(context, str, accessToken, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        public final AppEventsLogger newLogger(Context context, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new AppEventsLogger(context, str, (AccessToken) null, (DefaultConstructorMarker) null);
        }

        @JvmStatic
        public final FlushBehavior getFlushBehavior() {
            return AppEventsLoggerImpl.Companion.getFlushBehavior();
        }

        @JvmStatic
        public final void setFlushBehavior(FlushBehavior flushBehavior) {
            Intrinsics.checkNotNullParameter(flushBehavior, "flushBehavior");
            AppEventsLoggerImpl.Companion.setFlushBehavior(flushBehavior);
        }

        @JvmStatic
        public final void onContextStop() {
            AppEventsLoggerImpl.Companion.onContextStop();
        }

        @JvmStatic
        public final void setPushNotificationsRegistrationId(String str) {
            AppEventsLoggerImpl.Companion.setPushNotificationsRegistrationId(str);
        }

        @JvmStatic
        public final void augmentWebView(WebView webView, Context context) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            AppEventsLoggerImpl.Companion.augmentWebView(webView, context);
        }

        @JvmStatic
        public final String getUserID() {
            return AnalyticsUserIDStore.getUserID();
        }

        @JvmStatic
        public final void setUserID(String str) {
            Intrinsics.checkNotNullParameter(str, SDKConstants.PARAM_USER_ID);
            AnalyticsUserIDStore.setUserID(str);
        }

        @JvmStatic
        public final void clearUserID() {
            AnalyticsUserIDStore.setUserID((String) null);
        }

        @JvmStatic
        @Deprecated(message = "")
        public final void setUserData(Bundle bundle) {
            AppEventsLoggerImpl.Companion.functionDEPRECATED("AppEventsLogger#setUserData(Bundle) is deprecated and it will be removed since v12");
            UserDataStore.setUserDataAndHash(bundle);
        }

        @JvmStatic
        public final void setUserData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
            UserDataStore.setUserDataAndHash(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
        }

        @JvmStatic
        public final String getUserData() {
            return UserDataStore.getHashedUserData$facebook_core_release();
        }

        @JvmStatic
        public final void clearUserData() {
            UserDataStore.clear();
        }

        @JvmStatic
        @Deprecated(message = "")
        public final void updateUserProperties(Bundle bundle, GraphRequest.Callback callback) {
            updateUserProperties((Bundle) null, (String) null, (GraphRequest.Callback) null);
        }

        @JvmStatic
        @Deprecated(message = "")
        public final void updateUserProperties(Bundle bundle, String str, GraphRequest.Callback callback) {
            AppEventsLoggerImpl.Companion.functionDEPRECATED("AppEventsLogger#updateUserProperties is deprecated and it will be removed since v12");
        }

        @JvmStatic
        public final String getAnonymousAppDeviceGUID(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return AppEventsLoggerImpl.Companion.getAnonymousAppDeviceGUID(context);
        }

        @JvmStatic
        public final void setInstallReferrer(String str) {
            AppEventsLoggerImpl.Companion.setInstallReferrer(str);
        }
    }
}
