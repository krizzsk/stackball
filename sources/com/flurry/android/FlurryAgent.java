package com.flurry.android;

import android.content.Context;
import android.content.Intent;
import android.location.Criteria;
import android.os.Bundle;
import android.text.TextUtils;
import com.flurry.android.FlurryPrivacySession;
import com.flurry.sdk.C2419bn;
import com.flurry.sdk.C2426bo;
import com.flurry.sdk.C2449bq;
import com.flurry.sdk.C2486ch;
import com.flurry.sdk.C2491ci;
import com.flurry.sdk.C2493cj;
import com.flurry.sdk.C2494ck;
import com.flurry.sdk.C2495cl;
import com.flurry.sdk.C2496cm;
import com.flurry.sdk.C2509cu;
import com.flurry.sdk.C2510cv;
import com.flurry.sdk.C2511cw;
import com.flurry.sdk.C2530db;
import com.flurry.sdk.C2533de;
import com.flurry.sdk.C2534df;
import com.flurry.sdk.C2597ec;
import com.flurry.sdk.C2599ed;
import com.flurry.sdk.C2611eg;
import com.flurry.sdk.C2619em;
import com.flurry.sdk.C2627es;
import com.flurry.sdk.C2639fa;
import com.flurry.sdk.C2648fd;
import com.flurry.sdk.C2667v;
import com.flurry.sdk.C2668w;
import com.flurry.sdk.C2669x;
import com.google.common.net.HttpHeaders;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class FlurryAgent {
    public static String VERSION_STRING = "!SDK-VERSION-STRING!:com.flurry.android:analytics:11.5.0";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f5286a = FlurryAgent.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static FlurryAgentListener f5287b = null;

    /* renamed from: c */
    private static final C2510cv<C2597ec> f5288c = new C2510cv<C2597ec>() {
        /* renamed from: a */
        public final /* synthetic */ void mo17521a(C2509cu cuVar) {
            final C2597ec ecVar = (C2597ec) cuVar;
            C2494ck.m5371a().mo17683a((Runnable) new Runnable() {
                public final void run() {
                    if (C23253.f5304a[ecVar.f6085d - 1] == 1 && FlurryAgent.f5287b != null) {
                        FlurryAgent.f5287b.onSessionStarted();
                    }
                }
            });
        }
    };

    /* renamed from: d */
    private static boolean f5289d = false;

    /* renamed from: e */
    private static int f5290e = 5;

    /* renamed from: f */
    private static long f5291f = TapjoyConstants.TIMER_INCREMENT;

    /* renamed from: g */
    private static boolean f5292g = true;

    /* renamed from: h */
    private static boolean f5293h = true;

    /* renamed from: i */
    private static List<FlurryModule> f5294i = new ArrayList();

    /* renamed from: j */
    private static String f5295j = null;

    /* renamed from: k */
    private static String f5296k = null;

    /* renamed from: l */
    private static Consent f5297l = null;

    @Deprecated
    public static void setLocation(float f, float f2) {
    }

    @Deprecated
    public static void setLocationCriteria(Criteria criteria) {
    }

    @Deprecated
    public static void setLogEvents(boolean z) {
    }

    /* renamed from: com.flurry.android.FlurryAgent$3 */
    static /* synthetic */ class C23253 {

        /* renamed from: a */
        static final /* synthetic */ int[] f5304a;

        static {
            int[] iArr = new int[C2597ec.C2598a.m5641a().length];
            f5304a = iArr;
            try {
                iArr[C2597ec.C2598a.f6091e - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private FlurryAgent() {
    }

    @Deprecated
    public static void setFlurryAgentListener(FlurryAgentListener flurryAgentListener) {
        if (m4994d()) {
            f5287b = flurryAgentListener;
            C2511cw.m5419a().mo17723a("com.flurry.android.sdk.FlurrySessionEvent", f5288c);
        }
    }

    @Deprecated
    public static void setLogEnabled(boolean z) {
        if (m4994d()) {
            if (z) {
                C2530db.m5479b();
            } else {
                C2530db.m5472a();
            }
        }
    }

    @Deprecated
    public static void setLogLevel(int i) {
        if (m4994d()) {
            C2530db.m5473a(i);
        }
    }

    @Deprecated
    public static void setContinueSessionMillis(long j) {
        if (m4994d()) {
            if (j < 5000) {
                C2530db.m5482b(f5286a, "Invalid time set for session resumption: ".concat(String.valueOf(j)));
            } else {
                C2611eg.m5674a().mo17821a("ContinueSessionMillis", (Object) Long.valueOf(j));
            }
        }
    }

    @Deprecated
    public static void setCaptureUncaughtExceptions(boolean z) {
        if (m4994d()) {
            C2611eg.m5674a().mo17821a("CaptureUncaughtExceptions", (Object) Boolean.valueOf(z));
        }
    }

    @Deprecated
    public static void setPulseEnabled(boolean z) {
        if (z) {
            C2530db.m5490e(f5286a, "Flurry Pulse is not available anymore and the API will be removed in an upcoming release");
        }
    }

    @Deprecated
    public static synchronized void init(Context context, String str) {
        synchronized (FlurryAgent.class) {
            if (m4994d()) {
                if (!TextUtils.isEmpty(str)) {
                    if (C2494ck.m5371a() != null) {
                        C2530db.m5490e(f5286a, "Flurry is already initialized");
                    }
                    try {
                        C2648fd.m5752a();
                        C2494ck.m5372a(context, str);
                    } catch (Throwable th) {
                        C2530db.m5477a(f5286a, "", th);
                    }
                } else {
                    throw new IllegalArgumentException("API key not specified");
                }
            }
        }
    }

    public static int getAgentVersion() {
        return C2495cl.m5382b();
    }

    public static String getReleaseVersion() {
        return C2495cl.m5381a();
    }

    public static List<FlurryModule> getAddOnModules() {
        return f5294i;
    }

    public static void setVersionName(String str) {
        if (m4994d()) {
            C2611eg.m5674a().mo17821a("VersionName", (Object) str);
        }
    }

    public static void setReportLocation(boolean z) {
        if (m4994d()) {
            C2611eg.m5674a().mo17821a("ReportLocation", (Object) Boolean.valueOf(z));
        }
    }

    @Deprecated
    public static void clearLocation() {
        if (m4994d()) {
            C2611eg.m5674a().mo17821a("ExplicitLocation", (Object) null);
        }
    }

    public static void addOrigin(String str, String str2) {
        addOrigin(str, str2, (Map<String, String>) null);
    }

    public static void addOrigin(String str, String str2, Map<String, String> map) {
        if (m4994d()) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("originName not specified");
            } else if (!TextUtils.isEmpty(str2)) {
                try {
                    C2496cm.m5384a().mo17687a(str, str2, map);
                } catch (Throwable th) {
                    C2530db.m5477a(f5286a, "", th);
                }
            } else {
                throw new IllegalArgumentException("originVersion not specified");
            }
        }
    }

    public static void setInstantAppName(String str) {
        f5296k = str;
    }

    public static String getInstantAppName() {
        return f5296k;
    }

    public static synchronized Consent getFlurryConsent() {
        Consent consent;
        synchronized (FlurryAgent.class) {
            consent = f5297l;
        }
        return consent;
    }

    public static synchronized boolean updateFlurryConsent(Consent consent) {
        synchronized (FlurryAgent.class) {
            if (!m4994d()) {
                return false;
            }
            if (!C2493cj.m5370a(consent)) {
                C2530db.m5482b(f5286a, "Consent is null or illegal");
                return false;
            }
            f5297l = consent;
            if (C2491ci.f5828a != null) {
                C2491ci.f5828a.mo17681a();
            }
            return true;
        }
    }

    @Deprecated
    public static void onStartSession(Context context, String str) {
        onStartSession(context);
    }

    public static void onStartSession(Context context) {
        if (m4994d()) {
            m4995e();
            try {
                C2599ed.m5642a().mo17806b(context);
            } catch (Throwable th) {
                C2530db.m5477a(f5286a, "", th);
            }
        }
    }

    public static void onEndSession(Context context) {
        if (m4994d()) {
            m4995e();
            try {
                C2599ed.m5642a().mo17809c(context);
            } catch (Throwable th) {
                C2530db.m5477a(f5286a, "", th);
            }
        }
    }

    public static boolean isSessionActive() {
        if (!m4994d()) {
            return false;
        }
        try {
            return C2599ed.m5642a().mo17811d();
        } catch (Throwable th) {
            C2530db.m5477a(f5286a, "", th);
            return false;
        }
    }

    public static String getSessionId() {
        if (!m4994d()) {
            return null;
        }
        m4995e();
        try {
            C2449bq.m5261a();
            return C2449bq.m5264b();
        } catch (Throwable th) {
            C2530db.m5477a(f5286a, "", th);
            return null;
        }
    }

    public static FlurryEventRecordStatus logEvent(String str) {
        FlurryEventRecordStatus flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (!m4994d()) {
            return flurryEventRecordStatus;
        }
        try {
            return C2669x.m5819a().mo17876a(str, (Map<String, String>) null, false, 0);
        } catch (Throwable th) {
            C2530db.m5477a(f5286a, "Failed to log event: ".concat(String.valueOf(str)), th);
            return flurryEventRecordStatus;
        }
    }

    public static FlurryEventRecordStatus logEvent(String str, Map<String, String> map) {
        FlurryEventRecordStatus flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (!m4994d()) {
            return flurryEventRecordStatus;
        }
        try {
            return C2669x.m5819a().mo17874a(str, map, 0);
        } catch (Throwable th) {
            C2530db.m5477a(f5286a, "Failed to log event: ".concat(String.valueOf(str)), th);
            return flurryEventRecordStatus;
        }
    }

    public static FlurryEventRecordStatus logEvent(String str, boolean z) {
        FlurryEventRecordStatus flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (!m4994d()) {
            return flurryEventRecordStatus;
        }
        try {
            return C2669x.m5819a().mo17876a(str, (Map<String, String>) null, z, 0);
        } catch (Throwable th) {
            C2530db.m5477a(f5286a, "Failed to log event: ".concat(String.valueOf(str)), th);
            return flurryEventRecordStatus;
        }
    }

    public static FlurryEventRecordStatus logEvent(String str, Map<String, String> map, boolean z) {
        FlurryEventRecordStatus flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (!m4994d()) {
            return flurryEventRecordStatus;
        }
        try {
            return C2669x.m5819a().mo17875a(str, map, z);
        } catch (Throwable th) {
            C2530db.m5477a(f5286a, "Failed to log event: ".concat(String.valueOf(str)), th);
            return flurryEventRecordStatus;
        }
    }

    public static void logPayment(int i, Intent intent, final Map<String, String> map) {
        Object obj;
        if (m4994d()) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                obj = null;
            } else {
                obj = extras.get("RESPONSE_CODE");
            }
            int i2 = 0;
            if (obj == null) {
                C2530db.m5482b(f5286a, "Intent with no response code, assuming OK (known issue)");
            } else if (obj instanceof Integer) {
                i2 = ((Integer) obj).intValue();
            } else if (obj instanceof Long) {
                i2 = (int) ((Long) obj).longValue();
            }
            final String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
            final String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
            if (stringExtra == null || stringExtra2 == null) {
                String str = f5286a;
                C2530db.m5482b(str, "Invalid logPayment call. resultCode:" + i + ", responseCode:" + i2 + ", purchaseData:" + stringExtra + ", dataSignature:" + stringExtra2);
                return;
            }
            try {
                final JSONObject jSONObject = new JSONObject(stringExtra);
                if (i == -1 && i2 == 0) {
                    C2419bn.m5202a(C2494ck.m5371a().f5832a, jSONObject.optString("productId"), new C2419bn.C2422a() {
                        /* renamed from: a */
                        public final void mo17523a(int i, C2419bn.C2425c cVar) {
                            if (cVar != null) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("fl.Quantity", "1");
                                hashMap.put("fl.ProductId", jSONObject.optString("productId"));
                                hashMap.put("fl.Price", String.format(Locale.ENGLISH, "%1$.2f", new Object[]{Double.valueOf(((double) cVar.f5628b) / 1000000.0d)}));
                                hashMap.put("fl.Currency", cVar.f5629c);
                                hashMap.put("fl.ProductName", cVar.f5630d);
                                hashMap.put("fl.ProductType", cVar.f5627a);
                                hashMap.put("fl.TransactionIdentifier", jSONObject.optString("orderId"));
                                hashMap.put("fl.OrderJSON", stringExtra);
                                hashMap.put("fl.OrderJSONSignature", stringExtra2);
                                int size = hashMap.size();
                                Map map = map;
                                if (map != null) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        if (!hashMap.containsKey(entry.getKey())) {
                                            hashMap.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                }
                                C2669x.m5819a().mo17874a("Flurry.purchase", (Map<String, String>) hashMap, size);
                                return;
                            }
                            String b = FlurryAgent.f5286a;
                            C2530db.m5482b(b, "Failed to load SKU Details from Google for '" + jSONObject.optString("productId") + "'. Result: " + i);
                        }
                    });
                    return;
                }
                String str2 = f5286a;
                C2530db.m5482b(str2, "Invalid logPayment call. resultCode:" + i + ", responseCode:" + i2 + ", purchaseData:" + stringExtra + ", dataSignature:" + stringExtra2);
            } catch (Throwable th) {
                C2530db.m5477a(f5286a, "Failed to log event: Flurry.purchase", th);
            }
        }
    }

    public static FlurryEventRecordStatus logPayment(String str, String str2, int i, double d, String str3, String str4, Map<String, String> map) {
        FlurryEventRecordStatus flurryEventRecordStatus = FlurryEventRecordStatus.kFlurryEventFailed;
        if (!m4994d()) {
            return flurryEventRecordStatus;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("fl.ProductName", str);
            hashMap.put("fl.ProductID", str2);
            hashMap.put("fl.Quantity", String.valueOf(i));
            hashMap.put("fl.Price", String.format(Locale.ENGLISH, "%1$.2f", new Object[]{Double.valueOf(d)}));
            hashMap.put("fl.Currency", str3);
            hashMap.put("fl.TransactionIdentifier", str4);
            int size = hashMap.size();
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    if (!hashMap.containsKey(next.getKey())) {
                        hashMap.put(next.getKey(), next.getValue());
                    }
                }
            }
            return C2669x.m5819a().mo17874a("Flurry.purchase", (Map<String, String>) hashMap, size);
        } catch (Throwable th) {
            C2530db.m5477a(f5286a, "Failed to log event: Flurry.purchase", th);
            return flurryEventRecordStatus;
        }
    }

    public static void endTimedEvent(String str) {
        if (m4994d()) {
            try {
                C2669x.m5819a().mo17878a(new C2668w(str, (Map<String, String>) null));
            } catch (Throwable th) {
                C2530db.m5477a(f5286a, "Failed to signify the end of event: ".concat(String.valueOf(str)), th);
            }
        }
    }

    public static void endTimedEvent(String str, Map<String, String> map) {
        if (m4994d()) {
            try {
                C2669x.m5819a().mo17878a(new C2668w(str, map));
            } catch (Throwable th) {
                C2530db.m5477a(f5286a, "Failed to signify the end of event: ".concat(String.valueOf(str)), th);
            }
        }
    }

    public static void onError(String str, String str2, String str3) {
        onError(str, str2, str3, (Map<String, String>) null);
    }

    public static void onError(String str, String str2, String str3, Map<String, String> map) {
        if (m4994d()) {
            if (TextUtils.isEmpty(str)) {
                C2530db.m5482b(f5286a, "String errorId passed to onError was empty.");
            } else if (TextUtils.isEmpty(str2)) {
                C2530db.m5482b(f5286a, "String message passed to onError was empty.");
            } else if (TextUtils.isEmpty(str3)) {
                C2530db.m5482b(f5286a, "String errorClass passed to onError was empty.");
            } else {
                try {
                    C2669x a = C2669x.m5819a();
                    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                    if (stackTrace != null && stackTrace.length > 2) {
                        int length = stackTrace.length - 2;
                        StackTraceElement[] stackTraceElementArr = new StackTraceElement[length];
                        System.arraycopy(stackTrace, 2, stackTraceElementArr, 0, length);
                        stackTrace = stackTraceElementArr;
                    }
                    Throwable th = new Throwable(str2);
                    th.setStackTrace(stackTrace);
                    a.mo17877a(new C2667v(str, str2, str3, th, (Map<String, String>) null, map));
                } catch (Throwable th2) {
                    C2530db.m5477a(f5286a, "", th2);
                }
            }
        }
    }

    public static void onError(String str, String str2, Throwable th) {
        onError(str, str2, th, (Map<String, String>) null);
    }

    public static void onError(String str, String str2, Throwable th, Map<String, String> map) {
        if (m4994d()) {
            try {
                C2669x.m5819a().mo17879a(str, str2, th, map);
            } catch (Throwable th2) {
                C2530db.m5477a(f5286a, "", th2);
            }
        }
    }

    public static void logBreadcrumb(String str) {
        if (m4994d()) {
            if (TextUtils.isEmpty(str)) {
                C2530db.m5482b(f5286a, "Crash breadcrumb cannot be empty.");
                return;
            }
            m4995e();
            try {
                C2669x a = C2669x.m5819a();
                C2627es esVar = new C2627es(str, System.currentTimeMillis());
                if (a.f6291d != null) {
                    a.f6291d.mo17830a(esVar);
                }
            } catch (Throwable th) {
                C2530db.m5477a(f5286a, "", th);
            }
        }
    }

    public static void onPageView() {
        if (m4994d()) {
            try {
                C2669x.m5819a();
                C2426bo b = C2669x.m5822b();
                if (b != null) {
                    b.mo17643c();
                }
            } catch (Throwable th) {
                C2530db.m5477a(f5286a, "", th);
            }
        }
    }

    public static void setAge(int i) {
        if (m4994d() && i > 0 && i < 110) {
            C2611eg.m5674a().mo17821a(HttpHeaders.AGE, (Object) Long.valueOf(new Date(new Date(System.currentTimeMillis() - (((long) i) * 31449600000L)).getYear(), 1, 1).getTime()));
        }
    }

    public static void setGender(byte b) {
        if (m4994d()) {
            if (b == 0 || b == 1) {
                C2611eg.m5674a().mo17821a("Gender", (Object) Byte.valueOf(b));
            } else {
                C2611eg.m5674a().mo17821a("Gender", (Object) (byte) -1);
            }
        }
    }

    public static void setUserId(String str) {
        if (m4994d()) {
            C2611eg.m5674a().mo17821a("UserId", (Object) C2619em.m5703b(str));
        }
    }

    public static void setSessionOrigin(String str, String str2) {
        if (m4994d()) {
            if (TextUtils.isEmpty(str)) {
                C2530db.m5482b(f5286a, "String originName passed to setSessionOrigin was empty.");
                return;
            }
            m4995e();
            C2449bq.m5261a();
            C2449bq.m5263a(str);
            C2449bq.m5261a();
            C2486ch c = C2449bq.m5265c();
            if (c != null) {
                c.mo17676b(str2);
            }
        }
    }

    public static void addSessionProperty(String str, String str2) {
        if (m4994d()) {
            if (TextUtils.isEmpty(str)) {
                C2530db.m5482b(f5286a, "Session property name was empty");
            } else if (TextUtils.isEmpty(str2)) {
                C2530db.m5482b(f5286a, "Session property value was empty");
            } else {
                m4995e();
                C2449bq.m5261a();
                C2486ch c = C2449bq.m5265c();
                if (c != null) {
                    c.mo17674a(str, str2);
                }
            }
        }
    }

    public static void openPrivacyDashboard(FlurryPrivacySession.Request request) {
        if (m4994d()) {
            m4995e();
            C2639fa.m5743a(request);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static boolean m4994d() {
        if (C2619em.m5699a(16)) {
            return true;
        }
        C2530db.m5482b(f5286a, String.format(Locale.getDefault(), "Device SDK Version older than %d", new Object[]{16}));
        return false;
    }

    /* renamed from: e */
    private static void m4995e() {
        if (C2494ck.m5371a() == null) {
            throw new IllegalStateException("Flurry SDK must be initialized before starting a session");
        }
    }

    public static class Builder {

        /* renamed from: c */
        private static FlurryAgentListener f5305c;

        /* renamed from: a */
        List<FlurryModule> f5306a = new ArrayList();

        /* renamed from: b */
        Consent f5307b;

        /* renamed from: d */
        private boolean f5308d = false;

        /* renamed from: e */
        private int f5309e = 5;

        /* renamed from: f */
        private long f5310f = TapjoyConstants.TIMER_INCREMENT;

        /* renamed from: g */
        private boolean f5311g = true;

        /* renamed from: h */
        private boolean f5312h = false;

        /* renamed from: i */
        private boolean f5313i = true;

        public Builder withListener(FlurryAgentListener flurryAgentListener) {
            f5305c = flurryAgentListener;
            return this;
        }

        public Builder withLogEnabled(boolean z) {
            this.f5308d = z;
            return this;
        }

        public Builder withLogLevel(int i) {
            this.f5309e = i;
            return this;
        }

        public Builder withContinueSessionMillis(long j) {
            this.f5310f = j;
            return this;
        }

        public Builder withCaptureUncaughtExceptions(boolean z) {
            this.f5311g = z;
            return this;
        }

        @Deprecated
        public Builder withPulseEnabled(boolean z) {
            this.f5312h = z;
            return this;
        }

        public Builder withIncludeBackgroundSessionsInMetrics(boolean z) {
            this.f5313i = z;
            return this;
        }

        public Builder withModule(FlurryModule flurryModule) throws IllegalArgumentException {
            if (C2533de.m5494a(flurryModule.getClass().getCanonicalName())) {
                this.f5306a.add(flurryModule);
                return this;
            }
            throw new IllegalArgumentException("The Flurry module you have registered is invalid: " + flurryModule.getClass().getCanonicalName());
        }

        public Builder withConsent(Consent consent) throws IllegalArgumentException {
            if (C2493cj.m5370a(consent)) {
                this.f5307b = consent;
                return this;
            }
            throw new IllegalArgumentException("flurryConsent is not valid");
        }

        public void build(Context context, String str) {
            if (FlurryAgent.m4994d()) {
                FlurryAgent.m4991a(f5305c, this.f5308d, this.f5309e, this.f5310f, this.f5311g, this.f5312h, this.f5313i, this.f5306a, this.f5307b, context, str);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m4991a(FlurryAgentListener flurryAgentListener, boolean z, int i, long j, boolean z2, boolean z3, boolean z4, List list, Consent consent, Context context, String str) {
        boolean z5;
        f5287b = flurryAgentListener;
        setFlurryAgentListener(flurryAgentListener);
        f5289d = z;
        setLogEnabled(z);
        f5290e = i;
        setLogLevel(i);
        f5291f = j;
        setContinueSessionMillis(j);
        f5292g = z2;
        setCaptureUncaughtExceptions(z2);
        int identifier = context.getResources().getIdentifier("FLURRY_IS_YAHOO_APP", "bool", context.getPackageName());
        if (identifier != 0) {
            z5 = context.getResources().getBoolean(identifier);
            C2530db.m5486c(f5286a, "Found FLURRY_IS_YAHOO_APP resource id. Value: ".concat(String.valueOf(z5)));
        } else {
            z5 = false;
        }
        if (z5) {
            C2611eg.m5674a().mo17821a("ProtonEnabled", (Object) Boolean.valueOf(z3));
            if (!z3) {
                C2611eg.m5674a().mo17821a("analyticsEnabled", (Object) Boolean.TRUE);
            }
        } else if (z3) {
            C2530db.m5490e(f5286a, "Flurry Pulse is not available anymore and the API will be removed in an upcoming release");
        }
        f5293h = z4;
        if (m4994d()) {
            C2611eg.m5674a().mo17821a("IncludeBackgroundSessionsInMetrics", (Object) Boolean.valueOf(z4));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2533de.m5492a((C2534df) ((FlurryModule) it.next()));
        }
        f5297l = consent;
        f5295j = str;
        init(context, str);
    }
}
