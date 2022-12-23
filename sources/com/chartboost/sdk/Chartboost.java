package com.chartboost.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import com.adcolony.sdk.AdColonyAppOptions;
import com.chartboost.sdk.C2022j;
import com.chartboost.sdk.Events.ChartboostError;
import com.chartboost.sdk.Libraries.C1821b;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.C1844h;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.Networking.requests.models.MediationModel;
import com.chartboost.sdk.Privacy.model.CCPA;
import com.chartboost.sdk.Privacy.model.Custom;
import com.chartboost.sdk.Privacy.model.DataUseConsent;
import com.chartboost.sdk.Privacy.model.GDPR;
import com.chartboost.sdk.Tracking.C1872c;
import com.chartboost.sdk.Tracking.C1874e;
import com.chartboost.sdk.impl.C1894a;
import com.chartboost.sdk.impl.C1913g;
import com.chartboost.sdk.impl.C1925h1;
import com.chartboost.sdk.impl.C1988v0;
import com.chartboost.sdk.impl.C2014x;
import com.chartboost.sdk.impl.C2020z;
import com.facebook.internal.AnalyticsEvents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Chartboost {

    public enum CBFramework {
        CBFrameworkUnity(AdColonyAppOptions.UNITY),
        CBFrameworkCorona(AdColonyAppOptions.CORONA),
        CBFrameworkAir("AIR"),
        CBFrameworkGameSalad("GameSalad"),
        CBFrameworkCordova("Cordova"),
        CBFrameworkCocoonJS("CocoonJS"),
        CBFrameworkCocos2dx("Cocos2dx"),
        CBFrameworkPrime31Unreal("Prime31Unreal"),
        CBFrameworkWeeby("Weeby"),
        CBFrameworkOther("Other");
        

        /* renamed from: a */
        private final String f4358a;

        private CBFramework(String str) {
            this.f4358a = str;
        }

        public static CBFramework fromString(String str) {
            if (str.equals(CBFrameworkUnity.toString())) {
                return CBFrameworkUnity;
            }
            if (str.equals(CBFrameworkCorona.toString())) {
                return CBFrameworkCorona;
            }
            if (str.equals(CBFrameworkAir.toString())) {
                return CBFrameworkAir;
            }
            if (str.equals(CBFrameworkGameSalad.toString())) {
                return CBFrameworkGameSalad;
            }
            if (str.equals(CBFrameworkCordova.toString())) {
                return CBFrameworkCordova;
            }
            if (str.equals(CBFrameworkCocoonJS.toString())) {
                return CBFrameworkCocoonJS;
            }
            if (str.equals(CBFrameworkCocos2dx.toString())) {
                return CBFrameworkCocos2dx;
            }
            if (str.equals(CBFrameworkPrime31Unreal.toString())) {
                return CBFrameworkPrime31Unreal;
            }
            if (str.equals(CBFrameworkWeeby.toString())) {
                return CBFrameworkWeeby;
            }
            if (str.equals(CBFrameworkOther.toString())) {
                return CBFrameworkOther;
            }
            return CBFrameworkOther;
        }

        public boolean doesWrapperUseCustomBackgroundingBehavior() {
            return this == CBFrameworkAir;
        }

        public boolean doesWrapperUseCustomShouldDisplayBehavior() {
            return this == CBFrameworkAir || this == CBFrameworkCocos2dx;
        }

        public String toString() {
            return this.f4358a;
        }
    }

    public enum CBMediation {
        CBMediationAdMarvel(AdColonyAppOptions.ADMARVEL),
        CBMediationAdMob(AdColonyAppOptions.ADMOB),
        CBMediationFuse("Fuse"),
        CBMediationFyber(AdColonyAppOptions.FYBER),
        CBMediationHeyZap("HeyZap"),
        CBMediationMoPub("MoPub"),
        CBMediationironSource(AdColonyAppOptions.IRONSOURCE),
        CBMediationHyprMX("HyprMX"),
        CBMediationAerServ("AerServ"),
        CBMediationHelium("Helium"),
        CBMediationFairbid("Fairbid"),
        CBMediationMAX("MAX"),
        CBMediationOther("Other");
        

        /* renamed from: a */
        private final String f4360a;

        private CBMediation(String str) {
            this.f4360a = str;
        }

        public String toString() {
            return this.f4360a;
        }
    }

    @Deprecated
    public enum CBPIDataUseConsent {
        UNKNOWN(-1, AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN),
        NO_BEHAVIORAL(0, "Non behavioral"),
        YES_BEHAVIORAL(1, "Behavioral");
        

        /* renamed from: c */
        private static Map<Integer, CBPIDataUseConsent> f4361c;

        /* renamed from: d */
        private static List<CharSequence> f4362d;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f4364a;

        /* renamed from: b */
        private String f4365b;

        static {
            int i;
            f4361c = new HashMap();
            f4362d = new ArrayList();
            for (CBPIDataUseConsent cBPIDataUseConsent : values()) {
                f4361c.put(Integer.valueOf(cBPIDataUseConsent.f4364a), cBPIDataUseConsent);
                f4362d.add(cBPIDataUseConsent.f4365b);
            }
        }

        @Deprecated
        private CBPIDataUseConsent(int i, String str) {
            this.f4364a = i;
            this.f4365b = str;
        }

        @Deprecated
        public static CharSequence[] getAsCharsArray() {
            return (CharSequence[]) f4362d.toArray(new CharSequence[0]);
        }

        @Deprecated
        public static CBPIDataUseConsent getConsentByName(String str) {
            if (NO_BEHAVIORAL.f4365b.equals(str)) {
                return NO_BEHAVIORAL;
            }
            if (YES_BEHAVIORAL.f4365b.equals(str)) {
                return YES_BEHAVIORAL;
            }
            return UNKNOWN;
        }

        @Deprecated
        public int getValue() {
            return this.f4364a;
        }

        @Deprecated
        public static CBPIDataUseConsent valueOf(int i) {
            CBPIDataUseConsent cBPIDataUseConsent = f4361c.get(Integer.valueOf(i));
            return cBPIDataUseConsent == null ? UNKNOWN : cBPIDataUseConsent;
        }
    }

    private Chartboost() {
    }

    public static void addDataUseConsent(Context context, DataUseConsent dataUseConsent) {
        if (context == null || (!(dataUseConsent instanceof GDPR) && !(dataUseConsent instanceof CCPA) && !(dataUseConsent instanceof Custom))) {
            try {
                C1874e.m4311e(new C1872c("consent_subclassing_error", dataUseConsent.getClass().getName(), "", ""));
            } catch (Exception unused) {
            }
            CBLogging.m3997e("Chartboost", "Attempt to addDataUseConsent. Context and DataUseConsent cannot be null.");
            return;
        }
        C2022j.m4950a(context, dataUseConsent);
    }

    public static void cacheInterstitial(String str) {
        C1925h1.m4595a("Chartboost.cacheInterstitial", str);
        if (Build.VERSION.SDK_INT < 21) {
            CBLogging.m3993b("Chartboost", "Interstitial not supported for this Android version");
            C1880a delegate = getDelegate();
            if (delegate != null) {
                delegate.didFailToLoadInterstitial(str, CBError.CBImpressionError.NO_AD_FOUND);
                return;
            }
            return;
        }
        C2022j b = C2022j.m4955b();
        if (b != null && C1882c.m4363c() && C2022j.m4962l()) {
            if (C2014x.m4911b().mo14884a((CharSequence) str)) {
                CBLogging.m3993b("Chartboost", "cacheInterstitial location cannot be empty");
                Handler handler = b.f5206B;
                C1894a aVar = b.f5232v;
                aVar.getClass();
                handler.post(new C1894a.C1895a(4, str, CBError.CBImpressionError.INVALID_LOCATION, (ChartboostError) null, false, ""));
                return;
            }
            C1844h j = b.mo14905j();
            if ((!j.f4536q || !j.f4538s) && (!j.f4524e || !j.f4526g)) {
                Handler k = b.mo14906k();
                C1894a g = b.mo14902g();
                g.getClass();
                k.post(new C1894a.C1895a(4, str, CBError.CBImpressionError.END_POINT_DISABLED, (ChartboostError) null, false, ""));
                return;
            }
            C1913g gVar = b.f5231u;
            gVar.getClass();
            b.f5227q.execute(new C1913g.C1915b(3, str, (C1920h) null, (CBError.CBImpressionError) null));
        }
    }

    public static void cacheMoreApps(String str) {
        C2022j b = C2022j.m4955b();
        if (b != null && C1882c.m4363c() && C2022j.m4962l()) {
            b.getClass();
            C2022j.C2024b bVar = new C2022j.C2024b(5);
            bVar.f5239b = str;
            b.f5206B.postDelayed(bVar, C1821b.f4380b);
        }
    }

    public static void cacheRewardedVideo(String str) {
        C1925h1.m4595a("Chartboost.cacheRewardedVideo", str);
        if (Build.VERSION.SDK_INT < 21) {
            CBLogging.m3993b("Chartboost", "Rewarded video not supported for this Android version");
            C1880a delegate = getDelegate();
            if (delegate != null) {
                delegate.didFailToLoadRewardedVideo(str, CBError.CBImpressionError.NO_AD_FOUND);
                return;
            }
            return;
        }
        C2022j b = C2022j.m4955b();
        if (b != null && C1882c.m4363c() && C2022j.m4962l()) {
            if (C2014x.m4911b().mo14884a((CharSequence) str)) {
                CBLogging.m3993b("Chartboost", "cacheRewardedVideo location cannot be empty");
                Handler handler = b.f5206B;
                C1894a aVar = b.f5236z;
                aVar.getClass();
                handler.post(new C1894a.C1895a(4, str, CBError.CBImpressionError.INVALID_LOCATION, (ChartboostError) null, false, ""));
                return;
            }
            C1844h j = b.mo14905j();
            if ((!j.f4536q || !j.f4541v) && (!j.f4524e || !j.f4529j)) {
                Handler k = b.mo14906k();
                C1894a i = b.mo14904i();
                i.getClass();
                k.post(new C1894a.C1895a(4, str, CBError.CBImpressionError.END_POINT_DISABLED, (ChartboostError) null, false, ""));
                return;
            }
            C1913g gVar = b.f5235y;
            gVar.getClass();
            b.f5227q.execute(new C1913g.C1915b(3, str, (C1920h) null, (CBError.CBImpressionError) null));
        }
    }

    public static DataUseConsent clearDataUseConsent(Context context, String str) {
        if (context != null && str != null && !str.isEmpty()) {
            return C2022j.m4954b(context, str);
        }
        CBLogging.m3997e("Chartboost", "Attempt to removeDataUseConsent. Context and privacyStandard cannot be null.");
        return null;
    }

    @Deprecated
    public static void closeImpression() {
    }

    @Deprecated
    private static void forwardTouchEventsAIR(boolean z) {
    }

    public static boolean getAutoCacheAds() {
        return C2026k.f5257n;
    }

    public static String getCustomId() {
        if (!C1882c.m4358a()) {
            return "";
        }
        return C2026k.f5245b;
    }

    public static DataUseConsent getDataUseConsent(Context context, String str) {
        if (context != null && str != null && !str.isEmpty()) {
            return C2022j.m4946a(context, str);
        }
        CBLogging.m3997e("Chartboost", "Attempt to getDataUseConsent. Context and privacyStandard cannot be null.");
        return null;
    }

    public static C1880a getDelegate() {
        return C2026k.f5247d;
    }

    public static CBLogging.Level getLoggingLevel() {
        C1882c.m4358a();
        return CBLogging.f4375a;
    }

    @Deprecated
    public static CBPIDataUseConsent getPIDataUseConsent() {
        return C1988v0.f5103a;
    }

    public static String getSDKVersion() {
        return "8.2.1";
    }

    public static boolean hasInterstitial(String str) {
        C1925h1.m4595a("Chartboost.hasInterstitial", str);
        C2022j b = C2022j.m4955b();
        if (b == null || !C1882c.m4363c() || b.f5231u.mo14610f(str) == null) {
            return false;
        }
        return true;
    }

    public static boolean hasMoreApps(String str) {
        return false;
    }

    public static boolean hasRewardedVideo(String str) {
        C1925h1.m4595a("Chartboost.hasRewardedVideo", str);
        C2022j b = C2022j.m4955b();
        if (b == null || !C1882c.m4363c() || b.f5235y.mo14610f(str) == null) {
            return false;
        }
        return true;
    }

    public static boolean isAnyViewVisible() {
        C1925h1.m4593a("Chartboost.isAnyViewVisible");
        C2022j b = C2022j.m4955b();
        return b != null && b.f5207C.mo14498g();
    }

    public static boolean isSdkStarted() {
        C2022j b = C2022j.m4955b();
        if (b == null) {
            return false;
        }
        return b.mo14907m();
    }

    public static boolean isWebViewEnabled() {
        C2022j b = C2022j.m4955b();
        return b == null || b.f5205A.get().f4536q;
    }

    public static boolean onBackPressed() {
        C1925h1.m4593a("Chartboost.onBackPressed");
        C2022j b = C2022j.m4955b();
        if (b == null) {
            return false;
        }
        return b.f5207C.mo14499h();
    }

    public static void setActivityAttrs(Activity activity) {
        if (activity != null) {
            Window window = activity.getWindow();
            if (C2026k.f5251h) {
                if (Build.VERSION.SDK_INT >= 28) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.layoutInDisplayCutoutMode = 1;
                    window.setAttributes(attributes);
                }
                window.getDecorView().setSystemUiVisibility(5894);
            } else if ((window.getAttributes().flags & 1024) != 0) {
                CBLogging.m3997e("Chartboost", "Attempting to show Status and Navigation bars on a fullscreen activity. Please change your Chartboost activity theme to: \"@android:style/Theme.Translucent\"` in your Manifest file");
            }
        }
    }

    public static void setAutoCacheAds(boolean z) {
        C1925h1.m4596a("Chartboost.setAutoCacheAds", z);
        C2022j b = C2022j.m4955b();
        if (b != null) {
            b.getClass();
            C2022j.C2024b bVar = new C2022j.C2024b(1);
            bVar.f5240c = z;
            C2022j.m4961e(bVar);
        }
    }

    public static void setChartboostWrapperVersion(String str) {
        C1925h1.m4595a("Chartboost.setChartboostWrapperVersion", str);
        C1891g gVar = new C1891g(5);
        gVar.f4738d = str;
        C2022j.m4961e(gVar);
    }

    public static void setCustomId(String str) {
        C1925h1.m4595a("Chartboost.setCustomId", str);
        C1891g gVar = new C1891g(6);
        gVar.f4740f = str;
        C2022j.m4961e(gVar);
    }

    public static void setDelegate(ChartboostDelegate chartboostDelegate) {
        C1925h1.m4594a("Chartboost.setDelegate", (Object) chartboostDelegate);
        C1891g gVar = new C1891g(8);
        gVar.f4742h = chartboostDelegate;
        C2022j.m4961e(gVar);
    }

    public static void setFramework(CBFramework cBFramework, String str) {
        C1925h1.m4593a("Chartboost.setFramework");
        C1891g gVar = new C1891g(4);
        gVar.f4737c = cBFramework;
        gVar.f4738d = str;
        C2022j.m4961e(gVar);
    }

    @Deprecated
    public static void setFrameworkVersion(String str) {
        C1925h1.m4595a("Chartboost.setFrameworkVersion", str);
        C1891g gVar = new C1891g(5);
        gVar.f4738d = str;
        C2022j.m4961e(gVar);
    }

    public static void setLoggingLevel(CBLogging.Level level) {
        C1925h1.m4595a("Chartboost.setLoggingLevel", level.toString());
        C1891g gVar = new C1891g(7);
        gVar.f4741g = level;
        C2022j.m4961e(gVar);
    }

    @Deprecated
    public static void setMediation(CBMediation cBMediation, String str) {
        C1925h1.m4593a("Chartboost.setMediation.deprecated");
        setMediation(cBMediation, str, (String) null);
    }

    @Deprecated
    public static void setPIDataUseConsent(Context context, CBPIDataUseConsent cBPIDataUseConsent) {
        if (cBPIDataUseConsent == CBPIDataUseConsent.UNKNOWN) {
            clearDataUseConsent(context, "gdpr");
        } else {
            addDataUseConsent(context, new GDPR(GDPR.GDPR_CONSENT.fromValue(String.valueOf(cBPIDataUseConsent.f4364a))));
        }
    }

    public static void setShouldDisplayLoadingViewForMoreApps(boolean z) {
    }

    public static void setShouldHideSystemUI(Boolean bool) {
        C1925h1.m4594a("Chartboost.setHideSystemUI", (Object) bool);
        C2026k.f5251h = bool.booleanValue();
    }

    public static void setShouldPrefetchVideoContent(boolean z) {
        C1925h1.m4596a("Chartboost.setShouldPrefetchVideoContent", z);
        C2022j b = C2022j.m4955b();
        if (b != null && C1882c.m4363c()) {
            b.getClass();
            C2022j.C2024b bVar = new C2022j.C2024b(2);
            bVar.f5241d = z;
            C2022j.m4961e(bVar);
        }
    }

    public static void setShouldRequestInterstitialsInFirstSession(boolean z) {
        C1925h1.m4596a("Chartboost.setShouldRequestInterstitialsInFirstSession", z);
        if (C1882c.m4358a()) {
            C1891g gVar = new C1891g(1);
            gVar.f4736b = z;
            C2022j.m4961e(gVar);
        }
    }

    public static void showInterstitial(String str) {
        C1925h1.m4595a("Chartboost.showInterstitial", str);
        if (Build.VERSION.SDK_INT < 21) {
            CBLogging.m3993b("Chartboost", "Interstitial not supported for this Android version");
            C1880a delegate = getDelegate();
            if (delegate != null) {
                delegate.didFailToLoadInterstitial(str, CBError.CBImpressionError.NO_AD_FOUND);
                return;
            }
            return;
        }
        C2022j b = C2022j.m4955b();
        if (b != null && C1882c.m4363c() && C2022j.m4962l()) {
            if (C2014x.m4911b().mo14884a((CharSequence) str)) {
                CBLogging.m3993b("Chartboost", "showInterstitial location cannot be empty");
                Handler handler = b.f5206B;
                C1894a aVar = b.f5232v;
                aVar.getClass();
                handler.post(new C1894a.C1895a(4, str, CBError.CBImpressionError.INVALID_LOCATION, (ChartboostError) null, true, ""));
                return;
            }
            C1844h hVar = b.f5205A.get();
            if ((!hVar.f4536q || !hVar.f4538s) && (!hVar.f4524e || !hVar.f4526g)) {
                Handler handler2 = b.f5206B;
                C1894a aVar2 = b.f5232v;
                aVar2.getClass();
                handler2.post(new C1894a.C1895a(4, str, CBError.CBImpressionError.END_POINT_DISABLED, (ChartboostError) null, true, ""));
                return;
            }
            C1913g gVar = b.f5231u;
            gVar.getClass();
            b.f5227q.execute(new C1913g.C1915b(4, str, (C1920h) null, (CBError.CBImpressionError) null));
        }
    }

    private static void showInterstitialAIR(String str, boolean z) {
        C2022j b = C2022j.m4955b();
        if (b != null && C1882c.m4363c() && C2022j.m4962l()) {
            C1844h hVar = b.f5205A.get();
            if ((!hVar.f4536q || !hVar.f4538s) && (!hVar.f4524e || !hVar.f4526g)) {
                C2026k.f5247d.didFailToLoadInterstitial(str, CBError.CBImpressionError.END_POINT_DISABLED);
                return;
            }
            Handler handler = b.f5206B;
            C1894a aVar = b.f5232v;
            aVar.getClass();
            handler.post(new C1894a.C1895a(4, str, CBError.CBImpressionError.INTERNAL, (ChartboostError) null, true, ""));
        }
    }

    public static void showMoreApps(String str) {
        cacheMoreApps(str);
    }

    private static void showMoreAppsAIR(String str, boolean z) {
        cacheMoreApps(str);
    }

    public static void showRewardedVideo(String str) {
        C1925h1.m4595a("Chartboost.showRewardedVideo", str);
        if (Build.VERSION.SDK_INT < 21) {
            CBLogging.m3993b("Chartboost", "Rewarded video not supported for this Android version");
            C1880a delegate = getDelegate();
            if (delegate != null) {
                delegate.didFailToLoadRewardedVideo(str, CBError.CBImpressionError.NO_AD_FOUND);
                return;
            }
            return;
        }
        C2022j b = C2022j.m4955b();
        if (b != null && C1882c.m4363c() && C2022j.m4962l()) {
            if (C2014x.m4911b().mo14884a((CharSequence) str)) {
                CBLogging.m3993b("Chartboost", "showRewardedVideo location cannot be empty");
                Handler handler = b.f5206B;
                C1894a aVar = b.f5236z;
                aVar.getClass();
                handler.post(new C1894a.C1895a(4, str, CBError.CBImpressionError.INVALID_LOCATION, (ChartboostError) null, true, ""));
                return;
            }
            C1844h hVar = b.f5205A.get();
            if ((!hVar.f4536q || !hVar.f4541v) && (!hVar.f4524e || !hVar.f4529j)) {
                Handler handler2 = b.f5206B;
                C1894a aVar2 = b.f5236z;
                aVar2.getClass();
                handler2.post(new C1894a.C1895a(4, str, CBError.CBImpressionError.END_POINT_DISABLED, (ChartboostError) null, true, ""));
                return;
            }
            C1913g gVar = b.f5235y;
            gVar.getClass();
            b.f5227q.execute(new C1913g.C1915b(4, str, (C1920h) null, (CBError.CBImpressionError) null));
        }
    }

    private static void showRewardedVideoAIR(String str, boolean z) {
        C2022j b = C2022j.m4955b();
        if (b != null && C1882c.m4363c() && C2022j.m4962l()) {
            C1844h hVar = b.f5205A.get();
            if ((!hVar.f4536q || !hVar.f4541v) && (!hVar.f4524e || !hVar.f4529j)) {
                C1880a aVar = C2026k.f5247d;
                if (aVar != null) {
                    aVar.didFailToLoadRewardedVideo(str, CBError.CBImpressionError.END_POINT_DISABLED);
                    return;
                }
                return;
            }
            Handler handler = b.f5206B;
            C1894a aVar2 = b.f5232v;
            aVar2.getClass();
            handler.post(new C1894a.C1895a(4, str, CBError.CBImpressionError.INTERNAL, (ChartboostError) null, true, ""));
        }
    }

    @Deprecated
    public static void startWithAppId(Activity activity, String str, String str2) {
        if (activity == null) {
            CBLogging.m3993b("Chartboost", "Can't start SDK with null activity");
        } else {
            startWithAppId(activity.getApplicationContext(), str, str2);
        }
    }

    public static void setMediation(CBMediation cBMediation, String str, String str2) {
        C1925h1.m4593a("Chartboost.setMediation");
        C1891g gVar = new C1891g(3);
        gVar.f4738d = str;
        gVar.f4739e = new MediationModel(cBMediation.toString() + " " + str, str, str2);
        C2022j.m4961e(gVar);
    }

    public static void startWithAppId(Context context, String str, String str2) {
        C2026k.f5244a = "​!SDK-VERSION-STRING!:​com.chartboost.sdk:android-sdk:8.2.1";
        C1925h1.m4594a("Chartboost.startWithAppId", (Object) context);
        C1891g gVar = new C1891g(0);
        gVar.f4743i = context;
        gVar.f4744j = str;
        gVar.f4745k = str2;
        C2022j.m4961e(gVar);
    }

    public static void cacheRewardedVideo(String str, String str2) {
        C1925h1.m4595a("Chartboost.cacheHeliumRewardedVideo", str);
        C2020z.m4943a(str, str2, 1);
    }

    public static void cacheInterstitial(String str, String str2) {
        C1925h1.m4595a("Chartboost.cacheHeliumInterstitial", str);
        C2020z.m4943a(str, str2, 0);
    }
}
