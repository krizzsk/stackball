package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.yandex.mobile.ads.base.model.AdUnitIdBiddingSettings;
import com.yandex.mobile.ads.base.model.BiddingSettings;
import com.yandex.mobile.ads.impl.d71;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.i5 */
public final class C13378i5 {
    /* renamed from: a */
    public static <T> T[] m37282a(T[] tArr) {
        return tArr == null ? new Object[0] : tArr;
    }

    /* renamed from: b */
    public static boolean m37284b(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: a */
    public static boolean m37281a(Collection... collectionArr) {
        for (Collection collection : collectionArr) {
            if (collection == null || collection.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static Integer m37283b(SharedPreferences sharedPreferences, String str) {
        if (sharedPreferences.contains(str)) {
            return Integer.valueOf(sharedPreferences.getInt(str, 0));
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m37280a(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    /* renamed from: a */
    public static synchronized void m37278a(Context context, d71 d71) {
        Boolean bool;
        Boolean bool2;
        synchronized (C13378i5.class) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("YadPreferenceFile", 0);
            SharedPreferences.Editor putBoolean = sharedPreferences.edit().putString("SdkConfigurationLibraryVersion", d71.mo66462j()).putBoolean("SdkConfigurationSensitiveModeDisabled", d71.mo66444I()).putLong("SdkConfigurationExpiredDate", d71.mo66457f()).putString("SdkConfigurationMraidUrl", d71.mo66458g()).putString("SdkConfigurationOmSdkControllerUrl", d71.mo66459h()).putBoolean("CustomClickHandlingEnabled", d71.mo66467o()).putBoolean("SdkConfigurationShowVersionValidationErrorLog", d71.mo66450O()).putBoolean("SdkConfigurationShowVersionValidationErrorIndicator", d71.mo66449N()).putInt("AdIdsStorageSize", d71.mo66452b()).putBoolean("SdkConfigurationImpressionValidationOnClickEnabled", d71.mo66473u()).putBoolean("SdkConfigurationLegacySliderImpressionEnabled", d71.mo66475w()).putBoolean("SdkConfigurationCounterType3Disabled", d71.mo66466n()).putBoolean("SdkConfigurationLegacyRenderTrackingEnabled", d71.mo66474v()).putBoolean("SdkConfigurationDivkitisabled", d71.mo66469q()).putBoolean("SdkConfigurationUseOkHttpNetworkStack", d71.mo66446K()).putBoolean("SdkConfigurationLocationConsent", d71.mo66436A()).putBoolean("SdkConfigurationLibSSLEnabled", d71.mo66478z()).putBoolean("SdkConfigurationEncryptedRequestsEnabled", d71.mo66470r()).putBoolean("SdkConfigurationUseFlexInsteadFixedBannerEnabled", d71.mo66445J());
            Long a = d71.mo66451a();
            Boolean valueOf = Boolean.valueOf(d71.mo66463k());
            Boolean M = d71.mo66448M();
            Boolean C = d71.mo66438C();
            Boolean valueOf2 = Boolean.valueOf(d71.mo66439D());
            Boolean valueOf3 = Boolean.valueOf(d71.mo66468p());
            Boolean valueOf4 = Boolean.valueOf(d71.mo66472t());
            Boolean valueOf5 = Boolean.valueOf(d71.mo66437B());
            Boolean valueOf6 = Boolean.valueOf(d71.mo66464l());
            Boolean L = d71.mo66447L();
            Boolean valueOf7 = Boolean.valueOf(d71.mo66476x());
            Boolean valueOf8 = Boolean.valueOf(d71.mo66477y());
            Boolean valueOf9 = Boolean.valueOf(d71.mo66442G());
            SharedPreferences sharedPreferences2 = sharedPreferences;
            Boolean valueOf10 = Boolean.valueOf(d71.mo66443H());
            Boolean valueOf11 = Boolean.valueOf(d71.mo66471s());
            Boolean valueOf12 = Boolean.valueOf(d71.mo66465m());
            Boolean valueOf13 = Boolean.valueOf(d71.mo66441F());
            Boolean valueOf14 = Boolean.valueOf(d71.mo66440E());
            Integer c = d71.mo66453c();
            Integer i = d71.mo66461i();
            BiddingSettings d = d71.mo66454d();
            Boolean bool3 = valueOf14;
            Boolean valueOf15 = Boolean.valueOf(d71.mo66445J());
            if (a != null) {
                bool2 = valueOf8;
                bool = valueOf9;
                putBoolean.putLong("SdkConfigurationAdBlockerStatusValidityDuration", a.longValue());
            } else {
                bool2 = valueOf8;
                bool = valueOf9;
                putBoolean.remove("SdkConfigurationAdBlockerStatusValidityDuration");
            }
            m37279a(putBoolean, "SdkConfigurationAntiAdBlockerDisabled", valueOf);
            m37279a(putBoolean, "SdkConfigurationVisibilityErrorIndicatorEnabled", M);
            m37279a(putBoolean, "SdkConfigurationMediationSensitiveModeDisabled", C);
            m37279a(putBoolean, "SdkConfigurationMrcVisibilityTrackingEnabled", valueOf2);
            m37279a(putBoolean, "SdkConfigurationCustomUserAgentEnabled", valueOf3);
            m37279a(putBoolean, "SdkConfigurationFusedLocationProviderDisabled", valueOf4);
            m37279a(putBoolean, "SdkConfigurationLockScreenEnabled", valueOf5);
            m37279a(putBoolean, "SdkConfigurationAutograbEnabled", valueOf6);
            m37279a(putBoolean, "SdkConfigurationUserConsent", L);
            m37279a(putBoolean, "SdkConfigurationLegacyVastTrackingEnabled", valueOf7);
            m37279a(putBoolean, "SdkConfigurationLegacyVisibilityLogicEnabled", bool2);
            m37279a(putBoolean, "SdkConfigurationOverlappingVisibilityTrackingEnabled", bool);
            m37279a(putBoolean, "SdkConfigurationOverlappingWindowTrackingEnabled", valueOf10);
            m37279a(putBoolean, "SdkConfigurationFullScreenBackButtonEnabled", valueOf11);
            m37279a(putBoolean, "SdkConfigurationClickAreaVerificationEnabled", valueOf12);
            m37279a(putBoolean, "SdkConfigurationOpenMeasurementSdkDisabled", valueOf13);
            m37279a(putBoolean, "SdkConfigurationMultibannerArrowControlsDisabled", bool3);
            if (c != null) {
                putBoolean.putInt("SdkConfigurationAdRequestMaxRetries", c.intValue());
            } else {
                putBoolean.remove("SdkConfigurationAdRequestMaxRetries");
            }
            if (i != null) {
                putBoolean.putInt("SdkConfigurationPingRequestMaxRetries", i.intValue());
            } else {
                putBoolean.remove("SdkConfigurationPingRequestMaxRetries");
            }
            if (d != null) {
                List<AdUnitIdBiddingSettings> c2 = d.mo64539c();
                HashSet hashSet = new HashSet(c2.size());
                for (AdUnitIdBiddingSettings next : c2) {
                    String c3 = next.mo64530c();
                    String e = next.mo64533e();
                    hashSet.add(c3);
                    putBoolean.putString("BiddingSettingsAdUnitIdsInfo_" + c3, e);
                }
                for (String next2 : sharedPreferences2.getStringSet("BiddingSettingsAdUnitIdsSet", Collections.emptySet())) {
                    if (!hashSet.contains(next2)) {
                        putBoolean.remove("BiddingSettingsAdUnitIdsInfo_" + next2);
                    }
                }
                putBoolean.putStringSet("BiddingSettingsAdUnitIdsSet", hashSet);
            }
            i30 e2 = d71.mo66455e();
            if (e2 != null) {
                putBoolean.putString("SdkConfigurationPublicEncryptionKey", e2.mo67712a()).putInt("SdkConfigurationPublicEncryptionVersion", e2.mo67713b());
            }
            m37279a(putBoolean, "SdkConfigurationUseFlexInsteadFixedBannerEnabled", valueOf15);
            putBoolean.apply();
        }
    }

    /* renamed from: a */
    public static synchronized d71 m37276a(Context context) {
        d71 d71;
        Boolean bool;
        boolean z;
        boolean z2;
        BiddingSettings biddingSettings;
        Integer num;
        String str;
        synchronized (C13378i5.class) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("YadPreferenceFile", 0);
            long j = sharedPreferences.getLong("SdkConfigurationExpiredDate", 0);
            Boolean a = m37277a(sharedPreferences, "SdkConfigurationVisibilityErrorIndicatorEnabled");
            if (j != 0) {
                Integer b = m37283b(sharedPreferences, "SdkConfigurationAdRequestMaxRetries");
                Integer b2 = m37283b(sharedPreferences, "SdkConfigurationPingRequestMaxRetries");
                Long valueOf = sharedPreferences.contains("SdkConfigurationAdBlockerStatusValidityDuration") ? Long.valueOf(sharedPreferences.getLong("SdkConfigurationAdBlockerStatusValidityDuration", 0)) : null;
                boolean z3 = sharedPreferences.getBoolean("SdkConfigurationAntiAdBlockerDisabled", false);
                int i = sharedPreferences.getInt("AdIdsStorageSize", 0);
                Boolean a2 = m37277a(sharedPreferences, "SdkConfigurationMediationSensitiveModeDisabled");
                boolean z4 = sharedPreferences.getBoolean("SdkConfigurationMrcVisibilityTrackingEnabled", false);
                boolean z5 = sharedPreferences.getBoolean("SdkConfigurationCustomUserAgentEnabled", false);
                boolean z6 = sharedPreferences.getBoolean("SdkConfigurationFusedLocationProviderDisabled", false);
                boolean z7 = sharedPreferences.getBoolean("SdkConfigurationLockScreenEnabled", false);
                Boolean bool2 = a;
                boolean z8 = sharedPreferences.getBoolean("SdkConfigurationAutograbEnabled", false);
                Boolean a3 = m37277a(sharedPreferences, "SdkConfigurationUserConsent");
                boolean z9 = z8;
                boolean z10 = z7;
                String string = sharedPreferences.getString("SdkConfigurationLibraryVersion", (String) null);
                boolean z11 = z6;
                String string2 = sharedPreferences.getString("SdkConfigurationMraidUrl", (String) null);
                String string3 = sharedPreferences.getString("SdkConfigurationOmSdkControllerUrl", (String) null);
                boolean z12 = sharedPreferences.getBoolean("CustomClickHandlingEnabled", false);
                boolean z13 = sharedPreferences.getBoolean("SdkConfigurationSensitiveModeDisabled", false);
                boolean z14 = sharedPreferences.getBoolean("SdkConfigurationLegacyVastTrackingEnabled", false);
                boolean z15 = sharedPreferences.getBoolean("SdkConfigurationLegacyVisibilityLogicEnabled", false);
                boolean z16 = sharedPreferences.getBoolean("SdkConfigurationOverlappingVisibilityTrackingEnabled", false);
                boolean z17 = sharedPreferences.getBoolean("SdkConfigurationOverlappingWindowTrackingEnabled", false);
                boolean z18 = sharedPreferences.getBoolean("SdkConfigurationShowVersionValidationErrorLog", false);
                boolean z19 = sharedPreferences.getBoolean("SdkConfigurationShowVersionValidationErrorIndicator", false);
                boolean z20 = sharedPreferences.getBoolean("SdkConfigurationImpressionValidationOnClickEnabled", false);
                boolean z21 = sharedPreferences.getBoolean("SdkConfigurationLegacySliderImpressionEnabled", false);
                boolean z22 = sharedPreferences.getBoolean("SdkConfigurationFullScreenBackButtonEnabled", false);
                boolean z23 = sharedPreferences.getBoolean("SdkConfigurationClickAreaVerificationEnabled", false);
                boolean z24 = sharedPreferences.getBoolean("SdkConfigurationOpenMeasurementSdkDisabled", false);
                boolean z25 = sharedPreferences.getBoolean("SdkConfigurationLocationConsent", false);
                boolean z26 = sharedPreferences.getBoolean("SdkConfigurationMultibannerArrowControlsDisabled", false);
                Set<String> stringSet = sharedPreferences.getStringSet("BiddingSettingsAdUnitIdsSet", Collections.emptySet());
                if (!stringSet.isEmpty()) {
                    C12723cc ccVar = new C12723cc();
                    z2 = z5;
                    z = z4;
                    ArrayList arrayList = new ArrayList(stringSet.size());
                    Iterator<String> it = stringSet.iterator();
                    while (it.hasNext()) {
                        Iterator<String> it2 = it;
                        StringBuilder sb = new StringBuilder();
                        Boolean bool3 = a2;
                        sb.append("BiddingSettingsAdUnitIdsInfo_");
                        sb.append(it.next());
                        String string4 = sharedPreferences.getString(sb.toString(), (String) null);
                        if (string4 != null && !string4.isEmpty()) {
                            try {
                                AdUnitIdBiddingSettings a4 = ccVar.mo66251a(new JSONObject(string4));
                                if (a4 != null) {
                                    arrayList.add(a4);
                                }
                            } catch (JSONException unused) {
                            }
                        }
                        it = it2;
                        a2 = bool3;
                    }
                    bool = a2;
                    if (!arrayList.isEmpty()) {
                        biddingSettings = new BiddingSettings((List<AdUnitIdBiddingSettings>) arrayList);
                        String string5 = sharedPreferences.getString("SdkConfigurationPublicEncryptionKey", (String) null);
                        Integer b3 = m37283b(sharedPreferences, "SdkConfigurationPublicEncryptionVersion");
                        boolean z27 = sharedPreferences.getBoolean("SdkConfigurationCounterType3Disabled", false);
                        num = b3;
                        boolean z28 = sharedPreferences.getBoolean("SdkConfigurationLegacyRenderTrackingEnabled", false);
                        str = string5;
                        boolean z29 = sharedPreferences.getBoolean("SdkConfigurationDivkitisabled", false);
                        boolean z30 = sharedPreferences.getBoolean("SdkConfigurationUseOkHttpNetworkStack", false);
                        d71.C12860b A = new d71.C12860b().mo66496c(string).mo66491b(a3).mo66482a(j).mo66486a(b).mo66492b(b2).mo66487a(valueOf).mo66489a(z3).mo66481a(i).mo66485a(bool).mo66513s(z).mo66500f(z2).mo66504j(z11).mo66512r(z10).mo66494b(z9).mo66518x(z13).mo66488a(string2).mo66493b(string3).mo66499e(z12).mo66495c(bool2).mo66508n(z14).mo66509o(z15).mo66516v(z16).mo66517w(z17).mo66520z(z18).mo66519y(z19).mo66505k(z20).mo66507m(z21).mo66503i(z22).mo66497c(z23).mo66483a(biddingSettings).mo66498d(z27).mo66506l(z28).mo66501g(z29).mo66514t(z26).mo66480B(z30).mo66515u(z24).mo66511q(z25).mo66510p(sharedPreferences.getBoolean("SdkConfigurationLibSSLEnabled", false)).mo66502h(sharedPreferences.getBoolean("SdkConfigurationEncryptedRequestsEnabled", false)).mo66479A(sharedPreferences.getBoolean("SdkConfigurationUseFlexInsteadFixedBannerEnabled", false));
                        if (!(str == null || num == null)) {
                            A.mo66484a(new i30(str, num.intValue()));
                        }
                        d71 = A.mo66490a();
                    }
                } else {
                    bool = a2;
                    z = z4;
                    z2 = z5;
                }
                biddingSettings = null;
                String string52 = sharedPreferences.getString("SdkConfigurationPublicEncryptionKey", (String) null);
                Integer b32 = m37283b(sharedPreferences, "SdkConfigurationPublicEncryptionVersion");
                boolean z272 = sharedPreferences.getBoolean("SdkConfigurationCounterType3Disabled", false);
                num = b32;
                boolean z282 = sharedPreferences.getBoolean("SdkConfigurationLegacyRenderTrackingEnabled", false);
                str = string52;
                boolean z292 = sharedPreferences.getBoolean("SdkConfigurationDivkitisabled", false);
                boolean z302 = sharedPreferences.getBoolean("SdkConfigurationUseOkHttpNetworkStack", false);
                d71.C12860b A2 = new d71.C12860b().mo66496c(string).mo66491b(a3).mo66482a(j).mo66486a(b).mo66492b(b2).mo66487a(valueOf).mo66489a(z3).mo66481a(i).mo66485a(bool).mo66513s(z).mo66500f(z2).mo66504j(z11).mo66512r(z10).mo66494b(z9).mo66518x(z13).mo66488a(string2).mo66493b(string3).mo66499e(z12).mo66495c(bool2).mo66508n(z14).mo66509o(z15).mo66516v(z16).mo66517w(z17).mo66520z(z18).mo66519y(z19).mo66505k(z20).mo66507m(z21).mo66503i(z22).mo66497c(z23).mo66483a(biddingSettings).mo66498d(z272).mo66506l(z282).mo66501g(z292).mo66514t(z26).mo66480B(z302).mo66515u(z24).mo66511q(z25).mo66510p(sharedPreferences.getBoolean("SdkConfigurationLibSSLEnabled", false)).mo66502h(sharedPreferences.getBoolean("SdkConfigurationEncryptedRequestsEnabled", false)).mo66479A(sharedPreferences.getBoolean("SdkConfigurationUseFlexInsteadFixedBannerEnabled", false));
                A2.mo66484a(new i30(str, num.intValue()));
                d71 = A2.mo66490a();
            } else {
                d71 = null;
            }
        }
        return d71;
    }

    /* renamed from: a */
    static Boolean m37277a(SharedPreferences sharedPreferences, String str) {
        if (sharedPreferences.contains(str)) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, false));
        }
        return null;
    }

    /* renamed from: a */
    private static void m37279a(SharedPreferences.Editor editor, String str, Boolean bool) {
        if (bool != null) {
            editor.putBoolean(str, bool.booleanValue());
        } else {
            editor.remove(str);
        }
    }
}
