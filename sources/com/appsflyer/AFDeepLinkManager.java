package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.internal.referrer.Payload;
import com.google.common.net.HttpHeaders;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class AFDeepLinkManager {
    public static final String DDL_SENT = "ddl_sent";
    public static AFDeepLinkManager instance;
    public static Intent trampolineIntent;

    /* renamed from: ı */
    static volatile boolean f3932;

    /* renamed from: ǃ */
    public static String[] f3933;

    /* renamed from: Ι */
    static final int f3934 = ((int) TimeUnit.SECONDS.toMillis(2));

    /* renamed from: ι */
    static String[] f3935;
    public String contains;
    public DeepLinkListener deepLinkListener;
    public List<List<String>> deepLinkSearchPaths = new ArrayList();
    public Map<String, String> parameters;

    public static AFDeepLinkManager getInstance() {
        if (instance == null) {
            instance = new AFDeepLinkManager();
        }
        return instance;
    }

    /* access modifiers changed from: private */
    /* renamed from: ι */
    public static boolean m3694(String str) {
        if (f3935 == null || str.contains("af_tranid=")) {
            return false;
        }
        StringBuilder sb = new StringBuilder("Validate if link ");
        sb.append(str);
        sb.append(" belongs to ESP domains: ");
        sb.append(Arrays.asList(f3935));
        AFLogger.afRDLog(sb.toString());
        try {
            return Arrays.asList(f3935).contains(new URL(str).getHost());
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    /* renamed from: ɩ */
    static void m3692(final Context context, final Map<String, Object> map, final Uri uri) {
        if (m3694(uri.toString())) {
            f3932 = true;
            AFExecutor instance2 = AFExecutor.getInstance();
            if (instance2.f3953 == null) {
                instance2.f3953 = Executors.newSingleThreadScheduledExecutor(instance2.f3954);
            }
            instance2.f3953.execute(new Runnable() {
                public final void run() {
                    String str;
                    Integer num;
                    String str2;
                    long currentTimeMillis = System.currentTimeMillis();
                    String obj = uri.toString();
                    ArrayList arrayList = new ArrayList();
                    Integer num2 = null;
                    String str3 = null;
                    int i = 0;
                    while (true) {
                        if (i >= 5) {
                            break;
                        }
                        Map<String, Object> r2 = m3696(Uri.parse(obj));
                        str = (String) r2.get("res");
                        num = (Integer) r2.get("status");
                        str2 = (String) r2.get("error");
                        if (str == null || !AFDeepLinkManager.m3694(str)) {
                            Integer num3 = num;
                            str3 = str2;
                            obj = str;
                            num2 = num3;
                        } else {
                            if (i < 4) {
                                arrayList.add(str);
                            }
                            i++;
                            Integer num4 = num;
                            str3 = str2;
                            obj = str;
                            num2 = num4;
                        }
                    }
                    Integer num32 = num;
                    str3 = str2;
                    obj = str;
                    num2 = num32;
                    HashMap hashMap = new HashMap();
                    hashMap.put("res", obj != null ? obj : "");
                    hashMap.put("status", Integer.valueOf(num2 != null ? num2.intValue() : -1));
                    if (str3 != null) {
                        hashMap.put("error", str3);
                    }
                    if (!arrayList.isEmpty()) {
                        hashMap.put("redirects", arrayList);
                    }
                    hashMap.put(Payload.LATENCY, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    synchronized (map) {
                        map.put(ServerParameters.DEEP_LINK_RESOLVED, hashMap);
                        map.put(ServerParameters.DEEP_LINK, uri.toString());
                    }
                    AppsFlyerLibCore.getInstance().handleDeepLinkCallback(context, map, obj != null ? Uri.parse(obj) : uri);
                    AFDeepLinkManager.f3932 = false;
                }

                /* renamed from: ι */
                private static Map<String, Object> m3696(Uri uri) {
                    HashMap hashMap = new HashMap();
                    try {
                        StringBuilder sb = new StringBuilder("ESP deeplink resolving is started: ");
                        sb.append(uri.toString());
                        AFLogger.afDebugLog(sb.toString());
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setReadTimeout(AFDeepLinkManager.f3934);
                        httpURLConnection.setConnectTimeout(AFDeepLinkManager.f3934);
                        httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
                        httpURLConnection.setRequestProperty("af-esp", "6.1.3");
                        int responseCode = httpURLConnection.getResponseCode();
                        hashMap.put("status", Integer.valueOf(responseCode));
                        if (300 <= responseCode && responseCode <= 305) {
                            hashMap.put("res", httpURLConnection.getHeaderField(HttpHeaders.LOCATION));
                        }
                        httpURLConnection.disconnect();
                        AFLogger.afDebugLog("ESP deeplink resolving is finished");
                    } catch (Throwable th) {
                        hashMap.put("error", th.getLocalizedMessage());
                        AFLogger.afErrorLog(th.getMessage(), th);
                    }
                    return hashMap;
                }
            });
        } else {
            AppsFlyerLibCore.getInstance().handleDeepLinkCallback(context, map, uri);
        }
        trampolineIntent = null;
    }

    /* renamed from: ǃ */
    private static Uri m3691(Object obj, Iterator<String> it) {
        while (obj != JSONObject.NULL) {
            if (!it.hasNext()) {
                Uri parse = Uri.parse(obj.toString());
                if (parse == null || parse.getScheme() == null || parse.getHost() == null) {
                    return null;
                }
                return parse;
            }
            try {
                obj = new JSONObject(obj.toString()).get(it.next());
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x006e A[SYNTHETIC] */
    /* renamed from: ǃ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13823(android.content.Intent r9, android.content.Context r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            r8 = this;
            java.lang.String r0 = "android.intent.action.VIEW"
            r1 = 0
            if (r9 == 0) goto L_0x0014
            java.lang.String r2 = r9.getAction()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0014
            android.net.Uri r2 = r9.getData()
            goto L_0x0015
        L_0x0014:
            r2 = r1
        L_0x0015:
            android.content.Intent r3 = trampolineIntent
            if (r3 == 0) goto L_0x0028
            java.lang.String r4 = r3.getAction()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0028
            android.net.Uri r0 = r3.getData()
            goto L_0x0029
        L_0x0028:
            r0 = r1
        L_0x0029:
            android.os.Bundle r3 = r9.getExtras()
            java.util.List<java.util.List<java.lang.String>> r4 = r8.deepLinkSearchPaths
            if (r4 == 0) goto L_0x008f
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x008f
            if (r3 != 0) goto L_0x003a
            goto L_0x008f
        L_0x003a:
            java.util.List<java.util.List<java.lang.String>> r4 = r8.deepLinkSearchPaths
            java.util.Iterator r4 = r4.iterator()
        L_0x0040:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x008f
            java.lang.Object r5 = r4.next()
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L_0x0050
        L_0x004e:
            r6 = r1
            goto L_0x006c
        L_0x0050:
            java.util.Iterator r6 = r5.iterator()
            boolean r7 = r6.hasNext()
            if (r7 != 0) goto L_0x005b
            goto L_0x004e
        L_0x005b:
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = r3.getString(r7)
            if (r7 != 0) goto L_0x0068
            goto L_0x004e
        L_0x0068:
            android.net.Uri r6 = m3691(r7, r6)
        L_0x006c:
            if (r6 == 0) goto L_0x0040
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Found deeplink in push payload at "
            r1.<init>(r3)
            java.lang.String r3 = r5.toString()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.appsflyer.AFLogger.afDebugLog(r1)
            java.util.Map r1 = com.appsflyer.AppsFlyerLibCore.m3743((java.util.Map<java.lang.String, java.lang.Object>) r11)
            java.util.List<java.util.List<java.lang.String>> r3 = r8.deepLinkSearchPaths
            java.lang.String r4 = "payloadKey"
            r1.put(r4, r3)
            r1 = r6
        L_0x008f:
            r3 = 1
            java.lang.String r4 = " w/af_consumed"
            r5 = 0
            java.lang.String r6 = "af_consumed"
            if (r2 == 0) goto L_0x00c1
            boolean r0 = r9.hasExtra(r6)
            if (r0 != 0) goto L_0x00a8
            long r0 = java.lang.System.currentTimeMillis()
            r9.putExtra(r6, r0)
            m3692(r10, r11, r2)
            return r3
        L_0x00a8:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "skipping re-use of previously consumed deep link: "
            r9.<init>(r10)
            java.lang.String r10 = r2.toString()
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            com.appsflyer.AFLogger.afInfoLog(r9)
            return r5
        L_0x00c1:
            if (r0 == 0) goto L_0x00f1
            android.content.Intent r9 = trampolineIntent
            boolean r9 = r9.hasExtra(r6)
            if (r9 != 0) goto L_0x00d8
            android.content.Intent r9 = trampolineIntent
            long r1 = java.lang.System.currentTimeMillis()
            r9.putExtra(r6, r1)
            m3692(r10, r11, r0)
            return r3
        L_0x00d8:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "skipping re-use of previously consumed trampoline deep link: "
            r9.<init>(r10)
            java.lang.String r10 = r0.toString()
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            com.appsflyer.AFLogger.afInfoLog(r9)
            return r5
        L_0x00f1:
            if (r1 == 0) goto L_0x011d
            boolean r0 = r9.hasExtra(r6)
            if (r0 != 0) goto L_0x0104
            long r4 = java.lang.System.currentTimeMillis()
            r9.putExtra(r6, r4)
            m3692(r10, r11, r1)
            return r3
        L_0x0104:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "skipping re-use of previously consumed deep link from push: "
            r9.<init>(r10)
            java.lang.String r10 = r1.toString()
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            com.appsflyer.AFLogger.afInfoLog(r9)
            return r5
        L_0x011d:
            java.lang.String r9 = "No deep link detected"
            com.appsflyer.AFLogger.afDebugLog(r9)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFDeepLinkManager.mo13823(android.content.Intent, android.content.Context, java.util.Map):boolean");
    }

    /* access modifiers changed from: protected */
    public void collectIntentsFromActivities(Intent intent) {
        Uri uri;
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            uri = null;
        } else {
            uri = intent.getData();
        }
        if (uri != null && intent != trampolineIntent) {
            trampolineIntent = intent;
        }
    }
}
