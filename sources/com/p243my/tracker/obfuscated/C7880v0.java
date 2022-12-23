package com.p243my.tracker.obfuscated;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.p243my.tracker.MyTracker;
import com.p243my.tracker.MyTrackerConfig;
import com.p243my.tracker.MyTrackerParams;
import com.p243my.tracker.config.AntiFraudConfig;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.net.URI;

/* renamed from: com.my.tracker.obfuscated.v0 */
public final class C7880v0 {

    /* renamed from: a */
    private final MyTrackerParams f20181a = new MyTrackerParams();

    /* renamed from: b */
    private String f20182b = "";

    /* renamed from: c */
    private AntiFraudConfig f20183c = AntiFraudConfig.newBuilder().build();

    /* renamed from: d */
    private volatile boolean f20184d = true;

    /* renamed from: e */
    private volatile boolean f20185e = true;

    /* renamed from: f */
    private volatile boolean f20186f = true;

    /* renamed from: g */
    private volatile boolean f20187g = true;

    /* renamed from: h */
    private volatile boolean f20188h = true;

    /* renamed from: i */
    private volatile boolean f20189i = true;

    /* renamed from: j */
    private volatile int f20190j = 30;

    /* renamed from: k */
    private volatile int f20191k = 0;

    /* renamed from: l */
    private volatile int f20192l = ErrorCode.UNDEFINED_ERROR;

    /* renamed from: m */
    private volatile String f20193m = null;

    /* renamed from: n */
    private volatile MyTrackerConfig.InstalledPackagesProvider f20194n = null;

    /* renamed from: o */
    private volatile MyTrackerConfig.OkHttpClientProvider f20195o = null;

    /* renamed from: p */
    private volatile String f20196p = m21559a("https", "tracker-api.my.com", (String) null);

    /* renamed from: q */
    private volatile MyTracker.AttributionListener f20197q = null;

    /* renamed from: r */
    private volatile Handler f20198r = null;

    private C7880v0() {
    }

    /* renamed from: a */
    private static String m21559a(String str, String str2, String str3) {
        Uri.Builder builder = new Uri.Builder();
        if (TextUtils.isEmpty(str)) {
            str = "https";
        }
        Uri.Builder encodedAuthority = builder.scheme(str).encodedAuthority(str2);
        if (!TextUtils.isEmpty(str3)) {
            encodedAuthority = encodedAuthority.encodedPath(str3);
        }
        return encodedAuthority.appendEncodedPath("v3/").toString();
    }

    /* renamed from: s */
    public static C7880v0 m21560s() {
        return new C7880v0();
    }

    /* renamed from: a */
    public AntiFraudConfig mo52516a() {
        return this.f20183c;
    }

    /* renamed from: a */
    public void mo52517a(int i) {
        if (i > 86400) {
            C7877u0.m21547a("Invalid bufferingPeriod value " + i + ", bufferingPeriod set to max " + 86400);
            i = 86400;
        } else if (i < 1) {
            C7877u0.m21547a("Invalid bufferingPeriod value " + i + ", bufferingPeriod set to min " + 1);
            i = 1;
        }
        this.f20192l = i;
    }

    /* renamed from: a */
    public void mo52518a(MyTracker.AttributionListener attributionListener, Handler handler) {
        this.f20197q = attributionListener;
        this.f20198r = handler;
    }

    /* renamed from: a */
    public void mo52519a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider) {
        this.f20194n = installedPackagesProvider;
    }

    /* renamed from: a */
    public void mo52520a(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.f20195o = okHttpClientProvider;
    }

    /* renamed from: a */
    public void mo52521a(AntiFraudConfig antiFraudConfig) {
        this.f20183c = antiFraudConfig;
    }

    /* renamed from: a */
    public void mo52522a(C7831m0 m0Var) {
        m0Var.mo52410c(this.f20182b);
        this.f20181a.putDataToBuilder(m0Var);
        int i = this.f20190j;
        if (i != 30) {
            m0Var.mo52408c(i);
        }
        int i2 = this.f20192l;
        if (i2 != 900) {
            m0Var.mo52379a(i2);
        }
        int i3 = this.f20191k;
        if (i3 != 0) {
            m0Var.mo52398b(i3);
        }
        if (!this.f20185e) {
            m0Var.mo52443l();
        }
        if (!this.f20184d) {
            m0Var.mo52440k();
        }
        if (!this.f20186f) {
            m0Var.mo52437j();
        }
        if (!this.f20187g) {
            m0Var.mo52396b();
        }
        if (!this.f20188h) {
            m0Var.mo52422f();
        }
        if (!this.f20189i) {
            m0Var.mo52427g();
        }
        if (!this.f20183c.useLightSensor) {
            m0Var.mo52412d();
        }
        if (!this.f20183c.useMagneticFieldSensor) {
            m0Var.mo52417e();
        }
        if (!this.f20183c.useGyroscope) {
            m0Var.mo52406c();
        }
        if (!this.f20183c.usePressureSensor) {
            m0Var.mo52431h();
        }
        if (!this.f20183c.useProximitySensor) {
            m0Var.mo52434i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo52523a(String str) {
        this.f20182b = str;
    }

    /* renamed from: a */
    public void mo52524a(boolean z) {
        this.f20187g = z;
    }

    /* renamed from: b */
    public Handler mo52525b() {
        return this.f20198r;
    }

    /* renamed from: b */
    public void mo52526b(int i) {
        if (i > 432000) {
            C7877u0.m21547a("Invalid forcingPeriod value " + i + ", forcingPeriod set to max " + 432000);
            this.f20191k = 432000;
            return;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid forcingPeriod value ");
            sb.append(i);
            sb.append(", forcingPeriod set to min ");
            i = 0;
            sb.append(0);
            C7877u0.m21547a(sb.toString());
        }
        this.f20191k = i;
    }

    /* renamed from: b */
    public void mo52527b(String str) {
        URI uri;
        try {
            if (TextUtils.isEmpty(str)) {
                this.f20196p = m21559a("https", "tracker-api.my.com", (String) null);
                return;
            }
            if (str.contains("://")) {
                uri = new URI(str);
            } else {
                uri = new URI("https://" + str);
            }
            this.f20196p = m21559a(uri.getScheme(), uri.getAuthority(), uri.getPath());
            C7877u0.m21547a("set tracker url to " + this.f20196p);
        } catch (Throwable unused) {
            this.f20196p = m21559a("https", "tracker-api.my.com", (String) null);
            C7877u0.m21551b("unable to set invalid url " + this.f20196p + ", using default");
        }
    }

    /* renamed from: b */
    public void mo52528b(boolean z) {
        this.f20186f = z;
    }

    /* renamed from: c */
    public MyTracker.AttributionListener mo52529c() {
        return this.f20197q;
    }

    /* renamed from: c */
    public void mo52530c(int i) {
        if (i > 7200) {
            C7877u0.m21547a("Invalid launchTimeout value " + i + ", timeout set to max " + 7200);
            i = 7200;
        } else if (i < 30) {
            C7877u0.m21547a("Invalid launchTimeout value " + i + ", timeout set to min " + 30);
            i = 30;
        }
        this.f20190j = i;
    }

    /* renamed from: c */
    public void mo52531c(String str) {
        this.f20193m = str;
    }

    /* renamed from: c */
    public void mo52532c(boolean z) {
        this.f20184d = z;
    }

    /* renamed from: d */
    public int mo52533d() {
        return this.f20192l;
    }

    /* renamed from: d */
    public void mo52534d(int i) {
        mo52527b(i != 0 ? i != 1 ? null : "eu.tracker-api.my.com" : "ru.tracker-api.my.com");
    }

    /* renamed from: d */
    public void mo52535d(boolean z) {
        this.f20185e = z;
    }

    /* renamed from: e */
    public int mo52536e() {
        return this.f20191k;
    }

    /* renamed from: e */
    public void mo52537e(boolean z) {
        this.f20188h = z;
    }

    /* renamed from: f */
    public String mo52538f() {
        return this.f20182b;
    }

    /* renamed from: f */
    public void mo52539f(boolean z) {
        this.f20189i = z;
    }

    /* renamed from: g */
    public MyTrackerConfig.InstalledPackagesProvider mo52540g() {
        return this.f20194n;
    }

    /* renamed from: h */
    public int mo52541h() {
        return this.f20190j;
    }

    /* renamed from: i */
    public MyTrackerParams mo52542i() {
        return this.f20181a;
    }

    /* renamed from: j */
    public MyTrackerConfig.OkHttpClientProvider mo52543j() {
        return this.f20195o;
    }

    /* renamed from: k */
    public String mo52544k() {
        return this.f20196p;
    }

    /* renamed from: l */
    public String mo52545l() {
        return this.f20193m;
    }

    /* renamed from: m */
    public boolean mo52546m() {
        return this.f20187g;
    }

    /* renamed from: n */
    public boolean mo52547n() {
        return this.f20186f;
    }

    /* renamed from: o */
    public boolean mo52548o() {
        return this.f20184d;
    }

    /* renamed from: p */
    public boolean mo52549p() {
        return this.f20185e;
    }

    /* renamed from: q */
    public boolean mo52550q() {
        return this.f20188h;
    }

    /* renamed from: r */
    public boolean mo52551r() {
        return this.f20189i;
    }

    /* renamed from: t */
    public void mo52552t() {
        this.f20193m = "com.my.games.vendorapp";
    }
}
