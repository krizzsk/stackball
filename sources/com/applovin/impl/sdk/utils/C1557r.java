package com.applovin.impl.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import com.applovin.impl.p008a.C1000a;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1483n;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p024ad.C1349d;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.impl.sdk.p024ad.C1361h;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p026c.C1374a;
import com.applovin.impl.sdk.p026c.C1387g;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdk;
import com.p243my.tracker.ads.AdFormat;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.utils.r */
public abstract class C1557r {
    /* renamed from: a */
    public static double m3575a(long j) {
        return ((double) j) / 1000.0d;
    }

    /* renamed from: a */
    public static float m3576a(float f) {
        return f * 1000.0f;
    }

    /* renamed from: a */
    public static int m3577a(JSONObject jSONObject) {
        int b = C1521i.m3485b(jSONObject, "video_completion_percent", -1, (C1469j) null);
        if (b < 0 || b > 100) {
            return 95;
        }
        return b;
    }

    /* renamed from: a */
    public static long m3578a(C1469j jVar) {
        long longValue = ((Long) jVar.mo13088a(C1369c.f3083eQ)).longValue();
        long longValue2 = ((Long) jVar.mo13088a(C1369c.f3084eR)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        return (longValue <= 0 || longValue2 <= 0) ? currentTimeMillis : currentTimeMillis + (longValue - longValue2);
    }

    /* renamed from: a */
    public static Activity m3579a(View view, C1469j jVar) {
        if (view == null) {
            return null;
        }
        int i = 0;
        while (i < 1000) {
            i++;
            try {
                Context context = view.getContext();
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } catch (Throwable th) {
                jVar.mo13139v().mo13278b("Utils", "Encountered error while retrieving activity from view", th);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Bitmap m3580a(Context context, int i, int i2) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i3 = 1;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(context.getResources(), i);
            if (options.outHeight > i2 || options.outWidth > i2) {
                i3 = (int) Math.pow(2.0d, (double) ((int) Math.ceil(Math.log(((double) i2) / ((double) Math.max(options.outHeight, options.outWidth))) / Math.log(0.5d))));
            }
            new BitmapFactory.Options().inSampleSize = i3;
            return BitmapFactory.decodeResource(context.getResources(), i);
        } catch (Exception unused) {
            return null;
        } finally {
            m3601a((Closeable) null, (C1469j) null);
            m3601a((Closeable) null, (C1469j) null);
        }
    }

    /* renamed from: a */
    public static Bitmap m3581a(File file, int i) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i2 = 1;
            options.inJustDecodeBounds = true;
            fileInputStream = new FileInputStream(file);
            try {
                BitmapFactory.decodeStream(fileInputStream, (Rect) null, options);
                fileInputStream.close();
                if (options.outHeight > i || options.outWidth > i) {
                    i2 = (int) Math.pow(2.0d, (double) ((int) Math.ceil(Math.log(((double) i) / ((double) Math.max(options.outHeight, options.outWidth))) / Math.log(0.5d))));
                }
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inSampleSize = i2;
                fileInputStream2 = new FileInputStream(file);
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream2, (Rect) null, options2);
                    fileInputStream2.close();
                    m3601a((Closeable) fileInputStream, (C1469j) null);
                    m3601a((Closeable) fileInputStream2, (C1469j) null);
                    return decodeStream;
                } catch (Exception unused) {
                    m3601a((Closeable) fileInputStream, (C1469j) null);
                    m3601a((Closeable) fileInputStream2, (C1469j) null);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    m3601a((Closeable) fileInputStream, (C1469j) null);
                    m3601a((Closeable) fileInputStream2, (C1469j) null);
                    throw th;
                }
            } catch (Exception unused2) {
                fileInputStream2 = null;
                m3601a((Closeable) fileInputStream, (C1469j) null);
                m3601a((Closeable) fileInputStream2, (C1469j) null);
                return null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = null;
                m3601a((Closeable) fileInputStream, (C1469j) null);
                m3601a((Closeable) fileInputStream2, (C1469j) null);
                throw th;
            }
        } catch (Exception unused3) {
            fileInputStream2 = null;
            fileInputStream = null;
            m3601a((Closeable) fileInputStream, (C1469j) null);
            m3601a((Closeable) fileInputStream2, (C1469j) null);
            return null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = null;
            fileInputStream = null;
            m3601a((Closeable) fileInputStream, (C1469j) null);
            m3601a((Closeable) fileInputStream2, (C1469j) null);
            throw th;
        }
    }

    /* renamed from: a */
    public static View m3582a(Context context, View view) {
        View c = m3623c(context);
        return c != null ? c : m3583a(view);
    }

    /* renamed from: a */
    public static View m3583a(View view) {
        View rootView;
        if (view == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        View findViewById = rootView.findViewById(16908290);
        return findViewById != null ? findViewById : rootView;
    }

    /* renamed from: a */
    public static C1349d m3584a(JSONObject jSONObject, C1469j jVar) {
        return C1349d.m2453a(AppLovinAdSize.fromString(C1521i.m3487b(jSONObject, "ad_size", (String) null, jVar)), AppLovinAdType.fromString(C1521i.m3487b(jSONObject, "ad_type", (String) null, jVar)), C1521i.m3487b(jSONObject, "zone_id", (String) null, jVar), jVar);
    }

    /* renamed from: a */
    public static C1469j m3585a(AppLovinSdk appLovinSdk) {
        try {
            Field declaredField = appLovinSdk.getClass().getDeclaredField("mSdkImpl");
            declaredField.setAccessible(true);
            return (C1469j) declaredField.get(appLovinSdk);
        } catch (Throwable th) {
            throw new IllegalStateException("Internal error - unable to retrieve SDK implementation: " + th);
        }
    }

    /* renamed from: a */
    public static AppLovinAd m3586a(AppLovinAd appLovinAd, C1469j jVar) {
        if (!(appLovinAd instanceof C1361h)) {
            return appLovinAd;
        }
        C1361h hVar = (C1361h) appLovinAd;
        AppLovinAd dequeueAd = jVar.mo13131o().dequeueAd(hVar.getAdZone());
        C1505q v = jVar.mo13139v();
        v.mo13277b("Utils", "Dequeued ad for dummy ad: " + dequeueAd);
        if (dequeueAd == null) {
            return hVar.mo12829a();
        }
        hVar.mo12830a(dequeueAd);
        ((AppLovinAdBase) dequeueAd).setDummyAd(hVar);
        return dequeueAd;
    }

    /* renamed from: a */
    public static Object m3587a(Object obj, C1469j jVar) {
        int i;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            HashMap hashMap = new HashMap(map.size());
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                hashMap.put(key instanceof String ? (String) key : String.valueOf(key), m3587a(entry.getValue(), jVar));
            }
            return hashMap;
        } else if (obj instanceof List) {
            List<Object> list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            for (Object a : list) {
                arrayList.add(m3587a(a, jVar));
            }
            return arrayList;
        } else if (obj instanceof Date) {
            return String.valueOf(((Date) obj).getTime());
        } else {
            String valueOf = String.valueOf(obj);
            if (obj instanceof String) {
                i = ((Integer) jVar.mo13088a(C1369c.f2882aY)).intValue();
                if (i <= 0 || valueOf.length() <= i) {
                    return valueOf;
                }
            } else if (!(obj instanceof Uri) || (i = ((Integer) jVar.mo13088a(C1369c.f2883aZ)).intValue()) <= 0 || valueOf.length() <= i) {
                return valueOf;
            }
            return valueOf.substring(0, i);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.applovin.impl.sdk.b.e, com.applovin.impl.sdk.b.e<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m3588a(com.applovin.impl.sdk.p025b.C1371e<java.lang.String> r1, com.applovin.impl.sdk.C1469j r2) {
        /*
            java.lang.String r0 = ""
            java.lang.Object r1 = r2.mo13112b(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.utils.C1557r.m3588a(com.applovin.impl.sdk.b.e, com.applovin.impl.sdk.j):java.lang.String");
    }

    /* renamed from: a */
    public static String m3589a(String str) {
        return (str == null || str.length() <= 4) ? "NOKEY" : str.substring(str.length() - 4);
    }

    /* renamed from: a */
    public static String m3590a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(next.getKey());
            sb.append('=');
            sb.append(next.getValue());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m3591a(boolean z, String str) {
        return str.replace("{PLACEMENT}", "").replace("{SOC}", String.valueOf(z));
    }

    /* renamed from: a */
    public static Field m3592a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return m3592a(superclass, str);
        }
    }

    /* renamed from: a */
    public static List<C1374a> m3593a(String str, JSONObject jSONObject, String str2, String str3, C1469j jVar) {
        return m3594a(str, jSONObject, str2, (Map<String, String>) null, str3, jVar);
    }

    /* renamed from: a */
    public static List<C1374a> m3594a(String str, JSONObject jSONObject, String str2, Map<String, String> map, String str3, C1469j jVar) {
        return m3595a(str, jSONObject, str2, map, str3, (Map<String, String>) null, jVar);
    }

    /* renamed from: a */
    public static List<C1374a> m3595a(String str, JSONObject jSONObject, String str2, Map<String, String> map, String str3, Map<String, String> map2, C1469j jVar) {
        if (map == null) {
            map = new HashMap<>(1);
        }
        Map<String, String> map3 = map;
        map3.put("{CLCODE}", str2);
        return m3596a(str, jSONObject, map3, str3, map2, jVar);
    }

    /* renamed from: a */
    public static List<C1374a> m3596a(String str, JSONObject jSONObject, Map<String, String> map, String str2, Map<String, String> map2, C1469j jVar) {
        JSONObject b = C1521i.m3492b(jSONObject, str, new JSONObject(), jVar);
        ArrayList arrayList = new ArrayList(b.length() + 1);
        if (C1553o.m3554b(str2)) {
            arrayList.add(new C1374a(str2, (String) null, map2));
        }
        if (b.length() > 0) {
            Iterator<String> keys = b.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next)) {
                        String optString = b.optString(next);
                        String a = C1553o.m3549a(next, map);
                        if (!TextUtils.isEmpty(optString)) {
                            optString = C1553o.m3549a(optString, map);
                        }
                        arrayList.add(new C1374a(a, optString, map2));
                    }
                } catch (Throwable th) {
                    jVar.mo13139v().mo13278b("Utils", "Failed to create and add postback url.", th);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static List<Class> m3597a(List<String> list, C1469j jVar) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String next : list) {
            try {
                arrayList.add(Class.forName(next));
            } catch (ClassNotFoundException unused) {
                C1505q v = jVar.mo13139v();
                v.mo13281e("Utils", "Failed to create class for name: " + next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<Uri> m3598a(boolean z, C1355g gVar, C1469j jVar, Context context) {
        if (gVar instanceof C1000a) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Uri next : gVar.mo12826w()) {
            if (!jVar.mo13081U().mo13265b(next.getLastPathSegment(), context)) {
                C1505q v = jVar.mo13139v();
                v.mo13281e("Utils", "Cached HTML asset missing: " + next);
                arrayList.add(next);
            }
        }
        if (z) {
            Uri f = gVar.mo11668f();
            if (!jVar.mo13081U().mo13265b(f.getLastPathSegment(), context)) {
                C1505q v2 = jVar.mo13139v();
                v2.mo13281e("Utils", "Cached video missing: " + f);
                arrayList.add(f);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.applovin.impl.sdk.b.e, com.applovin.impl.sdk.b.e<java.lang.String>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m3599a(com.applovin.impl.sdk.p025b.C1371e<java.lang.String> r4, int r5, com.applovin.impl.sdk.C1469j r6) {
        /*
            java.lang.Object r0 = r6.mo13089a(r4)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x001d
            double r0 = java.lang.Math.random()
            double r2 = (double) r5
            double r0 = r0 * r2
            int r5 = (int) r0
            int r5 = r5 + 1
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r6.mo13095a(r4, r5)
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.utils.C1557r.m3599a(com.applovin.impl.sdk.b.e, int, com.applovin.impl.sdk.j):void");
    }

    /* renamed from: a */
    public static void m3600a(AppLovinAdLoadListener appLovinAdLoadListener, C1349d dVar, int i, C1469j jVar) {
        if (appLovinAdLoadListener != null) {
            try {
                if (appLovinAdLoadListener instanceof C1483n) {
                    ((C1483n) appLovinAdLoadListener).mo12865a(dVar, i);
                } else {
                    appLovinAdLoadListener.failedToReceiveAd(i);
                }
            } catch (Throwable th) {
                jVar.mo13139v().mo13278b("Utils", "Unable process a failure to receive an ad", th);
            }
        }
    }

    /* renamed from: a */
    public static void m3601a(Closeable closeable, C1469j jVar) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                if (jVar != null) {
                    C1505q v = jVar.mo13139v();
                    v.mo13278b("Utils", "Unable to close stream: " + closeable, th);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3602a(String str, String str2, Map<String, String> map) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    /* renamed from: a */
    public static void m3603a(String str, JSONObject jSONObject, C1469j jVar) {
        if (jSONObject.has("no_fill_reason")) {
            Object b = C1521i.m3486b(jSONObject, "no_fill_reason", new Object(), jVar);
            C1505q.m3345i("AppLovinSdk", "\n**************************************************\nNO FILL received:\n..ID: \"" + str + "\"\n..SDK KEY: \"" + jVar.mo13136t() + "\"\n..PACKAGE NAME: \"" + jVar.mo13065D().getPackageName() + "\"\n..Reason: " + b + "\n**************************************************\n");
        }
    }

    /* renamed from: a */
    public static void m3604a(HttpURLConnection httpURLConnection, C1469j jVar) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                if (jVar != null) {
                    C1505q v = jVar.mo13139v();
                    v.mo13278b("Utils", "Unable to disconnect connection: " + httpURLConnection, th);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m3605a() {
        Context E = C1469j.m3042E();
        if (E != null) {
            return C1514c.m3412a(E).mo13304a("applovin.sdk.verbose_logging");
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m3606a(long j, long j2) {
        return (j & j2) != 0;
    }

    /* renamed from: a */
    public static boolean m3607a(Context context) {
        if (context == null) {
            context = C1469j.m3042E();
        }
        if (context != null) {
            return C1514c.m3412a(context).mo13305a("applovin.sdk.verbose_logging", false);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m3608a(Context context, Uri uri, C1469j jVar) {
        boolean z;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            if (((Boolean) jVar.mo13088a(C1369c.f3122fd)).booleanValue() && "market".equals(intent.getScheme())) {
                intent.setPackage("com.android.vending");
            }
            jVar.mo13084X().mo13379b();
            context.startActivity(intent);
            z = true;
        } catch (Throwable th) {
            C1505q v = jVar.mo13139v();
            v.mo13278b("Utils", "Unable to open \"" + uri + "\".", th);
            z = false;
        }
        if (!z) {
            jVar.mo13084X().mo13380c();
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m3609a(View view, Activity activity) {
        View rootView;
        if (!(activity == null || view == null)) {
            Window window = activity.getWindow();
            if (window != null) {
                rootView = window.getDecorView();
            } else {
                View findViewById = activity.findViewById(16908290);
                if (findViewById != null) {
                    rootView = findViewById.getRootView();
                }
            }
            return m3610a(view, rootView);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m3610a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (m3610a(view, viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m3611a(AppLovinAdSize appLovinAdSize) {
        return appLovinAdSize == AppLovinAdSize.BANNER || appLovinAdSize == AppLovinAdSize.MREC || appLovinAdSize == AppLovinAdSize.LEADER;
    }

    /* renamed from: a */
    public static boolean m3612a(Object obj, List<String> list, C1469j jVar) {
        if (list == null) {
            return false;
        }
        for (Class isInstance : m3597a(list, jVar)) {
            if (isInstance.isInstance(obj)) {
                if (obj instanceof Map) {
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        if (!(entry.getKey() instanceof String)) {
                            jVar.mo13139v().mo13277b("Utils", "Invalid key type used. Map keys should be of type String.");
                            return false;
                        } else if (!m3612a(entry.getValue(), list, jVar)) {
                            return false;
                        }
                    }
                    return true;
                } else if (!(obj instanceof List)) {
                    return true;
                } else {
                    for (Object a : (List) obj) {
                        if (!m3612a(a, list, jVar)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        C1505q v = jVar.mo13139v();
        v.mo13277b("Utils", "Object '" + obj + "' does not match any of the required types '" + list + "'.");
        return false;
    }

    /* renamed from: a */
    public static boolean m3613a(String str, List<String> list) {
        for (String startsWith : list) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m3614b(Context context) {
        Resources resources;
        Configuration configuration;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return 0;
        }
        return configuration.orientation;
    }

    /* renamed from: b */
    public static long m3615b(float f) {
        return m3622c(m3576a(f));
    }

    /* renamed from: b */
    public static String m3616b(Class cls, String str) {
        try {
            Field a = m3592a(cls, str);
            a.setAccessible(true);
            return (String) a.get((Object) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m3617b(String str) {
        return m3591a(false, str);
    }

    /* renamed from: b */
    public static Map<String, String> m3618b(Map<String, String> map) {
        HashMap hashMap = new HashMap(map);
        for (String str : hashMap.keySet()) {
            String str2 = (String) hashMap.get(str);
            if (str2 != null) {
                hashMap.put(str, C1553o.m3557e(str2));
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public static void m3619b(AppLovinAd appLovinAd, C1469j jVar) {
        if (appLovinAd instanceof AppLovinAdBase) {
            String t = jVar.mo13136t();
            String t2 = ((AppLovinAdBase) appLovinAd).getSdk().mo13136t();
            if (!t.equals(t2)) {
                C1505q.m3345i("AppLovinAd", "Ad was loaded from sdk with key: " + t2 + ", but is being rendered from sdk with key: " + t);
                jVar.mo13072L().mo12926a(C1387g.f3259l);
            }
        }
    }

    /* renamed from: b */
    public static boolean m3620b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: b */
    public static boolean m3621b(C1469j jVar) {
        return (jVar.mo13065D().getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: c */
    private static long m3622c(float f) {
        return (long) Math.round(f);
    }

    /* renamed from: c */
    public static View m3623c(Context context) {
        if (!(context instanceof Activity)) {
            return null;
        }
        return ((Activity) context).getWindow().getDecorView().findViewById(16908290);
    }

    /* renamed from: c */
    public static MaxAdFormat m3624c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase(AdFormat.BANNER)) {
            return MaxAdFormat.BANNER;
        }
        if (str.equalsIgnoreCase("mrec")) {
            return MaxAdFormat.MREC;
        }
        if (str.equalsIgnoreCase("leaderboard") || str.equalsIgnoreCase("leader")) {
            return MaxAdFormat.LEADER;
        }
        if (str.equalsIgnoreCase("interstitial") || str.equalsIgnoreCase("inter")) {
            return MaxAdFormat.INTERSTITIAL;
        }
        if (str.equalsIgnoreCase("rewarded") || str.equalsIgnoreCase("reward")) {
            return MaxAdFormat.REWARDED;
        }
        throw new IllegalArgumentException("Unknown format: " + str);
    }

    /* renamed from: c */
    public static boolean m3625c() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Throwable th) {
            C1505q.m3341c("Utils", "Exception thrown while getting memory state.", th);
        }
        return runningAppProcessInfo.importance == 100 || runningAppProcessInfo.importance == 200;
    }

    /* renamed from: d */
    public static String m3626d(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (!queryIntentActivities.isEmpty()) {
            return queryIntentActivities.get(0).activityInfo.name;
        }
        return null;
    }

    /* renamed from: d */
    public static String m3627d(String str) {
        Uri parse = Uri.parse(str);
        return new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath()).build().toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000a A[Catch:{ all -> 0x002e }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m3628d() {
        /*
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ all -> 0x002e }
        L_0x0004:
            boolean r1 = r0.hasMoreElements()     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.nextElement()     // Catch:{ all -> 0x002e }
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1     // Catch:{ all -> 0x002e }
            java.lang.String r1 = r1.getDisplayName()     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "tun"
            boolean r2 = r1.contains(r2)     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x002c
            java.lang.String r2 = "ppp"
            boolean r2 = r1.contains(r2)     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x002c
            java.lang.String r2 = "ipsec"
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x0004
        L_0x002c:
            r0 = 1
            return r0
        L_0x002e:
            r0 = move-exception
            java.lang.String r1 = "Utils"
            java.lang.String r2 = "Unable to check Network Interfaces"
            com.applovin.impl.sdk.C1505q.m3341c(r1, r2, r0)
        L_0x0036:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.utils.C1557r.m3628d():boolean");
    }

    /* renamed from: e */
    public static int m3629e(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        return windowManager.getDefaultDisplay().getRotation();
    }

    /* renamed from: e */
    public static String m3630e() {
        try {
            for (Field field : Build.VERSION_CODES.class.getFields()) {
                if (field.getInt((Object) null) == Build.VERSION.SDK_INT) {
                    return field.getName();
                }
            }
            return "";
        } catch (Throwable th) {
            C1505q.m3341c("Utils", "Unable to get Android SDK codename", th);
            return "";
        }
    }

    /* renamed from: e */
    public static boolean m3631e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static long m3632f(String str) {
        if (!C1553o.m3554b(str)) {
            return Long.MAX_VALUE;
        }
        try {
            return (long) Color.parseColor(str);
        } catch (Throwable unused) {
            return Long.MAX_VALUE;
        }
    }

    /* renamed from: f */
    public static String m3633f() {
        try {
            return (String) Class.forName("com.safedk.android.SafeDK").getMethod("getVersion", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Throwable unused) {
            return "";
        }
    }
}
