package com.applovin.impl.sdk.p024ad;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.C1505q;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p027d.C1392a;
import com.applovin.impl.sdk.p027d.C1431q;
import com.applovin.impl.sdk.p027d.C1435s;
import com.applovin.impl.sdk.utils.C1515d;
import com.applovin.impl.sdk.utils.C1521i;
import com.applovin.impl.sdk.utils.C1554p;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.f */
public class C1351f implements Runnable {

    /* renamed from: i */
    private static boolean f2739i;

    /* renamed from: a */
    private final C1469j f2740a;

    /* renamed from: b */
    private final MaxAdFormat f2741b;

    /* renamed from: c */
    private List<C1349d> f2742c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final List<JSONObject> f2743d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Object f2744e;

    /* renamed from: f */
    private C1349d f2745f;

    /* renamed from: g */
    private C1354b f2746g = C1354b.NONE;

    /* renamed from: h */
    private boolean f2747h;

    /* renamed from: com.applovin.impl.sdk.ad.f$a */
    public static class C1353a implements AppLovinAdLoadListener {

        /* renamed from: a */
        private final C1469j f2749a;

        /* renamed from: b */
        private final C1349d f2750b;

        /* renamed from: c */
        private final AppLovinAdLoadListener f2751c;

        /* renamed from: d */
        private boolean f2752d;

        public C1353a(C1349d dVar, AppLovinAdLoadListener appLovinAdLoadListener, C1469j jVar) {
            this.f2749a = jVar;
            this.f2750b = dVar;
            this.f2751c = appLovinAdLoadListener;
        }

        /* renamed from: a */
        public void mo12738a(boolean z) {
            this.f2752d = z;
        }

        public void adReceived(AppLovinAd appLovinAd) {
            this.f2749a.mo13082V().mo12727a((AppLovinAdBase) (C1355g) appLovinAd, false, this.f2752d);
            this.f2751c.adReceived(appLovinAd);
        }

        public void failedToReceiveAd(int i) {
            this.f2749a.mo13082V().mo12728a(this.f2750b, this.f2752d, i);
            this.f2751c.failedToReceiveAd(i);
        }
    }

    /* renamed from: com.applovin.impl.sdk.ad.f$b */
    public enum C1354b {
        NONE(0, "none"),
        TIMER(1, "timer"),
        APP_PAUSED(2, "backgrounded"),
        IMPRESSION(3, "impression"),
        WATERFALL_RESTARTED(3, "waterfall_restarted"),
        UNKNOWN_ZONE(4, "unknown_zone"),
        SKIPPED_ZONE(5, "skipped_zone"),
        REPEATED_ZONE(6, "repeated_zone");
        

        /* renamed from: i */
        private final int f2762i;

        /* renamed from: j */
        private final String f2763j;

        private C1354b(int i, String str) {
            this.f2762i = i;
            this.f2763j = str;
        }

        /* renamed from: a */
        public int mo12739a() {
            return this.f2762i;
        }

        /* renamed from: b */
        public String mo12740b() {
            return this.f2763j;
        }
    }

    public C1351f(MaxAdFormat maxAdFormat, C1469j jVar) {
        this.f2740a = jVar;
        this.f2741b = maxAdFormat;
        this.f2743d = new ArrayList();
        this.f2744e = new Object();
    }

    /* renamed from: a */
    private static JSONObject m2491a(C1349d dVar, C1469j jVar) {
        JSONObject jSONObject = new JSONObject();
        C1521i.m3477a(jSONObject, "id", dVar.mo12712a(), jVar);
        C1521i.m3493b(jSONObject, "response_ts_s", TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()), jVar);
        return jSONObject;
    }

    /* renamed from: a */
    public static void m2492a(C1349d dVar, int i, C1469j jVar) {
        if (!((Boolean) jVar.mo13088a(C1369c.f3136fr)).booleanValue()) {
            if (!f2739i) {
                C1505q.m3345i("AppLovinSdk", "Unknown zone in waterfall: " + dVar.mo12712a());
                f2739i = true;
            } else {
                return;
            }
        }
        JSONObject a = m2491a(dVar, jVar);
        C1521i.m3475a(a, "error_code", i, jVar);
        m2496a(C1354b.UNKNOWN_ZONE, C1354b.NONE, C1521i.m3490b((Object) a), (MaxAdFormat) null, jVar);
    }

    /* renamed from: a */
    private void m2493a(C1349d dVar, JSONObject jSONObject) {
        C1354b bVar;
        C1521i.m3481a(jSONObject, m2491a(dVar, this.f2740a), this.f2740a);
        synchronized (this.f2744e) {
            if (m2499a(dVar)) {
                m2494a(C1354b.WATERFALL_RESTARTED);
            } else {
                if (m2502b(dVar)) {
                    m2498a(jSONObject, dVar);
                    bVar = C1354b.REPEATED_ZONE;
                } else if (m2504c(dVar)) {
                    m2498a(jSONObject, dVar);
                    bVar = C1354b.SKIPPED_ZONE;
                }
                m2495a(bVar, dVar);
            }
            m2498a(jSONObject, dVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2494a(C1354b bVar) {
        m2495a(bVar, (C1349d) null);
    }

    /* renamed from: a */
    private void m2495a(C1354b bVar, C1349d dVar) {
        if (!((Boolean) this.f2740a.mo13088a(C1369c.f3136fr)).booleanValue()) {
            if (!this.f2747h) {
                if (bVar == C1354b.SKIPPED_ZONE || bVar == C1354b.REPEATED_ZONE) {
                    C1505q.m3345i("AppLovinSdk", "Invalid zone in waterfall: " + dVar);
                    this.f2747h = true;
                }
            } else {
                return;
            }
        }
        synchronized (this.f2744e) {
            if (!this.f2743d.isEmpty()) {
                JSONArray jSONArray = new JSONArray(this.f2743d);
                this.f2743d.clear();
                C1354b bVar2 = this.f2746g;
                this.f2746g = bVar;
                m2496a(bVar, bVar2, jSONArray, this.f2741b, this.f2740a);
            }
        }
    }

    /* renamed from: a */
    private static void m2496a(C1354b bVar, C1354b bVar2, JSONArray jSONArray, MaxAdFormat maxAdFormat, C1469j jVar) {
        jVar.mo13071K().mo13014a((C1392a) new C1431q(bVar, bVar2, jSONArray, maxAdFormat, jVar), C1435s.C1437a.BACKGROUND);
    }

    /* renamed from: a */
    private void m2498a(JSONObject jSONObject, C1349d dVar) {
        synchronized (this.f2744e) {
            this.f2743d.add(jSONObject);
            this.f2745f = dVar;
        }
    }

    /* renamed from: a */
    private boolean m2499a(C1349d dVar) {
        if (this.f2745f != null) {
            int indexOf = this.f2742c.indexOf(dVar);
            return indexOf == 0 || indexOf < this.f2742c.indexOf(this.f2745f);
        }
    }

    /* renamed from: b */
    private void m2501b() {
        long c = m2503c();
        if (c <= 0) {
            return;
        }
        if (((Boolean) this.f2740a.mo13088a(C1369c.f3133fo)).booleanValue()) {
            C1515d.m3417a(c, this.f2740a, this);
        } else {
            C1554p.m3559a(c, this.f2740a, this);
        }
    }

    /* renamed from: b */
    private boolean m2502b(C1349d dVar) {
        return this.f2745f == dVar;
    }

    /* renamed from: c */
    private long m2503c() {
        return TimeUnit.SECONDS.toMillis(((Long) this.f2740a.mo13088a(C1369c.f3132fn)).longValue());
    }

    /* renamed from: c */
    private boolean m2504c(C1349d dVar) {
        int indexOf = this.f2742c.indexOf(dVar);
        C1349d dVar2 = this.f2745f;
        return indexOf != (dVar2 != null ? this.f2742c.indexOf(dVar2) + 1 : 0);
    }

    /* renamed from: a */
    public void mo12733a() {
        if (((Boolean) this.f2740a.mo13088a(C1369c.f3134fp)).booleanValue()) {
            m2494a(C1354b.IMPRESSION);
        }
    }

    /* renamed from: a */
    public void mo12734a(AppLovinAdBase appLovinAdBase, boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        C1521i.m3493b(jSONObject, "ad_id", appLovinAdBase.getAdIdNumber(), this.f2740a);
        C1521i.m3493b(jSONObject, "ad_created_ts_s", TimeUnit.MILLISECONDS.toSeconds(appLovinAdBase.getCreatedAtMillis()), this.f2740a);
        C1521i.m3480a(jSONObject, "is_preloaded", z, this.f2740a);
        C1521i.m3480a(jSONObject, "for_bidding", z2, this.f2740a);
        m2493a(appLovinAdBase.getAdZone(), jSONObject);
    }

    /* renamed from: a */
    public void mo12735a(C1349d dVar, boolean z, int i) {
        JSONObject jSONObject = new JSONObject();
        C1521i.m3475a(jSONObject, "error_code", i, this.f2740a);
        C1521i.m3480a(jSONObject, "for_bidding", z, this.f2740a);
        m2493a(dVar, jSONObject);
    }

    /* renamed from: a */
    public void mo12736a(List<C1349d> list) {
        if (this.f2742c == null) {
            this.f2742c = list;
            m2501b();
            if (((Boolean) this.f2740a.mo13088a(C1369c.f3135fq)).booleanValue()) {
                this.f2740a.mo13108ae().registerReceiver(new AppLovinBroadcastManager.Receiver() {
                    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
                        C1351f.this.m2494a(C1354b.APP_PAUSED);
                        synchronized (C1351f.this.f2744e) {
                            C1351f.this.f2743d.clear();
                        }
                    }
                }, new IntentFilter("com.applovin.application_paused"));
            }
        }
    }

    public void run() {
        m2494a(C1354b.TIMER);
        m2501b();
    }
}
