package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import androidx.preference.PreferenceManager;
import com.adcolony.sdk.C0580a0;
import com.appsflyer.ServerParameters;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.u0 */
class C0849u0 {

    /* renamed from: a */
    static final int f1451a = 128;

    /* renamed from: b */
    private static ExecutorService f1452b = m948h();

    /* renamed from: c */
    static Handler f1453c;

    /* renamed from: com.adcolony.sdk.u0$a */
    class C0850a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f1454a;

        /* renamed from: b */
        final /* synthetic */ String f1455b;

        /* renamed from: c */
        final /* synthetic */ int f1456c;

        C0850a(Context context, String str, int i) {
            this.f1454a = context;
            this.f1455b = str;
            this.f1456c = i;
        }

        public void run() {
            Toast.makeText(this.f1454a, this.f1455b, this.f1456c).show();
        }
    }

    /* renamed from: com.adcolony.sdk.u0$b */
    interface C0851b extends Runnable {
        /* renamed from: a */
        boolean mo9204a();
    }

    C0849u0() {
    }

    /* renamed from: a */
    static boolean m919a(ExecutorService executorService, Runnable runnable) {
        try {
            executorService.execute(runnable);
            return true;
        } catch (RejectedExecutionException unused) {
            return false;
        }
    }

    /* renamed from: b */
    static String m926b(Context context, String str) {
        return m927b(m932c(context), str);
    }

    /* renamed from: c */
    static SharedPreferences m932c(Context context) {
        try {
            Class.forName("androidx.preference.PreferenceManager");
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (ClassNotFoundException unused) {
            return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        }
    }

    @Deprecated
    /* renamed from: d */
    static int m937d() {
        Context b = C0578a.m141b();
        if (b == null) {
            return 0;
        }
        try {
            return b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            new C0580a0.C0581a().mo9419a("Failed to retrieve package info.").mo9421a(C0580a0.f192j);
            return 0;
        }
    }

    /* renamed from: e */
    private static Handler m940e() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return null;
        }
        if (f1453c == null) {
            f1453c = new Handler(mainLooper);
        }
        return f1453c;
    }

    /* renamed from: f */
    static int m944f(String str) {
        try {
            return (int) Long.parseLong(str, 16);
        } catch (NumberFormatException unused) {
            new C0580a0.C0581a().mo9419a("Unable to parse '").mo9419a(str).mo9419a("' as a color.").mo9421a(C0580a0.f190h);
            return ViewCompat.MEASURED_STATE_MASK;
        }
    }

    /* renamed from: g */
    static boolean m947g() {
        Context b = C0578a.m141b();
        return b != null && Build.VERSION.SDK_INT >= 24 && (b instanceof Activity) && ((Activity) b).isInMultiWindowMode();
    }

    /* renamed from: h */
    public static ExecutorService m948h() {
        return new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    /* renamed from: com.adcolony.sdk.u0$c */
    static class C0852c {

        /* renamed from: a */
        private long f1457a;

        /* renamed from: b */
        private long f1458b = System.currentTimeMillis();

        C0852c(long j) {
            mo9909a(j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9909a(long j) {
            this.f1457a = j;
            this.f1458b = System.currentTimeMillis() + this.f1457a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public long mo9911b() {
            return this.f1457a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public long mo9912c() {
            return this.f1458b - this.f1457a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public long mo9913d() {
            return this.f1458b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public long mo9914e() {
            long currentTimeMillis = this.f1458b - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                return 0;
            }
            return currentTimeMillis;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo9915f() {
            mo9909a(this.f1457a);
        }

        public String toString() {
            return String.valueOf(((double) mo9914e()) / 1000.0d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo9910a() {
            return mo9914e() == 0;
        }
    }

    /* renamed from: a */
    static boolean m915a(Runnable runnable) {
        return m919a(f1452b, runnable);
    }

    /* renamed from: b */
    static String m927b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, (String) null);
        } catch (ClassCastException unused) {
            C0580a0.C0581a aVar = new C0580a0.C0581a();
            aVar.mo9419a("Key " + str + " in SharedPreferences ").mo9419a("does not have a String value.").mo9421a(C0580a0.f190h);
            return null;
        }
    }

    /* renamed from: a */
    static int m900a(Context context, String str) {
        return m901a(m932c(context), str);
    }

    /* renamed from: a */
    static int m901a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            C0580a0.C0581a aVar = new C0580a0.C0581a();
            aVar.mo9419a("Key " + str + " in SharedPreferences ").mo9419a("does not have an int value.").mo9421a(C0580a0.f190h);
            return -1;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        return new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", r1).parse(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        return new java.text.SimpleDateFormat("yyyy-MM-dd", r1).parse(r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0021 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.Date m946g(java.lang.String r5) {
        /*
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "yyyy-MM-dd'T'HH:mmZ"
            r0.<init>(r2, r1)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyy-MM-dd'T'HH:mm:ssZ"
            r2.<init>(r3, r1)
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyy-MM-dd"
            r3.<init>(r4, r1)
            java.util.Date r5 = r0.parse(r5)     // Catch:{ Exception -> 0x001c }
            return r5
        L_0x001c:
            java.util.Date r5 = r2.parse(r5)     // Catch:{ Exception -> 0x0021 }
            return r5
        L_0x0021:
            java.util.Date r5 = r3.parse(r5)     // Catch:{ Exception -> 0x0026 }
            return r5
        L_0x0026:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0849u0.m946g(java.lang.String):java.util.Date");
    }

    /* renamed from: c */
    static C0897z0 m933c(C0897z0 z0Var) {
        z0Var.mo10061a(new String[]{"ads_to_restore"});
        return z0Var;
    }

    /* renamed from: f */
    static int m943f(Context context) {
        int identifier;
        if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: b */
    static C0897z0 m924b(C0897z0 z0Var) {
        z0Var.mo10093u("launch_metadata");
        return z0Var;
    }

    /* renamed from: e */
    static boolean m942e(String str) {
        if (str != null && str.length() <= 128) {
            return true;
        }
        new C0580a0.C0581a().mo9419a("String must be non-null and the max length is 128 characters.").mo9421a(C0580a0.f189g);
        return false;
    }

    /* renamed from: b */
    static String m925b() {
        Application application;
        Context b = C0578a.m141b();
        if (b == null) {
            return "";
        }
        if (b instanceof Application) {
            application = (Application) b;
        } else {
            application = ((Activity) b).getApplication();
        }
        PackageManager packageManager = application.getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(b.getPackageName(), 0)).toString();
        } catch (Exception unused) {
            new C0580a0.C0581a().mo9419a("Failed to retrieve application label.").mo9421a(C0580a0.f192j);
            return "";
        }
    }

    /* renamed from: c */
    static boolean m936c(String str) {
        Application application;
        Context b = C0578a.m141b();
        if (b == null) {
            return false;
        }
        try {
            if (b instanceof Application) {
                application = (Application) b;
            } else {
                application = ((Activity) b).getApplication();
            }
            application.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    static C0897z0 m906a(C0897z0 z0Var) {
        z0Var.mo10061a(new String[]{"data_path", "media_path", "temp_storage_path", "device_api", "display_dpi", TapjoyConstants.TJC_DEVICE_MAC_ADDRESS, "memory_class", "memory_used_mb", ServerParameters.MODEL, "arch", "timezone_ietf", "timezone_gmt_m", "timezone_dst_m", "density", "dark_mode"});
        return z0Var;
    }

    /* renamed from: d */
    static String m939d(Context context) {
        try {
            return context.getPackageName();
        } catch (Exception unused) {
            return "unknown";
        }
    }

    /* renamed from: f */
    static String m945f() {
        Context b = C0578a.m141b();
        return (!(b instanceof Activity) || b.getResources().getConfiguration().orientation != 1) ? "landscape" : "portrait";
    }

    /* renamed from: d */
    static int m938d(String str) {
        str.hashCode();
        if (!str.equals("portrait")) {
            return !str.equals("landscape") ? -1 : 1;
        }
        return 0;
    }

    /* renamed from: e */
    static C0895y0 m941e(Context context) {
        C0895y0 a = C0894y.m1134a();
        if (context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    a = C0894y.m1134a();
                    int i = 0;
                    while (true) {
                        String[] strArr = packageInfo.requestedPermissions;
                        if (i >= strArr.length) {
                            break;
                        }
                        a.mo10030b(strArr[i]);
                        i++;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return a;
    }

    /* renamed from: c */
    static String m934c() {
        Context b = C0578a.m141b();
        if (b == null) {
            return "1.0";
        }
        try {
            return b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            new C0580a0.C0581a().mo9419a("Failed to retrieve package info.").mo9421a(C0580a0.f192j);
            return "1.0";
        }
    }

    /* renamed from: a */
    static int m903a(String str) {
        CRC32 crc32 = new CRC32();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            crc32.update(str.charAt(i));
        }
        return (int) crc32.getValue();
    }

    /* renamed from: c */
    static boolean m935c(Runnable runnable) {
        Handler e;
        if (runnable == null || (e = m940e()) == null) {
            return false;
        }
        e.removeCallbacks(runnable);
        return true;
    }

    /* renamed from: b */
    static String m929b(String str) {
        try {
            return C0893x0.m1130a(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    static boolean m931b(Runnable runnable) {
        Handler e;
        if (runnable == null || (e = m940e()) == null) {
            return false;
        }
        if (e.getLooper() != Looper.myLooper()) {
            return e.post(runnable);
        }
        runnable.run();
        return true;
    }

    /* renamed from: a */
    static String m907a() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    static C0895y0 m905a(int i) {
        C0895y0 a = C0894y.m1134a();
        for (int i2 = 0; i2 < i; i2++) {
            C0894y.m1154b(a, m907a());
        }
        return a;
    }

    /* renamed from: a */
    static boolean m920a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
            return false;
        }
        Arrays.sort(strArr);
        Arrays.sort(strArr2);
        return Arrays.equals(strArr, strArr2);
    }

    /* renamed from: b */
    static boolean m930b(AudioManager audioManager) {
        if (audioManager == null) {
            new C0580a0.C0581a().mo9419a("isAudioEnabled() called with a null AudioManager").mo9421a(C0580a0.f192j);
            return false;
        }
        try {
            if (audioManager.getStreamVolume(3) > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            new C0580a0.C0581a().mo9419a("Exception occurred when accessing AudioManager.getStreamVolume: ").mo9419a(e.toString()).mo9421a(C0580a0.f192j);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m916a(Runnable runnable, long j) {
        if (runnable == null) {
            return false;
        }
        if (j <= 0) {
            return m931b(runnable);
        }
        Handler e = m940e();
        if (e != null) {
            return e.postDelayed(runnable, j);
        }
        return false;
    }

    /* renamed from: a */
    static boolean m914a(C0851b bVar) {
        Handler e;
        if (bVar == null || (e = m940e()) == null) {
            return false;
        }
        e.removeCallbacks(bVar);
        if (bVar.mo9204a()) {
            return true;
        }
        if (e.getLooper() == Looper.myLooper()) {
            bVar.run();
            return true;
        }
        e.post(bVar);
        return true;
    }

    /* renamed from: b */
    static int m921b(Context context) {
        int i;
        if (context == null) {
            return 0;
        }
        if (context.getResources().getConfiguration().orientation == 1) {
            i = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        } else {
            i = context.getResources().getIdentifier("navigation_bar_height_landscape", "dimen", "android");
        }
        if (i > 0) {
            return context.getResources().getDimensionPixelSize(i);
        }
        return 0;
    }

    /* renamed from: a */
    static double m899a(AudioManager audioManager) {
        if (audioManager == null) {
            new C0580a0.C0581a().mo9419a("getAudioVolume() called with a null AudioManager").mo9421a(C0580a0.f192j);
            return 0.0d;
        }
        try {
            double streamVolume = (double) audioManager.getStreamVolume(3);
            double streamMaxVolume = (double) audioManager.getStreamMaxVolume(3);
            if (streamMaxVolume == 0.0d) {
                return 0.0d;
            }
            return streamVolume / streamMaxVolume;
        } catch (Exception e) {
            new C0580a0.C0581a().mo9419a("Exception occurred when accessing AudioManager: ").mo9419a(e.toString()).mo9421a(C0580a0.f192j);
            return 0.0d;
        }
    }

    /* renamed from: b */
    static String m928b(C0895y0 y0Var) throws JSONException {
        String str = "";
        for (int i = 0; i < y0Var.mo10032c(); i++) {
            if (i > 0) {
                str = str + ",";
            }
            str = str + y0Var.mo10024b(i);
        }
        return str;
    }

    /* renamed from: b */
    static int m923b(C0783q0 q0Var) {
        boolean z = false;
        try {
            Context b = C0578a.m141b();
            if (b == null) {
                return 0;
            }
            int i = (int) (b.getPackageManager().getPackageInfo(b.getPackageName(), 0).lastUpdateTime / 1000);
            C0897z0 g = q0Var.mo9833g();
            int i2 = 1;
            if (!g.mo10062a("last_update")) {
                z = true;
                i2 = 2;
            } else if (C0894y.m1163d(g, "last_update") != i) {
                z = true;
            } else {
                i2 = 0;
            }
            if (z) {
                try {
                    C0894y.m1156b(g, "last_update", i);
                    q0Var.mo9827a(g);
                } catch (Exception unused) {
                    return i2;
                }
            }
            return i2;
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: a */
    static AudioManager m904a(Context context) {
        if (context != null) {
            return (AudioManager) context.getSystemService("audio");
        }
        new C0580a0.C0581a().mo9419a("getAudioManager called with a null Context").mo9421a(C0580a0.f192j);
        return null;
    }

    /* renamed from: a */
    static String m908a(double d, int i) {
        StringBuilder sb = new StringBuilder();
        m911a(d, i, sb);
        return sb.toString();
    }

    /* renamed from: a */
    static void m911a(double d, int i, StringBuilder sb) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            sb.append(d);
            return;
        }
        if (d < 0.0d) {
            d = -d;
            sb.append('-');
        }
        if (i == 0) {
            sb.append(Math.round(d));
            return;
        }
        long pow = (long) Math.pow(10.0d, (double) i);
        long round = Math.round(d * ((double) pow));
        sb.append(round / pow);
        sb.append('.');
        long j = round % pow;
        if (j == 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append('0');
            }
            return;
        }
        for (long j2 = j * 10; j2 < pow; j2 *= 10) {
            sb.append('0');
        }
        sb.append(j);
    }

    /* renamed from: b */
    static int m922b(View view) {
        if (view == null) {
            return 0;
        }
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return (int) (((float) iArr[1]) / C0578a.m143c().mo9611o().mo9750o());
    }

    /* renamed from: a */
    static boolean m918a(String str, File file) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[8192];
                while (true) {
                    try {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        instance.update(bArr, 0, read);
                    } catch (IOException e) {
                        throw new RuntimeException("Unable to process file for MD5", e);
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused) {
                            new C0580a0.C0581a().mo9419a("Exception on closing MD5 input stream").mo9421a(C0580a0.f192j);
                        }
                        throw th;
                    }
                }
                boolean equals = str.equals(String.format("%40s", new Object[]{new BigInteger(1, instance.digest()).toString(16)}).replace(' ', '0'));
                try {
                    fileInputStream.close();
                } catch (IOException unused2) {
                    new C0580a0.C0581a().mo9419a("Exception on closing MD5 input stream").mo9421a(C0580a0.f192j);
                }
                return equals;
            } catch (FileNotFoundException unused3) {
                new C0580a0.C0581a().mo9419a("Exception while getting FileInputStream").mo9421a(C0580a0.f192j);
                return false;
            }
        } catch (NoSuchAlgorithmException unused4) {
            new C0580a0.C0581a().mo9419a("Exception while getting Digest").mo9421a(C0580a0.f192j);
            return false;
        }
    }

    /* renamed from: a */
    static String m910a(C0895y0 y0Var) throws JSONException {
        String str = "";
        for (int i = 0; i < y0Var.mo10032c(); i++) {
            if (i > 0) {
                str = str + ",";
            }
            switch (y0Var.mo10024b(i)) {
                case 1:
                    str = str + "MO";
                    break;
                case 2:
                    str = str + "TU";
                    break;
                case 3:
                    str = str + "WE";
                    break;
                case 4:
                    str = str + "TH";
                    break;
                case 5:
                    str = str + "FR";
                    break;
                case 6:
                    str = str + "SA";
                    break;
                case 7:
                    str = str + "SU";
                    break;
            }
        }
        return str;
    }

    /* renamed from: a */
    static boolean m913a(Intent intent, boolean z) {
        try {
            Context b = C0578a.m141b();
            if (b == null) {
                return false;
            }
            if (!(b instanceof Activity)) {
                intent.addFlags(268435456);
            }
            AdColonyInterstitial k = C0578a.m143c().mo9607k();
            if (k != null && k.mo9342j()) {
                k.mo9334f().mo9696f();
            }
            if (z) {
                b.startActivity(Intent.createChooser(intent, "Handle this via..."));
                return true;
            }
            b.startActivity(intent);
            return true;
        } catch (Exception e) {
            new C0580a0.C0581a().mo9419a(e.toString()).mo9421a(C0580a0.f190h);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m912a(Intent intent) {
        return m913a(intent, false);
    }

    /* renamed from: a */
    static boolean m917a(String str, int i) {
        Context b = C0578a.m141b();
        if (b == null) {
            return false;
        }
        m931b((Runnable) new C0850a(b, str, i));
        return true;
    }

    /* renamed from: a */
    static String m909a(C0783q0 q0Var) {
        C0897z0 g = q0Var.mo9833g();
        String h = C0894y.m1169h(g, "adc_alt_id");
        if (!h.isEmpty()) {
            return h;
        }
        String a = m907a();
        C0894y.m1148a(g, "adc_alt_id", a);
        q0Var.mo9827a(g);
        return a;
    }

    /* renamed from: a */
    static int m902a(View view) {
        if (view == null) {
            return 0;
        }
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return (int) (((float) iArr[0]) / C0578a.m143c().mo9611o().mo9750o());
    }
}
