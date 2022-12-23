package com.adcolony.sdk;

import android.content.Context;
import android.util.Log;
import com.amazon.device.ads.AdConstants;
import com.appsflyer.internal.referrer.Payload;
import com.facebook.internal.security.CertificateUtil;
import com.tapjoy.TapjoyConstants;
import java.util.Locale;
import org.json.JSONObject;

public class AdColonyAppOptions {
    public static final String ADMARVEL = "AdMarvel";
    public static final String ADMOB = "AdMob";
    public static final String ADOBEAIR = "Adobe AIR";
    public static final String AERSERVE = "AerServe";
    @Deprecated
    public static final int ALL = 2;
    public static final String APPODEAL = "Appodeal";
    public static final String CCPA = "CCPA";
    public static final String COCOS2DX = "Cocos2d-x";
    public static final String COPPA = "COPPA";
    public static final String CORONA = "Corona";
    public static final String FUSEPOWERED = "Fuse Powered";
    public static final String FYBER = "Fyber";
    public static final String GDPR = "GDPR";
    public static final String IRONSOURCE = "ironSource";
    @Deprecated
    public static final int LANDSCAPE = 1;
    public static final String MOPUB = "MoPub";
    @Deprecated
    public static final int PORTRAIT = 0;
    @Deprecated
    public static final int SENSOR = 2;
    public static final String UNITY = "Unity";

    /* renamed from: a */
    private String f118a = "";

    /* renamed from: b */
    private String[] f119b;

    /* renamed from: c */
    private C0895y0 f120c = new C0895y0();

    /* renamed from: d */
    private C0897z0 f121d = new C0897z0();

    /* renamed from: e */
    private AdColonyUserMetadata f122e;

    public AdColonyAppOptions() {
        setOriginStore(Payload.SOURCE_GOOGLE);
        if (C0578a.m145e()) {
            C0693i c = C0578a.m143c();
            if (c.mo9575G()) {
                mo9268a(c.mo9620x().f118a);
                mo9269a(c.mo9620x().f119b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdColonyAppOptions mo9268a(String str) {
        if (str == null) {
            return this;
        }
        this.f118a = str;
        C0894y.m1148a(this.f121d, "app_id", str);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0897z0 mo9271b() {
        return this.f121d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String[] mo9273c() {
        return this.f119b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0895y0 mo9274d() {
        return this.f120c;
    }

    public int getAppOrientation() {
        return C0894y.m1132a(this.f121d, "app_orientation", -1);
    }

    public String getAppVersion() {
        return C0894y.m1169h(this.f121d, TapjoyConstants.TJC_APP_VERSION_NAME);
    }

    @Deprecated
    public String getGDPRConsentString() {
        return C0894y.m1169h(this.f121d, "consent_string");
    }

    @Deprecated
    public boolean getGDPRRequired() {
        return C0894y.m1155b(this.f121d, "gdpr_required");
    }

    public boolean getKeepScreenOn() {
        return C0894y.m1155b(this.f121d, "keep_screen_on");
    }

    public JSONObject getMediationInfo() {
        C0897z0 b = C0894y.m1151b();
        C0894y.m1148a(b, "name", C0894y.m1169h(this.f121d, "mediation_network"));
        C0894y.m1148a(b, "version", C0894y.m1169h(this.f121d, "mediation_network_version"));
        return b.mo10059a();
    }

    public boolean getMultiWindowEnabled() {
        return C0894y.m1155b(this.f121d, "multi_window_enabled");
    }

    public Object getOption(String str) {
        return C0894y.m1168g(this.f121d, str);
    }

    public String getOriginStore() {
        return C0894y.m1169h(this.f121d, "origin_store");
    }

    public JSONObject getPluginInfo() {
        C0897z0 b = C0894y.m1151b();
        C0894y.m1148a(b, "name", C0894y.m1169h(this.f121d, TapjoyConstants.TJC_PLUGIN));
        C0894y.m1148a(b, "version", C0894y.m1169h(this.f121d, "plugin_version"));
        return b.mo10059a();
    }

    public String getPrivacyConsentString(String str) {
        C0897z0 z0Var = this.f121d;
        return C0894y.m1169h(z0Var, str.toLowerCase(Locale.ENGLISH) + "_consent_string");
    }

    public boolean getPrivacyFrameworkRequired(String str) {
        C0897z0 z0Var = this.f121d;
        return C0894y.m1155b(z0Var, str.toLowerCase(Locale.ENGLISH) + "_required");
    }

    @Deprecated
    public int getRequestedAdOrientation() {
        return C0894y.m1132a(this.f121d, "orientation", -1);
    }

    public boolean getTestModeEnabled() {
        return C0894y.m1155b(this.f121d, "test_mode");
    }

    public String getUserID() {
        return C0894y.m1169h(this.f121d, "user_id");
    }

    @Deprecated
    public AdColonyUserMetadata getUserMetadata() {
        return this.f122e;
    }

    public AdColonyAppOptions setAppOrientation(int i) {
        setOption("app_orientation", (double) i);
        return this;
    }

    public AdColonyAppOptions setAppVersion(String str) {
        setOption(TapjoyConstants.TJC_APP_VERSION_NAME, str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setGDPRConsentString(String str) {
        C0894y.m1148a(this.f121d, "consent_string", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setGDPRRequired(boolean z) {
        setOption("gdpr_required", z);
        return this;
    }

    public AdColonyAppOptions setKeepScreenOn(boolean z) {
        C0894y.m1158b(this.f121d, "keep_screen_on", z);
        return this;
    }

    public AdColonyAppOptions setMediationNetwork(String str, String str2) {
        C0894y.m1148a(this.f121d, "mediation_network", str);
        C0894y.m1148a(this.f121d, "mediation_network_version", str2);
        return this;
    }

    public AdColonyAppOptions setMultiWindowEnabled(boolean z) {
        C0894y.m1158b(this.f121d, "multi_window_enabled", z);
        return this;
    }

    public AdColonyAppOptions setOption(String str, boolean z) {
        C0894y.m1158b(this.f121d, str, z);
        return this;
    }

    public AdColonyAppOptions setOriginStore(String str) {
        setOption("origin_store", str);
        return this;
    }

    public AdColonyAppOptions setPlugin(String str, String str2) {
        C0894y.m1148a(this.f121d, TapjoyConstants.TJC_PLUGIN, str);
        C0894y.m1148a(this.f121d, "plugin_version", str2);
        return this;
    }

    public AdColonyAppOptions setPrivacyConsentString(String str, String str2) {
        C0897z0 z0Var = this.f121d;
        C0894y.m1148a(z0Var, str.toLowerCase(Locale.ENGLISH) + "_consent_string", str2);
        return this;
    }

    public AdColonyAppOptions setPrivacyFrameworkRequired(String str, boolean z) {
        setOption(str.toLowerCase(Locale.ENGLISH) + "_required", z);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setRequestedAdOrientation(int i) {
        setOption("orientation", (double) i);
        return this;
    }

    public AdColonyAppOptions setTestModeEnabled(boolean z) {
        C0894y.m1158b(this.f121d, "test_mode", z);
        return this;
    }

    public AdColonyAppOptions setUserID(String str) {
        setOption("user_id", str);
        return this;
    }

    @Deprecated
    public AdColonyAppOptions setUserMetadata(AdColonyUserMetadata adColonyUserMetadata) {
        this.f122e = adColonyUserMetadata;
        C0894y.m1147a(this.f121d, "user_metadata", adColonyUserMetadata.f163b);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9272b(Context context) {
        m71a(context);
        Boolean i = this.f121d.mo10080i("use_forced_controller");
        if (i != null) {
            C0872w0.f1538Q = i.booleanValue();
        }
        if (this.f121d.mo10079h("use_staging_launch_server")) {
            C0693i.f992c0 = "https://adc3-launch-staging.adcolony.com/v4/launch";
        }
        String b = C0849u0.m926b(context, "IABUSPrivacy_String");
        String b2 = C0849u0.m926b(context, AdConstants.IABCONSENT_CONSENT_STRING_TCF2);
        int a = C0849u0.m900a(context, AdConstants.IABCONSENT_SUBJECT_TO_GDPR_TCF2);
        if (b != null) {
            C0894y.m1148a(this.f121d, "ccpa_consent_string", b);
        }
        if (b2 != null) {
            C0894y.m1148a(this.f121d, "gdpr_consent_string", b2);
        }
        boolean z = true;
        if (a == 0 || a == 1) {
            C0897z0 z0Var = this.f121d;
            if (a != 1) {
                z = false;
            }
            C0894y.m1158b(z0Var, "gdpr_required", z);
        }
    }

    public AdColonyAppOptions setOption(String str, double d) {
        C0894y.m1145a(this.f121d, str, d);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public AdColonyAppOptions mo9269a(String... strArr) {
        if (strArr == null) {
            return this;
        }
        this.f119b = strArr;
        this.f120c = C0894y.m1134a();
        for (String b : strArr) {
            C0894y.m1154b(this.f120c, b);
        }
        return this;
    }

    public AdColonyAppOptions setOption(String str, String str2) {
        C0894y.m1148a(this.f121d, str, str2);
        return this;
    }

    public static AdColonyAppOptions getMoPubAppOptions(String str) {
        AdColonyAppOptions mediationNetwork = new AdColonyAppOptions().setMediationNetwork("MoPub", "unknown");
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",");
            int length = split.length;
            int i = 0;
            while (i < length) {
                String[] split2 = split[i].split(CertificateUtil.DELIMITER);
                if (split2.length == 2) {
                    String str2 = split2[0];
                    str2.hashCode();
                    if (str2.equals("store")) {
                        mediationNetwork.setOriginStore(split2[1]);
                    } else if (!str2.equals("version")) {
                        Log.e("AdColonyMoPub", "AdColony client options in wrong format - please check your MoPub dashboard");
                        return mediationNetwork;
                    } else {
                        mediationNetwork.setAppVersion(split2[1]);
                    }
                    i++;
                } else {
                    Log.e("AdColonyMoPub", "AdColony client options not recognized - please check your MoPub dashboard");
                    return null;
                }
            }
        }
        return mediationNetwork;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo9270a() {
        return this.f118a;
    }

    /* renamed from: a */
    private void m71a(Context context) {
        setOption("bundle_id", C0849u0.m939d(context));
    }
}
