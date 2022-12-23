package com.tapjoy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.security.CertificateUtil;
import com.inmobi.unification.sdk.InitializationStatus;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.C9067al;
import com.tapjoy.internal.C9092bh;
import com.tapjoy.internal.C9101bn;
import com.tapjoy.internal.C9229eu;
import com.tapjoy.internal.C9247fa;
import com.tapjoy.internal.C9250fb;
import com.tapjoy.internal.C9268fh;
import com.tapjoy.internal.C9281fo;
import com.tapjoy.internal.C9288fs;
import com.tapjoy.internal.C9300ga;
import com.tapjoy.internal.C9313ge;
import com.tapjoy.internal.C9344gz;
import com.tapjoy.internal.C9357hc;
import com.tapjoy.internal.C9376hn;
import com.tapjoy.internal.C9465jq;
import com.tapjoy.internal.C9476jz;
import com.tapjoy.internal.C9503v;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import org.w3c.dom.Document;

public class TapjoyConnectCore {

    /* renamed from: A */
    private static float f22162A = 1.0f;

    /* renamed from: B */
    private static int f22163B = 1;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public static String f22164C = "";

    /* renamed from: D */
    private static String f22165D = "";
    public static final float DEFAULT_CURRENCY_MULTIPLIER = 1.0f;

    /* renamed from: E */
    private static String f22166E = "";

    /* renamed from: F */
    private static String f22167F = "";

    /* renamed from: G */
    private static String f22168G = "";

    /* renamed from: H */
    private static String f22169H = "";

    /* renamed from: I */
    private static String f22170I = "";

    /* renamed from: J */
    private static String f22171J = "";

    /* renamed from: K */
    private static String f22172K = "";

    /* renamed from: L */
    private static String f22173L = "";

    /* renamed from: M */
    private static String f22174M = "";

    /* renamed from: N */
    private static String f22175N = "";

    /* renamed from: O */
    private static String f22176O = "native";

    /* renamed from: P */
    private static String f22177P = "";

    /* renamed from: Q */
    private static String f22178Q = "";

    /* renamed from: R */
    private static float f22179R = 1.0f;

    /* renamed from: S */
    private static boolean f22180S = false;

    /* renamed from: T */
    private static String f22181T = "";

    /* renamed from: U */
    private static String f22182U = "";

    /* renamed from: V */
    private static String f22183V = "";

    /* renamed from: W */
    private static String f22184W = "";

    /* renamed from: X */
    private static String f22185X = null;

    /* renamed from: a */
    protected static int f22186a = 0;

    /* renamed from: aA */
    private static Integer f22187aA;

    /* renamed from: aB */
    private static Long f22188aB;

    /* renamed from: aC */
    private static Long f22189aC;

    /* renamed from: aD */
    private static Long f22190aD;

    /* renamed from: aE */
    private static String f22191aE;

    /* renamed from: aF */
    private static Integer f22192aF;

    /* renamed from: aG */
    private static Double f22193aG;

    /* renamed from: aH */
    private static Double f22194aH;

    /* renamed from: aI */
    private static Long f22195aI;

    /* renamed from: aJ */
    private static Integer f22196aJ;

    /* renamed from: aK */
    private static Integer f22197aK;

    /* renamed from: aL */
    private static Integer f22198aL;

    /* renamed from: aM */
    private static String f22199aM;

    /* renamed from: aN */
    private static String f22200aN;

    /* renamed from: aO */
    private static String f22201aO;

    /* renamed from: aP */
    private static String f22202aP = "";

    /* renamed from: aQ */
    private static String f22203aQ = "";

    /* renamed from: aR */
    private static String f22204aR = "";

    /* renamed from: aS */
    private static boolean f22205aS = false;

    /* renamed from: aT */
    private static TJConnectListener f22206aT = null;

    /* renamed from: aU */
    private static boolean f22207aU = false;

    /* renamed from: aa */
    private static long f22208aa = 0;

    /* renamed from: ac */
    private static boolean f22209ac;

    /* renamed from: ad */
    private static PackageManager f22210ad;

    /* renamed from: ae */
    private static TapjoyGpsHelper f22211ae;

    /* renamed from: af */
    private static Hashtable f22212af = TapjoyConnectFlag.CONNECT_FLAG_DEFAULTS;

    /* renamed from: ag */
    private static Map f22213ag = new ConcurrentHashMap();

    /* renamed from: ah */
    private static String f22214ah;

    /* renamed from: ai */
    private static String f22215ai;

    /* renamed from: aj */
    private static String f22216aj;

    /* renamed from: ak */
    private static String f22217ak;

    /* renamed from: al */
    private static Integer f22218al;

    /* renamed from: am */
    private static String f22219am;

    /* renamed from: an */
    private static String f22220an;

    /* renamed from: ao */
    private static Long f22221ao;

    /* renamed from: ap */
    private static String f22222ap;

    /* renamed from: aq */
    private static Integer f22223aq;

    /* renamed from: ar */
    private static Integer f22224ar;

    /* renamed from: as */
    private static String f22225as;

    /* renamed from: at */
    private static String f22226at;

    /* renamed from: au */
    private static String f22227au;

    /* renamed from: av */
    private static String f22228av;

    /* renamed from: aw */
    private static String f22229aw;

    /* renamed from: ax */
    private static Set f22230ax;

    /* renamed from: ay */
    private static Integer f22231ay;

    /* renamed from: az */
    private static Integer f22232az;

    /* renamed from: b */
    protected static int f22233b = 0;

    /* renamed from: c */
    protected static String f22234c = "";

    /* renamed from: d */
    protected static boolean f22235d;

    /* renamed from: e */
    protected static String f22236e = "";

    /* renamed from: f */
    protected static String f22237f = "";

    /* renamed from: g */
    private static Context f22238g;

    /* renamed from: h */
    private static String f22239h;

    /* renamed from: i */
    private static TapjoyConnectCore f22240i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static TapjoyURLConnection f22241j;

    /* renamed from: k */
    private static TJConnectListener f22242k;

    /* renamed from: l */
    private static TJSetUserIDListener f22243l;

    /* renamed from: m */
    private static Vector f22244m = new Vector(Arrays.asList(TapjoyConstants.dependencyClassNames));

    /* renamed from: n */
    private static String f22245n = "";

    /* renamed from: o */
    private static String f22246o = "";

    /* renamed from: p */
    private static String f22247p = "";

    /* renamed from: q */
    private static String f22248q = "";

    /* renamed from: r */
    private static String f22249r = "";

    /* renamed from: s */
    private static String f22250s = "";

    /* renamed from: t */
    private static String f22251t = "";

    /* renamed from: u */
    private static String f22252u = "";

    /* renamed from: v */
    private static String f22253v = "";

    /* renamed from: w */
    private static String f22254w = "";

    /* renamed from: x */
    private static String f22255x = "";

    /* renamed from: y */
    private static String f22256y = "";

    /* renamed from: z */
    private static int f22257z = 1;

    /* renamed from: Y */
    private long f22258Y = 0;

    /* renamed from: Z */
    private boolean f22259Z = false;

    /* renamed from: ab */
    private boolean f22260ab = false;

    public static String getConnectURL() {
        return TapjoyConfig.TJC_CONNECT_SERVICE_URL;
    }

    public static TapjoyConnectCore getInstance() {
        return f22240i;
    }

    public static void requestTapjoyConnect(Context context, String str) {
        requestTapjoyConnect(context, str, (Hashtable) null);
    }

    public static void requestTapjoyConnect(Context context, String str, Hashtable hashtable) {
        requestTapjoyConnect(context, str, hashtable, (TJConnectListener) null);
    }

    public static void requestTapjoyConnect(Context context, String str, Hashtable hashtable, TJConnectListener tJConnectListener) {
        try {
            C9281fo foVar = new C9281fo(str);
            if (foVar.f22948a == C9281fo.C9282a.SDK_ANDROID) {
                f22239h = str;
                f22253v = foVar.f22949b;
                f22174M = foVar.f22950c;
                f22175N = foVar.f22951d;
                if (hashtable != null) {
                    f22212af.putAll(hashtable);
                    C9300ga.m24930b().mo58159a(hashtable);
                }
                C9344gz.m25061a(context).f23120j = str;
                f22242k = tJConnectListener;
                if (f22240i == null) {
                    f22240i = new TapjoyConnectCore();
                }
                TapjoyConnectCore tapjoyConnectCore = f22240i;
                try {
                    m24245a(context);
                    new Thread(new Runnable() {
                        public final void run() {
                            TapjoyConnectCore.m24241a();
                            TapjoyConnectCore.this.completeConnectCall();
                        }
                    }).start();
                    tapjoyConnectCore.f22260ab = true;
                } catch (TapjoyIntegrationException e) {
                    TapjoyLog.m24274e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, e.getMessage()));
                    m24253d();
                    C9288fs.f22966b.notifyObservers(Boolean.FALSE);
                } catch (TapjoyException e2) {
                    TapjoyLog.m24274e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, e2.getMessage()));
                    m24253d();
                    C9288fs.f22966b.notifyObservers(Boolean.FALSE);
                }
            } else {
                throw new IllegalArgumentException("The given API key was not for Android.");
            }
        } catch (IllegalArgumentException e3) {
            throw new TapjoyIntegrationException(e3.getMessage());
        }
    }

    public static void requestLimitedTapjoyConnect(Context context, String str, TJConnectListener tJConnectListener) {
        try {
            C9281fo foVar = new C9281fo(str);
            if (foVar.f22948a == C9281fo.C9282a.SDK_ANDROID) {
                f22202aP = foVar.f22949b;
                f22203aQ = foVar.f22950c;
                if (f22240i == null) {
                    f22240i = new TapjoyConnectCore();
                }
                f22206aT = tJConnectListener;
                TapjoyConnectCore tapjoyConnectCore = f22240i;
                try {
                    m24245a(context);
                    new Thread(new Runnable() {
                        public final void run() {
                            TapjoyConnectCore.m24241a();
                            TapjoyConnectCore.this.completeLimitedConnectCall();
                        }
                    }).start();
                } catch (TapjoyIntegrationException e) {
                    TapjoyLog.m24274e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, e.getMessage()));
                    m24255e();
                    C9288fs.f22966b.notifyObservers(Boolean.FALSE);
                } catch (TapjoyException e2) {
                    TapjoyLog.m24274e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, e2.getMessage()));
                    m24255e();
                    C9288fs.f22966b.notifyObservers(Boolean.FALSE);
                }
                TapjoyLog.m24273d("TapjoyConnect", "requestTapjoyConnect function complete");
                return;
            }
            throw new IllegalArgumentException("The given API key was not for Android.");
        } catch (IllegalArgumentException e3) {
            TapjoyLog.m24273d("TapjoyConnect", e3.getMessage());
            throw new TapjoyIntegrationException(e3.getMessage());
        }
    }

    /* renamed from: d */
    private static void m24253d() {
        if (!C9465jq.m25449c(f22175N)) {
            C9344gz.m25060a().mo58240a(f22238g, f22239h, "12.4.2", TapjoyConfig.TJC_ANALYTICS_SERVICE_URL, f22175N, f22174M);
        }
        TJConnectListener tJConnectListener = f22242k;
        if (tJConnectListener != null) {
            tJConnectListener.onConnectFailure();
        }
    }

    /* renamed from: e */
    private static void m24255e() {
        TJConnectListener tJConnectListener = f22206aT;
        if (tJConnectListener != null) {
            tJConnectListener.onConnectFailure();
        }
    }

    public void appPause() {
        this.f22259Z = true;
    }

    public void appResume() {
        if (this.f22259Z) {
            m24267p();
            this.f22259Z = false;
        }
    }

    public static Map getURLParams() {
        Map genericURLParams = getGenericURLParams();
        genericURLParams.putAll(getTimeStampAndVerifierParams());
        return genericURLParams;
    }

    public static Map getLimitedURLParams() {
        Map limitedGenericURLParams = getLimitedGenericURLParams();
        limitedGenericURLParams.putAll(getLimitedTimeStampAndVerifierParams());
        return limitedGenericURLParams;
    }

    public static Map getGenericURLParams() {
        Map f = m24257f();
        TapjoyUtil.safePut(f, "app_id", f22253v, true);
        return f;
    }

    public static Map getLimitedGenericURLParams() {
        Map f = m24257f();
        TapjoyUtil.safePut(f, "app_id", f22202aP, true);
        TapjoyUtil.safePut(f, TapjoyConstants.TJC_APP_GROUP_ID, f22204aR, true);
        TapjoyUtil.safePut(f, TapjoyConstants.TJC_LIMITED, "true", true);
        return f;
    }

    /* renamed from: f */
    private static Map m24257f() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        TapjoyUtil.safePut(hashMap3, TapjoyConstants.TJC_PLUGIN, f22176O, true);
        TapjoyUtil.safePut(hashMap3, TapjoyConstants.TJC_SDK_TYPE, f22177P, true);
        TapjoyUtil.safePut(hashMap3, "app_id", f22253v, true);
        TapjoyUtil.safePut(hashMap3, TapjoyConstants.TJC_LIBRARY_VERSION, f22255x, true);
        TapjoyUtil.safePut(hashMap3, TapjoyConstants.TJC_LIBRARY_REVISION, TapjoyRevision.GIT_REVISION, true);
        TapjoyUtil.safePut(hashMap3, TapjoyConstants.TJC_BRIDGE_VERSION, f22256y, true);
        TapjoyUtil.safePut(hashMap3, TapjoyConstants.TJC_APP_VERSION_NAME, f22254w, true);
        hashMap2.putAll(hashMap3);
        HashMap hashMap4 = new HashMap();
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_DEVICE_NAME, f22249r, true);
        TapjoyUtil.safePut(hashMap4, "platform", f22166E, true);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, f22252u, true);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_DEVICE_MANUFACTURER, f22250s, true);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_DEVICE_TYPE_NAME, f22251t, true);
        StringBuilder sb = new StringBuilder();
        sb.append(f22163B);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_DEVICE_SCREEN_LAYOUT_SIZE, sb.toString(), true);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_STORE_NAME, f22173L, true);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_STORE_VIEW, String.valueOf(f22180S), true);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_CARRIER_NAME, f22167F, true);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_CARRIER_COUNTRY_CODE, f22168G, true);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_MOBILE_NETWORK_CODE, f22170I, true);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_MOBILE_COUNTRY_CODE, f22169H, true);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, Locale.getDefault().getCountry(), true);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_DEVICE_LANGUAGE, Locale.getDefault().getLanguage(), true);
        String connectionType = getConnectionType();
        f22171J = connectionType;
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_CONNECTION_TYPE, connectionType, true);
        String connectionSubType = getConnectionSubType();
        f22172K = connectionSubType;
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_CONNECTION_SUBTYPE, connectionSubType, true);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f22257z);
        TapjoyUtil.safePut(hashMap4, TapjoyConstants.TJC_DEVICE_SCREEN_DENSITY, sb2.toString(), true);
        hashMap2.putAll(hashMap4);
        HashMap hashMap5 = new HashMap();
        if (m24264m()) {
            TapjoyUtil.safePut(hashMap5, TapjoyConstants.TJC_ADVERTISING_ID, f22234c, true);
            TapjoyUtil.safePut(hashMap5, TapjoyConstants.TJC_AD_TRACKING_ENABLED, String.valueOf(f22235d), true);
        }
        if ((m24265n() && !m24264m()) || !m24266o()) {
            TapjoyUtil.safePut(hashMap5, "android_id", f22245n, true);
            TapjoyUtil.safePut(hashMap5, TapjoyConstants.TJC_DEVICE_MAC_ADDRESS, f22247p, true);
        }
        TapjoyUtil.safePut(hashMap5, TapjoyConstants.TJC_INSTALL_ID, f22248q, true);
        TapjoyUtil.safePut(hashMap5, TapjoyConstants.TJC_USER_ID, f22164C, true);
        TapjoyUtil.safePut(hashMap5, TapjoyConstants.TJC_ADVERTISING_ID_CHECK_DISABLED, f22236e, true);
        TapjoyUtil.safePut(hashMap5, TapjoyConstants.TJC_LEGACY_ID_FALLBACK_ALLOWED, f22237f, true);
        int i = f22186a;
        if (i != 0) {
            TapjoyUtil.safePut(hashMap5, TapjoyConstants.TJC_PACKAGED_GOOGLE_PLAY_SERVICES_VERSION, Integer.toString(i), true);
        }
        int i2 = f22233b;
        if (i2 != 0) {
            TapjoyUtil.safePut(hashMap5, TapjoyConstants.TJC_DEVICE_GOOGLE_PLAY_SERVICES_VERSION, Integer.toString(i2), true);
        }
        String str = f22246o;
        if (str == null || str.length() == 0 || System.currentTimeMillis() - f22208aa > TapjoyConstants.SESSION_ID_INACTIVITY_TIME) {
            f22246o = m24267p();
        } else {
            f22208aa = System.currentTimeMillis();
        }
        TapjoyUtil.safePut(hashMap5, "session_id", f22246o, true);
        hashMap2.putAll(hashMap5);
        HashMap hashMap6 = new HashMap();
        TapjoyUtil.safePut(hashMap6, TapjoyConstants.TJC_APP_GROUP_ID, f22181T, true);
        TapjoyUtil.safePut(hashMap6, "store", f22182U, true);
        TapjoyUtil.safePut(hashMap6, TapjoyConstants.TJC_ANALYTICS_API_KEY, f22183V, true);
        TapjoyUtil.safePut(hashMap6, TapjoyConstants.TJC_MANAGED_DEVICE_ID, f22184W, true);
        hashMap2.putAll(hashMap6);
        C9313ge a = C9313ge.m24951a();
        HashMap hashMap7 = new HashMap();
        if (a.f23032a != null) {
            TapjoyUtil.safePut(hashMap7, "gdpr", a.f23032a.booleanValue() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO, true);
        }
        if (!C9067al.m24297a(a.f23033b)) {
            TapjoyUtil.safePut(hashMap7, "cgdpr", a.f23033b, true);
        }
        hashMap2.putAll(hashMap7);
        if (!(TapjoyCache.getInstance() == null || TapjoyCache.getInstance().getCachedOfferIDs() == null || TapjoyCache.getInstance().getCachedOfferIDs().length() <= 0)) {
            TapjoyUtil.safePut(hashMap2, TapjoyConstants.TJC_CACHED_OFFERS, TapjoyCache.getInstance().getCachedOfferIDs(), true);
        }
        TapjoyUtil.safePut(hashMap2, TapjoyConstants.TJC_CURRENCY_MULTIPLIER, Float.toString(f22179R), true);
        hashMap.putAll(hashMap2);
        HashMap hashMap8 = new HashMap();
        m24259h();
        HashMap hashMap9 = new HashMap();
        TapjoyUtil.safePut(hashMap9, TapjoyConstants.TJC_ANALYTICS_ID, f22214ah, true);
        TapjoyUtil.safePut(hashMap9, TapjoyConstants.TJC_PACKAGE_ID, f22215ai, true);
        TapjoyUtil.safePut(hashMap9, TapjoyConstants.TJC_PACKAGE_SIGN, f22216aj, true);
        TapjoyUtil.safePut(hashMap9, TapjoyConstants.TJC_DEVICE_DISPLAY_DENSITY, f22196aJ);
        TapjoyUtil.safePut(hashMap9, TapjoyConstants.TJC_DEVICE_DISPLAY_WIDTH, f22197aK);
        TapjoyUtil.safePut(hashMap9, TapjoyConstants.TJC_DEVICE_DISPLAY_HEIGHT, f22198aL);
        TapjoyUtil.safePut(hashMap9, TapjoyConstants.TJC_DEVICE_COUNTRY_SIM, f22199aM, true);
        TapjoyUtil.safePut(hashMap9, TapjoyConstants.TJC_DEVICE_TIMEZONE, f22200aN, true);
        hashMap8.putAll(hashMap9);
        HashMap hashMap10 = new HashMap();
        TapjoyUtil.safePut(hashMap10, TapjoyConstants.TJC_PACKAGE_VERSION, f22217ak, true);
        TapjoyUtil.safePut(hashMap10, TapjoyConstants.TJC_PACKAGE_REVISION, f22218al);
        TapjoyUtil.safePut(hashMap10, TapjoyConstants.TJC_PACKAGE_DATA_VERSION, f22219am, true);
        TapjoyUtil.safePut(hashMap10, TapjoyConstants.TJC_INSTALLER, f22220an, true);
        if (C9465jq.m25449c(f22173L)) {
            TapjoyUtil.safePut(hashMap10, TapjoyConstants.TJC_STORE_NAME, f22201aO, true);
        }
        hashMap8.putAll(hashMap10);
        hashMap8.putAll(m24258g());
        hashMap.putAll(hashMap8);
        return hashMap;
    }

    public static Map getTimeStampAndVerifierParams() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String a = m24240a(currentTimeMillis);
        HashMap hashMap = new HashMap();
        TapjoyUtil.safePut(hashMap, "timestamp", String.valueOf(currentTimeMillis), true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_VERIFIER, a, true);
        return hashMap;
    }

    public static Map getLimitedTimeStampAndVerifierParams() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String b = m24249b(currentTimeMillis);
        HashMap hashMap = new HashMap();
        TapjoyUtil.safePut(hashMap, "timestamp", String.valueOf(currentTimeMillis), true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_VERIFIER, b, true);
        return hashMap;
    }

    /* renamed from: g */
    private static Map m24258g() {
        HashMap hashMap = new HashMap();
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_INSTALLED, f22221ao);
        TapjoyUtil.safePut(hashMap, "referrer", f22222ap, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_LEVEL, f22223aq);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_FRIEND_COUNT, f22224ar);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_VARIABLE_1, f22225as, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_VARIABLE_2, f22226at, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_VARIABLE_3, f22227au, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_VARIABLE_4, f22228av, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_VARIABLE_5, f22229aw, true);
        int i = 0;
        for (String safePut : f22230ax) {
            StringBuilder sb = new StringBuilder("user_tags[");
            int i2 = i + 1;
            sb.append(i);
            sb.append("]");
            TapjoyUtil.safePut(hashMap, sb.toString(), safePut, true);
            i = i2;
        }
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_WEEKLY_FREQUENCY, f22231ay);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_USER_MONTHLY_FREQUENCY, f22232az);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_SESSION_TOTAL_COUNT, f22187aA);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_SESSION_TOTAL_LENGTH, f22188aB);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_SESSION_LAST_AT, f22189aC);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_SESSION_LAST_LENGTH, f22190aD);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PURCHASE_CURRENCY, f22191aE, true);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PURCHASE_TOTAL_COUNT, f22192aF);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PURCHASE_TOTAL_PRICE, f22193aG);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PURCHASE_LAST_PRICE, f22194aH);
        TapjoyUtil.safePut(hashMap, TapjoyConstants.TJC_PURCHASE_LAST_AT, f22195aI);
        return hashMap;
    }

    /* renamed from: a */
    private static boolean m24245a(Context context) {
        WifiInfo connectionInfo;
        f22238g = context;
        f22210ad = context.getPackageManager();
        C9313ge.m24951a().mo58188a(context);
        C9300ga.m24929a().mo58171a(context);
        f22211ae = new TapjoyGpsHelper(f22238g);
        if (f22241j == null) {
            f22241j = new TapjoyURLConnection();
        }
        if (f22212af == null) {
            f22212af = new Hashtable();
        }
        m24261j();
        int identifier = f22238g.getResources().getIdentifier("raw/tapjoy_config", (String) null, f22238g.getPackageName());
        Properties properties = new Properties();
        try {
            properties.load(f22238g.getResources().openRawResource(identifier));
            m24243a(properties);
        } catch (Exception unused) {
        }
        if (C9465jq.m25449c(getConnectFlagValue("unit_test_mode"))) {
            m24262k();
        }
        String string = Settings.Secure.getString(f22238g.getContentResolver(), "android_id");
        f22245n = string;
        if (string != null) {
            f22245n = string.toLowerCase();
        }
        try {
            boolean z = false;
            f22254w = f22210ad.getPackageInfo(f22238g.getPackageName(), 0).versionName;
            f22251t = "android";
            f22166E = "android";
            f22249r = Build.MODEL;
            f22250s = Build.MANUFACTURER;
            f22252u = Build.VERSION.RELEASE;
            f22255x = "12.4.2";
            f22256y = TapjoyConstants.TJC_BRIDGE_VERSION_NUMBER;
            try {
                if (Build.VERSION.SDK_INT > 3) {
                    TapjoyDisplayMetricsUtil tapjoyDisplayMetricsUtil = new TapjoyDisplayMetricsUtil(f22238g);
                    f22257z = tapjoyDisplayMetricsUtil.getScreenDensityDPI();
                    f22162A = tapjoyDisplayMetricsUtil.getScreenDensityScale();
                    f22163B = tapjoyDisplayMetricsUtil.getScreenLayoutSize();
                }
            } catch (Exception e) {
                TapjoyLog.m24275e("TapjoyConnect", "Error getting screen density/dimensions/layout: " + e.toString());
            }
            if (m24256e("android.permission.ACCESS_WIFI_STATE")) {
                try {
                    WifiManager wifiManager = (WifiManager) f22238g.getSystemService(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI);
                    if (!(wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null)) {
                        String macAddress = connectionInfo.getMacAddress();
                        f22247p = macAddress;
                        if (macAddress != null) {
                            f22247p = macAddress.replace(CertificateUtil.DELIMITER, "").toLowerCase();
                        }
                    }
                } catch (Exception e2) {
                    TapjoyLog.m24275e("TapjoyConnect", "Error getting device mac address: " + e2.toString());
                }
            } else {
                TapjoyLog.m24273d("TapjoyConnect", "*** ignore macAddress");
            }
            TelephonyManager telephonyManager = (TelephonyManager) f22238g.getSystemService("phone");
            if (telephonyManager != null) {
                f22167F = telephonyManager.getNetworkOperatorName();
                f22168G = telephonyManager.getNetworkCountryIso();
                String networkOperator = telephonyManager.getNetworkOperator();
                if (networkOperator != null && (networkOperator.length() == 5 || networkOperator.length() == 6)) {
                    f22169H = networkOperator.substring(0, 3);
                    f22170I = networkOperator.substring(3);
                }
            }
            SharedPreferences sharedPreferences = f22238g.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
            String string2 = sharedPreferences.getString(TapjoyConstants.PREF_INSTALL_ID, "");
            f22248q = string2;
            if (string2 == null || string2.length() == 0) {
                try {
                    f22248q = TapjoyUtil.SHA256(UUID.randomUUID().toString() + System.currentTimeMillis());
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString(TapjoyConstants.PREF_INSTALL_ID, f22248q);
                    edit.apply();
                } catch (Exception e3) {
                    TapjoyLog.m24275e("TapjoyConnect", "Error generating install id: " + e3.toString());
                }
            }
            if (getConnectFlagValue(TapjoyConnectFlag.STORE_NAME) != null && getConnectFlagValue(TapjoyConnectFlag.STORE_NAME).length() > 0) {
                f22173L = getConnectFlagValue(TapjoyConnectFlag.STORE_NAME);
                if (!new ArrayList(Arrays.asList(TapjoyConnectFlag.STORE_ARRAY)).contains(f22173L)) {
                    TapjoyLog.m24278w("TapjoyConnect", "Warning -- undefined STORE_NAME: " + f22173L);
                }
            }
            try {
                String str = f22173L;
                Intent intent = new Intent("android.intent.action.VIEW");
                if (str.length() <= 0) {
                    intent.setData(Uri.parse("market://details"));
                    if (f22210ad.queryIntentActivities(intent, 0).size() > 0) {
                        z = true;
                    }
                }
                f22180S = z;
            } catch (Exception e4) {
                TapjoyLog.m24275e("TapjoyConnect", "Error trying to detect store intent on devicee: " + e4.toString());
            }
            m24259h();
            if (getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK) != null && getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK).length() > 0) {
                f22237f = getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK);
            }
            if (getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK) != null && getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK).length() > 0) {
                f22236e = getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK);
            }
            if (getConnectFlagValue(TapjoyConnectFlag.USER_ID) != null && getConnectFlagValue(TapjoyConnectFlag.USER_ID).length() > 0) {
                TapjoyLog.m24276i("TapjoyConnect", "Setting userID to: " + getConnectFlagValue(TapjoyConnectFlag.USER_ID));
                setUserID(getConnectFlagValue(TapjoyConnectFlag.USER_ID), (TJSetUserIDListener) null);
            }
            f22178Q = TapjoyUtil.getRedirectDomain(getConnectFlagValue(TapjoyConnectFlag.SERVICE_URL));
            if (f22212af != null) {
                m24260i();
            }
            return true;
        } catch (PackageManager.NameNotFoundException e5) {
            throw new TapjoyException(e5.getMessage());
        }
    }

    /* renamed from: h */
    private static void m24259h() {
        C9250fb a = C9344gz.m25061a(f22238g).mo58239a(true);
        C9247fa faVar = a.f22800d;
        f22214ah = faVar.f22764h;
        f22215ai = faVar.f22774r;
        f22216aj = faVar.f22775s;
        f22196aJ = faVar.f22769m;
        f22197aK = faVar.f22770n;
        f22198aL = faVar.f22771o;
        f22199aM = faVar.f22777u;
        f22200aN = faVar.f22773q;
        C9229eu euVar = a.f22801e;
        f22217ak = euVar.f22662e;
        f22218al = euVar.f22663f;
        f22219am = euVar.f22664g;
        f22220an = euVar.f22665h;
        f22201aO = euVar.f22666i;
        C9268fh fhVar = a.f22802f;
        f22221ao = fhVar.f22895s;
        f22222ap = fhVar.f22896t;
        f22223aq = fhVar.f22886J;
        f22224ar = fhVar.f22887K;
        f22225as = fhVar.f22888L;
        f22226at = fhVar.f22889M;
        f22227au = fhVar.f22890N;
        f22228av = fhVar.f22891O;
        f22229aw = fhVar.f22892P;
        f22230ax = new HashSet(fhVar.f22893Q);
        f22231ay = fhVar.f22897u;
        f22232az = fhVar.f22898v;
        f22187aA = fhVar.f22900x;
        f22188aB = fhVar.f22901y;
        f22189aC = fhVar.f22902z;
        f22190aD = fhVar.f22877A;
        f22191aE = fhVar.f22878B;
        f22192aF = fhVar.f22879C;
        f22193aG = fhVar.f22880D;
        f22194aH = fhVar.f22882F;
        f22195aI = fhVar.f22881E;
    }

    /* renamed from: i */
    private static void m24260i() {
        TapjoyLog.m24276i("TapjoyConnect", "Connect Flags:");
        TapjoyLog.m24276i("TapjoyConnect", "--------------------");
        for (Map.Entry entry : f22212af.entrySet()) {
            TapjoyLog.m24276i("TapjoyConnect", "key: " + ((String) entry.getKey()) + ", value: " + Uri.encode(entry.getValue().toString()));
        }
        TapjoyLog.m24276i("TapjoyConnect", "hostURL: [" + getConnectFlagValue(TapjoyConnectFlag.SERVICE_URL) + "]");
        TapjoyLog.m24276i("TapjoyConnect", "redirectDomain: [" + f22178Q + "]");
        TapjoyLog.m24276i("TapjoyConnect", "--------------------");
    }

    /* renamed from: j */
    private static void m24261j() {
        try {
            if (f22210ad != null) {
                ApplicationInfo applicationInfo = f22210ad.getApplicationInfo(f22238g.getPackageName(), 128);
                if (applicationInfo == null || applicationInfo.metaData == null) {
                    TapjoyLog.m24273d("TapjoyConnect", "No metadata present.");
                    return;
                }
                for (String str : TapjoyConnectFlag.FLAG_ARRAY) {
                    String string = applicationInfo.metaData.getString("tapjoy." + str);
                    if (string != null) {
                        TapjoyLog.m24273d("TapjoyConnect", "Found manifest flag: " + str + ", " + string);
                        m24242a(str, string);
                    }
                }
                TapjoyLog.m24273d("TapjoyConnect", "Metadata successfully loaded");
            }
        } catch (Exception e) {
            TapjoyLog.m24274e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Error reading manifest meta-data -- " + e.toString()));
        }
    }

    /* renamed from: a */
    private static void m24243a(Properties properties) {
        Enumeration keys = properties.keys();
        while (keys.hasMoreElements()) {
            try {
                String str = (String) keys.nextElement();
                m24242a(str, (String) properties.get(str));
            } catch (ClassCastException unused) {
                TapjoyLog.m24275e("TapjoyConnect", "Error parsing configuration properties in tapjoy_config.txt");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0135, code lost:
        throw new com.tapjoy.TapjoyIntegrationException("[ClassNotFoundException] Could not find dependency class " + ((java.lang.String) f22244m.get(r4)));
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x011a */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m24262k() {
        /*
            android.content.pm.PackageManager r0 = f22210ad     // Catch:{ Exception -> 0x01d9 }
            android.content.Context r1 = f22238g     // Catch:{ Exception -> 0x01d9 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Exception -> 0x01d9 }
            r2 = 1
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch:{ Exception -> 0x01d9 }
            android.content.pm.ActivityInfo[] r0 = r0.activities     // Catch:{ Exception -> 0x01d9 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ Exception -> 0x01d9 }
            java.lang.String r1 = "TapjoyConnect"
            if (r0 == 0) goto L_0x0136
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x01d9 }
        L_0x001b:
            boolean r3 = r0.hasNext()     // Catch:{ Exception -> 0x01d9 }
            if (r3 == 0) goto L_0x0136
            java.lang.Object r3 = r0.next()     // Catch:{ Exception -> 0x01d9 }
            android.content.pm.ActivityInfo r3 = (android.content.pm.ActivityInfo) r3     // Catch:{ Exception -> 0x01d9 }
            java.util.Vector r4 = f22244m     // Catch:{ Exception -> 0x01d9 }
            java.lang.String r5 = r3.name     // Catch:{ Exception -> 0x01d9 }
            boolean r4 = r4.contains(r5)     // Catch:{ Exception -> 0x01d9 }
            if (r4 == 0) goto L_0x001b
            java.util.Vector r4 = f22244m     // Catch:{ Exception -> 0x01d9 }
            java.lang.String r5 = r3.name     // Catch:{ Exception -> 0x01d9 }
            int r4 = r4.indexOf(r5)     // Catch:{ Exception -> 0x01d9 }
            java.util.Vector r5 = f22244m     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x011a }
            java.util.Vector r5 = new java.util.Vector     // Catch:{ ClassNotFoundException -> 0x011a }
            r5.<init>()     // Catch:{ ClassNotFoundException -> 0x011a }
            int r6 = r3.configChanges     // Catch:{ ClassNotFoundException -> 0x011a }
            r7 = 128(0x80, float:1.794E-43)
            r6 = r6 & r7
            if (r6 == r7) goto L_0x0055
            java.lang.String r6 = "orientation"
            r5.add(r6)     // Catch:{ ClassNotFoundException -> 0x011a }
        L_0x0055:
            int r6 = r3.configChanges     // Catch:{ ClassNotFoundException -> 0x011a }
            r7 = 32
            r6 = r6 & r7
            if (r6 == r7) goto L_0x0061
            java.lang.String r6 = "keyboardHidden"
            r5.add(r6)     // Catch:{ ClassNotFoundException -> 0x011a }
        L_0x0061:
            int r6 = r5.size()     // Catch:{ ClassNotFoundException -> 0x011a }
            if (r6 == 0) goto L_0x00b9
            int r0 = r5.size()     // Catch:{ ClassNotFoundException -> 0x011a }
            if (r0 != r2) goto L_0x0093
            com.tapjoy.TapjoyIntegrationException r0 = new com.tapjoy.TapjoyIntegrationException     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x011a }
            r1.<init>()     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.String r2 = r5.toString()     // Catch:{ ClassNotFoundException -> 0x011a }
            r1.append(r2)     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.String r2 = " property is not specified in manifest configChanges for "
            r1.append(r2)     // Catch:{ ClassNotFoundException -> 0x011a }
            java.util.Vector r2 = f22244m     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ ClassNotFoundException -> 0x011a }
            r1.append(r2)     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.String r1 = r1.toString()     // Catch:{ ClassNotFoundException -> 0x011a }
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x011a }
            throw r0     // Catch:{ ClassNotFoundException -> 0x011a }
        L_0x0093:
            com.tapjoy.TapjoyIntegrationException r0 = new com.tapjoy.TapjoyIntegrationException     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x011a }
            r1.<init>()     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.String r2 = r5.toString()     // Catch:{ ClassNotFoundException -> 0x011a }
            r1.append(r2)     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.String r2 = " properties are not specified in manifest configChanges for "
            r1.append(r2)     // Catch:{ ClassNotFoundException -> 0x011a }
            java.util.Vector r2 = f22244m     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ ClassNotFoundException -> 0x011a }
            r1.append(r2)     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.String r1 = r1.toString()     // Catch:{ ClassNotFoundException -> 0x011a }
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x011a }
            throw r0     // Catch:{ ClassNotFoundException -> 0x011a }
        L_0x00b9:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ ClassNotFoundException -> 0x011a }
            r6 = 13
            if (r5 < r6) goto L_0x00df
            int r5 = r3.configChanges     // Catch:{ ClassNotFoundException -> 0x011a }
            r6 = 1024(0x400, float:1.435E-42)
            r5 = r5 & r6
            if (r5 == r6) goto L_0x00df
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.String r6 = "WARNING -- screenSize property is not specified in manifest configChanges for "
            r5.<init>(r6)     // Catch:{ ClassNotFoundException -> 0x011a }
            java.util.Vector r6 = f22244m     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.Object r6 = r6.get(r4)     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ ClassNotFoundException -> 0x011a }
            r5.append(r6)     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.String r5 = r5.toString()     // Catch:{ ClassNotFoundException -> 0x011a }
            com.tapjoy.TapjoyLog.m24278w(r1, r5)     // Catch:{ ClassNotFoundException -> 0x011a }
        L_0x00df:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ ClassNotFoundException -> 0x011a }
            r6 = 11
            if (r5 < r6) goto L_0x0113
            java.lang.String r5 = r3.name     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.String r6 = "com.tapjoy.TJAdUnitActivity"
            boolean r5 = r5.equals(r6)     // Catch:{ ClassNotFoundException -> 0x011a }
            if (r5 == 0) goto L_0x0113
            int r3 = r3.flags     // Catch:{ ClassNotFoundException -> 0x011a }
            r5 = 512(0x200, float:7.175E-43)
            r3 = r3 & r5
            if (r3 != r5) goto L_0x00f7
            goto L_0x0113
        L_0x00f7:
            com.tapjoy.TapjoyIntegrationException r0 = new com.tapjoy.TapjoyIntegrationException     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.String r2 = "'hardwareAccelerated' property not specified in manifest for "
            r1.<init>(r2)     // Catch:{ ClassNotFoundException -> 0x011a }
            java.util.Vector r2 = f22244m     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ ClassNotFoundException -> 0x011a }
            r1.append(r2)     // Catch:{ ClassNotFoundException -> 0x011a }
            java.lang.String r1 = r1.toString()     // Catch:{ ClassNotFoundException -> 0x011a }
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x011a }
            throw r0     // Catch:{ ClassNotFoundException -> 0x011a }
        L_0x0113:
            java.util.Vector r3 = f22244m     // Catch:{ ClassNotFoundException -> 0x011a }
            r3.remove(r4)     // Catch:{ ClassNotFoundException -> 0x011a }
            goto L_0x001b
        L_0x011a:
            com.tapjoy.TapjoyIntegrationException r0 = new com.tapjoy.TapjoyIntegrationException     // Catch:{ Exception -> 0x01d9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01d9 }
            java.lang.String r2 = "[ClassNotFoundException] Could not find dependency class "
            r1.<init>(r2)     // Catch:{ Exception -> 0x01d9 }
            java.util.Vector r2 = f22244m     // Catch:{ Exception -> 0x01d9 }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x01d9 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x01d9 }
            r1.append(r2)     // Catch:{ Exception -> 0x01d9 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01d9 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x01d9 }
            throw r0     // Catch:{ Exception -> 0x01d9 }
        L_0x0136:
            java.util.Vector r0 = f22244m
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0194
            java.util.Vector r0 = f22244m
            int r0 = r0.size()
            java.lang.String r1 = "Missing "
            if (r0 != r2) goto L_0x016e
            com.tapjoy.TapjoyIntegrationException r0 = new com.tapjoy.TapjoyIntegrationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.util.Vector r1 = f22244m
            int r1 = r1.size()
            r2.append(r1)
            java.lang.String r1 = " dependency class in manifest: "
            r2.append(r1)
            java.util.Vector r1 = f22244m
            java.lang.String r1 = r1.toString()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x016e:
            com.tapjoy.TapjoyIntegrationException r0 = new com.tapjoy.TapjoyIntegrationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.util.Vector r1 = f22244m
            int r1 = r1.size()
            r2.append(r1)
            java.lang.String r1 = " dependency classes in manifest: "
            r2.append(r1)
            java.util.Vector r1 = f22244m
            java.lang.String r1 = r1.toString()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0194:
            m24263l()
            java.lang.String r0 = "com.tapjoy.TJAdUnitJSBridge"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x01d1 }
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x01c9 }
            r3 = 0
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            r2[r3] = r4     // Catch:{ NoSuchMethodException -> 0x01c9 }
            java.lang.String r3 = "closeRequested"
            r0.getMethod(r3, r2)     // Catch:{ NoSuchMethodException -> 0x01c9 }
            java.lang.String r0 = "TJC_OPTION_DISABLE_ADVERTISING_ID_CHECK"
            java.lang.String r2 = getConnectFlagValue(r0)
            if (r2 == 0) goto L_0x01c3
            java.lang.String r0 = getConnectFlagValue(r0)
            java.lang.String r2 = "true"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01c3
            java.lang.String r0 = "Skipping integration check for Google Play Services and Advertising ID. Do this only if you do not have access to Google Play Services."
            com.tapjoy.TapjoyLog.m24276i(r1, r0)
            return
        L_0x01c3:
            com.tapjoy.TapjoyGpsHelper r0 = f22211ae
            r0.checkGooglePlayIntegration()
            return
        L_0x01c9:
            com.tapjoy.TapjoyIntegrationException r0 = new com.tapjoy.TapjoyIntegrationException
            java.lang.String r1 = "Try configuring Proguard or other code obfuscators to ignore com.tapjoy classes. Visit http://dev.tapjoy.comfor more information."
            r0.<init>(r1)
            throw r0
        L_0x01d1:
            com.tapjoy.TapjoyIntegrationException r0 = new com.tapjoy.TapjoyIntegrationException
            java.lang.String r1 = "ClassNotFoundException: com.tapjoy.TJAdUnitJSBridge was not found."
            r0.<init>(r1)
            throw r0
        L_0x01d9:
            com.tapjoy.TapjoyIntegrationException r0 = new com.tapjoy.TapjoyIntegrationException
            java.lang.String r1 = "Error while getting package info."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TapjoyConnectCore.m24262k():void");
    }

    /* renamed from: l */
    private static void m24263l() {
        Vector vector = new Vector();
        for (String str : TapjoyConstants.dependencyPermissions) {
            if (!m24256e(str)) {
                vector.add(str);
            }
        }
        if (vector.size() == 0) {
            Vector vector2 = new Vector();
            for (String str2 : TapjoyConstants.optionalPermissions) {
                if (!m24256e(str2)) {
                    vector2.add(str2);
                }
            }
            if (vector2.size() == 0) {
                return;
            }
            if (vector2.size() == 1) {
                TapjoyLog.m24278w("TapjoyConnect", "WARNING -- " + vector2.toString() + " permission was not found in manifest. The exclusion of this permission could cause problems.");
                return;
            }
            TapjoyLog.m24278w("TapjoyConnect", "WARNING -- " + vector2.toString() + " permissions were not found in manifest. The exclusion of these permissions could cause problems.");
        } else if (vector.size() == 1) {
            throw new TapjoyIntegrationException("Missing 1 permission in manifest: " + vector.toString());
        } else {
            throw new TapjoyIntegrationException("Missing " + vector.size() + " permissions in manifest: " + vector.toString());
        }
    }

    /* renamed from: m */
    private static boolean m24264m() {
        String str = f22234c;
        return str != null && str.length() > 0;
    }

    /* renamed from: n */
    private static boolean m24265n() {
        return getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK) != null && getConnectFlagValue(TapjoyConnectFlag.ALLOW_LEGACY_ID_FALLBACK).equals("true");
    }

    /* renamed from: o */
    private static boolean m24266o() {
        return (f22211ae.isGooglePlayServicesAvailable() && f22211ae.isGooglePlayManifestConfigured()) || getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK) == null || !getConnectFlagValue(TapjoyConnectFlag.DISABLE_ADVERTISING_ID_CHECK).equals("true");
    }

    /* renamed from: a */
    private static boolean m24247a(String str, boolean z) {
        C9101bn bnVar;
        C9101bn bnVar2;
        long j;
        try {
            C9101bn b = C9101bn.m24359b(str);
            try {
                Map d = b.mo57860d();
                String a = C9465jq.m25447a((String) d.get(TapjoyConstants.TJC_APP_GROUP_ID));
                String a2 = C9465jq.m25447a((String) d.get("store"));
                String a3 = C9465jq.m25447a((String) d.get(TapjoyConstants.TJC_ANALYTICS_API_KEY));
                String a4 = C9465jq.m25447a((String) d.get(TapjoyConstants.TJC_MANAGED_DEVICE_ID));
                Object obj = d.get("cache_max_age");
                C9281fo foVar = new C9281fo(a3);
                if (foVar.f22948a == C9281fo.C9282a.RPC_ANALYTICS) {
                    String a5 = C9281fo.m24890a(foVar.f22949b);
                    String str2 = foVar.f22950c;
                    if (a == null) {
                        a = a5;
                    }
                    Object obj2 = obj;
                    C9344gz.m25060a().mo58240a(f22238g, a3, "12.4.2", TapjoyConfig.TJC_ANALYTICS_SERVICE_URL, a5, str2);
                    f22181T = a;
                    f22182U = a2;
                    f22183V = a3;
                    f22184W = a4;
                    b.close();
                    if (!z) {
                        if (obj2 instanceof String) {
                            try {
                                j = Long.parseLong(((String) obj2).trim());
                            } catch (NumberFormatException unused) {
                            }
                        } else {
                            if (obj2 instanceof Number) {
                                j = ((Number) obj2).longValue();
                            }
                            j = 0;
                        }
                        if (j <= 0) {
                            TapjoyAppSettings.getInstance().removeConnectResult();
                        } else {
                            TapjoyAppSettings.getInstance().saveConnectResultAndParams(str, m24269r(), (j * 1000) + C9503v.m25545b());
                        }
                        C9300ga a6 = C9300ga.m24929a();
                        Object obj3 = d.get(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS);
                        if (obj3 instanceof Map) {
                            try {
                                a6.f22996a.mo58160a((Map) obj3);
                                a6.mo58172c().edit().putString(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS, C9092bh.m24336a(obj3)).apply();
                            } catch (Exception unused2) {
                            }
                        } else if (obj3 == null) {
                            a6.f22996a.mo58160a((Map) null);
                            a6.mo58172c().edit().remove(TapjoyConstants.PREF_SERVER_PROVIDED_CONFIGURATIONS).apply();
                        }
                    }
                    C9476jz.m25460a((Closeable) null);
                    return true;
                }
                throw new IOException("Invalid analytics_api_key");
            } catch (IOException e) {
                e = e;
                bnVar2 = b;
                TapjoyLog.m24277v("TapjoyConnect", e.getMessage());
                C9476jz.m25460a(bnVar);
                return false;
            } catch (RuntimeException e2) {
                e = e2;
                bnVar = b;
                TapjoyLog.m24277v("TapjoyConnect", e.getMessage());
                C9476jz.m25460a(bnVar);
                return false;
            } catch (Throwable th) {
                th = th;
                bnVar = b;
                C9476jz.m25460a(bnVar);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            bnVar2 = null;
            TapjoyLog.m24277v("TapjoyConnect", e.getMessage());
            C9476jz.m25460a(bnVar);
            return false;
        } catch (RuntimeException e4) {
            e = e4;
            bnVar = null;
            TapjoyLog.m24277v("TapjoyConnect", e.getMessage());
            C9476jz.m25460a(bnVar);
            return false;
        } catch (Throwable th2) {
            th = th2;
            C9476jz.m25460a(bnVar);
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: com.tapjoy.internal.bn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r9v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: type inference failed for: r9v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m24252c(java.lang.String r9) {
        /*
            java.lang.String r0 = "TapjoyConnect"
            r1 = 0
            com.tapjoy.internal.bn r9 = com.tapjoy.internal.C9101bn.m24359b(r9)     // Catch:{ IOException -> 0x007a, RuntimeException -> 0x006e, all -> 0x006c }
            java.util.Map r2 = r9.mo57860d()     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            java.lang.String r3 = "app_group_id"
            java.lang.Object r3 = r2.get(r3)     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            java.lang.String r3 = com.tapjoy.internal.C9465jq.m25447a(r3)     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            java.lang.String r4 = "store"
            java.lang.Object r4 = r2.get(r4)     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            java.lang.String r4 = com.tapjoy.internal.C9465jq.m25447a(r4)     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            java.lang.String r5 = "analytics_api_key"
            java.lang.Object r5 = r2.get(r5)     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            java.lang.String r5 = com.tapjoy.internal.C9465jq.m25447a(r5)     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            java.lang.String r6 = "managed_device_id"
            java.lang.Object r2 = r2.get(r6)     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            java.lang.String r2 = com.tapjoy.internal.C9465jq.m25447a(r2)     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            com.tapjoy.internal.fo r6 = new com.tapjoy.internal.fo     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            com.tapjoy.internal.fo$a r5 = r6.f22948a     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            com.tapjoy.internal.fo$a r7 = com.tapjoy.internal.C9281fo.C9282a.RPC_ANALYTICS     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            if (r5 != r7) goto L_0x005d
            java.lang.String r5 = r6.f22949b     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            java.lang.String r5 = com.tapjoy.internal.C9281fo.m24890a(r5)     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            if (r3 != 0) goto L_0x004f
            r3 = r5
        L_0x004f:
            f22204aR = r3     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            f22182U = r4     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            f22184W = r2     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            r9.close()     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            com.tapjoy.internal.C9476jz.m25460a(r1)
            r9 = 1
            return r9
        L_0x005d:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            java.lang.String r2 = "Invalid analytics_api_key"
            r1.<init>(r2)     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
            throw r1     // Catch:{ IOException -> 0x006a, RuntimeException -> 0x0068 }
        L_0x0065:
            r0 = move-exception
            r1 = r9
            goto L_0x008a
        L_0x0068:
            r1 = move-exception
            goto L_0x0072
        L_0x006a:
            r1 = move-exception
            goto L_0x007e
        L_0x006c:
            r0 = move-exception
            goto L_0x008a
        L_0x006e:
            r9 = move-exception
            r8 = r1
            r1 = r9
            r9 = r8
        L_0x0072:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0065 }
            com.tapjoy.TapjoyLog.m24277v(r0, r1)     // Catch:{ all -> 0x0065 }
            goto L_0x0085
        L_0x007a:
            r9 = move-exception
            r8 = r1
            r1 = r9
            r9 = r8
        L_0x007e:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0065 }
            com.tapjoy.TapjoyLog.m24277v(r0, r1)     // Catch:{ all -> 0x0065 }
        L_0x0085:
            com.tapjoy.internal.C9476jz.m25460a(r9)
            r9 = 0
            return r9
        L_0x008a:
            com.tapjoy.internal.C9476jz.m25460a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TapjoyConnectCore.m24252c(java.lang.String):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: com.tapjoy.internal.bn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m24254d(java.lang.String r4) {
        /*
            java.lang.String r0 = "TapjoyConnect"
            r1 = 0
            com.tapjoy.internal.bn r4 = com.tapjoy.internal.C9101bn.m24359b(r4)     // Catch:{ IOException -> 0x0039, RuntimeException -> 0x002d, all -> 0x002b }
            boolean r2 = r4.mo57856a()     // Catch:{ IOException -> 0x0029, RuntimeException -> 0x0027 }
            if (r2 == 0) goto L_0x001d
            r4.mo57879s()     // Catch:{ IOException -> 0x0029, RuntimeException -> 0x0027 }
            java.lang.String r2 = "Successfully sent completed Pay-Per-Action to Tapjoy server."
            com.tapjoy.TapjoyLog.m24273d(r0, r2)     // Catch:{ IOException -> 0x0029, RuntimeException -> 0x0027 }
            r4.close()     // Catch:{ IOException -> 0x0029, RuntimeException -> 0x0027 }
            com.tapjoy.internal.C9476jz.m25460a(r1)
            r4 = 1
            return r4
        L_0x001d:
            r4.close()     // Catch:{ IOException -> 0x0029, RuntimeException -> 0x0027 }
            com.tapjoy.internal.C9476jz.m25460a(r1)
            goto L_0x0047
        L_0x0024:
            r0 = move-exception
            r1 = r4
            goto L_0x0055
        L_0x0027:
            r1 = move-exception
            goto L_0x0031
        L_0x0029:
            r1 = move-exception
            goto L_0x003d
        L_0x002b:
            r0 = move-exception
            goto L_0x0055
        L_0x002d:
            r4 = move-exception
            r3 = r1
            r1 = r4
            r4 = r3
        L_0x0031:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0024 }
            com.tapjoy.TapjoyLog.m24277v(r0, r1)     // Catch:{ all -> 0x0024 }
            goto L_0x0044
        L_0x0039:
            r4 = move-exception
            r3 = r1
            r1 = r4
            r4 = r3
        L_0x003d:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0024 }
            com.tapjoy.TapjoyLog.m24277v(r0, r1)     // Catch:{ all -> 0x0024 }
        L_0x0044:
            com.tapjoy.internal.C9476jz.m25460a(r4)
        L_0x0047:
            com.tapjoy.TapjoyErrorMessage r4 = new com.tapjoy.TapjoyErrorMessage
            com.tapjoy.TapjoyErrorMessage$ErrorType r1 = com.tapjoy.TapjoyErrorMessage.ErrorType.SDK_ERROR
            java.lang.String r2 = "Completed Pay-Per-Action call failed."
            r4.<init>(r1, r2)
            com.tapjoy.TapjoyLog.m24274e((java.lang.String) r0, (com.tapjoy.TapjoyErrorMessage) r4)
            r4 = 0
            return r4
        L_0x0055:
            com.tapjoy.internal.C9476jz.m25460a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TapjoyConnectCore.m24254d(java.lang.String):boolean");
    }

    public void release() {
        f22240i = null;
        f22241j = null;
        TapjoyLog.m24273d("TapjoyConnect", "Releasing core static instance.");
    }

    public static String getAppID() {
        return f22253v;
    }

    public static String getLimitedAppID() {
        return f22202aP;
    }

    public static String getUserID() {
        return f22164C;
    }

    public static String getHostURL() {
        return getConnectFlagValue(TapjoyConnectFlag.SERVICE_URL);
    }

    public static String getPlacementURL() {
        return getConnectFlagValue(TapjoyConnectFlag.PLACEMENT_URL);
    }

    public static String getRedirectDomain() {
        return f22178Q;
    }

    public static String getCarrierName() {
        return f22167F;
    }

    public static String getConnectionType() {
        String str = "";
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) f22238g.getSystemService("connectivity");
            if (!(connectivityManager == null || connectivityManager.getActiveNetworkInfo() == null)) {
                int type = connectivityManager.getActiveNetworkInfo().getType();
                str = (type == 1 || type == 6) ? TapjoyConstants.TJC_CONNECTION_TYPE_WIFI : TapjoyConstants.TJC_CONNECTION_TYPE_MOBILE;
                TapjoyLog.m24273d("TapjoyConnect", "connectivity: " + connectivityManager.getActiveNetworkInfo().getType());
                TapjoyLog.m24273d("TapjoyConnect", "connection_type: " + str);
            }
        } catch (Exception e) {
            TapjoyLog.m24275e("TapjoyConnect", "getConnectionType error: " + e.toString());
        }
        return str;
    }

    public static String getConnectionSubType() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) f22238g.getSystemService("connectivity");
            if (connectivityManager == null) {
                return "";
            }
            String subtypeName = connectivityManager.getActiveNetworkInfo().getSubtypeName();
            TapjoyLog.m24273d("TapjoyConnect", "connection_sub_type: " + subtypeName);
            return subtypeName;
        } catch (Exception e) {
            TapjoyLog.m24275e("TapjoyConnect", "getConnectionSubType error: " + e.toString());
            return "";
        }
    }

    /* renamed from: p */
    private static String m24267p() {
        TapjoyLog.m24276i("TapjoyConnect", "generating sessionID...");
        String str = null;
        try {
            str = TapjoyUtil.SHA256((System.currentTimeMillis() / 1000) + f22253v);
            f22208aa = System.currentTimeMillis();
            return str;
        } catch (Exception e) {
            TapjoyLog.m24275e("TapjoyConnect", "unable to generate session id: " + e.toString());
            return str;
        }
    }

    public static Context getContext() {
        return f22238g;
    }

    /* renamed from: q */
    private static String m24268q() {
        if (m24264m()) {
            return f22234c;
        }
        if (m24265n() || !m24266o()) {
            String str = f22247p;
            boolean z = true;
            if (str != null && str.length() > 0) {
                return f22247p;
            }
            String str2 = f22245n;
            if (str2 == null || str2.length() <= 0) {
                z = false;
            }
            if (z) {
                return f22245n;
            }
        }
        TapjoyLog.m24275e("TapjoyConnect", "Error -- no valid device identifier");
        return null;
    }

    /* renamed from: a */
    private static String m24240a(long j) {
        try {
            return TapjoyUtil.SHA256(f22253v + CertificateUtil.DELIMITER + m24268q() + CertificateUtil.DELIMITER + j + CertificateUtil.DELIMITER + f22174M);
        } catch (Exception e) {
            TapjoyErrorMessage.ErrorType errorType = TapjoyErrorMessage.ErrorType.SDK_ERROR;
            TapjoyLog.m24274e("TapjoyConnect", new TapjoyErrorMessage(errorType, "Error in computing verifier value -- " + e.toString()));
            return "";
        }
    }

    /* renamed from: b */
    private static String m24249b(long j) {
        try {
            return TapjoyUtil.SHA256(f22202aP + CertificateUtil.DELIMITER + m24268q() + CertificateUtil.DELIMITER + j + CertificateUtil.DELIMITER + f22203aQ);
        } catch (Exception e) {
            TapjoyErrorMessage.ErrorType errorType = TapjoyErrorMessage.ErrorType.SDK_ERROR;
            TapjoyLog.m24274e("TapjoyConnect", new TapjoyErrorMessage(errorType, "Error in computing verifier value -- " + e.toString()));
            return "";
        }
    }

    public static String getAwardCurrencyVerifier(long j, int i, String str) {
        try {
            return TapjoyUtil.SHA256(f22253v + CertificateUtil.DELIMITER + m24268q() + CertificateUtil.DELIMITER + j + CertificateUtil.DELIMITER + f22174M + CertificateUtil.DELIMITER + i + CertificateUtil.DELIMITER + str);
        } catch (Exception e) {
            TapjoyErrorMessage.ErrorType errorType = TapjoyErrorMessage.ErrorType.SDK_ERROR;
            TapjoyLog.m24274e("TapjoyConnect", new TapjoyErrorMessage(errorType, "Error in computing awardCurrencyVerifier -- " + e.toString()));
            return "";
        }
    }

    public boolean isInitialized() {
        return this.f22260ab;
    }

    public static void setPlugin(String str) {
        f22176O = str;
    }

    public static void setSDKType(String str) {
        f22177P = str;
    }

    public static void setUserID(String str, TJSetUserIDListener tJSetUserIDListener) {
        f22164C = str;
        f22243l = tJSetUserIDListener;
        TapjoyLog.m24273d("TapjoyConnect", "URL parameters: " + getURLParams());
        new Thread(new Runnable() {
            public final void run() {
                TapjoyLog.m24276i("TapjoyConnect", "Setting userID to " + TapjoyConnectCore.f22164C);
                TapjoyURLConnection c = TapjoyConnectCore.f22241j;
                TapjoyHttpURLResponse responseFromURL = c.getResponseFromURL(TapjoyConnectCore.getHostURL() + TapjoyConstants.TJC_USER_ID_URL_PATH, TapjoyConnectCore.getURLParams());
                TapjoyConnectCore.m24244a(responseFromURL.response != null ? TapjoyConnectCore.m24246a(responseFromURL.response) : false);
            }
        }).start();
    }

    public static void viewDidClose(String str) {
        TapjoyLog.m24273d("TapjoyConnect", "viewDidClose: " + str);
        f22213ag.remove(str);
        C9288fs.f22969e.notifyObservers();
    }

    public static void viewWillOpen(String str, int i) {
        TapjoyLog.m24273d("TapjoyConnect", "viewWillOpen: " + str);
        f22213ag.put(str, Integer.valueOf(i));
    }

    public static boolean isViewOpen() {
        TapjoyLog.m24273d("TapjoyConnect", "isViewOpen: " + f22213ag.size());
        return !f22213ag.isEmpty();
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isFullScreenViewOpen() {
        /*
            java.util.Map r0 = f22213ag
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = 1
            if (r1 == r2) goto L_0x0021
            r3 = 2
            if (r1 == r3) goto L_0x0021
            goto L_0x000a
        L_0x0021:
            return r2
        L_0x0022:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TapjoyConnectCore.isFullScreenViewOpen():boolean");
    }

    public static void setViewShowing(boolean z) {
        if (z) {
            f22213ag.put("", 1);
        } else {
            f22213ag.clear();
        }
    }

    /* renamed from: a */
    private static void m24242a(String str, String str2) {
        if ((str.equals(TapjoyConnectFlag.SERVICE_URL) || str.equals(TapjoyConnectFlag.PLACEMENT_URL)) && !str2.endsWith("/")) {
            str2 = str2 + "/";
        }
        f22212af.put(str, str2);
    }

    /* renamed from: e */
    private static boolean m24256e(String str) {
        return f22210ad.checkPermission(str, f22238g.getPackageName()) == 0;
    }

    public void actionComplete(String str) {
        TapjoyLog.m24276i("TapjoyConnect", "actionComplete: " + str);
        Map f = m24257f();
        TapjoyUtil.safePut(f, "app_id", str, true);
        f.putAll(getTimeStampAndVerifierParams());
        TapjoyLog.m24273d("TapjoyConnect", "PPA URL parameters: " + f);
        new Thread(new PPAThread(f)).start();
    }

    public void completeConnectCall() {
        boolean z;
        String connectResult;
        TapjoyLog.m24273d("TapjoyConnect", "starting connect call...");
        String hostURL = getHostURL() != TapjoyConfig.TJC_SERVICE_URL ? getHostURL() : TapjoyConfig.TJC_CONNECT_SERVICE_URL;
        if (isConnected() || (connectResult = TapjoyAppSettings.getInstance().getConnectResult(m24269r(), C9503v.m25545b())) == null || !m24247a(connectResult, true)) {
            z = false;
        } else {
            TapjoyLog.m24276i("TapjoyConnect", "Connect using stored connect result");
            f22209ac = true;
            TJConnectListener tJConnectListener = f22242k;
            if (tJConnectListener != null) {
                tJConnectListener.onConnectSuccess();
            }
            C9288fs.f22965a.notifyObservers();
            z = true;
        }
        TapjoyURLConnection tapjoyURLConnection = f22241j;
        TapjoyHttpURLResponse responseFromURL = tapjoyURLConnection.getResponseFromURL(hostURL + TapjoyConstants.TJC_CONNECT_URL_PATH, (Map) null, (Map) null, getURLParams());
        if (responseFromURL == null || responseFromURL.statusCode != 200) {
            if (!z) {
                m24253d();
            }
            C9288fs.f22966b.notifyObservers(Boolean.FALSE);
        } else if (m24247a(responseFromURL.response, false)) {
            TapjoyLog.m24276i("TapjoyConnect", "Successfully connected to Tapjoy");
            f22209ac = true;
            for (Map.Entry entry : getGenericURLParams().entrySet()) {
                TapjoyLog.m24273d("TapjoyConnect", ((String) entry.getKey()) + ": " + ((String) entry.getValue()));
            }
            if (!z) {
                TJConnectListener tJConnectListener2 = f22242k;
                if (tJConnectListener2 != null) {
                    tJConnectListener2.onConnectSuccess();
                }
                C9288fs.f22965a.notifyObservers();
            }
            C9288fs.f22966b.notifyObservers(Boolean.TRUE);
        } else {
            if (!z) {
                m24253d();
            }
            C9288fs.f22966b.notifyObservers(Boolean.FALSE);
        }
    }

    public void completeLimitedConnectCall() {
        String hostURL = getHostURL() != TapjoyConfig.TJC_SERVICE_URL ? getHostURL() : TapjoyConfig.TJC_CONNECT_SERVICE_URL;
        Map limitedURLParams = getLimitedURLParams();
        TapjoyURLConnection tapjoyURLConnection = f22241j;
        TapjoyHttpURLResponse responseFromURL = tapjoyURLConnection.getResponseFromURL(hostURL + TapjoyConstants.TJC_CONNECT_URL_PATH, (Map) null, (Map) null, limitedURLParams);
        if (responseFromURL == null || responseFromURL.statusCode != 200) {
            m24255e();
            C9288fs.f22966b.notifyObservers(Boolean.FALSE);
        } else if (m24252c(responseFromURL.response)) {
            TapjoyLog.m24276i("TapjoyConnect", "Successfully connected to Tapjoy");
            f22205aS = true;
            for (Map.Entry entry : getLimitedGenericURLParams().entrySet()) {
                TapjoyLog.m24273d("TapjoyConnect", ((String) entry.getKey()) + ": " + ((String) entry.getValue()));
            }
            TJConnectListener tJConnectListener = f22206aT;
            if (tJConnectListener != null) {
                tJConnectListener.onConnectSuccess();
            }
            C9288fs.f22965a.notifyObservers();
            C9288fs.f22966b.notifyObservers(Boolean.TRUE);
        } else {
            m24255e();
            C9288fs.f22966b.notifyObservers(Boolean.FALSE);
        }
    }

    public class PPAThread implements Runnable {

        /* renamed from: b */
        private Map f22264b;

        public PPAThread(Map map) {
            this.f22264b = map;
        }

        public void run() {
            TapjoyURLConnection c = TapjoyConnectCore.f22241j;
            TapjoyHttpURLResponse responseFromURL = c.getResponseFromURL(TapjoyConnectCore.getHostURL() + TapjoyConstants.TJC_CONNECT_URL_PATH, (Map) null, (Map) null, this.f22264b);
            if (responseFromURL.response != null) {
                boolean unused = TapjoyConnectCore.m24254d(responseFromURL.response);
            }
        }
    }

    public void setCurrencyMultiplier(float f) {
        TapjoyLog.m24276i("TapjoyConnect", "setVirtualCurrencyMultiplier: " + f);
        f22179R = f;
    }

    public float getCurrencyMultiplier() {
        return f22179R;
    }

    public static String getConnectFlagValue(String str) {
        Hashtable hashtable = f22212af;
        return (hashtable == null || hashtable.get(str) == null) ? "" : f22212af.get(str).toString();
    }

    public static String getSecretKey() {
        return f22174M;
    }

    public static String getAndroidID() {
        return f22245n;
    }

    public static String getSha1MacAddress() {
        try {
            return TapjoyUtil.SHA1(f22247p);
        } catch (Exception e) {
            TapjoyLog.m24275e("TapjoyConnect", "Error generating sha1 of macAddress: " + e.toString());
            return null;
        }
    }

    public static String getMacAddress() {
        return f22247p;
    }

    public static float getDeviceScreenDensityScale() {
        return f22162A;
    }

    public static String getSupportURL(String str) {
        if (str == null) {
            str = f22253v;
        }
        return getHostURL() + "support_requests/new?currency_id=" + str + "&app_id=" + f22253v + "&udid=" + f22184W + "&language_code=" + Locale.getDefault().getLanguage();
    }

    public static String getUserToken() {
        if (C9465jq.m25449c(f22164C)) {
            return f22184W;
        }
        return f22184W + CertificateUtil.DELIMITER + f22164C;
    }

    public static boolean isConnected() {
        return f22209ac;
    }

    public static boolean isLimitedConnected() {
        return f22205aS;
    }

    public static boolean isUnitTestMode() {
        return getConnectFlagValue("unit_test_mode") == "true";
    }

    /* renamed from: r */
    private static String m24269r() {
        String str = f22253v + f22254w + f22255x + f22234c + f22248q;
        try {
            return TapjoyUtil.SHA1(str);
        } catch (Exception unused) {
            return str;
        }
    }

    public static void setAdTrackingEnabled() {
        boolean z;
        if (C9313ge.m24951a() != null) {
            C9313ge a = C9313ge.m24951a();
            if (a.f23034c == null) {
                z = false;
            } else {
                z = a.f23034c.booleanValue();
            }
            if (z) {
                f22235d = false;
                return;
            }
        }
        TapjoyGpsHelper tapjoyGpsHelper = f22211ae;
        if (tapjoyGpsHelper != null) {
            f22235d = tapjoyGpsHelper.isAdTrackingEnabled();
        }
    }

    public static void setCustomParameter(String str) {
        f22165D = str;
    }

    public static String getCustomParameter() {
        return f22165D;
    }

    /* renamed from: a */
    static /* synthetic */ void m24241a() {
        if (!f22207aU) {
            try {
                f22211ae.loadAdvertisingId(!m24265n());
                if (f22211ae.isGooglePlayServicesAvailable() && f22211ae.isGooglePlayManifestConfigured()) {
                    f22233b = f22211ae.getDeviceGooglePlayServicesVersion();
                    f22186a = f22211ae.getPackagedGooglePlayServicesVersion();
                }
                if (f22211ae.isAdIdAvailable()) {
                    setAdTrackingEnabled();
                    f22234c = f22211ae.getAdvertisingId();
                    C9344gz a = C9344gz.m25060a();
                    String str = f22234c;
                    boolean z = !f22235d;
                    C9357hc hcVar = a.f23116f;
                    String a2 = hcVar.f23156c.f23194A.mo58486a();
                    hcVar.f23155b.f22919q = str;
                    hcVar.f23155b.f22920r = Boolean.valueOf(z);
                    hcVar.f23156c.f23194A.mo58487a(str);
                    hcVar.f23156c.f23195B.mo58256a(z);
                    C9376hn.m25196a(str, z);
                    if (!C9465jq.m25449c(a2) && !str.equals(a2)) {
                        hcVar.f23156c.mo58307a(false);
                    }
                }
            } catch (Exception e) {
                TapjoyLog.m24276i("TapjoyConnect", "Error fetching advertising id: " + e.toString());
                e.printStackTrace();
            }
            f22207aU = true;
        }
    }

    /* renamed from: a */
    static /* synthetic */ boolean m24246a(String str) {
        Document buildDocument = TapjoyUtil.buildDocument(str);
        if (buildDocument == null) {
            return true;
        }
        String nodeTrimValue = TapjoyUtil.getNodeTrimValue(buildDocument.getElementsByTagName(InitializationStatus.SUCCESS));
        return nodeTrimValue != null && nodeTrimValue.equals("true");
    }

    /* renamed from: a */
    static /* synthetic */ void m24244a(boolean z) {
        if (z) {
            TapjoyLog.m24276i("TapjoyConnect", "Set userID is successful");
            TJSetUserIDListener tJSetUserIDListener = f22243l;
            if (tJSetUserIDListener != null) {
                tJSetUserIDListener.onSetUserIDSuccess();
                return;
            }
            return;
        }
        TapjoyLog.m24274e("TapjoyConnect", new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.SDK_ERROR, "Failed to set userID"));
        TJSetUserIDListener tJSetUserIDListener2 = f22243l;
        if (tJSetUserIDListener2 != null) {
            tJSetUserIDListener2.onSetUserIDFailure("Failed to set userID");
        }
    }
}
