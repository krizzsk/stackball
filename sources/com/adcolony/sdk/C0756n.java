package com.adcolony.sdk;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.os.Build;
import android.provider.Settings;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.adcolony.sdk.C0580a0;
import com.appsflyer.ServerParameters;
import com.appsflyer.internal.referrer.Payload;
import com.tapjoy.TapjoyConstants;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.adcolony.sdk.n */
class C0756n {

    /* renamed from: h */
    static final String f1202h = "Production";

    /* renamed from: i */
    static final int f1203i = 2000;

    /* renamed from: j */
    private static int f1204j = 2;

    /* renamed from: a */
    private String f1205a = "";

    /* renamed from: b */
    private final C0646e f1206b = new C0646e();

    /* renamed from: c */
    private boolean f1207c;

    /* renamed from: d */
    private C0897z0 f1208d = C0894y.m1151b();

    /* renamed from: e */
    private String f1209e = "android";

    /* renamed from: f */
    private String f1210f = "android_native";

    /* renamed from: g */
    private String f1211g = "";

    /* renamed from: com.adcolony.sdk.n$a */
    class C0757a implements C0685f0 {

        /* renamed from: com.adcolony.sdk.n$a$a */
        class C0758a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0645d0 f1213a;

            C0758a(C0645d0 d0Var) {
                this.f1213a = d0Var;
            }

            public void run() {
                try {
                    if (C0756n.this.mo9742g() < 14) {
                        new C0759b(this.f1213a, false).execute(new Void[0]);
                    } else {
                        new C0759b(this.f1213a, false).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                    }
                } catch (RuntimeException unused) {
                    new C0580a0.C0581a().mo9419a("Error retrieving device info, disabling AdColony.").mo9421a(C0580a0.f192j);
                    AdColony.disable();
                } catch (StackOverflowError unused2) {
                    new C0580a0.C0581a().mo9419a("StackOverflowError on info AsyncTask execution, disabling AdColony").mo9421a(C0580a0.f192j);
                    AdColony.disable();
                }
            }
        }

        C0757a() {
        }

        /* renamed from: a */
        public void mo9426a(C0645d0 d0Var) {
            C0849u0.m931b((Runnable) new C0758a(d0Var));
        }
    }

    C0756n() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public long mo9719A() {
        Runtime runtime = Runtime.getRuntime();
        return (runtime.totalMemory() - runtime.freeMemory()) / ((long) 1048576);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public String mo9720B() {
        return Build.MODEL;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public int mo9721C() {
        Context b = C0578a.m141b();
        if (b == null) {
            return 2;
        }
        int i = b.getResources().getConfiguration().orientation;
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return 2;
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public String mo9722D() {
        return Build.VERSION.RELEASE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public String mo9723E() {
        return "4.6.5";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public String mo9724F() {
        TelephonyManager telephonyManager;
        Context b = C0578a.m141b();
        if (b == null || (telephonyManager = (TelephonyManager) b.getSystemService("phone")) == null) {
            return "";
        }
        return telephonyManager.getSimCountryIso();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public int mo9725G() {
        return TimeZone.getDefault().getOffset(15) / 60000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public String mo9726H() {
        return TimeZone.getDefault().getID();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo9727I() {
        this.f1206b.mo9538a(false);
        C0578a.m139a("Device.get_info", (C0685f0) new C0757a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean mo9728J() {
        Context b = C0578a.m141b();
        if (b == null) {
            return false;
        }
        DisplayMetrics displayMetrics = b.getResources().getDisplayMetrics();
        float f = ((float) displayMetrics.widthPixels) / displayMetrics.xdpi;
        float f2 = ((float) displayMetrics.heightPixels) / displayMetrics.ydpi;
        if (Math.sqrt((double) ((f * f) + (f2 * f2))) >= 6.0d) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9732a(C0897z0 z0Var) {
        this.f1208d = z0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9737b(boolean z) {
        this.f1207c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo9738c() {
        return this.f1205a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo9739d() {
        Context b = C0578a.m141b();
        if (b == null) {
            return "";
        }
        return Settings.Secure.getString(b.getContentResolver(), TapjoyConstants.TJC_ADVERTISING_ID);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo9740e() {
        Context b = C0578a.m141b();
        if (b == null) {
            return false;
        }
        try {
            if (Settings.Secure.getInt(b.getContentResolver(), "limit_ad_tracking") != 0) {
                return true;
            }
            return false;
        } catch (Settings.SettingNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo9741f() {
        Context b = C0578a.m141b();
        if (b == null) {
            return "";
        }
        return Settings.Secure.getString(b.getContentResolver(), "android_id");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo9742g() {
        return Build.VERSION.SDK_INT;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public double mo9743h() {
        Context b = C0578a.m141b();
        if (b == null) {
            return 0.0d;
        }
        try {
            Intent registerReceiver = b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return 0.0d;
            }
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra < 0 || intExtra2 < 0) {
                return 0.0d;
            }
            return ((double) intExtra) / ((double) intExtra2);
        } catch (RuntimeException unused) {
            return 0.0d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public String mo9744i() {
        Context b = C0578a.m141b();
        String str = "";
        if (b == null) {
            return str;
        }
        TelephonyManager telephonyManager = (TelephonyManager) b.getSystemService("phone");
        if (telephonyManager != null) {
            str = telephonyManager.getNetworkOperatorName();
        }
        return str.length() == 0 ? "unknown" : str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo9745j() {
        return Build.VERSION.SDK_INT < 23 || NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public String mo9746k() {
        return this.f1211g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public String mo9747l() {
        return Locale.getDefault().getCountry();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo9748m() {
        TimeZone timeZone = TimeZone.getDefault();
        if (!timeZone.inDaylightTime(new Date())) {
            return 0;
        }
        return timeZone.getDSTSavings() / 60000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo9749n() {
        int i;
        Context b = C0578a.m141b();
        if (b == null || Build.VERSION.SDK_INT < 29 || (i = b.getResources().getConfiguration().uiMode & 48) == 16 || i != 32) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public float mo9750o() {
        Context b = C0578a.m141b();
        if (b == null) {
            return 0.0f;
        }
        return b.getResources().getDisplayMetrics().density;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C0897z0 mo9751p() {
        return mo9729a(-1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public String mo9752q() {
        return mo9728J() ? "tablet" : "phone";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo9753r() {
        Context b = C0578a.m141b();
        if (b == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            return b.getResources().getConfiguration().densityDpi;
        }
        try {
            WindowManager windowManager = (WindowManager) b.getSystemService("window");
            if (windowManager == null) {
                return 0;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.densityDpi;
        } catch (RuntimeException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public Rect mo9754s() {
        Rect rect = new Rect();
        Context b = C0578a.m141b();
        if (b == null) {
            return rect;
        }
        try {
            WindowManager windowManager = (WindowManager) b.getSystemService("window");
            if (windowManager == null) {
                return rect;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        } catch (RuntimeException unused) {
            return rect;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:32|33) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r1 = r2.getWindowInsets().getInsetsIgnoringVisibility((android.view.WindowInsets.Type.navigationBars() | android.view.WindowInsets.Type.displayCutout()) | android.view.WindowInsets.Type.statusBars());
        r1 = new android.graphics.Rect(0, 0, r2.getBounds().width() - (r1.right + r1.left), r2.getBounds().height() - (r1.top + r1.bottom));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00d8 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Rect mo9755t() {
        /*
            r8 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.content.Context r1 = com.adcolony.sdk.C0578a.m141b()
            if (r1 == 0) goto L_0x0111
            java.lang.String r2 = "window"
            java.lang.Object r2 = r1.getSystemService(r2)     // Catch:{ RuntimeException -> 0x0111 }
            android.view.WindowManager r2 = (android.view.WindowManager) r2     // Catch:{ RuntimeException -> 0x0111 }
            if (r2 == 0) goto L_0x0111
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ RuntimeException -> 0x0111 }
            r4 = 17
            r5 = 0
            if (r3 >= r4) goto L_0x0039
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics     // Catch:{ RuntimeException -> 0x0111 }
            r3.<init>()     // Catch:{ RuntimeException -> 0x0111 }
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch:{ RuntimeException -> 0x0111 }
            r2.getMetrics(r3)     // Catch:{ RuntimeException -> 0x0111 }
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r3.widthPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r1 = com.adcolony.sdk.C0849u0.m943f((android.content.Context) r1)     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3 - r1
            r2.<init>(r5, r5, r4, r3)     // Catch:{ RuntimeException -> 0x0111 }
            r0 = r2
            goto L_0x0111
        L_0x0039:
            r4 = 30
            if (r3 >= r4) goto L_0x008d
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics     // Catch:{ RuntimeException -> 0x0111 }
            r3.<init>()     // Catch:{ RuntimeException -> 0x0111 }
            android.util.DisplayMetrics r4 = new android.util.DisplayMetrics     // Catch:{ RuntimeException -> 0x0111 }
            r4.<init>()     // Catch:{ RuntimeException -> 0x0111 }
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch:{ RuntimeException -> 0x0111 }
            r2.getMetrics(r3)     // Catch:{ RuntimeException -> 0x0111 }
            r2.getRealMetrics(r4)     // Catch:{ RuntimeException -> 0x0111 }
            int r2 = com.adcolony.sdk.C0849u0.m943f((android.content.Context) r1)     // Catch:{ RuntimeException -> 0x0111 }
            int r1 = com.adcolony.sdk.C0849u0.m921b((android.content.Context) r1)     // Catch:{ RuntimeException -> 0x0111 }
            int r6 = r4.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r7 = r3.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r6 = r6 - r7
            if (r6 > 0) goto L_0x006d
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r3.widthPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3 - r2
            r1.<init>(r5, r5, r4, r3)     // Catch:{ RuntimeException -> 0x0111 }
        L_0x006a:
            r0 = r1
            goto L_0x0111
        L_0x006d:
            if (r1 <= 0) goto L_0x0082
            if (r6 > r2) goto L_0x0074
            if (r1 <= r2) goto L_0x0074
            goto L_0x0082
        L_0x0074:
            android.graphics.Rect r6 = new android.graphics.Rect     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3.widthPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r4.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r1 = r1 + r2
            int r4 = r4 - r1
            r6.<init>(r5, r5, r3, r4)     // Catch:{ RuntimeException -> 0x0111 }
            r0 = r6
            goto L_0x0111
        L_0x0082:
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3.widthPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r4.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r4 - r2
            r1.<init>(r5, r5, r3, r4)     // Catch:{ RuntimeException -> 0x0111 }
            goto L_0x006a
        L_0x008d:
            android.view.WindowMetrics r2 = r2.getCurrentWindowMetrics()     // Catch:{ RuntimeException -> 0x0111 }
            android.graphics.Point r3 = new android.graphics.Point     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r3.<init>()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            android.graphics.Point r4 = new android.graphics.Point     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r4.<init>()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            android.view.Display r1 = r1.getDisplay()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r1.getCurrentSizeRange(r3, r4)     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            android.graphics.Rect r1 = r2.getBounds()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r1 = r1.width()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            android.graphics.Rect r6 = r2.getBounds()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r6 = r6.height()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r7 = 2
            if (r1 <= r6) goto L_0x00b7
            r1 = 2
            goto L_0x00b8
        L_0x00b7:
            r1 = 1
        L_0x00b8:
            if (r1 != r7) goto L_0x00c4
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r4 = r4.x     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r3 = r3.y     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r1.<init>(r4, r3)     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            goto L_0x00cd
        L_0x00c4:
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r3 = r3.x     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r4 = r4.y     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r1.<init>(r3, r4)     // Catch:{ UnsupportedOperationException -> 0x00d8 }
        L_0x00cd:
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r4 = r1.x     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r1 = r1.y     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r3.<init>(r5, r5, r4, r1)     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r0 = r3
            goto L_0x0111
        L_0x00d8:
            android.view.WindowInsets r1 = r2.getWindowInsets()     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = android.view.WindowInsets.Type.navigationBars()     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = android.view.WindowInsets.Type.displayCutout()     // Catch:{ RuntimeException -> 0x0111 }
            r3 = r3 | r4
            int r4 = android.view.WindowInsets.Type.statusBars()     // Catch:{ RuntimeException -> 0x0111 }
            r3 = r3 | r4
            android.graphics.Insets r1 = r1.getInsetsIgnoringVisibility(r3)     // Catch:{ RuntimeException -> 0x0111 }
            android.graphics.Rect r3 = r2.getBounds()     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3.width()     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r1.right     // Catch:{ RuntimeException -> 0x0111 }
            int r6 = r1.left     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r4 + r6
            int r3 = r3 - r4
            android.graphics.Rect r2 = r2.getBounds()     // Catch:{ RuntimeException -> 0x0111 }
            int r2 = r2.height()     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r1.top     // Catch:{ RuntimeException -> 0x0111 }
            int r1 = r1.bottom     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r4 + r1
            int r2 = r2 - r4
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ RuntimeException -> 0x0111 }
            r1.<init>(r5, r5, r3, r2)     // Catch:{ RuntimeException -> 0x0111 }
            goto L_0x006a
        L_0x0111:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0756n.mo9755t():android.graphics.Rect");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public String mo9756u() {
        return Locale.getDefault().getLanguage();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C0897z0 mo9757v() {
        return this.f1208d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo9758w() {
        return this.f1207c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public String mo9759x() {
        return "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public String mo9760y() {
        return Build.MANUFACTURER;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public int mo9761z() {
        ActivityManager activityManager;
        Context b = C0578a.m141b();
        if (b == null || (activityManager = (ActivityManager) b.getSystemService("activity")) == null) {
            return 0;
        }
        return activityManager.getMemoryClass();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9733a(String str) {
        this.f1205a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9736b(String str) {
        this.f1211g = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9734a(boolean z) {
        this.f1206b.mo9538a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo9735b() {
        return C0849u0.m909a(C0578a.m143c().mo9571C());
    }

    /* renamed from: com.adcolony.sdk.n$b */
    private static class C0759b extends AsyncTask<Void, Void, C0897z0> {

        /* renamed from: a */
        private C0645d0 f1215a;

        /* renamed from: b */
        private boolean f1216b;

        C0759b(C0645d0 d0Var, boolean z) {
            this.f1215a = d0Var;
            this.f1216b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C0897z0 doInBackground(Void... voidArr) {
            if (Build.VERSION.SDK_INT < 14) {
                return null;
            }
            return C0578a.m143c().mo9611o().mo9729a(2000);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(C0897z0 z0Var) {
            if (this.f1216b) {
                new C0645d0("Device.update_info", 1, z0Var).mo9536d();
            } else {
                this.f1215a.mo9530a(z0Var).mo9536d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo9730a() {
        return System.getProperty("os.arch").toLowerCase(Locale.ENGLISH);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo9731a(Context context) {
        return C0849u0.m939d(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0897z0 mo9729a(long j) {
        C0897z0 b = C0894y.m1151b();
        C0693i c = C0578a.m143c();
        C0894y.m1148a(b, TapjoyConstants.TJC_CARRIER_NAME, mo9744i());
        C0894y.m1148a(b, "data_path", C0578a.m143c().mo9571C().mo9828b());
        C0894y.m1156b(b, "device_api", mo9742g());
        Rect s = mo9754s();
        C0894y.m1156b(b, "screen_width", s.width());
        C0894y.m1156b(b, "screen_height", s.height());
        C0894y.m1156b(b, "display_dpi", mo9753r());
        C0894y.m1148a(b, TapjoyConstants.TJC_DEVICE_TYPE_NAME, mo9752q());
        C0894y.m1148a(b, "locale_language_code", mo9756u());
        C0894y.m1148a(b, "ln", mo9756u());
        C0894y.m1148a(b, "locale_country_code", mo9747l());
        C0894y.m1148a(b, "locale", mo9747l());
        C0894y.m1148a(b, TapjoyConstants.TJC_DEVICE_MAC_ADDRESS, mo9759x());
        C0894y.m1148a(b, "manufacturer", mo9760y());
        C0894y.m1148a(b, "device_brand", mo9760y());
        C0894y.m1148a(b, "media_path", C0578a.m143c().mo9571C().mo9829c());
        C0894y.m1148a(b, "temp_storage_path", C0578a.m143c().mo9571C().mo9830d());
        C0894y.m1156b(b, "memory_class", mo9761z());
        C0894y.m1157b(b, "memory_used_mb", mo9719A());
        C0894y.m1148a(b, ServerParameters.MODEL, mo9720B());
        C0894y.m1148a(b, "device_model", mo9720B());
        C0894y.m1148a(b, TapjoyConstants.TJC_SDK_TYPE, this.f1210f);
        C0894y.m1148a(b, ServerParameters.SDK_DATA_SDK_VERSION, mo9723E());
        C0894y.m1148a(b, "network_type", c.mo9618v().mo9567e());
        C0894y.m1148a(b, TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, mo9722D());
        C0894y.m1148a(b, "os_name", this.f1209e);
        C0894y.m1148a(b, "platform", this.f1209e);
        C0894y.m1148a(b, "arch", mo9730a());
        C0894y.m1148a(b, "user_id", C0894y.m1169h(c.mo9620x().mo9271b(), "user_id"));
        C0894y.m1148a(b, "app_id", c.mo9620x().mo9270a());
        C0894y.m1148a(b, "app_bundle_name", C0849u0.m925b());
        C0894y.m1148a(b, "app_bundle_version", C0849u0.m934c());
        C0894y.m1145a(b, "battery_level", mo9743h());
        C0894y.m1148a(b, "cell_service_country_code", mo9724F());
        C0894y.m1148a(b, "timezone_ietf", mo9726H());
        C0894y.m1156b(b, "timezone_gmt_m", mo9725G());
        C0894y.m1156b(b, "timezone_dst_m", mo9748m());
        C0894y.m1147a(b, "launch_metadata", mo9757v());
        C0894y.m1148a(b, "controller_version", c.mo9603g());
        int C = mo9721C();
        f1204j = C;
        C0894y.m1156b(b, "current_orientation", C);
        C0894y.m1158b(b, "cleartext_permitted", mo9745j());
        C0894y.m1145a(b, "density", (double) mo9750o());
        C0894y.m1158b(b, "dark_mode", mo9749n());
        C0895y0 a = C0894y.m1134a();
        if (C0849u0.m936c("com.android.vending")) {
            a.mo10030b(Payload.SOURCE_GOOGLE);
        }
        if (C0849u0.m936c("com.amazon.venezia")) {
            a.mo10030b("amazon");
        }
        if (C0849u0.m936c("com.huawei.appmarket")) {
            a.mo10030b(Payload.SOURCE_HUAWEI);
        }
        if (C0849u0.m936c("com.sec.android.app.samsungapps")) {
            a.mo10030b(Payload.SOURCE_SAMSUNG);
        }
        C0894y.m1146a(b, "available_stores", a);
        if (!this.f1206b.mo9539a() && j > 0) {
            this.f1206b.mo9537a(j);
        }
        C0894y.m1148a(b, "advertiser_id", mo9738c());
        C0894y.m1158b(b, "limit_tracking", mo9758w());
        if (mo9738c() == null || mo9738c().equals("")) {
            C0894y.m1148a(b, "android_id_sha1", C0849u0.m929b(mo9741f()));
        }
        C0894y.m1148a(b, "adc_alt_id", mo9735b());
        return b;
    }
}
