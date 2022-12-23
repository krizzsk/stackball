package com.adcolony.sdk;

import com.adcolony.sdk.C0580a0;
import com.applovin.sdk.AppLovinEventTypes;
import com.appsflyer.ServerParameters;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TapjoyConstants;
import com.unity3d.services.purchasing.core.TransactionDetailsUtilities;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;

public class AdColonyEventTracker {
    public static final String CUSTOM_EVENT_1 = "ADCT_CUSTOM_EVENT_1";
    public static final String CUSTOM_EVENT_2 = "ADCT_CUSTOM_EVENT_2";
    public static final String CUSTOM_EVENT_3 = "ADCT_CUSTOM_EVENT_3";
    public static final String CUSTOM_EVENT_4 = "ADCT_CUSTOM_EVENT_4";
    public static final String CUSTOM_EVENT_5 = "ADCT_CUSTOM_EVENT_5";
    public static final String LOGIN_DEFAULT = "ADCT_DEFAULT_LOGIN";
    public static final String LOGIN_FACEBOOK = "ADCT_FACEBOOK_LOGIN";
    public static final String LOGIN_GOOGLE = "ADCT_GOOGLE_LOGIN";
    public static final String LOGIN_LINKEDIN = "ADCT_LINKEDIN_LOGIN";
    public static final String LOGIN_OPENID = "ADCT_OPENID_LOGIN";
    public static final String LOGIN_TWITTER = "ADCT_TWITTER_LOGIN";
    public static final String REGISTRATION_CUSTOM = "ADCT_CUSTOM_REGISTRATION";
    public static final String REGISTRATION_DEFAULT = "ADCT_DEFAULT_REGISTRATION";
    public static final String REGISTRATION_FACEBOOK = "ADCT_FACEBOOK_REGISTRATION";
    public static final String REGISTRATION_GOOGLE = "ADCT_GOOGLE_REGISTRATION";
    public static final String REGISTRATION_LINKEDIN = "ADCT_LINKEDIN_REGISTRATION";
    public static final String REGISTRATION_OPENID = "ADCT_OPENID_REGISTRATION";
    public static final String REGISTRATION_TWITTER = "ADCT_TWITTER_REGISTRATION";
    public static final String SOCIAL_SHARING_CUSTOM = "ADCT_CUSTOM_SHARING";
    public static final String SOCIAL_SHARING_FACEBOOK = "ADCT_FACEBOOK_SHARING";
    public static final String SOCIAL_SHARING_FLICKR = "ADCT_FLICKR_SHARING";
    public static final String SOCIAL_SHARING_FOURSQUARE = "ADCT_FOURSQUARE_SHARING";
    public static final String SOCIAL_SHARING_GOOGLE = "ADCT_GOOGLE_SHARING";
    public static final String SOCIAL_SHARING_INSTAGRAM = "ADCT_INSTAGRAM_SHARING";
    public static final String SOCIAL_SHARING_LINKEDIN = "ADCT_LINKEDIN_SHARING";
    public static final String SOCIAL_SHARING_PINTEREST = "ADCT_PINTEREST_SHARING";
    public static final String SOCIAL_SHARING_SNAPCHAT = "ADCT_SNAPCHAT_SHARING";
    public static final String SOCIAL_SHARING_TUMBLR = "ADCT_TUMBLR_SHARING";
    public static final String SOCIAL_SHARING_TWITTER = "ADCT_TWITTER_SHARING";
    public static final String SOCIAL_SHARING_VIMEO = "ADCT_VIMEO_SHARING";
    public static final String SOCIAL_SHARING_VINE = "ADCT_VINE_SHARING";
    public static final String SOCIAL_SHARING_YOUTUBE = "ADCT_YOUTUBE_SHARING";

    /* renamed from: a */
    private static final List<C0897z0> f126a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private static final int f127b = 200;

    /* renamed from: a */
    static void m81a(C0897z0 z0Var) {
        List<C0897z0> list = f126a;
        synchronized (list) {
            if (200 > list.size()) {
                list.add(z0Var);
            }
        }
    }

    /* renamed from: b */
    static void m84b() {
        C0693i c = C0578a.m143c();
        if (!c.mo9621y().equals("") && c.mo9579K()) {
            List<C0897z0> list = f126a;
            synchronized (list) {
                for (C0897z0 b : list) {
                    m85b(b);
                }
                f126a.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m86c(C0897z0 z0Var) {
        C0897z0 f = C0894y.m1167f(z0Var, "payload");
        if (C0872w0.f1538Q) {
            C0894y.m1148a(f, TapjoyConstants.TJC_API_KEY, "bb2cf0647ba654d7228dd3f9405bbc6a");
        } else {
            C0894y.m1148a(f, TapjoyConstants.TJC_API_KEY, C0578a.m143c().mo9621y());
        }
        try {
            z0Var.mo10093u("payload");
            z0Var.mo10057a("payload", f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    private static void m87d(C0897z0 z0Var) {
        C0894y.m1148a(z0Var, TapjoyConstants.TJC_DEVICE_TIMEZONE, TimeZone.getDefault().getID());
        C0894y.m1148a(z0Var, "action_time", String.valueOf(Math.round((float) (System.currentTimeMillis() / 1000))));
    }

    public static void logAchievementUnlocked(String str) {
        if (!m83a(str, "logAchievementUnlocked")) {
            HashMap hashMap = new HashMap();
            hashMap.put("description", str);
            logEvent("achievement_unlocked", hashMap);
        }
    }

    public static void logActivated() {
        logEvent("activated");
    }

    public static void logAdImpression() {
        logEvent("ad_impression");
    }

    public static void logAddToCart(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", str);
        logEvent(FirebaseAnalytics.Event.ADD_TO_CART, hashMap);
    }

    public static void logAddToWishlist(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", str);
        logEvent(FirebaseAnalytics.Event.ADD_TO_WISHLIST, hashMap);
    }

    public static void logAppOpen() {
        logEvent(FirebaseAnalytics.Event.APP_OPEN);
    }

    public static void logAppRated() {
        logEvent("app_rated");
    }

    public static void logCheckoutInitiated() {
        logEvent("checkout_initiated");
    }

    public static void logContentView(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("content_id", str);
        hashMap.put(FirebaseAnalytics.Param.CONTENT_TYPE, str2);
        logEvent("content_view", hashMap);
    }

    public static void logCreditsSpent(String str, Integer num, Double d, String str2) {
        if (str2 == null || str2.length() == 3) {
            HashMap hashMap = new HashMap();
            hashMap.put("name", str);
            hashMap.put(FirebaseAnalytics.Param.QUANTITY, String.valueOf(num));
            hashMap.put("value", String.valueOf(d));
            hashMap.put("currency_code", str2);
            logEvent("credits_spent", hashMap);
            return;
        }
        new C0580a0.C0581a().mo9419a("Event logCreditsSpentWithName currency code is specified, but a three-letter ISO 4217 code, (e.g.: 'USD'). Event will not be sent.").mo9421a(C0580a0.f191i);
    }

    public static void logCustomEvent(String str, String str2) {
        if (!m83a(str2, "logCustomEvent")) {
            HashMap hashMap = new HashMap();
            hashMap.put("event", str);
            hashMap.put("description", str2);
            logEvent("custom_event", hashMap);
        }
    }

    public static void logEvent(String str) {
        logEvent(str, (HashMap<String, String>) null);
    }

    public static void logInvite() {
        logEvent(AppLovinEventTypes.USER_SENT_INVITATION);
    }

    public static void logLevelAchieved(Integer num) {
        HashMap hashMap = new HashMap();
        hashMap.put("level_achieved", String.valueOf(num));
        logEvent("level_achieved", hashMap);
    }

    public static void logLogin(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("method", str);
        logEvent("login", hashMap);
    }

    public static void logPaymentInfoAdded() {
        logEvent("payment_info_added");
    }

    public static void logRegistrationCompleted(String str, String str2) {
        if (!m83a(str2, "logRegistrationCompleted")) {
            HashMap hashMap = new HashMap();
            hashMap.put("method", str);
            hashMap.put("description", str2);
            logEvent("registration_completed", hashMap);
        }
    }

    public static void logReservation() {
        logEvent(AppLovinEventTypes.USER_CREATED_RESERVATION);
    }

    public static void logSearch(String str) {
        if (str == null || str.length() <= 512) {
            HashMap hashMap = new HashMap();
            hashMap.put("search_string", str);
            logEvent("search", hashMap);
            return;
        }
        new C0580a0.C0581a().mo9419a("logSearch searchString cannot exceed 512 characters. Event will ").mo9419a("not be sent.").mo9421a(C0580a0.f191i);
    }

    public static void logSocialSharingEvent(String str, String str2) {
        if (!m83a(str2, "logSocialSharingEvent")) {
            HashMap hashMap = new HashMap();
            hashMap.put(ServerParameters.NETWORK, str);
            hashMap.put("description", str2);
            logEvent("social_sharing_event", hashMap);
        }
    }

    public static void logTransaction(String str, Integer num, Double d, String str2, String str3, String str4, String str5) {
        if (!m83a(str5, "logTransaction")) {
            if (str2 == null || str2.length() == 3) {
                HashMap hashMap = new HashMap();
                hashMap.put("item_id", str);
                hashMap.put(FirebaseAnalytics.Param.QUANTITY, String.valueOf(num));
                hashMap.put("price", String.valueOf(d));
                hashMap.put("currency_code", str2);
                hashMap.put(TransactionDetailsUtilities.RECEIPT, str3);
                hashMap.put("store", str4);
                hashMap.put("description", str5);
                logEvent("transaction", hashMap);
                return;
            }
            new C0580a0.C0581a().mo9419a("Event logCreditsSpentWithName currency code is specified, but a three-letter ISO 4217 code, (e.g.: 'USD'). Event will not be sent.").mo9421a(C0580a0.f191i);
        }
    }

    public static void logTutorialCompleted() {
        logEvent("tutorial_completed");
    }

    public static void logEvent(String str, HashMap<String, String> hashMap) {
        C0897z0 b = C0894y.m1151b();
        C0894y.m1148a(b, "event_name", str);
        C0897z0 b2 = C0894y.m1151b();
        if (hashMap != null) {
            for (Map.Entry next : hashMap.entrySet()) {
                if (next.getValue() != null && !((String) next.getValue()).equals("null")) {
                    C0894y.m1148a(b2, (String) next.getKey(), (String) next.getValue());
                }
            }
        }
        m87d(b2);
        C0894y.m1147a(b, "payload", b2);
        m85b(b);
    }

    /* renamed from: a */
    static boolean m82a() {
        boolean z;
        List<C0897z0> list = f126a;
        synchronized (list) {
            z = list.size() != 0;
        }
        return z;
    }

    /* renamed from: b */
    private static void m85b(C0897z0 z0Var) {
        C0693i c = C0578a.m143c();
        if (c.mo9621y().equals("") || !c.mo9579K()) {
            m81a(z0Var);
            return;
        }
        m86c(z0Var);
        new C0645d0("AdColony.log_event", 1, z0Var).mo9536d();
    }

    /* renamed from: a */
    private static boolean m83a(String str, String str2) {
        if (str == null || str.length() <= 512) {
            return false;
        }
        new C0580a0.C0581a().mo9419a("Description of event ").mo9419a(str2).mo9419a(" must be less").mo9419a(" than 512 characters").mo9421a(C0580a0.f191i);
        return true;
    }
}
