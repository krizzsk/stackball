package com.fyber.inneractive.sdk.util;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.p029a.C2681a;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.util.l */
public class C3657l {

    /* renamed from: a */
    protected static Application f9937a;

    /* renamed from: b */
    static final Comparator<ResolveInfo> f9938b = new Comparator<ResolveInfo>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            ResolveInfo resolveInfo = (ResolveInfo) obj;
            ResolveInfo resolveInfo2 = (ResolveInfo) obj2;
            if (resolveInfo.activityInfo == null || resolveInfo2.activityInfo == null || resolveInfo.activityInfo.packageName == null) {
                return 1;
            }
            return resolveInfo.activityInfo.packageName.compareTo(resolveInfo2.activityInfo.packageName);
        }
    };

    /* renamed from: p */
    public static Application m9125p() {
        return f9937a;
    }

    /* renamed from: a */
    public static void m9110a(Application application) {
        f9937a = application;
    }

    /* renamed from: q */
    public static void m9126q() {
        C3661a.m9136a();
    }

    /* renamed from: a */
    public static int m9106a(int i) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) f9937a.getSystemService("window");
        if (windowManager == null) {
            return i;
        }
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return (int) ((((float) i) / displayMetrics.density) + 0.5f);
    }

    /* renamed from: b */
    public static int m9119b(int i) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) f9937a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return (int) ((((float) i) * displayMetrics.density) + 0.5f);
    }

    /* renamed from: s */
    public static int m9128s() {
        return m9107a((Context) f9937a);
    }

    /* renamed from: c */
    public static boolean m9122c(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m9117a(String... strArr) {
        for (int i = 0; i < 2; i++) {
            if (!m9122c(strArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static int m9107a(Context context) {
        int i = (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) ? 1 : context.getResources().getConfiguration().orientation;
        try {
            if (Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1) {
                i = 1;
            }
        } catch (Throwable th) {
            IAlog.m9032a("failed getOrientation. returning portrait orientation", th, new Object[0]);
        }
        Object[] objArr = new Object[1];
        objArr[0] = i == 1 ? "portrait" : "landscape";
        IAlog.m9034b("The device orientation: %s", objArr);
        return i;
    }

    /* renamed from: a */
    public static void m9112a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: t */
    public static void m9129t() {
        if (Build.VERSION.SDK_INT < 21) {
            CookieSyncManager.createInstance(f9937a);
            CookieSyncManager.getInstance().startSync();
        }
    }

    /* renamed from: u */
    public static void m9130u() {
        if (Build.VERSION.SDK_INT < 21) {
            CookieSyncManager.getInstance().startSync();
        }
    }

    /* renamed from: v */
    public static void m9131v() {
        if (Build.VERSION.SDK_INT < 21) {
            CookieSyncManager.getInstance().stopSync();
        }
    }

    /* renamed from: a */
    public static double m9104a(Location location) {
        if (Build.VERSION.SDK_INT < 17) {
            long currentTimeMillis = System.currentTimeMillis();
            long time = location.getTime();
            if (time <= 0 || currentTimeMillis <= 0) {
                return 0.0d;
            }
            return ((double) (currentTimeMillis - time)) / 1000.0d;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long elapsedRealtimeNanos2 = location.getElapsedRealtimeNanos();
        if (elapsedRealtimeNanos <= 0 || elapsedRealtimeNanos2 <= 0) {
            return 0.0d;
        }
        return ((double) (elapsedRealtimeNanos - elapsedRealtimeNanos2)) / 1.0E9d;
    }

    /* renamed from: b */
    public static float m9118b(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return location.getVerticalAccuracyMeters();
        }
        return 0.0f;
    }

    /* renamed from: a */
    public static void m9113a(final WebView webView) {
        new Runnable() {
            public final void run() {
                webView.getSettings().setDisplayZoomControls(false);
            }
        }.run();
    }

    /* renamed from: c */
    public static Drawable m9121c(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return f9937a.getDrawable(i);
        }
        return f9937a.getResources().getDrawable(i);
    }

    /* renamed from: a */
    public static <P> void m9111a(AsyncTask<P, ?, ?> asyncTask, P... pArr) {
        asyncTask.executeOnExecutor(C3662m.f9942a, pArr);
    }

    /* renamed from: e */
    public static String m9124e(String str) {
        return C3661a.m9135a(str);
    }

    /* renamed from: a */
    public static void m9115a(Throwable th, SharedPreferences sharedPreferences) {
        String b = C3670q.m9160b(th);
        if (b.contains("com.fyber.inneractive")) {
            sharedPreferences.edit().putString("FyberExceptionKey", b).putString("FyberVersionKey", InneractiveAdManager.getVersion()).putString("FyberNameKey", th.getClass().getName()).putString("FyberDescriptionKey", th.getLocalizedMessage()).commit();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.l$a */
    private static class C3661a {

        /* renamed from: a */
        private static Map<String, String> f9941a = new HashMap();

        /* renamed from: a */
        static String m9135a(String str) {
            String str2 = f9941a.get(str);
            if (TextUtils.isEmpty(str2)) {
                IAlog.m9034b("Assets cache: reading file: %s", str);
                try {
                    InputStream open = C3657l.f9937a.getAssets().open(str, 3);
                    StringBuffer stringBuffer = new StringBuffer();
                    byte[] bArr = new byte[4096];
                    for (int i = 0; i != -1; i = open.read(bArr)) {
                        stringBuffer.append(new String(bArr, 0, i));
                    }
                    open.close();
                    str2 = stringBuffer.toString();
                    IAlog.m9034b("Assets cache: success - %s", str);
                } catch (IOException e) {
                    IAlog.m9034b("Assets cache: Could not read response from file", new Object[0]);
                    IAlog.m9033a(C3670q.m9154a((Throwable) e), new Object[0]);
                }
                if (!TextUtils.isEmpty(str2)) {
                    f9941a.put(str, str2);
                }
            } else {
                IAlog.m9034b("Assets cache: returning cached assets for %s", str);
            }
            return str2;
        }

        /* renamed from: a */
        static void m9136a() {
            f9941a.clear();
        }
    }

    /* renamed from: a */
    public static String m9109a(String str, Collection<String> collection) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C$r8$backportedMethods$utility$String$2$joinIterable.join(str, collection);
        }
        return TextUtils.join(str, collection);
    }

    /* renamed from: b */
    public static String m9120b(String str, Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        for (Integer valueOf : collection) {
            arrayList.add(String.valueOf(valueOf));
        }
        return m9109a(str, (Collection<String>) arrayList);
    }

    /* renamed from: a */
    public static String m9108a(String str, Context context) {
        FileInputStream fileInputStream;
        String str2 = null;
        try {
            fileInputStream = context.openFileInput(str);
            try {
                int available = fileInputStream.available();
                byte[] bArr = new byte[available];
                if (fileInputStream.read(bArr) == available) {
                    str2 = new String(bArr, "UTF-8");
                }
            } catch (Throwable unused) {
                try {
                    IAlog.m9034b("readFileFromContext failed reading %s", str);
                    C3670q.m9161b((Closeable) fileInputStream);
                    return str2;
                } catch (Throwable th) {
                    C3670q.m9161b((Closeable) fileInputStream);
                    throw th;
                }
            }
        } catch (Throwable unused2) {
            fileInputStream = null;
            IAlog.m9034b("readFileFromContext failed reading %s", str);
            C3670q.m9161b((Closeable) fileInputStream);
            return str2;
        }
        C3670q.m9161b((Closeable) fileInputStream);
        return str2;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static boolean m9116a(String str, Context context, byte[] bArr) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = context.openFileOutput(str, 0);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                C3670q.m9161b((Closeable) fileOutputStream);
                return true;
            } catch (Throwable unused) {
                try {
                    IAlog.m9034b("writeFileWithContext failed writing %s", str);
                    C3670q.m9161b((Closeable) fileOutputStream);
                    return false;
                } catch (Throwable th) {
                    C3670q.m9161b((Closeable) fileOutputStream);
                    throw th;
                }
            }
        } catch (Throwable unused2) {
            fileOutputStream = null;
            IAlog.m9034b("writeFileWithContext failed writing %s", str);
            C3670q.m9161b((Closeable) fileOutputStream);
            return false;
        }
    }

    /* renamed from: y */
    public static String m9134y() {
        try {
            return Environment.getExternalStorageState();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static void m9114a(final C2681a aVar) {
        C3662m.m9138a(new Runnable() {
            public final void run() {
                try {
                    if (C3657l.f9937a != null && aVar != null) {
                        C3657l.f9937a.getSharedPreferences("IAConfigurationPreferences", 0).edit().remove(aVar.mo17886a()).apply();
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* renamed from: a */
    public static int m9105a(float f) {
        return (int) (TypedValue.applyDimension(1, f, f9937a.getResources().getDisplayMetrics()) + 0.5f);
    }

    /* renamed from: r */
    public static int m9127r() {
        return ((WindowManager) f9937a.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    /* renamed from: d */
    public static boolean m9123d(String str) {
        try {
            if (f9937a.checkCallingOrSelfPermission(str) == 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: w */
    public static int m9132w() {
        int i;
        WindowManager windowManager;
        Display defaultDisplay;
        Application application = f9937a;
        if (application == null || (windowManager = (WindowManager) application.getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            i = -1;
        } else {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.y;
        }
        if (i != -1) {
            return i;
        }
        try {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            if (displayMetrics != null) {
                i = displayMetrics.heightPixels;
            }
        } catch (Throwable unused) {
        }
        if (i == -1) {
            return 480;
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025 A[SYNTHETIC, Splitter:B:12:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m9133x() {
        /*
            r0 = -1
            android.app.Application r1 = f9937a     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0022
            android.app.Application r1 = f9937a     // Catch:{ all -> 0x0022 }
            java.lang.String r2 = "window"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ all -> 0x0022 }
            android.view.WindowManager r1 = (android.view.WindowManager) r1     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0022
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0022
            android.graphics.Point r2 = new android.graphics.Point     // Catch:{ all -> 0x0022 }
            r2.<init>()     // Catch:{ all -> 0x0022 }
            r1.getSize(r2)     // Catch:{ all -> 0x0022 }
            int r1 = r2.x     // Catch:{ all -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r1 = -1
        L_0x0023:
            if (r1 != r0) goto L_0x0037
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()     // Catch:{ all -> 0x0032 }
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x0033
            int r1 = r2.widthPixels     // Catch:{ all -> 0x0032 }
            goto L_0x0033
        L_0x0032:
        L_0x0033:
            if (r1 != r0) goto L_0x0037
            r1 = 320(0x140, float:4.48E-43)
        L_0x0037:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C3657l.m9133x():int");
    }
}
