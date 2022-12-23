package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.go */
/* compiled from: SdkContext */
public final class C5314go {

    /* renamed from: a */
    private static final String f12185a = C5314go.class.getSimpleName();

    /* renamed from: b */
    private static Context f12186b;

    /* renamed from: c */
    private static String f12187c = "";

    /* renamed from: d */
    private static String f12188d = null;

    /* renamed from: e */
    private static String f12189e = null;

    /* renamed from: f */
    private static AtomicBoolean f12190f = new AtomicBoolean();

    /* renamed from: g */
    private static boolean f12191g = false;

    /* renamed from: h */
    private static final ExecutorService f12192h = Executors.newSingleThreadExecutor(new C5326gv(f12185a));

    /* renamed from: a */
    public static void m12195a(Runnable runnable) {
        f12192h.submit(runnable);
    }

    /* renamed from: e */
    private static void m12209e(Context context) {
        m12190a(context.getApplicationContext());
        f12190f.set(true);
        if (Build.VERSION.SDK_INT < 17 && f12187c == null) {
            try {
                f12187c = new WebView(context).getSettings().getUserAgentString();
            } catch (Exception unused) {
                m12190a((Context) null);
            }
        }
        m12221n();
        m12218k();
    }

    /* renamed from: a */
    public static void m12193a(Context context, String str) {
        m12209e(context);
        f12188d = str;
    }

    /* renamed from: b */
    public static void m12199b(Context context, String str) {
        m12209e(context);
        f12189e = str;
    }

    /* renamed from: a */
    public static boolean m12197a() {
        return f12186b != null;
    }

    /* renamed from: b */
    public static boolean m12202b() {
        return (f12186b == null || f12188d == null) ? false : true;
    }

    /* renamed from: c */
    public static Context m12203c() {
        return f12186b;
    }

    /* renamed from: d */
    public static Application m12206d() {
        Context context = f12186b;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        return null;
    }

    /* renamed from: a */
    public static void m12190a(Context context) {
        f12186b = context;
    }

    /* renamed from: a */
    public static void m12196a(boolean z) {
        f12191g = z;
    }

    /* renamed from: e */
    public static boolean m12210e() {
        return f12191g;
    }

    /* renamed from: f */
    public static String m12211f() {
        String str = f12188d;
        return str == null ? f12189e : str;
    }

    /* renamed from: g */
    public static String m12213g() {
        return f12188d;
    }

    /* renamed from: h */
    public static String m12215h() {
        return f12189e;
    }

    /* renamed from: i */
    public static String m12216i() {
        if (TextUtils.isEmpty(f12187c) && Build.VERSION.SDK_INT >= 17) {
            f12187c = m12212f(f12186b);
        }
        return f12187c;
    }

    /* renamed from: j */
    public static boolean m12217j() {
        return f12190f.get();
    }

    /* renamed from: b */
    public static void m12201b(boolean z) {
        f12190f.set(z);
    }

    /* renamed from: b */
    public static File m12198b(Context context) {
        return new File(context.getFilesDir(), "im_cached_content");
    }

    /* renamed from: c */
    public static File m12204c(Context context) {
        return new File(context.getFilesDir(), "as_cached_content");
    }

    /* renamed from: a */
    public static void m12194a(File file, String str) {
        if (str == null || str.trim().length() == 0) {
            C5362hv.m12399a(file);
        } else {
            C5362hv.m12399a(new File(file, str));
        }
    }

    /* renamed from: n */
    private static void m12221n() {
        File b = m12198b(m12203c());
        if (!b.mkdir()) {
            b.isDirectory();
        }
    }

    /* renamed from: k */
    public static void m12218k() {
        Context c = m12203c();
        if (c != null) {
            File c2 = m12204c(c);
            if (!c2.mkdir()) {
                c2.isDirectory();
            }
        }
    }

    /* renamed from: l */
    public static void m12219l() {
        C5319gs.m12242a();
    }

    /* renamed from: f */
    private static String m12212f(Context context) {
        try {
            return m12214g(context);
        } catch (C5008bd e) {
            C5275fn.m12068a().mo40590a(new C5308gk(e));
            try {
                String property = System.getProperty("http.agent");
                if (property == null) {
                    return "";
                }
                return property;
            } catch (Exception e2) {
                C5275fn.m12068a().mo40590a(new C5308gk(e2));
                return "";
            }
        }
    }

    /* renamed from: g */
    private static String m12214g(Context context) throws C5008bd {
        try {
            return WebSettings.getDefaultUserAgent(context.getApplicationContext());
        } catch (Exception e) {
            throw new C5008bd(e.getMessage());
        }
    }

    /* renamed from: c */
    public static boolean m12205c(Context context, String str) {
        if (context == null || str == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 23) {
            return m12208d(context, str);
        }
        if (packageManager.checkPermission(str, packageManager.getNameForUid(Binder.getCallingUid())) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m12208d(Context context, String str) {
        if (!(context == null || str == null)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    for (String equals : packageInfo.requestedPermissions) {
                        if (equals.equals(str)) {
                            return true;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m12191a(Context context, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.getApplication().unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            activity.getApplication().registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* renamed from: a */
    public static void m12192a(Context context, Intent intent) {
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static File m12189a(String str) {
        m12221n();
        File b = m12198b(m12203c());
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode() & Integer.MAX_VALUE);
        return new File(b, valueOf + String.valueOf(str.substring(length).hashCode() & Integer.MAX_VALUE));
    }

    /* renamed from: b */
    public static void m12200b(String str) {
        if (m12203c() != null) {
            C5307gj.m12157a(m12203c(), "coppa_store").mo40645a("im_accid", str);
        }
    }

    /* renamed from: m */
    public static String m12220m() {
        if (m12203c() != null) {
            return C5307gj.m12157a(m12203c(), "coppa_store").mo40648b("im_accid");
        }
        return null;
    }

    /* renamed from: d */
    public static void m12207d(Context context) {
        try {
            File file = new File(context.getCacheDir(), "im_cached_content");
            if (file.exists()) {
                C5362hv.m12399a(file);
            }
        } catch (Exception unused) {
        }
    }
}
