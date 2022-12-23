package com.ironsource.environment;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.appsflyer.ServerParameters;
import com.google.common.net.HttpHeaders;
import com.ironsource.mediationsdk.config.VersionInfo;
import com.tapjoy.TapjoyConstants;
import java.io.DataOutputStream;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.environment.e */
public final class C5521e {

    /* renamed from: c */
    public static String f12728c = "";

    /* renamed from: a */
    Context f12729a;

    /* renamed from: b */
    String f12730b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public JSONObject f12731d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f12732e;

    /* renamed from: f */
    private String f12733f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f12734g;

    /* renamed from: h */
    private Thread.UncaughtExceptionHandler f12735h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f12736i;

    /* renamed from: com.ironsource.environment.e$a */
    static class C5525a {

        /* renamed from: a */
        static volatile C5521e f12742a = new C5521e((byte) 0);
    }

    private C5521e() {
        this.f12734g = false;
        this.f12731d = new JSONObject();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        this.f12735h = defaultUncaughtExceptionHandler;
        this.f12730b = " ";
        this.f12736i = "https://outcome-crash-report.supersonicads.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new C5520d(defaultUncaughtExceptionHandler));
    }

    /* synthetic */ C5521e(byte b) {
        this();
    }

    /* renamed from: a */
    public static C5521e m13114a() {
        return C5525a.f12742a;
    }

    /* renamed from: a */
    private static String m13115a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    return "none";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "cellular";
                }
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI")) {
                        return TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
                    }
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("MOBILE")) {
                        return "cellular";
                    }
                }
            }
            return "none";
        } catch (Exception e) {
            e.printStackTrace();
            return "none";
        }
    }

    /* renamed from: a */
    public final void mo41246a(final Context context, HashSet<String> hashSet, String str, String str2, boolean z, final String str3, int i, boolean z2) {
        if (context != null) {
            Log.d("automation_log", "init ISCrashReporter");
            this.f12729a = context;
            if (!TextUtils.isEmpty(str2)) {
                this.f12730b = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.f12736i = str;
            }
            this.f12733f = str3;
            if (z) {
                C5505a aVar = new C5505a(i);
                aVar.f12699c = z2;
                aVar.f12698b = true;
                aVar.f12697a = new C5511b() {
                    /* renamed from: a */
                    public final void mo41232a() {
                        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
                        StringBuilder sb = new StringBuilder(128);
                        for (Thread next : allStackTraces.keySet()) {
                            StackTraceElement[] stackTrace = next.getStackTrace();
                            if (stackTrace != null && stackTrace.length > 0) {
                                sb.append(",");
                                sb.append(next.getName());
                                sb.append("\n");
                                for (StackTraceElement stackTraceElement : stackTrace) {
                                    sb.append(stackTraceElement.toString());
                                    sb.append(" ");
                                    sb.append(next.getState().toString());
                                    sb.append("\n");
                                }
                            }
                        }
                        C5521e.f12728c = sb.toString();
                    }

                    /* renamed from: b */
                    public final void mo41233b() {
                    }
                };
                aVar.start();
            }
            String a = m13115a(this.f12729a);
            if (!a.equals("none")) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
                String string = sharedPreferences.getString("String1", this.f12732e);
                String string2 = sharedPreferences.getString("sId", this.f12733f);
                new StringBuilder();
                for (C5517c next : C5526f.m13125a()) {
                    String b = next.mo41241b();
                    String a2 = next.mo41240a();
                    String c = next.mo41242c();
                    String packageName = context.getPackageName();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("crashDate", b);
                        jSONObject.put("stacktraceCrash", a2);
                        jSONObject.put("crashType", c);
                        jSONObject.put("CrashReporterVersion", "1.0.4");
                        jSONObject.put("SDKVersion", VersionInfo.VERSION);
                        jSONObject.put("deviceLanguage", C5527g.m13138b(context));
                        jSONObject.put("appVersion", C5517c.m13106c(context, packageName));
                        jSONObject.put("deviceOSVersion", C5527g.m13146e());
                        jSONObject.put(ServerParameters.NETWORK, a);
                        jSONObject.put("deviceApiLevel", C5527g.m13147f());
                        jSONObject.put("deviceModel", C5527g.m13150g());
                        jSONObject.put("deviceOS", C5527g.m13153i());
                        jSONObject.put("advertisingId", string);
                        jSONObject.put("isLimitAdTrackingEnabled", this.f12734g);
                        jSONObject.put("deviceOEM", C5527g.m13151h());
                        jSONObject.put("systemProperties", System.getProperties());
                        jSONObject.put("bundleId", packageName);
                        jSONObject.put("sId", string2);
                        JSONObject jSONObject2 = new JSONObject();
                        if (hashSet != null && !hashSet.isEmpty()) {
                            Iterator<String> it = hashSet.iterator();
                            while (it.hasNext()) {
                                String next2 = it.next();
                                try {
                                    if (jSONObject.has(next2)) {
                                        jSONObject2.put(next2, jSONObject.opt(next2));
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            jSONObject = jSONObject2;
                        }
                        this.f12731d = jSONObject;
                    } catch (Exception unused) {
                    }
                    if (this.f12731d.length() == 0) {
                        Log.d("ISCrashReport", " Is Empty");
                    } else {
                        new Thread(new Runnable() {
                            public final void run() {
                                try {
                                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(C5521e.m13114a().f12736i).openConnection();
                                    httpURLConnection.setRequestMethod("POST");
                                    httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
                                    httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT, WebRequest.CONTENT_TYPE_JSON);
                                    httpURLConnection.setDoOutput(true);
                                    httpURLConnection.setDoInput(true);
                                    Log.i("JSON", C5521e.this.f12731d.toString());
                                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                                    dataOutputStream.writeBytes(C5521e.this.f12731d.toString());
                                    dataOutputStream.flush();
                                    dataOutputStream.close();
                                    Log.i("STATUS", String.valueOf(httpURLConnection.getResponseCode()));
                                    Log.i("MSG", httpURLConnection.getResponseMessage());
                                    httpURLConnection.disconnect();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }).start();
                        C5526f.m13128c();
                    }
                }
            }
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        String[] a = C5527g.m13136a(context);
                        if (!TextUtils.isEmpty(a[0])) {
                            String unused = C5521e.this.f12732e = a[0];
                        }
                        boolean unused2 = C5521e.this.f12734g = Boolean.parseBoolean(a[1]);
                        SharedPreferences.Editor edit = context.getSharedPreferences("CRep", 0).edit();
                        edit.putString("String1", C5521e.this.f12732e);
                        edit.putString("sId", str3);
                        edit.apply();
                    } catch (Exception unused3) {
                    }
                }
            }).start();
        }
    }
}
