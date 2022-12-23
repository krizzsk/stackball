package com.ironsource.mediationsdk;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C5697h;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C5726j;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.p137a.C5641c;
import com.ironsource.mediationsdk.p137a.C5642d;
import com.ironsource.mediationsdk.server.C5782b;
import com.ironsource.mediationsdk.utils.C5789b;
import com.ironsource.mediationsdk.utils.C5802l;
import com.ironsource.mediationsdk.utils.C5804m;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.O */
final class C5589O extends C5716m implements C5593P, C5694f, C5810w {

    /* renamed from: a */
    C5802l f13077a;

    /* renamed from: b */
    final ConcurrentHashMap<String, C5594Q> f13078b;

    /* renamed from: c */
    String f13079c;

    /* renamed from: d */
    JSONObject f13080d;

    /* renamed from: e */
    C5695g f13081e;

    /* renamed from: f */
    C5697h f13082f;

    /* renamed from: g */
    long f13083g;

    /* renamed from: h */
    long f13084h;

    /* renamed from: i */
    private C5592a f13085i;

    /* renamed from: j */
    private CopyOnWriteArrayList<C5594Q> f13086j;

    /* renamed from: k */
    private ConcurrentHashMap<String, C5782b> f13087k;

    /* renamed from: l */
    private ConcurrentHashMap<String, C5697h.C5698a> f13088l;

    /* renamed from: m */
    private C5782b f13089m;

    /* renamed from: n */
    private String f13090n;

    /* renamed from: o */
    private int f13091o;

    /* renamed from: p */
    private boolean f13092p;

    /* renamed from: q */
    private boolean f13093q;

    /* renamed from: r */
    private long f13094r;

    /* renamed from: s */
    private int f13095s;

    /* renamed from: t */
    private String f13096t = "";

    /* renamed from: u */
    private boolean f13097u = false;

    /* renamed from: com.ironsource.mediationsdk.O$a */
    enum C5592a {
        STATE_NOT_INITIALIZED,
        STATE_READY_TO_LOAD,
        STATE_AUCTION,
        STATE_LOADING_SMASHES,
        STATE_READY_TO_SHOW,
        STATE_SHOWING
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5589O(List<NetworkSettings> list, C5726j jVar, String str, String str2, int i, HashSet<ImpressionDataListener> hashSet) {
        super(hashSet);
        C5726j jVar2 = jVar;
        long time = new Date().getTime();
        m13510a((int) IronSourceConstants.IS_MANAGER_INIT_STARTED);
        mo41551a(C5592a.STATE_NOT_INITIALIZED);
        this.f13078b = new ConcurrentHashMap<>();
        this.f13086j = new CopyOnWriteArrayList<>();
        this.f13087k = new ConcurrentHashMap<>();
        this.f13088l = new ConcurrentHashMap<>();
        this.f13090n = "";
        this.f13079c = "";
        this.f13080d = null;
        this.f13091o = jVar2.f13751c;
        this.f13092p = jVar2.f13752d;
        C5736n.m14120a().f13807b = i;
        C5789b bVar = jVar2.f13757i;
        this.f13084h = bVar.f13921i;
        boolean z = bVar.f13917e > 0;
        this.f13093q = z;
        if (z) {
            this.f13081e = new C5695g("interstitial", bVar, this);
        }
        ArrayList arrayList = new ArrayList();
        for (NetworkSettings next : list) {
            AbstractAdapter a = C5685c.m13965a().mo41824a(next, next.getInterstitialSettings(), false, false);
            if (a != null) {
                C5689d a2 = C5689d.m13994a();
                if (a2.mo41843a(a, a2.f13543a, "interstitial")) {
                    C5594Q q = r0;
                    C5594Q q2 = new C5594Q(str, str2, next, this, jVar2.f13753e, a);
                    String k = q.mo41606k();
                    this.f13078b.put(k, q);
                    arrayList.add(k);
                }
            }
        }
        this.f13082f = new C5697h(arrayList, bVar.f13918f);
        this.f13077a = new C5802l(new ArrayList(this.f13078b.values()));
        for (C5594Q next2 : this.f13078b.values()) {
            if (next2.mo41603h()) {
                next2.mo41570b();
            }
        }
        this.f13083g = new Date().getTime();
        mo41551a(C5592a.STATE_READY_TO_LOAD);
        m13514a((int) IronSourceConstants.IS_MANAGER_INIT_ENDED, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - time)}});
    }

    /* renamed from: a */
    private String m13509a(C5782b bVar) {
        C5594Q q = this.f13078b.get(bVar.mo42082a());
        String num = q != null ? Integer.toString(q.mo41604i()) : TextUtils.isEmpty(bVar.mo42083b()) ? "1" : "2";
        return num + bVar.mo42082a();
    }

    /* renamed from: a */
    private void m13510a(int i) {
        m13515a(i, (Object[][]) null, false);
    }

    /* renamed from: a */
    private void m13511a(int i, C5594Q q) {
        m13513a(i, q, (Object[][]) null, false);
    }

    /* renamed from: a */
    private void m13512a(int i, C5594Q q, Object[][] objArr) {
        m13513a(i, q, objArr, false);
    }

    /* renamed from: a */
    private void m13513a(int i, C5594Q q, Object[][] objArr, boolean z) {
        Map<String, Object> n = q.mo41609n();
        if (!TextUtils.isEmpty(this.f13079c)) {
            n.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f13079c);
        }
        JSONObject jSONObject = this.f13080d;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f13080d);
        }
        if (z && !TextUtils.isEmpty(this.f13090n)) {
            n.put("placement", this.f13090n);
        }
        if (m13525c(i)) {
            C5642d.m13798e();
            C5642d.m13758a(n, this.f13095s, this.f13096t);
        }
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "IS sendProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        C5642d.m13798e().mo41689b(new C5641c(i, new JSONObject(n)));
    }

    /* renamed from: a */
    private void m13514a(int i, Object[][] objArr) {
        m13515a(i, objArr, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13515a(int i, Object[][] objArr, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        if (!TextUtils.isEmpty(this.f13079c)) {
            hashMap.put(IronSourceConstants.EVENTS_AUCTION_ID, this.f13079c);
        }
        JSONObject jSONObject = this.f13080d;
        if (jSONObject != null && jSONObject.length() > 0) {
            hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f13080d);
        }
        if (z && !TextUtils.isEmpty(this.f13090n)) {
            hashMap.put("placement", this.f13090n);
        }
        if (m13525c(i)) {
            C5642d.m13798e();
            C5642d.m13758a((Map<String, Object>) hashMap, this.f13095s, this.f13096t);
        }
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    hashMap.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                m13523b("sendMediationEvent " + e.getMessage());
            }
        }
        C5642d.m13798e().mo41689b(new C5641c(i, new JSONObject(hashMap)));
    }

    /* renamed from: a */
    private static void m13517a(C5594Q q, String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgIsManager " + q.mo41606k() + " : " + str, 0);
    }

    /* renamed from: a */
    private void m13518a(List<C5782b> list) {
        this.f13086j.clear();
        this.f13087k.clear();
        this.f13088l.clear();
        StringBuilder sb = new StringBuilder();
        for (C5782b next : list) {
            sb.append(m13509a(next) + ",");
            C5594Q q = this.f13078b.get(next.mo42082a());
            if (q != null) {
                q.f13194e = true;
                this.f13086j.add(q);
                this.f13087k.put(q.mo41606k(), next);
                this.f13088l.put(next.mo42082a(), C5697h.C5698a.ISAuctionPerformanceDidntAttemptToLoad);
            } else {
                m13523b("updateWaterfall() - could not find matching smash for auction response item " + next.mo42082a());
            }
        }
        m13523b("updateWaterfall() - next waterfall is " + sb.toString());
        if (sb.length() == 0) {
            m13523b("Updated waterfall is empty");
        }
        m13514a((int) IronSourceConstants.IS_RESULT_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb.toString()}});
    }

    /* renamed from: b */
    private void m13519b(int i) {
        m13515a(i, (Object[][]) null, true);
    }

    /* renamed from: b */
    private void m13520b(int i, C5594Q q) {
        m13513a(i, q, (Object[][]) null, true);
    }

    /* renamed from: b */
    private void m13521b(int i, C5594Q q, Object[][] objArr) {
        m13513a(i, q, objArr, true);
    }

    /* renamed from: b */
    private void m13522b(int i, Object[][] objArr) {
        m13515a((int) IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, objArr, true);
    }

    /* renamed from: b */
    static void m13523b(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "ProgIsManager " + str, 0);
    }

    /* renamed from: c */
    private static void m13524c(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, str, 3);
    }

    /* renamed from: c */
    private static boolean m13525c(int i) {
        return i == 2002 || i == 2003 || i == 2200 || i == 2213 || i == 2005 || i == 2204 || i == 2201 || i == 2203 || i == 2006 || i == 2004 || i == 2110 || i == 2301 || i == 2300;
    }

    /* renamed from: f */
    private void m13526f() {
        List<C5782b> g = m13527g();
        this.f13079c = m14099b();
        m13518a(g);
    }

    /* renamed from: g */
    private List<C5782b> m13527g() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (C5594Q next : this.f13078b.values()) {
            if (!next.mo41603h() && !this.f13077a.mo42133b(next)) {
                copyOnWriteArrayList.add(new C5782b(next.mo41606k()));
            }
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: g */
    private void m13528g(C5594Q q) {
        String b = this.f13087k.get(q.mo41606k()).mo42083b();
        q.mo41602b(b);
        m13511a(2002, q);
        q.mo41569a(b);
    }

    /* renamed from: h */
    private void m13529h() {
        if (this.f13086j.isEmpty()) {
            mo41551a(C5592a.STATE_READY_TO_LOAD);
            m13515a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1035}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Empty waterfall"}}, false);
            C5736n.m14120a().mo41990a(new IronSourceError(1035, "Empty waterfall"));
            return;
        }
        mo41551a(C5592a.STATE_LOADING_SMASHES);
        int i = 0;
        for (int i2 = 0; i2 < this.f13086j.size() && i < this.f13091o; i2++) {
            C5594Q q = this.f13086j.get(i2);
            if (q.f13194e) {
                if (!this.f13092p || !q.mo41603h()) {
                    m13528g(q);
                    i++;
                } else if (i == 0) {
                    String str = "Advanced Loading: Starting to load bidder " + q.mo41606k() + ". No other instances will be loaded at the same time.";
                    m13523b(str);
                    IronSourceUtils.sendAutomationLog(str);
                    m13528g(q);
                    return;
                } else {
                    String str2 = "Advanced Loading: Won't start loading bidder " + q.mo41606k() + " as a non bidder is being loaded";
                    m13523b(str2);
                    IronSourceUtils.sendAutomationLog(str2);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo41398a(int i, String str, int i2, String str2, long j) {
        String str3 = "Auction failed | moving to fallback waterfall (error " + i + " - " + str + ")";
        m13523b(str3);
        IronSourceUtils.sendAutomationLog("IS: " + str3);
        this.f13095s = i2;
        this.f13096t = str2;
        this.f13080d = null;
        m13526f();
        if (TextUtils.isEmpty(str)) {
            m13514a((int) IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"duration", Long.valueOf(j)}});
        } else {
            m13514a((int) IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, str}, new Object[]{"duration", Long.valueOf(j)}});
        }
        m13529h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41551a(C5592a aVar) {
        this.f13085i = aVar;
        m13523b("state=" + aVar);
    }

    /* renamed from: a */
    public final void mo41552a(C5594Q q) {
        synchronized (this) {
            m13517a(q, "onInterstitialAdOpened");
            C5543A.m13206a().mo41284c();
            m13520b(2005, q);
            if (this.f13093q) {
                C5782b bVar = this.f13087k.get(q.mo41606k());
                if (bVar != null) {
                    C5695g.m14021a(bVar, q.mo41604i(), this.f13089m, this.f13090n);
                    this.f13088l.put(q.mo41606k(), C5697h.C5698a.ISAuctionPerformanceShowedSuccessfully);
                    mo41914a(bVar, this.f13090n);
                } else {
                    String k = q.mo41606k();
                    m13523b("onInterstitialAdOpened showing instance " + k + " missing from waterfall");
                    Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, 1011};
                    m13514a((int) IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, new Object[][]{objArr, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Showing missing " + this.f13085i}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo41553a(C5594Q q, long j) {
        C5594Q q2 = q;
        synchronized (this) {
            m13517a(q2, "onInterstitialAdReady");
            m13512a(2003, q2, new Object[][]{new Object[]{"duration", Long.valueOf(j)}});
            if (this.f13088l.containsKey(q.mo41606k())) {
                this.f13088l.put(q.mo41606k(), C5697h.C5698a.ISAuctionPerformanceLoadedSuccessfully);
            }
            if (this.f13085i == C5592a.STATE_LOADING_SMASHES) {
                mo41551a(C5592a.STATE_READY_TO_SHOW);
                C5543A.m13206a().mo41282b();
                m13514a(2004, new Object[][]{new Object[]{"duration", Long.valueOf(new Date().getTime() - this.f13094r)}});
                if (this.f13093q) {
                    C5782b bVar = this.f13087k.get(q.mo41606k());
                    if (bVar != null) {
                        C5695g.m14020a(bVar, q.mo41604i(), this.f13089m);
                        this.f13081e.mo41851a((CopyOnWriteArrayList<C5606U>) this.f13086j, this.f13087k, q.mo41604i(), this.f13089m, bVar);
                    } else {
                        String k = q.mo41606k();
                        m13523b("onInterstitialAdReady winner instance " + k + " missing from waterfall");
                        m13514a((int) IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1010}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, "Loaded missing"}, new Object[]{IronSourceConstants.EVENTS_EXT1, k}});
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo41554a(IronSourceError ironSourceError, C5594Q q) {
        synchronized (this) {
            m13517a(q, "onInterstitialAdShowFailed error=" + ironSourceError.getErrorMessage());
            C5543A.m13206a().mo41283b(ironSourceError);
            m13521b(IronSourceConstants.IS_INSTANCE_SHOW_FAILED, q, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
            this.f13088l.put(q.mo41606k(), C5697h.C5698a.ISAuctionPerformanceFailedToShow);
            mo41551a(C5592a.STATE_READY_TO_LOAD);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f0, code lost:
        if (r11 == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f2, code lost:
        r9 = "a non bidder is being loaded";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f5, code lost:
        r9 = "a non bidder was already loaded successfully";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f7, code lost:
        r9 = "Advanced Loading: Won't start loading bidder " + r1.mo41606k() + " as " + r9;
        m13523b(r9);
        com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r9);
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0149  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41555a(com.ironsource.mediationsdk.logger.IronSourceError r9, com.ironsource.mediationsdk.C5594Q r10, long r11) {
        /*
            r8 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b7 }
            java.lang.String r2 = "onInterstitialAdLoadFailed error="
            r1.<init>(r2)     // Catch:{ all -> 0x01b7 }
            java.lang.String r2 = r9.getErrorMessage()     // Catch:{ all -> 0x01b7 }
            r1.append(r2)     // Catch:{ all -> 0x01b7 }
            java.lang.String r2 = " state="
            r1.append(r2)     // Catch:{ all -> 0x01b7 }
            com.ironsource.mediationsdk.O$a r2 = r8.f13085i     // Catch:{ all -> 0x01b7 }
            java.lang.String r2 = r2.name()     // Catch:{ all -> 0x01b7 }
            r1.append(r2)     // Catch:{ all -> 0x01b7 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01b7 }
            m13517a((com.ironsource.mediationsdk.C5594Q) r10, (java.lang.String) r1)     // Catch:{ all -> 0x01b7 }
            int r1 = r9.getErrorCode()     // Catch:{ all -> 0x01b7 }
            r2 = 1158(0x486, float:1.623E-42)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 != r2) goto L_0x005c
            r1 = 2213(0x8a5, float:3.101E-42)
            java.lang.Object[][] r2 = new java.lang.Object[r3][]     // Catch:{ all -> 0x01b7 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b7 }
            java.lang.String r7 = "errorCode"
            r6[r4] = r7     // Catch:{ all -> 0x01b7 }
            int r9 = r9.getErrorCode()     // Catch:{ all -> 0x01b7 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01b7 }
            r6[r5] = r9     // Catch:{ all -> 0x01b7 }
            r2[r4] = r6     // Catch:{ all -> 0x01b7 }
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b7 }
            java.lang.String r6 = "duration"
            r9[r4] = r6     // Catch:{ all -> 0x01b7 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01b7 }
            r9[r5] = r11     // Catch:{ all -> 0x01b7 }
            r2[r5] = r9     // Catch:{ all -> 0x01b7 }
            r8.m13512a((int) r1, (com.ironsource.mediationsdk.C5594Q) r10, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x01b7 }
            goto L_0x0092
        L_0x005c:
            r1 = 2200(0x898, float:3.083E-42)
            r2 = 3
            java.lang.Object[][] r2 = new java.lang.Object[r2][]     // Catch:{ all -> 0x01b7 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b7 }
            java.lang.String r7 = "errorCode"
            r6[r4] = r7     // Catch:{ all -> 0x01b7 }
            int r7 = r9.getErrorCode()     // Catch:{ all -> 0x01b7 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x01b7 }
            r6[r5] = r7     // Catch:{ all -> 0x01b7 }
            r2[r4] = r6     // Catch:{ all -> 0x01b7 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b7 }
            java.lang.String r7 = "reason"
            r6[r4] = r7     // Catch:{ all -> 0x01b7 }
            java.lang.String r9 = r9.getErrorMessage()     // Catch:{ all -> 0x01b7 }
            r6[r5] = r9     // Catch:{ all -> 0x01b7 }
            r2[r5] = r6     // Catch:{ all -> 0x01b7 }
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b7 }
            java.lang.String r6 = "duration"
            r9[r4] = r6     // Catch:{ all -> 0x01b7 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x01b7 }
            r9[r5] = r11     // Catch:{ all -> 0x01b7 }
            r2[r3] = r9     // Catch:{ all -> 0x01b7 }
            r8.m13512a((int) r1, (com.ironsource.mediationsdk.C5594Q) r10, (java.lang.Object[][]) r2)     // Catch:{ all -> 0x01b7 }
        L_0x0092:
            if (r10 == 0) goto L_0x00ab
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.h$a> r9 = r8.f13088l     // Catch:{ all -> 0x01b7 }
            java.lang.String r11 = r10.mo41606k()     // Catch:{ all -> 0x01b7 }
            boolean r9 = r9.containsKey(r11)     // Catch:{ all -> 0x01b7 }
            if (r9 == 0) goto L_0x00ab
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ironsource.mediationsdk.h$a> r9 = r8.f13088l     // Catch:{ all -> 0x01b7 }
            java.lang.String r11 = r10.mo41606k()     // Catch:{ all -> 0x01b7 }
            com.ironsource.mediationsdk.h$a r12 = com.ironsource.mediationsdk.C5697h.C5698a.ISAuctionPerformanceFailedToLoad     // Catch:{ all -> 0x01b7 }
            r9.put(r11, r12)     // Catch:{ all -> 0x01b7 }
        L_0x00ab:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.Q> r9 = r8.f13086j     // Catch:{ all -> 0x01b7 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x01b7 }
            r11 = 0
            r12 = 0
        L_0x00b3:
            boolean r1 = r9.hasNext()     // Catch:{ all -> 0x01b7 }
            if (r1 == 0) goto L_0x0152
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x01b7 }
            com.ironsource.mediationsdk.Q r1 = (com.ironsource.mediationsdk.C5594Q) r1     // Catch:{ all -> 0x01b7 }
            boolean r2 = r1.f13194e     // Catch:{ all -> 0x01b7 }
            if (r2 == 0) goto L_0x0134
            boolean r2 = r8.f13092p     // Catch:{ all -> 0x01b7 }
            if (r2 == 0) goto L_0x0118
            boolean r2 = r1.mo41603h()     // Catch:{ all -> 0x01b7 }
            if (r2 == 0) goto L_0x0118
            if (r11 != 0) goto L_0x00f0
            if (r12 == 0) goto L_0x00d2
            goto L_0x00f0
        L_0x00d2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b7 }
            java.lang.String r6 = "Advanced Loading: Starting to load bidder "
            r2.<init>(r6)     // Catch:{ all -> 0x01b7 }
            java.lang.String r6 = r1.mo41606k()     // Catch:{ all -> 0x01b7 }
            r2.append(r6)     // Catch:{ all -> 0x01b7 }
            java.lang.String r6 = ". No other instances will be loaded at the same time."
            r2.append(r6)     // Catch:{ all -> 0x01b7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01b7 }
            m13523b((java.lang.String) r2)     // Catch:{ all -> 0x01b7 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r2)     // Catch:{ all -> 0x01b7 }
            goto L_0x0118
        L_0x00f0:
            if (r11 == 0) goto L_0x00f5
            java.lang.String r9 = "a non bidder is being loaded"
            goto L_0x00f7
        L_0x00f5:
            java.lang.String r9 = "a non bidder was already loaded successfully"
        L_0x00f7:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b7 }
            java.lang.String r12 = "Advanced Loading: Won't start loading bidder "
            r10.<init>(r12)     // Catch:{ all -> 0x01b7 }
            java.lang.String r12 = r1.mo41606k()     // Catch:{ all -> 0x01b7 }
            r10.append(r12)     // Catch:{ all -> 0x01b7 }
            java.lang.String r12 = " as "
            r10.append(r12)     // Catch:{ all -> 0x01b7 }
            r10.append(r9)     // Catch:{ all -> 0x01b7 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x01b7 }
            m13523b((java.lang.String) r9)     // Catch:{ all -> 0x01b7 }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r9)     // Catch:{ all -> 0x01b7 }
            goto L_0x0152
        L_0x0118:
            r0.add(r1)     // Catch:{ all -> 0x01b7 }
            boolean r2 = r8.f13092p     // Catch:{ all -> 0x01b7 }
            if (r2 == 0) goto L_0x0152
            boolean r2 = r10.mo41603h()     // Catch:{ all -> 0x01b7 }
            if (r2 == 0) goto L_0x0152
            boolean r1 = r1.mo41603h()     // Catch:{ all -> 0x01b7 }
            if (r1 != 0) goto L_0x0152
            int r1 = r0.size()     // Catch:{ all -> 0x01b7 }
            int r2 = r8.f13091o     // Catch:{ all -> 0x01b7 }
            if (r1 >= r2) goto L_0x0152
            goto L_0x0146
        L_0x0134:
            com.ironsource.mediationsdk.Q$a r2 = r1.f13107a     // Catch:{ all -> 0x01b7 }
            com.ironsource.mediationsdk.Q$a r6 = com.ironsource.mediationsdk.C5594Q.C5596a.INIT_IN_PROGRESS     // Catch:{ all -> 0x01b7 }
            if (r2 == r6) goto L_0x0143
            com.ironsource.mediationsdk.Q$a r2 = r1.f13107a     // Catch:{ all -> 0x01b7 }
            com.ironsource.mediationsdk.Q$a r6 = com.ironsource.mediationsdk.C5594Q.C5596a.LOAD_IN_PROGRESS     // Catch:{ all -> 0x01b7 }
            if (r2 != r6) goto L_0x0141
            goto L_0x0143
        L_0x0141:
            r2 = 0
            goto L_0x0144
        L_0x0143:
            r2 = 1
        L_0x0144:
            if (r2 == 0) goto L_0x0149
        L_0x0146:
            r11 = 1
            goto L_0x00b3
        L_0x0149:
            boolean r1 = r1.mo41573g()     // Catch:{ all -> 0x01b7 }
            if (r1 == 0) goto L_0x00b3
            r12 = 1
            goto L_0x00b3
        L_0x0152:
            int r9 = r0.size()     // Catch:{ all -> 0x01b7 }
            if (r9 != 0) goto L_0x018a
            com.ironsource.mediationsdk.O$a r9 = r8.f13085i     // Catch:{ all -> 0x01b7 }
            com.ironsource.mediationsdk.O$a r10 = com.ironsource.mediationsdk.C5589O.C5592a.STATE_LOADING_SMASHES     // Catch:{ all -> 0x01b7 }
            if (r9 != r10) goto L_0x018a
            if (r11 != 0) goto L_0x018a
            com.ironsource.mediationsdk.n r9 = com.ironsource.mediationsdk.C5736n.m14120a()     // Catch:{ all -> 0x01b7 }
            com.ironsource.mediationsdk.logger.IronSourceError r10 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01b7 }
            java.lang.String r11 = "No ads to show"
            r12 = 509(0x1fd, float:7.13E-43)
            r10.<init>(r12, r11)     // Catch:{ all -> 0x01b7 }
            r9.mo41990a((com.ironsource.mediationsdk.logger.IronSourceError) r10)     // Catch:{ all -> 0x01b7 }
            r9 = 2110(0x83e, float:2.957E-42)
            java.lang.Object[][] r10 = new java.lang.Object[r5][]     // Catch:{ all -> 0x01b7 }
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ all -> 0x01b7 }
            java.lang.String r1 = "errorCode"
            r11[r4] = r1     // Catch:{ all -> 0x01b7 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x01b7 }
            r11[r5] = r12     // Catch:{ all -> 0x01b7 }
            r10[r4] = r11     // Catch:{ all -> 0x01b7 }
            r8.m13514a((int) r9, (java.lang.Object[][]) r10)     // Catch:{ all -> 0x01b7 }
            com.ironsource.mediationsdk.O$a r9 = com.ironsource.mediationsdk.C5589O.C5592a.STATE_READY_TO_LOAD     // Catch:{ all -> 0x01b7 }
            r8.mo41551a((com.ironsource.mediationsdk.C5589O.C5592a) r9)     // Catch:{ all -> 0x01b7 }
        L_0x018a:
            monitor-exit(r8)     // Catch:{ all -> 0x01b7 }
            com.ironsource.mediationsdk.logger.IronLog r9 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "smashesToLoad.size() = "
            r10.<init>(r11)
            int r11 = r0.size()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.verbose(r10)
            java.util.Iterator r9 = r0.iterator()
        L_0x01a6:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01b6
            java.lang.Object r10 = r9.next()
            com.ironsource.mediationsdk.Q r10 = (com.ironsource.mediationsdk.C5594Q) r10
            r8.m13528g(r10)
            goto L_0x01a6
        L_0x01b6:
            return
        L_0x01b7:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01b7 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5589O.mo41555a(com.ironsource.mediationsdk.logger.IronSourceError, com.ironsource.mediationsdk.Q, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0190, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41556a(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            com.ironsource.mediationsdk.O$a r0 = r8.f13085i     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.O$a r1 = com.ironsource.mediationsdk.C5589O.C5592a.STATE_SHOWING     // Catch:{ all -> 0x01db }
            r2 = 2111(0x83f, float:2.958E-42)
            r3 = 1
            r4 = 2
            r5 = 0
            if (r0 != r1) goto L_0x003e
            java.lang.String r9 = "showInterstitial error: can't show ad while an ad is already showing"
            m13524c((java.lang.String) r9)     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01db }
            r1 = 1036(0x40c, float:1.452E-42)
            r0.<init>(r1, r9)     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.A r6 = com.ironsource.mediationsdk.C5543A.m13206a()     // Catch:{ all -> 0x01db }
            r6.mo41283b(r0)     // Catch:{ all -> 0x01db }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01db }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x01db }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x01db }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01db }
            r6[r3] = r1     // Catch:{ all -> 0x01db }
            r0[r5] = r6     // Catch:{ all -> 0x01db }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01db }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01db }
            r1[r3] = r9     // Catch:{ all -> 0x01db }
            r0[r3] = r1     // Catch:{ all -> 0x01db }
            r8.m13515a((int) r2, (java.lang.Object[][]) r0, (boolean) r5)     // Catch:{ all -> 0x01db }
            monitor-exit(r8)
            return
        L_0x003e:
            com.ironsource.mediationsdk.O$a r0 = r8.f13085i     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.O$a r1 = com.ironsource.mediationsdk.C5589O.C5592a.STATE_READY_TO_SHOW     // Catch:{ all -> 0x01db }
            r6 = 509(0x1fd, float:7.13E-43)
            if (r0 == r1) goto L_0x008d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01db }
            java.lang.String r0 = "showInterstitial() error state="
            r9.<init>(r0)     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.O$a r0 = r8.f13085i     // Catch:{ all -> 0x01db }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01db }
            r9.append(r0)     // Catch:{ all -> 0x01db }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x01db }
            m13523b((java.lang.String) r9)     // Catch:{ all -> 0x01db }
            java.lang.String r9 = "showInterstitial error: show called while no ads are available"
            m13524c((java.lang.String) r9)     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01db }
            r0.<init>(r6, r9)     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.A r1 = com.ironsource.mediationsdk.C5543A.m13206a()     // Catch:{ all -> 0x01db }
            r1.mo41283b(r0)     // Catch:{ all -> 0x01db }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01db }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01db }
            java.lang.String r7 = "errorCode"
            r1[r5] = r7     // Catch:{ all -> 0x01db }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01db }
            r1[r3] = r6     // Catch:{ all -> 0x01db }
            r0[r5] = r1     // Catch:{ all -> 0x01db }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01db }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01db }
            r1[r3] = r9     // Catch:{ all -> 0x01db }
            r0[r3] = r1     // Catch:{ all -> 0x01db }
            r8.m13514a((int) r2, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01db }
            monitor-exit(r8)
            return
        L_0x008d:
            if (r9 != 0) goto L_0x00c1
            java.lang.String r9 = "showInterstitial error: empty default placement"
            m13524c((java.lang.String) r9)     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01db }
            r1 = 1020(0x3fc, float:1.43E-42)
            r0.<init>(r1, r9)     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.A r6 = com.ironsource.mediationsdk.C5543A.m13206a()     // Catch:{ all -> 0x01db }
            r6.mo41283b(r0)     // Catch:{ all -> 0x01db }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01db }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x01db }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x01db }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01db }
            r6[r3] = r1     // Catch:{ all -> 0x01db }
            r0[r5] = r6     // Catch:{ all -> 0x01db }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01db }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01db }
            r1[r3] = r9     // Catch:{ all -> 0x01db }
            r0[r3] = r1     // Catch:{ all -> 0x01db }
            r8.m13514a((int) r2, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01db }
            monitor-exit(r8)
            return
        L_0x00c1:
            r8.f13090n = r9     // Catch:{ all -> 0x01db }
            r9 = 2100(0x834, float:2.943E-42)
            r8.m13519b((int) r9)     // Catch:{ all -> 0x01db }
            com.ironsource.environment.ContextProvider r9 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x01db }
            android.content.Context r9 = r9.getApplicationContext()     // Catch:{ all -> 0x01db }
            java.lang.String r0 = r8.f13090n     // Catch:{ all -> 0x01db }
            boolean r9 = com.ironsource.mediationsdk.utils.C5790c.m14285a((android.content.Context) r9, (java.lang.String) r0)     // Catch:{ all -> 0x01db }
            if (r9 == 0) goto L_0x011d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01db }
            java.lang.String r0 = "placement "
            r9.<init>(r0)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = r8.f13090n     // Catch:{ all -> 0x01db }
            r9.append(r0)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = " is capped"
            r9.append(r0)     // Catch:{ all -> 0x01db }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x01db }
            m13524c((java.lang.String) r9)     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.logger.IronSourceError r0 = new com.ironsource.mediationsdk.logger.IronSourceError     // Catch:{ all -> 0x01db }
            r1 = 524(0x20c, float:7.34E-43)
            r0.<init>(r1, r9)     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.A r6 = com.ironsource.mediationsdk.C5543A.m13206a()     // Catch:{ all -> 0x01db }
            r6.mo41283b(r0)     // Catch:{ all -> 0x01db }
            java.lang.Object[][] r0 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01db }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x01db }
            java.lang.String r7 = "errorCode"
            r6[r5] = r7     // Catch:{ all -> 0x01db }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x01db }
            r6[r3] = r1     // Catch:{ all -> 0x01db }
            r0[r5] = r6     // Catch:{ all -> 0x01db }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x01db }
            java.lang.String r4 = "reason"
            r1[r5] = r4     // Catch:{ all -> 0x01db }
            r1[r3] = r9     // Catch:{ all -> 0x01db }
            r0[r3] = r1     // Catch:{ all -> 0x01db }
            r8.m13522b((int) r2, (java.lang.Object[][]) r0)     // Catch:{ all -> 0x01db }
            monitor-exit(r8)
            return
        L_0x011d:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.Q> r9 = r8.f13086j     // Catch:{ all -> 0x01db }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x01db }
        L_0x0123:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x01db }
            if (r0 == 0) goto L_0x01ad
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.Q r0 = (com.ironsource.mediationsdk.C5594Q) r0     // Catch:{ all -> 0x01db }
            boolean r1 = r0.mo41573g()     // Catch:{ all -> 0x01db }
            if (r1 == 0) goto L_0x0191
            java.lang.String r9 = r8.f13090n     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.O$a r1 = com.ironsource.mediationsdk.C5589O.C5592a.STATE_SHOWING     // Catch:{ all -> 0x01db }
            r8.mo41551a((com.ironsource.mediationsdk.C5589O.C5592a) r1)     // Catch:{ all -> 0x01db }
            r0.mo41571c()     // Catch:{ all -> 0x01db }
            r1 = 2201(0x899, float:3.084E-42)
            r8.m13520b((int) r1, (com.ironsource.mediationsdk.C5594Q) r0)     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.utils.l r1 = r8.f13077a     // Catch:{ all -> 0x01db }
            r1.mo42131a(r0)     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.utils.l r1 = r8.f13077a     // Catch:{ all -> 0x01db }
            boolean r1 = r1.mo42133b(r0)     // Catch:{ all -> 0x01db }
            if (r1 == 0) goto L_0x0171
            r0.mo41572f()     // Catch:{ all -> 0x01db }
            r1 = 2401(0x961, float:3.365E-42)
            r8.m13511a((int) r1, (com.ironsource.mediationsdk.C5594Q) r0)     // Catch:{ all -> 0x01db }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01db }
            r1.<init>()     // Catch:{ all -> 0x01db }
            java.lang.String r0 = r0.mo41606k()     // Catch:{ all -> 0x01db }
            r1.append(r0)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = " was session capped"
            r1.append(r0)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.utils.IronSourceUtils.sendAutomationLog(r0)     // Catch:{ all -> 0x01db }
        L_0x0171:
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x01db }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x01db }
            com.ironsource.mediationsdk.utils.C5790c.m14295d(r0, r9)     // Catch:{ all -> 0x01db }
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x01db }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x01db }
            boolean r9 = com.ironsource.mediationsdk.utils.C5790c.m14285a((android.content.Context) r0, (java.lang.String) r9)     // Catch:{ all -> 0x01db }
            if (r9 == 0) goto L_0x018f
            r9 = 2400(0x960, float:3.363E-42)
            r8.m13519b((int) r9)     // Catch:{ all -> 0x01db }
        L_0x018f:
            monitor-exit(r8)
            return
        L_0x0191:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01db }
            java.lang.String r7 = "showInterstitial "
            r1.<init>(r7)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = r0.mo41606k()     // Catch:{ all -> 0x01db }
            r1.append(r0)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = " isReadyToShow() == false"
            r1.append(r0)     // Catch:{ all -> 0x01db }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01db }
            m13523b((java.lang.String) r0)     // Catch:{ all -> 0x01db }
            goto L_0x0123
        L_0x01ad:
            com.ironsource.mediationsdk.A r9 = com.ironsource.mediationsdk.C5543A.m13206a()     // Catch:{ all -> 0x01db }
            java.lang.String r0 = "Interstitial"
            com.ironsource.mediationsdk.logger.IronSourceError r0 = com.ironsource.mediationsdk.utils.ErrorBuilder.buildNoAdsToShowError(r0)     // Catch:{ all -> 0x01db }
            r9.mo41283b(r0)     // Catch:{ all -> 0x01db }
            java.lang.Object[][] r9 = new java.lang.Object[r4][]     // Catch:{ all -> 0x01db }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x01db }
            java.lang.String r1 = "errorCode"
            r0[r5] = r1     // Catch:{ all -> 0x01db }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x01db }
            r0[r3] = r1     // Catch:{ all -> 0x01db }
            r9[r5] = r0     // Catch:{ all -> 0x01db }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x01db }
            java.lang.String r1 = "reason"
            r0[r5] = r1     // Catch:{ all -> 0x01db }
            java.lang.String r1 = "Show Fail - No ads to show"
            r0[r3] = r1     // Catch:{ all -> 0x01db }
            r9[r3] = r0     // Catch:{ all -> 0x01db }
            r8.m13522b((int) r2, (java.lang.Object[][]) r9)     // Catch:{ all -> 0x01db }
            monitor-exit(r8)
            return
        L_0x01db:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5589O.mo41556a(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo41406a(List<C5782b> list, String str, C5782b bVar, JSONObject jSONObject, int i, long j) {
        this.f13079c = str;
        this.f13089m = bVar;
        this.f13080d = jSONObject;
        this.f13095s = i;
        this.f13096t = "";
        m13515a((int) IronSourceConstants.IS_AUCTION_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(j)}}, false);
        m13518a(list);
        m13529h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41557a(boolean z) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "Should Track Network State: " + z, 0);
        this.f13097u = z;
    }

    /* renamed from: b */
    public final void mo41558b(C5594Q q) {
        synchronized (this) {
            m13517a(q, "onInterstitialAdClosed");
            m13521b(IronSourceConstants.IS_INSTANCE_CLOSED, q, new Object[][]{new Object[]{IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(C5804m.m14360a().mo42136b(2))}});
            C5804m.m14360a().mo42134a(2);
            C5543A.m13206a().mo41285d();
            mo41551a(C5592a.STATE_READY_TO_LOAD);
        }
    }

    /* renamed from: b */
    public final void mo41559b(IronSourceError ironSourceError, C5594Q q) {
        m13512a((int) IronSourceConstants.IS_INSTANCE_INIT_FAILED, q, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_REASON, ironSourceError.getErrorMessage()}});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo41560c() {
        mo41551a(C5592a.STATE_AUCTION);
        AsyncTask.execute(new Runnable() {
            public final void run() {
                StringBuilder sb;
                C5589O.this.f13079c = "";
                C5589O.this.f13080d = null;
                StringBuilder sb2 = new StringBuilder();
                long time = C5589O.this.f13084h - (new Date().getTime() - C5589O.this.f13083g);
                if (time > 0) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                        public final void run() {
                            C5589O.this.mo41560c();
                        }
                    }, time);
                    return;
                }
                C5589O.this.m13515a(2000, (Object[][]) null, false);
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                for (C5594Q next : C5589O.this.f13078b.values()) {
                    if (!C5589O.this.f13077a.mo42133b(next)) {
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
                if (hashMap.size() == 0 && arrayList.size() == 0) {
                    C5589O.this.m13515a((int) IronSourceConstants.IS_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}, new Object[]{"duration", 0}}, false);
                    C5589O.m13523b("makeAuction() failed - No candidates available for auctioning");
                    C5736n.m14120a().mo41990a(new IronSourceError(1005, "No candidates available for auctioning"));
                    C5589O.this.m13515a((int) IronSourceConstants.IS_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1005}}, false);
                    C5589O.this.mo41551a(C5592a.STATE_READY_TO_LOAD);
                    return;
                }
                C5589O.this.m13515a((int) IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, sb2.toString()}}, false);
                int b = C5804m.m14360a().mo42136b(2);
                if (C5589O.this.f13081e != null) {
                    C5589O.this.f13081e.mo41850a(ContextProvider.getInstance().getApplicationContext(), (Map<String, Object>) hashMap, (List<String>) arrayList, C5589O.this.f13082f, b);
                }
            }
        });
    }

    /* renamed from: c */
    public final void mo41561c(C5594Q q) {
        m13517a(q, "onInterstitialAdShowSucceeded");
        C5543A.m13206a().mo41286e();
        m13520b((int) IronSourceConstants.IS_INSTANCE_SHOW_SUCCESS, q);
    }

    /* renamed from: d */
    public final synchronized void mo41562d() {
        if (this.f13085i == C5592a.STATE_SHOWING) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "loadInterstitial: load cannot be invoked while showing an ad", 3);
            C5543A.m13206a().mo41280a(new IronSourceError(IronSourceError.ERROR_IS_LOAD_DURING_SHOW, "loadInterstitial: load cannot be invoked while showing an ad"));
        } else if ((this.f13085i == C5592a.STATE_READY_TO_LOAD || this.f13085i == C5592a.STATE_READY_TO_SHOW) && !C5736n.m14120a().mo41991b()) {
            this.f13079c = "";
            this.f13090n = "";
            this.f13080d = null;
            m13515a(2001, (Object[][]) null, false);
            this.f13094r = new Date().getTime();
            if (this.f13093q) {
                if (!this.f13088l.isEmpty()) {
                    this.f13082f.mo41855a(this.f13088l);
                    this.f13088l.clear();
                }
                mo41560c();
                return;
            }
            m13526f();
            m13529h();
        } else {
            m13523b("loadInterstitial: load is already in progress");
        }
    }

    /* renamed from: d */
    public final void mo41563d(C5594Q q) {
        m13517a(q, "onInterstitialAdClicked");
        C5543A.m13206a().mo41287f();
        m13520b(2006, q);
    }

    /* renamed from: e */
    public final void mo41564e(C5594Q q) {
        m13517a(q, "onInterstitialAdVisible");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        return false;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo41565e() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f13097u     // Catch:{ all -> 0x0039 }
            r1 = 0
            if (r0 == 0) goto L_0x0014
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()     // Catch:{ all -> 0x0039 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x0039 }
            boolean r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.isNetworkConnected(r0)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x001a
        L_0x0014:
            com.ironsource.mediationsdk.O$a r0 = r3.f13085i     // Catch:{ all -> 0x0039 }
            com.ironsource.mediationsdk.O$a r2 = com.ironsource.mediationsdk.C5589O.C5592a.STATE_READY_TO_SHOW     // Catch:{ all -> 0x0039 }
            if (r0 == r2) goto L_0x001c
        L_0x001a:
            monitor-exit(r3)
            return r1
        L_0x001c:
            java.util.concurrent.CopyOnWriteArrayList<com.ironsource.mediationsdk.Q> r0 = r3.f13086j     // Catch:{ all -> 0x0039 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0039 }
        L_0x0022:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x0037
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0039 }
            com.ironsource.mediationsdk.Q r2 = (com.ironsource.mediationsdk.C5594Q) r2     // Catch:{ all -> 0x0039 }
            boolean r2 = r2.mo41573g()     // Catch:{ all -> 0x0039 }
            if (r2 == 0) goto L_0x0022
            r0 = 1
            monitor-exit(r3)
            return r0
        L_0x0037:
            monitor-exit(r3)
            return r1
        L_0x0039:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C5589O.mo41565e():boolean");
    }

    /* renamed from: f */
    public final void mo41566f(C5594Q q) {
        m13511a((int) IronSourceConstants.IS_INSTANCE_INIT_SUCCESS, q);
    }
}
