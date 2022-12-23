package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.C5505a;
import com.ironsource.environment.C5531j;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.mediationsdk.C5564G;
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
import com.ironsource.mediationsdk.utils.C5802l;
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

/* renamed from: com.ironsource.mediationsdk.F */
final class C5560F extends C5716m implements C5531j, C5567H, C5648aa, C5694f, C5811x, C5812y {

    /* renamed from: a */
    C5652ad f12874a;

    /* renamed from: b */
    C5697h f12875b;

    /* renamed from: c */
    C5695g f12876c;

    /* renamed from: d */
    long f12877d;

    /* renamed from: e */
    final ConcurrentHashMap<String, C5564G> f12878e;

    /* renamed from: f */
    C5802l f12879f;

    /* renamed from: g */
    int f12880g = 1;

    /* renamed from: h */
    C5563a f12881h;

    /* renamed from: i */
    final Object f12882i = new Object();

    /* renamed from: j */
    private ConcurrentHashMap<String, C5782b> f12883j;

    /* renamed from: k */
    private ConcurrentHashMap<String, C5697h.C5698a> f12884k;

    /* renamed from: l */
    private C5782b f12885l;

    /* renamed from: m */
    private JSONObject f12886m;

    /* renamed from: n */
    private C5628Z f12887n;

    /* renamed from: o */
    private boolean f12888o;

    /* renamed from: p */
    private String f12889p = "";

    /* renamed from: q */
    private int f12890q;

    /* renamed from: r */
    private NetworkStateReceiver f12891r;

    /* renamed from: s */
    private boolean f12892s = false;

    /* renamed from: t */
    private String f12893t;

    /* renamed from: u */
    private int f12894u;

    /* renamed from: v */
    private boolean f12895v;

    /* renamed from: w */
    private boolean f12896w;

    /* renamed from: x */
    private long f12897x;

    /* renamed from: y */
    private Boolean f12898y;

    /* renamed from: com.ironsource.mediationsdk.F$a */
    enum C5563a {
        RV_STATE_INITIATING,
        RV_STATE_AUCTION_IN_PROGRESS,
        RV_STATE_NOT_LOADED,
        RV_STATE_LOADING_SMASHES,
        RV_STATE_READY_TO_SHOW
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5560F(List<NetworkSettings> list, C5734q qVar, String str, String str2, HashSet<ImpressionDataListener> hashSet) {
        super(hashSet);
        C5734q qVar2 = qVar;
        long time = new Date().getTime();
        mo41397a((int) IronSourceConstants.RV_MANAGER_INIT_STARTED);
        mo41401a(C5563a.RV_STATE_INITIATING);
        this.f12898y = null;
        this.f12894u = qVar2.f13793c;
        this.f12895v = qVar2.f13794d;
        this.f12893t = "";
        this.f12886m = null;
        C5789b bVar = qVar2.f13801k;
        this.f12896w = false;
        this.f12874a = new C5652ad(qVar2.f13801k.f13927o, qVar2.f13801k.f13919g);
        this.f12883j = new ConcurrentHashMap<>();
        this.f12884k = new ConcurrentHashMap<>();
        this.f12897x = new Date().getTime();
        boolean z = bVar.f13917e > 0;
        this.f12888o = z;
        if (z) {
            this.f12876c = new C5695g("rewardedVideo", bVar, this);
        }
        this.f12887n = new C5628Z(bVar, this);
        this.f12878e = new ConcurrentHashMap<>();
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : list) {
            AbstractAdapter a = C5685c.m13965a().mo41824a(next, next.getRewardedVideoSettings(), false, false);
            if (a != null) {
                C5564G g = r0;
                C5564G g2 = new C5564G(str, str2, next, this, qVar2.f13795e, a, this.f12880g);
                String k = g.mo41606k();
                this.f12878e.put(k, g);
                arrayList.add(k);
            }
        }
        this.f12875b = new C5697h(arrayList, bVar.f13918f);
        this.f12879f = new C5802l(new ArrayList(this.f12878e.values()));
        mo41399a((int) IronSourceConstants.RV_MANAGER_INIT_ENDED, C5505a.C55061.m13073a(new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}}));
        m13341a(bVar.f13921i);
        C5807v.C5809a.f14128a.mo42140a(this, qVar2.f13799i);
    }

    /* renamed from: a */
    private String m13339a(C5782b bVar) {
        C5564G g = this.f12878e.get(bVar.mo42082a());
        String num = g != null ? Integer.toString(g.mo41604i()) : TextUtils.isEmpty(bVar.mo42083b()) ? "1" : "2";
        return num + bVar.mo42082a();
    }

    /* renamed from: a */
    private void m13340a(int i, Map<String, Object> map, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 2);
        if (z2 && !TextUtils.isEmpty(this.f12874a.f13360b)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f12874a.f13360b);
        }
        JSONObject jSONObject = this.f12886m;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f12886m);
        }
        if (z && !TextUtils.isEmpty(this.f12893t)) {
            hashMap.put("placement", this.f12893t);
        }
        if (m13347b(i)) {
            C5645g.m13810e();
            C5645g.m13758a((Map<String, Object>) hashMap, this.f12890q, this.f12889p);
        }
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f12880g));
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    hashMap.putAll(map);
                }
            } catch (Exception e) {
                IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                logger.log(ironSourceTag, "LWSProgRvManager: RV sendMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C5645g.m13810e().mo41689b(new C5641c(i, new JSONObject(hashMap)));
    }

    /* renamed from: a */
    private void m13341a(long j) {
        if (this.f12879f.mo42132a()) {
            m13343a("all smashes are capped");
            mo41408b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80001}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "all smashes are capped"}}));
            mo41413d();
        } else if (this.f12888o) {
            if (!this.f12884k.isEmpty()) {
                this.f12875b.mo41855a(this.f12884k);
                this.f12884k.clear();
            }
            new Timer().schedule(new TimerTask() {
                public final void run() {
                    C5560F f = C5560F.this;
                    synchronized (f.f12882i) {
                        if (f.f12881h != C5563a.RV_STATE_AUCTION_IN_PROGRESS) {
                            f.mo41401a(C5563a.RV_STATE_AUCTION_IN_PROGRESS);
                            AsyncTask.execute(new Runnable() {
                                public final void run() {
                                    StringBuilder sb;
                                    C5560F.m13343a("makeAuction()");
                                    C5560F.this.f12877d = new Date().getTime();
                                    HashMap hashMap = new HashMap();
                                    ArrayList arrayList = new ArrayList();
                                    StringBuilder sb2 = new StringBuilder();
                                    for (C5564G next : C5560F.this.f12878e.values()) {
                                        if (!C5560F.this.f12879f.mo42133b(next) && C5560F.this.f12874a.mo41719b(next)) {
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
                                        C5560F.this.mo41408b((int) IronSourceConstants.RV_AUCTION_FAILED, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}}));
                                        C5560F.m13343a("makeAuction() failed - No candidates available for auctioning");
                                        C5560F.this.mo41413d();
                                        return;
                                    }
                                    C5560F.m13343a("makeAuction() - request waterfall is: " + sb2);
                                    C5560F.this.mo41397a(1000);
                                    C5560F.this.mo41397a((int) IronSourceConstants.RV_AUCTION_REQUEST);
                                    C5560F.this.mo41399a((int) IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}));
                                    C5560F.this.f12876c.mo41850a(ContextProvider.getInstance().getApplicationContext(), (Map<String, Object>) hashMap, (List<String>) arrayList, C5560F.this.f12875b, C5560F.this.f12880g);
                                }
                            });
                        }
                    }
                }
            }, j);
        } else {
            m13343a("auction fallback flow starting");
            m13351e();
            if (this.f12874a.mo41715a().isEmpty()) {
                m13343a("loadSmashes -  waterfall is empty");
                mo41408b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
                mo41413d();
                return;
            }
            mo41397a(1000);
            m13353g();
        }
    }

    /* renamed from: a */
    private static void m13342a(C5564G g, String str) {
        String str2 = g.mo41606k() + " : " + str;
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "LWSProgRvManager: " + str2, 0);
    }

    /* renamed from: a */
    static void m13343a(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager: " + str, 0);
    }

    /* renamed from: a */
    private void m13344a(List<C5782b> list, String str, JSONObject jSONObject) {
        this.f12883j.clear();
        this.f12884k.clear();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        StringBuilder sb = new StringBuilder();
        for (C5782b next : list) {
            sb.append(m13339a(next) + ",");
            C5564G g = this.f12878e.get(next.mo42082a());
            if (g != null) {
                AbstractAdapter a = C5685c.m13965a().mo41823a(g.f13193d.f13706a);
                if (a != null) {
                    C5564G g2 = new C5564G(g, this, a, this.f12880g, str, jSONObject, this.f12890q, this.f12889p);
                    g2.f13194e = true;
                    copyOnWriteArrayList.add(g2);
                    this.f12883j.put(g2.mo41606k(), next);
                    this.f12884k.put(next.mo42082a(), C5697h.C5698a.ISAuctionPerformanceDidntAttemptToLoad);
                }
            } else {
                m13343a("updateWaterfall() - could not find matching smash for auction response item " + next.mo42082a());
            }
        }
        this.f12874a.mo41717a(copyOnWriteArrayList, str);
        if (this.f12874a.mo41718b()) {
            mo41408b((int) IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfalls hold too many with size=" + this.f12874a.f13359a.size()}}));
        }
        m13343a("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            m13343a("Updated waterfall is empty");
        }
        mo41408b((int) IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}}));
    }

    /* renamed from: a */
    private void m13345a(boolean z, Map<String, Object> map) {
        synchronized (this.f12882i) {
            if (this.f12898y == null || this.f12898y.booleanValue() != z) {
                this.f12898y = Boolean.valueOf(z);
                long time = new Date().getTime() - this.f12897x;
                this.f12897x = new Date().getTime();
                if (map == null) {
                    map = new HashMap<>();
                }
                map.put("duration", Long.valueOf(time));
                mo41408b(z ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, map);
                C5615W.m13672a().mo41624a(z);
            }
        }
    }

    /* renamed from: b */
    private static void m13346b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager: " + str, 3);
    }

    /* renamed from: b */
    private static boolean m13347b(int i) {
        return i == 1003 || i == 1302 || i == 1301;
    }

    /* renamed from: c */
    private void m13348c(int i) {
        m13340a(i, (Map<String, Object>) null, true, true);
    }

    /* renamed from: c */
    private void m13349c(int i, Map<String, Object> map) {
        m13340a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, map, true, true);
    }

    /* renamed from: c */
    private static void m13350c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    /* renamed from: e */
    private void m13351e() {
        List<C5782b> f = m13352f();
        m13344a(f, "fallback_" + System.currentTimeMillis(), this.f12886m);
    }

    /* renamed from: f */
    private List<C5782b> m13352f() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (C5564G next : this.f12878e.values()) {
            if (!next.mo41603h() && !this.f12879f.mo42133b(next) && this.f12874a.mo41719b(next)) {
                copyOnWriteArrayList.add(new C5782b(next.mo41606k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: g */
    private void m13353g() {
        if (this.f12874a.mo41715a().isEmpty()) {
            m13343a("loadSmashes -  waterfall is empty");
            mo41408b((int) IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 80004}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "waterfall is empty"}}));
            mo41413d();
            return;
        }
        mo41401a(C5563a.RV_STATE_LOADING_SMASHES);
        int i = 0;
        for (int i2 = 0; i2 < this.f12874a.mo41715a().size() && i < this.f12894u; i2++) {
            C5564G g = this.f12874a.mo41715a().get(i2);
            if (g.f13194e) {
                if (!this.f12895v || !g.mo41603h()) {
                    m13354g(g);
                    i++;
                } else if (i == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + g.mo41606k() + ". No other instances will be loaded at the same time.";
                    m13343a(str);
                    IronSourceUtils.sendAutomationLog(str);
                    m13354g(g);
                    return;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + g.mo41606k() + " as a non bidder is being loaded";
                    m13343a(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private void m13354g(C5564G g) {
        String b = this.f12883j.get(g.mo41606k()).mo42083b();
        g.mo41602b(b);
        g.mo41423a(b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41397a(int i) {
        m13340a(i, (Map<String, Object>) null, false, false);
    }

    /* renamed from: a */
    public final void mo41398a(int i, String str, int i2, String str2, long j) {
        Map<String, Object> map;
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        m13343a(str3);
        IronSourceUtils.sendAutomationLog("RV: " + str3);
        this.f12890q = i2;
        this.f12889p = str2;
        this.f12886m = null;
        m13351e();
        if (TextUtils.isEmpty(str)) {
            map = C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"duration", Long.valueOf(j)}});
        } else {
            map = C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{"duration", Long.valueOf(j)}});
        }
        mo41408b((int) IronSourceConstants.RV_AUCTION_FAILED, map);
        m13353g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41399a(int i, Map<String, Object> map) {
        m13340a(i, map, false, false);
    }

    /* renamed from: a */
    public final void mo41400a(Context context, boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "LWSProgRvManager Should Track Network State: " + z, 0);
        try {
            this.f12892s = z;
            if (z) {
                if (this.f12891r == null) {
                    this.f12891r = new NetworkStateReceiver(context, this);
                }
                context.getApplicationContext().registerReceiver(this.f12891r, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } else if (this.f12891r != null) {
                context.getApplicationContext().unregisterReceiver(this.f12891r);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Got an error from receiver with message: " + e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41401a(C5563a aVar) {
        m13343a("current state=" + this.f12881h + ", new state=" + aVar);
        this.f12881h = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0111, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41402a(com.ironsource.mediationsdk.C5564G r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f12882i
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0163 }
            java.lang.String r2 = "onLoadSuccess mState="
            r1.<init>(r2)     // Catch:{ all -> 0x0163 }
            com.ironsource.mediationsdk.F$a r2 = r12.f12881h     // Catch:{ all -> 0x0163 }
            r1.append(r2)     // Catch:{ all -> 0x0163 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0163 }
            m13342a((com.ironsource.mediationsdk.C5564G) r13, (java.lang.String) r1)     // Catch:{ all -> 0x0163 }
            java.lang.String r1 = r13.f12908b     // Catch:{ all -> 0x0163 }
            com.ironsource.mediationsdk.ad r2 = r12.f12874a     // Catch:{ all -> 0x0163 }
            java.lang.String r2 = r2.f13360b     // Catch:{ all -> 0x0163 }
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 != r2) goto L_0x0112
            com.ironsource.mediationsdk.F$a r1 = r12.f12881h     // Catch:{ all -> 0x0163 }
            com.ironsource.mediationsdk.F$a r2 = com.ironsource.mediationsdk.C5560F.C5563a.RV_STATE_AUCTION_IN_PROGRESS     // Catch:{ all -> 0x0163 }
            if (r1 != r2) goto L_0x0029
            goto L_0x0112
        L_0x0029:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.h$a> r1 = r12.f12884k     // Catch:{ all -> 0x0163 }
            java.lang.String r2 = r13.mo41606k()     // Catch:{ all -> 0x0163 }
            com.ironsource.mediationsdk.h$a r6 = com.ironsource.mediationsdk.C5697h.C5698a.ISAuctionPerformanceLoadedSuccessfully     // Catch:{ all -> 0x0163 }
            r1.put(r2, r6)     // Catch:{ all -> 0x0163 }
            com.ironsource.mediationsdk.F$a r1 = r12.f12881h     // Catch:{ all -> 0x0163 }
            com.ironsource.mediationsdk.F$a r2 = com.ironsource.mediationsdk.C5560F.C5563a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0163 }
            if (r1 != r2) goto L_0x0110
            r1 = 0
            r12.m13345a((boolean) r5, (java.util.Map<java.lang.String, java.lang.Object>) r1)     // Catch:{ all -> 0x0163 }
            com.ironsource.mediationsdk.F$a r1 = com.ironsource.mediationsdk.C5560F.C5563a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0163 }
            r12.mo41401a((com.ironsource.mediationsdk.C5560F.C5563a) r1)     // Catch:{ all -> 0x0163 }
            java.util.Date r1 = new java.util.Date     // Catch:{ all -> 0x0163 }
            r1.<init>()     // Catch:{ all -> 0x0163 }
            long r1 = r1.getTime()     // Catch:{ all -> 0x0163 }
            long r6 = r12.f12877d     // Catch:{ all -> 0x0163 }
            long r1 = r1 - r6
            r6 = 1003(0x3eb, float:1.406E-42)
            java.lang.Object[][] r7 = new java.lang.Object[r5][]     // Catch:{ all -> 0x0163 }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x0163 }
            java.lang.String r9 = "duration"
            r8[r3] = r9     // Catch:{ all -> 0x0163 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0163 }
            r8[r5] = r1     // Catch:{ all -> 0x0163 }
            r7[r3] = r8     // Catch:{ all -> 0x0163 }
            java.util.Map r1 = com.ironsource.environment.C5505a.C55061.m13073a((java.lang.Object[][]) r7)     // Catch:{ all -> 0x0163 }
            r12.mo41408b((int) r6, (java.util.Map<java.lang.String, java.lang.Object>) r1)     // Catch:{ all -> 0x0163 }
            com.ironsource.mediationsdk.v r1 = com.ironsource.mediationsdk.C5807v.C5809a.f14128a     // Catch:{ all -> 0x0163 }
            r6 = 0
            r1.mo42139a(r6)     // Catch:{ all -> 0x0163 }
            boolean r1 = r12.f12888o     // Catch:{ all -> 0x0163 }
            if (r1 == 0) goto L_0x0110
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r1 = r12.f12883j     // Catch:{ all -> 0x0163 }
            java.lang.String r2 = r13.mo41606k()     // Catch:{ all -> 0x0163 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0163 }
            r11 = r1
            com.ironsource.mediationsdk.server.b r11 = (com.ironsource.mediationsdk.server.C5782b) r11     // Catch:{ all -> 0x0163 }
            if (r11 == 0) goto L_0x00a4
            int r1 = r13.mo41604i()     // Catch:{ all -> 0x0163 }
            com.ironsource.mediationsdk.server.b r2 = r12.f12885l     // Catch:{ all -> 0x0163 }
            com.ironsource.mediationsdk.C5695g.m14020a(r11, r1, r2)     // Catch:{ all -> 0x0163 }
            com.ironsource.mediationsdk.g r6 = r12.f12876c     // Catch:{ all -> 0x0163 }
            com.ironsource.mediationsdk.ad r1 = r12.f12874a     // Catch:{ all -> 0x0163 }
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.mo41715a()     // Catch:{ all -> 0x0163 }
            r7 = r1
            java.util.concurrent.CopyOnWriteArrayList r7 = (java.util.concurrent.CopyOnWriteArrayList) r7     // Catch:{ all -> 0x0163 }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r8 = r12.f12883j     // Catch:{ all -> 0x0163 }
            int r9 = r13.mo41604i()     // Catch:{ all -> 0x0163 }
            com.ironsource.mediationsdk.server.b r10 = r12.f12885l     // Catch:{ all -> 0x0163 }
            r6.mo41851a((java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.C5606U>) r7, (java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.C5782b>) r8, (int) r9, (com.ironsource.mediationsdk.server.C5782b) r10, (com.ironsource.mediationsdk.server.C5782b) r11)     // Catch:{ all -> 0x0163 }
            goto L_0x0110
        L_0x00a4:
            java.lang.String r1 = r13.mo41606k()     // Catch:{ all -> 0x0163 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0163 }
            java.lang.String r6 = "onLoadSuccess winner instance "
            r2.<init>(r6)     // Catch:{ all -> 0x0163 }
            r2.append(r1)     // Catch:{ all -> 0x0163 }
            java.lang.String r6 = " missing from waterfall. auctionId: "
            r2.append(r6)     // Catch:{ all -> 0x0163 }
            java.lang.String r13 = r13.f12908b     // Catch:{ all -> 0x0163 }
            r2.append(r13)     // Catch:{ all -> 0x0163 }
            java.lang.String r13 = " and the current id is "
            r2.append(r13)     // Catch:{ all -> 0x0163 }
            com.ironsource.mediationsdk.ad r13 = r12.f12874a     // Catch:{ all -> 0x0163 }
            java.lang.String r13 = r13.f13360b     // Catch:{ all -> 0x0163 }
            r2.append(r13)     // Catch:{ all -> 0x0163 }
            java.lang.String r13 = r2.toString()     // Catch:{ all -> 0x0163 }
            m13346b((java.lang.String) r13)     // Catch:{ all -> 0x0163 }
            r13 = 81317(0x13da5, float:1.1395E-40)
            r2 = 3
            java.lang.Object[][] r2 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0163 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0163 }
            java.lang.String r7 = "errorCode"
            r6[r3] = r7     // Catch:{ all -> 0x0163 }
            r7 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0163 }
            r6[r5] = r7     // Catch:{ all -> 0x0163 }
            r2[r3] = r6     // Catch:{ all -> 0x0163 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0163 }
            java.lang.String r7 = "reason"
            r6[r3] = r7     // Catch:{ all -> 0x0163 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0163 }
            java.lang.String r8 = "Loaded missing "
            r7.<init>(r8)     // Catch:{ all -> 0x0163 }
            com.ironsource.mediationsdk.F$a r8 = com.ironsource.mediationsdk.C5560F.C5563a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0163 }
            r7.append(r8)     // Catch:{ all -> 0x0163 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0163 }
            r6[r5] = r7     // Catch:{ all -> 0x0163 }
            r2[r5] = r6     // Catch:{ all -> 0x0163 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0163 }
            java.lang.String r7 = "ext1"
            r6[r3] = r7     // Catch:{ all -> 0x0163 }
            r6[r5] = r1     // Catch:{ all -> 0x0163 }
            r2[r4] = r6     // Catch:{ all -> 0x0163 }
            java.util.Map r1 = com.ironsource.environment.C5505a.C55061.m13073a((java.lang.Object[][]) r2)     // Catch:{ all -> 0x0163 }
            r12.mo41408b((int) r13, (java.util.Map<java.lang.String, java.lang.Object>) r1)     // Catch:{ all -> 0x0163 }
        L_0x0110:
            monitor-exit(r0)     // Catch:{ all -> 0x0163 }
            return
        L_0x0112:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0163 }
            java.lang.String r2 = "onLoadSuccess was invoked with auctionId: "
            r1.<init>(r2)     // Catch:{ all -> 0x0163 }
            java.lang.String r2 = r13.f12908b     // Catch:{ all -> 0x0163 }
            r1.append(r2)     // Catch:{ all -> 0x0163 }
            java.lang.String r2 = " and the current id is "
            r1.append(r2)     // Catch:{ all -> 0x0163 }
            com.ironsource.mediationsdk.ad r2 = r12.f12874a     // Catch:{ all -> 0x0163 }
            java.lang.String r2 = r2.f13360b     // Catch:{ all -> 0x0163 }
            r1.append(r2)     // Catch:{ all -> 0x0163 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0163 }
            m13343a((java.lang.String) r1)     // Catch:{ all -> 0x0163 }
            r1 = 81315(0x13da3, float:1.13947E-40)
            java.lang.Object[][] r2 = new java.lang.Object[r4][]     // Catch:{ all -> 0x0163 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0163 }
            java.lang.String r7 = "errorCode"
            r6[r3] = r7     // Catch:{ all -> 0x0163 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0163 }
            r6[r5] = r7     // Catch:{ all -> 0x0163 }
            r2[r3] = r6     // Catch:{ all -> 0x0163 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0163 }
            java.lang.String r6 = "reason"
            r4[r3] = r6     // Catch:{ all -> 0x0163 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0163 }
            java.lang.String r6 = "onLoadSuccess wrong auction ID "
            r3.<init>(r6)     // Catch:{ all -> 0x0163 }
            com.ironsource.mediationsdk.F$a r6 = r12.f12881h     // Catch:{ all -> 0x0163 }
            r3.append(r6)     // Catch:{ all -> 0x0163 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0163 }
            r4[r5] = r3     // Catch:{ all -> 0x0163 }
            r2[r5] = r4     // Catch:{ all -> 0x0163 }
            r13.mo41425b(r1, r2)     // Catch:{ all -> 0x0163 }
            monitor-exit(r0)     // Catch:{ all -> 0x0163 }
            return
        L_0x0163:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0163 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5560F.mo41402a(com.ironsource.mediationsdk.G):void");
    }

    /* renamed from: a */
    public final void mo41403a(C5564G g, Placement placement) {
        m13342a(g, "onRewardedVideoAdRewarded");
        C5615W.m13672a().mo41622a(placement);
    }

    /* renamed from: a */
    public final void mo41404a(IronSourceError ironSourceError, C5564G g) {
        m13342a(g, "onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        this.f12896w = false;
        m13349c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}}));
        C5615W.m13672a().mo41621a(ironSourceError);
        this.f12884k.put(g.mo41606k(), C5697h.C5698a.ISAuctionPerformanceFailedToShow);
        if (this.f12881h != C5563a.RV_STATE_READY_TO_SHOW) {
            m13345a(false, (Map<String, Object>) null);
        }
        this.f12887n.mo41661c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01d4, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01d6, code lost:
        m13343a("showVideo()");
        r9.f12879f.mo42131a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01e6, code lost:
        if (r9.f12879f.mo42133b(r6) == false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01e8, code lost:
        r6.mo41428c_();
        com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r6.mo41606k() + " rewarded video is now session capped");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0203, code lost:
        com.ironsource.mediationsdk.utils.C5790c.m14296e(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), r10.getPlacementName());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0222, code lost:
        if (com.ironsource.mediationsdk.utils.C5790c.m14294c(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext(), r10.getPlacementName()) == false) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0224, code lost:
        m13348c((int) com.ironsource.mediationsdk.utils.IronSourceConstants.RV_CAP_PLACEMENT);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0229, code lost:
        com.ironsource.mediationsdk.C5807v.C5809a.m14373a().mo42138a();
        r6.mo41422a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41405a(com.ironsource.mediationsdk.model.Placement r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f12882i
            monitor-enter(r0)
            r1 = 1113(0x459, float:1.56E-42)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r10 != 0) goto L_0x0040
            java.lang.String r10 = "showRewardedVideo error: empty default placement"
            m13350c((java.lang.String) r10)     // Catch:{ all -> 0x0234 }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0234 }
            r6 = 1021(0x3fd, float:1.431E-42)
            r5.<init>(r6, r10)     // Catch:{ all -> 0x0234 }
            com.ironsource.mediationsdk.W r7 = com.ironsource.mediationsdk.C5615W.m13672a()     // Catch:{ all -> 0x0234 }
            r7.mo41621a((com.ironsource.mediationsdk.logger.IronSourceError) r5)     // Catch:{ all -> 0x0234 }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0234 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0234 }
            java.lang.String r8 = "errorCode"
            r7[r3] = r8     // Catch:{ all -> 0x0234 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0234 }
            r7[r4] = r6     // Catch:{ all -> 0x0234 }
            r5[r3] = r7     // Catch:{ all -> 0x0234 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0234 }
            java.lang.String r6 = "reason"
            r2[r3] = r6     // Catch:{ all -> 0x0234 }
            r2[r4] = r10     // Catch:{ all -> 0x0234 }
            r5[r4] = r2     // Catch:{ all -> 0x0234 }
            java.util.Map r10 = com.ironsource.environment.C5505a.C55061.m13073a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x0234 }
            r9.m13340a(r1, r10, r3, r4)     // Catch:{ all -> 0x0234 }
            monitor-exit(r0)     // Catch:{ all -> 0x0234 }
            return
        L_0x0040:
            java.lang.String r5 = r10.getPlacementName()     // Catch:{ all -> 0x0234 }
            r9.f12893t = r5     // Catch:{ all -> 0x0234 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0234 }
            java.lang.String r6 = "showRewardedVideo("
            r5.<init>(r6)     // Catch:{ all -> 0x0234 }
            r5.append(r10)     // Catch:{ all -> 0x0234 }
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0234 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0234 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r6 = com.ironsource.mediationsdk.logger.IronSourceLoggerManager.getLogger()     // Catch:{ all -> 0x0234 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r7 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.API     // Catch:{ all -> 0x0234 }
            r6.log(r7, r5, r4)     // Catch:{ all -> 0x0234 }
            r5 = 1100(0x44c, float:1.541E-42)
            r9.m13348c((int) r5)     // Catch:{ all -> 0x0234 }
            boolean r5 = r9.f12896w     // Catch:{ all -> 0x0234 }
            if (r5 == 0) goto L_0x00a1
            java.lang.String r10 = "showRewardedVideo error: can't show ad while an ad is already showing"
            m13350c((java.lang.String) r10)     // Catch:{ all -> 0x0234 }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0234 }
            r6 = 1022(0x3fe, float:1.432E-42)
            r5.<init>(r6, r10)     // Catch:{ all -> 0x0234 }
            com.ironsource.mediationsdk.W r7 = com.ironsource.mediationsdk.C5615W.m13672a()     // Catch:{ all -> 0x0234 }
            r7.mo41621a((com.ironsource.mediationsdk.logger.IronSourceError) r5)     // Catch:{ all -> 0x0234 }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0234 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0234 }
            java.lang.String r8 = "errorCode"
            r7[r3] = r8     // Catch:{ all -> 0x0234 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0234 }
            r7[r4] = r6     // Catch:{ all -> 0x0234 }
            r5[r3] = r7     // Catch:{ all -> 0x0234 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0234 }
            java.lang.String r6 = "reason"
            r2[r3] = r6     // Catch:{ all -> 0x0234 }
            r2[r4] = r10     // Catch:{ all -> 0x0234 }
            r5[r4] = r2     // Catch:{ all -> 0x0234 }
            java.util.Map r10 = com.ironsource.environment.C5505a.C55061.m13073a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x0234 }
            r9.m13349c(r1, r10)     // Catch:{ all -> 0x0234 }
            monitor-exit(r0)     // Catch:{ all -> 0x0234 }
            return
        L_0x00a1:
            com.ironsource.mediationsdk.F$a r5 = r9.f12881h     // Catch:{ all -> 0x0234 }
            com.ironsource.mediationsdk.F$a r6 = com.ironsource.mediationsdk.C5560F.C5563a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0234 }
            if (r5 == r6) goto L_0x00dd
            java.lang.String r10 = "showRewardedVideo error: show called while no ads are available"
            m13350c((java.lang.String) r10)     // Catch:{ all -> 0x0234 }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0234 }
            r6 = 1023(0x3ff, float:1.434E-42)
            r5.<init>(r6, r10)     // Catch:{ all -> 0x0234 }
            com.ironsource.mediationsdk.W r7 = com.ironsource.mediationsdk.C5615W.m13672a()     // Catch:{ all -> 0x0234 }
            r7.mo41621a((com.ironsource.mediationsdk.logger.IronSourceError) r5)     // Catch:{ all -> 0x0234 }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0234 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0234 }
            java.lang.String r8 = "errorCode"
            r7[r3] = r8     // Catch:{ all -> 0x0234 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0234 }
            r7[r4] = r6     // Catch:{ all -> 0x0234 }
            r5[r3] = r7     // Catch:{ all -> 0x0234 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0234 }
            java.lang.String r6 = "reason"
            r2[r3] = r6     // Catch:{ all -> 0x0234 }
            r2[r4] = r10     // Catch:{ all -> 0x0234 }
            r5[r4] = r2     // Catch:{ all -> 0x0234 }
            java.util.Map r10 = com.ironsource.environment.C5505a.C55061.m13073a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x0234 }
            r9.m13349c(r1, r10)     // Catch:{ all -> 0x0234 }
            monitor-exit(r0)     // Catch:{ all -> 0x0234 }
            return
        L_0x00dd:
            com.ironsource.environment.ContextProvider r5 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0234 }
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ all -> 0x0234 }
            java.lang.String r6 = r9.f12893t     // Catch:{ all -> 0x0234 }
            boolean r5 = com.ironsource.mediationsdk.utils.C5790c.m14294c((android.content.Context) r5, (java.lang.String) r6)     // Catch:{ all -> 0x0234 }
            if (r5 == 0) goto L_0x0136
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0234 }
            java.lang.String r5 = "showRewardedVideo error: placement "
            r10.<init>(r5)     // Catch:{ all -> 0x0234 }
            java.lang.String r5 = r9.f12893t     // Catch:{ all -> 0x0234 }
            r10.append(r5)     // Catch:{ all -> 0x0234 }
            java.lang.String r5 = " is capped"
            r10.append(r5)     // Catch:{ all -> 0x0234 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0234 }
            m13350c((java.lang.String) r10)     // Catch:{ all -> 0x0234 }
            com.ironsource.mediationsdk.logger.IronSourceError r5 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x0234 }
            r6 = 524(0x20c, float:7.34E-43)
            r5.<init>(r6, r10)     // Catch:{ all -> 0x0234 }
            com.ironsource.mediationsdk.W r7 = com.ironsource.mediationsdk.C5615W.m13672a()     // Catch:{ all -> 0x0234 }
            r7.mo41621a((com.ironsource.mediationsdk.logger.IronSourceError) r5)     // Catch:{ all -> 0x0234 }
            java.lang.Object[][] r5 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0234 }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0234 }
            java.lang.String r8 = "errorCode"
            r7[r3] = r8     // Catch:{ all -> 0x0234 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0234 }
            r7[r4] = r6     // Catch:{ all -> 0x0234 }
            r5[r3] = r7     // Catch:{ all -> 0x0234 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0234 }
            java.lang.String r6 = "reason"
            r2[r3] = r6     // Catch:{ all -> 0x0234 }
            r2[r4] = r10     // Catch:{ all -> 0x0234 }
            r5[r4] = r2     // Catch:{ all -> 0x0234 }
            java.util.Map r10 = com.ironsource.environment.C5505a.C55061.m13073a((java.lang.Object[][]) r5)     // Catch:{ all -> 0x0234 }
            r9.m13349c(r1, r10)     // Catch:{ all -> 0x0234 }
            monitor-exit(r0)     // Catch:{ all -> 0x0234 }
            return
        L_0x0136:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ all -> 0x0234 }
            r2.<init>()     // Catch:{ all -> 0x0234 }
            com.ironsource.mediationsdk.ad r5 = r9.f12874a     // Catch:{ all -> 0x0234 }
            java.util.concurrent.CopyOnWriteArrayList r5 = r5.mo41715a()     // Catch:{ all -> 0x0234 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0234 }
        L_0x0145:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0234 }
            if (r6 == 0) goto L_0x0190
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0234 }
            com.ironsource.mediationsdk.G r6 = (com.ironsource.mediationsdk.C5564G) r6     // Catch:{ all -> 0x0234 }
            boolean r7 = r6.mo41426b()     // Catch:{ all -> 0x0234 }
            if (r7 == 0) goto L_0x0162
            r9.f12896w = r4     // Catch:{ all -> 0x0234 }
            r6.mo41424a((boolean) r4)     // Catch:{ all -> 0x0234 }
            com.ironsource.mediationsdk.F$a r3 = com.ironsource.mediationsdk.C5560F.C5563a.RV_STATE_NOT_LOADED     // Catch:{ all -> 0x0234 }
            r9.mo41401a((com.ironsource.mediationsdk.C5560F.C5563a) r3)     // Catch:{ all -> 0x0234 }
            goto L_0x0191
        L_0x0162:
            java.lang.Long r7 = r6.mo41610o()     // Catch:{ all -> 0x0234 }
            if (r7 == 0) goto L_0x018c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0234 }
            r7.<init>()     // Catch:{ all -> 0x0234 }
            java.lang.String r8 = r6.mo41606k()     // Catch:{ all -> 0x0234 }
            r7.append(r8)     // Catch:{ all -> 0x0234 }
            java.lang.String r8 = ":"
            r7.append(r8)     // Catch:{ all -> 0x0234 }
            java.lang.Long r8 = r6.mo41610o()     // Catch:{ all -> 0x0234 }
            r7.append(r8)     // Catch:{ all -> 0x0234 }
            java.lang.String r8 = ","
            r7.append(r8)     // Catch:{ all -> 0x0234 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0234 }
            r2.append(r7)     // Catch:{ all -> 0x0234 }
        L_0x018c:
            r6.mo41424a((boolean) r3)     // Catch:{ all -> 0x0234 }
            goto L_0x0145
        L_0x0190:
            r6 = 0
        L_0x0191:
            if (r6 != 0) goto L_0x01d3
            java.lang.String r10 = "showRewardedVideo(): No ads to show"
            m13343a((java.lang.String) r10)     // Catch:{ all -> 0x0234 }
            com.ironsource.mediationsdk.W r3 = com.ironsource.mediationsdk.C5615W.m13672a()     // Catch:{ all -> 0x0234 }
            java.lang.String r4 = "Rewarded Video"
            com.ironsource.mediationsdk.logger.IronSourceError r4 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoAdsToShowError(r4)     // Catch:{ all -> 0x0234 }
            r3.mo41621a((com.ironsource.mediationsdk.logger.IronSourceError) r4)     // Catch:{ all -> 0x0234 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0234 }
            r3.<init>()     // Catch:{ all -> 0x0234 }
            java.lang.String r4 = "errorCode"
            r5 = 509(0x1fd, float:7.13E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0234 }
            r3.put(r4, r5)     // Catch:{ all -> 0x0234 }
            java.lang.String r4 = "reason"
            r3.put(r4, r10)     // Catch:{ all -> 0x0234 }
            int r10 = r2.length()     // Catch:{ all -> 0x0234 }
            if (r10 == 0) goto L_0x01c9
            java.lang.String r10 = "ext1"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0234 }
            r3.put(r10, r2)     // Catch:{ all -> 0x0234 }
        L_0x01c9:
            r9.m13349c(r1, r3)     // Catch:{ all -> 0x0234 }
            com.ironsource.mediationsdk.Z r10 = r9.f12887n     // Catch:{ all -> 0x0234 }
            r10.mo41661c()     // Catch:{ all -> 0x0234 }
            monitor-exit(r0)     // Catch:{ all -> 0x0234 }
            return
        L_0x01d3:
            monitor-exit(r0)     // Catch:{ all -> 0x0234 }
            if (r6 == 0) goto L_0x0233
            java.lang.String r0 = "showVideo()"
            m13343a((java.lang.String) r0)
            com.ironsource.mediationsdk.utils.l r0 = r9.f12879f
            r0.mo42131a(r6)
            com.ironsource.mediationsdk.utils.l r0 = r9.f12879f
            boolean r0 = r0.mo42133b(r6)
            if (r0 == 0) goto L_0x0203
            r6.mo41428c_()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.mo41606k()
            r0.append(r1)
            java.lang.String r1 = " rewarded video is now session capped"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)
        L_0x0203:
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = r10.getPlacementName()
            com.ironsource.mediationsdk.utils.C5790c.m14296e(r0, r1)
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = r10.getPlacementName()
            boolean r0 = com.ironsource.mediationsdk.utils.C5790c.m14294c((android.content.Context) r0, (java.lang.String) r1)
            if (r0 == 0) goto L_0x0229
            r0 = 1400(0x578, float:1.962E-42)
            r9.m13348c((int) r0)
        L_0x0229:
            com.ironsource.mediationsdk.v r0 = com.ironsource.mediationsdk.C5807v.C5809a.f14128a
            r0.mo42138a()
            r6.mo41422a((com.ironsource.mediationsdk.model.Placement) r10)
        L_0x0233:
            return
        L_0x0234:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0234 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5560F.mo41405a(com.ironsource.mediationsdk.model.Placement):void");
    }

    /* renamed from: a */
    public final void mo41406a(List<C5782b> list, String str, C5782b bVar, JSONObject jSONObject, int i, long j) {
        m13343a("makeAuction(): success");
        this.f12885l = bVar;
        this.f12890q = i;
        this.f12886m = jSONObject;
        this.f12889p = "";
        m13344a(list, str, jSONObject);
        mo41408b((int) IronSourceConstants.RV_AUCTION_SUCCESS, C5505a.C55061.m13073a(new Object[][]{new Object[]{"duration", Long.valueOf(j)}}));
        m13353g();
    }

    /* renamed from: a */
    public final void mo41252a(boolean z) {
        if (this.f12892s) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            boolean z2 = true;
            logger.log(ironSourceTag, "Network Availability Changed To: " + z, 1);
            Boolean bool = this.f12898y;
            boolean z3 = false;
            if (bool != null) {
                if ((!z || bool.booleanValue() || !mo41407a_()) && (z || !this.f12898y.booleanValue())) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (z3) {
                m13345a(z, (Map<String, Object>) null);
            }
        }
    }

    /* renamed from: a_ */
    public final boolean mo41407a_() {
        if ((!this.f12892s || IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getApplicationContext())) && this.f12881h == C5563a.RV_STATE_READY_TO_SHOW && !this.f12896w) {
            Iterator<C5564G> it = this.f12874a.mo41715a().iterator();
            while (it.hasNext()) {
                if (it.next().mo41426b()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo41408b(int i, Map<String, Object> map) {
        m13340a(i, map, false, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011f, code lost:
        r11 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0127, code lost:
        if (r11.hasNext() == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0129, code lost:
        m13354g((com.ironsource.mediationsdk.C5564G) r11.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0133, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f4  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41409b(com.ironsource.mediationsdk.C5564G r11) {
        /*
            r10 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            java.lang.Object r1 = r10.f12882i
            monitor-enter(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r3 = "onLoadError mState="
            r2.<init>(r3)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.F$a r3 = r10.f12881h     // Catch:{ all -> 0x0187 }
            r2.append(r3)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0187 }
            m13342a((com.ironsource.mediationsdk.C5564G) r11, (java.lang.String) r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r11.f12908b     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.ad r3 = r10.f12874a     // Catch:{ all -> 0x0187 }
            java.lang.String r3 = r3.f13360b     // Catch:{ all -> 0x0187 }
            r4 = 1
            r5 = 0
            if (r2 != r3) goto L_0x0134
            com.ironsource.mediationsdk.F$a r2 = r10.f12881h     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.F$a r3 = com.ironsource.mediationsdk.C5560F.C5563a.RV_STATE_AUCTION_IN_PROGRESS     // Catch:{ all -> 0x0187 }
            if (r2 != r3) goto L_0x002d
            goto L_0x0134
        L_0x002d:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.h$a> r2 = r10.f12884k     // Catch:{ all -> 0x0187 }
            java.lang.String r3 = r11.mo41606k()     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.h$a r6 = com.ironsource.mediationsdk.C5697h.C5698a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x0187 }
            r2.put(r3, r6)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.F$a r2 = r10.f12881h     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.F$a r3 = com.ironsource.mediationsdk.C5560F.C5563a.RV_STATE_LOADING_SMASHES     // Catch:{ all -> 0x0187 }
            if (r2 == r3) goto L_0x0046
            com.ironsource.mediationsdk.F$a r2 = r10.f12881h     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.F$a r3 = com.ironsource.mediationsdk.C5560F.C5563a.RV_STATE_READY_TO_SHOW     // Catch:{ all -> 0x0187 }
            if (r2 == r3) goto L_0x0046
            monitor-exit(r1)     // Catch:{ all -> 0x0187 }
            return
        L_0x0046:
            com.ironsource.mediationsdk.ad r2 = r10.f12874a     // Catch:{ all -> 0x0187 }
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.mo41715a()     // Catch:{ all -> 0x0187 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0187 }
            r3 = 0
            r6 = 0
        L_0x0052:
            boolean r7 = r2.hasNext()     // Catch:{ all -> 0x0187 }
            if (r7 == 0) goto L_0x00fd
            java.lang.Object r7 = r2.next()     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.G r7 = (com.ironsource.mediationsdk.C5564G) r7     // Catch:{ all -> 0x0187 }
            boolean r8 = r7.f13194e     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00df
            boolean r8 = r10.f12895v     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00b7
            boolean r8 = r7.mo41603h()     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00b7
            if (r3 != 0) goto L_0x008f
            if (r6 == 0) goto L_0x0071
            goto L_0x008f
        L_0x0071:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = "Advanced Loading: Starting to load bidder "
            r8.<init>(r9)     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = r7.mo41606k()     // Catch:{ all -> 0x0187 }
            r8.append(r9)     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = ". No other instances will be loaded at the same time."
            r8.append(r9)     // Catch:{ all -> 0x0187 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0187 }
            m13343a((java.lang.String) r8)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r8)     // Catch:{ all -> 0x0187 }
            goto L_0x00b7
        L_0x008f:
            if (r3 == 0) goto L_0x0094
            java.lang.String r11 = "a non bidder is being loaded"
            goto L_0x0096
        L_0x0094:
            java.lang.String r11 = "a non bidder was already loaded successfully"
        L_0x0096:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r4 = "Advanced Loading: Won't start loading bidder "
            r2.<init>(r4)     // Catch:{ all -> 0x0187 }
            java.lang.String r4 = r7.mo41606k()     // Catch:{ all -> 0x0187 }
            r2.append(r4)     // Catch:{ all -> 0x0187 }
            java.lang.String r4 = " as "
            r2.append(r4)     // Catch:{ all -> 0x0187 }
            r2.append(r11)     // Catch:{ all -> 0x0187 }
            java.lang.String r11 = r2.toString()     // Catch:{ all -> 0x0187 }
            m13343a((java.lang.String) r11)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r11)     // Catch:{ all -> 0x0187 }
            goto L_0x00fd
        L_0x00b7:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.server.b> r8 = r10.f12883j     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = r7.mo41606k()     // Catch:{ all -> 0x0187 }
            java.lang.Object r8 = r8.get(r9)     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x0052
            r0.add(r7)     // Catch:{ all -> 0x0187 }
            boolean r8 = r10.f12895v     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00fd
            boolean r8 = r11.mo41603h()     // Catch:{ all -> 0x0187 }
            if (r8 == 0) goto L_0x00fd
            boolean r7 = r7.mo41603h()     // Catch:{ all -> 0x0187 }
            if (r7 != 0) goto L_0x00fd
            int r7 = r0.size()     // Catch:{ all -> 0x0187 }
            int r8 = r10.f12894u     // Catch:{ all -> 0x0187 }
            if (r7 >= r8) goto L_0x00fd
            goto L_0x00f1
        L_0x00df:
            com.ironsource.mediationsdk.G$a r8 = r7.f12907a     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.G$a r9 = com.ironsource.mediationsdk.C5564G.C5566a.INIT_IN_PROGRESS     // Catch:{ all -> 0x0187 }
            if (r8 == r9) goto L_0x00ee
            com.ironsource.mediationsdk.G$a r8 = r7.f12907a     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.G$a r9 = com.ironsource.mediationsdk.C5564G.C5566a.LOAD_IN_PROGRESS     // Catch:{ all -> 0x0187 }
            if (r8 != r9) goto L_0x00ec
            goto L_0x00ee
        L_0x00ec:
            r8 = 0
            goto L_0x00ef
        L_0x00ee:
            r8 = 1
        L_0x00ef:
            if (r8 == 0) goto L_0x00f4
        L_0x00f1:
            r3 = 1
            goto L_0x0052
        L_0x00f4:
            boolean r7 = r7.mo41426b()     // Catch:{ all -> 0x0187 }
            if (r7 == 0) goto L_0x0052
            r6 = 1
            goto L_0x0052
        L_0x00fd:
            int r11 = r0.size()     // Catch:{ all -> 0x0187 }
            if (r11 != 0) goto L_0x011e
            if (r6 != 0) goto L_0x011e
            if (r3 != 0) goto L_0x011e
            java.lang.String r11 = "onLoadError(): No other available smashes"
            m13343a((java.lang.String) r11)     // Catch:{ all -> 0x0187 }
            boolean r11 = r10.f12896w     // Catch:{ all -> 0x0187 }
            if (r11 != 0) goto L_0x0114
            r11 = 0
            r10.m13345a((boolean) r5, (java.util.Map<java.lang.String, java.lang.Object>) r11)     // Catch:{ all -> 0x0187 }
        L_0x0114:
            com.ironsource.mediationsdk.F$a r11 = com.ironsource.mediationsdk.C5560F.C5563a.RV_STATE_NOT_LOADED     // Catch:{ all -> 0x0187 }
            r10.mo41401a((com.ironsource.mediationsdk.C5560F.C5563a) r11)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.Z r11 = r10.f12887n     // Catch:{ all -> 0x0187 }
            r11.mo41662d()     // Catch:{ all -> 0x0187 }
        L_0x011e:
            monitor-exit(r1)     // Catch:{ all -> 0x0187 }
            java.util.Iterator r11 = r0.iterator()
        L_0x0123:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0133
            java.lang.Object r0 = r11.next()
            com.ironsource.mediationsdk.G r0 = (com.ironsource.mediationsdk.C5564G) r0
            r10.m13354g(r0)
            goto L_0x0123
        L_0x0133:
            return
        L_0x0134:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = "onLoadError was invoked with auctionId:"
            r0.<init>(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r11.f12908b     // Catch:{ all -> 0x0187 }
            r0.append(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = " and the current id is "
            r0.append(r2)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.ad r2 = r10.f12874a     // Catch:{ all -> 0x0187 }
            java.lang.String r2 = r2.f13360b     // Catch:{ all -> 0x0187 }
            r0.append(r2)     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0187 }
            m13343a((java.lang.String) r0)     // Catch:{ all -> 0x0187 }
            r0 = 81315(0x13da3, float:1.13947E-40)
            r2 = 2
            java.lang.Object[][] r3 = new java.lang.Object[r2][]     // Catch:{ all -> 0x0187 }
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0187 }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x0187 }
            r7 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0187 }
            r6[r4] = r7     // Catch:{ all -> 0x0187 }
            r3[r5] = r6     // Catch:{ all -> 0x0187 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0187 }
            java.lang.String r6 = "reason"
            r2[r5] = r6     // Catch:{ all -> 0x0187 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0187 }
            java.lang.String r6 = "loadError wrong auction ID "
            r5.<init>(r6)     // Catch:{ all -> 0x0187 }
            com.ironsource.mediationsdk.F$a r6 = r10.f12881h     // Catch:{ all -> 0x0187 }
            r5.append(r6)     // Catch:{ all -> 0x0187 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0187 }
            r2[r4] = r5     // Catch:{ all -> 0x0187 }
            r3[r4] = r2     // Catch:{ all -> 0x0187 }
            r11.mo41425b(r0, r3)     // Catch:{ all -> 0x0187 }
            monitor-exit(r1)     // Catch:{ all -> 0x0187 }
            return
        L_0x0187:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0187 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5560F.mo41409b(com.ironsource.mediationsdk.G):void");
    }

    /* renamed from: b */
    public final void mo41410b(C5564G g, Placement placement) {
        m13342a(g, "onRewardedVideoAdClicked");
        C5615W.m13672a().mo41626b(placement);
    }

    /* renamed from: c */
    public final void mo41411c() {
        m13343a("onLoadTriggered: RV load was triggered in " + this.f12881h + " state");
        m13341a(0);
    }

    /* renamed from: c */
    public final void mo41412c(C5564G g) {
        this.f12874a.mo41716a(g);
        this.f12880g++;
        m13342a(g, "onRewardedVideoAdOpened");
        C5615W.m13672a().mo41625b();
        m13345a(false, (Map<String, Object>) null);
        if (this.f12888o) {
            C5782b bVar = this.f12883j.get(g.mo41606k());
            if (bVar != null) {
                C5695g.m14021a(bVar, g.mo41604i(), this.f12885l, this.f12893t);
                this.f12884k.put(g.mo41606k(), C5697h.C5698a.ISAuctionPerformanceShowedSuccessfully);
                mo41914a(bVar, this.f12893t);
            } else {
                String k = g.mo41606k();
                m13346b("onRewardedVideoAdOpened showing instance " + k + " missing from waterfall");
                mo41408b((int) IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1011}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.f12881h}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}}));
            }
        }
        this.f12887n.mo41659a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo41413d() {
        mo41401a(C5563a.RV_STATE_NOT_LOADED);
        if (!this.f12896w) {
            m13345a(false, (Map<String, Object>) null);
        }
        this.f12887n.mo41662d();
    }

    /* renamed from: d */
    public final void mo41414d(C5564G g) {
        String str;
        m13342a(g, "onRewardedVideoAdClosed, mediation state: " + this.f12881h.name());
        C5615W.m13672a().mo41627c();
        this.f12896w = false;
        boolean z = this.f12881h == C5563a.RV_STATE_READY_TO_SHOW;
        StringBuilder sb = new StringBuilder();
        if (z) {
            Iterator<C5564G> it = this.f12874a.mo41715a().iterator();
            while (it.hasNext()) {
                C5564G next = it.next();
                if (next.f12907a == C5564G.C5566a.LOADED) {
                    sb.append(next.mo41606k() + ";");
                }
            }
        }
        Object[][] objArr = new Object[1][];
        Object[] objArr2 = new Object[2];
        objArr2[0] = IronSourceConstants.EVENTS_EXT1;
        StringBuilder sb2 = new StringBuilder("otherRVAvailable = ");
        if (sb.length() > 0) {
            str = "true|" + sb;
        } else {
            str = "false";
        }
        sb2.append(str);
        objArr2[1] = sb2.toString();
        objArr[0] = objArr2;
        g.mo41421a((int) IronSourceConstants.RV_INSTANCE_CLOSED, objArr);
        if (g.equals(this.f12874a.f13361c)) {
            this.f12874a.mo41716a((C5564G) null);
            if (this.f12881h != C5563a.RV_STATE_READY_TO_SHOW) {
                m13345a(false, (Map<String, Object>) null);
            }
        }
    }

    /* renamed from: d_ */
    public final void mo41415d_() {
        mo41401a(C5563a.RV_STATE_NOT_LOADED);
        m13345a(false, C5505a.C55061.m13073a(new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "loaded ads are expired"}}));
        m13341a(0);
    }

    /* renamed from: e */
    public final void mo41416e(C5564G g) {
        m13342a(g, "onRewardedVideoAdStarted");
        C5615W.m13672a().mo41628d();
    }

    /* renamed from: f */
    public final void mo41417f(C5564G g) {
        m13342a(g, "onRewardedVideoAdEnded");
        C5615W.m13672a().mo41629e();
    }
}
