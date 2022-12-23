package com.applovin.impl.sdk.p025b;

import com.applovin.mediation.adapters.AppLovinMediationAdapter;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.b.b */
public class C1368b<T> extends C1369c<T> {

    /* renamed from: A */
    public static final C1369c<Long> f2805A = m2634a("ad_view_refresh_precache_request_viewability_undesired_flags", 502L);

    /* renamed from: B */
    public static final C1369c<Long> f2806B = m2634a("ad_view_refresh_precache_request_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(2)));

    /* renamed from: C */
    public static final C1369c<Boolean> f2807C = m2634a("ad_view_block_publisher_load_if_refresh_scheduled", true);

    /* renamed from: D */
    public static final C1369c<Boolean> f2808D = m2634a("fullscreen_ads_block_publisher_load_if_another_showing", true);

    /* renamed from: E */
    public static final C1369c<Boolean> f2809E = m2634a("fabsina", false);

    /* renamed from: F */
    public static final C1369c<Long> f2810F = m2634a("ad_expiration_ms", Long.valueOf(TimeUnit.HOURS.toMillis(4)));

    /* renamed from: G */
    public static final C1369c<Boolean> f2811G = m2634a("saewib", false);

    /* renamed from: H */
    public static final C1369c<Long> f2812H = m2634a("ad_hidden_timeout_ms", -1L);

    /* renamed from: I */
    public static final C1369c<Boolean> f2813I = m2634a("schedule_ad_hidden_on_ad_dismiss", false);

    /* renamed from: J */
    public static final C1369c<Long> f2814J = m2634a("ad_hidden_on_ad_dismiss_callback_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));

    /* renamed from: K */
    public static final C1369c<Boolean> f2815K = m2634a("proe", false);

    /* renamed from: L */
    public static final C1369c<String> f2816L = m2634a("fitaui", "");

    /* renamed from: M */
    public static final C1369c<String> f2817M = m2634a("finaui", "");

    /* renamed from: N */
    public static final C1369c<String> f2818N = m2634a("faespcn", AppLovinMediationAdapter.class.getName());

    /* renamed from: O */
    public static final C1369c<Long> f2819O = m2634a("fard_s", 3L);

    /* renamed from: P */
    public static final C1369c<Integer> f2820P = m2634a("mute_state", 2);

    /* renamed from: Q */
    public static final C1369c<Boolean> f2821Q = m2634a("adapters_to_re_fetch_sdk_version_if_empty", true);

    /* renamed from: a */
    public static final C1369c<String> f2822a = m2634a("afi", "");

    /* renamed from: b */
    public static final C1369c<Long> f2823b = m2634a("afi_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(5)));

    /* renamed from: c */
    public static final C1369c<String> f2824c = m2634a("mediation_endpoint", "https://ms.applovin.com/");

    /* renamed from: d */
    public static final C1369c<String> f2825d = m2634a("mediation_backup_endpoint", "https://ms.applvn.com/");

    /* renamed from: e */
    public static final C1369c<Long> f2826e = m2634a("fetch_next_ad_retry_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(2)));

    /* renamed from: f */
    public static final C1369c<Long> f2827f = m2634a("fetch_next_ad_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(5)));

    /* renamed from: g */
    public static final C1369c<Long> f2828g = m2634a("fetch_mediation_debugger_info_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(7)));

    /* renamed from: h */
    public static final C1369c<Boolean> f2829h = m2634a("pass_extra_parameters", true);

    /* renamed from: i */
    public static final C1369c<String> f2830i = m2634a("postback_macros", "{\"{MCODE}\":\"mcode\",\"{BCODE}\":\"bcode\",\"{ICODE}\":\"icode\",\"{SCODE}\":\"scode\"}");

    /* renamed from: j */
    public static final C1369c<Boolean> f2831j = m2634a("persistent_mediated_postbacks", false);

    /* renamed from: k */
    public static final C1369c<Long> f2832k = m2634a("max_signal_provider_latency_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: l */
    public static final C1369c<Integer> f2833l = m2634a("max_adapter_version_length", 20);

    /* renamed from: m */
    public static final C1369c<Integer> f2834m = m2634a("max_adapter_sdk_version_length", 20);

    /* renamed from: n */
    public static final C1369c<Integer> f2835n = m2634a("max_adapter_signal_length", 5120);

    /* renamed from: o */
    public static final C1369c<Long> f2836o = m2634a("default_adapter_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: p */
    public static final C1369c<Long> f2837p = m2634a("ad_refresh_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: q */
    public static final C1369c<Long> f2838q = m2634a("ad_load_failure_refresh_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: r */
    public static final C1369c<String> f2839r = m2634a("ad_load_failure_refresh_ignore_error_codes", "204");

    /* renamed from: s */
    public static final C1369c<Long> f2840s = m2634a("refresh_ad_on_app_resume_elapsed_threshold_ms", 0L);

    /* renamed from: t */
    public static final C1369c<Boolean> f2841t = m2634a("refresh_ad_view_timer_responds_to_background", true);

    /* renamed from: u */
    public static final C1369c<Boolean> f2842u = m2634a("refresh_ad_view_timer_responds_to_store_kit", true);

    /* renamed from: v */
    public static final C1369c<Boolean> f2843v = m2634a("refresh_ad_view_timer_responds_to_window_visibility_changed", false);

    /* renamed from: w */
    public static final C1369c<Long> f2844w = m2634a("ad_view_fade_in_animation_ms", 150L);

    /* renamed from: x */
    public static final C1369c<Long> f2845x = m2634a("ad_view_fade_out_animation_ms", 150L);

    /* renamed from: y */
    public static final C1369c<Long> f2846y = m2634a("fullscreen_display_delay_ms", 600L);

    /* renamed from: z */
    public static final C1369c<Long> f2847z = m2634a("ahdm", 500L);
}
