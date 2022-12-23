package com.inmobi.media;

import android.graphics.Color;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.exoplayer2.util.MimeTypes;
import com.inmobi.commons.utils.json.Constructor;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.p243my.tracker.ads.AdFormat;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ev */
/* compiled from: AdConfig */
public final class C5220ev extends C5238ex {
    private static final String ALLOWED_CONTENT_TYPE = "allowedContentType";
    private static final String DEFAULT_AD_SERVER_URL = "https://ads.inmobi.com/sdk";
    private static final boolean DEFAULT_CCT_ENABLED = true;
    private static final int DEFAULT_FETCH_TIMEOUT = 60;
    private static final int DEFAULT_MAX_POOL_SIZE = 10;
    private static final int DEFAULT_MINIMUM_REFRESH_INTERVAL = 20;
    private static final int DEFAULT_REFRESH_INTERVAL = 60;
    /* access modifiers changed from: private */
    public static final String TAG = C5220ev.class.getSimpleName();
    public C5224a assetCache = new C5224a();
    private Map<String, C5226c> cache;
    public boolean cctEnabled = true;
    public int defaultRefreshInterval = 60;
    public int fetchTimeout = 60;
    public C5227d imai = new C5227d();
    public int maxPoolSize = 10;
    public int minimumRefreshInterval = 20;
    public C5228e mraid = new C5228e();
    public C5230g rendering = new C5230g();
    public C5394ik timeouts = C5394ik.m12488a();
    public String url = DEFAULT_AD_SERVER_URL;
    public C5232i vastVideo = new C5232i();
    public C5234k viewability = new C5234k();

    /* renamed from: com.inmobi.media.ev$a */
    /* compiled from: AdConfig */
    public static final class C5224a {
        public long maxCacheSize = 104857600;
        int maxCachedAssets = 10;
        public int maxRetries = 3;
        public int retryInterval = 1;
        public long timeToLive = 259200;
    }

    /* renamed from: com.inmobi.media.ev$b */
    /* compiled from: AdConfig */
    public static final class C5225b {
        public boolean bitrate_mandatory = false;
        public int headerTimeout = 2000;
    }

    /* renamed from: com.inmobi.media.ev$d */
    /* compiled from: AdConfig */
    public static final class C5227d {
        public int maxDbEvents = TJAdUnitConstants.DEFAULT_VOLUME_CHECK_INTERVAL;
        public int maxEventBatch = 10;
        public int maxRetries = 3;
        public long pingCacheExpiry = 10800;
        public int pingInterval = 60;
        public int pingTimeout = 120;
    }

    /* renamed from: com.inmobi.media.ev$e */
    /* compiled from: AdConfig */
    public static final class C5228e {
        public long expiry = 432000;
        public int maxRetries = 3;
        public int retryInterval = 60;
        public String url = "https://i.l.inmobicdn.net/sdk/sdk/500/android/mraid.js";
    }

    /* renamed from: com.inmobi.media.ev$f */
    /* compiled from: AdConfig */
    public static final class C5229f {
        public long expiry = 432000;
        public int maxRetries = 3;
        public boolean omidEnabled = true;
        public String partnerKey = "Inmobi";
        public int retryInterval = 60;
        public String url = "https://i.l.inmobicdn.net/sdk/sdk/OMID/omsdk-v1.js";
        public long webViewRetainTime = 1000;
    }

    /* renamed from: com.inmobi.media.ev$h */
    /* compiled from: AdConfig */
    public static final class C5231h {
        List<String> allowedContentType = new ArrayList(Collections.singletonList("video/mp4"));
        long maxSaveSize = CacheDataSink.DEFAULT_FRAGMENT_SIZE;
    }

    /* renamed from: com.inmobi.media.ev$i */
    /* compiled from: AdConfig */
    public static final class C5232i {
        public List<String> allowedContentType = new ArrayList(Arrays.asList(new String[]{"video/mp4", MimeTypes.IMAGE_JPEG, "image/jpg", "image/gif", "image/png"}));
        public C5225b bitRate = new C5225b();
        public int maxWrapperLimit = 3;
        public long optimalVastVideoSize = 3145728;
        public long vastMaxAssetSize = 31457280;
    }

    /* renamed from: com.inmobi.media.ev$j */
    /* compiled from: AdConfig */
    public static final class C5233j {
        public int impressionMinPercentageViewed = 50;
        public int impressionMinTimeViewed = 2000;
        public int videoMinPercentagePlay = 50;
    }

    /* renamed from: com.inmobi.media.ev$k */
    /* compiled from: AdConfig */
    public static final class C5234k {
        static final int MIN_IMPRESSION_POLL_INTERVAL_MILLIS = 50;
        static final int MIN_VISIBILITY_THROTTLE_INTERVAL_MILLIS = 50;
        public int displayMinPercentageAnimate = 67;
        public int impressionMinPercentageViewed = 50;
        public int impressionMinTimeViewed = 1000;
        public int impressionPollIntervalMillis = 250;
        public boolean moatEnabled = true;
        public C5229f omidConfig = new C5229f();
        public C5233j video = new C5233j();
        public int visibilityThrottleMillis = 100;
        public C5235l web = new C5235l();
    }

    /* renamed from: com.inmobi.media.ev$l */
    /* compiled from: AdConfig */
    public static final class C5235l {
        public int impressionMinPercentageViewed = 50;
        public int impressionPollIntervalMillis = 1000;
    }

    /* renamed from: b */
    public final String mo40557b() {
        return CampaignUnit.JSON_KEY_ADS;
    }

    /* renamed from: a */
    public static C5352hm<C5220ev> m11965a() {
        return new C5352hm().mo40709a(new C5357hr("cache", C5220ev.class), (C5356hq) new C5355hp(new Constructor<Map<String, C5226c>>() {
            public final /* synthetic */ Object construct() {
                return new HashMap();
            }
        }, C5226c.class)).mo40709a(new C5357hr(ALLOWED_CONTENT_TYPE, C5231h.class), (C5356hq) new C5354ho(new Constructor<List<String>>() {
            public final /* synthetic */ Object construct() {
                return new ArrayList();
            }
        }, String.class)).mo40709a(new C5357hr(ALLOWED_CONTENT_TYPE, C5232i.class), (C5356hq) new C5354ho(new Constructor<List<String>>() {
            public final /* synthetic */ Object construct() {
                return new ArrayList();
            }
        }, String.class));
    }

    C5220ev(String str) {
        super(str);
        HashMap hashMap = new HashMap();
        this.cache = hashMap;
        hashMap.put(TtmlNode.RUBY_BASE, new C5226c());
        this.cache.put(AdFormat.BANNER, new C5226c());
        this.cache.put("int", new C5226c());
        this.cache.put("native", new C5226c());
    }

    /* renamed from: c */
    public final JSONObject mo40558c() {
        return m11965a().mo40711a(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:165:0x027b A[RETURN] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo40559d() {
        /*
            r10 = this;
            int r0 = r10.maxPoolSize
            r1 = 0
            if (r0 > 0) goto L_0x0006
            return r1
        L_0x0006:
            com.inmobi.media.ik r0 = r10.timeouts
            r0.mo40766j()
            java.lang.String r0 = r10.url
            java.lang.String r2 = "http://"
            boolean r0 = r0.startsWith(r2)
            java.lang.String r3 = "https://"
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = r10.url
            boolean r0 = r0.startsWith(r3)
            if (r0 == 0) goto L_0x027c
        L_0x001f:
            int r0 = r10.minimumRefreshInterval
            if (r0 < 0) goto L_0x027c
            int r4 = r10.defaultRefreshInterval
            if (r4 < 0) goto L_0x027c
            if (r0 > r4) goto L_0x027c
            int r0 = r10.fetchTimeout
            if (r0 > 0) goto L_0x002f
            goto L_0x027c
        L_0x002f:
            java.util.Map<java.lang.String, com.inmobi.media.ev$c> r0 = r10.cache
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0039:
            boolean r4 = r0.hasNext()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0059
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            com.inmobi.media.ev$c r4 = (com.inmobi.media.C5220ev.C5226c) r4
            long r8 = r4.timeToLive
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r5 = 0
        L_0x0056:
            if (r5 != 0) goto L_0x0039
            return r1
        L_0x0059:
            com.inmobi.media.ev$d r0 = r10.imai
            int r0 = r0.maxDbEvents
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ev$d r0 = r10.imai
            int r0 = r0.maxEventBatch
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ev$d r0 = r10.imai
            int r0 = r0.maxRetries
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ev$d r0 = r10.imai
            int r0 = r0.pingInterval
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ev$d r0 = r10.imai
            int r0 = r0.pingTimeout
            if (r0 <= 0) goto L_0x027c
            com.inmobi.media.ev$d r0 = r10.imai
            long r8 = r0.pingCacheExpiry
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0081
            goto L_0x027c
        L_0x0081:
            com.inmobi.media.ev$e r0 = r10.mraid
            long r8 = r0.expiry
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ev$e r0 = r10.mraid
            int r0 = r0.retryInterval
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ev$e r0 = r10.mraid
            int r0 = r0.maxRetries
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ev$e r0 = r10.mraid
            java.lang.String r0 = r0.url
            boolean r0 = r0.startsWith(r2)
            if (r0 != 0) goto L_0x00ab
            com.inmobi.media.ev$e r0 = r10.mraid
            java.lang.String r0 = r0.url
            boolean r0 = r0.startsWith(r3)
            if (r0 != 0) goto L_0x00ab
            goto L_0x027c
        L_0x00ab:
            com.inmobi.media.ik r0 = r10.timeouts
            int r0 = r0.mo40764h()
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ik r0 = r10.timeouts
            int r0 = r0.mo40757b()
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ik r0 = r10.timeouts
            int r0 = r0.mo40759c()
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ik r0 = r10.timeouts
            int r0 = r0.mo40760d()
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ik r0 = r10.timeouts
            int r0 = r0.mo40761e()
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ik r0 = r10.timeouts
            int r0 = r0.mo40762f()
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ik r0 = r10.timeouts
            int r0 = r0.mo40763g()
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ik r0 = r10.timeouts
            int r0 = r0.mo40765i()
            if (r0 >= 0) goto L_0x00ed
            goto L_0x027c
        L_0x00ed:
            com.inmobi.media.ev$g r0 = r10.rendering
            int r0 = r0.picHeight
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ev$g r0 = r10.rendering
            int r0 = r0.picWidth
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ev$g r0 = r10.rendering
            int r0 = r0.picQuality
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ev$g r0 = r10.rendering
            int r0 = r0.maxVibrationDuration
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ev$g r0 = r10.rendering
            int r0 = r0.maxVibrationPatternLength
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ev$g r0 = r10.rendering
            com.inmobi.media.ev$h r0 = r0.savecontent
            long r2 = r0.maxSaveSize
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ev$g r0 = r10.rendering
            java.lang.String r0 = r0.webviewBackground
            if (r0 == 0) goto L_0x027c
            com.inmobi.media.ev$g r0 = r10.rendering
            java.lang.String r0 = r0.webviewBackground
            java.lang.String r0 = r0.trim()
            int r0 = r0.length()
            if (r0 == 0) goto L_0x027c
            com.inmobi.media.ev$g r0 = r10.rendering
            long r2 = r0.delayedRedirection
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x027c
            com.inmobi.media.ev$g r0 = r10.rendering
            long r2 = r0.userTouchResetTime
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x013b
            goto L_0x027c
        L_0x013b:
            com.inmobi.media.ev$g r0 = r10.rendering     // Catch:{ IllegalArgumentException -> 0x027c }
            java.lang.String r0 = r0.webviewBackground     // Catch:{ IllegalArgumentException -> 0x027c }
            android.graphics.Color.parseColor(r0)     // Catch:{ IllegalArgumentException -> 0x027c }
            com.inmobi.media.ev$e r0 = r10.mraid
            int r0 = r0.maxRetries
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ev$e r0 = r10.mraid
            int r0 = r0.retryInterval
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ev$e r0 = r10.mraid
            java.lang.String r0 = r0.url
            if (r0 == 0) goto L_0x027c
            com.inmobi.media.ev$e r0 = r10.mraid
            java.lang.String r0 = r0.url
            java.lang.String r0 = r0.trim()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0164
            goto L_0x027c
        L_0x0164:
            com.inmobi.media.ev$k r0 = r10.viewability
            int r0 = r0.impressionMinPercentageViewed
            if (r0 <= 0) goto L_0x0219
            com.inmobi.media.ev$k r0 = r10.viewability
            int r0 = r0.impressionMinPercentageViewed
            r2 = 100
            if (r0 > r2) goto L_0x0219
            com.inmobi.media.ev$k r0 = r10.viewability
            int r0 = r0.impressionMinTimeViewed
            if (r0 < 0) goto L_0x0219
            com.inmobi.media.ev$k r0 = r10.viewability
            int r0 = r0.displayMinPercentageAnimate
            if (r0 <= 0) goto L_0x0219
            com.inmobi.media.ev$k r0 = r10.viewability
            int r0 = r0.displayMinPercentageAnimate
            if (r0 > r2) goto L_0x0219
            com.inmobi.media.ev$k r0 = r10.viewability
            com.inmobi.media.ev$j r0 = r0.video
            int r0 = r0.impressionMinPercentageViewed
            if (r0 <= 0) goto L_0x0219
            com.inmobi.media.ev$k r0 = r10.viewability
            com.inmobi.media.ev$j r0 = r0.video
            int r0 = r0.impressionMinPercentageViewed
            if (r0 > r2) goto L_0x0219
            com.inmobi.media.ev$k r0 = r10.viewability
            com.inmobi.media.ev$l r0 = r0.web
            int r0 = r0.impressionMinPercentageViewed
            if (r0 <= 0) goto L_0x0219
            com.inmobi.media.ev$k r0 = r10.viewability
            com.inmobi.media.ev$l r0 = r0.web
            int r0 = r0.impressionMinPercentageViewed
            if (r0 > r2) goto L_0x0219
            com.inmobi.media.ev$k r0 = r10.viewability
            com.inmobi.media.ev$l r0 = r0.web
            int r0 = r0.impressionPollIntervalMillis
            if (r0 <= 0) goto L_0x0219
            com.inmobi.media.ev$k r0 = r10.viewability
            com.inmobi.media.ev$j r0 = r0.video
            int r0 = r0.impressionMinTimeViewed
            if (r0 < 0) goto L_0x0219
            com.inmobi.media.ev$k r0 = r10.viewability
            com.inmobi.media.ev$j r0 = r0.video
            int r0 = r0.videoMinPercentagePlay
            if (r0 <= 0) goto L_0x0219
            com.inmobi.media.ev$k r0 = r10.viewability
            com.inmobi.media.ev$j r0 = r0.video
            int r0 = r0.videoMinPercentagePlay
            if (r0 > r2) goto L_0x0219
            com.inmobi.media.ev$k r0 = r10.viewability
            int r0 = r0.visibilityThrottleMillis
            r2 = 50
            if (r0 < r2) goto L_0x0219
            com.inmobi.media.ev$k r0 = r10.viewability
            int r0 = r0.visibilityThrottleMillis
            int r0 = r0 * 5
            com.inmobi.media.ev$k r3 = r10.viewability
            int r3 = r3.impressionMinTimeViewed
            if (r0 > r3) goto L_0x0219
            com.inmobi.media.ev$k r0 = r10.viewability
            int r0 = r0.impressionPollIntervalMillis
            if (r0 < r2) goto L_0x0219
            com.inmobi.media.ev$k r0 = r10.viewability
            int r0 = r0.impressionPollIntervalMillis
            int r0 = r0 * 4
            com.inmobi.media.ev$k r2 = r10.viewability
            int r2 = r2.impressionMinTimeViewed
            if (r0 > r2) goto L_0x0219
            com.inmobi.media.ev$k r0 = r10.viewability
            com.inmobi.media.ev$f r0 = r0.omidConfig
            if (r0 == 0) goto L_0x0213
            int r2 = r0.maxRetries
            if (r2 < 0) goto L_0x0213
            int r2 = r0.retryInterval
            if (r2 < 0) goto L_0x0213
            java.lang.String r2 = r0.url
            if (r2 == 0) goto L_0x0213
            java.lang.String r2 = r0.url
            java.lang.String r2 = r2.trim()
            int r2 = r2.length()
            if (r2 == 0) goto L_0x0213
            java.lang.String r0 = r0.partnerKey
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0211
            goto L_0x0213
        L_0x0211:
            r0 = 0
            goto L_0x0214
        L_0x0213:
            r0 = 1
        L_0x0214:
            if (r0 == 0) goto L_0x0217
            goto L_0x0219
        L_0x0217:
            r0 = 0
            goto L_0x021a
        L_0x0219:
            r0 = 1
        L_0x021a:
            if (r0 == 0) goto L_0x021d
            return r1
        L_0x021d:
            com.inmobi.media.ev$i r0 = r10.vastVideo
            long r2 = r0.optimalVastVideoSize
            r8 = 31457280(0x1e00000, double:1.55419614E-316)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x027c
            com.inmobi.media.ev$i r0 = r10.vastVideo
            long r2 = r0.optimalVastVideoSize
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x027c
            com.inmobi.media.ev$i r0 = r10.vastVideo
            int r0 = r0.maxWrapperLimit
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ev$i r0 = r10.vastVideo
            long r2 = r0.vastMaxAssetSize
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x027c
            com.inmobi.media.ev$i r0 = r10.vastVideo
            long r2 = r0.vastMaxAssetSize
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0251
            goto L_0x027c
        L_0x0251:
            com.inmobi.media.ev$a r0 = r10.assetCache
            int r0 = r0.retryInterval
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ev$a r0 = r10.assetCache
            int r0 = r0.maxCachedAssets
            r2 = 20
            if (r0 > r2) goto L_0x027c
            com.inmobi.media.ev$a r0 = r10.assetCache
            int r0 = r0.maxCachedAssets
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ev$a r0 = r10.assetCache
            long r2 = r0.timeToLive
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ev$a r0 = r10.assetCache
            long r2 = r0.maxCacheSize
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x027c
            com.inmobi.media.ev$a r0 = r10.assetCache
            int r0 = r0.maxRetries
            if (r0 < 0) goto L_0x027c
            return r5
        L_0x027c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5220ev.mo40559d():boolean");
    }

    /* renamed from: a */
    public final C5226c mo40556a(String str) {
        C5226c cVar = this.cache.get(str);
        if (cVar != null) {
            return cVar;
        }
        C5226c cVar2 = this.cache.get(TtmlNode.RUBY_BASE);
        return cVar2 == null ? new C5226c() : cVar2;
    }

    /* renamed from: com.inmobi.media.ev$c */
    /* compiled from: AdConfig */
    public static final class C5226c {
        public long timeToLive = 3300;

        C5226c() {
        }
    }

    /* renamed from: com.inmobi.media.ev$g */
    /* compiled from: AdConfig */
    public static final class C5230g {
        static final short DEFAULT_NETWORK_LOAD_LIMIT = 50;
        public static final int DEFAULT_TOUCH_RESET_TIME = 4;
        public static final byte NETWORK_LOAD_LIMIT_DISABLED = -1;
        public boolean autoRedirectionEnforcement = true;
        public int bannerNetworkLoadsLimit = 50;
        long delayedRedirection = 5;
        public boolean enablePubMuteControl = false;
        int maxVibrationDuration = 5;
        int maxVibrationPatternLength = 20;
        public int otherNetworkLoadsLimit = -1;
        int picHeight = 480;
        int picQuality = 100;
        int picWidth = 320;
        C5231h savecontent = new C5231h();
        public boolean shouldRenderPopup = false;
        long userTouchResetTime = 4;
        String webviewBackground = "#00000000";

        /* renamed from: b */
        public final long mo40561b() {
            return this.userTouchResetTime * 1000;
        }

        /* renamed from: a */
        public final int mo40560a() {
            try {
                return Color.parseColor(this.webviewBackground);
            } catch (IllegalArgumentException unused) {
                String unused2 = C5220ev.TAG;
                return Color.parseColor("#00000000");
            }
        }
    }
}
