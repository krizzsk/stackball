package com.inmobi.sdk;

import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import com.appsflyer.internal.referrer.Payload;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.inmobi.media.C5239ey;
import com.inmobi.media.C5309gl;
import com.inmobi.media.C5314go;
import com.inmobi.media.C5315gp;
import com.inmobi.media.C5327gw;
import com.inmobi.media.C5329gy;
import com.inmobi.media.C5333ha;
import com.inmobi.media.C5342he;
import com.inmobi.media.C5346hh;
import com.inmobi.media.C5348hj;
import com.inmobi.media.C5384ii;
import com.inmobi.media.C5395il;
import com.inmobi.unification.sdk.InitializationStatus;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class InMobiSdk {
    public static final String IM_GDPR_CONSENT_AVAILABLE = "gdpr_consent_available";
    public static final String IM_GDPR_CONSENT_GDPR_APPLIES = "gdpr";
    public static final String IM_GDPR_CONSENT_IAB = "gdpr_consent";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f12619a = InMobiSdk.class.getSimpleName();

    public enum LogLevel {
        NONE,
        ERROR,
        DEBUG
    }

    public enum Education {
        HIGH_SCHOOL_OR_LESS("highschoolorless"),
        COLLEGE_OR_GRADUATE("collegeorgraduate"),
        POST_GRADUATE_OR_ABOVE("postgraduateorabove");
        
        private String value;

        private Education(String str) {
            this.value = str;
        }

        public final String toString() {
            return this.value;
        }
    }

    public enum Gender {
        FEMALE(InneractiveMediationDefs.GENDER_FEMALE),
        MALE(InneractiveMediationDefs.GENDER_MALE);
        
        private String value;

        private Gender(String str) {
            this.value = str;
        }

        public final String toString() {
            return this.value;
        }
    }

    public enum AgeGroup {
        BELOW_18("below18"),
        BETWEEN_18_AND_24("between18and24"),
        BETWEEN_25_AND_29("between25and29"),
        BETWEEN_30_AND_34("between30and34"),
        BETWEEN_35_AND_44("between35and44"),
        BETWEEN_45_AND_54("between45and54"),
        BETWEEN_55_AND_65("between55and65"),
        ABOVE_65("above65");
        
        private String value;

        private AgeGroup(String str) {
            this.value = str;
        }

        public final String toString() {
            return this.value;
        }
    }

    @Deprecated
    @InitializationStatus
    public static String init(Context context, String str) {
        return init(context, str, (JSONObject) null);
    }

    @Deprecated
    @InitializationStatus
    public static String init(final Context context, String str, JSONObject jSONObject) {
        C5333ha.m12302a();
        final String trim = str.trim();
        try {
            C5346hh.m12343a(jSONObject);
            if (trim.length() == 0) {
                return "Account id cannot be empty. Please provide a valid account id.";
            }
            if (!C5329gy.m12278a(context, "android.permission.ACCESS_COARSE_LOCATION") && !C5329gy.m12278a(context, "android.permission.ACCESS_FINE_LOCATION")) {
                C5327gw.m12263a((byte) 1, f12619a, "Please grant the location permissions (ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION, or both) for better ad targeting.");
            }
            if (!(trim.length() == 32 || trim.length() == 36)) {
                C5327gw.m12263a((byte) 2, f12619a, "Invalid account id passed to init. Please provide a valid account id.");
            }
            if (C5314go.m12202b()) {
                return InitializationStatus.SUCCESS;
            }
            C5314go.m12193a(context, trim);
            C5384ii.m12472b(context);
            C5314go.m12195a((Runnable) new Runnable() {
                public final void run() {
                    try {
                        C5384ii.m12469a(context);
                        C5314go.m12200b(trim);
                        C5239ey.m11992a(trim);
                        C5384ii.m12474c(context);
                    } catch (Exception unused) {
                        String unused2 = InMobiSdk.f12619a;
                    }
                }
            });
            C5327gw.m12263a((byte) 2, f12619a, "InMobi SDK initialized with account id: ".concat(String.valueOf(trim)));
            m13027b();
            return InitializationStatus.SUCCESS;
        } catch (Exception unused) {
            C5314go.m12190a((Context) null);
            C5327gw.m12263a((byte) 1, f12619a, "SDK could not be initialized; an unexpected error was encountered.");
            return "SDK could not be initialized; an unexpected error was encountered.";
        }
    }

    public static void init(Context context, String str, JSONObject jSONObject, SdkInitializationListener sdkInitializationListener) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        C5333ha.m12302a();
        final String trim = str.trim();
        try {
            C5346hh.m12343a(jSONObject);
            if (trim.length() == 0) {
                m13029c(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
                return;
            }
            if (!C5329gy.m12278a(context, "android.permission.ACCESS_COARSE_LOCATION") && !C5329gy.m12278a(context, "android.permission.ACCESS_FINE_LOCATION")) {
                C5327gw.m12263a((byte) 1, f12619a, "Please grant the location permissions (ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION, or both) for better ad targeting.");
            }
            if (C5314go.m12202b()) {
                m13029c(sdkInitializationListener, (String) null);
                return;
            }
            C5314go.m12193a(context, trim);
            C5384ii.m12472b(context);
            m13027b();
            final Context context2 = context;
            final SdkInitializationListener sdkInitializationListener2 = sdkInitializationListener;
            C5314go.m12195a((Runnable) new Runnable() {
                public final void run() {
                    try {
                        C5384ii.m12469a(context2);
                        C5314go.m12200b(trim);
                        C5239ey.m11992a(trim);
                        C5384ii.m12474c(context2);
                        InMobiSdk.m13029c(sdkInitializationListener2, (String) null);
                        C5309gl.m12169a().mo40652a("SdkInitialized", (Map<String, Object>) InMobiSdk.m13025a(elapsedRealtime));
                    } catch (Exception unused) {
                        String unused2 = InMobiSdk.f12619a;
                        InMobiSdk.m13029c(sdkInitializationListener2, "SDK could not be initialized; an unexpected error was encountered.");
                    }
                }
            });
        } catch (Exception unused) {
            C5314go.m12190a((Context) null);
            m13029c(sdkInitializationListener, "SDK could not be initialized; an unexpected error was encountered.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m13029c(final SdkInitializationListener sdkInitializationListener, final String str) {
        if (sdkInitializationListener != null) {
            C5395il.m12500a().mo40767a(new Runnable() {
                public final void run() {
                    InMobiSdk.fireListener(sdkInitializationListener, str);
                }
            });
        }
        if (str == null) {
            String str2 = f12619a;
            C5327gw.m12263a((byte) 2, str2, "InMobi SDK initialized with account id: " + C5314go.m12213g());
            return;
        }
        C5327gw.m12263a((byte) 1, f12619a, str);
    }

    public static void fireListener(SdkInitializationListener sdkInitializationListener, String str) {
        sdkInitializationListener.onInitializationComplete(str == null ? null : new Error(str));
    }

    public static void updateGDPRConsent(JSONObject jSONObject) {
        C5346hh.m12343a(jSONObject);
    }

    public static void setApplicationMuted(boolean z) {
        C5314go.m12196a(z);
    }

    /* renamed from: b */
    private static void m13027b() {
        C5314go.m12195a((Runnable) new Runnable() {
            public final void run() {
                String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE"};
                StringBuilder sb = new StringBuilder("Permissions granted to SDK are :\nandroid.permission.INTERNET\nandroid.permission.ACCESS_NETWORK_STATE");
                for (int i = 0; i < 4; i++) {
                    String str = strArr[i];
                    if (C5329gy.m12278a(C5314go.m12203c(), str)) {
                        sb.append("\n");
                        sb.append(str);
                    }
                }
                C5327gw.m12263a((byte) 2, InMobiSdk.f12619a, sb.toString());
            }
        });
    }

    public static String getVersion() {
        return C5315gp.m12226b();
    }

    /* renamed from: com.inmobi.sdk.InMobiSdk$5 */
    static /* synthetic */ class C54845 {

        /* renamed from: a */
        static final /* synthetic */ int[] f12628a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.inmobi.sdk.InMobiSdk$LogLevel[] r0 = com.inmobi.sdk.InMobiSdk.LogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12628a = r0
                com.inmobi.sdk.InMobiSdk$LogLevel r1 = com.inmobi.sdk.InMobiSdk.LogLevel.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12628a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.inmobi.sdk.InMobiSdk$LogLevel r1 = com.inmobi.sdk.InMobiSdk.LogLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12628a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.inmobi.sdk.InMobiSdk$LogLevel r1 = com.inmobi.sdk.InMobiSdk.LogLevel.DEBUG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.sdk.InMobiSdk.C54845.<clinit>():void");
        }
    }

    public static void setLogLevel(LogLevel logLevel) {
        int i = C54845.f12628a[logLevel.ordinal()];
        if (i == 1) {
            C5327gw.m12262a((byte) 0);
        } else if (i != 2) {
            C5327gw.m12262a((byte) 2);
        } else {
            C5327gw.m12262a((byte) 1);
        }
    }

    public static void setAge(int i) {
        C5348hj.m12354a(i);
    }

    public static void setAgeGroup(AgeGroup ageGroup) {
        C5348hj.m12356a(ageGroup.toString().toLowerCase(Locale.ENGLISH));
    }

    public static void setAreaCode(String str) {
        C5348hj.m12360b(str);
    }

    public static void setPostalCode(String str) {
        C5348hj.m12362c(str);
    }

    public static void setLocationWithCityStateCountry(String str, String str2, String str3) {
        C5348hj.m12363d(str);
        C5348hj.m12364e(str2);
        C5348hj.m12365f(str3);
    }

    public static void setYearOfBirth(int i) {
        C5348hj.m12359b(i);
    }

    public static void setGender(Gender gender) {
        C5348hj.m12366g(gender.toString().toLowerCase(Locale.ENGLISH));
    }

    public static void setEducation(Education education) {
        C5348hj.m12367h(education.toString().toLowerCase(Locale.ENGLISH));
    }

    public static void setLanguage(String str) {
        C5348hj.m12368i(str);
    }

    public static void setInterests(String str) {
        C5348hj.m12369j(str);
    }

    public static void setLocation(Location location) {
        C5348hj.m12355a(location);
    }

    /* renamed from: a */
    static /* synthetic */ Map m13025a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(Payload.LATENCY, Long.valueOf(SystemClock.elapsedRealtime() - j));
        hashMap.put("networkType", C5342he.m12330b());
        hashMap.put("integrationType", "InMobi");
        return hashMap;
    }
}
