package com.ironsource.mediationsdk.p137a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.environment.C5505a;
import com.ironsource.mediationsdk.C5556E;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.C5735r;
import com.ironsource.mediationsdk.sdk.C5749e;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.p132b.C5496a;
import com.ironsource.p132b.C5497b;
import com.ironsource.p132b.C5498c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.b */
public abstract class C5634b {

    /* renamed from: A */
    private int f13285A = 5;

    /* renamed from: B */
    private String f13286B = "supersonic_sdk.db";

    /* renamed from: C */
    private String f13287C = IronSourceConstants.EVENTS_PROVIDER;

    /* renamed from: D */
    private String f13288D = "placement";

    /* renamed from: E */
    private final String f13289E = "abt";

    /* renamed from: F */
    private final String f13290F = "mt";

    /* renamed from: G */
    private C5633a f13291G;

    /* renamed from: H */
    private int f13292H = 5000;

    /* renamed from: I */
    private int[] f13293I;

    /* renamed from: J */
    private Map<String, String> f13294J = new HashMap();

    /* renamed from: K */
    private IronSourceSegment f13295K;

    /* renamed from: L */
    private C5735r f13296L;

    /* renamed from: M */
    private final Object f13297M = new Object();

    /* renamed from: a */
    public boolean f13298a;

    /* renamed from: b */
    boolean f13299b = false;

    /* renamed from: c */
    public boolean f13300c = false;

    /* renamed from: d */
    C5496a f13301d;

    /* renamed from: e */
    ArrayList<C5641c> f13302e;

    /* renamed from: f */
    public boolean f13303f = true;

    /* renamed from: g */
    int f13304g;

    /* renamed from: h */
    String f13305h;

    /* renamed from: i */
    Context f13306i;

    /* renamed from: j */
    int f13307j = 100;

    /* renamed from: k */
    int f13308k = 1;

    /* renamed from: l */
    int[] f13309l;

    /* renamed from: m */
    int[] f13310m;

    /* renamed from: n */
    int[] f13311n;

    /* renamed from: o */
    Map<String, String> f13312o = new HashMap();

    /* renamed from: p */
    public String f13313p = "";

    /* renamed from: q */
    int f13314q;

    /* renamed from: r */
    String f13315r;

    /* renamed from: s */
    String f13316s;

    /* renamed from: t */
    Set<Integer> f13317t;

    /* renamed from: u */
    C5640b f13318u;

    /* renamed from: v */
    private int f13319v = 1;

    /* renamed from: w */
    private int f13320w = 100;

    /* renamed from: x */
    private int f13321x = 5000;

    /* renamed from: y */
    private int f13322y = 90000;

    /* renamed from: z */
    private int f13323z = 1024;

    /* renamed from: com.ironsource.mediationsdk.a.b$a */
    public enum C5639a {
        NOT_SUPPORTED(-1),
        OFFERWALL(1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        BANNER(8);
        

        /* renamed from: f */
        int f13337f;

        private C5639a(int i) {
            this.f13337f = i;
        }
    }

    /* renamed from: com.ironsource.mediationsdk.a.b$b */
    class C5640b extends HandlerThread {

        /* renamed from: a */
        Handler f13338a;

        C5640b(String str) {
            super(str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo41705a(Runnable runnable) {
            this.f13338a.post(runnable);
        }
    }

    /* renamed from: a */
    private ArrayList<C5641c> m13754a(ArrayList<C5641c> arrayList, ArrayList<C5641c> arrayList2, int i) {
        ArrayList<C5641c> arrayList3 = new ArrayList<>();
        try {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(arrayList);
            arrayList4.addAll(arrayList2);
            Collections.sort(arrayList4, new Comparator<C5641c>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((C5641c) obj).mo41709b() >= ((C5641c) obj2).mo41709b() ? 1 : -1;
                }
            });
            if (arrayList4.size() <= i) {
                arrayList3.addAll(arrayList4);
            } else {
                arrayList3.addAll(arrayList4.subList(0, i));
                this.f13301d.mo41195a(arrayList4.subList(i, arrayList4.size()), this.f13316s);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("CombinedEventList exception: " + e.getMessage());
        }
        return arrayList3;
    }

    /* renamed from: a */
    static /* synthetic */ void m13756a(C5634b bVar, C5641c cVar, String str) {
        JSONObject d = cVar.mo41711d();
        if (d != null && d.has(str)) {
            try {
                String optString = d.optString(str, (String) null);
                if (optString != null) {
                    cVar.mo41708a(str, (Object) optString.substring(0, Math.min(optString.length(), 1024)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private void m13757a(String str) {
        C5633a aVar = this.f13291G;
        if (aVar == null || !aVar.mo41675c().equals(str)) {
            this.f13291G = C5641c.m13791a(str, this.f13314q);
        }
    }

    /* renamed from: a */
    public static void m13758a(Map<String, Object> map, int i, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            map.put(IronSourceConstants.AUCTION_FALLBACK, str);
        }
    }

    /* renamed from: a */
    static boolean m13760a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* renamed from: e */
    protected static int m13761e(int i) {
        C5639a aVar;
        int i2 = C5639a.NOT_SUPPORTED.f13337f;
        if (i == 15 || (i >= 300 && i < 400)) {
            aVar = C5639a.OFFERWALL;
        } else if ((i >= 1000 && i < 2000) || (i >= 91000 && i < 92000)) {
            aVar = C5639a.REWARDED_VIDEO;
        } else if ((i >= 2000 && i < 3000) || (i >= 92000 && i < 93000)) {
            aVar = C5639a.INTERSTITIAL;
        } else if ((i < 3000 || i >= 4000) && (i < 93000 || i >= 94000)) {
            return i2;
        } else {
            aVar = C5639a.BANNER;
        }
        return aVar.f13337f;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m13762e() {
        ArrayList<C5641c> a;
        this.f13299b = false;
        synchronized (this.f13297M) {
            a = m13754a(this.f13302e, this.f13301d.mo41194a(this.f13316s), this.f13292H);
            if (a.size() > 0) {
                this.f13302e.clear();
                this.f13301d.mo41196b(this.f13316s);
            }
        }
        if (a.size() > 0) {
            this.f13304g = 0;
            JSONObject b = C5749e.m14210a().mo42055b();
            try {
                if (this.f13295K != null) {
                    if (this.f13295K.getAge() > 0) {
                        b.put("age", this.f13295K.getAge());
                    }
                    if (!TextUtils.isEmpty(this.f13295K.getGender())) {
                        b.put(IronSourceSegment.GENDER, this.f13295K.getGender());
                    }
                    if (this.f13295K.getLevel() > 0) {
                        b.put(IronSourceSegment.LEVEL, this.f13295K.getLevel());
                    }
                    if (this.f13295K.getIsPaying() != null) {
                        b.put(IronSourceSegment.PAYING, this.f13295K.getIsPaying().get());
                    }
                    if (this.f13295K.getIapt() > 0.0d) {
                        b.put(IronSourceSegment.IAPT, this.f13295K.getIapt());
                    }
                    if (this.f13295K.getUcd() > 0) {
                        b.put(IronSourceSegment.USER_CREATION_DATE, this.f13295K.getUcd());
                    }
                }
                if (this.f13296L != null) {
                    String str = this.f13296L.f13803b;
                    if (!TextUtils.isEmpty(str)) {
                        b.put("segmentId", str);
                    }
                    JSONObject jSONObject = this.f13296L.f13804c;
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        b.put(next, jSONObject.get(next));
                    }
                }
            } catch (JSONException e) {
                try {
                    e.printStackTrace();
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            String str2 = this.f13313p;
            if (!TextUtils.isEmpty(str2)) {
                b.put("abt", str2);
            }
            String str3 = C5556E.m13257a().f12859o;
            if (!TextUtils.isEmpty(str3)) {
                b.put("mt", str3);
            }
            Map<String, String> map = this.f13294J;
            if (!map.isEmpty()) {
                for (Map.Entry next2 : map.entrySet()) {
                    if (!b.has((String) next2.getKey())) {
                        b.put((String) next2.getKey(), next2.getValue());
                    }
                }
            }
            String a2 = this.f13291G.mo41672a(a, b);
            if (TextUtils.isEmpty(a2)) {
                IronLog.INTERNAL.error("Failed to parse events. Saving them back to storage.");
                mo41682a(a);
                return;
            }
            if (this.f13300c) {
                try {
                    a2 = Base64.encodeToString(C5505a.C55061.m13079b(a2), 0);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            new C5497b(new C5498c() {
                /* renamed from: a */
                public final synchronized void mo41201a(final ArrayList<C5641c> arrayList, final boolean z) {
                    C5634b.this.f13318u.mo41705a(new Runnable() {
                        public final void run() {
                            if (z) {
                                ArrayList<C5641c> a = C5634b.this.f13301d.mo41194a(C5634b.this.f13316s);
                                C5634b.this.f13304g = a.size() + C5634b.this.f13302e.size();
                                return;
                            }
                            IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                            C5634b.this.mo41682a((ArrayList<C5641c>) arrayList);
                        }
                    });
                }
            }).execute(new Object[]{a2, this.f13291G.mo41671a(), a});
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized int mo41676a(C5641c cVar) {
        return cVar.mo41706a() + 90000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41677a() {
        this.f13302e = new ArrayList<>();
        this.f13304g = 0;
        this.f13291G = C5641c.m13791a(this.f13315r, this.f13314q);
        C5640b bVar = new C5640b(this.f13316s + "EventThread");
        this.f13318u = bVar;
        bVar.start();
        C5640b bVar2 = this.f13318u;
        bVar2.f13338a = new Handler(bVar2.getLooper());
        this.f13305h = IronSourceUtils.getSessionId();
        this.f13317t = new HashSet();
        mo41687b();
    }

    /* renamed from: a */
    public final void mo41678a(int i) {
        if (i > 0) {
            this.f13308k = i;
        }
    }

    /* renamed from: a */
    public final synchronized void mo41679a(Context context, IronSourceSegment ironSourceSegment) {
        String defaultEventsFormatterType = IronSourceUtils.getDefaultEventsFormatterType(context, this.f13316s, this.f13315r);
        this.f13315r = defaultEventsFormatterType;
        m13757a(defaultEventsFormatterType);
        this.f13291G.f13279c = IronSourceUtils.getDefaultEventsURL(context, this.f13316s, (String) null);
        this.f13301d = C5496a.m13036a(context, "supersonic_sdk.db", 5);
        mo41693c();
        this.f13309l = IronSourceUtils.getDefaultOptOutEvents(context, this.f13316s);
        this.f13310m = IronSourceUtils.getDefaultOptInEvents(context, this.f13316s);
        this.f13311n = IronSourceUtils.getDefaultTriggerEvents(context, this.f13316s);
        this.f13293I = IronSourceUtils.getDefaultNonConnectivityEvents(context, this.f13316s);
        this.f13295K = ironSourceSegment;
        this.f13306i = context;
    }

    /* renamed from: a */
    public final synchronized void mo41680a(C5735r rVar) {
        this.f13296L = rVar;
    }

    /* renamed from: a */
    public final void mo41681a(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            C5633a aVar = this.f13291G;
            if (aVar != null) {
                aVar.f13279c = str;
            }
            IronSourceUtils.saveDefaultEventsURL(context, this.f13316s, str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo41682a(ArrayList<C5641c> arrayList) {
        if (arrayList != null) {
            synchronized (this.f13297M) {
                this.f13301d.mo41195a(arrayList, this.f13316s);
                this.f13304g = this.f13301d.mo41194a(this.f13316s).size() + this.f13302e.size();
            }
        }
    }

    /* renamed from: a */
    public final void mo41683a(Map<String, String> map) {
        this.f13294J.putAll(map);
    }

    /* renamed from: a */
    public final void mo41684a(int[] iArr, Context context) {
        this.f13309l = iArr;
        IronSourceUtils.saveDefaultOptOutEvents(context, this.f13316s, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo41685a(int i, int[] iArr) {
        if (!m13760a(iArr)) {
            return false;
        }
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return m13760a(r1.f13293I) ? mo41685a(r3.mo41706a(), r1.f13293I) : r1.f13317t.contains(java.lang.Integer.valueOf(r3.mo41706a()));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo41686a(java.lang.String r2, com.ironsource.mediationsdk.p137a.C5641c r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "none"
            boolean r2 = r2.equalsIgnoreCase(r0)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x000c
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000c:
            int[] r2 = r1.f13293I     // Catch:{ all -> 0x002f }
            boolean r2 = m13760a((int[]) r2)     // Catch:{ all -> 0x002f }
            if (r2 == 0) goto L_0x001f
            int r2 = r3.mo41706a()     // Catch:{ all -> 0x002f }
            int[] r3 = r1.f13293I     // Catch:{ all -> 0x002f }
            boolean r2 = r1.mo41685a((int) r2, (int[]) r3)     // Catch:{ all -> 0x002f }
            goto L_0x002d
        L_0x001f:
            java.util.Set<java.lang.Integer> r2 = r1.f13317t     // Catch:{ all -> 0x002f }
            int r3 = r3.mo41706a()     // Catch:{ all -> 0x002f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x002f }
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r1)
            return r2
        L_0x002f:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.p137a.C5634b.mo41686a(java.lang.String, com.ironsource.mediationsdk.a.c):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo41687b() {
    }

    /* renamed from: b */
    public final void mo41688b(int i) {
        if (i > 0) {
            this.f13307j = i;
        }
    }

    /* renamed from: b */
    public final synchronized void mo41689b(final C5641c cVar) {
        this.f13318u.mo41705a(new Runnable() {
            public final void run() {
                if (cVar != null && C5634b.this.f13303f) {
                    cVar.mo41708a("eventSessionId", (Object) C5634b.this.f13305h);
                    String connectionType = IronSourceUtils.getConnectionType(C5634b.this.f13306i);
                    C5641c cVar = cVar;
                    boolean z = false;
                    if ((cVar.mo41706a() == 40 || cVar.mo41706a() == 41 || cVar.mo41706a() == 50 || cVar.mo41706a() == 51 || cVar.mo41706a() == 52) ? false : true) {
                        cVar.mo41708a("connectionType", (Object) connectionType);
                    }
                    if (C5634b.this.mo41686a(connectionType, cVar)) {
                        C5641c cVar2 = cVar;
                        cVar2.mo41707a(C5634b.this.mo41676a(cVar2));
                    }
                    int e = C5634b.m13761e(cVar.mo41706a());
                    if (e != C5639a.NOT_SUPPORTED.f13337f) {
                        cVar.mo41708a(IronSourceConstants.EVENTS_AD_UNIT, (Object) Integer.valueOf(e));
                    }
                    C5634b.m13756a(C5634b.this, cVar, IronSourceConstants.EVENTS_ERROR_REASON);
                    C5634b.m13756a(C5634b.this, cVar, IronSourceConstants.EVENTS_EXT1);
                    if (!C5634b.this.f13312o.isEmpty()) {
                        for (Map.Entry next : C5634b.this.f13312o.entrySet()) {
                            if (!(cVar.mo41711d().has((String) next.getKey()) || next.getKey() == "eventId" || next.getKey() == "timestamp")) {
                                cVar.mo41708a((String) next.getKey(), next.getValue());
                            }
                        }
                    }
                    C5634b bVar = C5634b.this;
                    C5641c cVar3 = cVar;
                    if (cVar3 != null ? C5634b.m13760a(bVar.f13309l) ? !bVar.mo41685a(cVar3.mo41706a(), bVar.f13309l) : C5634b.m13760a(bVar.f13310m) ? bVar.mo41685a(cVar3.mo41706a(), bVar.f13310m) : true : false) {
                        C5641c cVar4 = cVar;
                        if ((cVar4.mo41706a() == 14 || cVar4.mo41706a() == 114 || cVar4.mo41706a() == 514 || cVar4.mo41706a() == 140 || cVar4.mo41706a() == 40 || cVar4.mo41706a() == 41 || cVar4.mo41706a() == 50 || cVar4.mo41706a() == 51 || cVar4.mo41706a() == 52) ? false : true) {
                            JSONObject d = cVar.mo41711d();
                            if (!(d == null ? false : d.has(IronSourceConstants.KEY_SESSION_DEPTH))) {
                                cVar.mo41708a(IronSourceConstants.KEY_SESSION_DEPTH, (Object) Integer.valueOf(C5634b.this.mo41701e(cVar)));
                            }
                        }
                        if (!TextUtils.isEmpty(C5634b.this.mo41697d(cVar.mo41706a())) && C5634b.this.mo41696c(cVar)) {
                            C5641c cVar5 = cVar;
                            cVar5.mo41708a("placement", (Object) C5634b.this.mo41697d(cVar5.mo41706a()));
                        }
                        long firstSessionTimestamp = IronSourceUtils.getFirstSessionTimestamp(C5634b.this.f13306i);
                        if (firstSessionTimestamp != -1) {
                            cVar.mo41708a(IronSourceConstants.FIRST_SESSION_TIMESTAMP, (Object) Long.valueOf(firstSessionTimestamp));
                        }
                        try {
                            IronLog.EVENT.verbose(("{\"eventId\":" + cVar.mo41706a() + ",\"timestamp\":" + cVar.mo41709b() + "," + cVar.mo41710c().substring(1)).replace(",", "\n"));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        C5634b.this.f13302e.add(cVar);
                        C5634b.this.f13304g++;
                    }
                    boolean a = C5634b.m13760a(C5634b.this.f13311n) ? C5634b.this.mo41685a(cVar.mo41706a(), C5634b.this.f13311n) : C5634b.this.mo41700d(cVar);
                    if (!C5634b.this.f13299b && a) {
                        C5634b.this.f13299b = true;
                    }
                    if (C5634b.this.f13301d != null) {
                        C5634b bVar2 = C5634b.this;
                        if ((bVar2.f13304g >= bVar2.f13307j || bVar2.f13299b) && bVar2.f13298a) {
                            C5634b.this.m13762e();
                            return;
                        }
                        C5634b bVar3 = C5634b.this;
                        ArrayList<C5641c> arrayList = bVar3.f13302e;
                        if (arrayList != null && arrayList.size() >= bVar3.f13308k) {
                            z = true;
                        }
                        if (z || a) {
                            C5634b.this.mo41693c();
                        }
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo41690b(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            this.f13315r = str;
            IronSourceUtils.saveDefaultEventsFormatterType(context, this.f13316s, str);
            m13757a(str);
        }
    }

    /* renamed from: b */
    public final void mo41691b(Map<String, String> map) {
        this.f13312o.putAll(map);
    }

    /* renamed from: b */
    public final void mo41692b(int[] iArr, Context context) {
        this.f13310m = iArr;
        IronSourceUtils.saveDefaultOptInEvents(context, this.f13316s, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo41693c() {
        synchronized (this.f13297M) {
            this.f13301d.mo41195a(this.f13302e, this.f13316s);
            this.f13302e.clear();
        }
    }

    /* renamed from: c */
    public final void mo41694c(int i) {
        if (i > 0) {
            this.f13292H = i;
        }
    }

    /* renamed from: c */
    public final void mo41695c(int[] iArr, Context context) {
        this.f13311n = iArr;
        IronSourceUtils.saveDefaultTriggerEvents(context, this.f13316s, iArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo41696c(C5641c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo41697d(int i);

    /* renamed from: d */
    public final void mo41698d() {
        m13762e();
    }

    /* renamed from: d */
    public final void mo41699d(int[] iArr, Context context) {
        this.f13293I = iArr;
        IronSourceUtils.saveDefaultNonConnectivityEvents(context, this.f13316s, iArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo41700d(C5641c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo41701e(C5641c cVar);
}
