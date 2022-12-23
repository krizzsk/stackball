package com.tapjoy;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import com.tapjoy.internal.C9223er;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public final class Tapjoy {
    public static final String INTENT_EXTRA_PUSH_PAYLOAD = "com.tapjoy.PUSH_PAYLOAD";

    public static String getVersion() {
        return C9223er.m24693a().mo58057b();
    }

    public static void setDebugEnabled(boolean z) {
        C9223er.m24693a().mo58052a(z);
    }

    public static boolean connect(Context context, String str) {
        return C9223er.m24693a().mo58053a(context, str);
    }

    public static boolean connect(Context context, String str, Hashtable hashtable) {
        return C9223er.m24693a().mo58055a(context, str, hashtable, (TJConnectListener) null);
    }

    public static synchronized boolean connect(Context context, String str, Hashtable hashtable, TJConnectListener tJConnectListener) {
        boolean a;
        synchronized (Tapjoy.class) {
            a = C9223er.m24693a().mo58055a(context, str, hashtable, tJConnectListener);
        }
        return a;
    }

    public static TJPlacement getPlacement(String str, TJPlacementListener tJPlacementListener) {
        return C9223er.m24693a().mo58027a(str, tJPlacementListener);
    }

    public static void setActivity(Activity activity) {
        C9223er.m24693a().mo58033a(activity);
    }

    public static void getCurrencyBalance(TJGetCurrencyBalanceListener tJGetCurrencyBalanceListener) {
        C9223er.m24693a().mo58037a(tJGetCurrencyBalanceListener);
    }

    public static void spendCurrency(int i, TJSpendCurrencyListener tJSpendCurrencyListener) {
        C9223er.m24693a().mo58031a(i, tJSpendCurrencyListener);
    }

    public static void awardCurrency(int i, TJAwardCurrencyListener tJAwardCurrencyListener) {
        C9223er.m24693a().mo58030a(i, tJAwardCurrencyListener);
    }

    public static void setEarnedCurrencyListener(TJEarnedCurrencyListener tJEarnedCurrencyListener) {
        C9223er.m24693a().mo58036a(tJEarnedCurrencyListener);
    }

    @Deprecated
    public static void setCurrencyMultiplier(float f) {
        C9223er.m24693a().mo58028a(f);
    }

    @Deprecated
    public static float getCurrencyMultiplier() {
        return C9223er.m24693a().mo58063c();
    }

    public static void trackPurchase(String str, String str2, double d, String str3) {
        C9223er.m24693a().mo58043a(str, str2, d, str3);
    }

    public static void trackPurchase(String str, String str2, String str3, String str4) {
        C9223er.m24693a().mo58045a(str, str2, str3, str4);
    }

    @Deprecated
    public static void trackPurchase(String str, String str2) {
        C9223er.m24693a().mo58042a(str, str2);
    }

    public static void trackEvent(String str) {
        C9223er.m24693a().mo58039a(str);
    }

    public static void trackEvent(String str, long j) {
        C9223er.m24693a().mo58040a(str, j);
    }

    public static void trackEvent(String str, String str2, long j) {
        C9223er.m24693a().mo58044a(str, str2, j);
    }

    public static void trackEvent(String str, String str2, String str3, String str4) {
        C9223er.m24693a().mo58061b(str, str2, str3, str4);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, long j) {
        C9223er.m24693a().mo58046a(str, str2, str3, str4, j);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, String str5, long j) {
        C9223er.m24693a().mo58047a(str, str2, str3, str4, str5, j);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2) {
        C9223er.m24693a().mo58048a(str, str2, str3, str4, str5, j, str6, j2);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2, String str7, long j3) {
        C9223er.m24693a().mo58049a(str, str2, str3, str4, str5, j, str6, j2, str7, j3);
    }

    public static void trackEvent(String str, String str2, String str3, String str4, Map map) {
        C9223er.m24693a().mo58050a(str, str2, str3, str4, map);
    }

    public static void startSession() {
        C9223er.m24693a().mo58067d();
    }

    public static void endSession() {
        C9223er.m24693a().mo58070e();
    }

    public static void onActivityStart(Activity activity) {
        C9223er.m24693a().mo58059b(activity);
    }

    public static void onActivityStop(Activity activity) {
        C9223er.m24693a().mo58064c(activity);
    }

    public static void setUserID(String str) {
        setUserID(str, (TJSetUserIDListener) null);
    }

    public static void setUserID(String str, TJSetUserIDListener tJSetUserIDListener) {
        C9223er.m24693a().mo58041a(str, tJSetUserIDListener);
    }

    public static void setUserLevel(int i) {
        C9223er.m24693a().mo58029a(i);
    }

    public static void setUserFriendCount(int i) {
        C9223er.m24693a().mo58058b(i);
    }

    public static void setAppDataVersion(String str) {
        C9223er.m24693a().mo58060b(str);
    }

    public static void setUserCohortVariable(int i, String str) {
        C9223er.m24693a().mo58032a(i, str);
    }

    public static Set getUserTags() {
        return C9223er.m24693a().mo58072f();
    }

    public static void setUserTags(Set set) {
        C9223er.m24693a().mo58051a(set);
    }

    public static void clearUserTags() {
        C9223er.m24693a().mo58075g();
    }

    public static void addUserTag(String str) {
        C9223er.m24693a().mo58065c(str);
    }

    public static void removeUserTag(String str) {
        C9223er.m24693a().mo58068d(str);
    }

    public static void setVideoListener(TJVideoListener tJVideoListener) {
        C9223er.m24693a().mo58038a(tJVideoListener);
    }

    public static void actionComplete(String str) {
        C9223er.m24693a().mo58071e(str);
    }

    public static void setGcmSender(String str) {
        C9223er.m24693a().mo58073f(str);
    }

    public static void setDeviceToken(String str) {
        C9223er.m24693a().mo58078i(str);
    }

    public static void setReceiveRemoteNotification(Context context, Map map) {
        C9223er.m24693a().mo58034a(context, map);
    }

    public static boolean isPushNotificationDisabled() {
        return C9223er.m24693a().mo58077h();
    }

    public static void setPushNotificationDisabled(boolean z) {
        C9223er.m24693a().mo58062b(z);
    }

    public static void loadSharedLibrary() {
        try {
            System.loadLibrary("tapjoy");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public static void setGLSurfaceView(GLSurfaceView gLSurfaceView) {
        C9223er.m24693a().mo58035a(gLSurfaceView);
    }

    public static String getSupportURL() {
        return C9223er.m24693a().mo58074g((String) null);
    }

    public static String getSupportURL(String str) {
        return C9223er.m24693a().mo58074g(str);
    }

    public static String getUserToken() {
        return C9223er.m24693a().mo58082k();
    }

    public static boolean isConnected() {
        return C9223er.m24693a().mo58079i();
    }

    public static void subjectToGDPR(boolean z) {
        C9223er.m24693a().mo58066c(z);
    }

    public static void setUserConsent(String str) {
        C9223er.m24693a().mo58076h(str);
    }

    public static void belowConsentAge(boolean z) {
        C9223er.m24693a().mo58069d(z);
    }

    public static synchronized boolean limitedConnect(Context context, String str, TJConnectListener tJConnectListener) {
        boolean a;
        synchronized (Tapjoy.class) {
            a = C9223er.m24693a().mo58054a(context, str, tJConnectListener);
        }
        return a;
    }

    public static boolean isLimitedConnected() {
        return C9223er.m24693a().mo58081j();
    }

    public static TJPlacement getLimitedPlacement(String str, TJPlacementListener tJPlacementListener) {
        return C9223er.m24693a().mo58056b(str, tJPlacementListener);
    }

    public static void setCustomParameter(String str) {
        C9223er.m24693a().mo58080j(str);
    }

    public static String getCustomParameter() {
        return C9223er.m24693a().mo58083l();
    }
}
