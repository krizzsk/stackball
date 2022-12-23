package com.applovin.impl.sdk.p026c;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.c.b */
public class C1375b {

    /* renamed from: A */
    public static final C1375b f3182A = m2687a("wvhec", "WEB_VIEW_HTTP_ERROR_COUNT");

    /* renamed from: B */
    public static final C1375b f3183B = m2687a("wvrec", "WEB_VIEW_RENDER_ERROR_COUNT");

    /* renamed from: C */
    public static final C1375b f3184C = m2687a("wvsem", "WEB_VIEW_SSL_ERROR_MESSAGES");

    /* renamed from: D */
    public static final C1375b f3185D = m2687a("wvruc", "WEB_VIEW_RENDERER_UNRESPONSIVE_COUNT");

    /* renamed from: G */
    private static final Set<String> f3186G = new HashSet(32);

    /* renamed from: a */
    static final C1375b f3187a = m2687a("sas", "AD_SOURCE");

    /* renamed from: b */
    static final C1375b f3188b = m2687a("srt", "AD_RENDER_TIME");

    /* renamed from: c */
    static final C1375b f3189c = m2687a("sft", "AD_FETCH_TIME");

    /* renamed from: d */
    static final C1375b f3190d = m2687a("sfs", "AD_FETCH_SIZE");

    /* renamed from: e */
    static final C1375b f3191e = m2687a("sadb", "AD_DOWNLOADED_BYTES");

    /* renamed from: f */
    static final C1375b f3192f = m2687a("sacb", "AD_CACHED_BYTES");

    /* renamed from: g */
    static final C1375b f3193g = m2687a("stdl", "TIME_TO_DISPLAY_FROM_LOAD");

    /* renamed from: h */
    static final C1375b f3194h = m2687a("stdi", "TIME_TO_DISPLAY_FROM_INIT");

    /* renamed from: i */
    static final C1375b f3195i = m2687a("snas", "AD_NUMBER_IN_SESSION");

    /* renamed from: j */
    static final C1375b f3196j = m2687a("snat", "AD_NUMBER_TOTAL");

    /* renamed from: k */
    static final C1375b f3197k = m2687a("stah", "TIME_AD_HIDDEN_FROM_SHOW");

    /* renamed from: l */
    static final C1375b f3198l = m2687a("stas", "TIME_TO_SKIP_FROM_SHOW");

    /* renamed from: m */
    static final C1375b f3199m = m2687a("stac", "TIME_TO_CLICK_FROM_SHOW");

    /* renamed from: n */
    static final C1375b f3200n = m2687a("stbe", "TIME_TO_EXPAND_FROM_SHOW");

    /* renamed from: o */
    static final C1375b f3201o = m2687a("stbc", "TIME_TO_CONTRACT_FROM_SHOW");

    /* renamed from: p */
    static final C1375b f3202p = m2687a("saan", "AD_SHOWN_WITH_ACTIVE_NETWORK");

    /* renamed from: q */
    static final C1375b f3203q = m2687a("suvs", "INTERSTITIAL_USED_VIDEO_STREAM");

    /* renamed from: r */
    static final C1375b f3204r = m2687a("sugs", "AD_USED_GRAPHIC_STREAM");

    /* renamed from: s */
    static final C1375b f3205s = m2687a("svpv", "INTERSTITIAL_VIDEO_PERCENT_VIEWED");

    /* renamed from: t */
    static final C1375b f3206t = m2687a("stpd", "INTERSTITIAL_PAUSED_DURATION");

    /* renamed from: u */
    static final C1375b f3207u = m2687a("shsc", "HTML_RESOURCE_CACHE_SUCCESS_COUNT");

    /* renamed from: v */
    static final C1375b f3208v = m2687a("shfc", "HTML_RESOURCE_CACHE_FAILURE_COUNT");

    /* renamed from: w */
    static final C1375b f3209w = m2687a("schc", "AD_CANCELLED_HTML_CACHING");

    /* renamed from: x */
    static final C1375b f3210x = m2687a("smwm", "AD_SHOWN_IN_MULTIWINDOW_MODE");

    /* renamed from: y */
    static final C1375b f3211y = m2687a("vssc", "VIDEO_STREAM_STALLED_COUNT");

    /* renamed from: z */
    public static final C1375b f3212z = m2687a("wvem", "WEB_VIEW_ERROR_MESSAGES");

    /* renamed from: E */
    private final String f3213E;

    /* renamed from: F */
    private final String f3214F;

    static {
        m2687a("sisw", "IS_STREAMING_WEBKIT");
        m2687a("surw", "UNABLE_TO_RETRIEVE_WEBKIT_HTML_STRING");
        m2687a("surp", "UNABLE_TO_PERSIST_WEBKIT_HTML_PLACEMENT_REPLACED_STRING");
        m2687a("swhp", "SUCCESSFULLY_PERSISTED_WEBKIT_HTML_STRING");
        m2687a("skr", "STOREKIT_REDIRECTED");
        m2687a("sklf", "STOREKIT_LOAD_FAILURE");
        m2687a("skps", "STOREKIT_PRELOAD_SKIPPED");
    }

    private C1375b(String str, String str2) {
        this.f3213E = str;
        this.f3214F = str2;
    }

    /* renamed from: a */
    private static C1375b m2687a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No key name specified");
        } else if (f3186G.contains(str)) {
            throw new IllegalArgumentException("Key has already been used: " + str);
        } else if (!TextUtils.isEmpty(str2)) {
            f3186G.add(str);
            return new C1375b(str, str2);
        } else {
            throw new IllegalArgumentException("No debug name specified");
        }
    }

    /* renamed from: a */
    public String mo12883a() {
        return this.f3213E;
    }

    /* renamed from: b */
    public String mo12884b() {
        return this.f3214F;
    }
}
