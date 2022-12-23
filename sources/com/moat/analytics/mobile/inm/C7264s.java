package com.moat.analytics.mobile.inm;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;

/* renamed from: com.moat.analytics.mobile.inm.s */
class C7264s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static String f18223a;

    /* renamed from: b */
    private static C7266a f18224b;

    /* renamed from: c */
    private static C7267b f18225c;

    /* renamed from: com.moat.analytics.mobile.inm.s$a */
    static class C7266a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f18227a;

        /* renamed from: b */
        private String f18228b;

        /* renamed from: c */
        private String f18229c;

        /* renamed from: d */
        private String f18230d;

        private C7266a() {
            this.f18227a = false;
            this.f18228b = "_unknown_";
            this.f18229c = "_unknown_";
            this.f18230d = "_unknown_";
            try {
                Context c = C7264s.m18557c();
                if (c != null) {
                    this.f18227a = true;
                    PackageManager packageManager = c.getPackageManager();
                    this.f18229c = c.getPackageName();
                    this.f18228b = packageManager.getApplicationLabel(c.getApplicationInfo()).toString();
                    this.f18230d = packageManager.getInstallerPackageName(this.f18229c);
                    return;
                }
                C7261p.m18544a(3, "Util", (Object) this, "Can't get app name, appContext is null.");
            } catch (Exception e) {
                C7252m.m18508a(e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo49423a() {
            return this.f18228b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo49424b() {
            return this.f18229c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public String mo49425c() {
            String str = this.f18230d;
            return str != null ? str : "_unknown_";
        }
    }

    /* renamed from: com.moat.analytics.mobile.inm.s$b */
    static class C7267b {

        /* renamed from: a */
        String f18231a;

        /* renamed from: b */
        String f18232b;

        /* renamed from: c */
        Integer f18233c;

        /* renamed from: d */
        boolean f18234d;

        /* renamed from: e */
        boolean f18235e;

        /* renamed from: f */
        boolean f18236f;

        private C7267b() {
            this.f18231a = "_unknown_";
            this.f18232b = "_unknown_";
            this.f18233c = -1;
            this.f18234d = false;
            this.f18235e = false;
            this.f18236f = false;
            try {
                Context c = C7264s.m18557c();
                if (c != null) {
                    this.f18236f = true;
                    TelephonyManager telephonyManager = (TelephonyManager) c.getSystemService("phone");
                    this.f18231a = telephonyManager.getSimOperatorName();
                    this.f18232b = telephonyManager.getNetworkOperatorName();
                    this.f18233c = Integer.valueOf(telephonyManager.getPhoneType());
                    this.f18234d = C7264s.m18563i();
                    this.f18235e = C7264s.m18556b(c);
                }
            } catch (Exception e) {
                C7252m.m18508a(e);
            }
        }
    }

    C7264s() {
    }

    /* renamed from: a */
    static double m18552a() {
        try {
            return ((double) m18562h()) / ((double) ((AudioManager) C7221a.m18375a().getSystemService("audio")).getStreamMaxVolume(3));
        } catch (Exception e) {
            C7252m.m18508a(e);
            return 0.0d;
        }
    }

    /* renamed from: a */
    static void m18554a(final Context context) {
        try {
            AsyncTask.execute(new Runnable() {
                public final void run() {
                    String str;
                    try {
                        Class<?> cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
                        Class<?> cls2 = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
                        Object invoke = cls.getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
                        if (!((Boolean) cls2.getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0])).booleanValue()) {
                            String unused = C7264s.f18223a = (String) cls2.getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
                            C7261p.m18544a(3, "Util", (Object) this, "Retrieved Advertising ID = " + C7264s.f18223a);
                            return;
                        }
                        C7261p.m18544a(3, "Util", (Object) this, "User has limited ad tracking");
                    } catch (ClassNotFoundException e) {
                        e = e;
                        str = "ClassNotFoundException while retrieving Advertising ID";
                        C7261p.m18546a("Util", (Object) this, str, e);
                    } catch (NoSuchMethodException e2) {
                        e = e2;
                        str = "NoSuchMethodException while retrieving Advertising ID";
                        C7261p.m18546a("Util", (Object) this, str, e);
                    } catch (Exception e3) {
                        C7252m.m18508a(e3);
                    }
                }
            });
        } catch (Exception e) {
            C7252m.m18508a(e);
        }
    }

    /* renamed from: b */
    static String m18555b() {
        return f18223a;
    }

    /* renamed from: b */
    static boolean m18556b(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: c */
    static Context m18557c() {
        WeakReference<Context> weakReference = ((C7250k) MoatAnalytics.getInstance()).f18191e;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }

    /* renamed from: d */
    static C7266a m18558d() {
        C7266a aVar = f18224b;
        if (aVar == null || !aVar.f18227a) {
            f18224b = new C7266a();
        }
        return f18224b;
    }

    /* renamed from: e */
    static C7267b m18559e() {
        C7267b bVar = f18225c;
        if (bVar == null || !bVar.f18236f) {
            f18225c = new C7267b();
        }
        return f18225c;
    }

    /* renamed from: h */
    private static int m18562h() {
        try {
            return ((AudioManager) C7221a.m18375a().getSystemService("audio")).getStreamVolume(3);
        } catch (Exception e) {
            C7252m.m18508a(e);
            return 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static boolean m18563i() {
        int i;
        Context c = m18557c();
        if (c != null) {
            int i2 = Build.VERSION.SDK_INT;
            ContentResolver contentResolver = c.getContentResolver();
            i = i2 >= 17 ? Settings.Global.getInt(contentResolver, "adb_enabled", 0) : Settings.Secure.getInt(contentResolver, "adb_enabled", 0);
        } else {
            i = 0;
        }
        return i == 1;
    }
}
