package com.tapjoy;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TJAdUnit;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.C9084b;
import com.tapjoy.internal.C9121cb;
import com.tapjoy.internal.C9271fi;
import com.tapjoy.internal.C9277fm;
import com.tapjoy.internal.C9285fq;
import com.tapjoy.internal.C9291fu;
import com.tapjoy.internal.C9292fv;
import com.tapjoy.internal.C9293fw;
import com.tapjoy.internal.C9300ga;
import com.tapjoy.internal.C9314gf;
import com.tapjoy.internal.C9320gi;
import com.tapjoy.internal.C9336gv;
import com.tapjoy.internal.C9340gw;
import com.tapjoy.internal.C9344gz;
import com.tapjoy.internal.C9359he;
import com.tapjoy.internal.C9365hg;
import com.tapjoy.internal.C9367hi;
import com.tapjoy.internal.C9418ij;
import com.tapjoy.internal.C9465jq;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class TJCorePlacement {
    /* access modifiers changed from: package-private */

    /* renamed from: a */
    public static final String f21996a = TJCorePlacement.class.getSimpleName();

    /* renamed from: A */
    private TJAdUnit.TJAdUnitVideoListener f21997A = new TJAdUnit.TJAdUnitVideoListener() {
        public final void onVideoStart() {
            TJPlacement a = TJCorePlacement.this.mo57525a("SHOW");
            if (a != null && a.getVideoListener() != null) {
                a.getVideoListener().onVideoStart(a);
            }
        }

        public final void onVideoCompleted() {
            TJPlacement a = TJCorePlacement.this.mo57525a("SHOW");
            if (a != null && a.getVideoListener() != null) {
                a.getVideoListener().onVideoComplete(a);
            }
        }

        public final void onVideoError(String str) {
            TJPlacement a = TJCorePlacement.this.mo57525a("SHOW");
            if (a != null && a.getVideoListener() != null) {
                a.getVideoListener().onVideoError(a, str);
            }
        }
    };
    /* access modifiers changed from: package-private */

    /* renamed from: b */
    public Context f21998b;
    /* access modifiers changed from: package-private */

    /* renamed from: c */
    public TJPlacementData f21999c;

    /* renamed from: d */
    String f22000d;
    /* access modifiers changed from: package-private */

    /* renamed from: e */
    public long f22001e;

    /* renamed from: f */
    final C9293fw f22002f = new C9293fw();

    /* renamed from: g */
    TJAdUnit f22003g;
    /* access modifiers changed from: package-private */

    /* renamed from: h */
    public boolean f22004h = false;
    /* access modifiers changed from: package-private */

    /* renamed from: i */
    public C9365hg f22005i = null;

    /* renamed from: j */
    boolean f22006j;

    /* renamed from: k */
    volatile boolean f22007k = false;

    /* renamed from: l */
    volatile boolean f22008l = false;

    /* renamed from: m */
    String f22009m;

    /* renamed from: n */
    String f22010n;

    /* renamed from: o */
    String f22011o;

    /* renamed from: p */
    String f22012p;

    /* renamed from: q */
    HashMap f22013q;

    /* renamed from: r */
    private Map f22014r = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: s */
    public Map f22015s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C9277fm f22016t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f22017u = false;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C9418ij f22018v = null;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public volatile boolean f22019w = false;

    /* renamed from: x */
    private volatile boolean f22020x = false;

    /* renamed from: y */
    private boolean f22021y;

    /* renamed from: z */
    private TJAdUnit.TJAdUnitWebViewListener f22022z = new TJAdUnit.TJAdUnitWebViewListener() {
        public final void onContentReady() {
            TJCorePlacement.this.m24185e();
        }

        public final void onClosed() {
            if (TJCorePlacement.this.f22004h) {
                TJPlacementManager.decrementPlacementCacheCount();
                boolean unused = TJCorePlacement.this.f22004h = false;
            }
            if (TJCorePlacement.this.f22017u) {
                TJPlacementManager.decrementPlacementPreRenderCount();
                boolean unused2 = TJCorePlacement.this.f22017u = false;
            }
        }

        public final void onClick() {
            TJCorePlacement.m24186e(TJCorePlacement.this);
        }
    };

    TJCorePlacement(String str, String str2, boolean z) {
        Activity c = C9084b.m24328c();
        this.f21998b = c;
        if (c == null) {
            TapjoyLog.m24273d(f21996a, "getVisibleActivity() is NULL. Activity can be explicitly set via `Tapjoy.setActivity(Activity)`");
        }
        this.f22021y = z;
        TJPlacementData tJPlacementData = new TJPlacementData(str2, getPlacementContentUrl());
        this.f21999c = tJPlacementData;
        tJPlacementData.setPlacementName(str);
        this.f22000d = UUID.randomUUID().toString();
        TJAdUnit tJAdUnit = new TJAdUnit();
        this.f22003g = tJAdUnit;
        tJAdUnit.setWebViewListener(this.f22022z);
        this.f22003g.setVideoListener(this.f21997A);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo57527a(TJPlacement tJPlacement) {
        boolean z = false;
        if (tJPlacement == null) {
            mo57529a(TapjoyErrorMessage.ErrorType.SDK_ERROR, new TJError(0, "Cannot request content from a NULL placement"));
            return;
        }
        mo57530a("REQUEST", tJPlacement);
        if (this.f22001e - SystemClock.elapsedRealtime() > 0) {
            String str = f21996a;
            TapjoyLog.m24273d(str, "Content has not expired yet for " + this.f21999c.getPlacementName());
            if (this.f22007k) {
                C9314gf.m24963b("TJPlacement.requestContent").mo58199a(FirebaseAnalytics.Param.CONTENT_TYPE, (Object) mo57526a()).mo58199a("from", (Object) "cache").mo58204c();
                this.f22020x = false;
                m24177b(tJPlacement);
                m24185e();
                return;
            }
            C9314gf.m24963b("TJPlacement.requestContent").mo58199a(FirebaseAnalytics.Param.CONTENT_TYPE, (Object) "none").mo58199a("from", (Object) "cache").mo58204c();
            m24177b(tJPlacement);
            return;
        }
        if (this.f22007k) {
            C9314gf.m24965c("TJPlacement.requestContent").mo58199a("was_available", (Object) true);
        }
        if (this.f22008l) {
            C9314gf.m24965c("TJPlacement.requestContent").mo58199a("was_ready", (Object) true);
        }
        if (!C9465jq.m25449c(this.f22011o)) {
            HashMap hashMap = new HashMap();
            hashMap.put(TJAdUnitConstants.PARAM_PLACEMENT_MEDIATION_AGENT, this.f22011o);
            hashMap.put(TJAdUnitConstants.PARAM_PLACEMENT_MEDIATION_ID, this.f22012p);
            HashMap hashMap2 = this.f22013q;
            if (hashMap2 != null && !hashMap2.isEmpty()) {
                z = true;
            }
            if (z) {
                for (String str2 : this.f22013q.keySet()) {
                    hashMap.put(TJAdUnitConstants.AUCTION_PARAM_PREFIX + str2, this.f22013q.get(str2));
                }
                m24175a(this.f21999c.getAuctionMediationURL(), (Map) hashMap);
                return;
            }
            m24175a(this.f21999c.getMediationURL(), (Map) hashMap);
            return;
        }
        m24183d();
    }

    /* renamed from: d */
    private synchronized void m24183d() {
        String url = this.f21999c.getUrl();
        if (C9465jq.m25449c(url)) {
            url = getPlacementContentUrl();
            if (C9465jq.m25449c(url)) {
                C9314gf.m24963b("TJPlacement.requestContent").mo58197a("TJPlacement is missing APP_ID").mo58204c();
                mo57529a(TapjoyErrorMessage.ErrorType.SDK_ERROR, new TJError(0, "TJPlacement is missing APP_ID"));
                return;
            }
            this.f21999c.updateUrl(url);
        }
        String str = f21996a;
        TapjoyLog.m24273d(str, "sendContentRequest -- URL: " + url + " name: " + this.f21999c.getPlacementName());
        m24175a(url, (Map) null);
    }

    /* renamed from: a */
    private synchronized void m24175a(String str, Map map) {
        if (this.f22019w) {
            String str2 = f21996a;
            TapjoyLog.m24276i(str2, "Placement " + this.f21999c.getPlacementName() + " is already requesting content");
            C9314gf.m24963b("TJPlacement.requestContent").mo58202b("already doing").mo58204c();
            return;
        }
        this.f21999c.resetPlacementRequestData();
        C9293fw fwVar = this.f22002f;
        String str3 = null;
        fwVar.f22973b = null;
        fwVar.f22975d = null;
        fwVar.f22972a = null;
        this.f22003g.resetContentLoadState();
        this.f22019w = false;
        this.f22020x = false;
        this.f22007k = false;
        this.f22008l = false;
        this.f22005i = null;
        this.f22018v = null;
        this.f22019w = true;
        final TJPlacement a = mo57525a("REQUEST");
        if (!this.f22021y) {
            Map genericURLParams = TapjoyConnectCore.getGenericURLParams();
            this.f22015s = genericURLParams;
            genericURLParams.putAll(TapjoyConnectCore.getTimeStampAndVerifierParams());
        } else {
            Map limitedGenericURLParams = TapjoyConnectCore.getLimitedGenericURLParams();
            this.f22015s = limitedGenericURLParams;
            limitedGenericURLParams.putAll(TapjoyConnectCore.getLimitedTimeStampAndVerifierParams());
        }
        TapjoyUtil.safePut(this.f22015s, "event_name", this.f21999c.getPlacementName(), true);
        TapjoyUtil.safePut(this.f22015s, TJAdUnitConstants.PARAM_PLACEMENT_PRELOAD, "true", true);
        TapjoyUtil.safePut(this.f22015s, "debug", Boolean.toString(C9340gw.f23095a), true);
        C9344gz a2 = C9344gz.m25060a();
        Map map2 = this.f22015s;
        if (a2.f23112b != null) {
            C9367hi hiVar = a2.f23112b;
            hiVar.mo58305b();
            str3 = hiVar.f23192b.mo58486a();
        }
        TapjoyUtil.safePut(map2, TJAdUnitConstants.PARAM_ACTION_ID_EXCLUSION, str3, true);
        TapjoyUtil.safePut(this.f22015s, TJAdUnitConstants.PARAM_PLACEMENT_BY_SDK, String.valueOf(this.f22006j), true);
        TapjoyUtil.safePut(this.f22015s, TJAdUnitConstants.PARAM_PUSH_ID, a.pushId, true);
        TapjoyUtil.safePut(this.f22015s, TapjoyConstants.TJC_MEDIATION_SOURCE, this.f22009m, true);
        TapjoyUtil.safePut(this.f22015s, TapjoyConstants.TJC_ADAPTER_VERSION, this.f22010n, true);
        if (!C9465jq.m25449c(TapjoyConnectCore.getCustomParameter())) {
            TapjoyUtil.safePut(this.f22015s, TapjoyConstants.TJC_CUSTOM_PARAMETER, TapjoyConnectCore.getCustomParameter(), true);
        }
        if (map != null) {
            this.f22015s.putAll(map);
        }
        final C9271fi fiVar = new C9271fi(C9300ga.m24930b().mo58210b("placement_request_content_retry_timeout"));
        final C9320gi c = C9300ga.m24930b().mo58211c("placement_request_content_retry_backoff");
        final C9314gf.C9316a d = C9314gf.m24966d("TJPlacement.requestContent");
        final String str4 = str;
        new Thread() {
            public final void run() {
                C9314gf.m24958a("TJPlacement.requestContent", d);
                int i = 0;
                while (!m24203a()) {
                    i++;
                    TJCorePlacement.this.f22015s.put(TapjoyConstants.TJC_RETRY, Integer.toString(i));
                    if (i == 1) {
                        d.mo58199a("retry_timeout", (Object) Long.valueOf(fiVar.f22930b));
                    }
                    d.mo58198a("retry_count", (long) i);
                }
            }

            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0314 */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private boolean m24203a() {
                /*
                    r12 = this;
                    java.lang.String r0 = com.tapjoy.TJCorePlacement.f21996a
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "Sending content request for placement "
                    r1.<init>(r2)
                    com.tapjoy.TJCorePlacement r2 = com.tapjoy.TJCorePlacement.this
                    java.lang.String r2 = r2.f21999c.getPlacementName()
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    com.tapjoy.TapjoyLog.m24276i(r0, r1)
                    com.tapjoy.TJCorePlacement r0 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.internal.gz r1 = com.tapjoy.internal.C9344gz.m25060a()
                    com.tapjoy.TJCorePlacement r2 = com.tapjoy.TJCorePlacement.this
                    java.lang.String r8 = r2.f21999c.getPlacementName()
                    com.tapjoy.TJCorePlacement r2 = com.tapjoy.TJCorePlacement.this
                    android.content.Context r9 = r2.f21998b
                    com.tapjoy.internal.hh r1 = r1.f23111a
                    com.tapjoy.internal.gz r2 = r1.f23187a
                    r10 = 0
                    com.tapjoy.internal.fb r2 = r2.mo58239a((boolean) r10)
                    com.tapjoy.internal.ij r11 = new com.tapjoy.internal.ij
                    com.tapjoy.internal.gz r4 = r1.f23187a
                    com.tapjoy.internal.fa r5 = r2.f22800d
                    com.tapjoy.internal.eu r6 = r2.f22801e
                    com.tapjoy.internal.fh r7 = r2.f22802f
                    r3 = r11
                    r3.<init>(r4, r5, r6, r7, r8, r9)
                    com.tapjoy.internal.C9418ij unused = r0.f22018v = r11
                    com.tapjoy.TapjoyURLConnection r0 = new com.tapjoy.TapjoyURLConnection
                    r0.<init>()
                    java.lang.String r1 = r7
                    com.tapjoy.TJCorePlacement r2 = com.tapjoy.TJCorePlacement.this
                    java.util.Map r2 = r2.f22015s
                    r3 = 0
                    com.tapjoy.TapjoyHttpURLResponse r0 = r0.getResponseFromURL((java.lang.String) r1, (java.util.Map) r3, (java.util.Map) r3, (java.util.Map) r2)
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacementData r1 = r1.f21999c
                    int r2 = r0.statusCode
                    r1.setHttpStatusCode(r2)
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacementData r1 = r1.f21999c
                    java.lang.String r2 = r0.response
                    r1.setHttpResponse(r2)
                    java.lang.String r1 = "x-tapjoy-prerender"
                    java.lang.String r1 = r0.getHeaderFieldAsString(r1)
                    java.lang.String r2 = "0"
                    boolean r1 = r1.equals(r2)
                    r2 = 1
                    if (r1 != 0) goto L_0x0087
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacementData r1 = r1.f21999c
                    r1.setPrerenderingRequested(r2)
                L_0x0087:
                    java.lang.String r1 = "X-Tapjoy-Debug"
                    java.lang.String r1 = r0.getHeaderFieldAsString(r1)
                    if (r1 == 0) goto L_0x00a4
                    java.lang.String r3 = com.tapjoy.TJCorePlacement.f21996a
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    java.lang.String r5 = "Tapjoy-Server-Debug: "
                    r4.<init>(r5)
                    r4.append(r1)
                    java.lang.String r1 = r4.toString()
                    com.tapjoy.TapjoyLog.m24277v(r3, r1)
                L_0x00a4:
                    long r3 = r0.expires
                    r5 = 0
                    int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r1 <= 0) goto L_0x00cb
                    long r3 = r0.expires
                    long r7 = r0.date
                    int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                    if (r1 <= 0) goto L_0x00b7
                    long r7 = r0.date
                    goto L_0x00bb
                L_0x00b7:
                    long r7 = com.tapjoy.internal.C9503v.m25545b()
                L_0x00bb:
                    long r3 = r3 - r7
                    int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r1 <= 0) goto L_0x00d0
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    long r7 = android.os.SystemClock.elapsedRealtime()
                    long r7 = r7 + r3
                    long unused = r1.f22001e = r7
                    goto L_0x00d0
                L_0x00cb:
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    long unused = r1.f22001e = r5
                L_0x00d0:
                    if (r0 == 0) goto L_0x0319
                    com.tapjoy.TJPlacement r1 = r8
                    com.tapjoy.TJPlacementListener r1 = r1.getListener()
                    if (r1 == 0) goto L_0x0319
                    int r1 = r0.statusCode
                    if (r1 == 0) goto L_0x02ae
                    r3 = 200(0xc8, float:2.8E-43)
                    if (r1 == r3) goto L_0x0108
                    java.lang.String r1 = "TJPlacement.requestContent"
                    com.tapjoy.internal.gf$a r1 = com.tapjoy.internal.C9314gf.m24963b(r1)
                    java.lang.String r3 = "content_type"
                    java.lang.String r4 = "none"
                    com.tapjoy.internal.gf$a r1 = r1.mo58199a((java.lang.String) r3, (java.lang.Object) r4)
                    java.lang.String r3 = "code"
                    int r0 = r0.statusCode
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    com.tapjoy.internal.gf$a r0 = r1.mo58199a((java.lang.String) r3, (java.lang.Object) r0)
                    r0.mo58204c()
                    com.tapjoy.TJCorePlacement r0 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacement r1 = r8
                    r0.m24177b((com.tapjoy.TJPlacement) r1)
                    goto L_0x0319
                L_0x0108:
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJCorePlacement.m24191j(r1)
                    java.lang.String r1 = "Content-Type"
                    java.lang.String r1 = r0.getHeaderFieldAsString(r1)
                    boolean r3 = com.tapjoy.internal.C9465jq.m25449c(r1)
                    if (r3 != 0) goto L_0x01e9
                    java.lang.String r3 = "json"
                    boolean r1 = r1.contains(r3)
                    if (r1 == 0) goto L_0x01e9
                    java.lang.String r1 = "X-Tapjoy-Disable-Preload"
                    java.lang.String r1 = r0.getHeaderFieldAsString(r1)
                    java.lang.String r3 = "1"
                    boolean r1 = r1.equals(r3)
                    if (r1 == 0) goto L_0x019f
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this     // Catch:{ TapjoyException -> 0x015f }
                    java.lang.String r3 = r0.response     // Catch:{ TapjoyException -> 0x015f }
                    com.tapjoy.TJCorePlacement.m24174a((com.tapjoy.TJCorePlacement) r1, (java.lang.String) r3)     // Catch:{ TapjoyException -> 0x015f }
                    java.lang.String r1 = "TJPlacement.requestContent"
                    com.tapjoy.internal.gf$a r1 = com.tapjoy.internal.C9314gf.m24963b(r1)     // Catch:{ TapjoyException -> 0x015f }
                    java.lang.String r3 = "content_type"
                    java.lang.String r4 = "ad"
                    com.tapjoy.internal.gf$a r1 = r1.mo58199a((java.lang.String) r3, (java.lang.Object) r4)     // Catch:{ TapjoyException -> 0x015f }
                    r1.mo58204c()     // Catch:{ TapjoyException -> 0x015f }
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this     // Catch:{ TapjoyException -> 0x015f }
                    com.tapjoy.internal.fw r1 = r1.f22002f     // Catch:{ TapjoyException -> 0x015f }
                    com.tapjoy.TJCorePlacement r3 = com.tapjoy.TJCorePlacement.this     // Catch:{ TapjoyException -> 0x015f }
                    com.tapjoy.internal.fm r3 = r3.f22016t     // Catch:{ TapjoyException -> 0x015f }
                    r1.f22972a = r3     // Catch:{ TapjoyException -> 0x015f }
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this     // Catch:{ TapjoyException -> 0x015f }
                    com.tapjoy.TJCorePlacement.m24193l(r1)     // Catch:{ TapjoyException -> 0x015f }
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this     // Catch:{ TapjoyException -> 0x015f }
                    r1.m24185e()     // Catch:{ TapjoyException -> 0x015f }
                    goto L_0x0319
                L_0x015f:
                    r1 = move-exception
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r1 = r1.getMessage()
                    r3.append(r1)
                    java.lang.String r1 = " for placement "
                    r3.append(r1)
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    java.lang.String r1 = r1.f21999c.getPlacementName()
                    r3.append(r1)
                    java.lang.String r1 = r3.toString()
                    java.lang.String r3 = "TJPlacement.requestContent"
                    com.tapjoy.internal.gf$a r3 = com.tapjoy.internal.C9314gf.m24963b(r3)
                    java.lang.String r4 = "server error"
                    com.tapjoy.internal.gf$a r3 = r3.mo58197a((java.lang.String) r4)
                    r3.mo58204c()
                    com.tapjoy.TJCorePlacement r3 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacement r4 = r8
                    com.tapjoy.TapjoyErrorMessage$ErrorType r5 = com.tapjoy.TapjoyErrorMessage.ErrorType.SERVER_ERROR
                    com.tapjoy.TJError r6 = new com.tapjoy.TJError
                    int r0 = r0.statusCode
                    r6.<init>(r0, r1)
                    r3.mo57528a(r4, r5, r6)
                    goto L_0x0319
                L_0x019f:
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    java.lang.String r3 = r0.response
                    boolean r1 = r1.m24180b((java.lang.String) r3)
                    if (r1 == 0) goto L_0x01c6
                    java.lang.String r0 = "TJPlacement.requestContent"
                    com.tapjoy.internal.gf$a r0 = com.tapjoy.internal.C9314gf.m24963b(r0)
                    java.lang.String r1 = "content_type"
                    java.lang.String r3 = "mm"
                    com.tapjoy.internal.gf$a r0 = r0.mo58199a((java.lang.String) r1, (java.lang.Object) r3)
                    r0.mo58204c()
                    com.tapjoy.TJCorePlacement r0 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJCorePlacement.m24193l(r0)
                    com.tapjoy.TJCorePlacement r0 = com.tapjoy.TJCorePlacement.this
                    r0.m24185e()
                    goto L_0x0319
                L_0x01c6:
                    java.lang.String r1 = "TJPlacement.requestContent"
                    com.tapjoy.internal.gf$a r1 = com.tapjoy.internal.C9314gf.m24963b(r1)
                    java.lang.String r3 = "asset error"
                    com.tapjoy.internal.gf$a r1 = r1.mo58197a((java.lang.String) r3)
                    r1.mo58204c()
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacement r3 = r8
                    com.tapjoy.TapjoyErrorMessage$ErrorType r4 = com.tapjoy.TapjoyErrorMessage.ErrorType.SERVER_ERROR
                    com.tapjoy.TJError r5 = new com.tapjoy.TJError
                    int r6 = r0.statusCode
                    java.lang.String r0 = r0.response
                    r5.<init>(r6, r0)
                    r1.mo57528a(r3, r4, r5)
                    goto L_0x0319
                L_0x01e9:
                    java.lang.String r1 = "TJPlacement.requestContent"
                    com.tapjoy.internal.gf$a r1 = com.tapjoy.internal.C9314gf.m24963b(r1)
                    java.lang.String r3 = "content_type"
                    java.lang.String r4 = "ad"
                    com.tapjoy.internal.gf$a r1 = r1.mo58199a((java.lang.String) r3, (java.lang.Object) r4)
                    r1.mo58204c()
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.internal.fw r1 = r1.f22002f
                    com.tapjoy.TJCorePlacement r3 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.internal.fm r3 = r3.f22016t
                    r1.f22972a = r3
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJCorePlacement.m24193l(r1)
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJCorePlacement$3$1 r3 = new com.tapjoy.TJCorePlacement$3$1
                    r3.<init>()
                    java.lang.String r4 = com.tapjoy.TJCorePlacement.f21996a
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    java.lang.String r6 = "Checking if there is content to cache for placement "
                    r5.<init>(r6)
                    com.tapjoy.TJPlacementData r6 = r1.f21999c
                    java.lang.String r6 = r6.getPlacementName()
                    r5.append(r6)
                    java.lang.String r5 = r5.toString()
                    com.tapjoy.TapjoyLog.m24276i(r4, r5)
                    java.lang.String r4 = "x-tapjoy-cacheable-assets"
                    java.lang.String r0 = r0.getHeaderFieldAsString(r4)
                    r4 = 2
                    boolean r5 = com.tapjoy.TJPlacementManager.canCachePlacement()     // Catch:{ Exception -> 0x0292 }
                    if (r5 != 0) goto L_0x0256
                    java.lang.String r0 = com.tapjoy.TJCorePlacement.f21996a     // Catch:{ Exception -> 0x0292 }
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0292 }
                    java.lang.String r6 = "Placement caching limit reached. No content will be cached for placement "
                    r5.<init>(r6)     // Catch:{ Exception -> 0x0292 }
                    com.tapjoy.TJPlacementData r1 = r1.f21999c     // Catch:{ Exception -> 0x0292 }
                    java.lang.String r1 = r1.getPlacementName()     // Catch:{ Exception -> 0x0292 }
                    r5.append(r1)     // Catch:{ Exception -> 0x0292 }
                    java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x0292 }
                    com.tapjoy.TapjoyLog.m24276i(r0, r1)     // Catch:{ Exception -> 0x0292 }
                    r3.onCachingComplete(r4)     // Catch:{ Exception -> 0x0292 }
                    goto L_0x0319
                L_0x0256:
                    org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ Exception -> 0x0292 }
                    r5.<init>(r0)     // Catch:{ Exception -> 0x0292 }
                    int r0 = r5.length()     // Catch:{ Exception -> 0x0292 }
                    if (r0 <= 0) goto L_0x028d
                    java.lang.String r0 = com.tapjoy.TJCorePlacement.f21996a     // Catch:{ Exception -> 0x0292 }
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0292 }
                    java.lang.String r7 = "Begin caching content for placement "
                    r6.<init>(r7)     // Catch:{ Exception -> 0x0292 }
                    com.tapjoy.TJPlacementData r7 = r1.f21999c     // Catch:{ Exception -> 0x0292 }
                    java.lang.String r7 = r7.getPlacementName()     // Catch:{ Exception -> 0x0292 }
                    r6.append(r7)     // Catch:{ Exception -> 0x0292 }
                    java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0292 }
                    com.tapjoy.TapjoyLog.m24276i(r0, r6)     // Catch:{ Exception -> 0x0292 }
                    com.tapjoy.TJPlacementManager.incrementPlacementCacheCount()     // Catch:{ Exception -> 0x0292 }
                    r1.f22004h = r2     // Catch:{ Exception -> 0x0292 }
                    com.tapjoy.TapjoyCache r0 = com.tapjoy.TapjoyCache.getInstance()     // Catch:{ Exception -> 0x0292 }
                    com.tapjoy.TJCorePlacement$6 r6 = new com.tapjoy.TJCorePlacement$6     // Catch:{ Exception -> 0x0292 }
                    r6.<init>(r3)     // Catch:{ Exception -> 0x0292 }
                    r0.cacheAssetGroup(r5, r6)     // Catch:{ Exception -> 0x0292 }
                    goto L_0x0319
                L_0x028d:
                    r3.onCachingComplete(r2)     // Catch:{ Exception -> 0x0292 }
                    goto L_0x0319
                L_0x0292:
                    r0 = move-exception
                    r3.onCachingComplete(r4)
                    java.lang.String r1 = com.tapjoy.TJCorePlacement.f21996a
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    java.lang.String r4 = "Error while handling placement cache: "
                    r3.<init>(r4)
                    java.lang.String r0 = r0.getMessage()
                    r3.append(r0)
                    java.lang.String r0 = r3.toString()
                    com.tapjoy.TapjoyLog.m24273d(r1, r0)
                    goto L_0x0319
                L_0x02ae:
                    com.tapjoy.internal.fi r1 = r6
                    com.tapjoy.internal.gi r3 = r9
                    long r3 = r3.f23062e
                    boolean r1 = r1.mo58126a(r3)
                    if (r1 == 0) goto L_0x02ea
                    java.lang.String r1 = "TJPlacement.requestContent"
                    com.tapjoy.internal.gf$a r1 = com.tapjoy.internal.C9314gf.m24963b(r1)
                    java.lang.String r3 = "network error"
                    com.tapjoy.internal.gf$a r1 = r1.mo58197a((java.lang.String) r3)
                    java.lang.String r3 = "retry_timeout"
                    com.tapjoy.internal.fi r4 = r6
                    long r4 = r4.f22930b
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    com.tapjoy.internal.gf$a r1 = r1.mo58199a((java.lang.String) r3, (java.lang.Object) r4)
                    r1.mo58204c()
                    com.tapjoy.TJCorePlacement r1 = com.tapjoy.TJCorePlacement.this
                    com.tapjoy.TJPlacement r3 = r8
                    com.tapjoy.TapjoyErrorMessage$ErrorType r4 = com.tapjoy.TapjoyErrorMessage.ErrorType.NETWORK_ERROR
                    com.tapjoy.TJError r5 = new com.tapjoy.TJError
                    int r6 = r0.statusCode
                    java.lang.String r0 = r0.response
                    r5.<init>(r6, r0)
                    r1.mo57528a(r3, r4, r5)
                    goto L_0x0319
                L_0x02ea:
                    com.tapjoy.internal.gi r0 = r9
                    long r1 = r0.f23062e
                    long r3 = r0.f23062e
                    double r3 = (double) r3
                    double r7 = r0.f23061d
                    double r3 = r3 * r7
                    long r3 = (long) r3
                    long r7 = r0.f23059b
                    int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                    if (r9 >= 0) goto L_0x02ff
                    long r3 = r0.f23059b
                    goto L_0x0307
                L_0x02ff:
                    long r7 = r0.f23060c
                    int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                    if (r9 <= 0) goto L_0x0307
                    long r3 = r0.f23060c
                L_0x0307:
                    r0.f23062e = r3
                    int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                    if (r3 <= 0) goto L_0x0318
                    monitor-enter(r0)
                    r0.wait(r1)     // Catch:{ InterruptedException -> 0x0314 }
                    goto L_0x0314
                L_0x0312:
                    r1 = move-exception
                    goto L_0x0316
                L_0x0314:
                    monitor-exit(r0)     // Catch:{ all -> 0x0312 }
                    goto L_0x0318
                L_0x0316:
                    monitor-exit(r0)     // Catch:{ all -> 0x0312 }
                    throw r1
                L_0x0318:
                    return r10
                L_0x0319:
                    com.tapjoy.TJCorePlacement r0 = com.tapjoy.TJCorePlacement.this
                    boolean unused = r0.f22019w = false
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TJCorePlacement.C90193.m24203a():boolean");
            }
        }.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m24180b(String str) {
        try {
            C9418ij.C9419a aVar = (C9418ij.C9419a) this.f22018v.mo57899a(URI.create(this.f21999c.getUrl()), new ByteArrayInputStream(str.getBytes()));
            this.f22005i = aVar.f23400a;
            aVar.f23400a.mo58224b();
            if (!aVar.f23400a.mo58225c()) {
                TapjoyLog.m24275e(f21996a, "Failed to load fiverocks placement");
                return false;
            }
            C9285fq fqVar = null;
            if (this.f22005i instanceof C9359he) {
                fqVar = new C9291fu(this.f21999c.getPlacementName(), this.f21999c.getPlacementType(), this.f22016t);
            } else if (this.f22005i instanceof C9336gv) {
                fqVar = new C9292fv(this.f21999c.getPlacementName(), this.f21999c.getPlacementType(), this.f22016t);
            }
            this.f22002f.f22972a = fqVar;
            return true;
        } catch (IOException e) {
            TapjoyLog.m24275e(f21996a, e.toString());
            e.printStackTrace();
            return false;
        } catch (C9121cb e2) {
            TapjoyLog.m24275e(f21996a, e2.toString());
            e2.printStackTrace();
            return false;
        }
    }

    public Context getContext() {
        return this.f21998b;
    }

    public void setContext(Context context) {
        this.f21998b = context;
    }

    public TJAdUnit getAdUnit() {
        return this.f22003g;
    }

    public TJPlacementData getPlacementData() {
        return this.f21999c;
    }

    public boolean isContentReady() {
        return this.f22008l;
    }

    public boolean isContentAvailable() {
        return this.f22007k;
    }

    public String getPlacementContentUrl() {
        String b = mo57531b();
        if (!C9465jq.m25449c(b)) {
            return TapjoyConnectCore.getPlacementURL() + "v1/apps/" + b + "/content?";
        }
        TapjoyLog.m24276i(f21996a, "Placement content URL cannot be generated for null app ID");
        return "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo57526a() {
        if (this.f22005i != null) {
            return "mm";
        }
        return this.f22007k ? "ad" : "none";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo57530a(String str, TJPlacement tJPlacement) {
        synchronized (this.f22014r) {
            this.f22014r.put(str, tJPlacement);
            if (tJPlacement != null) {
                String str2 = f21996a;
                TapjoyLog.m24273d(str2, "Setting " + str + " placement: " + tJPlacement.getGUID());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final TJPlacement mo57525a(String str) {
        TJPlacement tJPlacement;
        synchronized (this.f22014r) {
            tJPlacement = (TJPlacement) this.f22014r.get(str);
            if (tJPlacement != null) {
                String str2 = f21996a;
                TapjoyLog.m24273d(str2, "Returning " + str + " placement: " + tJPlacement.getGUID());
            }
        }
        return tJPlacement;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m24177b(TJPlacement tJPlacement) {
        C9293fw fwVar = this.f22002f;
        String placementName = this.f21999c.getPlacementName();
        String placementType = this.f21999c.getPlacementType();
        String a = mo57526a();
        fwVar.f22974c = 0;
        fwVar.f22973b = C9314gf.m24967e("PlacementContent.funnel").mo58196a().mo58199a("placement", (Object) placementName).mo58199a("placement_type", (Object) placementType).mo58199a(FirebaseAnalytics.Param.CONTENT_TYPE, (Object) a).mo58199a("state", (Object) Integer.valueOf(fwVar.f22974c));
        fwVar.f22973b.mo58204c();
        if (!"none".equals(a)) {
            fwVar.f22976e = C9314gf.m24967e("PlacementContent.ready").mo58196a().mo58199a("placement", (Object) placementName).mo58199a("placement_type", (Object) placementType).mo58199a(FirebaseAnalytics.Param.CONTENT_TYPE, (Object) a);
        }
        if (tJPlacement != null && tJPlacement.getListener() != null) {
            String str = f21996a;
            TapjoyLog.m24276i(str, "Content request delivered successfully for placement " + this.f21999c.getPlacementName() + ", contentAvailable: " + isContentAvailable() + ", mediationAgent: " + this.f22011o);
            tJPlacement.getListener().onRequestSuccess(tJPlacement);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo57529a(TapjoyErrorMessage.ErrorType errorType, TJError tJError) {
        mo57528a(mo57525a("REQUEST"), errorType, tJError);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo57528a(TJPlacement tJPlacement, TapjoyErrorMessage.ErrorType errorType, TJError tJError) {
        String str = f21996a;
        TapjoyLog.m24274e(str, new TapjoyErrorMessage(errorType, "Content request failed for placement " + this.f21999c.getPlacementName() + "; Reason= " + tJError.message));
        if (tJPlacement != null && tJPlacement.getListener() != null) {
            tJPlacement.getListener().onRequestFailure(tJPlacement, tJError);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m24185e() {
        if (!this.f22020x) {
            this.f22008l = true;
            String str = f21996a;
            TapjoyLog.m24276i(str, "Content is ready for placement " + this.f21999c.getPlacementName());
            if (this.f22003g.isPrerendered()) {
                C9293fw fwVar = this.f22002f;
                C9314gf.C9316a aVar = fwVar.f22973b;
                if (aVar != null) {
                    aVar.mo58199a("prerendered", (Object) true);
                }
                C9314gf.C9316a aVar2 = fwVar.f22976e;
                if (aVar2 != null) {
                    aVar2.mo58199a("prerendered", (Object) true);
                }
            }
            C9293fw fwVar2 = this.f22002f;
            C9314gf.C9316a aVar3 = fwVar2.f22976e;
            if (aVar3 != null) {
                fwVar2.f22976e = null;
                aVar3.mo58201b().mo58204c();
            }
            TJPlacement a = mo57525a("REQUEST");
            if (a != null && a.getListener() != null) {
                a.getListener().onContentReady(a);
                this.f22020x = true;
            }
        }
    }

    public boolean isLimited() {
        return this.f22021y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo57531b() {
        if (!this.f22021y) {
            return TapjoyConnectCore.getAppID();
        }
        return TapjoyConnectCore.getLimitedAppID();
    }

    /* renamed from: e */
    static /* synthetic */ void m24186e(TJCorePlacement tJCorePlacement) {
        TJPlacement a = tJCorePlacement.mo57525a("SHOW");
        String str = f21996a;
        TapjoyLog.m24276i(str, "Handle onClick for placement " + tJCorePlacement.f21999c.getPlacementName());
        if (a != null && a.getListener() != null) {
            a.getListener().onClick(a);
        }
    }

    /* renamed from: j */
    static /* synthetic */ void m24191j(TJCorePlacement tJCorePlacement) {
        C9277fm fmVar = new C9277fm(tJCorePlacement.f21999c.getPlacementName(), tJCorePlacement.f21999c.getPlacementType());
        tJCorePlacement.f22016t = fmVar;
        tJCorePlacement.f22003g.setAdContentTracker(fmVar);
    }

    /* renamed from: a */
    static /* synthetic */ void m24174a(TJCorePlacement tJCorePlacement, String str) {
        if (str != null) {
            try {
                String str2 = f21996a;
                TapjoyLog.m24273d(str2, "Disable preload flag is set for placement " + tJCorePlacement.f21999c.getPlacementName());
                tJCorePlacement.f21999c.setRedirectURL(new JSONObject(str).getString(TapjoyConstants.TJC_REDIRECT_URL));
                tJCorePlacement.f21999c.setPreloadDisabled(true);
                tJCorePlacement.f21999c.setHasProgressSpinner(true);
                String str3 = f21996a;
                TapjoyLog.m24273d(str3, "redirect_url:" + tJCorePlacement.f21999c.getRedirectURL());
            } catch (JSONException unused) {
                throw new TapjoyException("TJPlacement request failed, malformed server response");
            }
        } else {
            throw new TapjoyException("TJPlacement request failed due to null response");
        }
    }

    /* renamed from: l */
    static /* synthetic */ void m24193l(TJCorePlacement tJCorePlacement) {
        tJCorePlacement.f22007k = true;
        tJCorePlacement.m24177b(tJCorePlacement.mo57525a("REQUEST"));
    }
}
