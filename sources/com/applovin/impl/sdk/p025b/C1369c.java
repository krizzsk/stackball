package com.applovin.impl.sdk.p025b;

import android.net.Uri;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.p008a.C1014j;
import com.applovin.sdk.AppLovinAdSize;
import com.google.android.exoplayer2.audio.AacUtil;
import com.tapjoy.TJAdUnitConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.b.c */
public class C1369c<T> implements Comparable {

    /* renamed from: R */
    public static final C1369c<Boolean> f2848R = m2634a("empty", true);

    /* renamed from: S */
    public static final C1369c<String> f2849S = m2634a("dls", "");

    /* renamed from: T */
    public static final C1369c<Boolean> f2850T = m2634a("is_disabled", false);

    /* renamed from: U */
    public static final C1369c<String> f2851U = m2634a("device_id", "");

    /* renamed from: V */
    public static final C1369c<String> f2852V = m2634a("device_token", "");

    /* renamed from: W */
    public static final C1369c<Long> f2853W = m2634a("publisher_id", 0L);

    /* renamed from: X */
    public static final C1369c<Boolean> f2854X = m2634a("is_verbose_logging", false);

    /* renamed from: Y */
    public static final C1369c<String> f2855Y = m2634a("sc", "");

    /* renamed from: Z */
    public static final C1369c<String> f2856Z = m2634a("sc2", "");

    /* renamed from: a */
    private static final List<?> f2857a = Arrays.asList(new Class[]{Boolean.class, Float.class, Integer.class, Long.class, String.class});

    /* renamed from: aA */
    public static final C1369c<String> f2858aA = m2634a("text_alert_consent_body", "If you don't give us consent to use your data, you will be making our ability to support this app harder, which may negatively affect the user experience.");

    /* renamed from: aB */
    public static final C1369c<String> f2859aB = m2634a("text_alert_consent_yes_option", "I Agree");

    /* renamed from: aC */
    public static final C1369c<String> f2860aC = m2634a("text_alert_consent_no_option", "Cancel");

    /* renamed from: aD */
    public static final C1369c<Long> f2861aD = m2634a("ttc_max_click_duration_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));

    /* renamed from: aE */
    public static final C1369c<Integer> f2862aE = m2634a("ttc_max_click_distance_dp", 10);

    /* renamed from: aF */
    public static final C1369c<Integer> f2863aF = m2634a("ttc_acrs", Integer.valueOf(AppLovinTouchToClickListener.ClickRecognitionState.DISABLED.ordinal()));

    /* renamed from: aG */
    public static final C1369c<Integer> f2864aG = m2634a("ttc_acrsv2a", Integer.valueOf(AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN.ordinal()));

    /* renamed from: aH */
    public static final C1369c<String> f2865aH = m2634a("whitelisted_postback_endpoints", "https://prod-a.applovin.com,https://rt.applovin.com/4.0/pix, https://rt.applvn.com/4.0/pix,https://ms.applovin.com/,https://ms.applvn.com/");

    /* renamed from: aI */
    public static final C1369c<String> f2866aI = m2634a("fetch_settings_endpoint", "https://ms.applovin.com/");

    /* renamed from: aJ */
    public static final C1369c<String> f2867aJ = m2634a("fetch_settings_backup_endpoint", "https://ms.applvn.com/");

    /* renamed from: aK */
    public static final C1369c<String> f2868aK = m2634a("adserver_endpoint", "https://a.applovin.com/");

    /* renamed from: aL */
    public static final C1369c<String> f2869aL = m2634a("adserver_backup_endpoint", "https://a.applvn.com/");

    /* renamed from: aM */
    public static final C1369c<String> f2870aM = m2634a("api_endpoint", "https://d.applovin.com/");

    /* renamed from: aN */
    public static final C1369c<String> f2871aN = m2634a("api_backup_endpoint", "https://d.applvn.com/");

    /* renamed from: aO */
    public static final C1369c<String> f2872aO = m2634a("event_tracking_endpoint_v2", "https://rt.applovin.com/");

    /* renamed from: aP */
    public static final C1369c<String> f2873aP = m2634a("event_tracking_backup_endpoint_v2", "https://rt.applvn.com/");

    /* renamed from: aQ */
    public static final C1369c<String> f2874aQ = m2634a("fetch_variables_endpoint", "https://ms.applovin.com/");

    /* renamed from: aR */
    public static final C1369c<String> f2875aR = m2634a("fetch_variables_backup_endpoint", "https://ms.applvn.com/");

    /* renamed from: aS */
    public static final C1369c<String> f2876aS = m2634a("token_type_prefixes_r", "4!");

    /* renamed from: aT */
    public static final C1369c<String> f2877aT = m2634a("token_type_prefixes_arj", "json_v3!");

    /* renamed from: aU */
    public static final C1369c<String> f2878aU = m2634a("top_level_events", "landing,paused,resumed,checkout,iap");

    /* renamed from: aV */
    public static final C1369c<Boolean> f2879aV = m2634a("events_enabled", true);

    /* renamed from: aW */
    public static final C1369c<String> f2880aW = m2634a("valid_super_property_types", String.class.getName() + "," + Integer.class.getName() + "," + Long.class.getName() + "," + Double.class.getName() + "," + Float.class.getName() + "," + Date.class.getName() + "," + Uri.class.getName() + "," + List.class.getName() + "," + Map.class.getName());

    /* renamed from: aX */
    public static final C1369c<Boolean> f2881aX = m2634a("persist_super_properties", true);

    /* renamed from: aY */
    public static final C1369c<Integer> f2882aY = m2634a("super_property_string_max_length", 1024);

    /* renamed from: aZ */
    public static final C1369c<Integer> f2883aZ = m2634a("super_property_url_max_length", 1024);

    /* renamed from: aa */
    public static final C1369c<String> f2884aa = m2634a("sc3", "");

    /* renamed from: ab */
    public static final C1369c<String> f2885ab = m2634a("server_installed_at", "");

    /* renamed from: ac */
    public static final C1369c<Boolean> f2886ac = m2634a("trn", false);

    /* renamed from: ad */
    public static final C1369c<Boolean> f2887ad = m2634a("track_network_response_codes", false);

    /* renamed from: ae */
    public static final C1369c<Boolean> f2888ae = m2634a("submit_network_response_codes", false);

    /* renamed from: af */
    public static final C1369c<Boolean> f2889af = m2634a("clear_network_response_codes_on_request", true);

    /* renamed from: ag */
    public static final C1369c<Boolean> f2890ag = m2634a("clear_completion_callback_on_failure", false);

    /* renamed from: ah */
    public static final C1369c<Long> f2891ah = m2634a("sicd_ms", 0L);

    /* renamed from: ai */
    public static final C1369c<Integer> f2892ai = m2634a("logcat_max_line_size", 1000);

    /* renamed from: aj */
    public static final C1369c<Integer> f2893aj = m2634a("stps", 32);

    /* renamed from: ak */
    public static final C1369c<Boolean> f2894ak = m2634a("ustp", false);

    /* renamed from: al */
    public static final C1369c<Boolean> f2895al = m2634a("publisher_can_show_consent_dialog", true);

    /* renamed from: am */
    public static final C1369c<String> f2896am = m2634a("consent_dialog_url", "https://assets.applovin.com/gdpr/flow_v1/gdpr-flow-1.html");

    /* renamed from: an */
    public static final C1369c<Boolean> f2897an = m2634a("consent_dialog_immersive_mode_on", false);

    /* renamed from: ao */
    public static final C1369c<Long> f2898ao = m2634a("consent_dialog_show_from_alert_delay_ms", 450L);

    /* renamed from: ap */
    public static final C1369c<Boolean> f2899ap = m2634a("alert_consent_for_dialog_rejected", false);

    /* renamed from: aq */
    public static final C1369c<Boolean> f2900aq = m2634a("alert_consent_for_dialog_closed", false);

    /* renamed from: ar */
    public static final C1369c<Boolean> f2901ar = m2634a("alert_consent_for_dialog_closed_with_back_button", false);

    /* renamed from: as */
    public static final C1369c<Boolean> f2902as = m2634a("alert_consent_after_init", false);

    /* renamed from: at */
    public static final C1369c<Long> f2903at = m2634a("alert_consent_after_init_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));

    /* renamed from: au */
    public static final C1369c<Long> f2904au = m2634a("alert_consent_after_dialog_rejection_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(30)));

    /* renamed from: av */
    public static final C1369c<Long> f2905av = m2634a("alert_consent_after_dialog_close_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));

    /* renamed from: aw */
    public static final C1369c<Long> f2906aw = m2634a("alert_consent_after_dialog_close_with_back_button_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));

    /* renamed from: ax */
    public static final C1369c<Long> f2907ax = m2634a("alert_consent_after_cancel_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(10)));

    /* renamed from: ay */
    public static final C1369c<Long> f2908ay = m2634a("alert_consent_reschedule_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));

    /* renamed from: az */
    public static final C1369c<String> f2909az = m2634a("text_alert_consent_title", "Make this App Better and Stay Free!");

    /* renamed from: b */
    private static final Map<String, C1369c<?>> f2910b = new HashMap(512);

    /* renamed from: bA */
    public static final C1369c<Boolean> f2911bA = m2634a("preload_merge_init_tasks_zones", false);

    /* renamed from: bB */
    public static final C1369c<Boolean> f2912bB = m2634a("cache_cleanup_enabled", false);

    /* renamed from: bC */
    public static final C1369c<Long> f2913bC = m2634a("cache_file_ttl_seconds", Long.valueOf(TimeUnit.DAYS.toSeconds(1)));

    /* renamed from: bD */
    public static final C1369c<Integer> f2914bD = m2634a("cache_max_size_mb", -1);

    /* renamed from: bE */
    public static final C1369c<String> f2915bE = m2634a("precache_delimiters", ")]',");

    /* renamed from: bF */
    public static final C1369c<Boolean> f2916bF = m2634a("native_auto_cache_preload_resources", true);

    /* renamed from: bG */
    public static final C1369c<Boolean> f2917bG = m2634a("ad_resource_caching_enabled", true);

    /* renamed from: bH */
    public static final C1369c<Boolean> f2918bH = m2634a("fail_ad_load_on_failed_video_cache", true);

    /* renamed from: bI */
    public static final C1369c<String> f2919bI = m2634a("resource_cache_prefix", "https://vid.applovin.com/,https://pdn.applovin.com/,https://img.applovin.com/,https://d.applovin.com/,https://assets.applovin.com/,https://cdnjs.cloudflare.com/,http://vid.applovin.com/,http://pdn.applovin.com/,http://img.applovin.com/,http://d.applovin.com/,http://assets.applovin.com/,http://cdnjs.cloudflare.com/");

    /* renamed from: bJ */
    public static final C1369c<String> f2920bJ = m2634a("preserved_cached_assets", "sound_off.png,sound_on.png,closeOptOut.png,1381250003_28x28.png,zepto-1.1.3.min.js,jquery-2.1.1.min.js,jquery-1.9.1.min.js,jquery.knob.js");

    /* renamed from: bK */
    public static final C1369c<Integer> f2921bK = m2634a("vr_retry_count_v1", 1);

    /* renamed from: bL */
    public static final C1369c<Integer> f2922bL = m2634a("cr_retry_count_v1", 1);

    /* renamed from: bM */
    public static final C1369c<Boolean> f2923bM = m2634a("incent_warning_enabled", false);

    /* renamed from: bN */
    public static final C1369c<String> f2924bN = m2634a("text_incent_warning_title", "Attention!");

    /* renamed from: bO */
    public static final C1369c<String> f2925bO = m2634a("text_incent_warning_body", "You won’t get your reward if the video hasn’t finished.");

    /* renamed from: bP */
    public static final C1369c<String> f2926bP = m2634a("text_incent_warning_close_option", "Close");

    /* renamed from: bQ */
    public static final C1369c<String> f2927bQ = m2634a("text_incent_warning_continue_option", "Keep Watching");

    /* renamed from: bR */
    public static final C1369c<Boolean> f2928bR = m2634a("incent_nonvideo_warning_enabled", false);

    /* renamed from: bS */
    public static final C1369c<String> f2929bS = m2634a("text_incent_nonvideo_warning_title", "Attention!");

    /* renamed from: bT */
    public static final C1369c<String> f2930bT = m2634a("text_incent_nonvideo_warning_body", "You won’t get your reward if the game hasn’t finished.");

    /* renamed from: bU */
    public static final C1369c<String> f2931bU = m2634a("text_incent_nonvideo_warning_close_option", "Close");

    /* renamed from: bV */
    public static final C1369c<String> f2932bV = m2634a("text_incent_nonvideo_warning_continue_option", "Keep Playing");

    /* renamed from: bW */
    public static final C1369c<Boolean> f2933bW = m2634a("video_callbacks_for_incent_nonvideo_ads_enabled", true);

    /* renamed from: bX */
    public static final C1369c<Boolean> f2934bX = m2634a("check_webview_has_gesture", false);

    /* renamed from: bY */
    public static final C1369c<Integer> f2935bY = m2634a("close_button_touch_area", 0);

    /* renamed from: bZ */
    public static final C1369c<Integer> f2936bZ = m2634a("close_button_outside_touch_area", 0);

    /* renamed from: ba */
    public static final C1369c<Integer> f2937ba = m2634a("preload_callback_timeout_seconds", -1);

    /* renamed from: bb */
    public static final C1369c<Boolean> f2938bb = m2634a("ad_preload_enabled", true);

    /* renamed from: bc */
    public static final C1369c<String> f2939bc = m2634a("ad_auto_preload_sizes", "");

    /* renamed from: bd */
    public static final C1369c<Boolean> f2940bd = m2634a("ad_auto_preload_incent", true);

    /* renamed from: be */
    public static final C1369c<Boolean> f2941be = m2634a("ad_auto_preload_native", false);

    /* renamed from: bf */
    public static final C1369c<Boolean> f2942bf = m2634a("preload_native_ad_on_dequeue", false);

    /* renamed from: bg */
    public static final C1369c<Integer> f2943bg = m2634a("preload_capacity_banner_regular", 0);

    /* renamed from: bh */
    public static final C1369c<Integer> f2944bh = m2634a("preload_capacity_mrec_regular", 0);

    /* renamed from: bi */
    public static final C1369c<Integer> f2945bi = m2634a("preload_capacity_leader_regular", 0);

    /* renamed from: bj */
    public static final C1369c<Integer> f2946bj = m2634a("preload_capacity_inter_regular", 0);

    /* renamed from: bk */
    public static final C1369c<Integer> f2947bk = m2634a("preload_capacity_inter_videoa", 0);

    /* renamed from: bl */
    public static final C1369c<Boolean> f2948bl = m2634a("use_per_format_cache_queues", true);

    /* renamed from: bm */
    public static final C1369c<Integer> f2949bm = m2634a("extended_preload_capacity_banner_regular", 15);

    /* renamed from: bn */
    public static final C1369c<Integer> f2950bn = m2634a("extended_preload_capacity_mrec_regular", 15);

    /* renamed from: bo */
    public static final C1369c<Integer> f2951bo = m2634a("extended_preload_capacity_leader_regular", 15);

    /* renamed from: bp */
    public static final C1369c<Integer> f2952bp = m2634a("extended_preload_capacity_inter_regular", 15);

    /* renamed from: bq */
    public static final C1369c<Integer> f2953bq = m2634a("extended_preload_capacity_inter_videoa", 15);

    /* renamed from: br */
    public static final C1369c<Integer> f2954br = m2634a("preload_capacity_zone", 1);

    /* renamed from: bs */
    public static final C1369c<Integer> f2955bs = m2634a("preload_capacity_zone_native", 1);

    /* renamed from: bt */
    public static final C1369c<Integer> f2956bt = m2634a("extended_preload_capacity_zone", 15);

    /* renamed from: bu */
    public static final C1369c<Integer> f2957bu = m2634a("preload_capacity_native_native", 0);

    /* renamed from: bv */
    public static final C1369c<Boolean> f2958bv = m2634a("preload_merge_init_tasks_inter_regular", false);

    /* renamed from: bw */
    public static final C1369c<Boolean> f2959bw = m2634a("preload_merge_init_tasks_inter_videoa", false);

    /* renamed from: bx */
    public static final C1369c<Boolean> f2960bx = m2634a("preload_merge_init_tasks_banner_regular", false);

    /* renamed from: by */
    public static final C1369c<Boolean> f2961by = m2634a("preload_merge_init_tasks_mrec_regular", false);

    /* renamed from: bz */
    public static final C1369c<Boolean> f2962bz = m2634a("preload_merge_init_tasks_leader_regular", false);

    /* renamed from: cA */
    public static final C1369c<Integer> f2963cA = m2634a("close_button_right_margin_video", 4);

    /* renamed from: cB */
    public static final C1369c<Integer> f2964cB = m2634a("close_button_size_video", 30);

    /* renamed from: cC */
    public static final C1369c<Integer> f2965cC = m2634a("close_button_top_margin_video", 8);

    /* renamed from: cD */
    public static final C1369c<Boolean> f2966cD = m2634a("show_close_on_exit", true);

    /* renamed from: cE */
    public static final C1369c<Integer> f2967cE = m2634a("video_countdown_clock_margin", 10);

    /* renamed from: cF */
    public static final C1369c<Integer> f2968cF = m2634a("video_countdown_clock_gravity", 83);

    /* renamed from: cG */
    public static final C1369c<Integer> f2969cG = m2634a("countdown_clock_size", 32);

    /* renamed from: cH */
    public static final C1369c<Integer> f2970cH = m2634a("countdown_clock_stroke_size", 4);

    /* renamed from: cI */
    public static final C1369c<Integer> f2971cI = m2634a("countdown_clock_text_size", 28);

    /* renamed from: cJ */
    public static final C1369c<Boolean> f2972cJ = m2634a("draw_countdown_clock", true);

    /* renamed from: cK */
    public static final C1369c<Boolean> f2973cK = m2634a("force_back_button_enabled_always", false);

    /* renamed from: cL */
    public static final C1369c<Boolean> f2974cL = m2634a("force_back_button_enabled_close_button", false);

    /* renamed from: cM */
    public static final C1369c<Boolean> f2975cM = m2634a("force_back_button_enabled_poststitial", false);

    /* renamed from: cN */
    public static final C1369c<Long> f2976cN = m2634a("force_hide_status_bar_delay_ms", 0L);

    /* renamed from: cO */
    public static final C1369c<Boolean> f2977cO = m2634a("handle_window_actions", false);

    /* renamed from: cP */
    public static final C1369c<Long> f2978cP = m2634a("inter_display_delay", 200L);

    /* renamed from: cQ */
    public static final C1369c<Boolean> f2979cQ = m2634a("lock_specific_orientation", false);

    /* renamed from: cR */
    public static final C1369c<Boolean> f2980cR = m2634a("lhs_skip_button", true);

    /* renamed from: cS */
    public static final C1369c<String> f2981cS = m2634a("soft_buttons_resource_id", "config_showNavigationBar");

    /* renamed from: cT */
    public static final C1369c<Boolean> f2982cT = m2634a("countdown_toggleable", false);

    /* renamed from: cU */
    public static final C1369c<Boolean> f2983cU = m2634a("track_app_killed", false);

    /* renamed from: cV */
    public static final C1369c<Boolean> f2984cV = m2634a("should_use_animated_mute_icon", false);

    /* renamed from: cW */
    public static final C1369c<Boolean> f2985cW = m2634a("mute_controls_enabled", false);

    /* renamed from: cX */
    public static final C1369c<Boolean> f2986cX = m2634a("allow_user_muting", true);

    /* renamed from: cY */
    public static final C1369c<Boolean> f2987cY = m2634a("mute_videos", false);

    /* renamed from: cZ */
    public static final C1369c<Boolean> f2988cZ = m2634a("show_mute_by_default", false);

    /* renamed from: ca */
    public static final C1369c<Long> f2989ca = m2634a("viewability_adview_imp_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));

    /* renamed from: cb */
    public static final C1369c<Integer> f2990cb = m2634a("viewability_adview_banner_min_width", 320);

    /* renamed from: cc */
    public static final C1369c<Integer> f2991cc = m2634a("viewability_adview_banner_min_height", Integer.valueOf(AppLovinAdSize.BANNER.getHeight()));

    /* renamed from: cd */
    public static final C1369c<Integer> f2992cd = m2634a("viewability_adview_mrec_min_width", Integer.valueOf(AppLovinAdSize.MREC.getWidth()));

    /* renamed from: ce */
    public static final C1369c<Integer> f2993ce = m2634a("viewability_adview_mrec_min_height", Integer.valueOf(AppLovinAdSize.MREC.getWidth()));

    /* renamed from: cf */
    public static final C1369c<Integer> f2994cf = m2634a("viewability_adview_leader_min_width", 728);

    /* renamed from: cg */
    public static final C1369c<Integer> f2995cg = m2634a("viewability_adview_leader_min_height", Integer.valueOf(AppLovinAdSize.LEADER.getWidth()));

    /* renamed from: ch */
    public static final C1369c<Float> f2996ch = m2634a("viewability_adview_min_alpha", Float.valueOf(10.0f));

    /* renamed from: ci */
    public static final C1369c<Long> f2997ci = m2634a("viewability_timer_min_visible_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));

    /* renamed from: cj */
    public static final C1369c<Long> f2998cj = m2634a("viewability_timer_interval_ms", 100L);

    /* renamed from: ck */
    public static final C1369c<Boolean> f2999ck = m2634a("dismiss_expanded_adview_on_refresh", false);

    /* renamed from: cl */
    public static final C1369c<Boolean> f3000cl = m2634a("dismiss_expanded_adview_on_detach", false);

    /* renamed from: cm */
    public static final C1369c<Boolean> f3001cm = m2634a("contract_expanded_ad_on_close", true);

    /* renamed from: cn */
    public static final C1369c<Long> f3002cn = m2634a("expandable_close_button_animation_duration_ms", 300L);

    /* renamed from: co */
    public static final C1369c<Integer> f3003co = m2634a("expandable_close_button_size", 27);

    /* renamed from: cp */
    public static final C1369c<Integer> f3004cp = m2634a("expandable_h_close_button_margin", 10);

    /* renamed from: cq */
    public static final C1369c<Integer> f3005cq = m2634a("expandable_t_close_button_margin", 10);

    /* renamed from: cr */
    public static final C1369c<Boolean> f3006cr = m2634a("expandable_lhs_close_button", false);

    /* renamed from: cs */
    public static final C1369c<Integer> f3007cs = m2634a("expandable_close_button_touch_area", 0);

    /* renamed from: ct */
    public static final C1369c<Boolean> f3008ct = m2634a("click_failed_expand", false);

    /* renamed from: cu */
    public static final C1369c<Boolean> f3009cu = m2634a("iaad", false);

    /* renamed from: cv */
    public static final C1369c<Integer> f3010cv = m2634a("auxiliary_operations_threads", 3);

    /* renamed from: cw */
    public static final C1369c<Integer> f3011cw = m2634a("caching_operations_threads", 8);

    /* renamed from: cx */
    public static final C1369c<Long> f3012cx = m2634a("fullscreen_ad_pending_display_state_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: cy */
    public static final C1369c<Long> f3013cy = m2634a("fullscreen_ad_showing_state_timeout_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(2)));

    /* renamed from: cz */
    public static final C1369c<Boolean> f3014cz = m2634a("lhs_close_button_video", false);

    /* renamed from: dA */
    public static final C1369c<Integer> f3015dA = m2634a("fetch_basic_settings_retry_count", 3);

    /* renamed from: dB */
    public static final C1369c<Boolean> f3016dB = m2634a("fetch_basic_settings_on_reconnect", false);

    /* renamed from: dC */
    public static final C1369c<Boolean> f3017dC = m2634a("skip_fetch_basic_settings_if_not_connected", false);

    /* renamed from: dD */
    public static final C1369c<Integer> f3018dD = m2634a("fetch_basic_settings_retry_delay_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(2)));

    /* renamed from: dE */
    public static final C1369c<Integer> f3019dE = m2634a("fetch_variables_connection_timeout_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(5)));

    /* renamed from: dF */
    public static final C1369c<Boolean> f3020dF = m2634a("preload_persisted_zones", true);

    /* renamed from: dG */
    public static final C1369c<Boolean> f3021dG = m2634a("persist_zones", false);

    /* renamed from: dH */
    public static final C1369c<Integer> f3022dH = m2634a("ad_session_minutes", 60);

    /* renamed from: dI */
    public static final C1369c<Boolean> f3023dI = m2634a("session_tracking_cooldown_on_event_fire", true);

    /* renamed from: dJ */
    public static final C1369c<Long> f3024dJ = m2634a("session_tracking_resumed_cooldown_minutes", 90L);

    /* renamed from: dK */
    public static final C1369c<Long> f3025dK = m2634a("session_tracking_paused_cooldown_minutes", 90L);

    /* renamed from: dL */
    public static final C1369c<Boolean> f3026dL = m2634a("track_app_paused", false);

    /* renamed from: dM */
    public static final C1369c<Boolean> f3027dM = m2634a("qq", false);

    /* renamed from: dN */
    public static final C1369c<Boolean> f3028dN = m2634a("qq1", true);

    /* renamed from: dO */
    public static final C1369c<Boolean> f3029dO = m2634a("qq3", true);

    /* renamed from: dP */
    public static final C1369c<Boolean> f3030dP = m2634a("qq4", true);

    /* renamed from: dQ */
    public static final C1369c<Boolean> f3031dQ = m2634a("qq5", true);

    /* renamed from: dR */
    public static final C1369c<Boolean> f3032dR = m2634a("qq6", true);

    /* renamed from: dS */
    public static final C1369c<Boolean> f3033dS = m2634a("qq7", true);

    /* renamed from: dT */
    public static final C1369c<Boolean> f3034dT = m2634a("qq8", true);

    /* renamed from: dU */
    public static final C1369c<Boolean> f3035dU = m2634a("pui", true);

    /* renamed from: dV */
    public static final C1369c<String> f3036dV = m2634a("plugin_version", "");

    /* renamed from: dW */
    public static final C1369c<Boolean> f3037dW = m2634a("hgn", false);

    /* renamed from: dX */
    public static final C1369c<Boolean> f3038dX = m2634a("citab", false);

    /* renamed from: dY */
    public static final C1369c<Boolean> f3039dY = m2634a("cit", false);

    /* renamed from: dZ */
    public static final C1369c<Boolean> f3040dZ = m2634a("cso", false);

    /* renamed from: da */
    public static final C1369c<Boolean> f3041da = m2634a("mute_with_user_settings", true);

    /* renamed from: db */
    public static final C1369c<Integer> f3042db = m2634a("mute_button_size", 32);

    /* renamed from: dc */
    public static final C1369c<Integer> f3043dc = m2634a("mute_button_margin", 10);

    /* renamed from: dd */
    public static final C1369c<Integer> f3044dd = m2634a("mute_button_gravity", 85);

    /* renamed from: de */
    public static final C1369c<Boolean> f3045de = m2634a("video_immersive_mode_enabled", false);

    /* renamed from: df */
    public static final C1369c<Long> f3046df = m2634a("progress_bar_step", 25L);

    /* renamed from: dg */
    public static final C1369c<Integer> f3047dg = m2634a("progress_bar_scale", 10000);

    /* renamed from: dh */
    public static final C1369c<Integer> f3048dh = m2634a("progress_bar_vertical_padding", -8);

    /* renamed from: di */
    public static final C1369c<Long> f3049di = m2634a("video_resume_delay", 250L);

    /* renamed from: dj */
    public static final C1369c<Boolean> f3050dj = m2634a("is_video_skippable", false);

    /* renamed from: dk */
    public static final C1369c<Integer> f3051dk = m2634a("vs_buffer_indicator_size", 50);

    /* renamed from: dl */
    public static final C1369c<Boolean> f3052dl = m2634a("video_zero_length_as_computed", false);

    /* renamed from: dm */
    public static final C1369c<Long> f3053dm = m2634a("set_poststitial_muted_initial_delay_ms", 500L);

    /* renamed from: dn */
    public static final C1369c<Integer> f3054dn = m2634a("native_batch_precache_count", 1);

    /* renamed from: do */
    public static final C1369c<Integer> f3055do = m2634a("submit_postback_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: dp */
    public static final C1369c<Integer> f3056dp = m2634a("submit_postback_retries", 4);

    /* renamed from: dq */
    public static final C1369c<Integer> f3057dq = m2634a("max_postback_attempts", 3);

    /* renamed from: dr */
    public static final C1369c<Integer> f3058dr = m2634a("get_retry_delay_v1", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: ds */
    public static final C1369c<Integer> f3059ds = m2634a("http_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: dt */
    public static final C1369c<Integer> f3060dt = m2634a("http_socket_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(20)));

    /* renamed from: du */
    public static final C1369c<Boolean> f3061du = m2634a("force_ssl", false);

    /* renamed from: dv */
    public static final C1369c<Integer> f3062dv = m2634a("fetch_ad_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: dw */
    public static final C1369c<Integer> f3063dw = m2634a("fetch_ad_retry_count_v1", 1);

    /* renamed from: dx */
    public static final C1369c<Integer> f3064dx = m2634a("submit_data_retry_count_v1", 1);

    /* renamed from: dy */
    public static final C1369c<Integer> f3065dy = m2634a("response_buffer_size", Integer.valueOf(AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND));

    /* renamed from: dz */
    public static final C1369c<Integer> f3066dz = m2634a("fetch_basic_settings_connection_timeout_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: eA */
    public static final C1369c<Boolean> f3067eA = m2634a("asdm", false);

    /* renamed from: eB */
    public static final C1369c<Boolean> f3068eB = m2634a("error_reporting_enabled", false);

    /* renamed from: eC */
    public static final C1369c<Integer> f3069eC = m2634a("error_reporting_log_limit", 100);

    /* renamed from: eD */
    public static final C1369c<String> f3070eD = m2634a("vast_image_html", "<html><head><style>html,body{height:100%;width:100%}body{background-image:url({SOURCE});background-repeat:no-repeat;background-size:contain;background-position:center;}a{position:absolute;top:0;bottom:0;left:0;right:0}</style></head><body><a href=\"applovin://com.applovin.sdk/adservice/track_click_now\"></a></body></html>");

    /* renamed from: eE */
    public static final C1369c<String> f3071eE = m2634a("vast_link_html", "<html><head><style>html,body,iframe{height:100%;width:100%;}body{margin:0}iframe{border:0;overflow:hidden;position:absolute}</style></head><body><iframe src={SOURCE} frameborder=0></iframe></body></html>");

    /* renamed from: eF */
    public static final C1369c<Integer> f3072eF = m2634a("vast_max_response_length", 640000);

    /* renamed from: eG */
    public static final C1369c<Integer> f3073eG = m2634a("vast_max_wrapper_depth", 5);

    /* renamed from: eH */
    public static final C1369c<Long> f3074eH = m2634a("vast_progress_tracking_countdown_step", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));

    /* renamed from: eI */
    public static final C1369c<String> f3075eI = m2634a("vast_unsupported_video_extensions", "ogv,flv");

    /* renamed from: eJ */
    public static final C1369c<String> f3076eJ = m2634a("vast_unsupported_video_types", "video/ogg,video/x-flv");

    /* renamed from: eK */
    public static final C1369c<Boolean> f3077eK = m2634a("vast_validate_with_extension_if_no_video_type", true);

    /* renamed from: eL */
    public static final C1369c<Integer> f3078eL = m2634a("vast_video_selection_policy", Integer.valueOf(C1014j.C1016a.MEDIUM.ordinal()));

    /* renamed from: eM */
    public static final C1369c<Integer> f3079eM = m2634a("vast_wrapper_resolution_retry_count_v1", 1);

    /* renamed from: eN */
    public static final C1369c<Integer> f3080eN = m2634a("vast_wrapper_resolution_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: eO */
    public static final C1369c<Boolean> f3081eO = m2634a("ree", true);

    /* renamed from: eP */
    public static final C1369c<Boolean> f3082eP = m2634a("btee", true);

    /* renamed from: eQ */
    public static final C1369c<Long> f3083eQ = m2634a("server_timestamp_ms", 0L);

    /* renamed from: eR */
    public static final C1369c<Long> f3084eR = m2634a("device_timestamp_ms", 0L);

    /* renamed from: eS */
    public static final C1369c<Boolean> f3085eS = m2634a("cleanup_webview", false);

    /* renamed from: eT */
    public static final C1369c<Boolean> f3086eT = m2634a("sanitize_webview", false);

    /* renamed from: eU */
    public static final C1369c<Boolean> f3087eU = m2634a("force_rerender", false);

    /* renamed from: eV */
    public static final C1369c<Boolean> f3088eV = m2634a("daostr", false);

    /* renamed from: eW */
    public static final C1369c<Boolean> f3089eW = m2634a("urrr", false);

    /* renamed from: eX */
    public static final C1369c<Boolean> f3090eX = m2634a("tctpmw", false);

    /* renamed from: eY */
    public static final C1369c<Boolean> f3091eY = m2634a("tctlaa", false);

    /* renamed from: eZ */
    public static final C1369c<Boolean> f3092eZ = m2634a("swvb", false);

    /* renamed from: ea */
    public static final C1369c<Boolean> f3093ea = m2634a("cfs", false);

    /* renamed from: eb */
    public static final C1369c<Boolean> f3094eb = m2634a("cmi", false);

    /* renamed from: ec */
    public static final C1369c<Boolean> f3095ec = m2634a("cvs", false);

    /* renamed from: ed */
    public static final C1369c<Boolean> f3096ed = m2634a("caf", false);

    /* renamed from: ee */
    public static final C1369c<Boolean> f3097ee = m2634a("cf", false);

    /* renamed from: ef */
    public static final C1369c<String> f3098ef = m2634a("emulator_hardware_list", "ranchu,goldfish,vbox");

    /* renamed from: eg */
    public static final C1369c<String> f3099eg = m2634a("emulator_device_list", "generic,vbox");

    /* renamed from: eh */
    public static final C1369c<String> f3100eh = m2634a("emulator_manufacturer_list", "Genymotion");

    /* renamed from: ei */
    public static final C1369c<String> f3101ei = m2634a("emulator_model_list", "Android SDK built for x86");

    /* renamed from: ej */
    public static final C1369c<Boolean> f3102ej = m2634a("adr", false);

    /* renamed from: ek */
    public static final C1369c<Float> f3103ek = m2634a("volume_normalization_factor", Float.valueOf(6.6666665f));

    /* renamed from: el */
    public static final C1369c<Boolean> f3104el = m2634a("user_agent_collection_enabled", false);

    /* renamed from: em */
    public static final C1369c<Long> f3105em = m2634a("user_agent_collection_timeout_ms", 600L);

    /* renamed from: en */
    public static final C1369c<Boolean> f3106en = m2634a("http_headers_collection_enabled", false);

    /* renamed from: eo */
    public static final C1369c<Long> f3107eo = m2634a("http_headers_collection_timeout_ms", 600L);

    /* renamed from: ep */
    public static final C1369c<String> f3108ep = m2634a("webview_package_name", "com.google.android.webview");

    /* renamed from: eq */
    public static final C1369c<Boolean> f3109eq = m2634a("collect_device_angle", false);

    /* renamed from: er */
    public static final C1369c<Boolean> f3110er = m2634a("collect_device_movement", false);

    /* renamed from: es */
    public static final C1369c<Float> f3111es = m2634a("movement_degradation", Float.valueOf(0.75f));

    /* renamed from: et */
    public static final C1369c<Integer> f3112et = m2634a("device_sensor_period_ms", 250);

    /* renamed from: eu */
    public static final C1369c<Boolean> f3113eu = m2634a("dte", true);

    /* renamed from: ev */
    public static final C1369c<Boolean> f3114ev = m2634a("is_track_ad_info", true);

    /* renamed from: ew */
    public static final C1369c<Boolean> f3115ew = m2634a("submit_ad_stats_enabled", false);

    /* renamed from: ex */
    public static final C1369c<Integer> f3116ex = m2634a("submit_ad_stats_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));

    /* renamed from: ey */
    public static final C1369c<Integer> f3117ey = m2634a("submit_ad_stats_retry_count", 1);

    /* renamed from: ez */
    public static final C1369c<Integer> f3118ez = m2634a("submit_ad_stats_max_count", Integer.valueOf(TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL));

    /* renamed from: fa */
    public static final C1369c<Boolean> f3119fa = m2634a("rwvdv", false);

    /* renamed from: fb */
    public static final C1369c<Boolean> f3120fb = m2634a("handle_render_process_gone", false);

    /* renamed from: fc */
    public static final C1369c<Boolean> f3121fc = m2634a("sfawv", false);

    /* renamed from: fd */
    public static final C1369c<Boolean> f3122fd = m2634a("sipntps", false);

    /* renamed from: fe */
    public static final C1369c<Boolean> f3123fe = m2634a("comcr", true);

    /* renamed from: ff */
    public static final C1369c<Boolean> f3124ff = m2634a("gcoas", false);

    /* renamed from: fg */
    public static final C1369c<Boolean> f3125fg = m2634a("cofaonw", true);

    /* renamed from: fh */
    public static final C1369c<String> f3126fh = m2634a("config_consent_dialog_state", "unknown");

    /* renamed from: fi */
    public static final C1369c<String> f3127fi = m2634a("c_sticky_topics", "safedk_init,max_ad_events,test_mode_enabled,test_mode_networks,send_http_request,adapter_initialization_status");

    /* renamed from: fj */
    public static final C1369c<Boolean> f3128fj = m2634a("zt_enabled", true);

    /* renamed from: fk */
    public static final C1369c<String> f3129fk = m2634a("zt_endpoint", "https://a.applovin.com/");

    /* renamed from: fl */
    public static final C1369c<String> f3130fl = m2634a("zt_backup_endpoint", "https://a.applvn.com/");

    /* renamed from: fm */
    public static final C1369c<Integer> f3131fm = m2634a("zt_timeout_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));

    /* renamed from: fn */
    public static final C1369c<Long> f3132fn = m2634a("zt_flush_interval_s", -1L);

    /* renamed from: fo */
    public static final C1369c<Boolean> f3133fo = m2634a("zt_bg_aware_timer", true);

    /* renamed from: fp */
    public static final C1369c<Boolean> f3134fp = m2634a("zt_flush_on_impression", true);

    /* renamed from: fq */
    public static final C1369c<Boolean> f3135fq = m2634a("zt_flush_on_app_bg", false);

    /* renamed from: fr */
    public static final C1369c<Boolean> f3136fr = m2634a("zt_continue_through_error", true);

    /* renamed from: c */
    private final String f3137c;

    /* renamed from: d */
    private final T f3138d;

    public C1369c(String str, T t) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified");
        } else if (t != null) {
            this.f3137c = str;
            this.f3138d = t;
        } else {
            throw new IllegalArgumentException("No default value specified");
        }
    }

    /* renamed from: a */
    protected static <T> C1369c<T> m2634a(String str, T t) {
        if (t == null) {
            throw new IllegalArgumentException("No default value specified");
        } else if (f2857a.contains(t.getClass())) {
            C1369c<T> cVar = new C1369c<>(str, t);
            if (!f2910b.containsKey(str)) {
                f2910b.put(str, cVar);
                return cVar;
            }
            throw new IllegalArgumentException("Setting has already been used: " + str);
        } else {
            throw new IllegalArgumentException("Unsupported value type: " + t.getClass());
        }
    }

    /* renamed from: c */
    public static Collection<C1369c<?>> m2635c() {
        return Collections.synchronizedCollection(f2910b.values());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public T mo12837a(Object obj) {
        return this.f3138d.getClass().cast(obj);
    }

    /* renamed from: a */
    public String mo12838a() {
        return this.f3137c;
    }

    /* renamed from: b */
    public T mo12839b() {
        return this.f3138d;
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof C1369c)) {
            return 0;
        }
        return this.f3137c.compareTo(((C1369c) obj).mo12838a());
    }
}
