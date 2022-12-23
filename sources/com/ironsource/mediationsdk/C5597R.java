package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.security.CertificateUtil;
import com.ironsource.environment.C5505a;
import com.ironsource.environment.C5531j;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.mediationsdk.C5697h;
import com.ironsource.mediationsdk.C5807v;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C5734q;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p137a.C5641c;
import com.ironsource.mediationsdk.p137a.C5645g;
import com.ironsource.mediationsdk.server.C5782b;
import com.ironsource.mediationsdk.utils.C5789b;
import com.ironsource.mediationsdk.utils.C5790c;
import com.ironsource.mediationsdk.utils.C5802l;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.R */
final class C5597R extends C5716m implements C5531j, C5602S, C5648aa, C5694f, C5811x, C5812y {

    /* renamed from: A */
    private String f13123A = "";

    /* renamed from: B */
    private boolean f13124B = false;

    /* renamed from: C */
    private NetworkStateReceiver f13125C;

    /* renamed from: a */
    final ConcurrentHashMap<String, C5603T> f13126a;

    /* renamed from: b */
    C5802l f13127b;

    /* renamed from: c */
    C5695g f13128c;

    /* renamed from: d */
    C5697h f13129d;

    /* renamed from: e */
    String f13130e;

    /* renamed from: f */
    JSONObject f13131f;

    /* renamed from: g */
    int f13132g = 1;

    /* renamed from: h */
    long f13133h;

    /* renamed from: i */
    private CopyOnWriteArrayList<C5603T> f13134i;

    /* renamed from: j */
    private List<C5782b> f13135j;

    /* renamed from: k */
    private ConcurrentHashMap<String, C5782b> f13136k;

    /* renamed from: l */
    private ConcurrentHashMap<String, C5697h.C5698a> f13137l;

    /* renamed from: m */
    private C5782b f13138m;

    /* renamed from: n */
    private C5628Z f13139n;

    /* renamed from: o */
    private boolean f13140o;

    /* renamed from: p */
    private boolean f13141p;

    /* renamed from: q */
    private boolean f13142q;

    /* renamed from: r */
    private String f13143r;

    /* renamed from: s */
    private long f13144s;

    /* renamed from: t */
    private long f13145t;

    /* renamed from: u */
    private int f13146u;

    /* renamed from: v */
    private boolean f13147v;

    /* renamed from: w */
    private boolean f13148w;

    /* renamed from: x */
    private Boolean f13149x;

    /* renamed from: y */
    private C5601a f13150y;

    /* renamed from: z */
    private int f13151z;

    /* renamed from: com.ironsource.mediationsdk.R$a */
    enum C5601a {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5597R(List<NetworkSettings> list, C5734q qVar, String str, String str2, HashSet<ImpressionDataListener> hashSet) {
        super(hashSet);
        C5734q qVar2 = qVar;
        long time = new Date().getTime();
        mo41575a((int) IronSourceConstants.RV_MANAGER_INIT_STARTED);
        mo41577a(C5597R.C5601a.RV_STATE_INITIATING);
        this.f13149x = null;
        this.f13146u = qVar2.f13793c;
        this.f13147v = qVar2.f13794d;
        this.f13143r = "";
        C5789b bVar = qVar2.f13801k;
        this.f13148w = false;
        this.f13134i = new CopyOnWriteArrayList<>();
        this.f13135j = new ArrayList();
        this.f13136k = new ConcurrentHashMap<>();
        this.f13137l = new ConcurrentHashMap<>();
        this.f13145t = new Date().getTime();
        this.f13140o = bVar.f13917e > 0;
        this.f13141p = bVar.f13925m;
        this.f13142q = !bVar.f13926n;
        this.f13144s = bVar.f13924l;
        if (this.f13140o) {
            this.f13128c = new C5695g("rewardedVideo", bVar, this);
        }
        this.f13139n = new C5628Z(bVar, this);
        this.f13126a = new ConcurrentHashMap<>();
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : list) {
            AbstractAdapter a = C5685c.m13965a().mo41824a(next, next.getRewardedVideoSettings(), false, false);
            if (a != null) {
                C5689d a2 = C5689d.m13994a();
                if (a2.mo41843a(a, a2.f13544b, "rewarded video")) {
                    C5603T t = r0;
                    C5603T t2 = new C5603T(str, str2, next, this, qVar2.f13795e, a);
                    String k = t.mo41606k();
                    this.f13126a.put(k, t);
                    arrayList.add(k);
                }
            }
        }
        this.f13129d = new C5697h(arrayList, bVar.f13918f);
        this.f13127b = new C5802l(new ArrayList(this.f13126a.values()));
        for (C5603T next2 : this.f13126a.values()) {
            if (next2.mo41603h()) {
                next2.mo41597b();
            }
        }
        mo41576a((int) IronSourceConstants.RV_MANAGER_INIT_ENDED, C5505a.C55061.m13073a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}}));
        C5807v.C5809a.f14128a.mo42140a(this, qVar2.f13799i);
        m13578a(bVar.f13921i);
    }

    /* renamed from: a */
    private String m13576a(C5782b bVar) {
        C5603T t = this.f13126a.get(bVar.mo42082a());
        String num = t != null ? Integer.toString(t.mo41604i()) : TextUtils.isEmpty(bVar.mo42083b()) ? "1" : "2";
        return num + bVar.mo42082a();
    }

    /* renamed from: a */
    private void m13577a(int i, Map<String, Object> map, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (z2 && !TextUtils.isEmpty(this.f13130e)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f13130e);
        }
        JSONObject jSONObject = this.f13131f;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f13131f);
        }
        if (z && !TextUtils.isEmpty(this.f13143r)) {
            hashMap.put("placement", this.f13143r);
        }
        if (m13589c(i)) {
            C5645g.m13810e();
            C5645g.m13758a((Map<String, Object>) hashMap, this.f13151z, this.f13123A);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f13132g));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    hashMap.putAll(map);
                }
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "ProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C5645g.m13810e().mo41689b(new C5641c(i, new JSONObject(hashMap)));
    }

    /* renamed from: a */
    private void m13578a(long j) {
        if (this.f13127b.mo42132a()) {
            mo41582b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80001}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "all smashes are capped"}}));
            mo41589e();
        } else if (this.f13140o) {
            if (!this.f13137l.isEmpty()) {
                this.f13129d.mo41855a(this.f13137l);
                this.f13137l.clear();
            }
            new Timer().schedule(new TimerTask() {
                public final void run() {
                    C5597R r = C5597R.this;
                    r.mo41577a(C5597R.C5601a.RV_STATE_AUCTION_IN_PROGRESS);
                    AsyncTask.execute(new Runnable() {
                        public final void run() {
                            StringBuilder sb;
                            C5597R.m13579a("makeAuction()");
                            C5597R.this.f13130e = "";
                            C5597R.this.f13131f = null;
                            C5597R.this.f13133h = new Date().getTime();
                            HashMap hashMap = new HashMap();
                            ArrayList arrayList = new ArrayList();
                            StringBuilder sb2 = new StringBuilder();
                            for (C5603T next : C5597R.this.f13126a.values()) {
                                if (next.mo41603h()) {
                                    next.f13166b = false;
                                }
                                if (!C5597R.this.f13127b.mo42133b(next)) {
                                    if (next.mo41603h()) {
                                        Map<String, Object> a = next.mo41420a();
                                        if (a != null) {
                                            hashMap.put(next.mo41606k(), a);
                                            sb = new StringBuilder();
                                        }
                                    } else {
                                        arrayList.add(next.mo41606k());
                                        sb = new StringBuilder();
                                    }
                                    sb.append(next.mo41604i());
                                    sb.append(next.mo41606k());
                                    sb.append(",");
                                    sb2.append(sb.toString());
                                }
                            }
                            if (hashMap.keySet().size() == 0 && arrayList.size() == 0) {
                                C5597R.this.mo41582b((int) IronSourceConstants.RV_AUCTION_FAILED, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}}));
                                C5597R.m13579a("makeAuction() failed - No candidates available for auctioning");
                                C5597R.this.mo41589e();
                                return;
                            }
                            C5597R.m13579a("makeAuction() - request waterfall is: " + sb2);
                            C5597R.this.mo41575a(1000);
                            C5597R.this.mo41575a((int) IronSourceConstants.RV_AUCTION_REQUEST);
                            C5597R.this.mo41576a((int) IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}));
                            C5597R.this.f13128c.mo41850a(ContextProvider.getInstance().getApplicationContext(), (Map<String, Object>) hashMap, (List<String>) arrayList, C5597R.this.f13129d, C5597R.this.f13132g);
                        }
                    });
                }
            }, j);
        } else {
            IronLog.INTERNAL.info("auction is disabled, fallback flow will occur");
            m13591f();
            if (this.f13135j.isEmpty()) {
                mo41582b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80002}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
                mo41589e();
                return;
            }
            mo41575a(1000);
            if (!this.f13142q || !this.f13148w) {
                mo41587d();
            }
        }
    }

    /* renamed from: a */
    static void m13579a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager: " + str, 0);
    }

    /* renamed from: a */
    private void m13580a(List<C5782b> list) {
        this.f13135j = list;
        StringBuilder sb = new StringBuilder();
        for (C5782b a : list) {
            sb.append(m13576a(a) + ",");
        }
        m13579a("updateNextWaterfallToLoad() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            m13579a("Updated waterfall is empty");
        }
        mo41582b((int) IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}}));
    }

    /* renamed from: a */
    private void m13581a(boolean z, Map<String, Object> map) {
        Boolean bool = this.f13149x;
        if (bool == null || bool.booleanValue() != z) {
            this.f13149x = Boolean.valueOf(z);
            long time = new Date().getTime() - this.f13145t;
            this.f13145t = new Date().getTime();
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("duration", Long.valueOf(time));
            mo41582b(z ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, map);
            C5615W.m13672a().mo41624a(z);
        }
    }

    /* renamed from: b */
    private void m13582b(int i) {
        m13577a(i, new HashMap(), true, true);
    }

    /* renamed from: b */
    private static void m13583b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager: " + str, 3);
    }

    /* renamed from: b */
    private void m13584b(List<C5782b> list) {
        this.f13134i.clear();
        this.f13136k.clear();
        this.f13137l.clear();
        for (C5782b next : list) {
            C5603T t = this.f13126a.get(next.mo42082a());
            if (t != null) {
                t.f13194e = true;
                this.f13134i.add(t);
                this.f13136k.put(t.mo41606k(), next);
                this.f13137l.put(next.mo42082a(), C5697h.C5698a.ISAuctionPerformanceDidntAttemptToLoad);
            } else {
                m13579a("updateWaterfall() - could not find matching smash for auction response item " + next.mo42082a());
            }
        }
        this.f13135j.clear();
    }

    /* renamed from: b */
    private void m13585b(boolean z) {
        m13581a(z, (Map<String, Object>) new HashMap());
    }

    /* renamed from: c */
    private void m13586c(int i, Map<String, Object> map) {
        m13577a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, map, true, true);
    }

    /* renamed from: c */
    private static void m13587c(C5603T t, String str) {
        String str2 = t.mo41606k() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvManager: " + str2, 0);
    }

    /* renamed from: c */
    private static void m13588c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    /* renamed from: c */
    private static boolean m13589c(int i) {
        return i == 1003 || i == 1302 || i == 1301;
    }

    /* renamed from: e */
    private void m13590e(C5603T t) {
        String b = this.f13136k.get(t.mo41606k()).mo42083b();
        C5690e.m13999a();
        C5603T t2 = t;
        t2.mo41595a(b, this.f13130e, this.f13131f, this.f13151z, this.f13123A, this.f13132g, C5690e.m14011d(b));
    }

    /* renamed from: f */
    private void m13591f() {
        this.f13130e = m14099b();
        m13580a(m13592g());
    }

    /* renamed from: g */
    private List<C5782b> m13592g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (C5603T next : this.f13126a.values()) {
            if (!next.mo41603h() && !this.f13127b.mo42133b(next)) {
                copyOnWriteArrayList.add(new C5782b(next.mo41606k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: h */
    private void m13593h() {
        if (this.f13134i.isEmpty()) {
            mo41582b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            mo41589e();
            return;
        }
        mo41577a(C5597R.C5601a.RV_STATE_LOADING_SMASHES);
        int i = 0;
        for (int i2 = 0; i2 < this.f13134i.size() && i < this.f13146u; i2++) {
            C5603T t = this.f13134i.get(i2);
            if (t.f13194e) {
                if (!this.f13147v || !t.mo41603h()) {
                    m13590e(t);
                    i++;
                } else if (i == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + t.mo41606k() + ". No other instances will be loaded at the same time.";
                    m13579a(str);
                    IronSourceUtils.sendAutomationLog(str);
                    m13590e(t);
                    return;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + t.mo41606k() + " as a non bidder is being loaded";
                    m13579a(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41575a(int i) {
        m13577a(i, new HashMap(), false, false);
    }

    /* renamed from: a */
    public final void mo41398a(int i, String str, int i2, String str2, long j) {
        Map<String, Object> map;
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        m13579a(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.f13151z = i2;
        this.f13123A = str2;
        this.f13131f = null;
        m13591f();
        if (TextUtils.isEmpty(str)) {
            map = C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"duration", Long.valueOf(j)}});
        } else {
            map = C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{"duration", Long.valueOf(j)}});
        }
        mo41582b((int) IronSourceConstants.RV_AUCTION_FAILED, map);
        if (!this.f13142q || !this.f13148w) {
            mo41587d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41576a(int i, Map<String, Object> map) {
        m13577a(i, map, false, false);
    }

    /* renamed from: a */
    public final void mo41400a(Context context, boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgRvManager Should Track Network State: " + z, 0);
        try {
            this.f13124B = z;
            if (z) {
                if (this.f13125C == null) {
                    this.f13125C = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f13125C, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f13125C != null) {
                context.getApplicationContext().unregisterReceiver(this.f13125C);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41577a(C5601a aVar) {
        m13579a("current state=" + this.f13150y + ", new state=" + aVar);
        this.f13150y = aVar;
    }

    /* renamed from: a */
    public final void mo41578a(C5603T t) {
        synchronized (this) {
            this.f13132g++;
            m13587c(t, "onRewardedVideoAdOpened");
            C5615W.m13672a().mo41625b();
            if (this.f13140o) {
                C5782b bVar = this.f13136k.get(t.mo41606k());
                if (bVar != null) {
                    C5695g.m14021a(bVar, t.mo41604i(), this.f13138m, this.f13143r);
                    this.f13137l.put(t.mo41606k(), C5697h.C5698a.ISAuctionPerformanceShowedSuccessfully);
                    mo41914a(bVar, this.f13143r);
                } else {
                    String k = t.mo41606k();
                    m13583b("onRewardedVideoAdOpened showing instance " + k + " missing from waterfall");
                    mo41582b((int) IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.f13150y}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}}));
                }
            }
            this.f13139n.mo41659a();
        }
    }

    /* renamed from: a */
    public final void mo41579a(C5603T t, Placement placement) {
        m13587c(t, "onRewardedVideoAdRewarded");
        C5615W.m13672a().mo41622a(placement);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0142, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41580a(com.ironsource.mediationsdk.C5603T r12, java.lang.String r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.lang.String r0 = "onLoadSuccess "
            m13587c((com.ironsource.mediationsdk.C5603T) r12, (java.lang.String) r0)     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = r11.f13130e     // Catch:{ all -> 0x0143 }
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = r11.f13130e     // Catch:{ all -> 0x0143 }
            boolean r0 = r13.equalsIgnoreCase(r0)     // Catch:{ all -> 0x0143 }
            if (r0 != 0) goto L_0x0062
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0143 }
            java.lang.String r4 = "onLoadSuccess was invoked with auctionId: "
            r0.<init>(r4)     // Catch:{ all -> 0x0143 }
            r0.append(r13)     // Catch:{ all -> 0x0143 }
            java.lang.String r13 = " and the current id is "
            r0.append(r13)     // Catch:{ all -> 0x0143 }
            java.lang.String r13 = r11.f13130e     // Catch:{ all -> 0x0143 }
            r0.append(r13)     // Catch:{ all -> 0x0143 }
            java.lang.String r13 = r0.toString()     // Catch:{ all -> 0x0143 }
            m13579a((java.lang.String) r13)     // Catch:{ all -> 0x0143 }
            r13 = 81315(0x13da3, float:1.13947E-40)
            java.lang.Object[][] r0 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0143 }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0143 }
            java.lang.String r5 = "errorCode"
            r4[r1] = r5     // Catch:{ all -> 0x0143 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0143 }
            r4[r3] = r5     // Catch:{ all -> 0x0143 }
            r0[r1] = r4     // Catch:{ all -> 0x0143 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0143 }
            java.lang.String r4 = "reason"
            r2[r1] = r4     // Catch:{ all -> 0x0143 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0143 }
            java.lang.String r4 = "onLoadSuccess wrong auction ID "
            r1.<init>(r4)     // Catch:{ all -> 0x0143 }
            com.ironsource.mediationsdk.R$a r4 = r11.f13150y     // Catch:{ all -> 0x0143 }
            r1.append(r4)     // Catch:{ all -> 0x0143 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0143 }
            r2[r3] = r1     // Catch:{ all -> 0x0143 }
            r0[r3] = r2     // Catch:{ all -> 0x0143 }
            r12.mo41598b(r13, r0)     // Catch:{ all -> 0x0143 }
            monitor-exit(r11)
            return
        L_0x0062:
            com.ironsource.mediationsdk.R$a r0 = r11.f13150y     // Catch:{ all -> 0x0143 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.h$a> r4 = r11.f13137l     // Catch:{ all -> 0x0143 }
            java.lang.String r5 = r12.mo41606k()     // Catch:{ all -> 0x0143 }
            com.ironsource.mediationsdk.h$a r6 = com.ironsource.mediationsdk.C5697h.C5698a.ISAuctionPerformanceLoadedSuccessfully     // Catch:{ all -> 0x0143 }
            r4.put(r5, r6)     // Catch:{ all -> 0x0143 }
            com.ironsource.mediationsdk.R$a r4 = r11.f13150y     // Catch:{ all -> 0x0143 }
            com.ironsource.mediationsdk.R$a r5 = com.ironsource.mediationsdk.C5597R.C5601a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0143 }
            if (r4 != r5) goto L_0x0141
            r11.m13585b((boolean) r3)     // Catch:{ all -> 0x0143 }
            com.ironsource.mediationsdk.R$a r4 = com.ironsource.mediationsdk.C5597R.C5601a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0143 }
            r11.mo41577a((com.ironsource.mediationsdk.C5597R.C5601a) r4)     // Catch:{ all -> 0x0143 }
            java.util.Date r4 = new java.util.Date     // Catch:{ all -> 0x0143 }
            r4.<init>()     // Catch:{ all -> 0x0143 }
            long r4 = r4.getTime()     // Catch:{ all -> 0x0143 }
            long r6 = r11.f13133h     // Catch:{ all -> 0x0143 }
            long r4 = r4 - r6
            r6 = 1003(0x3eb, float:1.406E-42)
            java.lang.Object[][] r7 = new java.lang.Object[r3][]     // Catch:{ all -> 0x0143 }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x0143 }
            java.lang.String r9 = "duration"
            r8[r1] = r9     // Catch:{ all -> 0x0143 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0143 }
            r8[r3] = r4     // Catch:{ all -> 0x0143 }
            r7[r1] = r8     // Catch:{ all -> 0x0143 }
            java.util.Map r4 = com.ironsource.environment.C5505a.C55061.m13073a((java.lang.Object[][]) r7)     // Catch:{ all -> 0x0143 }
            r11.mo41582b((int) r6, (java.util.Map<java.lang.String, java.lang.Object>) r4)     // Catch:{ all -> 0x0143 }
            com.ironsource.mediationsdk.v r4 = com.ironsource.mediationsdk.C5807v.C5809a.f14128a     // Catch:{ all -> 0x0143 }
            r5 = 0
            r4.mo42139a(r5)     // Catch:{ all -> 0x0143 }
            boolean r4 = r11.f13140o     // Catch:{ all -> 0x0143 }
            if (r4 == 0) goto L_0x0141
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r4 = r11.f13136k     // Catch:{ all -> 0x0143 }
            java.lang.String r5 = r12.mo41606k()     // Catch:{ all -> 0x0143 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0143 }
            r10 = r4
            com.ironsource.mediationsdk.server.b r10 = (com.ironsource.mediationsdk.server.C5782b) r10     // Catch:{ all -> 0x0143 }
            if (r10 == 0) goto L_0x00db
            int r13 = r12.mo41604i()     // Catch:{ all -> 0x0143 }
            com.ironsource.mediationsdk.server.b r0 = r11.f13138m     // Catch:{ all -> 0x0143 }
            com.ironsource.mediationsdk.C5695g.m14020a(r10, r13, r0)     // Catch:{ all -> 0x0143 }
            com.ironsource.mediationsdk.g r5 = r11.f13128c     // Catch:{ all -> 0x0143 }
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.T> r13 = r11.f13134i     // Catch:{ all -> 0x0143 }
            r6 = r13
            java.util.concurrent.CopyOnWriteArrayList r6 = (java.util.concurrent.CopyOnWriteArrayList) r6     // Catch:{ all -> 0x0143 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r7 = r11.f13136k     // Catch:{ all -> 0x0143 }
            int r8 = r12.mo41604i()     // Catch:{ all -> 0x0143 }
            com.ironsource.mediationsdk.server.b r9 = r11.f13138m     // Catch:{ all -> 0x0143 }
            r5.mo41851a((java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.C5606U>) r6, (java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.C5782b>) r7, (int) r8, (com.ironsource.mediationsdk.server.C5782b) r9, (com.ironsource.mediationsdk.server.C5782b) r10)     // Catch:{ all -> 0x0143 }
            monitor-exit(r11)
            return
        L_0x00db:
            java.lang.String r12 = r12.mo41606k()     // Catch:{ all -> 0x0143 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0143 }
            java.lang.String r5 = "onLoadSuccess winner instance "
            r4.<init>(r5)     // Catch:{ all -> 0x0143 }
            r4.append(r12)     // Catch:{ all -> 0x0143 }
            java.lang.String r5 = " missing from waterfall. auctionId: "
            r4.append(r5)     // Catch:{ all -> 0x0143 }
            r4.append(r13)     // Catch:{ all -> 0x0143 }
            java.lang.String r13 = " and the current id is "
            r4.append(r13)     // Catch:{ all -> 0x0143 }
            java.lang.String r13 = r11.f13130e     // Catch:{ all -> 0x0143 }
            r4.append(r13)     // Catch:{ all -> 0x0143 }
            java.lang.String r13 = r4.toString()     // Catch:{ all -> 0x0143 }
            m13583b((java.lang.String) r13)     // Catch:{ all -> 0x0143 }
            r13 = 81317(0x13da5, float:1.1395E-40)
            r4 = 3
            java.lang.Object[][] r4 = new java.lang.Object[r4][]     // Catch:{ all -> 0x0143 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0143 }
            java.lang.String r6 = "errorCode"
            r5[r1] = r6     // Catch:{ all -> 0x0143 }
            r6 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0143 }
            r5[r3] = r6     // Catch:{ all -> 0x0143 }
            r4[r1] = r5     // Catch:{ all -> 0x0143 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0143 }
            java.lang.String r6 = "reason"
            r5[r1] = r6     // Catch:{ all -> 0x0143 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0143 }
            java.lang.String r7 = "Loaded missing "
            r6.<init>(r7)     // Catch:{ all -> 0x0143 }
            r6.append(r0)     // Catch:{ all -> 0x0143 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0143 }
            r5[r3] = r0     // Catch:{ all -> 0x0143 }
            r4[r3] = r5     // Catch:{ all -> 0x0143 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0143 }
            java.lang.String r5 = "ext1"
            r0[r1] = r5     // Catch:{ all -> 0x0143 }
            r0[r3] = r12     // Catch:{ all -> 0x0143 }
            r4[r2] = r0     // Catch:{ all -> 0x0143 }
            java.util.Map r12 = com.ironsource.environment.C5505a.C55061.m13073a((java.lang.Object[][]) r4)     // Catch:{ all -> 0x0143 }
            r11.mo41582b((int) r13, (java.util.Map<java.lang.String, java.lang.Object>) r12)     // Catch:{ all -> 0x0143 }
        L_0x0141:
            monitor-exit(r11)
            return
        L_0x0143:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5597R.mo41580a(com.ironsource.mediationsdk.T, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo41581a(IronSourceError ironSourceError, C5603T t) {
        synchronized (this) {
            m13587c(t, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
            m13586c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}}));
            C5615W.m13672a().mo41621a(ironSourceError);
            this.f13148w = false;
            this.f13137l.put(t.mo41606k(), C5697h.C5698a.ISAuctionPerformanceFailedToShow);
            if (this.f13150y != C5597R.C5601a.RV_STATE_READY_TO_SHOW) {
                m13585b(false);
            }
            this.f13139n.mo41661c();
        }
    }

    /* renamed from: a */
    public final synchronized void mo41405a(Placement placement) {
        if (placement == null) {
            m13588c("showRewardedVideo error: empty default placement");
            C5615W.m13672a().mo41621a(new IronSourceError(1021, "showRewardedVideo error: empty default placement"));
            m13577a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1021}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: empty default placement"}}), false, true);
            return;
        }
        this.f13143r = placement.getPlacementName();
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "showRewardedVideo(" + placement + ")", 1);
        m13582b((int) IronSourceConstants.RV_API_SHOW_CALLED);
        if (this.f13148w) {
            m13588c("showRewardedVideo error: can't show ad while an ad is already showing");
            C5615W.m13672a().mo41621a(new IronSourceError(1022, "showRewardedVideo error: can't show ad while an ad is already showing"));
            m13586c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1022}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: can't show ad while an ad is already showing"}}));
        } else if (this.f13150y != C5597R.C5601a.RV_STATE_READY_TO_SHOW) {
            m13588c("showRewardedVideo error: show called while no ads are available");
            C5615W.m13672a().mo41621a(new IronSourceError(1023, "showRewardedVideo error: show called while no ads are available"));
            m13586c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1023}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo error: show called while no ads are available"}}));
        } else if (C5790c.m14294c(ContextProvider.getInstance().getApplicationContext(), this.f13143r)) {
            String str = "showRewardedVideo error: placement " + this.f13143r + " is capped";
            m13588c(str);
            C5615W.m13672a().mo41621a(new IronSourceError(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT, str));
            m13586c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_REACHED_CAP_LIMIT_PER_PLACEMENT)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}}));
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<C5603T> it = this.f13134i.iterator();
            while (it.hasNext()) {
                C5603T next = it.next();
                if (next.mo41599c()) {
                    this.f13148w = true;
                    next.mo41596a(true, this.f13132g);
                    m13579a("showVideo()");
                    this.f13127b.mo42131a(next);
                    if (this.f13127b.mo42133b(next)) {
                        next.mo41600f();
                        IronSourceUtils.sendAutomationLog(next.mo41606k() + " rewarded video is now session capped");
                    }
                    C5790c.m14296e(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName());
                    if (C5790c.m14294c(ContextProvider.getInstance().getApplicationContext(), placement.getPlacementName())) {
                        m13582b((int) IronSourceConstants.RV_CAP_PLACEMENT);
                    }
                    C5807v.C5809a.f14128a.mo42138a();
                    next.mo41594a(placement, this.f13132g);
                    mo41577a(C5597R.C5601a.RV_STATE_NOT_LOADED);
                    return;
                }
                if (next.mo41610o() != null) {
                    stringBuffer.append(next.mo41606k() + CertificateUtil.DELIMITER + next.mo41610o() + ",");
                }
                next.mo41596a(false, this.f13132g);
            }
            m13579a("showRewardedVideo(): No ads to show");
            C5615W.m13672a().mo41621a(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW));
            hashMap.put(IronSourceConstants.EVENTS_ERROR_REASON, "showRewardedVideo(): No ads to show");
            if (stringBuffer.length() != 0) {
                hashMap.put(IronSourceConstants.EVENTS_EXT1, stringBuffer.toString());
            }
            m13586c((int) IronSourceConstants.RV_CALLBACK_SHOW_FAILED, (Map<String, Object>) hashMap);
            this.f13139n.mo41661c();
        }
    }

    /* renamed from: a */
    public final void mo41406a(List<C5782b> list, String str, C5782b bVar, JSONObject jSONObject, int i, long j) {
        m13579a("makeAuction(): success");
        this.f13130e = str;
        this.f13138m = bVar;
        this.f13131f = jSONObject;
        this.f13151z = i;
        this.f13123A = "";
        mo41582b((int) IronSourceConstants.RV_AUCTION_SUCCESS, C5505a.C55061.m13073a(new Object[][]{new Object[]{"duration", Long.valueOf(j)}}));
        m13580a(list);
        if (!this.f13142q || !this.f13148w) {
            mo41587d();
        }
    }

    /* renamed from: a */
    public final void mo41252a(boolean z) {
        if (this.f13124B) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            boolean z2 = true;
            logger.log(ironSourceTag, "Network Availability Changed To: " + z, 1);
            Boolean bool = this.f13149x;
            boolean z3 = false;
            if (bool != null) {
                if ((!z || bool.booleanValue() || !mo41407a_()) && (z || !this.f13149x.booleanValue())) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (z3) {
                m13585b(z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
        return false;
     */
    /* renamed from: a_ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo41407a_() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f13124B     // Catch:{ all -> 0x0040 }
            r1 = 0
            if (r0 == 0) goto L_0x0016
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0040 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x0040 }
            boolean r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r0)     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x0016
            monitor-exit(r3)
            return r1
        L_0x0016:
            com.ironsource.mediationsdk.R$a r0 = r3.f13150y     // Catch:{ all -> 0x0040 }
            com.ironsource.mediationsdk.R$a r2 = com.ironsource.mediationsdk.C5597R.C5601a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0040 }
            if (r0 != r2) goto L_0x003e
            boolean r0 = r3.f13148w     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0021
            goto L_0x003e
        L_0x0021:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.T> r0 = r3.f13134i     // Catch:{ all -> 0x0040 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0040 }
        L_0x0027:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x003c
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0040 }
            com.ironsource.mediationsdk.T r2 = (com.ironsource.mediationsdk.C5603T) r2     // Catch:{ all -> 0x0040 }
            boolean r2 = r2.mo41599c()     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x0027
            r0 = 1
            monitor-exit(r3)
            return r0
        L_0x003c:
            monitor-exit(r3)
            return r1
        L_0x003e:
            monitor-exit(r3)
            return r1
        L_0x0040:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5597R.mo41407a_():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo41582b(int i, Map<String, Object> map) {
        m13577a(i, map, false, true);
    }

    /* renamed from: b */
    public final void mo41583b(C5603T t) {
        synchronized (this) {
            t.mo41593a((int) IronSourceConstants.RV_INSTANCE_CLOSED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, "otherRVAvailable = false"}});
            m13587c(t, "onRewardedVideoAdClosed, mediation state: " + this.f13150y.name());
            C5615W.m13672a().mo41627c();
            this.f13148w = false;
            if (this.f13150y != C5597R.C5601a.RV_STATE_READY_TO_SHOW) {
                m13585b(false);
            }
            if (!this.f13141p) {
                this.f13139n.mo41660b();
            } else if (this.f13135j != null && this.f13135j.size() > 0) {
                new Timer().schedule(new TimerTask() {
                    public final void run() {
                        C5597R.this.mo41587d();
                    }
                }, this.f13144s);
            }
        }
    }

    /* renamed from: b */
    public final void mo41584b(C5603T t, Placement placement) {
        m13587c(t, "onRewardedVideoAdClicked");
        C5615W.m13672a().mo41626b(placement);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015b, code lost:
        r9 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0163, code lost:
        if (r9.hasNext() == false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0165, code lost:
        m13590e((com.ironsource.mediationsdk.C5603T) r9.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016f, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0135  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41585b(com.ironsource.mediationsdk.C5603T r9, java.lang.String r10) {
        /*
            r8 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = "onLoadError state="
            r1.<init>(r2)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.R$a r2 = r8.f13150y     // Catch:{ all -> 0x0170 }
            r1.append(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0170 }
            m13587c((com.ironsource.mediationsdk.C5603T) r9, (java.lang.String) r1)     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r8.f13130e     // Catch:{ all -> 0x0170 }
            boolean r1 = r10.equalsIgnoreCase(r1)     // Catch:{ all -> 0x0170 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0072
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = "onLoadError was invoked with auctionId:"
            r0.<init>(r1)     // Catch:{ all -> 0x0170 }
            r0.append(r10)     // Catch:{ all -> 0x0170 }
            java.lang.String r10 = " and the current id is "
            r0.append(r10)     // Catch:{ all -> 0x0170 }
            java.lang.String r10 = r8.f13130e     // Catch:{ all -> 0x0170 }
            r0.append(r10)     // Catch:{ all -> 0x0170 }
            java.lang.String r10 = r0.toString()     // Catch:{ all -> 0x0170 }
            m13579a((java.lang.String) r10)     // Catch:{ all -> 0x0170 }
            r10 = 81315(0x13da3, float:1.13947E-40)
            r0 = 2
            java.lang.Object[][] r1 = new java.lang.Object[r0][]     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x0170 }
            java.lang.String r5 = "errorCode"
            r4[r3] = r5     // Catch:{ all -> 0x0170 }
            r5 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0170 }
            r4[r2] = r5     // Catch:{ all -> 0x0170 }
            r1[r3] = r4     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0170 }
            java.lang.String r4 = "reason"
            r0[r3] = r4     // Catch:{ all -> 0x0170 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r4 = "loadError wrong auction ID "
            r3.<init>(r4)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.R$a r4 = r8.f13150y     // Catch:{ all -> 0x0170 }
            r3.append(r4)     // Catch:{ all -> 0x0170 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0170 }
            r0[r2] = r3     // Catch:{ all -> 0x0170 }
            r1[r2] = r0     // Catch:{ all -> 0x0170 }
            r9.mo41598b(r10, r1)     // Catch:{ all -> 0x0170 }
            monitor-exit(r8)     // Catch:{ all -> 0x0170 }
            return
        L_0x0072:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.h$a> r10 = r8.f13137l     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r9.mo41606k()     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.h$a r4 = com.ironsource.mediationsdk.C5697h.C5698a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x0170 }
            r10.put(r1, r4)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.R$a r10 = r8.f13150y     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.R$a r1 = com.ironsource.mediationsdk.C5597R.C5601a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0170 }
            if (r10 == r1) goto L_0x008b
            com.ironsource.mediationsdk.R$a r10 = r8.f13150y     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.R$a r1 = com.ironsource.mediationsdk.C5597R.C5601a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0170 }
            if (r10 == r1) goto L_0x008b
            monitor-exit(r8)     // Catch:{ all -> 0x0170 }
            return
        L_0x008b:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.T> r10 = r8.f13134i     // Catch:{ all -> 0x0170 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x0170 }
            r1 = 0
            r4 = 0
        L_0x0093:
            boolean r5 = r10.hasNext()     // Catch:{ all -> 0x0170 }
            if (r5 == 0) goto L_0x013e
            java.lang.Object r5 = r10.next()     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.T r5 = (com.ironsource.mediationsdk.C5603T) r5     // Catch:{ all -> 0x0170 }
            boolean r6 = r5.f13194e     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x0120
            boolean r6 = r8.f13147v     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x00f8
            boolean r6 = r5.mo41603h()     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x00f8
            if (r1 != 0) goto L_0x00d0
            if (r4 == 0) goto L_0x00b2
            goto L_0x00d0
        L_0x00b2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = "Advanced Loading: Starting to load bidder "
            r6.<init>(r7)     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = r5.mo41606k()     // Catch:{ all -> 0x0170 }
            r6.append(r7)     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = ". No other instances will be loaded at the same time."
            r6.append(r7)     // Catch:{ all -> 0x0170 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0170 }
            m13579a((java.lang.String) r6)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r6)     // Catch:{ all -> 0x0170 }
            goto L_0x00f8
        L_0x00d0:
            if (r1 == 0) goto L_0x00d5
            java.lang.String r9 = "a non bidder is being loaded"
            goto L_0x00d7
        L_0x00d5:
            java.lang.String r9 = "a non bidder was already loaded successfully"
        L_0x00d7:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = "Advanced Loading: Won't start loading bidder "
            r10.<init>(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = r5.mo41606k()     // Catch:{ all -> 0x0170 }
            r10.append(r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = " as "
            r10.append(r2)     // Catch:{ all -> 0x0170 }
            r10.append(r9)     // Catch:{ all -> 0x0170 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x0170 }
            m13579a((java.lang.String) r9)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r9)     // Catch:{ all -> 0x0170 }
            goto L_0x013e
        L_0x00f8:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r6 = r8.f13136k     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = r5.mo41606k()     // Catch:{ all -> 0x0170 }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x0093
            r0.add(r5)     // Catch:{ all -> 0x0170 }
            boolean r6 = r8.f13147v     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x013e
            boolean r6 = r9.mo41603h()     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x013e
            boolean r5 = r5.mo41603h()     // Catch:{ all -> 0x0170 }
            if (r5 != 0) goto L_0x013e
            int r5 = r0.size()     // Catch:{ all -> 0x0170 }
            int r6 = r8.f13146u     // Catch:{ all -> 0x0170 }
            if (r5 >= r6) goto L_0x013e
            goto L_0x0132
        L_0x0120:
            com.ironsource.mediationsdk.T$a r6 = r5.f13165a     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.T$a r7 = com.ironsource.mediationsdk.C5603T.C5605a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0170 }
            if (r6 == r7) goto L_0x012f
            com.ironsource.mediationsdk.T$a r6 = r5.f13165a     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.T$a r7 = com.ironsource.mediationsdk.C5603T.C5605a.LOAD_IN_PROGRESS     // Catch:{ all -> 0x0170 }
            if (r6 != r7) goto L_0x012d
            goto L_0x012f
        L_0x012d:
            r6 = 0
            goto L_0x0130
        L_0x012f:
            r6 = 1
        L_0x0130:
            if (r6 == 0) goto L_0x0135
        L_0x0132:
            r1 = 1
            goto L_0x0093
        L_0x0135:
            boolean r5 = r5.mo41599c()     // Catch:{ all -> 0x0170 }
            if (r5 == 0) goto L_0x0093
            r4 = 1
            goto L_0x0093
        L_0x013e:
            int r9 = r0.size()     // Catch:{ all -> 0x0170 }
            if (r9 != 0) goto L_0x015a
            if (r4 != 0) goto L_0x015a
            if (r1 != 0) goto L_0x015a
            java.lang.String r9 = "onLoadError(): No other available smashes"
            m13579a((java.lang.String) r9)     // Catch:{ all -> 0x0170 }
            r8.m13585b((boolean) r3)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.R$a r9 = com.ironsource.mediationsdk.C5597R.C5601a.RV_STATE_NOT_LOADED     // Catch:{ all -> 0x0170 }
            r8.mo41577a((com.ironsource.mediationsdk.C5597R.C5601a) r9)     // Catch:{ all -> 0x0170 }
            com.ironsource.mediationsdk.Z r9 = r8.f13139n     // Catch:{ all -> 0x0170 }
            r9.mo41662d()     // Catch:{ all -> 0x0170 }
        L_0x015a:
            monitor-exit(r8)     // Catch:{ all -> 0x0170 }
            java.util.Iterator r9 = r0.iterator()
        L_0x015f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x016f
            java.lang.Object r10 = r9.next()
            com.ironsource.mediationsdk.T r10 = (com.ironsource.mediationsdk.C5603T) r10
            r8.m13590e(r10)
            goto L_0x015f
        L_0x016f:
            return
        L_0x0170:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0170 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5597R.mo41585b(com.ironsource.mediationsdk.T, java.lang.String):void");
    }

    /* renamed from: c */
    public final synchronized void mo41411c() {
        m13579a("onLoadTriggered: RV load was triggered in " + this.f13150y + " state");
        m13578a(0);
    }

    /* renamed from: c */
    public final void mo41586c(C5603T t) {
        m13587c(t, "onRewardedVideoAdStarted");
        C5615W.m13672a().mo41628d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo41587d() {
        m13584b(this.f13135j);
        m13593h();
    }

    /* renamed from: d */
    public final void mo41588d(C5603T t) {
        m13587c(t, "onRewardedVideoAdEnded");
        C5615W.m13672a().mo41629e();
    }

    /* renamed from: d_ */
    public final void mo41415d_() {
        mo41577a(C5597R.C5601a.RV_STATE_NOT_LOADED);
        m13581a(false, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        m13578a(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo41589e() {
        mo41577a(C5597R.C5601a.RV_STATE_NOT_LOADED);
        m13585b(false);
        this.f13139n.mo41662d();
    }
}
