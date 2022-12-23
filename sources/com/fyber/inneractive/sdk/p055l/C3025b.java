package com.fyber.inneractive.sdk.p055l;

import android.location.Location;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.fyber.inneractive.sdk.config.C2788f;
import com.fyber.inneractive.sdk.config.C2796l;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.p039dv.C2896g;
import com.fyber.inneractive.sdk.p052k.p053a.p054a.C3023a;
import com.fyber.inneractive.sdk.util.C3621ac;
import com.fyber.inneractive.sdk.util.C3656k;
import com.fyber.inneractive.sdk.util.C3657l;
import com.fyber.inneractive.sdk.util.C3675s;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.l.b */
public final class C3025b implements C3026c {

    /* renamed from: a */
    private static final List<Integer> f7442a = Arrays.asList(new Integer[]{5});

    /* renamed from: b */
    private static final List<Integer> f7443b = Arrays.asList(new Integer[]{Integer.valueOf(C3023a.VAST_2_0.f7441g), Integer.valueOf(C3023a.VAST_2_0_WRAPPER.f7441g)});

    /* renamed from: c */
    private static final List<String> f7444c = Arrays.asList(new String[]{"video/mp4", "video/webm", "video/3gpp"});

    /* renamed from: d */
    private final C2767s f7445d;

    /* renamed from: e */
    private Location f7446e = C3675s.C3680a.f9970a.mo19583a();

    /* renamed from: f */
    private String f7447f = C3656k.m9084a();

    public C3025b(C2767s sVar) {
        this.f7445d = sVar;
    }

    /* renamed from: a */
    public final List<Integer> mo18505a() {
        return f7442a;
    }

    /* renamed from: b */
    public final List<Integer> mo18508b() {
        return f7443b;
    }

    /* renamed from: c */
    public final List<String> mo18509c() {
        return f7444c;
    }

    /* renamed from: d */
    public final String mo18510d() {
        return C3656k.m9094f();
    }

    /* renamed from: e */
    public final String mo18511e() {
        return C3656k.m9095g();
    }

    /* renamed from: a */
    public final String mo18504a(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append('-');
        sb.append("Android-7.8.4");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb.append('-');
            sb.append(InneractiveAdManager.getDevPlatform());
        }
        return sb.toString();
    }

    /* renamed from: f */
    public final String mo18512f() {
        String d = C2788f.m6076d();
        return TextUtils.isEmpty(d) ? C2796l.m6100a() : d;
    }

    /* renamed from: g */
    public final boolean mo18513g() {
        return C2796l.m6102c();
    }

    /* renamed from: h */
    public final Boolean mo18514h() {
        return IAConfigManager.m5936g().mo18028b();
    }

    /* renamed from: i */
    public final JSONArray mo18515i() {
        C2767s sVar = this.f7445d;
        if (sVar != null) {
            return sVar.mo18014c();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo18506a(Map<String, String> map, String str) {
        map.put("frmn", C3024a.m7048a());
        map.put("dsk_t", m7063a(C3024a.m7054e()));
        map.put("dsk_a", m7063a(C3024a.m7052c()));
        map.put("headset", m7062a(C3024a.m7053d()));
        map.put("is_muted", C3024a.m7055f());
        map.put("btry_c", m7062a(C3024a.m7056g()));
        map.put("btry_l", C3024a.m7057h());
        map.put("bt_con", m7062a(C3024a.m7058i()));
        map.put("tod", m7063a(C3024a.m7061l()));
        map.put("apnm", m7062a(C3024a.m7059j()));
        map.put("dnd", m7062a(C3024a.m7060k()));
        map.put("lng", IAConfigManager.f6419n.f6439k);
        String a = IAConfigManager.m5943n().mo18083a(C3024a.m7047a(str), "LAST_DOMAIN_SHOWED");
        boolean z = false;
        if (!TextUtils.isEmpty(a) && a.contains(",")) {
            a = a.split(",")[0];
        }
        map.put("ldomain", a);
        map.put("lbundle", IAConfigManager.m5943n().mo18083a(C3024a.m7047a(str), "LAST_APP_BUNDLE_ID"));
        String a2 = IAConfigManager.m5943n().mo18083a(C3024a.m7047a(str), "LAST_CLICKED");
        String str2 = "";
        if (TextUtils.equals(a2, AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
            a2 = str2;
        }
        map.put("lclick", a2);
        String a3 = IAConfigManager.m5943n().mo18083a(C3024a.m7047a(str), "LAST_VAST_SKIPED");
        if (!TextUtils.equals(a3, AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
            str2 = a3;
        }
        map.put("v_lskip", str2);
        map.put("v_lclicktype", IAConfigManager.m5943n().mo18083a(C3024a.m7047a(str), "LAST_VAST_CLICKED_TYPE"));
        map.put("sdur", m7063a(Long.valueOf(TimeUnit.SECONDS.convert(SystemClock.elapsedRealtime() - IAConfigManager.m5943n().mo18082a("SESSION_STAMP"), TimeUnit.MILLISECONDS))));
        map.put("userid", IAConfigManager.m5944o());
        map.put("low_power_mode", m7062a(C3024a.m7051b()));
        if ((C3657l.m9125p().getResources().getConfiguration().uiMode & 48) == 32) {
            z = true;
        }
        map.put("dark_mode", m7062a(Boolean.valueOf(z)));
        map.put("d_api", String.valueOf(Build.VERSION.SDK_INT));
    }

    /* renamed from: b */
    public final C2896g mo18507b(String str) {
        return IAConfigManager.m5931d().mo18244a(C3024a.m7047a(str));
    }

    /* renamed from: a */
    private static String m7062a(Boolean bool) {
        if (bool == null) {
            return "";
        }
        return bool.booleanValue() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO;
    }

    /* renamed from: a */
    private static String m7063a(Long l) {
        return l == null ? "" : String.valueOf(l);
    }

    /* renamed from: k */
    public final boolean mo18517k() {
        return this.f7446e != null;
    }

    /* renamed from: l */
    public final String mo18518l() {
        if (mo18517k()) {
            return String.valueOf(this.f7446e.getLatitude());
        }
        return null;
    }

    /* renamed from: m */
    public final String mo18519m() {
        if (mo18517k()) {
            return String.valueOf(this.f7446e.getLongitude());
        }
        return null;
    }

    /* renamed from: n */
    public final String mo18520n() {
        if (!mo18517k() || ((double) this.f7446e.getAccuracy()) == 0.0d) {
            return null;
        }
        return String.valueOf(this.f7446e.getAccuracy());
    }

    /* renamed from: o */
    public final String mo18521o() {
        if (mo18517k()) {
            float b = C3657l.m9118b(this.f7446e);
            if (((double) b) != 0.0d) {
                return String.valueOf(b);
            }
        }
        return null;
    }

    /* renamed from: p */
    public final String mo18522p() {
        if (!mo18517k()) {
            return null;
        }
        double a = C3657l.m9104a(this.f7446e);
        if (a < 0.0d) {
            return null;
        }
        return String.format(Locale.ENGLISH, "%.2f", new Object[]{Double.valueOf(a)});
    }

    /* renamed from: q */
    public final String mo18523q() {
        return C3656k.m9096h();
    }

    /* renamed from: r */
    public final String mo18524r() {
        return C3621ac.m9043a().f9885f;
    }

    /* renamed from: s */
    public final String mo18525s() {
        return C3656k.m9092e();
    }

    /* renamed from: t */
    public final String mo18526t() {
        return C3656k.m9088b(this.f7447f);
    }

    /* renamed from: u */
    public final String mo18527u() {
        return C3656k.m9086a(this.f7447f);
    }

    /* renamed from: v */
    public final String mo18528v() {
        return C3656k.m9097i();
    }

    /* renamed from: A */
    public final int mo18503A() {
        return C3657l.m9128s();
    }

    /* renamed from: j */
    public final void mo18516j() {
        this.f7446e = C3675s.C3680a.f9970a.mo19583a();
    }

    /* renamed from: w */
    public final String mo18529w() {
        return IAConfigManager.f6419n.f6439k;
    }

    /* renamed from: x */
    public final List<String> mo18530x() {
        return IAConfigManager.f6419n.f6440l;
    }

    /* renamed from: y */
    public final int mo18531y() {
        return C3657l.m9106a(C3657l.m9133x());
    }

    /* renamed from: z */
    public final int mo18532z() {
        return C3657l.m9106a(C3657l.m9132w());
    }
}
