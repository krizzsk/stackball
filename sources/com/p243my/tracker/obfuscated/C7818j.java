package com.p243my.tracker.obfuscated;

import android.app.UiModeManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Stack;
import java.util.TimeZone;

/* renamed from: com.my.tracker.obfuscated.j */
public final class C7818j {

    /* renamed from: A */
    private long f19888A = -1;

    /* renamed from: B */
    private long f19889B = -1;

    /* renamed from: C */
    private long f19890C = -1;

    /* renamed from: D */
    private int f19891D = -1;

    /* renamed from: E */
    private int f19892E = -1;

    /* renamed from: a */
    private boolean f19893a = false;

    /* renamed from: b */
    private String f19894b = "";

    /* renamed from: c */
    private String f19895c = "";

    /* renamed from: d */
    private String f19896d = "";

    /* renamed from: e */
    private String f19897e = "";

    /* renamed from: f */
    private String f19898f = "";

    /* renamed from: g */
    private String f19899g = "";

    /* renamed from: h */
    private String f19900h = "";

    /* renamed from: i */
    private String f19901i = "";

    /* renamed from: j */
    private String f19902j = "";

    /* renamed from: k */
    private String f19903k = "";

    /* renamed from: l */
    private String f19904l = "";

    /* renamed from: m */
    private String f19905m = "";

    /* renamed from: n */
    private String f19906n = "";

    /* renamed from: o */
    private String f19907o = "";

    /* renamed from: p */
    private String f19908p = "";

    /* renamed from: q */
    private String f19909q = "";

    /* renamed from: r */
    private String f19910r = "";

    /* renamed from: s */
    private int f19911s = -1;

    /* renamed from: t */
    private int f19912t = -1;

    /* renamed from: u */
    private int f19913u = -1;

    /* renamed from: v */
    private float f19914v = Float.NaN;

    /* renamed from: w */
    private float f19915w = Float.NaN;

    /* renamed from: x */
    private float f19916x = Float.NaN;

    /* renamed from: y */
    private int f19917y = -1;

    /* renamed from: z */
    private long f19918z = -1;

    /* renamed from: com.my.tracker.obfuscated.j$a */
    static final class C7819a {

        /* renamed from: a */
        static final int f19919a = (m21201a() ? 1 : 0);

        /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
            r2.close();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0099 */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0092 A[SYNTHETIC, Splitter:B:40:0x0092] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x00f3 A[SYNTHETIC, Splitter:B:72:0x00f3] */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x00fa A[SYNTHETIC, Splitter:B:78:0x00fa] */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x009c A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean m21201a() {
            /*
                java.lang.String r0 = android.os.Build.TAGS
                r1 = 1
                if (r0 == 0) goto L_0x000e
                java.lang.String r2 = "test-keys"
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto L_0x000e
                return r1
            L_0x000e:
                r0 = 10
                java.lang.String r2 = "/system/app/Superuser.apk"
                java.lang.String r3 = "/sbin/su"
                java.lang.String r4 = "/system/bin/su"
                java.lang.String r5 = "/system/xbin/su"
                java.lang.String r6 = "/data/local/xbin/su"
                java.lang.String r7 = "/data/local/bin/su"
                java.lang.String r8 = "/system/sd/xbin/su"
                java.lang.String r9 = "/system/bin/failsafe/su"
                java.lang.String r10 = "/data/local/su"
                java.lang.String r11 = "/su/bin/su"
                java.lang.String[] r2 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
                r3 = 0
                r4 = 0
            L_0x002a:
                if (r4 >= r0) goto L_0x003d
                r5 = r2[r4]
                java.io.File r6 = new java.io.File
                r6.<init>(r5)
                boolean r5 = r6.exists()
                if (r5 == 0) goto L_0x003a
                return r1
            L_0x003a:
                int r4 = r4 + 1
                goto L_0x002a
            L_0x003d:
                java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
                r2 = 3
                java.lang.String r4 = "/system/xbin/which su"
                java.lang.String r5 = "/system/bin/which su"
                java.lang.String r6 = "which su"
                java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6}
                r5 = 0
            L_0x004d:
                r6 = 0
                if (r5 >= r2) goto L_0x009f
                r7 = r4[r5]
                java.lang.Process r7 = r0.exec(r7)     // Catch:{ all -> 0x008f }
                java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ all -> 0x008d }
                java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch:{ all -> 0x008d }
                java.io.InputStream r10 = r7.getInputStream()     // Catch:{ all -> 0x008d }
                r9.<init>(r10)     // Catch:{ all -> 0x008d }
                r8.<init>(r9)     // Catch:{ all -> 0x008d }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x008b }
                r6.<init>()     // Catch:{ all -> 0x008b }
            L_0x0069:
                java.lang.String r9 = r8.readLine()     // Catch:{ all -> 0x008b }
                if (r9 == 0) goto L_0x0073
                r6.append(r9)     // Catch:{ all -> 0x008b }
                goto L_0x0069
            L_0x0073:
                r7.destroy()     // Catch:{ all -> 0x008b }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x008b }
                boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x008b }
                if (r6 != 0) goto L_0x0087
                r8.close()     // Catch:{ all -> 0x0083 }
            L_0x0083:
                r7.destroy()     // Catch:{ all -> 0x0086 }
            L_0x0086:
                return r1
            L_0x0087:
                r8.close()     // Catch:{ all -> 0x0099 }
                goto L_0x0099
            L_0x008b:
                r6 = r8
                goto L_0x0090
            L_0x008d:
                goto L_0x0090
            L_0x008f:
                r7 = r6
            L_0x0090:
                if (r6 == 0) goto L_0x0097
                r6.close()     // Catch:{ all -> 0x0096 }
                goto L_0x0097
            L_0x0096:
            L_0x0097:
                if (r7 == 0) goto L_0x009c
            L_0x0099:
                r7.destroy()     // Catch:{ all -> 0x009c }
            L_0x009c:
                int r5 = r5 + 1
                goto L_0x004d
            L_0x009f:
                java.util.Locale r0 = java.util.Locale.US     // Catch:{ Exception -> 0x00f7, all -> 0x00f0 }
                java.lang.String r2 = "/proc/%d/mounts"
                java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x00f7, all -> 0x00f0 }
                int r5 = android.os.Process.myPid()     // Catch:{ Exception -> 0x00f7, all -> 0x00f0 }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x00f7, all -> 0x00f0 }
                r4[r3] = r5     // Catch:{ Exception -> 0x00f7, all -> 0x00f0 }
                java.lang.String r0 = java.lang.String.format(r0, r2, r4)     // Catch:{ Exception -> 0x00f7, all -> 0x00f0 }
                java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00f7, all -> 0x00f0 }
                java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00f7, all -> 0x00f0 }
                java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00f7, all -> 0x00f0 }
                r5.<init>(r0)     // Catch:{ Exception -> 0x00f7, all -> 0x00f0 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x00f7, all -> 0x00f0 }
                r2.<init>(r4)     // Catch:{ Exception -> 0x00f7, all -> 0x00f0 }
                r0 = 4
                java.lang.String r4 = "/sbin/.magisk/"
                java.lang.String r5 = "/sbin/.core/mirror"
                java.lang.String r6 = "/sbin/.core/img"
                java.lang.String r7 = "/sbin/.core/db-0/magisk.db"
                java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch:{ Exception -> 0x00ee, all -> 0x00eb }
            L_0x00cf:
                java.lang.String r5 = r2.readLine()     // Catch:{ Exception -> 0x00ee, all -> 0x00eb }
                if (r5 == 0) goto L_0x00e7
                r6 = 0
            L_0x00d6:
                if (r6 >= r0) goto L_0x00cf
                r7 = r4[r6]     // Catch:{ Exception -> 0x00ee, all -> 0x00eb }
                boolean r7 = r5.contains(r7)     // Catch:{ Exception -> 0x00ee, all -> 0x00eb }
                if (r7 == 0) goto L_0x00e4
                r2.close()     // Catch:{ all -> 0x00e3 }
            L_0x00e3:
                return r1
            L_0x00e4:
                int r6 = r6 + 1
                goto L_0x00d6
            L_0x00e7:
                r2.close()     // Catch:{ all -> 0x00fd }
                goto L_0x00fd
            L_0x00eb:
                r0 = move-exception
                r6 = r2
                goto L_0x00f1
            L_0x00ee:
                r6 = r2
                goto L_0x00f8
            L_0x00f0:
                r0 = move-exception
            L_0x00f1:
                if (r6 == 0) goto L_0x00f6
                r6.close()     // Catch:{ all -> 0x00f6 }
            L_0x00f6:
                throw r0
            L_0x00f7:
            L_0x00f8:
                if (r6 == 0) goto L_0x00fd
                r6.close()     // Catch:{ all -> 0x00fd }
            L_0x00fd:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p243my.tracker.obfuscated.C7818j.C7819a.m21201a():boolean");
        }
    }

    C7818j() {
    }

    /* renamed from: b */
    private void m21194b(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            this.f19918z = filesDir.getTotalSpace();
            this.f19888A = filesDir.getFreeSpace();
            File d = m21196d(context);
            if (d != null) {
                long freeSpace = d.getFreeSpace();
                if (this.f19888A != freeSpace) {
                    long totalSpace = d.getTotalSpace();
                    if (this.f19918z != totalSpace) {
                        this.f19889B = totalSpace;
                        this.f19890C = freeSpace;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private void m21195c(Context context) {
        Display display;
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                display = displayManager.getDisplay(0);
            } else {
                return;
            }
        } else {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                display = windowManager.getDefaultDisplay();
            } else {
                return;
            }
        }
        if (display != null) {
            Point point = new Point();
            if (i >= 17) {
                display.getRealSize(point);
            } else {
                display.getSize(point);
            }
            this.f19911s = point.x;
            this.f19912t = point.y;
        }
    }

    /* renamed from: d */
    private static File m21196d(Context context) {
        Stack stack = new Stack();
        if (Build.VERSION.SDK_INT >= 19) {
            File[] externalFilesDirs = context.getExternalFilesDirs((String) null);
            if (externalFilesDirs != null) {
                for (File file : externalFilesDirs) {
                    if (file != null && (Build.VERSION.SDK_INT < 21 || (Environment.isExternalStorageRemovable(file) && !Environment.isExternalStorageEmulated(file)))) {
                        stack.push(file);
                    }
                }
            }
        } else {
            File externalFilesDir = context.getExternalFilesDir((String) null);
            if (externalFilesDir != null) {
                stack.push(externalFilesDir);
            }
        }
        if (stack.isEmpty()) {
            return null;
        }
        return (File) stack.pop();
    }

    /* renamed from: e */
    private static String m21197e(Context context) {
        String str;
        C7823k0 a = C7823k0.m21211a(context);
        String k = a.mo52327k();
        if (!TextUtils.isEmpty(k)) {
            C7877u0.m21547a("DeviceParamsDataProvider: retrieving mac " + k + " from cache");
            return k;
        }
        Iterator<T> it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
        while (true) {
            if (!it.hasNext()) {
                str = "DeviceParamsDataProvider: unable to retrieve mac: network interfaces does not contain wlan0";
                break;
            }
            NetworkInterface networkInterface = (NetworkInterface) it.next();
            if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                byte[] hardwareAddress = networkInterface.getHardwareAddress();
                if (hardwareAddress == null) {
                    str = "DeviceParamsDataProvider: unable to retrieve mac: getHardwareAddress is null";
                    break;
                }
                StringBuilder sb = new StringBuilder();
                int length = hardwareAddress.length;
                for (int i = 0; i < length; i++) {
                    sb.append(String.format("%02X:", new Object[]{Byte.valueOf(hardwareAddress[i])}));
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                String sb2 = sb.toString();
                if (!TextUtils.isEmpty(sb2)) {
                    a.mo52330l(sb2);
                    C7877u0.m21547a("DeviceParamsDataProvider: succesfully retreived mac " + sb2);
                    return sb2;
                }
            }
        }
        C7877u0.m21547a(str);
        return "";
    }

    /* renamed from: a */
    public void mo52292a(Context context) {
        if (!this.f19893a) {
            C7877u0.m21547a("DeviceParamsDataProvider: collect application info...");
            this.f19895c = Build.DEVICE;
            this.f19901i = Build.MANUFACTURER;
            this.f19902j = Build.MODEL;
            this.f19897e = Build.VERSION.RELEASE;
            try {
                ContentResolver contentResolver = context.getContentResolver();
                if (contentResolver != null) {
                    String string = Settings.Secure.getString(contentResolver, "android_id");
                    this.f19896d = string;
                    if (string == null) {
                        this.f19896d = "";
                    }
                }
            } catch (Throwable th) {
                C7877u0.m21548a("DeviceParamsDataProvider: collecting android ID exception ", th);
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    this.f19907o = telephonyManager.getNetworkOperatorName();
                    String networkOperator = telephonyManager.getNetworkOperator();
                    if (TextUtils.isEmpty(networkOperator) || networkOperator.length() <= 3) {
                        this.f19906n = networkOperator;
                    } else {
                        this.f19906n = networkOperator.substring(3);
                        this.f19905m = networkOperator.substring(0, 3);
                    }
                    if (telephonyManager.getSimState() == 5) {
                        this.f19908p = telephonyManager.getSimOperator();
                    }
                }
            } catch (Throwable th2) {
                C7877u0.m21548a("DeviceParamsDataProvider: collecting telephony exception: ", th2);
            }
            try {
                this.f19898f = context.getPackageName();
            } catch (Throwable th3) {
                C7877u0.m21548a("DeviceParamsDataProvider: collecting packageName exception: ", th3);
            }
            try {
                this.f19904l = context.getResources().getConfiguration().locale.getLanguage();
            } catch (Throwable th4) {
                C7877u0.m21548a("DeviceParamsDataProvider: collecting app lang exception: ", th4);
            }
            try {
                this.f19910r = m21197e(context);
            } catch (Throwable th5) {
                C7877u0.m21548a("DeviceParamsDataProvider: unable to retrieve mac: exception ", th5);
            }
            try {
                PackageInfo a = C7814h.m21185a(context);
                if (a != null) {
                    this.f19900h = a.versionName;
                    this.f19899g = Long.toString(Build.VERSION.SDK_INT < 28 ? (long) a.versionCode : a.getLongVersionCode());
                }
            } catch (Throwable th6) {
                C7877u0.m21548a("DeviceParamsDataProvider: collecting app package info exception: ", th6);
            }
            try {
                m21195c(context);
            } catch (Throwable th7) {
                C7877u0.m21548a("DeviceParamsDataProvider: collecting screen size exception: ", th7);
            }
            try {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                if (displayMetrics != null) {
                    this.f19913u = displayMetrics.densityDpi;
                    this.f19914v = displayMetrics.density;
                    this.f19915w = displayMetrics.xdpi;
                    this.f19916x = displayMetrics.ydpi;
                }
            } catch (Throwable th8) {
                C7877u0.m21548a("DeviceParamsDataProvider: collecting display metrics exception: ", th8);
            }
            try {
                TimeZone timeZone = TimeZone.getDefault();
                this.f19909q = timeZone.getDisplayName(false, 0) + " " + timeZone.getID();
            } catch (Throwable th9) {
                C7877u0.m21548a("DeviceParamsDataProvider: collecting timezone exception: ", th9);
            }
            try {
                this.f19917y = C7819a.f19919a;
            } catch (Throwable th10) {
                C7877u0.m21548a("DeviceParamsDataProvider: collecting isRooted exception: ", th10);
            }
            try {
                m21194b(context);
            } catch (Throwable th11) {
                C7877u0.m21548a("DeviceParamsDataProvider: collecting disk info exception: ", th11);
            }
            try {
                this.f19903k = Locale.getDefault().getLanguage();
            } catch (Throwable th12) {
                C7877u0.m21548a("DeviceParamsDataProvider: collecting lang exception: ", th12);
            }
            try {
                this.f19891D = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen") ? 1 : 0;
            } catch (Throwable th13) {
                C7877u0.m21548a("DeviceParamsDataProvider: collecting touchscreen info exception: ", th13);
            }
            try {
                this.f19892E = ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType();
            } catch (Throwable th14) {
                C7877u0.m21548a("DeviceParamsDataProvider: collecting ui mode info exception: ", th14);
            }
            this.f19894b = C7882w0.m21600a(context);
            this.f19893a = true;
            C7877u0.m21547a("DeviceParamsDataProvider: collected");
        }
    }

    /* renamed from: a */
    public void mo52293a(C7831m0 m0Var, Context context) {
        if (!TextUtils.isEmpty(this.f19896d)) {
            m0Var.mo52385a(this.f19896d);
        }
        if (!TextUtils.isEmpty(this.f19895c)) {
            m0Var.mo52429g(this.f19895c);
        }
        if (!TextUtils.isEmpty(this.f19901i)) {
            m0Var.mo52445l(this.f19901i);
        }
        if (!TextUtils.isEmpty(this.f19897e)) {
            m0Var.mo52454q(this.f19897e);
        }
        if (!TextUtils.isEmpty(this.f19903k)) {
            m0Var.mo52453p(this.f19903k);
        }
        if (!TextUtils.isEmpty(this.f19905m)) {
            m0Var.mo52457t(this.f19905m);
        }
        if (!TextUtils.isEmpty(this.f19902j)) {
            m0Var.mo52433h(this.f19902j);
        }
        if (!TextUtils.isEmpty(this.f19906n)) {
            m0Var.mo52455r(this.f19906n);
        }
        if (!TextUtils.isEmpty(this.f19907o)) {
            m0Var.mo52456s(this.f19907o);
        }
        if (!TextUtils.isEmpty(this.f19908p)) {
            m0Var.mo52458u(this.f19908p);
        }
        if (!TextUtils.isEmpty(this.f19909q)) {
            m0Var.mo52459v(this.f19909q);
        }
        if (!TextUtils.isEmpty(this.f19898f)) {
            m0Var.mo52420e(this.f19898f);
        }
        if (!TextUtils.isEmpty(this.f19900h)) {
            m0Var.mo52425f(this.f19900h);
        }
        if (!TextUtils.isEmpty(this.f19899g)) {
            m0Var.mo52400b(this.f19899g);
        }
        if (!TextUtils.isEmpty(this.f19904l)) {
            m0Var.mo52415d(this.f19904l);
        }
        if (!TextUtils.isEmpty(this.f19910r)) {
            m0Var.mo52442k(this.f19910r);
        }
        if (!TextUtils.isEmpty(this.f19894b)) {
            m0Var.mo52439j(this.f19894b);
        }
        m0Var.mo52444l(3);
        m0Var.mo52452p(this.f19911s);
        m0Var.mo52441k(this.f19912t);
        m0Var.mo52435i(this.f19913u);
        m0Var.mo52378a(this.f19914v);
        m0Var.mo52397b(this.f19915w);
        m0Var.mo52407c(this.f19916x);
        m0Var.mo52446m(this.f19917y);
        m0Var.mo52414d(this.f19918z);
        m0Var.mo52409c(this.f19888A);
        m0Var.mo52399b(this.f19889B);
        m0Var.mo52382a(this.f19890C);
        m0Var.mo52448n(this.f19891D);
        m0Var.mo52450o(this.f19892E);
    }

    /* renamed from: f */
    public void mo52294f(Context context) {
    }
}
