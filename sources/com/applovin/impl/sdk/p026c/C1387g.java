package com.applovin.impl.sdk.p026c;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.c.g */
public class C1387g {

    /* renamed from: a */
    public static final C1387g f3248a = m2752a("ad_req");

    /* renamed from: b */
    public static final C1387g f3249b = m2752a("ad_imp");

    /* renamed from: c */
    public static final C1387g f3250c = m2752a("ad_session_start");

    /* renamed from: d */
    public static final C1387g f3251d = m2752a("ad_imp_session");

    /* renamed from: e */
    public static final C1387g f3252e = m2752a("cached_files_expired");

    /* renamed from: f */
    public static final C1387g f3253f = m2752a("cache_drop_count");

    /* renamed from: g */
    public static final C1387g f3254g = m2753a("sdk_reset_state_count", true);

    /* renamed from: h */
    public static final C1387g f3255h = m2753a("ad_response_process_failures", true);

    /* renamed from: i */
    public static final C1387g f3256i = m2753a("response_process_failures", true);

    /* renamed from: j */
    public static final C1387g f3257j = m2753a("incent_failed_to_display_count", true);

    /* renamed from: k */
    public static final C1387g f3258k = m2752a("app_paused_and_resumed");

    /* renamed from: l */
    public static final C1387g f3259l = m2753a("ad_rendered_with_mismatched_sdk_key", true);

    /* renamed from: m */
    public static final C1387g f3260m = m2752a("ad_shown_outside_app_count");

    /* renamed from: n */
    public static final C1387g f3261n = m2752a("med_ad_req");

    /* renamed from: o */
    public static final C1387g f3262o = m2753a("med_ad_response_process_failures", true);

    /* renamed from: p */
    public static final C1387g f3263p = m2753a("med_adapters_failed_init_missing_activity", true);

    /* renamed from: q */
    public static final C1387g f3264q = m2753a("med_waterfall_ad_no_fill", true);

    /* renamed from: r */
    public static final C1387g f3265r = m2753a("med_waterfall_ad_adapter_load_failed", true);

    /* renamed from: s */
    public static final C1387g f3266s = m2753a("med_waterfall_ad_invalid_response", true);

    /* renamed from: t */
    private static final Set<String> f3267t = new HashSet(32);

    /* renamed from: v */
    private static final Set<C1387g> f3268v = new HashSet(16);

    /* renamed from: u */
    private final String f3269u;

    static {
        m2752a("fullscreen_ad_nil_vc_count");
        m2752a("applovin_bundle_missing");
    }

    private C1387g(String str) {
        this.f3269u = str;
    }

    /* renamed from: a */
    private static C1387g m2752a(String str) {
        return m2753a(str, false);
    }

    /* renamed from: a */
    private static C1387g m2753a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No key name specified");
        } else if (!f3267t.contains(str)) {
            f3267t.add(str);
            C1387g gVar = new C1387g(str);
            if (z) {
                f3268v.add(gVar);
            }
            return gVar;
        } else {
            throw new IllegalArgumentException("Key has already been used: " + str);
        }
    }

    /* renamed from: b */
    public static Set<C1387g> m2754b() {
        return f3268v;
    }

    /* renamed from: a */
    public String mo12925a() {
        return this.f3269u;
    }
}
