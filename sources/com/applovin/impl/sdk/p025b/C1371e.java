package com.applovin.impl.sdk.p025b;

import java.util.HashSet;

/* renamed from: com.applovin.impl.sdk.b.e */
public class C1371e<T> {

    /* renamed from: A */
    public static final C1371e<String> f3147A = new C1371e<>("com.applovin.sdk.mediation_provider", String.class);

    /* renamed from: B */
    public static final C1371e<String> f3148B = new C1371e<>("com.applovin.sdk.mediation.test_mode_network", String.class);

    /* renamed from: a */
    public static final C1371e<String> f3149a = new C1371e<>("com.applovin.sdk.impl.isFirstRun", String.class);

    /* renamed from: b */
    public static final C1371e<Boolean> f3150b = new C1371e<>("com.applovin.sdk.launched_before", Boolean.class);

    /* renamed from: c */
    public static final C1371e<String> f3151c = new C1371e<>("com.applovin.sdk.user_id", String.class);

    /* renamed from: d */
    public static final C1371e<String> f3152d = new C1371e<>("com.applovin.sdk.compass_id", String.class);

    /* renamed from: e */
    public static final C1371e<String> f3153e = new C1371e<>("com.applovin.sdk.compass_random_token", String.class);

    /* renamed from: f */
    public static final C1371e<String> f3154f = new C1371e<>("com.applovin.sdk.applovin_random_token", String.class);

    /* renamed from: g */
    public static final C1371e<String> f3155g = new C1371e<>("com.applovin.sdk.device_test_group", String.class);

    /* renamed from: h */
    public static final C1371e<String> f3156h = new C1371e<>("com.applovin.sdk.local_test_group", String.class);

    /* renamed from: i */
    public static final C1371e<String> f3157i = new C1371e<>("com.applovin.sdk.variables", String.class);

    /* renamed from: j */
    public static final C1371e<Boolean> f3158j = new C1371e<>("com.applovin.sdk.compliance.has_user_consent", Boolean.class);

    /* renamed from: k */
    public static final C1371e<Boolean> f3159k = new C1371e<>("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);

    /* renamed from: l */
    public static final C1371e<Boolean> f3160l = new C1371e<>("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);

    /* renamed from: m */
    public static final C1371e<HashSet> f3161m = new C1371e<>("com.applovin.sdk.impl.postbackQueue.key", HashSet.class);

    /* renamed from: n */
    public static final C1371e<String> f3162n = new C1371e<>("com.applovin.sdk.stats", String.class);

    /* renamed from: o */
    public static final C1371e<String> f3163o = new C1371e<>("com.applovin.sdk.errors", String.class);

    /* renamed from: p */
    public static final C1371e<HashSet> f3164p = new C1371e<>("com.applovin.sdk.task.stats", HashSet.class);

    /* renamed from: q */
    public static final C1371e<String> f3165q = new C1371e<>("com.applovin.sdk.network_response_code_mapping", String.class);

    /* renamed from: r */
    public static final C1371e<String> f3166r = new C1371e<>("com.applovin.sdk.event_tracking.super_properties", String.class);

    /* renamed from: s */
    public static final C1371e<String> f3167s = new C1371e<>("com.applovin.sdk.request_tracker.counter", String.class);

    /* renamed from: t */
    public static final C1371e<String> f3168t = new C1371e<>("com.applovin.sdk.zones", String.class);

    /* renamed from: u */
    public static final C1371e<HashSet> f3169u = new C1371e<>("com.applovin.sdk.ad.stats", HashSet.class);

    /* renamed from: v */
    public static final C1371e<Integer> f3170v = new C1371e<>("com.applovin.sdk.last_video_position", Integer.class);

    /* renamed from: w */
    public static final C1371e<Boolean> f3171w = new C1371e<>("com.applovin.sdk.should_resume_video", Boolean.class);

    /* renamed from: x */
    public static final C1371e<String> f3172x = new C1371e<>("com.applovin.sdk.mediation.signal_providers", String.class);

    /* renamed from: y */
    public static final C1371e<String> f3173y = new C1371e<>("com.applovin.sdk.mediation.auto_init_adapters", String.class);

    /* renamed from: z */
    public static final C1371e<String> f3174z = new C1371e<>("com.applovin.sdk.persisted_data", String.class);

    /* renamed from: C */
    private final String f3175C;

    /* renamed from: D */
    private final Class<T> f3176D;

    public C1371e(String str, Class<T> cls) {
        this.f3175C = str;
        this.f3176D = cls;
    }

    /* renamed from: a */
    public String mo12851a() {
        return this.f3175C;
    }

    /* renamed from: b */
    public Class<T> mo12852b() {
        return this.f3176D;
    }

    public String toString() {
        return "Key{name='" + this.f3175C + '\'' + ", type=" + this.f3176D + '}';
    }
}
