package com.applovin.impl.sdk.p024ad;

import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PointF;
import android.net.Uri;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.C1072c;
import com.applovin.impl.adview.C1086h;
import com.applovin.impl.adview.C1151s;
import com.applovin.impl.adview.C1155v;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.p023a.C1342c;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p026c.C1374a;
import com.applovin.impl.sdk.utils.C1517e;
import com.applovin.impl.sdk.utils.C1519g;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.sdk.AppLovinSdkUtils;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.g */
public abstract class C1355g extends AppLovinAdBase {

    /* renamed from: a */
    private final List<Uri> f2764a = C1517e.m3421a();

    /* renamed from: b */
    private final AtomicBoolean f2765b = new AtomicBoolean();

    /* renamed from: c */
    private final AtomicBoolean f2766c = new AtomicBoolean();

    /* renamed from: d */
    private final AtomicReference<C1342c> f2767d = new AtomicReference<>();

    /* renamed from: e */
    private boolean f2768e;

    /* renamed from: f */
    private List<C1374a> f2769f;

    /* renamed from: g */
    private List<C1374a> f2770g;

    /* renamed from: h */
    private List<C1374a> f2771h;

    /* renamed from: i */
    private List<C1374a> f2772i;

    /* renamed from: j */
    private C1359c f2773j;

    /* renamed from: com.applovin.impl.sdk.ad.g$a */
    public enum C1357a {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    /* renamed from: com.applovin.impl.sdk.ad.g$b */
    public enum C1358b {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    /* renamed from: com.applovin.impl.sdk.ad.g$c */
    public class C1359c {

        /* renamed from: a */
        public final int f2782a;

        /* renamed from: b */
        public final int f2783b;

        /* renamed from: c */
        public final int f2784c;

        /* renamed from: d */
        public final int f2785d;

        /* renamed from: e */
        public final int f2786e;

        private C1359c() {
            this.f2782a = AppLovinSdkUtils.dpToPx(C1355g.this.sdk.mo13065D(), C1355g.this.mo12793ag());
            this.f2783b = AppLovinSdkUtils.dpToPx(C1355g.this.sdk.mo13065D(), C1355g.this.mo12794ah());
            this.f2784c = AppLovinSdkUtils.dpToPx(C1355g.this.sdk.mo13065D(), C1355g.this.mo12795ai());
            this.f2785d = AppLovinSdkUtils.dpToPx(C1355g.this.sdk.mo13065D(), ((Integer) C1355g.this.sdk.mo13088a(C1369c.f2936bZ)).intValue());
            this.f2786e = AppLovinSdkUtils.dpToPx(C1355g.this.sdk.mo13065D(), ((Integer) C1355g.this.sdk.mo13088a(C1369c.f2935bY)).intValue());
        }
    }

    /* renamed from: com.applovin.impl.sdk.ad.g$d */
    public enum C1360d {
        RESIZE_ASPECT,
        RESIZE_ASPECT_FILL,
        RESIZE
    }

    public C1355g(JSONObject jSONObject, JSONObject jSONObject2, C1346b bVar, C1469j jVar) {
        super(jSONObject, jSONObject2, bVar, jVar);
    }

    /* renamed from: a */
    private List<C1374a> m2513a(PointF pointF, boolean z) {
        List<C1374a> a;
        synchronized (this.adObjectLock) {
            a = C1557r.m3596a("click_tracking_urls", this.adObject, m2519c(pointF, z), m2516b(pointF, z), mo12771aA(), this.sdk);
        }
        return a;
    }

    /* renamed from: b */
    private String mo11663b() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", (String) null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace("{CLCODE}", getClCode());
        }
        return null;
    }

    /* renamed from: b */
    private String m2516b(PointF pointF, boolean z) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", (String) null);
        Map<String, String> c = m2519c(pointF, z);
        if (stringFromAdObject != null) {
            return C1553o.m3549a(stringFromAdObject, c);
        }
        return null;
    }

    /* renamed from: c */
    private C1086h.C1087a m2517c(boolean z) {
        return z ? C1086h.C1087a.WHITE_ON_TRANSPARENT : C1086h.C1087a.WHITE_ON_BLACK;
    }

    /* renamed from: c */
    private Map<String, String> m2519c(PointF pointF, boolean z) {
        Point a = C1519g.m3428a(this.sdk.mo13065D());
        HashMap hashMap = new HashMap(5);
        hashMap.put("{CLCODE}", getClCode());
        hashMap.put("{CLICK_X}", String.valueOf(pointF.x));
        hashMap.put("{CLICK_Y}", String.valueOf(pointF.y));
        hashMap.put("{SCREEN_WIDTH}", String.valueOf(a.x));
        hashMap.put("{SCREEN_HEIGHT}", String.valueOf(a.y));
        hashMap.put("{IS_VIDEO_CLICK}", String.valueOf(z));
        return hashMap;
    }

    /* renamed from: A */
    public boolean mo12741A() {
        return getBooleanFromAdObject("accelerate_hardware", false);
    }

    /* renamed from: B */
    public boolean mo12742B() {
        return getBooleanFromAdObject("keep_screen_on", false);
    }

    /* renamed from: C */
    public boolean mo12743C() {
        return getBooleanFromAdObject("hide_close_on_exit_graphic", false);
    }

    /* renamed from: D */
    public boolean mo12744D() {
        return getBooleanFromAdObject("hide_close_on_exit", false);
    }

    /* renamed from: E */
    public boolean mo12745E() {
        return getBooleanFromAdObject("lock_current_orientation", false);
    }

    /* renamed from: F */
    public int mo12746F() {
        return getIntFromAdObject("countdown_length", 0);
    }

    /* renamed from: G */
    public int mo12747G() {
        int parseColor = Color.parseColor("#C8FFFFFF");
        String stringFromAdObject = getStringFromAdObject("countdown_color", (String) null);
        return C1553o.m3554b(stringFromAdObject) ? Color.parseColor(stringFromAdObject) : parseColor;
    }

    /* renamed from: H */
    public int mo12748H() {
        String stringFromAdObject = getStringFromAdObject("video_background_color", (String) null);
        return C1553o.m3554b(stringFromAdObject) ? Color.parseColor(stringFromAdObject) : ViewCompat.MEASURED_STATE_MASK;
    }

    /* renamed from: I */
    public int mo12749I() {
        int i = hasVideoUrl() ? ViewCompat.MEASURED_STATE_MASK : -1157627904;
        String stringFromAdObject = getStringFromAdObject("graphic_background_color", (String) null);
        return C1553o.m3554b(stringFromAdObject) ? Color.parseColor(stringFromAdObject) : i;
    }

    /* renamed from: J */
    public C1357a mo12750J() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", (String) null);
        if (C1553o.m3554b(stringFromAdObject)) {
            if (TapjoyConstants.TJC_FULLSCREEN_AD_DISMISS_URL.equalsIgnoreCase(stringFromAdObject)) {
                return C1357a.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return C1357a.DO_NOT_DISMISS;
            }
        }
        return C1357a.UNSPECIFIED;
    }

    /* renamed from: K */
    public List<String> mo12751K() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", (String) null);
        return stringFromAdObject != null ? C1517e.m3423a(stringFromAdObject) : this.sdk.mo13114b((C1369c) C1369c.f2919bI);
    }

    /* renamed from: L */
    public String mo12752L() {
        return getStringFromAdObject("cache_prefix", (String) null);
    }

    /* renamed from: M */
    public boolean mo12753M() {
        return getBooleanFromAdObject("daome", true);
    }

    /* renamed from: N */
    public boolean mo12754N() {
        return getBooleanFromAdObject("utpfc", false);
    }

    /* renamed from: O */
    public boolean mo12755O() {
        return getBooleanFromAdObject("sscomt", false);
    }

    /* renamed from: P */
    public String mo12756P() {
        return getStringFromFullResponse("event_id", (String) null);
    }

    /* renamed from: Q */
    public boolean mo12757Q() {
        return getBooleanFromAdObject("progress_bar_enabled", false);
    }

    /* renamed from: R */
    public int mo12758R() {
        String stringFromAdObject = getStringFromAdObject("progress_bar_color", "#C8FFFFFF");
        if (C1553o.m3554b(stringFromAdObject)) {
            return Color.parseColor(stringFromAdObject);
        }
        return 0;
    }

    /* renamed from: S */
    public boolean mo12759S() {
        return getBooleanFromAdObject("vs_buffer_indicator_enabled", false);
    }

    /* renamed from: T */
    public boolean mo12760T() {
        return getBooleanFromAdObject("vs_buffer_indicator_initial_load_enabled", false);
    }

    /* renamed from: U */
    public int mo12761U() {
        return getIntFromAdObject("vs_buffer_indicator_style", 16842874);
    }

    /* renamed from: V */
    public int mo12762V() {
        String stringFromAdObject = getStringFromAdObject("vs_buffer_indicator_color", (String) null);
        if (C1553o.m3554b(stringFromAdObject)) {
            return Color.parseColor(stringFromAdObject);
        }
        return -1;
    }

    /* renamed from: W */
    public int mo12763W() {
        int parseColor = Color.parseColor("#66000000");
        String stringFromAdObject = getStringFromAdObject("vs_buffer_indicator_bg_color", (String) null);
        return C1553o.m3554b(stringFromAdObject) ? Color.parseColor(stringFromAdObject) : parseColor;
    }

    /* renamed from: X */
    public boolean mo12764X() {
        return getBooleanFromAdObject("clear_dismissible", false);
    }

    /* renamed from: Y */
    public int mo12765Y() {
        int a;
        synchronized (this.adObjectLock) {
            a = C1557r.m3577a(this.adObject);
        }
        return a;
    }

    /* renamed from: Z */
    public int mo12766Z() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1086h.C1087a mo12767a(int i) {
        return i == 1 ? C1086h.C1087a.WHITE_ON_TRANSPARENT : i == 2 ? C1086h.C1087a.INVISIBLE : C1086h.C1087a.WHITE_ON_BLACK;
    }

    /* renamed from: a */
    public List<C1374a> mo12768a(PointF pointF) {
        return m2513a(pointF, false);
    }

    /* renamed from: a */
    public abstract void mo11655a();

    /* renamed from: a */
    public void mo12769a(C1342c cVar) {
        this.f2767d.set(cVar);
    }

    /* renamed from: a */
    public void mo12770a(boolean z) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("html_resources_cached", z);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: aA */
    public Map<String, String> mo12771aA() {
        HashMap hashMap = new HashMap();
        if (getBooleanFromAdObject("send_webview_http_headers", false)) {
            hashMap.putAll(C1072c.getHttpHeaders());
        }
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", false)) {
            hashMap.put("User-Agent", C1072c.m1570a(0));
        }
        return hashMap;
    }

    /* renamed from: aB */
    public boolean mo12772aB() {
        return getBooleanFromAdObject("playback_requires_user_action", true);
    }

    /* renamed from: aC */
    public boolean mo12773aC() {
        return getBooleanFromAdObject("sanitize_webview", false);
    }

    /* renamed from: aD */
    public String mo12774aD() {
        String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    /* renamed from: aE */
    public boolean mo12775aE() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", false);
    }

    /* renamed from: aF */
    public C1155v mo12776aF() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", (JSONObject) null);
        if (jsonObjectFromAdObject != null) {
            return new C1155v(jsonObjectFromAdObject, this.sdk);
        }
        return null;
    }

    /* renamed from: aG */
    public List<String> mo12777aG() {
        return C1517e.m3423a(getStringFromAdObject("wls", ""));
    }

    /* renamed from: aH */
    public List<String> mo12778aH() {
        return C1517e.m3423a(getStringFromAdObject("wlh", (String) null));
    }

    /* renamed from: aI */
    public boolean mo12779aI() {
        return getBooleanFromAdObject("ibbdfs", false);
    }

    /* renamed from: aJ */
    public boolean mo12780aJ() {
        return getBooleanFromAdObject("ibbdfc", false);
    }

    /* renamed from: aK */
    public Uri mo12781aK() {
        String stringFromAdObject = getStringFromAdObject("mute_image", (String) null);
        if (C1553o.m3554b(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    /* renamed from: aL */
    public Uri mo12782aL() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "");
        if (C1553o.m3554b(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    /* renamed from: aM */
    public boolean mo12783aM() {
        return this.f2766c.get();
    }

    /* renamed from: aN */
    public void mo12784aN() {
        this.f2766c.set(true);
    }

    /* renamed from: aO */
    public C1342c mo12785aO() {
        return this.f2767d.getAndSet((Object) null);
    }

    /* renamed from: aP */
    public C1360d mo12786aP() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", (String) null);
        return MraidJsMethods.RESIZE.equals(stringFromAdObject) ? C1360d.RESIZE : "resize_aspect_fill".equals(stringFromAdObject) ? C1360d.RESIZE_ASPECT_FILL : C1360d.RESIZE_ASPECT;
    }

    /* renamed from: aa */
    public int mo12787aa() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    /* renamed from: ab */
    public boolean mo12788ab() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", false);
    }

    /* renamed from: ac */
    public boolean mo12789ac() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", false);
    }

    /* renamed from: ad */
    public boolean mo12790ad() {
        return getBooleanFromAdObject("vkuv", false);
    }

    /* renamed from: ae */
    public boolean mo12791ae() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", false);
    }

    /* renamed from: af */
    public C1359c mo12792af() {
        if (this.f2773j == null) {
            this.f2773j = new C1359c();
        }
        return this.f2773j;
    }

    /* renamed from: ag */
    public int mo12793ag() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.mo13088a(C1369c.f2964cB)).intValue());
    }

    /* renamed from: ah */
    public int mo12794ah() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.mo13088a(C1369c.f2965cC)).intValue());
    }

    /* renamed from: ai */
    public int mo12795ai() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.mo13088a(C1369c.f2963cA)).intValue());
    }

    /* renamed from: aj */
    public boolean mo12796aj() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.mo13088a(C1369c.f3014cz));
    }

    /* renamed from: ak */
    public boolean mo12797ak() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.mo13088a(C1369c.f2980cR));
    }

    /* renamed from: al */
    public boolean mo12798al() {
        return getBooleanFromAdObject("unhide_adview_on_render", false);
    }

    /* renamed from: am */
    public long mo12799am() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1;
    }

    /* renamed from: an */
    public int mo12800an() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    /* renamed from: ao */
    public boolean mo12801ao() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", true);
    }

    /* renamed from: ap */
    public AtomicBoolean mo12802ap() {
        return this.f2765b;
    }

    /* renamed from: aq */
    public boolean mo12803aq() {
        return getBooleanFromAdObject("show_nia", false);
    }

    /* renamed from: ar */
    public String mo12804ar() {
        return getStringFromAdObject("nia_title", "");
    }

    /* renamed from: as */
    public String mo12805as() {
        return getStringFromAdObject("nia_message", "");
    }

    /* renamed from: at */
    public String mo12806at() {
        return getStringFromAdObject("nia_button_title", "");
    }

    /* renamed from: au */
    public boolean mo12807au() {
        return getBooleanFromAdObject("avoms", false);
    }

    /* renamed from: av */
    public boolean mo12808av() {
        return this.f2768e;
    }

    /* renamed from: aw */
    public List<C1374a> mo12809aw() {
        List<C1374a> a;
        List<C1374a> list = this.f2769f;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            a = C1557r.m3593a("video_end_urls", this.adObject, getClCode(), mo11663b(), this.sdk);
            this.f2769f = a;
        }
        return a;
    }

    /* renamed from: ax */
    public List<C1374a> mo12810ax() {
        List<C1374a> a;
        List<C1374a> list = this.f2770g;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            a = C1557r.m3593a("ad_closed_urls", this.adObject, getClCode(), (String) null, this.sdk);
            this.f2770g = a;
        }
        return a;
    }

    /* renamed from: ay */
    public List<C1374a> mo12811ay() {
        List<C1374a> a;
        List<C1374a> list = this.f2771h;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            a = C1557r.m3593a("app_killed_urls", this.adObject, getClCode(), (String) null, this.sdk);
            this.f2771h = a;
        }
        return a;
    }

    /* renamed from: az */
    public List<C1374a> mo11662az() {
        List<C1374a> a;
        List<C1374a> list = this.f2772i;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            a = C1557r.m3595a("imp_urls", this.adObject, getClCode(), C1517e.m3426a("{SOC}", String.valueOf(mo12808av())), (String) null, mo12771aA(), this.sdk);
            this.f2772i = a;
        }
        return a;
    }

    /* renamed from: b */
    public List<C1374a> mo12812b(PointF pointF) {
        List<C1374a> a;
        synchronized (this.adObjectLock) {
            a = C1557r.m3596a("video_click_tracking_urls", this.adObject, m2519c(pointF, true), (String) null, mo12771aA(), this.sdk);
        }
        return a.isEmpty() ? m2513a(pointF, true) : a;
    }

    /* renamed from: b */
    public void mo12813b(Uri uri) {
        this.f2764a.add(uri);
    }

    /* renamed from: b */
    public void mo12814b(boolean z) {
        this.f2768e = z;
    }

    /* renamed from: c */
    public abstract String mo11664c();

    /* renamed from: c */
    public void mo12815c(Uri uri) {
        synchronized (this.adObjectLock) {
            C1521i.m3476a(this.adObject, "mute_image", (Object) uri, this.sdk);
        }
    }

    /* renamed from: d */
    public void mo12816d(Uri uri) {
        synchronized (this.adObjectLock) {
            C1521i.m3476a(this.adObject, "unmute_image", (Object) uri, this.sdk);
        }
    }

    /* renamed from: d */
    public boolean mo11665d() {
        this.sdk.mo13139v().mo13281e("DirectAd", "Attempting to invoke isVideoStream() from base ad class");
        return false;
    }

    /* renamed from: f */
    public Uri mo11668f() {
        this.sdk.mo13139v().mo13281e("DirectAd", "Attempting to invoke getVideoUri() from base ad class");
        return null;
    }

    /* renamed from: h */
    public Uri mo11671h() {
        this.sdk.mo13139v().mo13281e("DirectAd", "Attempting to invoke getClickDestinationUri() from base ad class");
        return null;
    }

    /* renamed from: i */
    public Uri mo11674i() {
        this.sdk.mo13139v().mo13281e("DirectAd", "Attempting to invoke getVideoClickDestinationUri() from base ad class");
        return null;
    }

    /* renamed from: n */
    public boolean mo12817n() {
        return getBooleanFromAdObject("fs_2", false);
    }

    /* renamed from: o */
    public C1358b mo12818o() {
        String upperCase = getStringFromAdObject("ad_target", C1358b.DEFAULT.toString()).toUpperCase(Locale.ENGLISH);
        return "ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase) ? C1358b.ACTIVITY_PORTRAIT : "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? C1358b.ACTIVITY_LANDSCAPE : C1358b.DEFAULT;
    }

    /* renamed from: p */
    public long mo12819p() {
        return getLongFromAdObject("close_delay", 0);
    }

    /* renamed from: q */
    public long mo12820q() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5));
    }

    /* renamed from: r */
    public long mo12821r() {
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", 0);
        if (!mo12817n()) {
            return longFromAdObject;
        }
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0;
        }
        return longFromAdObject;
    }

    /* renamed from: s */
    public C1086h.C1087a mo12822s() {
        int intFromAdObject = getIntFromAdObject("close_style", -1);
        return intFromAdObject == -1 ? m2517c(hasVideoUrl()) : mo12767a(intFromAdObject);
    }

    /* renamed from: t */
    public C1086h.C1087a mo12823t() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? mo12822s() : mo12767a(intFromAdObject);
    }

    /* renamed from: u */
    public boolean mo12824u() {
        return getBooleanFromAdObject("dismiss_on_skip", false);
    }

    /* renamed from: v */
    public boolean mo12825v() {
        return getBooleanFromAdObject("html_resources_cached", false);
    }

    /* renamed from: w */
    public List<Uri> mo12826w() {
        return this.f2764a;
    }

    /* renamed from: x */
    public String mo12827x() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("video_button_properties", (JSONObject) null);
        return jsonObjectFromAdObject != null ? C1521i.m3487b(jsonObjectFromAdObject, "video_button_html", "", this.sdk) : "";
    }

    /* renamed from: y */
    public C1151s mo12828y() {
        return new C1151s(getJsonObjectFromAdObject("video_button_properties", (JSONObject) null), this.sdk);
    }

    /* renamed from: z */
    public boolean mo11680z() {
        return getBooleanFromAdObject("video_clickable", false);
    }
}
