package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.support.p003v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.applovin.impl.adview.C1072c;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p025b.C1371e;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.p027d.C1416i;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.impl.sdk.utils.C1519g;
import com.applovin.impl.sdk.utils.C1550l;
import com.applovin.impl.sdk.utils.C1551m;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.appsflyer.ServerParameters;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.k */
public class C1473k {

    /* renamed from: e */
    private static String f3519e;

    /* renamed from: f */
    private static int f3520f;

    /* renamed from: a */
    private final C1469j f3521a;

    /* renamed from: b */
    private final C1505q f3522b;

    /* renamed from: c */
    private final Context f3523c;

    /* renamed from: d */
    private final Map<Class, Object> f3524d;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final AtomicReference<C1475a> f3525g = new AtomicReference<>();

    /* renamed from: com.applovin.impl.sdk.k$a */
    public static class C1475a {

        /* renamed from: a */
        public boolean f3527a;

        /* renamed from: b */
        public String f3528b = "";
    }

    /* renamed from: com.applovin.impl.sdk.k$b */
    public static class C1476b {

        /* renamed from: a */
        public String f3529a;

        /* renamed from: b */
        public String f3530b;

        /* renamed from: c */
        public String f3531c;

        /* renamed from: d */
        public String f3532d;

        /* renamed from: e */
        public String f3533e;

        /* renamed from: f */
        public String f3534f;

        /* renamed from: g */
        public boolean f3535g;

        /* renamed from: h */
        public long f3536h;

        /* renamed from: i */
        public boolean f3537i;

        /* renamed from: a */
        public Map<String, String> mo13154a() {
            HashMap hashMap = new HashMap(9);
            hashMap.put("app_name", this.f3529a);
            hashMap.put(TapjoyConstants.TJC_APP_VERSION_NAME, C1553o.m3557e(this.f3530b));
            hashMap.put(CampaignEx.JSON_KEY_PACKAGE_NAME, C1553o.m3557e(this.f3531c));
            hashMap.put("installer_name", C1553o.m3557e(this.f3532d));
            hashMap.put("tg", String.valueOf(this.f3533e));
            hashMap.put("ltg", String.valueOf(this.f3534f));
            hashMap.put("debug", String.valueOf(this.f3535g));
            hashMap.put("test_ads", String.valueOf(this.f3537i));
            hashMap.put("ia", String.valueOf(this.f3536h));
            hashMap.put(ServerParameters.SDK_DATA_SDK_VERSION, AppLovinSdk.VERSION);
            return hashMap;
        }
    }

    /* renamed from: com.applovin.impl.sdk.k$c */
    public static class C1477c {

        /* renamed from: a */
        public int f3538a = -1;

        /* renamed from: b */
        public int f3539b = -1;
    }

    /* renamed from: com.applovin.impl.sdk.k$d */
    public static class C1478d {

        /* renamed from: A */
        public boolean f3540A;

        /* renamed from: B */
        public boolean f3541B;

        /* renamed from: C */
        public boolean f3542C;

        /* renamed from: D */
        public boolean f3543D;

        /* renamed from: E */
        public boolean f3544E;

        /* renamed from: F */
        public int f3545F = -1;

        /* renamed from: G */
        public String f3546G;

        /* renamed from: H */
        public long f3547H;

        /* renamed from: I */
        public long f3548I;

        /* renamed from: J */
        public C1479e f3549J = new C1479e();

        /* renamed from: K */
        public Boolean f3550K;

        /* renamed from: L */
        public Boolean f3551L;

        /* renamed from: M */
        public Boolean f3552M;

        /* renamed from: N */
        public boolean f3553N;

        /* renamed from: O */
        public float f3554O;

        /* renamed from: P */
        public float f3555P;

        /* renamed from: Q */
        public long f3556Q;

        /* renamed from: R */
        public int f3557R = C1452e.f3420a;

        /* renamed from: a */
        public String f3558a;

        /* renamed from: b */
        public String f3559b;

        /* renamed from: c */
        public int f3560c;

        /* renamed from: d */
        public String f3561d;

        /* renamed from: e */
        public String f3562e;

        /* renamed from: f */
        public String f3563f;

        /* renamed from: g */
        public String f3564g;

        /* renamed from: h */
        public String f3565h;

        /* renamed from: i */
        public String f3566i;

        /* renamed from: j */
        public String f3567j;

        /* renamed from: k */
        public Locale f3568k;

        /* renamed from: l */
        public String f3569l;

        /* renamed from: m */
        public float f3570m;

        /* renamed from: n */
        public int f3571n;

        /* renamed from: o */
        public float f3572o;

        /* renamed from: p */
        public float f3573p;

        /* renamed from: q */
        public double f3574q;

        /* renamed from: r */
        public double f3575r;

        /* renamed from: s */
        public int f3576s;

        /* renamed from: t */
        public boolean f3577t;

        /* renamed from: u */
        public C1477c f3578u;

        /* renamed from: v */
        public long f3579v;

        /* renamed from: w */
        public float f3580w;

        /* renamed from: x */
        public int f3581x;

        /* renamed from: y */
        public int f3582y;

        /* renamed from: z */
        public String f3583z;

        /* renamed from: a */
        public Map<String, String> mo13155a() {
            HashMap hashMap = new HashMap(64);
            hashMap.put("platform", C1553o.m3557e(this.f3558a));
            hashMap.put("api_level", String.valueOf(this.f3560c));
            hashMap.put(ServerParameters.MODEL, C1553o.m3557e(this.f3561d));
            hashMap.put("locale", C1553o.m3557e(this.f3568k.toString()));
            hashMap.put(ServerParameters.BRAND, C1553o.m3557e(this.f3562e));
            hashMap.put("brand_name", C1553o.m3557e(this.f3563f));
            hashMap.put("hardware", C1553o.m3557e(this.f3564g));
            hashMap.put("revision", C1553o.m3557e(this.f3565h));
            hashMap.put("os", C1553o.m3557e(this.f3559b));
            hashMap.put("orientation_lock", this.f3569l);
            hashMap.put(TapjoyConstants.TJC_DEVICE_COUNTRY_CODE, C1553o.m3557e(this.f3566i));
            hashMap.put(ServerParameters.CARRIER, C1553o.m3557e(this.f3567j));
            hashMap.put("tz_offset", String.valueOf(this.f3575r));
            hashMap.put("aida", String.valueOf(this.f3553N));
            hashMap.put("adr", String.valueOf(this.f3577t));
            hashMap.put("volume", String.valueOf(this.f3581x));
            hashMap.put("sb", String.valueOf(this.f3582y));
            hashMap.put("sim", String.valueOf(this.f3540A));
            hashMap.put("gy", String.valueOf(this.f3541B));
            hashMap.put("is_tablet", String.valueOf(this.f3542C));
            hashMap.put("tv", String.valueOf(this.f3543D));
            hashMap.put("vs", String.valueOf(this.f3544E));
            hashMap.put("lpm", String.valueOf(this.f3545F));
            hashMap.put("fs", String.valueOf(this.f3547H));
            hashMap.put("tds", String.valueOf(this.f3548I));
            hashMap.put("fm", String.valueOf(this.f3549J.f3585b));
            hashMap.put("tm", String.valueOf(this.f3549J.f3584a));
            hashMap.put("lmt", String.valueOf(this.f3549J.f3586c));
            hashMap.put("lm", String.valueOf(this.f3549J.f3587d));
            hashMap.put("adns", String.valueOf(this.f3570m));
            hashMap.put("adnsd", String.valueOf(this.f3571n));
            hashMap.put("xdpi", String.valueOf(this.f3572o));
            hashMap.put("ydpi", String.valueOf(this.f3573p));
            hashMap.put("screen_size_in", String.valueOf(this.f3574q));
            hashMap.put("af", String.valueOf(this.f3579v));
            hashMap.put("font", String.valueOf(this.f3580w));
            hashMap.put("bt_ms", String.valueOf(this.f3556Q));
            hashMap.put("wvvc", String.valueOf(this.f3576s));
            hashMap.put("mute_switch", String.valueOf(this.f3557R));
            if (C1553o.m3554b(this.f3546G)) {
                hashMap.put("so", C1553o.m3557e(this.f3546G));
            }
            float f = this.f3554O;
            if (f > 0.0f) {
                hashMap.put("da", String.valueOf(f));
            }
            float f2 = this.f3555P;
            if (f2 > 0.0f) {
                hashMap.put("dm", String.valueOf(f2));
            }
            if (C1553o.m3554b(this.f3583z)) {
                hashMap.put("ua", C1553o.m3557e(this.f3583z));
            }
            C1477c cVar = this.f3578u;
            if (cVar != null) {
                hashMap.put("act", String.valueOf(cVar.f3538a));
                hashMap.put("acm", String.valueOf(this.f3578u.f3539b));
            }
            Boolean bool = this.f3550K;
            if (bool != null) {
                hashMap.put("huc", bool.toString());
            }
            Boolean bool2 = this.f3551L;
            if (bool2 != null) {
                hashMap.put("aru", bool2.toString());
            }
            Boolean bool3 = this.f3552M;
            if (bool3 != null) {
                hashMap.put("dns", bool3.toString());
            }
            return hashMap;
        }
    }

    /* renamed from: com.applovin.impl.sdk.k$e */
    public static class C1479e {

        /* renamed from: a */
        public long f3584a = -1;

        /* renamed from: b */
        public long f3585b = -1;

        /* renamed from: c */
        public long f3586c = -1;

        /* renamed from: d */
        public boolean f3587d = false;
    }

    protected C1473k(C1469j jVar) {
        if (jVar != null) {
            this.f3521a = jVar;
            this.f3522b = jVar.mo13139v();
            this.f3523c = jVar.mo13065D();
            this.f3524d = Collections.synchronizedMap(new HashMap());
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    /* renamed from: a */
    private C1478d m3133a(C1478d dVar) {
        PowerManager powerManager;
        if (dVar == null) {
            dVar = new C1478d();
        }
        dVar.f3550K = C1456g.m3008a(this.f3523c);
        dVar.f3551L = C1456g.m3012b(this.f3523c);
        dVar.f3552M = C1456g.m3014c(this.f3523c);
        dVar.f3578u = ((Boolean) this.f3521a.mo13088a(C1369c.f3037dW)).booleanValue() ? m3144j() : null;
        if (((Boolean) this.f3521a.mo13088a(C1369c.f3102ej)).booleanValue()) {
            dVar.f3577t = m3150p();
        }
        AudioManager audioManager = (AudioManager) this.f3523c.getSystemService("audio");
        if (audioManager != null) {
            dVar.f3581x = (int) (((float) audioManager.getStreamVolume(3)) * ((Float) this.f3521a.mo13088a(C1369c.f3103ek)).floatValue());
        }
        try {
            dVar.f3582y = (int) ((((float) Settings.System.getInt(this.f3523c.getContentResolver(), "screen_brightness")) / 255.0f) * 100.0f);
        } catch (Settings.SettingNotFoundException e) {
            this.f3522b.mo13278b("DataCollector", "Unable to collect screen brightness", e);
        }
        if (((Boolean) this.f3521a.mo13088a(C1369c.f3104el)).booleanValue()) {
            String a = C1072c.m1570a(((Long) this.f3521a.mo13088a(C1369c.f3105em)).longValue());
            if (C1553o.m3554b(a)) {
                dVar.f3583z = a;
            }
        }
        if (((Boolean) this.f3521a.mo13088a(C1369c.f3093ea)).booleanValue()) {
            try {
                dVar.f3547H = Environment.getDataDirectory().getFreeSpace();
                dVar.f3548I = Environment.getDataDirectory().getTotalSpace();
            } catch (Throwable th) {
                dVar.f3547H = -1;
                dVar.f3548I = -1;
                this.f3522b.mo13278b("DataCollector", "Unable to collect total & free space.", th);
            }
        }
        if (((Boolean) this.f3521a.mo13088a(C1369c.f3094eb)).booleanValue()) {
            ActivityManager activityManager = (ActivityManager) this.f3523c.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                dVar.f3549J.f3585b = memoryInfo.availMem;
                dVar.f3549J.f3587d = memoryInfo.lowMemory;
                dVar.f3549J.f3586c = memoryInfo.threshold;
                dVar.f3549J.f3584a = memoryInfo.totalMem;
            }
        }
        String str = (String) this.f3521a.mo13064C().mo12842a(C1369c.f3108ep);
        if (!str.equalsIgnoreCase(f3519e)) {
            try {
                f3519e = str;
                PackageInfo packageInfo = this.f3523c.getPackageManager().getPackageInfo(str, 0);
                dVar.f3576s = packageInfo.versionCode;
                f3520f = packageInfo.versionCode;
            } catch (Throwable unused) {
                f3520f = 0;
            }
        } else {
            dVar.f3576s = f3520f;
        }
        if (((Boolean) this.f3521a.mo13088a(C1369c.f3038dX)).booleanValue()) {
            dVar.f3542C = AppLovinSdkUtils.isTablet(this.f3523c);
        }
        if (((Boolean) this.f3521a.mo13088a(C1369c.f3039dY)).booleanValue()) {
            dVar.f3543D = m3149o();
        }
        if (((Boolean) this.f3521a.mo13088a(C1369c.f3040dZ)).booleanValue()) {
            String m = m3147m();
            if (!TextUtils.isEmpty(m)) {
                dVar.f3546G = m;
            }
        }
        dVar.f3569l = m3141g();
        if (((Boolean) this.f3521a.mo13088a(C1369c.f3095ec)).booleanValue()) {
            dVar.f3544E = C1557r.m3628d();
        }
        if (C1519g.m3433d() && (powerManager = (PowerManager) this.f3523c.getSystemService("power")) != null) {
            dVar.f3545F = powerManager.isPowerSaveMode() ? 1 : 0;
        }
        if (((Boolean) this.f3521a.mo13088a(C1369c.f3109eq)).booleanValue() && this.f3521a.mo13106ac() != null) {
            dVar.f3554O = this.f3521a.mo13106ac().mo13341c();
        }
        if (((Boolean) this.f3521a.mo13088a(C1369c.f3110er)).booleanValue() && this.f3521a.mo13106ac() != null) {
            dVar.f3555P = this.f3521a.mo13106ac().mo13340b();
        }
        dVar.f3557R = this.f3521a.mo13107ad().mo13039a();
        return dVar;
    }

    /* renamed from: a */
    private String m3134a(int i) {
        if (i == 1) {
            return "receiver";
        }
        if (i == 2) {
            return "speaker";
        }
        if (i == 4 || i == 3) {
            return "headphones";
        }
        if (i == 8) {
            return "bluetootha2dpoutput";
        }
        if (i == 13 || i == 19 || i == 5 || i == 6 || i == 12 || i == 11) {
            return "lineout";
        }
        if (i == 9 || i == 10) {
            return "hdmioutput";
        }
        return null;
    }

    /* renamed from: a */
    private boolean m3136a(String str) {
        try {
            return Settings.Secure.getInt(this.f3523c.getContentResolver(), str) == 1;
        } catch (Settings.SettingNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.applovin.impl.sdk.b.c<java.lang.String>, com.applovin.impl.sdk.b.c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m3137a(java.lang.String r2, com.applovin.impl.sdk.p025b.C1369c<java.lang.String> r3) {
        /*
            r1 = this;
            com.applovin.impl.sdk.j r0 = r1.f3521a
            java.lang.Object r3 = r0.mo13088a(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.util.List r3 = com.applovin.impl.sdk.utils.C1517e.m3423a((java.lang.String) r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x0010:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L_0x0010
            r2 = 1
            return r2
        L_0x0024:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1473k.m3137a(java.lang.String, com.applovin.impl.sdk.b.c):boolean");
    }

    /* renamed from: b */
    private boolean m3138b(String str) {
        if (str != null) {
            Context context = this.f3523c;
            if (context != null) {
                return C1550l.m3530a(str, context.getPackageName(), this.f3523c.getPackageManager()) == 0;
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No permission name specified");
    }

    /* renamed from: c */
    private String m3139c(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = str.charAt(i);
            for (int i2 = 9; i2 >= 0; i2--) {
                cArr[i] = (char) (cArr[i] ^ iArr[i2]);
            }
        }
        return new String(cArr);
    }

    /* renamed from: f */
    private Map<String, String> m3140f() {
        return mo13149a((Map<String, String>) null, false, true);
    }

    /* renamed from: g */
    private String m3141g() {
        int b = C1557r.m3614b(this.f3523c);
        return b == 1 ? "portrait" : b == 2 ? "landscape" : "none";
    }

    /* renamed from: h */
    private C1475a m3142h() {
        if (m3143i()) {
            try {
                C1475a aVar = new C1475a();
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f3523c);
                aVar.f3527a = advertisingIdInfo.isLimitAdTrackingEnabled();
                aVar.f3528b = advertisingIdInfo.getId();
                return aVar;
            } catch (Throwable th) {
                this.f3522b.mo13278b("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
            }
        } else {
            C1505q.m3345i("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return new C1475a();
        }
    }

    /* renamed from: i */
    private boolean m3143i() {
        return C1557r.m3631e("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    /* renamed from: j */
    private C1477c m3144j() {
        C1477c cVar = new C1477c();
        Intent registerReceiver = this.f3523c.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i = -1;
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : -1;
        int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            cVar.f3539b = -1;
        } else {
            cVar.f3539b = (int) ((((float) intExtra) / ((float) intExtra2)) * 100.0f);
        }
        if (registerReceiver != null) {
            i = registerReceiver.getIntExtra("status", -1);
        }
        cVar.f3538a = i;
        return cVar;
    }

    /* renamed from: k */
    private long m3145k() {
        List asList = Arrays.asList(C1553o.m3555c(Settings.Secure.getString(this.f3523c.getContentResolver(), "enabled_accessibility_services")).split(CertificateUtil.DELIMITER));
        long j = asList.contains("AccessibilityMenuService") ? 256 : 0;
        if (asList.contains("SelectToSpeakService")) {
            j |= 512;
        }
        if (asList.contains("SoundAmplifierService")) {
            j |= 2;
        }
        if (asList.contains("SpeechToTextAccessibilityService")) {
            j |= 128;
        }
        if (asList.contains("SwitchAccessService")) {
            j |= 4;
        }
        if ((this.f3523c.getResources().getConfiguration().uiMode & 48) == 32) {
            j |= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }
        if (m3136a("accessibility_enabled")) {
            j |= 8;
        }
        if (m3136a("touch_exploration_enabled")) {
            j |= 16;
        }
        if (!C1519g.m3433d()) {
            return j;
        }
        if (m3136a("accessibility_display_inversion_enabled")) {
            j |= 32;
        }
        return m3136a("skip_first_use_hints") ? j | 64 : j;
    }

    /* renamed from: l */
    private float m3146l() {
        try {
            return Settings.System.getFloat(this.f3523c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e) {
            this.f3522b.mo13278b("DataCollector", "Error collecting font scale", e);
            return -1.0f;
        }
    }

    /* renamed from: m */
    private String m3147m() {
        AudioManager audioManager = (AudioManager) this.f3523c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (C1519g.m3434e()) {
            for (AudioDeviceInfo type : audioManager.getDevices(2)) {
                String a = m3134a(type.getType());
                if (!TextUtils.isEmpty(a)) {
                    sb.append(a);
                    sb.append(",");
                }
            }
        } else {
            if (audioManager.isWiredHeadsetOn()) {
                sb.append("headphones");
                sb.append(",");
            }
            if (audioManager.isBluetoothA2dpOn()) {
                sb.append("bluetootha2dpoutput");
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            this.f3522b.mo13277b("DataCollector", "No sound outputs detected");
        }
        return sb2;
    }

    /* renamed from: n */
    private double m3148n() {
        return ((double) Math.round((((double) TimeZone.getDefault().getOffset(new Date().getTime())) * 10.0d) / 3600000.0d)) / 10.0d;
    }

    /* renamed from: o */
    private boolean m3149o() {
        return this.f3523c.getPackageManager().hasSystemFeature(C1519g.m3433d() ? "android.software.leanback" : "android.hardware.type.television");
    }

    /* renamed from: p */
    private boolean m3150p() {
        try {
            return m3151q() || m3152r();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: q */
    private boolean m3151q() {
        String str = Build.TAGS;
        return str != null && str.contains(m3139c("lz}$blpz"));
    }

    /* renamed from: r */
    private boolean m3152r() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i = 0; i < 9; i++) {
            if (new File(m3139c(strArr[i])).exists()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    private boolean m3153s() {
        return m3137a(Build.DEVICE, C1369c.f3099eg) || m3137a(Build.HARDWARE, C1369c.f3098ef) || m3137a(Build.MANUFACTURER, C1369c.f3100eh) || m3137a(Build.MODEL, C1369c.f3101ei);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo13148a() {
        String encodeToString = Base64.encodeToString(new JSONObject(m3140f()).toString().getBytes(Charset.defaultCharset()), 2);
        if (!((Boolean) this.f3521a.mo13088a(C1369c.f3082eP)).booleanValue()) {
            return encodeToString;
        }
        return C1551m.m3532a(encodeToString, this.f3521a.mo13136t(), C1557r.m3578a(this.f3521a));
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x04e4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, java.lang.String> mo13149a(java.util.Map<java.lang.String, java.lang.String> r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.applovin.impl.sdk.k$d r1 = r5.mo13150b()
            java.lang.String r2 = r1.f3562e
            java.lang.String r2 = com.applovin.impl.sdk.utils.C1553o.m3557e(r2)
            java.lang.String r3 = "brand"
            r0.put(r3, r2)
            java.lang.String r2 = r1.f3563f
            java.lang.String r2 = com.applovin.impl.sdk.utils.C1553o.m3557e(r2)
            java.lang.String r3 = "brand_name"
            r0.put(r3, r2)
            java.lang.String r2 = r1.f3564g
            java.lang.String r2 = com.applovin.impl.sdk.utils.C1553o.m3557e(r2)
            java.lang.String r3 = "hardware"
            r0.put(r3, r2)
            int r2 = r1.f3560c
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "api_level"
            r0.put(r3, r2)
            java.lang.String r2 = r1.f3567j
            java.lang.String r2 = com.applovin.impl.sdk.utils.C1553o.m3557e(r2)
            java.lang.String r3 = "carrier"
            r0.put(r3, r2)
            java.lang.String r2 = r1.f3566i
            java.lang.String r2 = com.applovin.impl.sdk.utils.C1553o.m3557e(r2)
            java.lang.String r3 = "country_code"
            r0.put(r3, r2)
            java.util.Locale r2 = r1.f3568k
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = com.applovin.impl.sdk.utils.C1553o.m3557e(r2)
            java.lang.String r3 = "locale"
            r0.put(r3, r2)
            java.lang.String r2 = r1.f3561d
            java.lang.String r2 = com.applovin.impl.sdk.utils.C1553o.m3557e(r2)
            java.lang.String r3 = "model"
            r0.put(r3, r2)
            java.lang.String r2 = r1.f3559b
            java.lang.String r2 = com.applovin.impl.sdk.utils.C1553o.m3557e(r2)
            java.lang.String r3 = "os"
            r0.put(r3, r2)
            java.lang.String r2 = r1.f3558a
            java.lang.String r2 = com.applovin.impl.sdk.utils.C1553o.m3557e(r2)
            java.lang.String r3 = "platform"
            r0.put(r3, r2)
            java.lang.String r2 = r1.f3565h
            java.lang.String r2 = com.applovin.impl.sdk.utils.C1553o.m3557e(r2)
            java.lang.String r3 = "revision"
            r0.put(r3, r2)
            java.lang.String r2 = r1.f3569l
            java.lang.String r3 = "orientation_lock"
            r0.put(r3, r2)
            double r2 = r1.f3575r
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "tz_offset"
            r0.put(r3, r2)
            boolean r2 = r1.f3553N
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "aida"
            r0.put(r3, r2)
            int r2 = r1.f3576s
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "wvvc"
            r0.put(r3, r2)
            float r2 = r1.f3570m
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "adns"
            r0.put(r3, r2)
            int r2 = r1.f3571n
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "adnsd"
            r0.put(r3, r2)
            float r2 = r1.f3572o
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "xdpi"
            r0.put(r3, r2)
            float r2 = r1.f3573p
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "ydpi"
            r0.put(r3, r2)
            double r2 = r1.f3574q
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "screen_size_in"
            r0.put(r3, r2)
            boolean r2 = r1.f3540A
            java.lang.String r2 = com.applovin.impl.sdk.utils.C1553o.m3550a((boolean) r2)
            java.lang.String r3 = "sim"
            r0.put(r3, r2)
            boolean r2 = r1.f3541B
            java.lang.String r2 = com.applovin.impl.sdk.utils.C1553o.m3550a((boolean) r2)
            java.lang.String r3 = "gy"
            r0.put(r3, r2)
            boolean r2 = r1.f3542C
            java.lang.String r2 = com.applovin.impl.sdk.utils.C1553o.m3550a((boolean) r2)
            java.lang.String r3 = "is_tablet"
            r0.put(r3, r2)
            boolean r2 = r1.f3543D
            java.lang.String r2 = com.applovin.impl.sdk.utils.C1553o.m3550a((boolean) r2)
            java.lang.String r3 = "tv"
            r0.put(r3, r2)
            boolean r2 = r1.f3544E
            java.lang.String r2 = com.applovin.impl.sdk.utils.C1553o.m3550a((boolean) r2)
            java.lang.String r3 = "vs"
            r0.put(r3, r2)
            int r2 = r1.f3545F
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "lpm"
            r0.put(r3, r2)
            long r2 = r1.f3547H
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "fs"
            r0.put(r3, r2)
            long r2 = r1.f3548I
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "tds"
            r0.put(r3, r2)
            com.applovin.impl.sdk.k$e r2 = r1.f3549J
            long r2 = r2.f3585b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "fm"
            r0.put(r3, r2)
            com.applovin.impl.sdk.k$e r2 = r1.f3549J
            long r2 = r2.f3584a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "tm"
            r0.put(r3, r2)
            com.applovin.impl.sdk.k$e r2 = r1.f3549J
            long r2 = r2.f3586c
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "lmt"
            r0.put(r3, r2)
            com.applovin.impl.sdk.k$e r2 = r1.f3549J
            boolean r2 = r2.f3587d
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "lm"
            r0.put(r3, r2)
            boolean r2 = r1.f3577t
            java.lang.String r2 = com.applovin.impl.sdk.utils.C1553o.m3550a((boolean) r2)
            java.lang.String r3 = "adr"
            r0.put(r3, r2)
            int r2 = r1.f3581x
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "volume"
            r0.put(r3, r2)
            int r2 = r1.f3582y
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "sb"
            r0.put(r3, r2)
            long r2 = r1.f3579v
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "af"
            r0.put(r3, r2)
            float r2 = r1.f3580w
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "font"
            r0.put(r3, r2)
            java.lang.String r2 = r1.f3583z
            java.lang.String r2 = com.applovin.impl.sdk.utils.C1553o.m3557e(r2)
            java.lang.String r3 = "ua"
            com.applovin.impl.sdk.utils.C1557r.m3602a((java.lang.String) r3, (java.lang.String) r2, (java.util.Map<java.lang.String, java.lang.String>) r0)
            java.lang.String r2 = r1.f3546G
            java.lang.String r2 = com.applovin.impl.sdk.utils.C1553o.m3557e(r2)
            java.lang.String r3 = "so"
            com.applovin.impl.sdk.utils.C1557r.m3602a((java.lang.String) r3, (java.lang.String) r2, (java.util.Map<java.lang.String, java.lang.String>) r0)
            long r2 = r1.f3556Q
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "bt_ms"
            r0.put(r3, r2)
            int r2 = r1.f3557R
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "mute_switch"
            r0.put(r3, r2)
            float r2 = r1.f3554O
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x01e6
            float r2 = r1.f3554O
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "da"
            r0.put(r4, r2)
        L_0x01e6:
            float r2 = r1.f3555P
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x01f7
            float r2 = r1.f3555P
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "dm"
            r0.put(r3, r2)
        L_0x01f7:
            com.applovin.impl.sdk.k$c r2 = r1.f3578u
            if (r2 == 0) goto L_0x0211
            int r3 = r2.f3538a
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "act"
            r0.put(r4, r3)
            int r2 = r2.f3539b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "acm"
            r0.put(r3, r2)
        L_0x0211:
            java.lang.Boolean r2 = r1.f3550K
            if (r2 == 0) goto L_0x021e
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "huc"
            r0.put(r3, r2)
        L_0x021e:
            java.lang.Boolean r2 = r1.f3551L
            if (r2 == 0) goto L_0x022b
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "aru"
            r0.put(r3, r2)
        L_0x022b:
            java.lang.Boolean r1 = r1.f3552M
            if (r1 == 0) goto L_0x0238
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "dns"
            r0.put(r2, r1)
        L_0x0238:
            android.content.Context r1 = r5.f3523c
            android.graphics.Point r1 = com.applovin.impl.sdk.utils.C1519g.m3428a(r1)
            int r2 = r1.x
            java.lang.String r2 = java.lang.Integer.toString(r2)
            java.lang.String r3 = "dx"
            r0.put(r3, r2)
            int r1 = r1.y
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r2 = "dy"
            r0.put(r2, r1)
            java.lang.String r1 = "accept"
            java.lang.String r2 = "custom_size,launch_app,video"
            r0.put(r1, r2)
            com.applovin.impl.sdk.j r1 = r5.f3521a
            com.applovin.impl.sdk.b.c<java.lang.String> r2 = com.applovin.impl.sdk.p025b.C1369c.f2851U
            java.lang.Object r1 = r1.mo13088a(r2)
            java.lang.String r2 = "api_did"
            r0.put(r2, r1)
            java.lang.String r1 = com.applovin.sdk.AppLovinSdk.VERSION
            java.lang.String r2 = "sdk_version"
            r0.put(r2, r1)
            r1 = 131(0x83, float:1.84E-43)
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r2 = "build"
            r0.put(r2, r1)
            java.lang.String r1 = "format"
            java.lang.String r2 = "json"
            r0.put(r1, r2)
            com.applovin.impl.sdk.k$b r1 = r5.mo13151c()
            java.lang.String r2 = r1.f3530b
            java.lang.String r2 = com.applovin.impl.sdk.utils.C1553o.m3557e(r2)
            java.lang.String r3 = "app_version"
            r0.put(r3, r2)
            long r2 = r1.f3536h
            java.lang.String r2 = java.lang.Long.toString(r2)
            java.lang.String r3 = "ia"
            r0.put(r3, r2)
            java.lang.String r2 = r1.f3533e
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "tg"
            r0.put(r3, r2)
            java.lang.String r2 = r1.f3534f
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "ltg"
            r0.put(r3, r2)
            java.lang.String r2 = r1.f3532d
            java.lang.String r3 = "installer_name"
            r0.put(r3, r2)
            boolean r2 = r1.f3537i
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "test_ads"
            r0.put(r3, r2)
            boolean r1 = r1.f3535g
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "debug"
            r0.put(r2, r1)
            com.applovin.impl.sdk.j r1 = r5.f3521a
            java.lang.String r1 = r1.mo13130n()
            java.lang.String r1 = com.applovin.impl.sdk.utils.C1553o.m3557e(r1)
            java.lang.String r2 = "mediation_provider"
            com.applovin.impl.sdk.utils.C1557r.m3602a((java.lang.String) r2, (java.lang.String) r1, (java.util.Map<java.lang.String, java.lang.String>) r0)
            com.applovin.impl.sdk.j r1 = r5.f3521a
            java.lang.String r1 = com.applovin.impl.sdk.utils.C1520h.m3453f(r1)
            java.lang.String r2 = "network"
            r0.put(r2, r1)
            com.applovin.impl.sdk.j r1 = r5.f3521a
            com.applovin.impl.sdk.b.c<java.lang.String> r2 = com.applovin.impl.sdk.p025b.C1369c.f3036dV
            java.lang.Object r1 = r1.mo13088a(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "plugin_version"
            com.applovin.impl.sdk.utils.C1557r.m3602a((java.lang.String) r2, (java.lang.String) r1, (java.util.Map<java.lang.String, java.lang.String>) r0)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r1 = "preloading"
            r0.put(r1, r7)
            com.applovin.impl.sdk.j r7 = r5.f3521a
            boolean r7 = r7.mo13068H()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r1 = "first_install"
            r0.put(r1, r7)
            com.applovin.impl.sdk.j r7 = r5.f3521a
            boolean r7 = r7.mo13069I()
            r1 = 1
            r7 = r7 ^ r1
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r2 = "first_install_v2"
            r0.put(r2, r7)
            com.applovin.impl.sdk.j r7 = r5.f3521a
            com.applovin.impl.sdk.b.c<java.lang.Boolean> r2 = com.applovin.impl.sdk.p025b.C1369c.f3081eO
            java.lang.Object r7 = r7.mo13088a(r2)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x033b
            com.applovin.impl.sdk.j r7 = r5.f3521a
            java.lang.String r7 = r7.mo13136t()
            java.lang.String r2 = "sdk_key"
            r0.put(r2, r7)
        L_0x033b:
            com.applovin.impl.sdk.j r7 = r5.f3521a
            com.applovin.impl.sdk.b.c<java.lang.String> r2 = com.applovin.impl.sdk.p025b.C1369c.f2855Y
            java.lang.Object r7 = r7.mo13088a(r2)
            java.lang.String r2 = "sc"
            r0.put(r2, r7)
            com.applovin.impl.sdk.j r7 = r5.f3521a
            com.applovin.impl.sdk.b.c<java.lang.String> r2 = com.applovin.impl.sdk.p025b.C1369c.f2856Z
            java.lang.Object r7 = r7.mo13088a(r2)
            java.lang.String r2 = "sc2"
            r0.put(r2, r7)
            com.applovin.impl.sdk.j r7 = r5.f3521a
            com.applovin.impl.sdk.b.c<java.lang.String> r2 = com.applovin.impl.sdk.p025b.C1369c.f2884aa
            java.lang.Object r7 = r7.mo13088a(r2)
            java.lang.String r2 = "sc3"
            r0.put(r2, r7)
            com.applovin.impl.sdk.j r7 = r5.f3521a
            com.applovin.impl.sdk.b.c<java.lang.String> r2 = com.applovin.impl.sdk.p025b.C1369c.f2885ab
            java.lang.Object r7 = r7.mo13088a(r2)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = com.applovin.impl.sdk.utils.C1553o.m3557e(r7)
            java.lang.String r2 = "server_installed_at"
            r0.put(r2, r7)
            com.applovin.impl.sdk.j r7 = r5.f3521a
            com.applovin.impl.sdk.b.e<java.lang.String> r2 = com.applovin.impl.sdk.p025b.C1371e.f3174z
            java.lang.Object r7 = r7.mo13089a(r2)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = com.applovin.impl.sdk.utils.C1553o.m3557e(r7)
            java.lang.String r2 = "persisted_data"
            com.applovin.impl.sdk.utils.C1557r.m3602a((java.lang.String) r2, (java.lang.String) r7, (java.util.Map<java.lang.String, java.lang.String>) r0)
            android.content.Context r7 = r5.f3523c
            java.lang.String r2 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r7 = com.applovin.impl.sdk.utils.C1519g.m3430a(r2, r7)
            java.lang.String r7 = java.lang.Boolean.toString(r7)
            java.lang.String r2 = "v1"
            r0.put(r2, r7)
            java.lang.String r7 = "v2"
            java.lang.String r2 = "true"
            r0.put(r7, r2)
            java.lang.String r7 = "v3"
            r0.put(r7, r2)
            java.lang.String r7 = "v4"
            r0.put(r7, r2)
            java.lang.String r7 = "v5"
            r0.put(r7, r2)
            com.applovin.impl.sdk.j r7 = r5.f3521a
            com.applovin.impl.sdk.b.c<java.lang.Boolean> r2 = com.applovin.impl.sdk.p025b.C1369c.f3114ev
            java.lang.Object r7 = r7.mo13088a(r2)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x041f
            com.applovin.impl.sdk.j r7 = r5.f3521a
            com.applovin.impl.sdk.c.h r7 = r7.mo13072L()
            com.applovin.impl.sdk.c.g r2 = com.applovin.impl.sdk.p026c.C1387g.f3249b
            long r2 = r7.mo12929b(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "li"
            r0.put(r3, r2)
            com.applovin.impl.sdk.c.g r2 = com.applovin.impl.sdk.p026c.C1387g.f3251d
            long r2 = r7.mo12929b(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "si"
            r0.put(r3, r2)
            com.applovin.impl.sdk.c.g r2 = com.applovin.impl.sdk.p026c.C1387g.f3255h
            long r2 = r7.mo12929b(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "pf"
            r0.put(r3, r2)
            com.applovin.impl.sdk.c.g r2 = com.applovin.impl.sdk.p026c.C1387g.f3262o
            long r2 = r7.mo12929b(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "mpf"
            r0.put(r3, r2)
            com.applovin.impl.sdk.c.g r2 = com.applovin.impl.sdk.p026c.C1387g.f3256i
            long r2 = r7.mo12929b(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "gpf"
            r0.put(r3, r2)
            com.applovin.impl.sdk.c.g r2 = com.applovin.impl.sdk.p026c.C1387g.f3260m
            long r2 = r7.mo12929b(r2)
            java.lang.String r7 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "asoac"
            r0.put(r2, r7)
        L_0x041f:
            android.content.Context r7 = r5.f3523c
            java.lang.String r7 = r7.getPackageName()
            java.lang.String r7 = com.applovin.impl.sdk.utils.C1553o.m3558f(r7)
            java.lang.String r2 = "vz"
            r0.put(r2, r7)
            if (r8 == 0) goto L_0x0453
            java.util.concurrent.atomic.AtomicReference<com.applovin.impl.sdk.k$a> r7 = r5.f3525g
            java.lang.Object r7 = r7.get()
            com.applovin.impl.sdk.k$a r7 = (com.applovin.impl.sdk.C1473k.C1475a) r7
            if (r7 == 0) goto L_0x043e
            r5.mo13153e()
            goto L_0x045d
        L_0x043e:
            boolean r7 = com.applovin.impl.sdk.utils.C1557r.m3620b()
            if (r7 == 0) goto L_0x0453
            com.applovin.impl.sdk.k$a r7 = new com.applovin.impl.sdk.k$a
            r7.<init>()
            java.lang.String r8 = java.lang.Boolean.toString(r1)
            java.lang.String r1 = "inc"
            r0.put(r1, r8)
            goto L_0x045d
        L_0x0453:
            com.applovin.impl.sdk.j r7 = r5.f3521a
            com.applovin.impl.sdk.k r7 = r7.mo13074N()
            com.applovin.impl.sdk.k$a r7 = r7.mo13152d()
        L_0x045d:
            java.lang.String r8 = r7.f3528b
            boolean r1 = com.applovin.impl.sdk.utils.C1553o.m3554b(r8)
            if (r1 == 0) goto L_0x046a
            java.lang.String r1 = "idfa"
            r0.put(r1, r8)
        L_0x046a:
            boolean r7 = r7.f3527a
            java.lang.String r7 = java.lang.Boolean.toString(r7)
            java.lang.String r8 = "dnt"
            r0.put(r8, r7)
            com.applovin.impl.sdk.j r7 = r5.f3521a
            com.applovin.impl.sdk.b.c<java.lang.Boolean> r8 = com.applovin.impl.sdk.p025b.C1369c.f3029dO
            java.lang.Object r7 = r7.mo13088a(r8)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0490
            com.applovin.impl.sdk.j r7 = r5.f3521a
            java.lang.String r7 = r7.mo13125i()
            java.lang.String r8 = "cuid"
            com.applovin.impl.sdk.utils.C1557r.m3602a((java.lang.String) r8, (java.lang.String) r7, (java.util.Map<java.lang.String, java.lang.String>) r0)
        L_0x0490:
            com.applovin.impl.sdk.j r7 = r5.f3521a
            com.applovin.impl.sdk.b.c<java.lang.Boolean> r8 = com.applovin.impl.sdk.p025b.C1369c.f3032dR
            java.lang.Object r7 = r7.mo13088a(r8)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x04ab
            com.applovin.impl.sdk.j r7 = r5.f3521a
            java.lang.String r7 = r7.mo13126j()
            java.lang.String r8 = "compass_random_token"
            r0.put(r8, r7)
        L_0x04ab:
            com.applovin.impl.sdk.j r7 = r5.f3521a
            com.applovin.impl.sdk.b.c<java.lang.Boolean> r8 = com.applovin.impl.sdk.p025b.C1369c.f3034dT
            java.lang.Object r7 = r7.mo13088a(r8)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x04c6
            com.applovin.impl.sdk.j r7 = r5.f3521a
            java.lang.String r7 = r7.mo13127k()
            java.lang.String r8 = "applovin_random_token"
            r0.put(r8, r7)
        L_0x04c6:
            if (r6 == 0) goto L_0x04cb
            r0.putAll(r6)
        L_0x04cb:
            java.util.UUID r6 = java.util.UUID.randomUUID()
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "rid"
            r0.put(r7, r6)
            com.applovin.impl.sdk.j r6 = r5.f3521a
            com.applovin.impl.sdk.network.a r6 = r6.mo13070J()
            com.applovin.impl.sdk.network.a$b r6 = r6.mo13169a()
            if (r6 == 0) goto L_0x0514
            long r7 = r6.mo13173a()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "lrm_ts_ms"
            r0.put(r8, r7)
            java.lang.String r7 = r6.mo13174b()
            java.lang.String r8 = "lrm_url"
            r0.put(r8, r7)
            long r7 = r6.mo13176d()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "lrm_ct_ms"
            r0.put(r8, r7)
            long r6 = r6.mo13175c()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "lrm_rs"
            r0.put(r7, r6)
        L_0x0514:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1473k.mo13149a(java.util.Map, boolean, boolean):java.util.Map");
    }

    /* renamed from: b */
    public C1478d mo13150b() {
        C1478d dVar;
        TelephonyManager telephonyManager;
        Object obj = this.f3524d.get(C1478d.class);
        if (obj != null) {
            dVar = (C1478d) obj;
        } else {
            dVar = new C1478d();
            dVar.f3568k = Locale.getDefault();
            dVar.f3561d = Build.MODEL;
            dVar.f3559b = Build.VERSION.RELEASE;
            dVar.f3558a = "android";
            dVar.f3562e = Build.MANUFACTURER;
            dVar.f3563f = Build.BRAND;
            dVar.f3564g = Build.HARDWARE;
            dVar.f3560c = Build.VERSION.SDK_INT;
            dVar.f3565h = Build.DEVICE;
            dVar.f3575r = m3148n();
            dVar.f3540A = m3153s();
            dVar.f3553N = m3143i();
            SensorManager sensorManager = (SensorManager) this.f3523c.getSystemService("sensor");
            if (sensorManager != null) {
                dVar.f3541B = sensorManager.getDefaultSensor(4) != null;
            }
            if (m3138b("android.permission.READ_PHONE_STATE") && (telephonyManager = (TelephonyManager) this.f3523c.getSystemService("phone")) != null) {
                dVar.f3566i = telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH);
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                try {
                    dVar.f3567j = URLEncoder.encode(networkOperatorName, "UTF-8");
                } catch (UnsupportedEncodingException unused) {
                    dVar.f3567j = networkOperatorName;
                }
            }
            DisplayMetrics displayMetrics = this.f3523c.getResources().getDisplayMetrics();
            dVar.f3570m = displayMetrics.density;
            dVar.f3571n = displayMetrics.densityDpi;
            dVar.f3572o = displayMetrics.xdpi;
            dVar.f3573p = displayMetrics.ydpi;
            Point a = C1519g.m3428a(this.f3523c);
            dVar.f3574q = Math.sqrt(Math.pow((double) a.x, 2.0d) + Math.pow((double) a.y, 2.0d)) / ((double) dVar.f3572o);
            if (((Boolean) this.f3521a.mo13088a(C1369c.f3096ed)).booleanValue()) {
                dVar.f3579v = m3145k();
            }
            if (((Boolean) this.f3521a.mo13088a(C1369c.f3097ee)).booleanValue()) {
                dVar.f3580w = m3146l();
            }
            dVar.f3556Q = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            this.f3524d.put(C1478d.class, dVar);
        }
        return m3133a(dVar);
    }

    /* renamed from: c */
    public C1476b mo13151c() {
        PackageInfo packageInfo;
        Object obj = this.f3524d.get(C1476b.class);
        if (obj != null) {
            return (C1476b) obj;
        }
        ApplicationInfo applicationInfo = this.f3523c.getApplicationInfo();
        long lastModified = new File(applicationInfo.sourceDir).lastModified();
        PackageManager packageManager = this.f3523c.getPackageManager();
        String str = null;
        try {
            packageInfo = packageManager.getPackageInfo(this.f3523c.getPackageName(), 0);
            try {
                str = packageManager.getInstallerPackageName(applicationInfo.packageName);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            packageInfo = null;
        }
        C1476b bVar = new C1476b();
        bVar.f3531c = applicationInfo.packageName;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        bVar.f3532d = str;
        bVar.f3536h = lastModified;
        bVar.f3529a = String.valueOf(packageManager.getApplicationLabel(applicationInfo));
        if (packageInfo != null) {
            str2 = packageInfo.versionName;
        }
        bVar.f3530b = str2;
        bVar.f3533e = C1557r.m3588a(C1371e.f3155g, this.f3521a);
        bVar.f3534f = C1557r.m3588a(C1371e.f3156h, this.f3521a);
        bVar.f3535g = C1557r.m3621b(this.f3521a);
        this.f3524d.put(C1476b.class, bVar);
        return bVar;
    }

    /* renamed from: d */
    public C1475a mo13152d() {
        C1475a h = m3142h();
        if (!((Boolean) this.f3521a.mo13088a(C1369c.f3028dN)).booleanValue()) {
            h = new C1475a();
        } else if (h.f3527a && !((Boolean) this.f3521a.mo13088a(C1369c.f3027dM)).booleanValue()) {
            h.f3528b = "";
        }
        mo13151c().f3537i = C1553o.m3554b(h.f3528b) ? this.f3521a.mo13128l().getTestDeviceAdvertisingIds().contains(h.f3528b) : false;
        return h;
    }

    /* renamed from: e */
    public void mo13153e() {
        this.f3521a.mo13071K().mo13014a((C1392a) new C1416i(this.f3521a, new C1416i.C1417a() {
            /* renamed from: a */
            public void mo12575a(C1475a aVar) {
                C1473k.this.f3525g.set(aVar);
            }
        }), C1435s.C1437a.ADVERTISING_INFO_COLLECTION);
    }
}
