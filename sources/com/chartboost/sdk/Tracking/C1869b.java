package com.chartboost.sdk.Tracking;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.support.p003v4.media.session.PlaybackStateCompat;
import com.chartboost.sdk.C2022j;
import com.chartboost.sdk.C2026k;
import com.chartboost.sdk.Libraries.C1823d;
import com.chartboost.sdk.Libraries.CBUtility;
import com.chartboost.sdk.Networking.requests.models.MediationModel;
import com.chartboost.sdk.Privacy.model.CCPA;
import com.chartboost.sdk.Privacy.model.DataUseConsent;
import java.util.Locale;

/* renamed from: com.chartboost.sdk.Tracking.b */
public class C1869b {

    /* renamed from: A */
    private int f4613A;

    /* renamed from: B */
    private long f4614B;

    /* renamed from: C */
    private long f4615C;

    /* renamed from: D */
    private int f4616D;

    /* renamed from: E */
    private int f4617E;

    /* renamed from: F */
    private int f4618F;

    /* renamed from: G */
    private long f4619G;

    /* renamed from: a */
    private String f4620a;

    /* renamed from: b */
    private int f4621b;

    /* renamed from: c */
    private String f4622c;

    /* renamed from: d */
    private String f4623d;

    /* renamed from: e */
    private boolean f4624e;

    /* renamed from: f */
    private String f4625f;

    /* renamed from: g */
    private String f4626g;

    /* renamed from: h */
    private String f4627h;

    /* renamed from: i */
    private String f4628i;

    /* renamed from: j */
    private String f4629j;

    /* renamed from: k */
    private String f4630k;

    /* renamed from: l */
    private String f4631l;

    /* renamed from: m */
    private String f4632m;

    /* renamed from: n */
    private String f4633n;

    /* renamed from: o */
    private String f4634o;

    /* renamed from: p */
    private String f4635p;

    /* renamed from: q */
    private String f4636q;

    /* renamed from: r */
    private String f4637r;

    /* renamed from: s */
    private String f4638s;

    /* renamed from: t */
    private String f4639t;

    /* renamed from: u */
    private String f4640u;

    /* renamed from: v */
    private String f4641v;

    /* renamed from: w */
    private int f4642w;

    /* renamed from: x */
    private boolean f4643x;

    /* renamed from: y */
    private int f4644y;

    /* renamed from: z */
    private boolean f4645z;

    /* renamed from: com.chartboost.sdk.Tracking.b$b */
    private static class C1871b {

        /* renamed from: a */
        public int f4646a;

        /* renamed from: b */
        public boolean f4647b;

        private C1871b() {
        }
    }

    /* renamed from: D */
    private static String m4215D() {
        return "Amazon".equalsIgnoreCase(Build.MANUFACTURER) ? "Amazon" : "Android";
    }

    /* renamed from: K */
    private static String m4216K() {
        if (Build.VERSION.SDK_INT >= 24) {
            return LocaleList.getDefault().get(0).getLanguage();
        }
        return Locale.getDefault().getLanguage();
    }

    /* renamed from: A */
    public String mo14373A() {
        return this.f4632m;
    }

    /* renamed from: B */
    public String mo14374B() {
        return this.f4634o;
    }

    /* renamed from: C */
    public String mo14375C() {
        return this.f4633n;
    }

    /* renamed from: E */
    public int mo14376E() {
        return this.f4621b;
    }

    /* renamed from: F */
    public long mo14377F() {
        return this.f4619G;
    }

    /* renamed from: G */
    public String mo14378G() {
        return this.f4620a;
    }

    /* renamed from: H */
    public int mo14379H() {
        return this.f4618F;
    }

    /* renamed from: I */
    public int mo14380I() {
        return this.f4616D;
    }

    /* renamed from: J */
    public int mo14381J() {
        return this.f4617E;
    }

    /* renamed from: a */
    public String mo14382a() {
        return this.f4622c;
    }

    /* renamed from: b */
    public void mo14389b(String str) {
        this.f4626g = str;
    }

    /* renamed from: c */
    public boolean mo14395c() {
        return this.f4624e;
    }

    /* renamed from: d */
    public void mo14397d(int i) {
        this.f4621b = i;
    }

    /* renamed from: e */
    public String mo14399e() {
        return this.f4625f;
    }

    /* renamed from: f */
    public String mo14402f() {
        return this.f4623d;
    }

    /* renamed from: g */
    public void mo14407g(String str) {
        this.f4627h = str;
    }

    /* renamed from: h */
    public void mo14409h(String str) {
        this.f4638s = str;
    }

    /* renamed from: i */
    public void mo14410i(String str) {
        this.f4628i = str;
    }

    /* renamed from: j */
    public String mo14412j() {
        return this.f4640u;
    }

    /* renamed from: k */
    public void mo14415k(String str) {
        this.f4629j = str;
    }

    /* renamed from: l */
    public String mo14416l() {
        return this.f4627h;
    }

    /* renamed from: m */
    public String mo14418m() {
        return this.f4638s;
    }

    /* renamed from: n */
    public long mo14420n() {
        return this.f4615C;
    }

    /* renamed from: o */
    public String mo14422o() {
        return this.f4628i;
    }

    /* renamed from: p */
    public boolean mo14425p() {
        return this.f4645z;
    }

    /* renamed from: q */
    public String mo14426q() {
        return this.f4641v;
    }

    /* renamed from: r */
    public String mo14428r() {
        return this.f4629j;
    }

    /* renamed from: s */
    public String mo14430s() {
        return this.f4630k;
    }

    /* renamed from: t */
    public void mo14433t(String str) {
        this.f4620a = str;
    }

    public String toString() {
        return "Environment{session_id=" + this.f4620a + ", session_count=" + this.f4621b + '\'' + ", app_id='" + this.f4622c + '\'' + ", chartboost_sdk_version='" + this.f4623d + '\'' + ", chartboost_sdk_autocache_enabled=" + this.f4624e + ", chartboost_sdk_gdpr='" + this.f4625f + '\'' + ", chartboost_sdk_ccpa='" + this.f4626g + '\'' + ", device_id='" + this.f4627h + '\'' + ", device_model='" + this.f4628i + '\'' + ", device_os_version='" + this.f4629j + '\'' + ", device_platform='" + this.f4630k + '\'' + ", device_country='" + this.f4631l + '\'' + ", device_language='" + this.f4638s + '\'' + ", device_timezone='" + this.f4639t + '\'' + ", device_connection_type='" + this.f4640u + '\'' + ", device_orientation='" + this.f4641v + '\'' + ", device_battery_level='" + this.f4642w + '\'' + ", device_charging_status='" + this.f4643x + '\'' + ", device_volume='" + this.f4644y + '\'' + ", device_mute='" + this.f4645z + '\'' + ", device_audio_output=" + this.f4613A + ", device_storage='" + this.f4614B + '\'' + ", device_low_memory_warning='" + this.f4615C + '\'' + ", device_up_time='" + mo14436v() + '\'' + ", session_impression_interstitial_count='" + this.f4616D + '\'' + ", session_impression_rewarded_count='" + this.f4617E + '\'' + ", session_impression_banner_count='" + this.f4618F + '\'' + ", session_duration='" + this.f4619G + '\'' + '}';
    }

    /* renamed from: u */
    public String mo14435u() {
        return this.f4639t;
    }

    /* renamed from: v */
    public long mo14436v() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: w */
    public int mo14437w() {
        return this.f4644y;
    }

    /* renamed from: x */
    public String mo14438x() {
        return this.f4635p;
    }

    /* renamed from: y */
    public String mo14439y() {
        return this.f4637r;
    }

    /* renamed from: z */
    public String mo14440z() {
        return this.f4636q;
    }

    /* renamed from: a */
    public void mo14385a(String str) {
        this.f4622c = str;
    }

    /* renamed from: b */
    public void mo14387b(int i) {
        this.f4642w = i;
    }

    /* renamed from: c */
    public void mo14393c(String str) {
        this.f4625f = str;
    }

    /* renamed from: d */
    public void mo14398d(String str) {
        this.f4623d = str;
    }

    /* renamed from: e */
    public void mo14401e(String str) {
        this.f4640u = str;
    }

    /* renamed from: f */
    public void mo14404f(String str) {
        this.f4631l = str;
    }

    /* renamed from: g */
    public int mo14405g() {
        return this.f4613A;
    }

    /* renamed from: h */
    public int mo14408h() {
        return this.f4642w;
    }

    /* renamed from: i */
    public boolean mo14411i() {
        return this.f4643x;
    }

    /* renamed from: j */
    public void mo14413j(String str) {
        this.f4641v = str;
    }

    /* renamed from: k */
    public String mo14414k() {
        return this.f4631l;
    }

    /* renamed from: l */
    public void mo14417l(String str) {
        this.f4630k = str;
    }

    /* renamed from: m */
    public void mo14419m(String str) {
        this.f4639t = str;
    }

    /* renamed from: n */
    public void mo14421n(String str) {
        this.f4635p = str;
    }

    /* renamed from: o */
    public void mo14423o(String str) {
        this.f4637r = str;
    }

    /* renamed from: p */
    public void mo14424p(String str) {
        this.f4636q = str;
    }

    /* renamed from: q */
    public void mo14427q(String str) {
        this.f4632m = str;
    }

    /* renamed from: r */
    public void mo14429r(String str) {
        this.f4634o = str;
    }

    /* renamed from: s */
    public void mo14431s(String str) {
        this.f4633n = str;
    }

    /* renamed from: t */
    public long mo14432t() {
        return this.f4614B;
    }

    /* renamed from: a */
    public void mo14386a(boolean z) {
        this.f4624e = z;
    }

    /* renamed from: b */
    public void mo14390b(boolean z) {
        this.f4643x = z;
    }

    /* renamed from: c */
    public void mo14391c(int i) {
        this.f4644y = i;
    }

    /* renamed from: d */
    public String mo14396d() {
        return this.f4626g;
    }

    /* renamed from: e */
    public void mo14400e(int i) {
        this.f4618F = i;
    }

    /* renamed from: f */
    public void mo14403f(int i) {
        this.f4616D = i;
    }

    /* renamed from: g */
    public void mo14406g(int i) {
        this.f4617E = i;
    }

    /* renamed from: d */
    private static C1871b m4223d(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                BatteryManager batteryManager = (BatteryManager) context.getSystemService("batterymanager");
                if (batteryManager != null) {
                    int intProperty = batteryManager.getIntProperty(4);
                    boolean z = false;
                    if (Build.VERSION.SDK_INT >= 23) {
                        z = batteryManager.isCharging();
                    }
                    C1871b bVar = new C1871b();
                    bVar.f4646a = intProperty;
                    bVar.f4647b = z;
                    return bVar;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    private static long m4224e(Context context) {
        try {
            String file = context.getCacheDir().toString();
            return new StatFs(file + "/.chartboost").getAvailableBytes();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: f */
    private static boolean m4225f(Context context) {
        AudioManager a = m4217a(context);
        if (a == null || a.getRingerMode() == 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo14383a(int i) {
        this.f4613A = i;
    }

    /* renamed from: b */
    public void mo14388b(long j) {
        this.f4614B = j;
    }

    /* renamed from: c */
    public void mo14394c(boolean z) {
        this.f4645z = z;
    }

    /* renamed from: b */
    private static int m4220b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                AudioDeviceInfo[] devices = audioManager.getDevices(2);
                if (devices.length > 0) {
                    AudioDeviceInfo audioDeviceInfo = devices[0];
                    if (audioDeviceInfo.getType() == 2) {
                        return 0;
                    }
                    if (audioDeviceInfo.getType() == 4) {
                        return 1;
                    }
                    return audioDeviceInfo.getType() == 8 ? 2 : 3;
                }
            } else if (audioManager.isSpeakerphoneOn()) {
                return 0;
            } else {
                return 3;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public void mo14384a(long j) {
        this.f4615C = j;
    }

    /* renamed from: c */
    public void mo14392c(long j) {
        this.f4619G = j;
    }

    /* renamed from: a */
    public static C1869b m4218a(Context context, C1823d.C1824a aVar, C1876g gVar, String str) {
        String str2;
        int i;
        int i2;
        C1869b bVar = new C1869b();
        if (context == null) {
            return bVar;
        }
        int i3 = -1;
        long j = -1;
        int i4 = 0;
        if (gVar != null) {
            try {
                String e = gVar.mo14451e();
                int c = gVar.mo14449c();
                i4 = gVar.mo14448b(0);
                int b = gVar.mo14448b(1);
                int b2 = gVar.mo14448b(3);
                long d = gVar.mo14450d();
                str2 = e;
                i3 = c;
                int i5 = b2;
                i2 = b;
                j = d;
                i = i5;
            } catch (Exception unused) {
            }
        } else {
            str2 = "";
            i2 = 0;
            i = 0;
        }
        bVar.mo14433t(str2);
        bVar.mo14397d(i3);
        bVar.mo14385a(C2026k.f5253j);
        bVar.mo14398d("8.2.1");
        bVar.mo14386a(C2026k.f5257n);
        DataUseConsent a = C2022j.m4948a(context).mo14855a(CCPA.CCPA_STANDARD);
        if (a != null) {
            bVar.mo14389b(a.getConsent());
        }
        DataUseConsent a2 = C2022j.m4948a(context).mo14855a("gdpr");
        if (a2 != null) {
            bVar.mo14393c(a2.getConsent());
        } else {
            bVar.mo14393c("-1");
        }
        C1871b d2 = m4223d(context);
        if (d2 != null) {
            bVar.mo14387b(d2.f4646a);
            bVar.mo14390b(d2.f4647b);
        }
        bVar.mo14407g(m4219a(aVar));
        bVar.mo14404f(Locale.getDefault().getCountry());
        bVar.mo14401e(str);
        bVar.mo14409h(m4216K());
        bVar.mo14410i(Build.MODEL);
        bVar.mo14415k("Android " + Build.VERSION.RELEASE);
        bVar.mo14417l(m4215D());
        bVar.mo14413j(CBUtility.m4010c(context));
        bVar.mo14419m(CBUtility.m4012d());
        bVar.mo14388b(m4224e(context));
        bVar.mo14384a(m4221b());
        bVar.mo14391c(m4222c(context));
        bVar.mo14394c(m4225f(context));
        bVar.mo14383a(m4220b(context));
        if (C2026k.f5248e != null) {
            bVar.mo14421n(C2026k.f5248e.name());
            bVar.mo14423o(C2026k.f5250g);
            bVar.mo14424p(C2026k.f5249f);
        }
        MediationModel mediationModel = C2026k.f5252i;
        if (mediationModel != null) {
            bVar.mo14427q(mediationModel.getMediation());
            bVar.mo14431s(mediationModel.getMediationVersion());
            bVar.mo14429r(mediationModel.getAdapterVersion());
        }
        bVar.mo14403f(i4);
        bVar.mo14406g(i2);
        bVar.mo14400e(i);
        bVar.mo14392c(j);
        return bVar;
    }

    /* renamed from: c */
    private static int m4222c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return (int) ((((float) audioManager.getStreamVolume(3)) / ((float) audioManager.getStreamMaxVolume(3))) * 100.0f);
    }

    /* renamed from: b */
    private static long m4221b() {
        try {
            Runtime runtime = Runtime.getRuntime();
            return (runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory())) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    private static String m4219a(C1823d.C1824a aVar) {
        if (aVar == null) {
            return "unknown";
        }
        String str = aVar.f4387d;
        return str == null ? aVar.f4386c : str;
    }

    /* renamed from: a */
    private static AudioManager m4217a(Context context) {
        try {
            return (AudioManager) context.getSystemService("audio");
        } catch (Exception unused) {
            return null;
        }
    }
}
