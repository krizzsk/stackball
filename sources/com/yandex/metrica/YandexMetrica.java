package com.yandex.metrica;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.impl.p265ob.C11671q3;
import com.yandex.metrica.impl.p265ob.C11914wg;
import com.yandex.metrica.plugins.YandexMetricaPlugins;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;

public final class YandexMetrica {
    private YandexMetrica() {
    }

    public static void activate(Context context, YandexMetricaConfig yandexMetricaConfig) {
        C11914wg.m30789a().mo63850a(context, yandexMetricaConfig);
    }

    public static void activateReporter(Context context, ReporterConfig reporterConfig) {
        C11914wg.m30789a().mo63849a(context, reporterConfig);
    }

    public static void enableActivityAutoTracking(Application application) {
        C11914wg.m30789a().mo63848a(application);
    }

    public static int getLibraryApiLevel() {
        return 105;
    }

    public static String getLibraryVersion() {
        return "5.0.0";
    }

    public static YandexMetricaPlugins getPluginExtension() {
        return C11671q3.m30078a();
    }

    public static IReporter getReporter(Context context, String str) {
        return C11914wg.m30789a().mo63846a(context, str);
    }

    public static void initWebViewReporting(WebView webView) {
        C11914wg.m30789a().mo63854a(webView);
    }

    public static void pauseSession(Activity activity) {
        C11914wg.m30789a().mo63847a(activity);
    }

    public static void putErrorEnvironmentValue(String str, String str2) {
        C11914wg.m30789a().mo63862a(str, str2);
    }

    public static void reportAppOpen(Activity activity) {
        C11914wg.m30789a().mo63868b(activity);
    }

    public static void reportECommerce(ECommerceEvent eCommerceEvent) {
        C11914wg.m30789a().mo63859a(eCommerceEvent);
    }

    public static void reportError(String str, Throwable th) {
        C11914wg.m30789a().mo63864a(str, th);
    }

    public static void reportEvent(String str) {
        C11914wg.m30789a().mo63870b(str);
    }

    @Deprecated
    public static void reportNativeCrash(String str) {
        C11914wg.m30789a().mo63875d(str);
    }

    public static void reportReferralUrl(String str) {
        C11914wg.m30789a().mo63876e(str);
    }

    public static void reportRevenue(Revenue revenue) {
        C11914wg.m30789a().mo63858a(revenue);
    }

    public static void reportUnhandledException(Throwable th) {
        C11914wg.m30789a().mo63866a(th);
    }

    public static void reportUserProfile(UserProfile userProfile) {
        C11914wg.m30789a().mo63860a(userProfile);
    }

    public static void requestAppMetricaDeviceID(AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        C11914wg.m30789a().mo63855a(appMetricaDeviceIDListener);
    }

    public static void requestDeferredDeeplink(DeferredDeeplinkListener deferredDeeplinkListener) {
        C11914wg.m30789a().mo63856a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        C11914wg.m30789a().mo63857a(deferredDeeplinkParametersListener);
    }

    public static void resumeSession(Activity activity) {
        C11914wg.m30789a().mo63872c(activity);
    }

    public static void sendEventsBuffer() {
        C11914wg.m30789a().mo63878i();
    }

    public static void setLocation(Location location) {
        C11914wg.m30789a().mo63853a(location);
    }

    public static void setLocationTracking(boolean z) {
        C11914wg.m30789a().mo63867a(z);
    }

    public static void setStatisticsSending(Context context, boolean z) {
        C11914wg.m30789a().mo63869b(context, z);
    }

    public static void setUserProfileID(String str) {
        C11914wg.m30789a().mo63877f(str);
    }

    public static void reportAppOpen(String str) {
        C11914wg.m30789a().mo63861a(str);
    }

    public static void reportError(String str, String str2) {
        C11914wg.m30789a().mo63863a(str, str2, (Throwable) null);
    }

    public static void reportEvent(String str, String str2) {
        C11914wg.m30789a().mo63871b(str, str2);
    }

    public static void setLocationTracking(Context context, boolean z) {
        C11914wg.m30789a().mo63851a(context, z);
    }

    public static void reportAppOpen(Intent intent) {
        C11914wg.m30789a().mo63852a(intent);
    }

    public static void reportError(String str, String str2, Throwable th) {
        C11914wg.m30789a().mo63863a(str, str2, th);
    }

    public static void reportEvent(String str, Map<String, Object> map) {
        C11914wg.m30789a().mo63865a(str, map);
    }
}
